\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_bom_ex_tmp()
RETURNS TABLE (
	bom_lvl numeric,
	sort_no varchar,
	wg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	bom_ptn varchar,
	oper_cd varchar,
	oper_seq numeric,
	alt_grp_cd varchar,
	expns_cd varchar,
	par_rqmt_qty numeric,
	chd_rqmt_qty numeric,
	chd_base_qty numeric,
	fxd_chd_rqmt_qty numeric,
	chd_min_qty numeric,
	chd_batch_qty numeric,
	alt_itm_ratio numeric,
	disp_seq numeric,
	par_wg_cd varchar,
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	par_sort_no varchar,
	bom_wg_cd varchar,
	calc_ctg_cd varchar,
	itm_calc_ctg_cd varchar,
	dtl_calc_ctg_cd varchar,
	purc_calc_ctg_cd varchar,
	proc_calc_ctg_cd varchar,
	prov_calc_ctg_cd varchar,
	sls_calc_ctg_cd varchar,
	fix_calc_ctg_cd varchar,
	bottom_flg char,
	loop_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_tmp$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_tmp$temp(
				bom_lvl numeric (3,0) NOT NULL,
				sort_no varchar (3000) NOT NULL,
				wg_cd varchar (10) DEFAULT '*' NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				bom_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				alt_grp_cd varchar (40) NULL,
				expns_cd varchar (20) NULL,
				par_rqmt_qty numeric (21,8) NULL,
				chd_rqmt_qty numeric (21,8) NULL,
				chd_base_qty numeric (21,8) NULL,
				fxd_chd_rqmt_qty numeric (21,8) NULL,
				chd_min_qty numeric (21,8) NULL,
				chd_batch_qty numeric (21,8) NULL,
				alt_itm_ratio numeric (9,0) NULL,
				disp_seq numeric (9,0) NULL,
				par_wg_cd varchar (10) NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_sort_no varchar (3000) NULL,
				bom_wg_cd varchar (10) NULL,
				calc_ctg_cd varchar (10) NULL,
				itm_calc_ctg_cd varchar (10) NULL,
				dtl_calc_ctg_cd varchar (10) NULL,
				purc_calc_ctg_cd varchar (10) NULL,
				proc_calc_ctg_cd varchar (10) NULL,
				prov_calc_ctg_cd varchar (10) NULL,
				sls_calc_ctg_cd varchar (10) NULL,
				fix_calc_ctg_cd varchar (10) NULL,
				bottom_flg char (1) DEFAULT '0' NOT NULL,
				loop_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_tmp$temp
				ADD CONSTRAINT mgw_bom_ex_tmp_ck01 CHECK (bottom_flg IN ('0', '1'));
			ALTER TABLE mgw_bom_ex_tmp$temp
				ADD CONSTRAINT mgw_bom_ex_tmp_ck02 CHECK (loop_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_tmp$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_bom_ex_tmp$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_bom_ex_tmp
AS
SELECT *
FROM mgw_bom_ex_tmp();
ALTER VIEW mgw_bom_ex_tmp ALTER COLUMN wg_cd SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_tmp ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_tmp ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_tmp ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_tmp ALTER COLUMN bottom_flg SET DEFAULT '0';
ALTER VIEW mgw_bom_ex_tmp ALTER COLUMN loop_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_bom_ex_tmp$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_tmp$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_tmp$temp(
				bom_lvl numeric (3,0) NOT NULL,
				sort_no varchar (3000) NOT NULL,
				wg_cd varchar (10) DEFAULT '*' NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				bom_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				alt_grp_cd varchar (40) NULL,
				expns_cd varchar (20) NULL,
				par_rqmt_qty numeric (21,8) NULL,
				chd_rqmt_qty numeric (21,8) NULL,
				chd_base_qty numeric (21,8) NULL,
				fxd_chd_rqmt_qty numeric (21,8) NULL,
				chd_min_qty numeric (21,8) NULL,
				chd_batch_qty numeric (21,8) NULL,
				alt_itm_ratio numeric (9,0) NULL,
				disp_seq numeric (9,0) NULL,
				par_wg_cd varchar (10) NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_sort_no varchar (3000) NULL,
				bom_wg_cd varchar (10) NULL,
				calc_ctg_cd varchar (10) NULL,
				itm_calc_ctg_cd varchar (10) NULL,
				dtl_calc_ctg_cd varchar (10) NULL,
				purc_calc_ctg_cd varchar (10) NULL,
				proc_calc_ctg_cd varchar (10) NULL,
				prov_calc_ctg_cd varchar (10) NULL,
				sls_calc_ctg_cd varchar (10) NULL,
				fix_calc_ctg_cd varchar (10) NULL,
				bottom_flg char (1) DEFAULT '0' NOT NULL,
				loop_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_tmp$temp
			ADD CONSTRAINT mgw_bom_ex_tmp_ck01 CHECK (bottom_flg IN ('0', '1'));
			ALTER TABLE mgw_bom_ex_tmp$temp
			ADD CONSTRAINT mgw_bom_ex_tmp_ck02 CHECK (loop_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_tmp$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_bom_ex_tmp$temp(
			bom_lvl,
			sort_no,
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			alt_grp_cd,
			expns_cd,
			par_rqmt_qty,
			chd_rqmt_qty,
			chd_base_qty,
			fxd_chd_rqmt_qty,
			chd_min_qty,
			chd_batch_qty,
			alt_itm_ratio,
			disp_seq,
			par_wg_cd,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_sort_no,
			bom_wg_cd,
			calc_ctg_cd,
			itm_calc_ctg_cd,
			dtl_calc_ctg_cd,
			purc_calc_ctg_cd,
			proc_calc_ctg_cd,
			prov_calc_ctg_cd,
			sls_calc_ctg_cd,
			fix_calc_ctg_cd,
			bottom_flg,
			loop_flg
		)VALUES (
			NEW.bom_lvl,
			NEW.sort_no,
			NEW.wg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.bom_ptn,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.alt_grp_cd,
			NEW.expns_cd,
			NEW.par_rqmt_qty,
			NEW.chd_rqmt_qty,
			NEW.chd_base_qty,
			NEW.fxd_chd_rqmt_qty,
			NEW.chd_min_qty,
			NEW.chd_batch_qty,
			NEW.alt_itm_ratio,
			NEW.disp_seq,
			NEW.par_wg_cd,
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.par_sort_no,
			NEW.bom_wg_cd,
			NEW.calc_ctg_cd,
			NEW.itm_calc_ctg_cd,
			NEW.dtl_calc_ctg_cd,
			NEW.purc_calc_ctg_cd,
			NEW.proc_calc_ctg_cd,
			NEW.prov_calc_ctg_cd,
			NEW.sls_calc_ctg_cd,
			NEW.fix_calc_ctg_cd,
			NEW.bottom_flg,
			NEW.loop_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_bom_ex_tmp$temp
		SET 
			bom_lvl = NEW.bom_lvl,
			sort_no = NEW.sort_no,
			wg_cd = NEW.wg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			bom_ptn = NEW.bom_ptn,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			alt_grp_cd = NEW.alt_grp_cd,
			expns_cd = NEW.expns_cd,
			par_rqmt_qty = NEW.par_rqmt_qty,
			chd_rqmt_qty = NEW.chd_rqmt_qty,
			chd_base_qty = NEW.chd_base_qty,
			fxd_chd_rqmt_qty = NEW.fxd_chd_rqmt_qty,
			chd_min_qty = NEW.chd_min_qty,
			chd_batch_qty = NEW.chd_batch_qty,
			alt_itm_ratio = NEW.alt_itm_ratio,
			disp_seq = NEW.disp_seq,
			par_wg_cd = NEW.par_wg_cd,
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			par_sort_no = NEW.par_sort_no,
			bom_wg_cd = NEW.bom_wg_cd,
			calc_ctg_cd = NEW.calc_ctg_cd,
			itm_calc_ctg_cd = NEW.itm_calc_ctg_cd,
			dtl_calc_ctg_cd = NEW.dtl_calc_ctg_cd,
			purc_calc_ctg_cd = NEW.purc_calc_ctg_cd,
			proc_calc_ctg_cd = NEW.proc_calc_ctg_cd,
			prov_calc_ctg_cd = NEW.prov_calc_ctg_cd,
			sls_calc_ctg_cd = NEW.sls_calc_ctg_cd,
			fix_calc_ctg_cd = NEW.fix_calc_ctg_cd,
			bottom_flg = NEW.bottom_flg,
			loop_flg = NEW.loop_flg
		WHERE 0=0
		AND bom_lvl = OLD.bom_lvl
		AND sort_no = OLD.sort_no
		AND wg_cd = OLD.wg_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND (par_rqmt_qty = OLD.par_rqmt_qty OR par_rqmt_qty IS NULL AND OLD.par_rqmt_qty IS NULL)
		AND (chd_rqmt_qty = OLD.chd_rqmt_qty OR chd_rqmt_qty IS NULL AND OLD.chd_rqmt_qty IS NULL)
		AND (chd_base_qty = OLD.chd_base_qty OR chd_base_qty IS NULL AND OLD.chd_base_qty IS NULL)
		AND (fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty OR fxd_chd_rqmt_qty IS NULL AND OLD.fxd_chd_rqmt_qty IS NULL)
		AND (chd_min_qty = OLD.chd_min_qty OR chd_min_qty IS NULL AND OLD.chd_min_qty IS NULL)
		AND (chd_batch_qty = OLD.chd_batch_qty OR chd_batch_qty IS NULL AND OLD.chd_batch_qty IS NULL)
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (par_wg_cd = OLD.par_wg_cd OR par_wg_cd IS NULL AND OLD.par_wg_cd IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_sort_no = OLD.par_sort_no OR par_sort_no IS NULL AND OLD.par_sort_no IS NULL)
		AND (bom_wg_cd = OLD.bom_wg_cd OR bom_wg_cd IS NULL AND OLD.bom_wg_cd IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (itm_calc_ctg_cd = OLD.itm_calc_ctg_cd OR itm_calc_ctg_cd IS NULL AND OLD.itm_calc_ctg_cd IS NULL)
		AND (dtl_calc_ctg_cd = OLD.dtl_calc_ctg_cd OR dtl_calc_ctg_cd IS NULL AND OLD.dtl_calc_ctg_cd IS NULL)
		AND (purc_calc_ctg_cd = OLD.purc_calc_ctg_cd OR purc_calc_ctg_cd IS NULL AND OLD.purc_calc_ctg_cd IS NULL)
		AND (proc_calc_ctg_cd = OLD.proc_calc_ctg_cd OR proc_calc_ctg_cd IS NULL AND OLD.proc_calc_ctg_cd IS NULL)
		AND (prov_calc_ctg_cd = OLD.prov_calc_ctg_cd OR prov_calc_ctg_cd IS NULL AND OLD.prov_calc_ctg_cd IS NULL)
		AND (sls_calc_ctg_cd = OLD.sls_calc_ctg_cd OR sls_calc_ctg_cd IS NULL AND OLD.sls_calc_ctg_cd IS NULL)
		AND (fix_calc_ctg_cd = OLD.fix_calc_ctg_cd OR fix_calc_ctg_cd IS NULL AND OLD.fix_calc_ctg_cd IS NULL)
		AND bottom_flg = OLD.bottom_flg
		AND loop_flg = OLD.loop_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_bom_ex_tmp$temp
		WHERE 0=0
		AND bom_lvl = OLD.bom_lvl
		AND sort_no = OLD.sort_no
		AND wg_cd = OLD.wg_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND (par_rqmt_qty = OLD.par_rqmt_qty OR par_rqmt_qty IS NULL AND OLD.par_rqmt_qty IS NULL)
		AND (chd_rqmt_qty = OLD.chd_rqmt_qty OR chd_rqmt_qty IS NULL AND OLD.chd_rqmt_qty IS NULL)
		AND (chd_base_qty = OLD.chd_base_qty OR chd_base_qty IS NULL AND OLD.chd_base_qty IS NULL)
		AND (fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty OR fxd_chd_rqmt_qty IS NULL AND OLD.fxd_chd_rqmt_qty IS NULL)
		AND (chd_min_qty = OLD.chd_min_qty OR chd_min_qty IS NULL AND OLD.chd_min_qty IS NULL)
		AND (chd_batch_qty = OLD.chd_batch_qty OR chd_batch_qty IS NULL AND OLD.chd_batch_qty IS NULL)
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (par_wg_cd = OLD.par_wg_cd OR par_wg_cd IS NULL AND OLD.par_wg_cd IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_sort_no = OLD.par_sort_no OR par_sort_no IS NULL AND OLD.par_sort_no IS NULL)
		AND (bom_wg_cd = OLD.bom_wg_cd OR bom_wg_cd IS NULL AND OLD.bom_wg_cd IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (itm_calc_ctg_cd = OLD.itm_calc_ctg_cd OR itm_calc_ctg_cd IS NULL AND OLD.itm_calc_ctg_cd IS NULL)
		AND (dtl_calc_ctg_cd = OLD.dtl_calc_ctg_cd OR dtl_calc_ctg_cd IS NULL AND OLD.dtl_calc_ctg_cd IS NULL)
		AND (purc_calc_ctg_cd = OLD.purc_calc_ctg_cd OR purc_calc_ctg_cd IS NULL AND OLD.purc_calc_ctg_cd IS NULL)
		AND (proc_calc_ctg_cd = OLD.proc_calc_ctg_cd OR proc_calc_ctg_cd IS NULL AND OLD.proc_calc_ctg_cd IS NULL)
		AND (prov_calc_ctg_cd = OLD.prov_calc_ctg_cd OR prov_calc_ctg_cd IS NULL AND OLD.prov_calc_ctg_cd IS NULL)
		AND (sls_calc_ctg_cd = OLD.sls_calc_ctg_cd OR sls_calc_ctg_cd IS NULL AND OLD.sls_calc_ctg_cd IS NULL)
		AND (fix_calc_ctg_cd = OLD.fix_calc_ctg_cd OR fix_calc_ctg_cd IS NULL AND OLD.fix_calc_ctg_cd IS NULL)
		AND bottom_flg = OLD.bottom_flg
		AND loop_flg = OLD.loop_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_bom_ex_tmp$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_bom_ex_tmp
FOR EACH ROW
EXECUTE PROCEDURE mgw_bom_ex_tmp$func();
;

