\encoding UTF-8

CREATE OR REPLACE FUNCTION fcw_user_grp_key()
RETURNS TABLE (
	ugid numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_user_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_user_grp_key$temp(
				ugid numeric (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX fcw_user_grp_key_pk_ie ON fcw_user_grp_key$temp
				USING BTREE (ugid);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_user_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM fcw_user_grp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW fcw_user_grp_key
AS
SELECT *
FROM fcw_user_grp_key();

CREATE OR REPLACE FUNCTION fcw_user_grp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_user_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_user_grp_key$temp(
				ugid numeric (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX fcw_user_grp_key_pk_ie ON fcw_user_grp_key$temp
				USING BTREE (ugid);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_user_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO fcw_user_grp_key$temp(
			ugid
		)VALUES (
			NEW.ugid
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE fcw_user_grp_key$temp
		SET 
			ugid = NEW.ugid
		WHERE 0=0
		AND (ugid = OLD.ugid OR ugid IS NULL AND OLD.ugid IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM fcw_user_grp_key$temp
		WHERE 0=0
		AND (ugid = OLD.ugid OR ugid IS NULL AND OLD.ugid IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER fcw_user_grp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON fcw_user_grp_key
FOR EACH ROW
EXECUTE PROCEDURE fcw_user_grp_key$func();
;

