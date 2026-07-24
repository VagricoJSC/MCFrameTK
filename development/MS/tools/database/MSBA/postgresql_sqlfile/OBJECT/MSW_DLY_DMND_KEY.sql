\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_dly_dmnd_key()
RETURNS TABLE (
	dly_dmnd_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dly_dmnd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dly_dmnd_key$temp(
				dly_dmnd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_dly_dmnd_key_pk_ie ON msw_dly_dmnd_key$temp
				USING BTREE (dly_dmnd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dly_dmnd_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_dly_dmnd_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_dly_dmnd_key
AS
SELECT *
FROM msw_dly_dmnd_key();

CREATE OR REPLACE FUNCTION msw_dly_dmnd_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dly_dmnd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dly_dmnd_key$temp(
				dly_dmnd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_dly_dmnd_key_pk_ie ON msw_dly_dmnd_key$temp
				USING BTREE (dly_dmnd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dly_dmnd_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_dly_dmnd_key$temp(
			dly_dmnd_no
		)VALUES (
			NEW.dly_dmnd_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_dly_dmnd_key$temp
		SET 
			dly_dmnd_no = NEW.dly_dmnd_no
		WHERE 0=0
		AND (dly_dmnd_no = OLD.dly_dmnd_no OR dly_dmnd_no IS NULL AND OLD.dly_dmnd_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_dly_dmnd_key$temp
		WHERE 0=0
		AND (dly_dmnd_no = OLD.dly_dmnd_no OR dly_dmnd_no IS NULL AND OLD.dly_dmnd_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_dly_dmnd_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_dly_dmnd_key
FOR EACH ROW
EXECUTE PROCEDURE msw_dly_dmnd_key$func();
;

