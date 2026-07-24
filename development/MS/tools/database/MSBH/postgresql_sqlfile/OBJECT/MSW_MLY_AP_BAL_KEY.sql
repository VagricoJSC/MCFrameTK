\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mly_ap_bal_key()
RETURNS TABLE (
	ac_ym timestamp(0),
	asppl_cd varchar,
	ap_dpt_cd varchar,
	trd_cur_cd varchar,
	purc_act_no varchar,
	rcpt_iv_mng_no varchar,
	wrk_no varchar,
	ap_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mly_ap_bal_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mly_ap_bal_key$temp(
				ac_ym timestamp(0)  NULL,
				asppl_cd varchar (20) NULL,
				ap_dpt_cd varchar (20) NULL,
				trd_cur_cd varchar (3) NULL,
				purc_act_no varchar (15) DEFAULT '*' NULL,
				rcpt_iv_mng_no varchar (15) DEFAULT '*' NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				ap_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mly_ap_bal_key_pk_ie ON msw_mly_ap_bal_key$temp
				USING BTREE (ac_ym,asppl_cd,ap_dpt_cd,trd_cur_cd,purc_act_no,rcpt_iv_mng_no,wrk_no,ap_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mly_ap_bal_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mly_ap_bal_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mly_ap_bal_key
AS
SELECT *
FROM msw_mly_ap_bal_key();
ALTER VIEW msw_mly_ap_bal_key ALTER COLUMN purc_act_no SET DEFAULT '*';
ALTER VIEW msw_mly_ap_bal_key ALTER COLUMN rcpt_iv_mng_no SET DEFAULT '*';
ALTER VIEW msw_mly_ap_bal_key ALTER COLUMN wrk_no SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_mly_ap_bal_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mly_ap_bal_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mly_ap_bal_key$temp(
				ac_ym timestamp(0)  NULL,
				asppl_cd varchar (20) NULL,
				ap_dpt_cd varchar (20) NULL,
				trd_cur_cd varchar (3) NULL,
				purc_act_no varchar (15) DEFAULT '*' NULL,
				rcpt_iv_mng_no varchar (15) DEFAULT '*' NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				ap_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mly_ap_bal_key_pk_ie ON msw_mly_ap_bal_key$temp
				USING BTREE (ac_ym,asppl_cd,ap_dpt_cd,trd_cur_cd,purc_act_no,rcpt_iv_mng_no,wrk_no,ap_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mly_ap_bal_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mly_ap_bal_key$temp(
			ac_ym,
			asppl_cd,
			ap_dpt_cd,
			trd_cur_cd,
			purc_act_no,
			rcpt_iv_mng_no,
			wrk_no,
			ap_typ
		)VALUES (
			NEW.ac_ym,
			NEW.asppl_cd,
			NEW.ap_dpt_cd,
			NEW.trd_cur_cd,
			NEW.purc_act_no,
			NEW.rcpt_iv_mng_no,
			NEW.wrk_no,
			NEW.ap_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mly_ap_bal_key$temp
		SET 
			ac_ym = NEW.ac_ym,
			asppl_cd = NEW.asppl_cd,
			ap_dpt_cd = NEW.ap_dpt_cd,
			trd_cur_cd = NEW.trd_cur_cd,
			purc_act_no = NEW.purc_act_no,
			rcpt_iv_mng_no = NEW.rcpt_iv_mng_no,
			wrk_no = NEW.wrk_no,
			ap_typ = NEW.ap_typ
		WHERE 0=0
		AND (ac_ym = OLD.ac_ym OR ac_ym IS NULL AND OLD.ac_ym IS NULL)
		AND (asppl_cd = OLD.asppl_cd OR asppl_cd IS NULL AND OLD.asppl_cd IS NULL)
		AND (ap_dpt_cd = OLD.ap_dpt_cd OR ap_dpt_cd IS NULL AND OLD.ap_dpt_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (purc_act_no = OLD.purc_act_no OR purc_act_no IS NULL AND OLD.purc_act_no IS NULL)
		AND (rcpt_iv_mng_no = OLD.rcpt_iv_mng_no OR rcpt_iv_mng_no IS NULL AND OLD.rcpt_iv_mng_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (ap_typ = OLD.ap_typ OR ap_typ IS NULL AND OLD.ap_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mly_ap_bal_key$temp
		WHERE 0=0
		AND (ac_ym = OLD.ac_ym OR ac_ym IS NULL AND OLD.ac_ym IS NULL)
		AND (asppl_cd = OLD.asppl_cd OR asppl_cd IS NULL AND OLD.asppl_cd IS NULL)
		AND (ap_dpt_cd = OLD.ap_dpt_cd OR ap_dpt_cd IS NULL AND OLD.ap_dpt_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (purc_act_no = OLD.purc_act_no OR purc_act_no IS NULL AND OLD.purc_act_no IS NULL)
		AND (rcpt_iv_mng_no = OLD.rcpt_iv_mng_no OR rcpt_iv_mng_no IS NULL AND OLD.rcpt_iv_mng_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (ap_typ = OLD.ap_typ OR ap_typ IS NULL AND OLD.ap_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mly_ap_bal_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mly_ap_bal_key
FOR EACH ROW
EXECUTE PROCEDURE msw_mly_ap_bal_key$func();
;

