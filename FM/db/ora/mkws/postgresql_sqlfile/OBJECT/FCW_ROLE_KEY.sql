\encoding UTF-8

CREATE OR REPLACE FUNCTION fcw_role_key()
RETURNS TABLE (
	rid varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_role_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_role_key$temp(
				rid varchar (50) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX fcw_role_key_pk_ie ON fcw_role_key$temp
				USING BTREE (rid);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_role_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM fcw_role_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW fcw_role_key
AS
SELECT *
FROM fcw_role_key();

CREATE OR REPLACE FUNCTION fcw_role_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_role_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_role_key$temp(
				rid varchar (50) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX fcw_role_key_pk_ie ON fcw_role_key$temp
				USING BTREE (rid);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_role_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO fcw_role_key$temp(
			rid
		)VALUES (
			NEW.rid
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE fcw_role_key$temp
		SET 
			rid = NEW.rid
		WHERE 0=0
		AND (rid = OLD.rid OR rid IS NULL AND OLD.rid IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM fcw_role_key$temp
		WHERE 0=0
		AND (rid = OLD.rid OR rid IS NULL AND OLD.rid IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER fcw_role_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON fcw_role_key
FOR EACH ROW
EXECUTE PROCEDURE fcw_role_key$func();
;

