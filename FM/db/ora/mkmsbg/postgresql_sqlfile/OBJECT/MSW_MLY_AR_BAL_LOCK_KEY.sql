\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mly_ar_bal_lock_key()
RETURNS TABLE (
	acst_cd varchar,
	ar_dpt_cd varchar,
	trd_cur_cd varchar,
	iv_no varchar,
	wrk_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mly_ar_bal_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mly_ar_bal_lock_key$temp(
				acst_cd varchar (20) NULL,
				ar_dpt_cd varchar (20) NULL,
				trd_cur_cd varchar (3) NULL,
				iv_no varchar (15) NULL,
				wrk_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mly_ar_bal_lock_key_pk_ie ON msw_mly_ar_bal_lock_key$temp
				USING BTREE (acst_cd,ar_dpt_cd,trd_cur_cd,iv_no,wrk_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mly_ar_bal_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mly_ar_bal_lock_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mly_ar_bal_lock_key
AS
SELECT *
FROM msw_mly_ar_bal_lock_key();

CREATE OR REPLACE FUNCTION msw_mly_ar_bal_lock_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mly_ar_bal_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mly_ar_bal_lock_key$temp(
				acst_cd varchar (20) NULL,
				ar_dpt_cd varchar (20) NULL,
				trd_cur_cd varchar (3) NULL,
				iv_no varchar (15) NULL,
				wrk_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mly_ar_bal_lock_key_pk_ie ON msw_mly_ar_bal_lock_key$temp
				USING BTREE (acst_cd,ar_dpt_cd,trd_cur_cd,iv_no,wrk_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mly_ar_bal_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mly_ar_bal_lock_key$temp(
			acst_cd,
			ar_dpt_cd,
			trd_cur_cd,
			iv_no,
			wrk_no
		)VALUES (
			NEW.acst_cd,
			NEW.ar_dpt_cd,
			NEW.trd_cur_cd,
			NEW.iv_no,
			NEW.wrk_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mly_ar_bal_lock_key$temp
		SET 
			acst_cd = NEW.acst_cd,
			ar_dpt_cd = NEW.ar_dpt_cd,
			trd_cur_cd = NEW.trd_cur_cd,
			iv_no = NEW.iv_no,
			wrk_no = NEW.wrk_no
		WHERE 0=0
		AND (acst_cd = OLD.acst_cd OR acst_cd IS NULL AND OLD.acst_cd IS NULL)
		AND (ar_dpt_cd = OLD.ar_dpt_cd OR ar_dpt_cd IS NULL AND OLD.ar_dpt_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mly_ar_bal_lock_key$temp
		WHERE 0=0
		AND (acst_cd = OLD.acst_cd OR acst_cd IS NULL AND OLD.acst_cd IS NULL)
		AND (ar_dpt_cd = OLD.ar_dpt_cd OR ar_dpt_cd IS NULL AND OLD.ar_dpt_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mly_ar_bal_lock_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mly_ar_bal_lock_key
FOR EACH ROW
EXECUTE PROCEDURE msw_mly_ar_bal_lock_key$func();
;

