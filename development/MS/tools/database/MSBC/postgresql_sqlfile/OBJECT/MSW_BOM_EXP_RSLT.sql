\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_bom_exp_rslt()
RETURNS TABLE (
	peg_no numeric,
	itm_ord_no varchar,
	bom_key varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	ver_no varchar,
	rqmt_qty numeric,
	loss_rqmt_qty numeric,
	inpt_qty numeric,
	fxd_rqmt_qty numeric,
	alt_itm_flg char,
	alt_grp_cd varchar,
	alt_grp_seq numeric,
	alt_itm_typ varchar,
	alt_itm_ratio numeric,
	alt_alloc_prio numeric,
	sno1 varchar,
	sno_typ1 varchar,
	sno2 varchar,
	sno_typ2 varchar,
	sno3 varchar,
	sno_typ3 varchar,
	sno4 varchar,
	sno_typ4 varchar,
	par_inst_qty numeric,
	chd_rqmt_qty numeric,
	chd_inpt_qty numeric,
	fxd_chd_rqmt_qty numeric,
	chd_rqmt_ratio numeric,
	chd_inpt_ratio numeric,
	byprod_flg char,
	in_offst_typ varchar,
	in_offst numeric,
	bkf_typ varchar,
	inst_lot_fix_flg char,
	lot_mix_flg char,
	sublot_mix_flg char,
	alloc_ctl_typ varchar,
	main_itm_flg char,
	yield_calc_flg char,
	inpt_ctl_typ varchar,
	disp_seq numeric,
	memo1 varchar,
	memo2 varchar,
	memo3 varchar,
	cur_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bom_exp_rslt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bom_exp_rslt$temp(
				peg_no numeric (9,0) NULL,
				itm_ord_no varchar (15) NULL,
				bom_key varchar (15) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				rqmt_qty numeric (21,8) NULL,
				loss_rqmt_qty numeric (21,8) NULL,
				inpt_qty numeric (21,8) NULL,
				fxd_rqmt_qty numeric (21,8) NULL,
				alt_itm_flg char (1) DEFAULT '0' NOT NULL,
				alt_grp_cd varchar (40) NULL,
				alt_grp_seq numeric (9,0) NULL,
				alt_itm_typ varchar (1) NULL,
				alt_itm_ratio numeric (9,0) NULL,
				alt_alloc_prio numeric (9,0) NULL,
				sno1 varchar (15) NULL,
				sno_typ1 varchar (1) NULL,
				sno2 varchar (15) NULL,
				sno_typ2 varchar (1) NULL,
				sno3 varchar (15) NULL,
				sno_typ3 varchar (1) NULL,
				sno4 varchar (15) NULL,
				sno_typ4 varchar (1) NULL,
				par_inst_qty numeric (21,8) NULL,
				chd_rqmt_qty numeric (21,8) NULL,
				chd_inpt_qty numeric (21,8) NULL,
				fxd_chd_rqmt_qty numeric (21,8) NULL,
				chd_rqmt_ratio numeric (21,8) NULL,
				chd_inpt_ratio numeric (21,8) NULL,
				byprod_flg char (1) DEFAULT '0' NOT NULL,
				in_offst_typ varchar (1) NULL,
				in_offst numeric (9,0) NULL,
				bkf_typ varchar (1) NULL,
				inst_lot_fix_flg char (1) DEFAULT '0' NOT NULL,
				lot_mix_flg char (1) DEFAULT '0' NOT NULL,
				sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
				alloc_ctl_typ varchar (1) NULL,
				main_itm_flg char (1) DEFAULT '0' NOT NULL,
				yield_calc_flg char (1) DEFAULT '0' NOT NULL,
				inpt_ctl_typ varchar (1) NULL,
				disp_seq numeric (9,0) NULL,
				memo1 varchar (100) NULL,
				memo2 varchar (100) NULL,
				memo3 varchar (100) NULL,
				cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_bom_exp_rslt$temp
				ADD CONSTRAINT msw_bom_exp_rslt_ck01 CHECK (alt_itm_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
				ADD CONSTRAINT msw_bom_exp_rslt_ck02 CHECK (byprod_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
				ADD CONSTRAINT msw_bom_exp_rslt_ck03 CHECK (inst_lot_fix_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
				ADD CONSTRAINT msw_bom_exp_rslt_ck04 CHECK (lot_mix_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
				ADD CONSTRAINT msw_bom_exp_rslt_ck05 CHECK (sublot_mix_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
				ADD CONSTRAINT msw_bom_exp_rslt_ck06 CHECK (main_itm_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
				ADD CONSTRAINT msw_bom_exp_rslt_ck07 CHECK (yield_calc_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bom_exp_rslt$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_bom_exp_rslt$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_bom_exp_rslt
AS
SELECT *
FROM msw_bom_exp_rslt();
ALTER VIEW msw_bom_exp_rslt ALTER COLUMN alt_itm_flg SET DEFAULT '0';
ALTER VIEW msw_bom_exp_rslt ALTER COLUMN byprod_flg SET DEFAULT '0';
ALTER VIEW msw_bom_exp_rslt ALTER COLUMN inst_lot_fix_flg SET DEFAULT '0';
ALTER VIEW msw_bom_exp_rslt ALTER COLUMN lot_mix_flg SET DEFAULT '0';
ALTER VIEW msw_bom_exp_rslt ALTER COLUMN sublot_mix_flg SET DEFAULT '0';
ALTER VIEW msw_bom_exp_rslt ALTER COLUMN main_itm_flg SET DEFAULT '0';
ALTER VIEW msw_bom_exp_rslt ALTER COLUMN yield_calc_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_bom_exp_rslt$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bom_exp_rslt$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bom_exp_rslt$temp(
				peg_no numeric (9,0) NULL,
				itm_ord_no varchar (15) NULL,
				bom_key varchar (15) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				rqmt_qty numeric (21,8) NULL,
				loss_rqmt_qty numeric (21,8) NULL,
				inpt_qty numeric (21,8) NULL,
				fxd_rqmt_qty numeric (21,8) NULL,
				alt_itm_flg char (1) DEFAULT '0' NOT NULL,
				alt_grp_cd varchar (40) NULL,
				alt_grp_seq numeric (9,0) NULL,
				alt_itm_typ varchar (1) NULL,
				alt_itm_ratio numeric (9,0) NULL,
				alt_alloc_prio numeric (9,0) NULL,
				sno1 varchar (15) NULL,
				sno_typ1 varchar (1) NULL,
				sno2 varchar (15) NULL,
				sno_typ2 varchar (1) NULL,
				sno3 varchar (15) NULL,
				sno_typ3 varchar (1) NULL,
				sno4 varchar (15) NULL,
				sno_typ4 varchar (1) NULL,
				par_inst_qty numeric (21,8) NULL,
				chd_rqmt_qty numeric (21,8) NULL,
				chd_inpt_qty numeric (21,8) NULL,
				fxd_chd_rqmt_qty numeric (21,8) NULL,
				chd_rqmt_ratio numeric (21,8) NULL,
				chd_inpt_ratio numeric (21,8) NULL,
				byprod_flg char (1) DEFAULT '0' NOT NULL,
				in_offst_typ varchar (1) NULL,
				in_offst numeric (9,0) NULL,
				bkf_typ varchar (1) NULL,
				inst_lot_fix_flg char (1) DEFAULT '0' NOT NULL,
				lot_mix_flg char (1) DEFAULT '0' NOT NULL,
				sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
				alloc_ctl_typ varchar (1) NULL,
				main_itm_flg char (1) DEFAULT '0' NOT NULL,
				yield_calc_flg char (1) DEFAULT '0' NOT NULL,
				inpt_ctl_typ varchar (1) NULL,
				disp_seq numeric (9,0) NULL,
				memo1 varchar (100) NULL,
				memo2 varchar (100) NULL,
				memo3 varchar (100) NULL,
				cur_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_bom_exp_rslt$temp
			ADD CONSTRAINT msw_bom_exp_rslt_ck01 CHECK (alt_itm_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
			ADD CONSTRAINT msw_bom_exp_rslt_ck02 CHECK (byprod_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
			ADD CONSTRAINT msw_bom_exp_rslt_ck03 CHECK (inst_lot_fix_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
			ADD CONSTRAINT msw_bom_exp_rslt_ck04 CHECK (lot_mix_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
			ADD CONSTRAINT msw_bom_exp_rslt_ck05 CHECK (sublot_mix_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
			ADD CONSTRAINT msw_bom_exp_rslt_ck06 CHECK (main_itm_flg IN ('0', '1'));
			ALTER TABLE msw_bom_exp_rslt$temp
			ADD CONSTRAINT msw_bom_exp_rslt_ck07 CHECK (yield_calc_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bom_exp_rslt$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_bom_exp_rslt$temp(
			peg_no,
			itm_ord_no,
			bom_key,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			ver_no,
			rqmt_qty,
			loss_rqmt_qty,
			inpt_qty,
			fxd_rqmt_qty,
			alt_itm_flg,
			alt_grp_cd,
			alt_grp_seq,
			alt_itm_typ,
			alt_itm_ratio,
			alt_alloc_prio,
			sno1,
			sno_typ1,
			sno2,
			sno_typ2,
			sno3,
			sno_typ3,
			sno4,
			sno_typ4,
			par_inst_qty,
			chd_rqmt_qty,
			chd_inpt_qty,
			fxd_chd_rqmt_qty,
			chd_rqmt_ratio,
			chd_inpt_ratio,
			byprod_flg,
			in_offst_typ,
			in_offst,
			bkf_typ,
			inst_lot_fix_flg,
			lot_mix_flg,
			sublot_mix_flg,
			alloc_ctl_typ,
			main_itm_flg,
			yield_calc_flg,
			inpt_ctl_typ,
			disp_seq,
			memo1,
			memo2,
			memo3,
			cur_cd
		)VALUES (
			NEW.peg_no,
			NEW.itm_ord_no,
			NEW.bom_key,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.ver_no,
			NEW.rqmt_qty,
			NEW.loss_rqmt_qty,
			NEW.inpt_qty,
			NEW.fxd_rqmt_qty,
			NEW.alt_itm_flg,
			NEW.alt_grp_cd,
			NEW.alt_grp_seq,
			NEW.alt_itm_typ,
			NEW.alt_itm_ratio,
			NEW.alt_alloc_prio,
			NEW.sno1,
			NEW.sno_typ1,
			NEW.sno2,
			NEW.sno_typ2,
			NEW.sno3,
			NEW.sno_typ3,
			NEW.sno4,
			NEW.sno_typ4,
			NEW.par_inst_qty,
			NEW.chd_rqmt_qty,
			NEW.chd_inpt_qty,
			NEW.fxd_chd_rqmt_qty,
			NEW.chd_rqmt_ratio,
			NEW.chd_inpt_ratio,
			NEW.byprod_flg,
			NEW.in_offst_typ,
			NEW.in_offst,
			NEW.bkf_typ,
			NEW.inst_lot_fix_flg,
			NEW.lot_mix_flg,
			NEW.sublot_mix_flg,
			NEW.alloc_ctl_typ,
			NEW.main_itm_flg,
			NEW.yield_calc_flg,
			NEW.inpt_ctl_typ,
			NEW.disp_seq,
			NEW.memo1,
			NEW.memo2,
			NEW.memo3,
			NEW.cur_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_bom_exp_rslt$temp
		SET 
			peg_no = NEW.peg_no,
			itm_ord_no = NEW.itm_ord_no,
			bom_key = NEW.bom_key,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			ver_no = NEW.ver_no,
			rqmt_qty = NEW.rqmt_qty,
			loss_rqmt_qty = NEW.loss_rqmt_qty,
			inpt_qty = NEW.inpt_qty,
			fxd_rqmt_qty = NEW.fxd_rqmt_qty,
			alt_itm_flg = NEW.alt_itm_flg,
			alt_grp_cd = NEW.alt_grp_cd,
			alt_grp_seq = NEW.alt_grp_seq,
			alt_itm_typ = NEW.alt_itm_typ,
			alt_itm_ratio = NEW.alt_itm_ratio,
			alt_alloc_prio = NEW.alt_alloc_prio,
			sno1 = NEW.sno1,
			sno_typ1 = NEW.sno_typ1,
			sno2 = NEW.sno2,
			sno_typ2 = NEW.sno_typ2,
			sno3 = NEW.sno3,
			sno_typ3 = NEW.sno_typ3,
			sno4 = NEW.sno4,
			sno_typ4 = NEW.sno_typ4,
			par_inst_qty = NEW.par_inst_qty,
			chd_rqmt_qty = NEW.chd_rqmt_qty,
			chd_inpt_qty = NEW.chd_inpt_qty,
			fxd_chd_rqmt_qty = NEW.fxd_chd_rqmt_qty,
			chd_rqmt_ratio = NEW.chd_rqmt_ratio,
			chd_inpt_ratio = NEW.chd_inpt_ratio,
			byprod_flg = NEW.byprod_flg,
			in_offst_typ = NEW.in_offst_typ,
			in_offst = NEW.in_offst,
			bkf_typ = NEW.bkf_typ,
			inst_lot_fix_flg = NEW.inst_lot_fix_flg,
			lot_mix_flg = NEW.lot_mix_flg,
			sublot_mix_flg = NEW.sublot_mix_flg,
			alloc_ctl_typ = NEW.alloc_ctl_typ,
			main_itm_flg = NEW.main_itm_flg,
			yield_calc_flg = NEW.yield_calc_flg,
			inpt_ctl_typ = NEW.inpt_ctl_typ,
			disp_seq = NEW.disp_seq,
			memo1 = NEW.memo1,
			memo2 = NEW.memo2,
			memo3 = NEW.memo3,
			cur_cd = NEW.cur_cd
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (bom_key = OLD.bom_key OR bom_key IS NULL AND OLD.bom_key IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (rqmt_qty = OLD.rqmt_qty OR rqmt_qty IS NULL AND OLD.rqmt_qty IS NULL)
		AND (loss_rqmt_qty = OLD.loss_rqmt_qty OR loss_rqmt_qty IS NULL AND OLD.loss_rqmt_qty IS NULL)
		AND (inpt_qty = OLD.inpt_qty OR inpt_qty IS NULL AND OLD.inpt_qty IS NULL)
		AND (fxd_rqmt_qty = OLD.fxd_rqmt_qty OR fxd_rqmt_qty IS NULL AND OLD.fxd_rqmt_qty IS NULL)
		AND alt_itm_flg = OLD.alt_itm_flg
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (alt_grp_seq = OLD.alt_grp_seq OR alt_grp_seq IS NULL AND OLD.alt_grp_seq IS NULL)
		AND (alt_itm_typ = OLD.alt_itm_typ OR alt_itm_typ IS NULL AND OLD.alt_itm_typ IS NULL)
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (alt_alloc_prio = OLD.alt_alloc_prio OR alt_alloc_prio IS NULL AND OLD.alt_alloc_prio IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno_typ1 = OLD.sno_typ1 OR sno_typ1 IS NULL AND OLD.sno_typ1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno_typ2 = OLD.sno_typ2 OR sno_typ2 IS NULL AND OLD.sno_typ2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno_typ3 = OLD.sno_typ3 OR sno_typ3 IS NULL AND OLD.sno_typ3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (sno_typ4 = OLD.sno_typ4 OR sno_typ4 IS NULL AND OLD.sno_typ4 IS NULL)
		AND (par_inst_qty = OLD.par_inst_qty OR par_inst_qty IS NULL AND OLD.par_inst_qty IS NULL)
		AND (chd_rqmt_qty = OLD.chd_rqmt_qty OR chd_rqmt_qty IS NULL AND OLD.chd_rqmt_qty IS NULL)
		AND (chd_inpt_qty = OLD.chd_inpt_qty OR chd_inpt_qty IS NULL AND OLD.chd_inpt_qty IS NULL)
		AND (fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty OR fxd_chd_rqmt_qty IS NULL AND OLD.fxd_chd_rqmt_qty IS NULL)
		AND (chd_rqmt_ratio = OLD.chd_rqmt_ratio OR chd_rqmt_ratio IS NULL AND OLD.chd_rqmt_ratio IS NULL)
		AND (chd_inpt_ratio = OLD.chd_inpt_ratio OR chd_inpt_ratio IS NULL AND OLD.chd_inpt_ratio IS NULL)
		AND byprod_flg = OLD.byprod_flg
		AND (in_offst_typ = OLD.in_offst_typ OR in_offst_typ IS NULL AND OLD.in_offst_typ IS NULL)
		AND (in_offst = OLD.in_offst OR in_offst IS NULL AND OLD.in_offst IS NULL)
		AND (bkf_typ = OLD.bkf_typ OR bkf_typ IS NULL AND OLD.bkf_typ IS NULL)
		AND inst_lot_fix_flg = OLD.inst_lot_fix_flg
		AND lot_mix_flg = OLD.lot_mix_flg
		AND sublot_mix_flg = OLD.sublot_mix_flg
		AND (alloc_ctl_typ = OLD.alloc_ctl_typ OR alloc_ctl_typ IS NULL AND OLD.alloc_ctl_typ IS NULL)
		AND main_itm_flg = OLD.main_itm_flg
		AND yield_calc_flg = OLD.yield_calc_flg
		AND (inpt_ctl_typ = OLD.inpt_ctl_typ OR inpt_ctl_typ IS NULL AND OLD.inpt_ctl_typ IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (memo1 = OLD.memo1 OR memo1 IS NULL AND OLD.memo1 IS NULL)
		AND (memo2 = OLD.memo2 OR memo2 IS NULL AND OLD.memo2 IS NULL)
		AND (memo3 = OLD.memo3 OR memo3 IS NULL AND OLD.memo3 IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_bom_exp_rslt$temp
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (bom_key = OLD.bom_key OR bom_key IS NULL AND OLD.bom_key IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (rqmt_qty = OLD.rqmt_qty OR rqmt_qty IS NULL AND OLD.rqmt_qty IS NULL)
		AND (loss_rqmt_qty = OLD.loss_rqmt_qty OR loss_rqmt_qty IS NULL AND OLD.loss_rqmt_qty IS NULL)
		AND (inpt_qty = OLD.inpt_qty OR inpt_qty IS NULL AND OLD.inpt_qty IS NULL)
		AND (fxd_rqmt_qty = OLD.fxd_rqmt_qty OR fxd_rqmt_qty IS NULL AND OLD.fxd_rqmt_qty IS NULL)
		AND alt_itm_flg = OLD.alt_itm_flg
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (alt_grp_seq = OLD.alt_grp_seq OR alt_grp_seq IS NULL AND OLD.alt_grp_seq IS NULL)
		AND (alt_itm_typ = OLD.alt_itm_typ OR alt_itm_typ IS NULL AND OLD.alt_itm_typ IS NULL)
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (alt_alloc_prio = OLD.alt_alloc_prio OR alt_alloc_prio IS NULL AND OLD.alt_alloc_prio IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno_typ1 = OLD.sno_typ1 OR sno_typ1 IS NULL AND OLD.sno_typ1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno_typ2 = OLD.sno_typ2 OR sno_typ2 IS NULL AND OLD.sno_typ2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno_typ3 = OLD.sno_typ3 OR sno_typ3 IS NULL AND OLD.sno_typ3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (sno_typ4 = OLD.sno_typ4 OR sno_typ4 IS NULL AND OLD.sno_typ4 IS NULL)
		AND (par_inst_qty = OLD.par_inst_qty OR par_inst_qty IS NULL AND OLD.par_inst_qty IS NULL)
		AND (chd_rqmt_qty = OLD.chd_rqmt_qty OR chd_rqmt_qty IS NULL AND OLD.chd_rqmt_qty IS NULL)
		AND (chd_inpt_qty = OLD.chd_inpt_qty OR chd_inpt_qty IS NULL AND OLD.chd_inpt_qty IS NULL)
		AND (fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty OR fxd_chd_rqmt_qty IS NULL AND OLD.fxd_chd_rqmt_qty IS NULL)
		AND (chd_rqmt_ratio = OLD.chd_rqmt_ratio OR chd_rqmt_ratio IS NULL AND OLD.chd_rqmt_ratio IS NULL)
		AND (chd_inpt_ratio = OLD.chd_inpt_ratio OR chd_inpt_ratio IS NULL AND OLD.chd_inpt_ratio IS NULL)
		AND byprod_flg = OLD.byprod_flg
		AND (in_offst_typ = OLD.in_offst_typ OR in_offst_typ IS NULL AND OLD.in_offst_typ IS NULL)
		AND (in_offst = OLD.in_offst OR in_offst IS NULL AND OLD.in_offst IS NULL)
		AND (bkf_typ = OLD.bkf_typ OR bkf_typ IS NULL AND OLD.bkf_typ IS NULL)
		AND inst_lot_fix_flg = OLD.inst_lot_fix_flg
		AND lot_mix_flg = OLD.lot_mix_flg
		AND sublot_mix_flg = OLD.sublot_mix_flg
		AND (alloc_ctl_typ = OLD.alloc_ctl_typ OR alloc_ctl_typ IS NULL AND OLD.alloc_ctl_typ IS NULL)
		AND main_itm_flg = OLD.main_itm_flg
		AND yield_calc_flg = OLD.yield_calc_flg
		AND (inpt_ctl_typ = OLD.inpt_ctl_typ OR inpt_ctl_typ IS NULL AND OLD.inpt_ctl_typ IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (memo1 = OLD.memo1 OR memo1 IS NULL AND OLD.memo1 IS NULL)
		AND (memo2 = OLD.memo2 OR memo2 IS NULL AND OLD.memo2 IS NULL)
		AND (memo3 = OLD.memo3 OR memo3 IS NULL AND OLD.memo3 IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_bom_exp_rslt$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_bom_exp_rslt
FOR EACH ROW
EXECUTE PROCEDURE msw_bom_exp_rslt$func();
;

