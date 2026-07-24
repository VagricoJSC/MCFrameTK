\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_frcst_slo_sum()
RETURNS TABLE (
	ym timestamp(0),
	sls_dpt_cd varchar,
	sls_usr_cd varchar,
	cst_cd varchar,
	wrk_no varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	trd_cur_cd varchar,
	spln_itm_cd varchar,
	sls_itm_grp_cd varchar,
	base_unit_slo_qty numeric,
	trd_cur_slo_amt numeric,
	slo_cost_amt numeric,
	base_unit_pre_slo_qty numeric,
	trd_cur_pre_slo_amt numeric,
	pre_slo_cost_amt numeric,
	cst_frcst_qty numeric,
	trd_cur_cst_frcst_amt numeric,
	usr_cst_cd varchar,
	usr_wrk_no varchar,
	sum_cst_cd varchar,
	sum_wrk_no varchar,
	dt timestamp(0),
	upri_unit_cd varchar,
	lot_qty numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_frcst_slo_sum$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_frcst_slo_sum$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				sls_usr_cd varchar (500) NULL,
				cst_cd varchar (20) NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				trd_cur_cd varchar (3) NULL,
				spln_itm_cd varchar (40) NULL,
				sls_itm_grp_cd varchar (10) NULL,
				base_unit_slo_qty numeric (21,8) NULL,
				trd_cur_slo_amt numeric (21,8) NULL,
				slo_cost_amt numeric (21,8) NULL,
				base_unit_pre_slo_qty numeric (21,8) NULL,
				trd_cur_pre_slo_amt numeric (21,8) NULL,
				pre_slo_cost_amt numeric (21,8) NULL,
				cst_frcst_qty numeric (21,8) NULL,
				trd_cur_cst_frcst_amt numeric (21,8) NULL,
				usr_cst_cd varchar (20) DEFAULT '*' NULL,
				usr_wrk_no varchar (15) DEFAULT '*' NULL,
				sum_cst_cd varchar (20) DEFAULT '*' NULL,
				sum_wrk_no varchar (15) DEFAULT '*' NULL,
				dt timestamp(0)  NULL,
				upri_unit_cd varchar (5) NULL,
				lot_qty numeric (21,8) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_frcst_slo_sum$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_frcst_slo_sum$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_frcst_slo_sum
AS
SELECT *
FROM msw_frcst_slo_sum();
ALTER VIEW msw_frcst_slo_sum ALTER COLUMN wrk_no SET DEFAULT '*';
ALTER VIEW msw_frcst_slo_sum ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_frcst_slo_sum ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_frcst_slo_sum ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_frcst_slo_sum ALTER COLUMN usr_cst_cd SET DEFAULT '*';
ALTER VIEW msw_frcst_slo_sum ALTER COLUMN usr_wrk_no SET DEFAULT '*';
ALTER VIEW msw_frcst_slo_sum ALTER COLUMN sum_cst_cd SET DEFAULT '*';
ALTER VIEW msw_frcst_slo_sum ALTER COLUMN sum_wrk_no SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_frcst_slo_sum$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_frcst_slo_sum$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_frcst_slo_sum$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				sls_usr_cd varchar (500) NULL,
				cst_cd varchar (20) NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				trd_cur_cd varchar (3) NULL,
				spln_itm_cd varchar (40) NULL,
				sls_itm_grp_cd varchar (10) NULL,
				base_unit_slo_qty numeric (21,8) NULL,
				trd_cur_slo_amt numeric (21,8) NULL,
				slo_cost_amt numeric (21,8) NULL,
				base_unit_pre_slo_qty numeric (21,8) NULL,
				trd_cur_pre_slo_amt numeric (21,8) NULL,
				pre_slo_cost_amt numeric (21,8) NULL,
				cst_frcst_qty numeric (21,8) NULL,
				trd_cur_cst_frcst_amt numeric (21,8) NULL,
				usr_cst_cd varchar (20) DEFAULT '*' NULL,
				usr_wrk_no varchar (15) DEFAULT '*' NULL,
				sum_cst_cd varchar (20) DEFAULT '*' NULL,
				sum_wrk_no varchar (15) DEFAULT '*' NULL,
				dt timestamp(0)  NULL,
				upri_unit_cd varchar (5) NULL,
				lot_qty numeric (21,8) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_frcst_slo_sum$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_frcst_slo_sum$temp(
			ym,
			sls_dpt_cd,
			sls_usr_cd,
			cst_cd,
			wrk_no,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			trd_cur_cd,
			spln_itm_cd,
			sls_itm_grp_cd,
			base_unit_slo_qty,
			trd_cur_slo_amt,
			slo_cost_amt,
			base_unit_pre_slo_qty,
			trd_cur_pre_slo_amt,
			pre_slo_cost_amt,
			cst_frcst_qty,
			trd_cur_cst_frcst_amt,
			usr_cst_cd,
			usr_wrk_no,
			sum_cst_cd,
			sum_wrk_no,
			dt,
			upri_unit_cd,
			lot_qty
		)VALUES (
			NEW.ym,
			NEW.sls_dpt_cd,
			NEW.sls_usr_cd,
			NEW.cst_cd,
			NEW.wrk_no,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.trd_cur_cd,
			NEW.spln_itm_cd,
			NEW.sls_itm_grp_cd,
			NEW.base_unit_slo_qty,
			NEW.trd_cur_slo_amt,
			NEW.slo_cost_amt,
			NEW.base_unit_pre_slo_qty,
			NEW.trd_cur_pre_slo_amt,
			NEW.pre_slo_cost_amt,
			NEW.cst_frcst_qty,
			NEW.trd_cur_cst_frcst_amt,
			NEW.usr_cst_cd,
			NEW.usr_wrk_no,
			NEW.sum_cst_cd,
			NEW.sum_wrk_no,
			NEW.dt,
			NEW.upri_unit_cd,
			NEW.lot_qty
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_frcst_slo_sum$temp
		SET 
			ym = NEW.ym,
			sls_dpt_cd = NEW.sls_dpt_cd,
			sls_usr_cd = NEW.sls_usr_cd,
			cst_cd = NEW.cst_cd,
			wrk_no = NEW.wrk_no,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			trd_cur_cd = NEW.trd_cur_cd,
			spln_itm_cd = NEW.spln_itm_cd,
			sls_itm_grp_cd = NEW.sls_itm_grp_cd,
			base_unit_slo_qty = NEW.base_unit_slo_qty,
			trd_cur_slo_amt = NEW.trd_cur_slo_amt,
			slo_cost_amt = NEW.slo_cost_amt,
			base_unit_pre_slo_qty = NEW.base_unit_pre_slo_qty,
			trd_cur_pre_slo_amt = NEW.trd_cur_pre_slo_amt,
			pre_slo_cost_amt = NEW.pre_slo_cost_amt,
			cst_frcst_qty = NEW.cst_frcst_qty,
			trd_cur_cst_frcst_amt = NEW.trd_cur_cst_frcst_amt,
			usr_cst_cd = NEW.usr_cst_cd,
			usr_wrk_no = NEW.usr_wrk_no,
			sum_cst_cd = NEW.sum_cst_cd,
			sum_wrk_no = NEW.sum_wrk_no,
			dt = NEW.dt,
			upri_unit_cd = NEW.upri_unit_cd,
			lot_qty = NEW.lot_qty
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (spln_itm_cd = OLD.spln_itm_cd OR spln_itm_cd IS NULL AND OLD.spln_itm_cd IS NULL)
		AND (sls_itm_grp_cd = OLD.sls_itm_grp_cd OR sls_itm_grp_cd IS NULL AND OLD.sls_itm_grp_cd IS NULL)
		AND (base_unit_slo_qty = OLD.base_unit_slo_qty OR base_unit_slo_qty IS NULL AND OLD.base_unit_slo_qty IS NULL)
		AND (trd_cur_slo_amt = OLD.trd_cur_slo_amt OR trd_cur_slo_amt IS NULL AND OLD.trd_cur_slo_amt IS NULL)
		AND (slo_cost_amt = OLD.slo_cost_amt OR slo_cost_amt IS NULL AND OLD.slo_cost_amt IS NULL)
		AND (base_unit_pre_slo_qty = OLD.base_unit_pre_slo_qty OR base_unit_pre_slo_qty IS NULL AND OLD.base_unit_pre_slo_qty IS NULL)
		AND (trd_cur_pre_slo_amt = OLD.trd_cur_pre_slo_amt OR trd_cur_pre_slo_amt IS NULL AND OLD.trd_cur_pre_slo_amt IS NULL)
		AND (pre_slo_cost_amt = OLD.pre_slo_cost_amt OR pre_slo_cost_amt IS NULL AND OLD.pre_slo_cost_amt IS NULL)
		AND (cst_frcst_qty = OLD.cst_frcst_qty OR cst_frcst_qty IS NULL AND OLD.cst_frcst_qty IS NULL)
		AND (trd_cur_cst_frcst_amt = OLD.trd_cur_cst_frcst_amt OR trd_cur_cst_frcst_amt IS NULL AND OLD.trd_cur_cst_frcst_amt IS NULL)
		AND (usr_cst_cd = OLD.usr_cst_cd OR usr_cst_cd IS NULL AND OLD.usr_cst_cd IS NULL)
		AND (usr_wrk_no = OLD.usr_wrk_no OR usr_wrk_no IS NULL AND OLD.usr_wrk_no IS NULL)
		AND (sum_cst_cd = OLD.sum_cst_cd OR sum_cst_cd IS NULL AND OLD.sum_cst_cd IS NULL)
		AND (sum_wrk_no = OLD.sum_wrk_no OR sum_wrk_no IS NULL AND OLD.sum_wrk_no IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (upri_unit_cd = OLD.upri_unit_cd OR upri_unit_cd IS NULL AND OLD.upri_unit_cd IS NULL)
		AND (lot_qty = OLD.lot_qty OR lot_qty IS NULL AND OLD.lot_qty IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_frcst_slo_sum$temp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (spln_itm_cd = OLD.spln_itm_cd OR spln_itm_cd IS NULL AND OLD.spln_itm_cd IS NULL)
		AND (sls_itm_grp_cd = OLD.sls_itm_grp_cd OR sls_itm_grp_cd IS NULL AND OLD.sls_itm_grp_cd IS NULL)
		AND (base_unit_slo_qty = OLD.base_unit_slo_qty OR base_unit_slo_qty IS NULL AND OLD.base_unit_slo_qty IS NULL)
		AND (trd_cur_slo_amt = OLD.trd_cur_slo_amt OR trd_cur_slo_amt IS NULL AND OLD.trd_cur_slo_amt IS NULL)
		AND (slo_cost_amt = OLD.slo_cost_amt OR slo_cost_amt IS NULL AND OLD.slo_cost_amt IS NULL)
		AND (base_unit_pre_slo_qty = OLD.base_unit_pre_slo_qty OR base_unit_pre_slo_qty IS NULL AND OLD.base_unit_pre_slo_qty IS NULL)
		AND (trd_cur_pre_slo_amt = OLD.trd_cur_pre_slo_amt OR trd_cur_pre_slo_amt IS NULL AND OLD.trd_cur_pre_slo_amt IS NULL)
		AND (pre_slo_cost_amt = OLD.pre_slo_cost_amt OR pre_slo_cost_amt IS NULL AND OLD.pre_slo_cost_amt IS NULL)
		AND (cst_frcst_qty = OLD.cst_frcst_qty OR cst_frcst_qty IS NULL AND OLD.cst_frcst_qty IS NULL)
		AND (trd_cur_cst_frcst_amt = OLD.trd_cur_cst_frcst_amt OR trd_cur_cst_frcst_amt IS NULL AND OLD.trd_cur_cst_frcst_amt IS NULL)
		AND (usr_cst_cd = OLD.usr_cst_cd OR usr_cst_cd IS NULL AND OLD.usr_cst_cd IS NULL)
		AND (usr_wrk_no = OLD.usr_wrk_no OR usr_wrk_no IS NULL AND OLD.usr_wrk_no IS NULL)
		AND (sum_cst_cd = OLD.sum_cst_cd OR sum_cst_cd IS NULL AND OLD.sum_cst_cd IS NULL)
		AND (sum_wrk_no = OLD.sum_wrk_no OR sum_wrk_no IS NULL AND OLD.sum_wrk_no IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (upri_unit_cd = OLD.upri_unit_cd OR upri_unit_cd IS NULL AND OLD.upri_unit_cd IS NULL)
		AND (lot_qty = OLD.lot_qty OR lot_qty IS NULL AND OLD.lot_qty IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_frcst_slo_sum$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_frcst_slo_sum
FOR EACH ROW
EXECUTE PROCEDURE msw_frcst_slo_sum$func();
;

