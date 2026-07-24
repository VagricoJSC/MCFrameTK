\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_pay_schd_lock_key()
RETURNS TABLE (
	bsppl_cd varchar,
	bsppl_dpt_cd varchar,
	purc_act_no varchar,
	rcpt_iv_mng_no varchar,
	rcpt_iv_no varchar,
	wrk_no varchar,
	trd_cur_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_pay_schd_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_pay_schd_lock_key$temp(
				bsppl_cd varchar (20) NULL,
				bsppl_dpt_cd varchar (20) NULL,
				purc_act_no varchar (15) DEFAULT '*' NULL,
				rcpt_iv_mng_no varchar (15) DEFAULT '*' NULL,
				rcpt_iv_no varchar (15) DEFAULT '*' NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				trd_cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_pay_schd_lock_key_pk_ie ON msw_pay_schd_lock_key$temp
				USING BTREE (bsppl_cd,bsppl_dpt_cd,purc_act_no,rcpt_iv_mng_no,rcpt_iv_no,wrk_no,trd_cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_pay_schd_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_pay_schd_lock_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_pay_schd_lock_key
AS
SELECT *
FROM msw_pay_schd_lock_key();
ALTER VIEW msw_pay_schd_lock_key ALTER COLUMN purc_act_no SET DEFAULT '*';
ALTER VIEW msw_pay_schd_lock_key ALTER COLUMN rcpt_iv_mng_no SET DEFAULT '*';
ALTER VIEW msw_pay_schd_lock_key ALTER COLUMN rcpt_iv_no SET DEFAULT '*';
ALTER VIEW msw_pay_schd_lock_key ALTER COLUMN wrk_no SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_pay_schd_lock_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_pay_schd_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_pay_schd_lock_key$temp(
				bsppl_cd varchar (20) NULL,
				bsppl_dpt_cd varchar (20) NULL,
				purc_act_no varchar (15) DEFAULT '*' NULL,
				rcpt_iv_mng_no varchar (15) DEFAULT '*' NULL,
				rcpt_iv_no varchar (15) DEFAULT '*' NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				trd_cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_pay_schd_lock_key_pk_ie ON msw_pay_schd_lock_key$temp
				USING BTREE (bsppl_cd,bsppl_dpt_cd,purc_act_no,rcpt_iv_mng_no,rcpt_iv_no,wrk_no,trd_cur_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_pay_schd_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_pay_schd_lock_key$temp(
			bsppl_cd,
			bsppl_dpt_cd,
			purc_act_no,
			rcpt_iv_mng_no,
			rcpt_iv_no,
			wrk_no,
			trd_cur_cd
		)VALUES (
			NEW.bsppl_cd,
			NEW.bsppl_dpt_cd,
			NEW.purc_act_no,
			NEW.rcpt_iv_mng_no,
			NEW.rcpt_iv_no,
			NEW.wrk_no,
			NEW.trd_cur_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_pay_schd_lock_key$temp
		SET 
			bsppl_cd = NEW.bsppl_cd,
			bsppl_dpt_cd = NEW.bsppl_dpt_cd,
			purc_act_no = NEW.purc_act_no,
			rcpt_iv_mng_no = NEW.rcpt_iv_mng_no,
			rcpt_iv_no = NEW.rcpt_iv_no,
			wrk_no = NEW.wrk_no,
			trd_cur_cd = NEW.trd_cur_cd
		WHERE 0=0
		AND (bsppl_cd = OLD.bsppl_cd OR bsppl_cd IS NULL AND OLD.bsppl_cd IS NULL)
		AND (bsppl_dpt_cd = OLD.bsppl_dpt_cd OR bsppl_dpt_cd IS NULL AND OLD.bsppl_dpt_cd IS NULL)
		AND (purc_act_no = OLD.purc_act_no OR purc_act_no IS NULL AND OLD.purc_act_no IS NULL)
		AND (rcpt_iv_mng_no = OLD.rcpt_iv_mng_no OR rcpt_iv_mng_no IS NULL AND OLD.rcpt_iv_mng_no IS NULL)
		AND (rcpt_iv_no = OLD.rcpt_iv_no OR rcpt_iv_no IS NULL AND OLD.rcpt_iv_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_pay_schd_lock_key$temp
		WHERE 0=0
		AND (bsppl_cd = OLD.bsppl_cd OR bsppl_cd IS NULL AND OLD.bsppl_cd IS NULL)
		AND (bsppl_dpt_cd = OLD.bsppl_dpt_cd OR bsppl_dpt_cd IS NULL AND OLD.bsppl_dpt_cd IS NULL)
		AND (purc_act_no = OLD.purc_act_no OR purc_act_no IS NULL AND OLD.purc_act_no IS NULL)
		AND (rcpt_iv_mng_no = OLD.rcpt_iv_mng_no OR rcpt_iv_mng_no IS NULL AND OLD.rcpt_iv_mng_no IS NULL)
		AND (rcpt_iv_no = OLD.rcpt_iv_no OR rcpt_iv_no IS NULL AND OLD.rcpt_iv_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_pay_schd_lock_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_pay_schd_lock_key
FOR EACH ROW
EXECUTE PROCEDURE msw_pay_schd_lock_key$func();
;

