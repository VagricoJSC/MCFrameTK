\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_itm_order()
RETURNS TABLE (
	peg_no numeric,
	itm_ord_no varchar,
	itm_ord_typ varchar,
	ord_gnrt_typ varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	ver_no varchar,
	strg_loc_cd varchar,
	mfg_loc_cd varchar,
	mst_mfg_loc_cd varchar,
	sppl_cd varchar,
	maker_cd varchar,
	rqst_loc_cd varchar,
	rqst_wg_cd varchar,
	bom_ptn varchar,
	oper_ptn varchar,
	inst_qty numeric,
	yield_schd_qty numeric,
	not_inst_qty numeric,
	mfg_inst_unit_typ varchar,
	inst_yield_schd_qty numeric,
	yield_act_qty numeric,
	purc_act_qty numeric,
	insp_act_qty numeric,
	nmr_qty numeric,
	dnm_qty numeric,
	fxd_yield_qty numeric,
	itm_ord_sts_typ varchar,
	fix_dt timestamp(0),
	blk_flg char,
	po_schd_dt timestamp(0),
	mrp_po_schd_dt timestamp(0),
	po_dt timestamp(0),
	purc_lt numeric,
	mfg_st_schd_dt timestamp(0),
	mrp_mfg_st_schd_dt timestamp(0),
	inst_mfg_st_schd_dt timestamp(0),
	mfg_st_act_dt timestamp(0),
	mfg_end_schd_dt timestamp(0),
	mrp_mfg_end_schd_dt timestamp(0),
	inst_mfg_end_schd_dt timestamp(0),
	mfg_end_act_dt timestamp(0),
	mfg_lt numeric,
	gi_schd_dt timestamp(0),
	mrp_gi_schd_dt timestamp(0),
	inst_gi_schd_dt timestamp(0),
	gi_act_dt timestamp(0),
	strg_schd_dt timestamp(0),
	mrp_strg_schd_dt timestamp(0),
	inst_strg_schd_dt timestamp(0),
	strg_act_dt timestamp(0),
	xfr_lt numeric,
	accpt_schd_dt timestamp(0),
	mrp_accpt_schd_dt timestamp(0),
	inst_accpt_schd_dt timestamp(0),
	accpt_act_dt timestamp(0),
	accpt_insp_lt numeric,
	insp_st_schd_dt timestamp(0),
	mrp_insp_st_schd_dt timestamp(0),
	inst_insp_st_schd_dt timestamp(0),
	insp_st_act_dt timestamp(0),
	insp_end_schd_dt timestamp(0),
	mrp_insp_end_schd_dt timestamp(0),
	inst_insp_end_schd_dt timestamp(0),
	insp_end_act_dt timestamp(0),
	insp_lt numeric,
	insp_offst numeric,
	mrp_avl_schd_dt timestamp(0),
	avl_schd_dt timestamp(0),
	master_dt timestamp(0),
	sno1 varchar,
	sno_typ1 varchar,
	sno2 varchar,
	sno_typ2 varchar,
	sno3 varchar,
	sno_typ3 varchar,
	sno4 varchar,
	sno_typ4 varchar,
	lmt_dt timestamp(0),
	wg_cd varchar,
	not_fix_flg char,
	ord_fix_pd numeric,
	rqmt_no varchar,
	inst_po_cnt_rmrks varchar,
	intr_rmrks varchar,
	sub_char1 varchar,
	sub_char2 varchar,
	sub_char3 varchar,
	dec_place numeric,
	lg_grp_cd varchar,
	dlv_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_itm_order$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_itm_order$temp(
				peg_no numeric (9,0) NULL,
				itm_ord_no varchar (15) NULL,
				itm_ord_typ varchar (1) NULL,
				ord_gnrt_typ varchar (1) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				strg_loc_cd varchar (20) NULL,
				mfg_loc_cd varchar (20) NULL,
				mst_mfg_loc_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				maker_cd varchar (20) NULL,
				rqst_loc_cd varchar (20) NULL,
				rqst_wg_cd varchar (10) NULL,
				bom_ptn varchar (40) NULL,
				oper_ptn varchar (40) NULL,
				inst_qty numeric (21,8) NULL,
				yield_schd_qty numeric (21,8) NULL,
				not_inst_qty numeric (21,8) NULL,
				mfg_inst_unit_typ varchar (1) NULL,
				inst_yield_schd_qty numeric (21,8) NULL,
				yield_act_qty numeric (21,8) NULL,
				purc_act_qty numeric (21,8) NULL,
				insp_act_qty numeric (21,8) NULL,
				nmr_qty numeric (21,8) NULL,
				dnm_qty numeric (21,8) NULL,
				fxd_yield_qty numeric (21,8) NULL,
				itm_ord_sts_typ varchar (1) NULL,
				fix_dt timestamp(0)  NULL,
				blk_flg char (1) DEFAULT '0' NOT NULL,
				po_schd_dt timestamp(0)  NULL,
				mrp_po_schd_dt timestamp(0)  NULL,
				po_dt timestamp(0)  NULL,
				purc_lt numeric (9,0) NULL,
				mfg_st_schd_dt timestamp(0)  NULL,
				mrp_mfg_st_schd_dt timestamp(0)  NULL,
				inst_mfg_st_schd_dt timestamp(0)  NULL,
				mfg_st_act_dt timestamp(0)  NULL,
				mfg_end_schd_dt timestamp(0)  NULL,
				mrp_mfg_end_schd_dt timestamp(0)  NULL,
				inst_mfg_end_schd_dt timestamp(0)  NULL,
				mfg_end_act_dt timestamp(0)  NULL,
				mfg_lt numeric (9,0) NULL,
				gi_schd_dt timestamp(0)  NULL,
				mrp_gi_schd_dt timestamp(0)  NULL,
				inst_gi_schd_dt timestamp(0)  NULL,
				gi_act_dt timestamp(0)  NULL,
				strg_schd_dt timestamp(0)  NULL,
				mrp_strg_schd_dt timestamp(0)  NULL,
				inst_strg_schd_dt timestamp(0)  NULL,
				strg_act_dt timestamp(0)  NULL,
				xfr_lt numeric (9,0) NULL,
				accpt_schd_dt timestamp(0)  NULL,
				mrp_accpt_schd_dt timestamp(0)  NULL,
				inst_accpt_schd_dt timestamp(0)  NULL,
				accpt_act_dt timestamp(0)  NULL,
				accpt_insp_lt numeric (9,0) NULL,
				insp_st_schd_dt timestamp(0)  NULL,
				mrp_insp_st_schd_dt timestamp(0)  NULL,
				inst_insp_st_schd_dt timestamp(0)  NULL,
				insp_st_act_dt timestamp(0)  NULL,
				insp_end_schd_dt timestamp(0)  NULL,
				mrp_insp_end_schd_dt timestamp(0)  NULL,
				inst_insp_end_schd_dt timestamp(0)  NULL,
				insp_end_act_dt timestamp(0)  NULL,
				insp_lt numeric (9,0) NULL,
				insp_offst numeric (9,0) NULL,
				mrp_avl_schd_dt timestamp(0)  NULL,
				avl_schd_dt timestamp(0)  NULL,
				master_dt timestamp(0)  NULL,
				sno1 varchar (15) NULL,
				sno_typ1 varchar (1) NULL,
				sno2 varchar (15) NULL,
				sno_typ2 varchar (1) NULL,
				sno3 varchar (15) NULL,
				sno_typ3 varchar (1) NULL,
				sno4 varchar (15) NULL,
				sno_typ4 varchar (1) NULL,
				lmt_dt timestamp(0)  NULL,
				wg_cd varchar (10) NULL,
				not_fix_flg char (1) DEFAULT '0' NOT NULL,
				ord_fix_pd numeric (3,0) NULL,
				rqmt_no varchar (15) NULL,
				inst_po_cnt_rmrks varchar (100) NULL,
				intr_rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL,
				dec_place numeric (3,0) NULL,
				lg_grp_cd varchar (10) NULL,
				dlv_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_itm_order$temp
				ADD CONSTRAINT msw_itm_order_ck01 CHECK (blk_flg IN ('0', '1'));
			ALTER TABLE msw_itm_order$temp
				ADD CONSTRAINT msw_itm_order_ck02 CHECK (not_fix_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_itm_order$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_itm_order$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_itm_order
AS
SELECT *
FROM msw_itm_order();
ALTER VIEW msw_itm_order ALTER COLUMN blk_flg SET DEFAULT '0';
ALTER VIEW msw_itm_order ALTER COLUMN not_fix_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_itm_order$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_itm_order$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_itm_order$temp(
				peg_no numeric (9,0) NULL,
				itm_ord_no varchar (15) NULL,
				itm_ord_typ varchar (1) NULL,
				ord_gnrt_typ varchar (1) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				strg_loc_cd varchar (20) NULL,
				mfg_loc_cd varchar (20) NULL,
				mst_mfg_loc_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				maker_cd varchar (20) NULL,
				rqst_loc_cd varchar (20) NULL,
				rqst_wg_cd varchar (10) NULL,
				bom_ptn varchar (40) NULL,
				oper_ptn varchar (40) NULL,
				inst_qty numeric (21,8) NULL,
				yield_schd_qty numeric (21,8) NULL,
				not_inst_qty numeric (21,8) NULL,
				mfg_inst_unit_typ varchar (1) NULL,
				inst_yield_schd_qty numeric (21,8) NULL,
				yield_act_qty numeric (21,8) NULL,
				purc_act_qty numeric (21,8) NULL,
				insp_act_qty numeric (21,8) NULL,
				nmr_qty numeric (21,8) NULL,
				dnm_qty numeric (21,8) NULL,
				fxd_yield_qty numeric (21,8) NULL,
				itm_ord_sts_typ varchar (1) NULL,
				fix_dt timestamp(0)  NULL,
				blk_flg char (1) DEFAULT '0' NOT NULL,
				po_schd_dt timestamp(0)  NULL,
				mrp_po_schd_dt timestamp(0)  NULL,
				po_dt timestamp(0)  NULL,
				purc_lt numeric (9,0) NULL,
				mfg_st_schd_dt timestamp(0)  NULL,
				mrp_mfg_st_schd_dt timestamp(0)  NULL,
				inst_mfg_st_schd_dt timestamp(0)  NULL,
				mfg_st_act_dt timestamp(0)  NULL,
				mfg_end_schd_dt timestamp(0)  NULL,
				mrp_mfg_end_schd_dt timestamp(0)  NULL,
				inst_mfg_end_schd_dt timestamp(0)  NULL,
				mfg_end_act_dt timestamp(0)  NULL,
				mfg_lt numeric (9,0) NULL,
				gi_schd_dt timestamp(0)  NULL,
				mrp_gi_schd_dt timestamp(0)  NULL,
				inst_gi_schd_dt timestamp(0)  NULL,
				gi_act_dt timestamp(0)  NULL,
				strg_schd_dt timestamp(0)  NULL,
				mrp_strg_schd_dt timestamp(0)  NULL,
				inst_strg_schd_dt timestamp(0)  NULL,
				strg_act_dt timestamp(0)  NULL,
				xfr_lt numeric (9,0) NULL,
				accpt_schd_dt timestamp(0)  NULL,
				mrp_accpt_schd_dt timestamp(0)  NULL,
				inst_accpt_schd_dt timestamp(0)  NULL,
				accpt_act_dt timestamp(0)  NULL,
				accpt_insp_lt numeric (9,0) NULL,
				insp_st_schd_dt timestamp(0)  NULL,
				mrp_insp_st_schd_dt timestamp(0)  NULL,
				inst_insp_st_schd_dt timestamp(0)  NULL,
				insp_st_act_dt timestamp(0)  NULL,
				insp_end_schd_dt timestamp(0)  NULL,
				mrp_insp_end_schd_dt timestamp(0)  NULL,
				inst_insp_end_schd_dt timestamp(0)  NULL,
				insp_end_act_dt timestamp(0)  NULL,
				insp_lt numeric (9,0) NULL,
				insp_offst numeric (9,0) NULL,
				mrp_avl_schd_dt timestamp(0)  NULL,
				avl_schd_dt timestamp(0)  NULL,
				master_dt timestamp(0)  NULL,
				sno1 varchar (15) NULL,
				sno_typ1 varchar (1) NULL,
				sno2 varchar (15) NULL,
				sno_typ2 varchar (1) NULL,
				sno3 varchar (15) NULL,
				sno_typ3 varchar (1) NULL,
				sno4 varchar (15) NULL,
				sno_typ4 varchar (1) NULL,
				lmt_dt timestamp(0)  NULL,
				wg_cd varchar (10) NULL,
				not_fix_flg char (1) DEFAULT '0' NOT NULL,
				ord_fix_pd numeric (3,0) NULL,
				rqmt_no varchar (15) NULL,
				inst_po_cnt_rmrks varchar (100) NULL,
				intr_rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL,
				dec_place numeric (3,0) NULL,
				lg_grp_cd varchar (10) NULL,
				dlv_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_itm_order$temp
			ADD CONSTRAINT msw_itm_order_ck01 CHECK (blk_flg IN ('0', '1'));
			ALTER TABLE msw_itm_order$temp
			ADD CONSTRAINT msw_itm_order_ck02 CHECK (not_fix_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_itm_order$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_itm_order$temp(
			peg_no,
			itm_ord_no,
			itm_ord_typ,
			ord_gnrt_typ,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			ver_no,
			strg_loc_cd,
			mfg_loc_cd,
			mst_mfg_loc_cd,
			sppl_cd,
			maker_cd,
			rqst_loc_cd,
			rqst_wg_cd,
			bom_ptn,
			oper_ptn,
			inst_qty,
			yield_schd_qty,
			not_inst_qty,
			mfg_inst_unit_typ,
			inst_yield_schd_qty,
			yield_act_qty,
			purc_act_qty,
			insp_act_qty,
			nmr_qty,
			dnm_qty,
			fxd_yield_qty,
			itm_ord_sts_typ,
			fix_dt,
			blk_flg,
			po_schd_dt,
			mrp_po_schd_dt,
			po_dt,
			purc_lt,
			mfg_st_schd_dt,
			mrp_mfg_st_schd_dt,
			inst_mfg_st_schd_dt,
			mfg_st_act_dt,
			mfg_end_schd_dt,
			mrp_mfg_end_schd_dt,
			inst_mfg_end_schd_dt,
			mfg_end_act_dt,
			mfg_lt,
			gi_schd_dt,
			mrp_gi_schd_dt,
			inst_gi_schd_dt,
			gi_act_dt,
			strg_schd_dt,
			mrp_strg_schd_dt,
			inst_strg_schd_dt,
			strg_act_dt,
			xfr_lt,
			accpt_schd_dt,
			mrp_accpt_schd_dt,
			inst_accpt_schd_dt,
			accpt_act_dt,
			accpt_insp_lt,
			insp_st_schd_dt,
			mrp_insp_st_schd_dt,
			inst_insp_st_schd_dt,
			insp_st_act_dt,
			insp_end_schd_dt,
			mrp_insp_end_schd_dt,
			inst_insp_end_schd_dt,
			insp_end_act_dt,
			insp_lt,
			insp_offst,
			mrp_avl_schd_dt,
			avl_schd_dt,
			master_dt,
			sno1,
			sno_typ1,
			sno2,
			sno_typ2,
			sno3,
			sno_typ3,
			sno4,
			sno_typ4,
			lmt_dt,
			wg_cd,
			not_fix_flg,
			ord_fix_pd,
			rqmt_no,
			inst_po_cnt_rmrks,
			intr_rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			dec_place,
			lg_grp_cd,
			dlv_cd
		)VALUES (
			NEW.peg_no,
			NEW.itm_ord_no,
			NEW.itm_ord_typ,
			NEW.ord_gnrt_typ,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.ver_no,
			NEW.strg_loc_cd,
			NEW.mfg_loc_cd,
			NEW.mst_mfg_loc_cd,
			NEW.sppl_cd,
			NEW.maker_cd,
			NEW.rqst_loc_cd,
			NEW.rqst_wg_cd,
			NEW.bom_ptn,
			NEW.oper_ptn,
			NEW.inst_qty,
			NEW.yield_schd_qty,
			NEW.not_inst_qty,
			NEW.mfg_inst_unit_typ,
			NEW.inst_yield_schd_qty,
			NEW.yield_act_qty,
			NEW.purc_act_qty,
			NEW.insp_act_qty,
			NEW.nmr_qty,
			NEW.dnm_qty,
			NEW.fxd_yield_qty,
			NEW.itm_ord_sts_typ,
			NEW.fix_dt,
			NEW.blk_flg,
			NEW.po_schd_dt,
			NEW.mrp_po_schd_dt,
			NEW.po_dt,
			NEW.purc_lt,
			NEW.mfg_st_schd_dt,
			NEW.mrp_mfg_st_schd_dt,
			NEW.inst_mfg_st_schd_dt,
			NEW.mfg_st_act_dt,
			NEW.mfg_end_schd_dt,
			NEW.mrp_mfg_end_schd_dt,
			NEW.inst_mfg_end_schd_dt,
			NEW.mfg_end_act_dt,
			NEW.mfg_lt,
			NEW.gi_schd_dt,
			NEW.mrp_gi_schd_dt,
			NEW.inst_gi_schd_dt,
			NEW.gi_act_dt,
			NEW.strg_schd_dt,
			NEW.mrp_strg_schd_dt,
			NEW.inst_strg_schd_dt,
			NEW.strg_act_dt,
			NEW.xfr_lt,
			NEW.accpt_schd_dt,
			NEW.mrp_accpt_schd_dt,
			NEW.inst_accpt_schd_dt,
			NEW.accpt_act_dt,
			NEW.accpt_insp_lt,
			NEW.insp_st_schd_dt,
			NEW.mrp_insp_st_schd_dt,
			NEW.inst_insp_st_schd_dt,
			NEW.insp_st_act_dt,
			NEW.insp_end_schd_dt,
			NEW.mrp_insp_end_schd_dt,
			NEW.inst_insp_end_schd_dt,
			NEW.insp_end_act_dt,
			NEW.insp_lt,
			NEW.insp_offst,
			NEW.mrp_avl_schd_dt,
			NEW.avl_schd_dt,
			NEW.master_dt,
			NEW.sno1,
			NEW.sno_typ1,
			NEW.sno2,
			NEW.sno_typ2,
			NEW.sno3,
			NEW.sno_typ3,
			NEW.sno4,
			NEW.sno_typ4,
			NEW.lmt_dt,
			NEW.wg_cd,
			NEW.not_fix_flg,
			NEW.ord_fix_pd,
			NEW.rqmt_no,
			NEW.inst_po_cnt_rmrks,
			NEW.intr_rmrks,
			NEW.sub_char1,
			NEW.sub_char2,
			NEW.sub_char3,
			NEW.dec_place,
			NEW.lg_grp_cd,
			NEW.dlv_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_itm_order$temp
		SET 
			peg_no = NEW.peg_no,
			itm_ord_no = NEW.itm_ord_no,
			itm_ord_typ = NEW.itm_ord_typ,
			ord_gnrt_typ = NEW.ord_gnrt_typ,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			ver_no = NEW.ver_no,
			strg_loc_cd = NEW.strg_loc_cd,
			mfg_loc_cd = NEW.mfg_loc_cd,
			mst_mfg_loc_cd = NEW.mst_mfg_loc_cd,
			sppl_cd = NEW.sppl_cd,
			maker_cd = NEW.maker_cd,
			rqst_loc_cd = NEW.rqst_loc_cd,
			rqst_wg_cd = NEW.rqst_wg_cd,
			bom_ptn = NEW.bom_ptn,
			oper_ptn = NEW.oper_ptn,
			inst_qty = NEW.inst_qty,
			yield_schd_qty = NEW.yield_schd_qty,
			not_inst_qty = NEW.not_inst_qty,
			mfg_inst_unit_typ = NEW.mfg_inst_unit_typ,
			inst_yield_schd_qty = NEW.inst_yield_schd_qty,
			yield_act_qty = NEW.yield_act_qty,
			purc_act_qty = NEW.purc_act_qty,
			insp_act_qty = NEW.insp_act_qty,
			nmr_qty = NEW.nmr_qty,
			dnm_qty = NEW.dnm_qty,
			fxd_yield_qty = NEW.fxd_yield_qty,
			itm_ord_sts_typ = NEW.itm_ord_sts_typ,
			fix_dt = NEW.fix_dt,
			blk_flg = NEW.blk_flg,
			po_schd_dt = NEW.po_schd_dt,
			mrp_po_schd_dt = NEW.mrp_po_schd_dt,
			po_dt = NEW.po_dt,
			purc_lt = NEW.purc_lt,
			mfg_st_schd_dt = NEW.mfg_st_schd_dt,
			mrp_mfg_st_schd_dt = NEW.mrp_mfg_st_schd_dt,
			inst_mfg_st_schd_dt = NEW.inst_mfg_st_schd_dt,
			mfg_st_act_dt = NEW.mfg_st_act_dt,
			mfg_end_schd_dt = NEW.mfg_end_schd_dt,
			mrp_mfg_end_schd_dt = NEW.mrp_mfg_end_schd_dt,
			inst_mfg_end_schd_dt = NEW.inst_mfg_end_schd_dt,
			mfg_end_act_dt = NEW.mfg_end_act_dt,
			mfg_lt = NEW.mfg_lt,
			gi_schd_dt = NEW.gi_schd_dt,
			mrp_gi_schd_dt = NEW.mrp_gi_schd_dt,
			inst_gi_schd_dt = NEW.inst_gi_schd_dt,
			gi_act_dt = NEW.gi_act_dt,
			strg_schd_dt = NEW.strg_schd_dt,
			mrp_strg_schd_dt = NEW.mrp_strg_schd_dt,
			inst_strg_schd_dt = NEW.inst_strg_schd_dt,
			strg_act_dt = NEW.strg_act_dt,
			xfr_lt = NEW.xfr_lt,
			accpt_schd_dt = NEW.accpt_schd_dt,
			mrp_accpt_schd_dt = NEW.mrp_accpt_schd_dt,
			inst_accpt_schd_dt = NEW.inst_accpt_schd_dt,
			accpt_act_dt = NEW.accpt_act_dt,
			accpt_insp_lt = NEW.accpt_insp_lt,
			insp_st_schd_dt = NEW.insp_st_schd_dt,
			mrp_insp_st_schd_dt = NEW.mrp_insp_st_schd_dt,
			inst_insp_st_schd_dt = NEW.inst_insp_st_schd_dt,
			insp_st_act_dt = NEW.insp_st_act_dt,
			insp_end_schd_dt = NEW.insp_end_schd_dt,
			mrp_insp_end_schd_dt = NEW.mrp_insp_end_schd_dt,
			inst_insp_end_schd_dt = NEW.inst_insp_end_schd_dt,
			insp_end_act_dt = NEW.insp_end_act_dt,
			insp_lt = NEW.insp_lt,
			insp_offst = NEW.insp_offst,
			mrp_avl_schd_dt = NEW.mrp_avl_schd_dt,
			avl_schd_dt = NEW.avl_schd_dt,
			master_dt = NEW.master_dt,
			sno1 = NEW.sno1,
			sno_typ1 = NEW.sno_typ1,
			sno2 = NEW.sno2,
			sno_typ2 = NEW.sno_typ2,
			sno3 = NEW.sno3,
			sno_typ3 = NEW.sno_typ3,
			sno4 = NEW.sno4,
			sno_typ4 = NEW.sno_typ4,
			lmt_dt = NEW.lmt_dt,
			wg_cd = NEW.wg_cd,
			not_fix_flg = NEW.not_fix_flg,
			ord_fix_pd = NEW.ord_fix_pd,
			rqmt_no = NEW.rqmt_no,
			inst_po_cnt_rmrks = NEW.inst_po_cnt_rmrks,
			intr_rmrks = NEW.intr_rmrks,
			sub_char1 = NEW.sub_char1,
			sub_char2 = NEW.sub_char2,
			sub_char3 = NEW.sub_char3,
			dec_place = NEW.dec_place,
			lg_grp_cd = NEW.lg_grp_cd,
			dlv_cd = NEW.dlv_cd
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (itm_ord_typ = OLD.itm_ord_typ OR itm_ord_typ IS NULL AND OLD.itm_ord_typ IS NULL)
		AND (ord_gnrt_typ = OLD.ord_gnrt_typ OR ord_gnrt_typ IS NULL AND OLD.ord_gnrt_typ IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (strg_loc_cd = OLD.strg_loc_cd OR strg_loc_cd IS NULL AND OLD.strg_loc_cd IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (mst_mfg_loc_cd = OLD.mst_mfg_loc_cd OR mst_mfg_loc_cd IS NULL AND OLD.mst_mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (rqst_loc_cd = OLD.rqst_loc_cd OR rqst_loc_cd IS NULL AND OLD.rqst_loc_cd IS NULL)
		AND (rqst_wg_cd = OLD.rqst_wg_cd OR rqst_wg_cd IS NULL AND OLD.rqst_wg_cd IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (inst_qty = OLD.inst_qty OR inst_qty IS NULL AND OLD.inst_qty IS NULL)
		AND (yield_schd_qty = OLD.yield_schd_qty OR yield_schd_qty IS NULL AND OLD.yield_schd_qty IS NULL)
		AND (not_inst_qty = OLD.not_inst_qty OR not_inst_qty IS NULL AND OLD.not_inst_qty IS NULL)
		AND (mfg_inst_unit_typ = OLD.mfg_inst_unit_typ OR mfg_inst_unit_typ IS NULL AND OLD.mfg_inst_unit_typ IS NULL)
		AND (inst_yield_schd_qty = OLD.inst_yield_schd_qty OR inst_yield_schd_qty IS NULL AND OLD.inst_yield_schd_qty IS NULL)
		AND (yield_act_qty = OLD.yield_act_qty OR yield_act_qty IS NULL AND OLD.yield_act_qty IS NULL)
		AND (purc_act_qty = OLD.purc_act_qty OR purc_act_qty IS NULL AND OLD.purc_act_qty IS NULL)
		AND (insp_act_qty = OLD.insp_act_qty OR insp_act_qty IS NULL AND OLD.insp_act_qty IS NULL)
		AND (nmr_qty = OLD.nmr_qty OR nmr_qty IS NULL AND OLD.nmr_qty IS NULL)
		AND (dnm_qty = OLD.dnm_qty OR dnm_qty IS NULL AND OLD.dnm_qty IS NULL)
		AND (fxd_yield_qty = OLD.fxd_yield_qty OR fxd_yield_qty IS NULL AND OLD.fxd_yield_qty IS NULL)
		AND (itm_ord_sts_typ = OLD.itm_ord_sts_typ OR itm_ord_sts_typ IS NULL AND OLD.itm_ord_sts_typ IS NULL)
		AND (fix_dt = OLD.fix_dt OR fix_dt IS NULL AND OLD.fix_dt IS NULL)
		AND blk_flg = OLD.blk_flg
		AND (po_schd_dt = OLD.po_schd_dt OR po_schd_dt IS NULL AND OLD.po_schd_dt IS NULL)
		AND (mrp_po_schd_dt = OLD.mrp_po_schd_dt OR mrp_po_schd_dt IS NULL AND OLD.mrp_po_schd_dt IS NULL)
		AND (po_dt = OLD.po_dt OR po_dt IS NULL AND OLD.po_dt IS NULL)
		AND (purc_lt = OLD.purc_lt OR purc_lt IS NULL AND OLD.purc_lt IS NULL)
		AND (mfg_st_schd_dt = OLD.mfg_st_schd_dt OR mfg_st_schd_dt IS NULL AND OLD.mfg_st_schd_dt IS NULL)
		AND (mrp_mfg_st_schd_dt = OLD.mrp_mfg_st_schd_dt OR mrp_mfg_st_schd_dt IS NULL AND OLD.mrp_mfg_st_schd_dt IS NULL)
		AND (inst_mfg_st_schd_dt = OLD.inst_mfg_st_schd_dt OR inst_mfg_st_schd_dt IS NULL AND OLD.inst_mfg_st_schd_dt IS NULL)
		AND (mfg_st_act_dt = OLD.mfg_st_act_dt OR mfg_st_act_dt IS NULL AND OLD.mfg_st_act_dt IS NULL)
		AND (mfg_end_schd_dt = OLD.mfg_end_schd_dt OR mfg_end_schd_dt IS NULL AND OLD.mfg_end_schd_dt IS NULL)
		AND (mrp_mfg_end_schd_dt = OLD.mrp_mfg_end_schd_dt OR mrp_mfg_end_schd_dt IS NULL AND OLD.mrp_mfg_end_schd_dt IS NULL)
		AND (inst_mfg_end_schd_dt = OLD.inst_mfg_end_schd_dt OR inst_mfg_end_schd_dt IS NULL AND OLD.inst_mfg_end_schd_dt IS NULL)
		AND (mfg_end_act_dt = OLD.mfg_end_act_dt OR mfg_end_act_dt IS NULL AND OLD.mfg_end_act_dt IS NULL)
		AND (mfg_lt = OLD.mfg_lt OR mfg_lt IS NULL AND OLD.mfg_lt IS NULL)
		AND (gi_schd_dt = OLD.gi_schd_dt OR gi_schd_dt IS NULL AND OLD.gi_schd_dt IS NULL)
		AND (mrp_gi_schd_dt = OLD.mrp_gi_schd_dt OR mrp_gi_schd_dt IS NULL AND OLD.mrp_gi_schd_dt IS NULL)
		AND (inst_gi_schd_dt = OLD.inst_gi_schd_dt OR inst_gi_schd_dt IS NULL AND OLD.inst_gi_schd_dt IS NULL)
		AND (gi_act_dt = OLD.gi_act_dt OR gi_act_dt IS NULL AND OLD.gi_act_dt IS NULL)
		AND (strg_schd_dt = OLD.strg_schd_dt OR strg_schd_dt IS NULL AND OLD.strg_schd_dt IS NULL)
		AND (mrp_strg_schd_dt = OLD.mrp_strg_schd_dt OR mrp_strg_schd_dt IS NULL AND OLD.mrp_strg_schd_dt IS NULL)
		AND (inst_strg_schd_dt = OLD.inst_strg_schd_dt OR inst_strg_schd_dt IS NULL AND OLD.inst_strg_schd_dt IS NULL)
		AND (strg_act_dt = OLD.strg_act_dt OR strg_act_dt IS NULL AND OLD.strg_act_dt IS NULL)
		AND (xfr_lt = OLD.xfr_lt OR xfr_lt IS NULL AND OLD.xfr_lt IS NULL)
		AND (accpt_schd_dt = OLD.accpt_schd_dt OR accpt_schd_dt IS NULL AND OLD.accpt_schd_dt IS NULL)
		AND (mrp_accpt_schd_dt = OLD.mrp_accpt_schd_dt OR mrp_accpt_schd_dt IS NULL AND OLD.mrp_accpt_schd_dt IS NULL)
		AND (inst_accpt_schd_dt = OLD.inst_accpt_schd_dt OR inst_accpt_schd_dt IS NULL AND OLD.inst_accpt_schd_dt IS NULL)
		AND (accpt_act_dt = OLD.accpt_act_dt OR accpt_act_dt IS NULL AND OLD.accpt_act_dt IS NULL)
		AND (accpt_insp_lt = OLD.accpt_insp_lt OR accpt_insp_lt IS NULL AND OLD.accpt_insp_lt IS NULL)
		AND (insp_st_schd_dt = OLD.insp_st_schd_dt OR insp_st_schd_dt IS NULL AND OLD.insp_st_schd_dt IS NULL)
		AND (mrp_insp_st_schd_dt = OLD.mrp_insp_st_schd_dt OR mrp_insp_st_schd_dt IS NULL AND OLD.mrp_insp_st_schd_dt IS NULL)
		AND (inst_insp_st_schd_dt = OLD.inst_insp_st_schd_dt OR inst_insp_st_schd_dt IS NULL AND OLD.inst_insp_st_schd_dt IS NULL)
		AND (insp_st_act_dt = OLD.insp_st_act_dt OR insp_st_act_dt IS NULL AND OLD.insp_st_act_dt IS NULL)
		AND (insp_end_schd_dt = OLD.insp_end_schd_dt OR insp_end_schd_dt IS NULL AND OLD.insp_end_schd_dt IS NULL)
		AND (mrp_insp_end_schd_dt = OLD.mrp_insp_end_schd_dt OR mrp_insp_end_schd_dt IS NULL AND OLD.mrp_insp_end_schd_dt IS NULL)
		AND (inst_insp_end_schd_dt = OLD.inst_insp_end_schd_dt OR inst_insp_end_schd_dt IS NULL AND OLD.inst_insp_end_schd_dt IS NULL)
		AND (insp_end_act_dt = OLD.insp_end_act_dt OR insp_end_act_dt IS NULL AND OLD.insp_end_act_dt IS NULL)
		AND (insp_lt = OLD.insp_lt OR insp_lt IS NULL AND OLD.insp_lt IS NULL)
		AND (insp_offst = OLD.insp_offst OR insp_offst IS NULL AND OLD.insp_offst IS NULL)
		AND (mrp_avl_schd_dt = OLD.mrp_avl_schd_dt OR mrp_avl_schd_dt IS NULL AND OLD.mrp_avl_schd_dt IS NULL)
		AND (avl_schd_dt = OLD.avl_schd_dt OR avl_schd_dt IS NULL AND OLD.avl_schd_dt IS NULL)
		AND (master_dt = OLD.master_dt OR master_dt IS NULL AND OLD.master_dt IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno_typ1 = OLD.sno_typ1 OR sno_typ1 IS NULL AND OLD.sno_typ1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno_typ2 = OLD.sno_typ2 OR sno_typ2 IS NULL AND OLD.sno_typ2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno_typ3 = OLD.sno_typ3 OR sno_typ3 IS NULL AND OLD.sno_typ3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (sno_typ4 = OLD.sno_typ4 OR sno_typ4 IS NULL AND OLD.sno_typ4 IS NULL)
		AND (lmt_dt = OLD.lmt_dt OR lmt_dt IS NULL AND OLD.lmt_dt IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND not_fix_flg = OLD.not_fix_flg
		AND (ord_fix_pd = OLD.ord_fix_pd OR ord_fix_pd IS NULL AND OLD.ord_fix_pd IS NULL)
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL)
		AND (inst_po_cnt_rmrks = OLD.inst_po_cnt_rmrks OR inst_po_cnt_rmrks IS NULL AND OLD.inst_po_cnt_rmrks IS NULL)
		AND (intr_rmrks = OLD.intr_rmrks OR intr_rmrks IS NULL AND OLD.intr_rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL)
		AND (dec_place = OLD.dec_place OR dec_place IS NULL AND OLD.dec_place IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_itm_order$temp
		WHERE 0=0
		AND (peg_no = OLD.peg_no OR peg_no IS NULL AND OLD.peg_no IS NULL)
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (itm_ord_typ = OLD.itm_ord_typ OR itm_ord_typ IS NULL AND OLD.itm_ord_typ IS NULL)
		AND (ord_gnrt_typ = OLD.ord_gnrt_typ OR ord_gnrt_typ IS NULL AND OLD.ord_gnrt_typ IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (strg_loc_cd = OLD.strg_loc_cd OR strg_loc_cd IS NULL AND OLD.strg_loc_cd IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (mst_mfg_loc_cd = OLD.mst_mfg_loc_cd OR mst_mfg_loc_cd IS NULL AND OLD.mst_mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (rqst_loc_cd = OLD.rqst_loc_cd OR rqst_loc_cd IS NULL AND OLD.rqst_loc_cd IS NULL)
		AND (rqst_wg_cd = OLD.rqst_wg_cd OR rqst_wg_cd IS NULL AND OLD.rqst_wg_cd IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (inst_qty = OLD.inst_qty OR inst_qty IS NULL AND OLD.inst_qty IS NULL)
		AND (yield_schd_qty = OLD.yield_schd_qty OR yield_schd_qty IS NULL AND OLD.yield_schd_qty IS NULL)
		AND (not_inst_qty = OLD.not_inst_qty OR not_inst_qty IS NULL AND OLD.not_inst_qty IS NULL)
		AND (mfg_inst_unit_typ = OLD.mfg_inst_unit_typ OR mfg_inst_unit_typ IS NULL AND OLD.mfg_inst_unit_typ IS NULL)
		AND (inst_yield_schd_qty = OLD.inst_yield_schd_qty OR inst_yield_schd_qty IS NULL AND OLD.inst_yield_schd_qty IS NULL)
		AND (yield_act_qty = OLD.yield_act_qty OR yield_act_qty IS NULL AND OLD.yield_act_qty IS NULL)
		AND (purc_act_qty = OLD.purc_act_qty OR purc_act_qty IS NULL AND OLD.purc_act_qty IS NULL)
		AND (insp_act_qty = OLD.insp_act_qty OR insp_act_qty IS NULL AND OLD.insp_act_qty IS NULL)
		AND (nmr_qty = OLD.nmr_qty OR nmr_qty IS NULL AND OLD.nmr_qty IS NULL)
		AND (dnm_qty = OLD.dnm_qty OR dnm_qty IS NULL AND OLD.dnm_qty IS NULL)
		AND (fxd_yield_qty = OLD.fxd_yield_qty OR fxd_yield_qty IS NULL AND OLD.fxd_yield_qty IS NULL)
		AND (itm_ord_sts_typ = OLD.itm_ord_sts_typ OR itm_ord_sts_typ IS NULL AND OLD.itm_ord_sts_typ IS NULL)
		AND (fix_dt = OLD.fix_dt OR fix_dt IS NULL AND OLD.fix_dt IS NULL)
		AND blk_flg = OLD.blk_flg
		AND (po_schd_dt = OLD.po_schd_dt OR po_schd_dt IS NULL AND OLD.po_schd_dt IS NULL)
		AND (mrp_po_schd_dt = OLD.mrp_po_schd_dt OR mrp_po_schd_dt IS NULL AND OLD.mrp_po_schd_dt IS NULL)
		AND (po_dt = OLD.po_dt OR po_dt IS NULL AND OLD.po_dt IS NULL)
		AND (purc_lt = OLD.purc_lt OR purc_lt IS NULL AND OLD.purc_lt IS NULL)
		AND (mfg_st_schd_dt = OLD.mfg_st_schd_dt OR mfg_st_schd_dt IS NULL AND OLD.mfg_st_schd_dt IS NULL)
		AND (mrp_mfg_st_schd_dt = OLD.mrp_mfg_st_schd_dt OR mrp_mfg_st_schd_dt IS NULL AND OLD.mrp_mfg_st_schd_dt IS NULL)
		AND (inst_mfg_st_schd_dt = OLD.inst_mfg_st_schd_dt OR inst_mfg_st_schd_dt IS NULL AND OLD.inst_mfg_st_schd_dt IS NULL)
		AND (mfg_st_act_dt = OLD.mfg_st_act_dt OR mfg_st_act_dt IS NULL AND OLD.mfg_st_act_dt IS NULL)
		AND (mfg_end_schd_dt = OLD.mfg_end_schd_dt OR mfg_end_schd_dt IS NULL AND OLD.mfg_end_schd_dt IS NULL)
		AND (mrp_mfg_end_schd_dt = OLD.mrp_mfg_end_schd_dt OR mrp_mfg_end_schd_dt IS NULL AND OLD.mrp_mfg_end_schd_dt IS NULL)
		AND (inst_mfg_end_schd_dt = OLD.inst_mfg_end_schd_dt OR inst_mfg_end_schd_dt IS NULL AND OLD.inst_mfg_end_schd_dt IS NULL)
		AND (mfg_end_act_dt = OLD.mfg_end_act_dt OR mfg_end_act_dt IS NULL AND OLD.mfg_end_act_dt IS NULL)
		AND (mfg_lt = OLD.mfg_lt OR mfg_lt IS NULL AND OLD.mfg_lt IS NULL)
		AND (gi_schd_dt = OLD.gi_schd_dt OR gi_schd_dt IS NULL AND OLD.gi_schd_dt IS NULL)
		AND (mrp_gi_schd_dt = OLD.mrp_gi_schd_dt OR mrp_gi_schd_dt IS NULL AND OLD.mrp_gi_schd_dt IS NULL)
		AND (inst_gi_schd_dt = OLD.inst_gi_schd_dt OR inst_gi_schd_dt IS NULL AND OLD.inst_gi_schd_dt IS NULL)
		AND (gi_act_dt = OLD.gi_act_dt OR gi_act_dt IS NULL AND OLD.gi_act_dt IS NULL)
		AND (strg_schd_dt = OLD.strg_schd_dt OR strg_schd_dt IS NULL AND OLD.strg_schd_dt IS NULL)
		AND (mrp_strg_schd_dt = OLD.mrp_strg_schd_dt OR mrp_strg_schd_dt IS NULL AND OLD.mrp_strg_schd_dt IS NULL)
		AND (inst_strg_schd_dt = OLD.inst_strg_schd_dt OR inst_strg_schd_dt IS NULL AND OLD.inst_strg_schd_dt IS NULL)
		AND (strg_act_dt = OLD.strg_act_dt OR strg_act_dt IS NULL AND OLD.strg_act_dt IS NULL)
		AND (xfr_lt = OLD.xfr_lt OR xfr_lt IS NULL AND OLD.xfr_lt IS NULL)
		AND (accpt_schd_dt = OLD.accpt_schd_dt OR accpt_schd_dt IS NULL AND OLD.accpt_schd_dt IS NULL)
		AND (mrp_accpt_schd_dt = OLD.mrp_accpt_schd_dt OR mrp_accpt_schd_dt IS NULL AND OLD.mrp_accpt_schd_dt IS NULL)
		AND (inst_accpt_schd_dt = OLD.inst_accpt_schd_dt OR inst_accpt_schd_dt IS NULL AND OLD.inst_accpt_schd_dt IS NULL)
		AND (accpt_act_dt = OLD.accpt_act_dt OR accpt_act_dt IS NULL AND OLD.accpt_act_dt IS NULL)
		AND (accpt_insp_lt = OLD.accpt_insp_lt OR accpt_insp_lt IS NULL AND OLD.accpt_insp_lt IS NULL)
		AND (insp_st_schd_dt = OLD.insp_st_schd_dt OR insp_st_schd_dt IS NULL AND OLD.insp_st_schd_dt IS NULL)
		AND (mrp_insp_st_schd_dt = OLD.mrp_insp_st_schd_dt OR mrp_insp_st_schd_dt IS NULL AND OLD.mrp_insp_st_schd_dt IS NULL)
		AND (inst_insp_st_schd_dt = OLD.inst_insp_st_schd_dt OR inst_insp_st_schd_dt IS NULL AND OLD.inst_insp_st_schd_dt IS NULL)
		AND (insp_st_act_dt = OLD.insp_st_act_dt OR insp_st_act_dt IS NULL AND OLD.insp_st_act_dt IS NULL)
		AND (insp_end_schd_dt = OLD.insp_end_schd_dt OR insp_end_schd_dt IS NULL AND OLD.insp_end_schd_dt IS NULL)
		AND (mrp_insp_end_schd_dt = OLD.mrp_insp_end_schd_dt OR mrp_insp_end_schd_dt IS NULL AND OLD.mrp_insp_end_schd_dt IS NULL)
		AND (inst_insp_end_schd_dt = OLD.inst_insp_end_schd_dt OR inst_insp_end_schd_dt IS NULL AND OLD.inst_insp_end_schd_dt IS NULL)
		AND (insp_end_act_dt = OLD.insp_end_act_dt OR insp_end_act_dt IS NULL AND OLD.insp_end_act_dt IS NULL)
		AND (insp_lt = OLD.insp_lt OR insp_lt IS NULL AND OLD.insp_lt IS NULL)
		AND (insp_offst = OLD.insp_offst OR insp_offst IS NULL AND OLD.insp_offst IS NULL)
		AND (mrp_avl_schd_dt = OLD.mrp_avl_schd_dt OR mrp_avl_schd_dt IS NULL AND OLD.mrp_avl_schd_dt IS NULL)
		AND (avl_schd_dt = OLD.avl_schd_dt OR avl_schd_dt IS NULL AND OLD.avl_schd_dt IS NULL)
		AND (master_dt = OLD.master_dt OR master_dt IS NULL AND OLD.master_dt IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno_typ1 = OLD.sno_typ1 OR sno_typ1 IS NULL AND OLD.sno_typ1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno_typ2 = OLD.sno_typ2 OR sno_typ2 IS NULL AND OLD.sno_typ2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno_typ3 = OLD.sno_typ3 OR sno_typ3 IS NULL AND OLD.sno_typ3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (sno_typ4 = OLD.sno_typ4 OR sno_typ4 IS NULL AND OLD.sno_typ4 IS NULL)
		AND (lmt_dt = OLD.lmt_dt OR lmt_dt IS NULL AND OLD.lmt_dt IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND not_fix_flg = OLD.not_fix_flg
		AND (ord_fix_pd = OLD.ord_fix_pd OR ord_fix_pd IS NULL AND OLD.ord_fix_pd IS NULL)
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL)
		AND (inst_po_cnt_rmrks = OLD.inst_po_cnt_rmrks OR inst_po_cnt_rmrks IS NULL AND OLD.inst_po_cnt_rmrks IS NULL)
		AND (intr_rmrks = OLD.intr_rmrks OR intr_rmrks IS NULL AND OLD.intr_rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL)
		AND (dec_place = OLD.dec_place OR dec_place IS NULL AND OLD.dec_place IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_itm_order$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_itm_order
FOR EACH ROW
EXECUTE PROCEDURE msw_itm_order$func();
;

