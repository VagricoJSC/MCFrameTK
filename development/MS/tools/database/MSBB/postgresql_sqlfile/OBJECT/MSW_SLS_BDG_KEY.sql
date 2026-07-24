\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sls_bdg_key()
RETURNS TABLE (
	ym timestamp(0),
	sls_dpt_cd varchar,
	wg_cd varchar,
	sls_itm_grp_cd varchar,
	cst_cd varchar,
	sls_usr_cd varchar,
	trd_cur_cd varchar,
	wrk_no varchar,
	sls_bdg_grp varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_bdg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_bdg_key$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				wg_cd varchar (10) NULL,
				sls_itm_grp_cd varchar (10) NULL,
				cst_cd varchar (20) NULL,
				sls_usr_cd varchar (500) NULL,
				trd_cur_cd varchar (3) NULL,
				wrk_no varchar (15) NULL,
				sls_bdg_grp varchar (100) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sls_bdg_key_pk_ie ON msw_sls_bdg_key$temp
				USING BTREE (ym,sls_dpt_cd,wg_cd,sls_itm_grp_cd,cst_cd,sls_usr_cd,trd_cur_cd,wrk_no,sls_bdg_grp);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_bdg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sls_bdg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sls_bdg_key
AS
SELECT *
FROM msw_sls_bdg_key();

CREATE OR REPLACE FUNCTION msw_sls_bdg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_bdg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_bdg_key$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				wg_cd varchar (10) NULL,
				sls_itm_grp_cd varchar (10) NULL,
				cst_cd varchar (20) NULL,
				sls_usr_cd varchar (500) NULL,
				trd_cur_cd varchar (3) NULL,
				wrk_no varchar (15) NULL,
				sls_bdg_grp varchar (100) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sls_bdg_key_pk_ie ON msw_sls_bdg_key$temp
				USING BTREE (ym,sls_dpt_cd,wg_cd,sls_itm_grp_cd,cst_cd,sls_usr_cd,trd_cur_cd,wrk_no,sls_bdg_grp);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_bdg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sls_bdg_key$temp(
			ym,
			sls_dpt_cd,
			wg_cd,
			sls_itm_grp_cd,
			cst_cd,
			sls_usr_cd,
			trd_cur_cd,
			wrk_no,
			sls_bdg_grp
		)VALUES (
			NEW.ym,
			NEW.sls_dpt_cd,
			NEW.wg_cd,
			NEW.sls_itm_grp_cd,
			NEW.cst_cd,
			NEW.sls_usr_cd,
			NEW.trd_cur_cd,
			NEW.wrk_no,
			NEW.sls_bdg_grp
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sls_bdg_key$temp
		SET 
			ym = NEW.ym,
			sls_dpt_cd = NEW.sls_dpt_cd,
			wg_cd = NEW.wg_cd,
			sls_itm_grp_cd = NEW.sls_itm_grp_cd,
			cst_cd = NEW.cst_cd,
			sls_usr_cd = NEW.sls_usr_cd,
			trd_cur_cd = NEW.trd_cur_cd,
			wrk_no = NEW.wrk_no,
			sls_bdg_grp = NEW.sls_bdg_grp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (sls_itm_grp_cd = OLD.sls_itm_grp_cd OR sls_itm_grp_cd IS NULL AND OLD.sls_itm_grp_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (sls_bdg_grp = OLD.sls_bdg_grp OR sls_bdg_grp IS NULL AND OLD.sls_bdg_grp IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sls_bdg_key$temp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (sls_itm_grp_cd = OLD.sls_itm_grp_cd OR sls_itm_grp_cd IS NULL AND OLD.sls_itm_grp_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (sls_bdg_grp = OLD.sls_bdg_grp OR sls_bdg_grp IS NULL AND OLD.sls_bdg_grp IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sls_bdg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sls_bdg_key
FOR EACH ROW
EXECUTE PROCEDURE msw_sls_bdg_key$func();
;

