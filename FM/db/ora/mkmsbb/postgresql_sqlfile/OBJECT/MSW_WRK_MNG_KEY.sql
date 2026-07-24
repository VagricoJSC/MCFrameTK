\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_wrk_mng_key()
RETURNS TABLE (
	wrk_mng_typ varchar,
	wrk_mng_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_wrk_mng_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_wrk_mng_key$temp(
				wrk_mng_typ varchar (2) NULL,
				wrk_mng_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_wrk_mng_key_pk_ie ON msw_wrk_mng_key$temp
				USING BTREE (wrk_mng_typ,wrk_mng_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_wrk_mng_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_wrk_mng_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_wrk_mng_key
AS
SELECT *
FROM msw_wrk_mng_key();

CREATE OR REPLACE FUNCTION msw_wrk_mng_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_wrk_mng_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_wrk_mng_key$temp(
				wrk_mng_typ varchar (2) NULL,
				wrk_mng_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_wrk_mng_key_pk_ie ON msw_wrk_mng_key$temp
				USING BTREE (wrk_mng_typ,wrk_mng_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_wrk_mng_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_wrk_mng_key$temp(
			wrk_mng_typ,
			wrk_mng_cd
		)VALUES (
			NEW.wrk_mng_typ,
			NEW.wrk_mng_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_wrk_mng_key$temp
		SET 
			wrk_mng_typ = NEW.wrk_mng_typ,
			wrk_mng_cd = NEW.wrk_mng_cd
		WHERE 0=0
		AND (wrk_mng_typ = OLD.wrk_mng_typ OR wrk_mng_typ IS NULL AND OLD.wrk_mng_typ IS NULL)
		AND (wrk_mng_cd = OLD.wrk_mng_cd OR wrk_mng_cd IS NULL AND OLD.wrk_mng_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_wrk_mng_key$temp
		WHERE 0=0
		AND (wrk_mng_typ = OLD.wrk_mng_typ OR wrk_mng_typ IS NULL AND OLD.wrk_mng_typ IS NULL)
		AND (wrk_mng_cd = OLD.wrk_mng_cd OR wrk_mng_cd IS NULL AND OLD.wrk_mng_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_wrk_mng_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_wrk_mng_key
FOR EACH ROW
EXECUTE PROCEDURE msw_wrk_mng_key$func();
;

