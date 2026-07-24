\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_slo_sls_sum()
RETURNS TABLE (
	ym timestamp(0),
	sls_dpt_cd varchar,
	sls_usr_cd varchar,
	cst_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	trd_cur_cd varchar,
	wrk_no varchar,
	sls_itm_grp_cd varchar,
	xrate numeric,
	sls_qty numeric,
	sls_amt numeric,
	base_cur_sls_amt numeric,
	sls_cost_amt numeric,
	slo_qty numeric,
	slo_amt numeric,
	slo_cost_amt numeric,
	slo_bl_qty numeric,
	slo_bl_amt numeric,
	slo_bl_cost_amt numeric,
	spln_qty numeric,
	spln_amt numeric,
	bdg_sls_amt numeric,
	bdg_sls_prof_amt numeric,
	dpt_lvl_cd varchar,
	dpt_cd1 varchar,
	dpt_cd2 varchar,
	sls_itm_grp_cd1 varchar,
	sls_itm_grp_cd2 varchar,
	not_sum_flg char,
	spln_usr_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_slo_sls_sum$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_slo_sls_sum$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				sls_usr_cd varchar (500) NULL,
				cst_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				trd_cur_cd varchar (3) NULL,
				wrk_no varchar (15) NULL,
				sls_itm_grp_cd varchar (10) NULL,
				xrate numeric (21,8) NULL,
				sls_qty numeric (21,8) NULL,
				sls_amt numeric (21,8) NULL,
				base_cur_sls_amt numeric (21,8) NULL,
				sls_cost_amt numeric (21,8) NULL,
				slo_qty numeric (21,8) NULL,
				slo_amt numeric (21,8) NULL,
				slo_cost_amt numeric (21,8) NULL,
				slo_bl_qty numeric (21,8) NULL,
				slo_bl_amt numeric (21,8) NULL,
				slo_bl_cost_amt numeric (21,8) NULL,
				spln_qty numeric (21,8) NULL,
				spln_amt numeric (21,8) NULL,
				bdg_sls_amt numeric (21,8) NULL,
				bdg_sls_prof_amt numeric (21,8) NULL,
				dpt_lvl_cd varchar (10) NULL,
				dpt_cd1 varchar (20) NULL,
				dpt_cd2 varchar (20) NULL,
				sls_itm_grp_cd1 varchar (10) NULL,
				sls_itm_grp_cd2 varchar (10) NULL,
				not_sum_flg char (1) NOT NULL,
				spln_usr_flg char (1) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_slo_sls_sum$temp
				ADD CONSTRAINT msw_slo_sls_sum_ck01 CHECK (not_sum_flg IN ('0', '1'));
			ALTER TABLE msw_slo_sls_sum$temp
				ADD CONSTRAINT msw_slo_sls_sum_ck02 CHECK (spln_usr_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_slo_sls_sum$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_slo_sls_sum$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_slo_sls_sum
AS
SELECT *
FROM msw_slo_sls_sum();

CREATE OR REPLACE FUNCTION msw_slo_sls_sum$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_slo_sls_sum$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_slo_sls_sum$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				sls_usr_cd varchar (500) NULL,
				cst_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				trd_cur_cd varchar (3) NULL,
				wrk_no varchar (15) NULL,
				sls_itm_grp_cd varchar (10) NULL,
				xrate numeric (21,8) NULL,
				sls_qty numeric (21,8) NULL,
				sls_amt numeric (21,8) NULL,
				base_cur_sls_amt numeric (21,8) NULL,
				sls_cost_amt numeric (21,8) NULL,
				slo_qty numeric (21,8) NULL,
				slo_amt numeric (21,8) NULL,
				slo_cost_amt numeric (21,8) NULL,
				slo_bl_qty numeric (21,8) NULL,
				slo_bl_amt numeric (21,8) NULL,
				slo_bl_cost_amt numeric (21,8) NULL,
				spln_qty numeric (21,8) NULL,
				spln_amt numeric (21,8) NULL,
				bdg_sls_amt numeric (21,8) NULL,
				bdg_sls_prof_amt numeric (21,8) NULL,
				dpt_lvl_cd varchar (10) NULL,
				dpt_cd1 varchar (20) NULL,
				dpt_cd2 varchar (20) NULL,
				sls_itm_grp_cd1 varchar (10) NULL,
				sls_itm_grp_cd2 varchar (10) NULL,
				not_sum_flg char (1) NOT NULL,
				spln_usr_flg char (1) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_slo_sls_sum$temp
			ADD CONSTRAINT msw_slo_sls_sum_ck01 CHECK (not_sum_flg IN ('0', '1'));
			ALTER TABLE msw_slo_sls_sum$temp
			ADD CONSTRAINT msw_slo_sls_sum_ck02 CHECK (spln_usr_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_slo_sls_sum$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_slo_sls_sum$temp(
			ym,
			sls_dpt_cd,
			sls_usr_cd,
			cst_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			trd_cur_cd,
			wrk_no,
			sls_itm_grp_cd,
			xrate,
			sls_qty,
			sls_amt,
			base_cur_sls_amt,
			sls_cost_amt,
			slo_qty,
			slo_amt,
			slo_cost_amt,
			slo_bl_qty,
			slo_bl_amt,
			slo_bl_cost_amt,
			spln_qty,
			spln_amt,
			bdg_sls_amt,
			bdg_sls_prof_amt,
			dpt_lvl_cd,
			dpt_cd1,
			dpt_cd2,
			sls_itm_grp_cd1,
			sls_itm_grp_cd2,
			not_sum_flg,
			spln_usr_flg
		)VALUES (
			NEW.ym,
			NEW.sls_dpt_cd,
			NEW.sls_usr_cd,
			NEW.cst_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.trd_cur_cd,
			NEW.wrk_no,
			NEW.sls_itm_grp_cd,
			NEW.xrate,
			NEW.sls_qty,
			NEW.sls_amt,
			NEW.base_cur_sls_amt,
			NEW.sls_cost_amt,
			NEW.slo_qty,
			NEW.slo_amt,
			NEW.slo_cost_amt,
			NEW.slo_bl_qty,
			NEW.slo_bl_amt,
			NEW.slo_bl_cost_amt,
			NEW.spln_qty,
			NEW.spln_amt,
			NEW.bdg_sls_amt,
			NEW.bdg_sls_prof_amt,
			NEW.dpt_lvl_cd,
			NEW.dpt_cd1,
			NEW.dpt_cd2,
			NEW.sls_itm_grp_cd1,
			NEW.sls_itm_grp_cd2,
			NEW.not_sum_flg,
			NEW.spln_usr_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_slo_sls_sum$temp
		SET 
			ym = NEW.ym,
			sls_dpt_cd = NEW.sls_dpt_cd,
			sls_usr_cd = NEW.sls_usr_cd,
			cst_cd = NEW.cst_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			trd_cur_cd = NEW.trd_cur_cd,
			wrk_no = NEW.wrk_no,
			sls_itm_grp_cd = NEW.sls_itm_grp_cd,
			xrate = NEW.xrate,
			sls_qty = NEW.sls_qty,
			sls_amt = NEW.sls_amt,
			base_cur_sls_amt = NEW.base_cur_sls_amt,
			sls_cost_amt = NEW.sls_cost_amt,
			slo_qty = NEW.slo_qty,
			slo_amt = NEW.slo_amt,
			slo_cost_amt = NEW.slo_cost_amt,
			slo_bl_qty = NEW.slo_bl_qty,
			slo_bl_amt = NEW.slo_bl_amt,
			slo_bl_cost_amt = NEW.slo_bl_cost_amt,
			spln_qty = NEW.spln_qty,
			spln_amt = NEW.spln_amt,
			bdg_sls_amt = NEW.bdg_sls_amt,
			bdg_sls_prof_amt = NEW.bdg_sls_prof_amt,
			dpt_lvl_cd = NEW.dpt_lvl_cd,
			dpt_cd1 = NEW.dpt_cd1,
			dpt_cd2 = NEW.dpt_cd2,
			sls_itm_grp_cd1 = NEW.sls_itm_grp_cd1,
			sls_itm_grp_cd2 = NEW.sls_itm_grp_cd2,
			not_sum_flg = NEW.not_sum_flg,
			spln_usr_flg = NEW.spln_usr_flg
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (sls_itm_grp_cd = OLD.sls_itm_grp_cd OR sls_itm_grp_cd IS NULL AND OLD.sls_itm_grp_cd IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (sls_qty = OLD.sls_qty OR sls_qty IS NULL AND OLD.sls_qty IS NULL)
		AND (sls_amt = OLD.sls_amt OR sls_amt IS NULL AND OLD.sls_amt IS NULL)
		AND (base_cur_sls_amt = OLD.base_cur_sls_amt OR base_cur_sls_amt IS NULL AND OLD.base_cur_sls_amt IS NULL)
		AND (sls_cost_amt = OLD.sls_cost_amt OR sls_cost_amt IS NULL AND OLD.sls_cost_amt IS NULL)
		AND (slo_qty = OLD.slo_qty OR slo_qty IS NULL AND OLD.slo_qty IS NULL)
		AND (slo_amt = OLD.slo_amt OR slo_amt IS NULL AND OLD.slo_amt IS NULL)
		AND (slo_cost_amt = OLD.slo_cost_amt OR slo_cost_amt IS NULL AND OLD.slo_cost_amt IS NULL)
		AND (slo_bl_qty = OLD.slo_bl_qty OR slo_bl_qty IS NULL AND OLD.slo_bl_qty IS NULL)
		AND (slo_bl_amt = OLD.slo_bl_amt OR slo_bl_amt IS NULL AND OLD.slo_bl_amt IS NULL)
		AND (slo_bl_cost_amt = OLD.slo_bl_cost_amt OR slo_bl_cost_amt IS NULL AND OLD.slo_bl_cost_amt IS NULL)
		AND (spln_qty = OLD.spln_qty OR spln_qty IS NULL AND OLD.spln_qty IS NULL)
		AND (spln_amt = OLD.spln_amt OR spln_amt IS NULL AND OLD.spln_amt IS NULL)
		AND (bdg_sls_amt = OLD.bdg_sls_amt OR bdg_sls_amt IS NULL AND OLD.bdg_sls_amt IS NULL)
		AND (bdg_sls_prof_amt = OLD.bdg_sls_prof_amt OR bdg_sls_prof_amt IS NULL AND OLD.bdg_sls_prof_amt IS NULL)
		AND (dpt_lvl_cd = OLD.dpt_lvl_cd OR dpt_lvl_cd IS NULL AND OLD.dpt_lvl_cd IS NULL)
		AND (dpt_cd1 = OLD.dpt_cd1 OR dpt_cd1 IS NULL AND OLD.dpt_cd1 IS NULL)
		AND (dpt_cd2 = OLD.dpt_cd2 OR dpt_cd2 IS NULL AND OLD.dpt_cd2 IS NULL)
		AND (sls_itm_grp_cd1 = OLD.sls_itm_grp_cd1 OR sls_itm_grp_cd1 IS NULL AND OLD.sls_itm_grp_cd1 IS NULL)
		AND (sls_itm_grp_cd2 = OLD.sls_itm_grp_cd2 OR sls_itm_grp_cd2 IS NULL AND OLD.sls_itm_grp_cd2 IS NULL)
		AND not_sum_flg = OLD.not_sum_flg
		AND spln_usr_flg = OLD.spln_usr_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_slo_sls_sum$temp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (sls_itm_grp_cd = OLD.sls_itm_grp_cd OR sls_itm_grp_cd IS NULL AND OLD.sls_itm_grp_cd IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (sls_qty = OLD.sls_qty OR sls_qty IS NULL AND OLD.sls_qty IS NULL)
		AND (sls_amt = OLD.sls_amt OR sls_amt IS NULL AND OLD.sls_amt IS NULL)
		AND (base_cur_sls_amt = OLD.base_cur_sls_amt OR base_cur_sls_amt IS NULL AND OLD.base_cur_sls_amt IS NULL)
		AND (sls_cost_amt = OLD.sls_cost_amt OR sls_cost_amt IS NULL AND OLD.sls_cost_amt IS NULL)
		AND (slo_qty = OLD.slo_qty OR slo_qty IS NULL AND OLD.slo_qty IS NULL)
		AND (slo_amt = OLD.slo_amt OR slo_amt IS NULL AND OLD.slo_amt IS NULL)
		AND (slo_cost_amt = OLD.slo_cost_amt OR slo_cost_amt IS NULL AND OLD.slo_cost_amt IS NULL)
		AND (slo_bl_qty = OLD.slo_bl_qty OR slo_bl_qty IS NULL AND OLD.slo_bl_qty IS NULL)
		AND (slo_bl_amt = OLD.slo_bl_amt OR slo_bl_amt IS NULL AND OLD.slo_bl_amt IS NULL)
		AND (slo_bl_cost_amt = OLD.slo_bl_cost_amt OR slo_bl_cost_amt IS NULL AND OLD.slo_bl_cost_amt IS NULL)
		AND (spln_qty = OLD.spln_qty OR spln_qty IS NULL AND OLD.spln_qty IS NULL)
		AND (spln_amt = OLD.spln_amt OR spln_amt IS NULL AND OLD.spln_amt IS NULL)
		AND (bdg_sls_amt = OLD.bdg_sls_amt OR bdg_sls_amt IS NULL AND OLD.bdg_sls_amt IS NULL)
		AND (bdg_sls_prof_amt = OLD.bdg_sls_prof_amt OR bdg_sls_prof_amt IS NULL AND OLD.bdg_sls_prof_amt IS NULL)
		AND (dpt_lvl_cd = OLD.dpt_lvl_cd OR dpt_lvl_cd IS NULL AND OLD.dpt_lvl_cd IS NULL)
		AND (dpt_cd1 = OLD.dpt_cd1 OR dpt_cd1 IS NULL AND OLD.dpt_cd1 IS NULL)
		AND (dpt_cd2 = OLD.dpt_cd2 OR dpt_cd2 IS NULL AND OLD.dpt_cd2 IS NULL)
		AND (sls_itm_grp_cd1 = OLD.sls_itm_grp_cd1 OR sls_itm_grp_cd1 IS NULL AND OLD.sls_itm_grp_cd1 IS NULL)
		AND (sls_itm_grp_cd2 = OLD.sls_itm_grp_cd2 OR sls_itm_grp_cd2 IS NULL AND OLD.sls_itm_grp_cd2 IS NULL)
		AND not_sum_flg = OLD.not_sum_flg
		AND spln_usr_flg = OLD.spln_usr_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_slo_sls_sum$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_slo_sls_sum
FOR EACH ROW
EXECUTE PROCEDURE msw_slo_sls_sum$func();
;

