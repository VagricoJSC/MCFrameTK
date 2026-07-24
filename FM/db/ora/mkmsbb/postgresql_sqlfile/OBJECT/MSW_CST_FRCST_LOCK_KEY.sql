\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_cst_frcst_lock_key()
RETURNS TABLE (
	cst_cd varchar,
	dlv_cd varchar,
	frcst_dpt_cd varchar,
	wrk_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_cst_frcst_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_cst_frcst_lock_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) NULL,
				frcst_dpt_cd varchar (20) NULL,
				wrk_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_cst_frcst_lock_key_pk_ie ON msw_cst_frcst_lock_key$temp
				USING BTREE (cst_cd,dlv_cd,frcst_dpt_cd,wrk_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_cst_frcst_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_cst_frcst_lock_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_cst_frcst_lock_key
AS
SELECT *
FROM msw_cst_frcst_lock_key();

CREATE OR REPLACE FUNCTION msw_cst_frcst_lock_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_cst_frcst_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_cst_frcst_lock_key$temp(
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) NULL,
				frcst_dpt_cd varchar (20) NULL,
				wrk_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_cst_frcst_lock_key_pk_ie ON msw_cst_frcst_lock_key$temp
				USING BTREE (cst_cd,dlv_cd,frcst_dpt_cd,wrk_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_cst_frcst_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_cst_frcst_lock_key$temp(
			cst_cd,
			dlv_cd,
			frcst_dpt_cd,
			wrk_no
		)VALUES (
			NEW.cst_cd,
			NEW.dlv_cd,
			NEW.frcst_dpt_cd,
			NEW.wrk_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_cst_frcst_lock_key$temp
		SET 
			cst_cd = NEW.cst_cd,
			dlv_cd = NEW.dlv_cd,
			frcst_dpt_cd = NEW.frcst_dpt_cd,
			wrk_no = NEW.wrk_no
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (frcst_dpt_cd = OLD.frcst_dpt_cd OR frcst_dpt_cd IS NULL AND OLD.frcst_dpt_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_cst_frcst_lock_key$temp
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (frcst_dpt_cd = OLD.frcst_dpt_cd OR frcst_dpt_cd IS NULL AND OLD.frcst_dpt_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_cst_frcst_lock_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_cst_frcst_lock_key
FOR EACH ROW
EXECUTE PROCEDURE msw_cst_frcst_lock_key$func();
;

