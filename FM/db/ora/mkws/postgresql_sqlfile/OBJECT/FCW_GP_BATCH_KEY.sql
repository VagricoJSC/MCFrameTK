\encoding UTF-8

CREATE OR REPLACE FUNCTION fcw_gp_batch_key()
RETURNS TABLE (
	gp_batch_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_gp_batch_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_gp_batch_key$temp(
				gp_batch_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX fcw_gp_batch_key_pk_ie ON fcw_gp_batch_key$temp
				USING BTREE (gp_batch_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_gp_batch_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM fcw_gp_batch_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW fcw_gp_batch_key
AS
SELECT *
FROM fcw_gp_batch_key();

CREATE OR REPLACE FUNCTION fcw_gp_batch_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_gp_batch_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_gp_batch_key$temp(
				gp_batch_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX fcw_gp_batch_key_pk_ie ON fcw_gp_batch_key$temp
				USING BTREE (gp_batch_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_gp_batch_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO fcw_gp_batch_key$temp(
			gp_batch_no
		)VALUES (
			NEW.gp_batch_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE fcw_gp_batch_key$temp
		SET 
			gp_batch_no = NEW.gp_batch_no
		WHERE 0=0
		AND (gp_batch_no = OLD.gp_batch_no OR gp_batch_no IS NULL AND OLD.gp_batch_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM fcw_gp_batch_key$temp
		WHERE 0=0
		AND (gp_batch_no = OLD.gp_batch_no OR gp_batch_no IS NULL AND OLD.gp_batch_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER fcw_gp_batch_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON fcw_gp_batch_key
FOR EACH ROW
EXECUTE PROCEDURE fcw_gp_batch_key$func();
;

