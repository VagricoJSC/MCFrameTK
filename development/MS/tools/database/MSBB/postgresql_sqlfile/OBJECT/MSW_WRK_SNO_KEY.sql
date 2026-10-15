\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_wrk_sno_key()
RETURNS TABLE (
	sno1 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_wrk_sno_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_wrk_sno_key$temp(
				sno1 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_wrk_sno_key_pk_ie ON msw_wrk_sno_key$temp
				USING BTREE (sno1);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_wrk_sno_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_wrk_sno_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_wrk_sno_key
AS
SELECT *
FROM msw_wrk_sno_key();

CREATE OR REPLACE FUNCTION msw_wrk_sno_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_wrk_sno_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_wrk_sno_key$temp(
				sno1 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_wrk_sno_key_pk_ie ON msw_wrk_sno_key$temp
				USING BTREE (sno1);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_wrk_sno_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_wrk_sno_key$temp(
			sno1
		)VALUES (
			NEW.sno1
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_wrk_sno_key$temp
		SET 
			sno1 = NEW.sno1
		WHERE 0=0
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_wrk_sno_key$temp
		WHERE 0=0
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_wrk_sno_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_wrk_sno_key
FOR EACH ROW
EXECUTE PROCEDURE msw_wrk_sno_key$func();
;

