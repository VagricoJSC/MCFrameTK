\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_bill_lock_key()
RETURNS TABLE (
	bcst_cd varchar,
	trd_cur_cd varchar,
	iv_no varchar,
	wrk_no varchar,
	bill_dpt_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_lock_key$temp(
				bcst_cd varchar (20) NULL,
				trd_cur_cd varchar (3) NULL,
				iv_no varchar (15) DEFAULT '*' NULL,
				wrk_no varchar (15) NULL,
				bill_dpt_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_bill_lock_key_pk_ie ON msw_bill_lock_key$temp
				USING BTREE (bcst_cd,trd_cur_cd,iv_no,wrk_no,bill_dpt_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_bill_lock_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_bill_lock_key
AS
SELECT *
FROM msw_bill_lock_key();
ALTER VIEW msw_bill_lock_key ALTER COLUMN iv_no SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_bill_lock_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_lock_key$temp(
				bcst_cd varchar (20) NULL,
				trd_cur_cd varchar (3) NULL,
				iv_no varchar (15) DEFAULT '*' NULL,
				wrk_no varchar (15) NULL,
				bill_dpt_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_bill_lock_key_pk_ie ON msw_bill_lock_key$temp
				USING BTREE (bcst_cd,trd_cur_cd,iv_no,wrk_no,bill_dpt_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_bill_lock_key$temp(
			bcst_cd,
			trd_cur_cd,
			iv_no,
			wrk_no,
			bill_dpt_cd
		)VALUES (
			NEW.bcst_cd,
			NEW.trd_cur_cd,
			NEW.iv_no,
			NEW.wrk_no,
			NEW.bill_dpt_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_bill_lock_key$temp
		SET 
			bcst_cd = NEW.bcst_cd,
			trd_cur_cd = NEW.trd_cur_cd,
			iv_no = NEW.iv_no,
			wrk_no = NEW.wrk_no,
			bill_dpt_cd = NEW.bill_dpt_cd
		WHERE 0=0
		AND (bcst_cd = OLD.bcst_cd OR bcst_cd IS NULL AND OLD.bcst_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (bill_dpt_cd = OLD.bill_dpt_cd OR bill_dpt_cd IS NULL AND OLD.bill_dpt_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_bill_lock_key$temp
		WHERE 0=0
		AND (bcst_cd = OLD.bcst_cd OR bcst_cd IS NULL AND OLD.bcst_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (bill_dpt_cd = OLD.bill_dpt_cd OR bill_dpt_cd IS NULL AND OLD.bill_dpt_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_bill_lock_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_bill_lock_key
FOR EACH ROW
EXECUTE PROCEDURE msw_bill_lock_key$func();
;

