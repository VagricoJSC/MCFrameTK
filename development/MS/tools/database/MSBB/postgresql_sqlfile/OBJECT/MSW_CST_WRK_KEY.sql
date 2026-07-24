\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_cst_wrk_key()
RETURNS TABLE (
	wrk_no varchar,
	cst_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_cst_wrk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_cst_wrk_key$temp(
				wrk_no varchar (15) NULL,
				cst_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_cst_wrk_key_pk_ie ON msw_cst_wrk_key$temp
				USING BTREE (wrk_no,cst_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_cst_wrk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_cst_wrk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_cst_wrk_key
AS
SELECT *
FROM msw_cst_wrk_key();

CREATE OR REPLACE FUNCTION msw_cst_wrk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_cst_wrk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_cst_wrk_key$temp(
				wrk_no varchar (15) NULL,
				cst_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_cst_wrk_key_pk_ie ON msw_cst_wrk_key$temp
				USING BTREE (wrk_no,cst_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_cst_wrk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_cst_wrk_key$temp(
			wrk_no,
			cst_cd
		)VALUES (
			NEW.wrk_no,
			NEW.cst_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_cst_wrk_key$temp
		SET 
			wrk_no = NEW.wrk_no,
			cst_cd = NEW.cst_cd
		WHERE 0=0
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_cst_wrk_key$temp
		WHERE 0=0
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_cst_wrk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_cst_wrk_key
FOR EACH ROW
EXECUTE PROCEDURE msw_cst_wrk_key$func();
;

