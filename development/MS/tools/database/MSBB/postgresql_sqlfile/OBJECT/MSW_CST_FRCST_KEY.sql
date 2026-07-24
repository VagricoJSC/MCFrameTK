\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_cst_frcst_key()
RETURNS TABLE (
	cst_frcst_r_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_cst_frcst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_cst_frcst_key$temp(
				cst_frcst_r_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_cst_frcst_key_pk_ie ON msw_cst_frcst_key$temp
				USING BTREE (cst_frcst_r_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_cst_frcst_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_cst_frcst_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_cst_frcst_key
AS
SELECT *
FROM msw_cst_frcst_key();

CREATE OR REPLACE FUNCTION msw_cst_frcst_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_cst_frcst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_cst_frcst_key$temp(
				cst_frcst_r_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_cst_frcst_key_pk_ie ON msw_cst_frcst_key$temp
				USING BTREE (cst_frcst_r_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_cst_frcst_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_cst_frcst_key$temp(
			cst_frcst_r_no
		)VALUES (
			NEW.cst_frcst_r_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_cst_frcst_key$temp
		SET 
			cst_frcst_r_no = NEW.cst_frcst_r_no
		WHERE 0=0
		AND (cst_frcst_r_no = OLD.cst_frcst_r_no OR cst_frcst_r_no IS NULL AND OLD.cst_frcst_r_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_cst_frcst_key$temp
		WHERE 0=0
		AND (cst_frcst_r_no = OLD.cst_frcst_r_no OR cst_frcst_r_no IS NULL AND OLD.cst_frcst_r_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_cst_frcst_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_cst_frcst_key
FOR EACH ROW
EXECUTE PROCEDURE msw_cst_frcst_key$func();
;

