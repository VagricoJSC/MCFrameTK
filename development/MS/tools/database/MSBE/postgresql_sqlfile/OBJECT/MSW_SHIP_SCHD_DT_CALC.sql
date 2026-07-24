\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ship_schd_dt_calc()
RETURNS TABLE (
	ship_to_id_typ varchar,
	ship_to_id_cd varchar,
	ship_to_lg_grp_cd varchar,
	ship_fr_lg_grp_cd varchar,
	ship_term_cd varchar,
	dlv_rqst_tm timestamp(0),
	dlv_day_week_typ varchar,
	ship_rqst_tm timestamp(0),
	base_dt timestamp(0),
	ship_inst_typ varchar,
	cl_time_chk_flg char,
	ship_dt_chk_flg char,
	xfr_lt numeric,
	fin_cl_time varchar,
	ship_wk_grp_cd varchar,
	ship_wk_cd varchar,
	ship_schd_time varchar,
	to_cal_cd varchar,
	fr_cal_cd varchar,
	est_ship_schd_dt timestamp(0),
	ship_schd_tm timestamp(0),
	dlv_schd_tm timestamp(0),
	peg_no numeric,
	ship_cal_cd varchar,
	early_ship_dt_add_days numeric,
	ship_cal_cd_chk_flg char,
	early_ship_dt_add_days_chk_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_schd_dt_calc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_schd_dt_calc$temp(
				ship_to_id_typ varchar (1) NOT NULL,
				ship_to_id_cd varchar (20) NOT NULL,
				ship_to_lg_grp_cd varchar (10) NOT NULL,
				ship_fr_lg_grp_cd varchar (10) NOT NULL,
				ship_term_cd varchar (5) NULL,
				dlv_rqst_tm timestamp(0)  NULL,
				dlv_day_week_typ varchar (1) NULL,
				ship_rqst_tm timestamp(0)  NULL,
				base_dt timestamp(0)  NOT NULL,
				ship_inst_typ varchar (1) NULL,
				cl_time_chk_flg char (1) DEFAULT '0' NOT NULL,
				ship_dt_chk_flg char (1) DEFAULT '0' NOT NULL,
				xfr_lt numeric (9,0) NULL,
				fin_cl_time varchar (4) NULL,
				ship_wk_grp_cd varchar (5) NULL,
				ship_wk_cd varchar (5) NULL,
				ship_schd_time varchar (4) NULL,
				to_cal_cd varchar (10) NULL,
				fr_cal_cd varchar (10) NULL,
				est_ship_schd_dt timestamp(0)  NULL,
				ship_schd_tm timestamp(0)  NULL,
				dlv_schd_tm timestamp(0)  NULL,
				peg_no numeric (9,0) NOT NULL,
				ship_cal_cd varchar (10) NULL,
				early_ship_dt_add_days numeric (3,0) NULL,
				ship_cal_cd_chk_flg char (1) DEFAULT '0' NOT NULL,
				early_ship_dt_add_days_chk_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_ship_schd_dt_calc$temp
				ADD CONSTRAINT msw_ship_schd_dt_calc_ck01 CHECK (cl_time_chk_flg IN ('0', '1'));
			ALTER TABLE msw_ship_schd_dt_calc$temp
				ADD CONSTRAINT msw_ship_schd_dt_calc_ck02 CHECK (ship_dt_chk_flg IN ('0', '1'));
			ALTER TABLE msw_ship_schd_dt_calc$temp
				ADD CONSTRAINT msw_ship_schd_dt_calc_ck03 CHECK (ship_cal_cd_chk_flg IN ('0', '1'));
			ALTER TABLE msw_ship_schd_dt_calc$temp
				ADD CONSTRAINT msw_ship_schd_dt_calc_ck04 CHECK (early_ship_dt_add_days_chk_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_schd_dt_calc$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ship_schd_dt_calc$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ship_schd_dt_calc
AS
SELECT *
FROM msw_ship_schd_dt_calc();
ALTER VIEW msw_ship_schd_dt_calc ALTER COLUMN cl_time_chk_flg SET DEFAULT '0';
ALTER VIEW msw_ship_schd_dt_calc ALTER COLUMN ship_dt_chk_flg SET DEFAULT '0';
ALTER VIEW msw_ship_schd_dt_calc ALTER COLUMN ship_cal_cd_chk_flg SET DEFAULT '0';
ALTER VIEW msw_ship_schd_dt_calc ALTER COLUMN early_ship_dt_add_days_chk_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_ship_schd_dt_calc$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ship_schd_dt_calc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ship_schd_dt_calc$temp(
				ship_to_id_typ varchar (1) NOT NULL,
				ship_to_id_cd varchar (20) NOT NULL,
				ship_to_lg_grp_cd varchar (10) NOT NULL,
				ship_fr_lg_grp_cd varchar (10) NOT NULL,
				ship_term_cd varchar (5) NULL,
				dlv_rqst_tm timestamp(0)  NULL,
				dlv_day_week_typ varchar (1) NULL,
				ship_rqst_tm timestamp(0)  NULL,
				base_dt timestamp(0)  NOT NULL,
				ship_inst_typ varchar (1) NULL,
				cl_time_chk_flg char (1) DEFAULT '0' NOT NULL,
				ship_dt_chk_flg char (1) DEFAULT '0' NOT NULL,
				xfr_lt numeric (9,0) NULL,
				fin_cl_time varchar (4) NULL,
				ship_wk_grp_cd varchar (5) NULL,
				ship_wk_cd varchar (5) NULL,
				ship_schd_time varchar (4) NULL,
				to_cal_cd varchar (10) NULL,
				fr_cal_cd varchar (10) NULL,
				est_ship_schd_dt timestamp(0)  NULL,
				ship_schd_tm timestamp(0)  NULL,
				dlv_schd_tm timestamp(0)  NULL,
				peg_no numeric (9,0) NOT NULL,
				ship_cal_cd varchar (10) NULL,
				early_ship_dt_add_days numeric (3,0) NULL,
				ship_cal_cd_chk_flg char (1) DEFAULT '0' NOT NULL,
				early_ship_dt_add_days_chk_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_ship_schd_dt_calc$temp
			ADD CONSTRAINT msw_ship_schd_dt_calc_ck01 CHECK (cl_time_chk_flg IN ('0', '1'));
			ALTER TABLE msw_ship_schd_dt_calc$temp
			ADD CONSTRAINT msw_ship_schd_dt_calc_ck02 CHECK (ship_dt_chk_flg IN ('0', '1'));
			ALTER TABLE msw_ship_schd_dt_calc$temp
			ADD CONSTRAINT msw_ship_schd_dt_calc_ck03 CHECK (ship_cal_cd_chk_flg IN ('0', '1'));
			ALTER TABLE msw_ship_schd_dt_calc$temp
			ADD CONSTRAINT msw_ship_schd_dt_calc_ck04 CHECK (early_ship_dt_add_days_chk_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ship_schd_dt_calc$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ship_schd_dt_calc$temp(
			ship_to_id_typ,
			ship_to_id_cd,
			ship_to_lg_grp_cd,
			ship_fr_lg_grp_cd,
			ship_term_cd,
			dlv_rqst_tm,
			dlv_day_week_typ,
			ship_rqst_tm,
			base_dt,
			ship_inst_typ,
			cl_time_chk_flg,
			ship_dt_chk_flg,
			xfr_lt,
			fin_cl_time,
			ship_wk_grp_cd,
			ship_wk_cd,
			ship_schd_time,
			to_cal_cd,
			fr_cal_cd,
			est_ship_schd_dt,
			ship_schd_tm,
			dlv_schd_tm,
			peg_no,
			ship_cal_cd,
			early_ship_dt_add_days,
			ship_cal_cd_chk_flg,
			early_ship_dt_add_days_chk_flg
		)VALUES (
			NEW.ship_to_id_typ,
			NEW.ship_to_id_cd,
			NEW.ship_to_lg_grp_cd,
			NEW.ship_fr_lg_grp_cd,
			NEW.ship_term_cd,
			NEW.dlv_rqst_tm,
			NEW.dlv_day_week_typ,
			NEW.ship_rqst_tm,
			NEW.base_dt,
			NEW.ship_inst_typ,
			NEW.cl_time_chk_flg,
			NEW.ship_dt_chk_flg,
			NEW.xfr_lt,
			NEW.fin_cl_time,
			NEW.ship_wk_grp_cd,
			NEW.ship_wk_cd,
			NEW.ship_schd_time,
			NEW.to_cal_cd,
			NEW.fr_cal_cd,
			NEW.est_ship_schd_dt,
			NEW.ship_schd_tm,
			NEW.dlv_schd_tm,
			NEW.peg_no,
			NEW.ship_cal_cd,
			NEW.early_ship_dt_add_days,
			NEW.ship_cal_cd_chk_flg,
			NEW.early_ship_dt_add_days_chk_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ship_schd_dt_calc$temp
		SET 
			ship_to_id_typ = NEW.ship_to_id_typ,
			ship_to_id_cd = NEW.ship_to_id_cd,
			ship_to_lg_grp_cd = NEW.ship_to_lg_grp_cd,
			ship_fr_lg_grp_cd = NEW.ship_fr_lg_grp_cd,
			ship_term_cd = NEW.ship_term_cd,
			dlv_rqst_tm = NEW.dlv_rqst_tm,
			dlv_day_week_typ = NEW.dlv_day_week_typ,
			ship_rqst_tm = NEW.ship_rqst_tm,
			base_dt = NEW.base_dt,
			ship_inst_typ = NEW.ship_inst_typ,
			cl_time_chk_flg = NEW.cl_time_chk_flg,
			ship_dt_chk_flg = NEW.ship_dt_chk_flg,
			xfr_lt = NEW.xfr_lt,
			fin_cl_time = NEW.fin_cl_time,
			ship_wk_grp_cd = NEW.ship_wk_grp_cd,
			ship_wk_cd = NEW.ship_wk_cd,
			ship_schd_time = NEW.ship_schd_time,
			to_cal_cd = NEW.to_cal_cd,
			fr_cal_cd = NEW.fr_cal_cd,
			est_ship_schd_dt = NEW.est_ship_schd_dt,
			ship_schd_tm = NEW.ship_schd_tm,
			dlv_schd_tm = NEW.dlv_schd_tm,
			peg_no = NEW.peg_no,
			ship_cal_cd = NEW.ship_cal_cd,
			early_ship_dt_add_days = NEW.early_ship_dt_add_days,
			ship_cal_cd_chk_flg = NEW.ship_cal_cd_chk_flg,
			early_ship_dt_add_days_chk_flg = NEW.early_ship_dt_add_days_chk_flg
		WHERE 0=0
		AND ship_to_id_typ = OLD.ship_to_id_typ
		AND ship_to_id_cd = OLD.ship_to_id_cd
		AND ship_to_lg_grp_cd = OLD.ship_to_lg_grp_cd
		AND ship_fr_lg_grp_cd = OLD.ship_fr_lg_grp_cd
		AND (ship_term_cd = OLD.ship_term_cd OR ship_term_cd IS NULL AND OLD.ship_term_cd IS NULL)
		AND (dlv_rqst_tm = OLD.dlv_rqst_tm OR dlv_rqst_tm IS NULL AND OLD.dlv_rqst_tm IS NULL)
		AND (dlv_day_week_typ = OLD.dlv_day_week_typ OR dlv_day_week_typ IS NULL AND OLD.dlv_day_week_typ IS NULL)
		AND (ship_rqst_tm = OLD.ship_rqst_tm OR ship_rqst_tm IS NULL AND OLD.ship_rqst_tm IS NULL)
		AND base_dt = OLD.base_dt
		AND (ship_inst_typ = OLD.ship_inst_typ OR ship_inst_typ IS NULL AND OLD.ship_inst_typ IS NULL)
		AND cl_time_chk_flg = OLD.cl_time_chk_flg
		AND ship_dt_chk_flg = OLD.ship_dt_chk_flg
		AND (xfr_lt = OLD.xfr_lt OR xfr_lt IS NULL AND OLD.xfr_lt IS NULL)
		AND (fin_cl_time = OLD.fin_cl_time OR fin_cl_time IS NULL AND OLD.fin_cl_time IS NULL)
		AND (ship_wk_grp_cd = OLD.ship_wk_grp_cd OR ship_wk_grp_cd IS NULL AND OLD.ship_wk_grp_cd IS NULL)
		AND (ship_wk_cd = OLD.ship_wk_cd OR ship_wk_cd IS NULL AND OLD.ship_wk_cd IS NULL)
		AND (ship_schd_time = OLD.ship_schd_time OR ship_schd_time IS NULL AND OLD.ship_schd_time IS NULL)
		AND (to_cal_cd = OLD.to_cal_cd OR to_cal_cd IS NULL AND OLD.to_cal_cd IS NULL)
		AND (fr_cal_cd = OLD.fr_cal_cd OR fr_cal_cd IS NULL AND OLD.fr_cal_cd IS NULL)
		AND (est_ship_schd_dt = OLD.est_ship_schd_dt OR est_ship_schd_dt IS NULL AND OLD.est_ship_schd_dt IS NULL)
		AND (ship_schd_tm = OLD.ship_schd_tm OR ship_schd_tm IS NULL AND OLD.ship_schd_tm IS NULL)
		AND (dlv_schd_tm = OLD.dlv_schd_tm OR dlv_schd_tm IS NULL AND OLD.dlv_schd_tm IS NULL)
		AND peg_no = OLD.peg_no
		AND (ship_cal_cd = OLD.ship_cal_cd OR ship_cal_cd IS NULL AND OLD.ship_cal_cd IS NULL)
		AND (early_ship_dt_add_days = OLD.early_ship_dt_add_days OR early_ship_dt_add_days IS NULL AND OLD.early_ship_dt_add_days IS NULL)
		AND ship_cal_cd_chk_flg = OLD.ship_cal_cd_chk_flg
		AND early_ship_dt_add_days_chk_flg = OLD.early_ship_dt_add_days_chk_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ship_schd_dt_calc$temp
		WHERE 0=0
		AND ship_to_id_typ = OLD.ship_to_id_typ
		AND ship_to_id_cd = OLD.ship_to_id_cd
		AND ship_to_lg_grp_cd = OLD.ship_to_lg_grp_cd
		AND ship_fr_lg_grp_cd = OLD.ship_fr_lg_grp_cd
		AND (ship_term_cd = OLD.ship_term_cd OR ship_term_cd IS NULL AND OLD.ship_term_cd IS NULL)
		AND (dlv_rqst_tm = OLD.dlv_rqst_tm OR dlv_rqst_tm IS NULL AND OLD.dlv_rqst_tm IS NULL)
		AND (dlv_day_week_typ = OLD.dlv_day_week_typ OR dlv_day_week_typ IS NULL AND OLD.dlv_day_week_typ IS NULL)
		AND (ship_rqst_tm = OLD.ship_rqst_tm OR ship_rqst_tm IS NULL AND OLD.ship_rqst_tm IS NULL)
		AND base_dt = OLD.base_dt
		AND (ship_inst_typ = OLD.ship_inst_typ OR ship_inst_typ IS NULL AND OLD.ship_inst_typ IS NULL)
		AND cl_time_chk_flg = OLD.cl_time_chk_flg
		AND ship_dt_chk_flg = OLD.ship_dt_chk_flg
		AND (xfr_lt = OLD.xfr_lt OR xfr_lt IS NULL AND OLD.xfr_lt IS NULL)
		AND (fin_cl_time = OLD.fin_cl_time OR fin_cl_time IS NULL AND OLD.fin_cl_time IS NULL)
		AND (ship_wk_grp_cd = OLD.ship_wk_grp_cd OR ship_wk_grp_cd IS NULL AND OLD.ship_wk_grp_cd IS NULL)
		AND (ship_wk_cd = OLD.ship_wk_cd OR ship_wk_cd IS NULL AND OLD.ship_wk_cd IS NULL)
		AND (ship_schd_time = OLD.ship_schd_time OR ship_schd_time IS NULL AND OLD.ship_schd_time IS NULL)
		AND (to_cal_cd = OLD.to_cal_cd OR to_cal_cd IS NULL AND OLD.to_cal_cd IS NULL)
		AND (fr_cal_cd = OLD.fr_cal_cd OR fr_cal_cd IS NULL AND OLD.fr_cal_cd IS NULL)
		AND (est_ship_schd_dt = OLD.est_ship_schd_dt OR est_ship_schd_dt IS NULL AND OLD.est_ship_schd_dt IS NULL)
		AND (ship_schd_tm = OLD.ship_schd_tm OR ship_schd_tm IS NULL AND OLD.ship_schd_tm IS NULL)
		AND (dlv_schd_tm = OLD.dlv_schd_tm OR dlv_schd_tm IS NULL AND OLD.dlv_schd_tm IS NULL)
		AND peg_no = OLD.peg_no
		AND (ship_cal_cd = OLD.ship_cal_cd OR ship_cal_cd IS NULL AND OLD.ship_cal_cd IS NULL)
		AND (early_ship_dt_add_days = OLD.early_ship_dt_add_days OR early_ship_dt_add_days IS NULL AND OLD.early_ship_dt_add_days IS NULL)
		AND ship_cal_cd_chk_flg = OLD.ship_cal_cd_chk_flg
		AND early_ship_dt_add_days_chk_flg = OLD.early_ship_dt_add_days_chk_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ship_schd_dt_calc$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ship_schd_dt_calc
FOR EACH ROW
EXECUTE PROCEDURE msw_ship_schd_dt_calc$func();
;

