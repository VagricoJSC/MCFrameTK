\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mrp_orderz()
RETURNS TABLE (
	data_typ varchar,
	itm_ord_no varchar,
	io_schd_no varchar,
	io_schd_typ varchar,
	io_schd_sts_typ varchar,
	itm_ord_typ varchar,
	itm_ord_sts_typ varchar,
	oper_ord_sts_typ varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	ver_no varchar,
	loc_cd varchar,
	bom_ptn varchar,
	oper_ptn varchar,
	disp_seq numeric,
	alt_grp_cd varchar,
	alt_grp_seq numeric,
	oper_ord_no varchar,
	oper_inst_no varchar,
	alt_itm_typ varchar,
	alt_itm_ratio numeric,
	alt_alloc_prio numeric,
	lot_no varchar,
	sublot_no varchar,
	lot_seq varchar,
	mfg_loc_cd varchar,
	sppl_cd varchar,
	maker_cd varchar,
	rqst_loc_cd varchar,
	rqst_wg_cd varchar,
	qty numeric,
	master_dt timestamp(0),
	po_schd_dt timestamp(0),
	gi_schd_dt timestamp(0),
	mfg_st_schd_dt timestamp(0),
	mfg_end_schd_dt timestamp(0),
	st_schd_tm timestamp(0),
	end_schd_tm timestamp(0),
	strg_schd_dt timestamp(0),
	accpt_schd_dt timestamp(0),
	insp_st_schd_dt timestamp(0),
	insp_end_schd_dt timestamp(0),
	first_gr_dt timestamp(0),
	avl_schd_dt timestamp(0),
	oper_cd varchar,
	oper_seq numeric,
	sno1 varchar,
	sno_typ1 varchar,
	sno2 varchar,
	sno_typ2 varchar,
	sno3 varchar,
	sno_typ3 varchar,
	sno4 varchar,
	sno_typ4 varchar,
	ex_sno1 varchar,
	ex_sno2 varchar,
	ex_sno3 varchar,
	ex_sno4 varchar,
	gd_cd varchar,
	lmt_dt timestamp(0),
	wg_cd varchar,
	rqmt_no varchar,
	inpt_ctl_typ varchar,
	alloc_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mrp_orderz$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mrp_orderz$temp(
				data_typ varchar (1) NOT NULL,
				itm_ord_no varchar (15) NULL,
				io_schd_no varchar (15) NULL,
				io_schd_typ varchar (5) NULL,
				io_schd_sts_typ varchar (2) NULL,
				itm_ord_typ varchar (1) NULL,
				itm_ord_sts_typ varchar (1) NULL,
				oper_ord_sts_typ varchar (1) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				loc_cd varchar (20) NULL,
				bom_ptn varchar (40) NULL,
				oper_ptn varchar (40) NULL,
				disp_seq numeric (9,0) NULL,
				alt_grp_cd varchar (40) NULL,
				alt_grp_seq numeric (9,0) NULL,
				oper_ord_no varchar (15) NULL,
				oper_inst_no varchar (15) NULL,
				alt_itm_typ varchar (1) NULL,
				alt_itm_ratio numeric (9,0) NULL,
				alt_alloc_prio numeric (9,0) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				lot_seq varchar (15) NULL,
				mfg_loc_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				maker_cd varchar (20) NULL,
				rqst_loc_cd varchar (20) NULL,
				rqst_wg_cd varchar (10) NULL,
				qty numeric (21,8) NULL,
				master_dt timestamp(0)  NULL,
				po_schd_dt timestamp(0)  NULL,
				gi_schd_dt timestamp(0)  NULL,
				mfg_st_schd_dt timestamp(0)  NULL,
				mfg_end_schd_dt timestamp(0)  NULL,
				st_schd_tm timestamp(0)  NULL,
				end_schd_tm timestamp(0)  NULL,
				strg_schd_dt timestamp(0)  NULL,
				accpt_schd_dt timestamp(0)  NULL,
				insp_st_schd_dt timestamp(0)  NULL,
				insp_end_schd_dt timestamp(0)  NULL,
				first_gr_dt timestamp(0)  NULL,
				avl_schd_dt timestamp(0)  NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				sno1 varchar (15) NULL,
				sno_typ1 varchar (1) NULL,
				sno2 varchar (15) NULL,
				sno_typ2 varchar (1) NULL,
				sno3 varchar (15) NULL,
				sno_typ3 varchar (1) NULL,
				sno4 varchar (15) NULL,
				sno_typ4 varchar (1) NULL,
				ex_sno1 varchar (15) NULL,
				ex_sno2 varchar (15) NULL,
				ex_sno3 varchar (15) NULL,
				ex_sno4 varchar (15) NULL,
				gd_cd varchar (2) NULL,
				lmt_dt timestamp(0)  NULL,
				wg_cd varchar (10) NULL,
				rqmt_no varchar (15) DEFAULT '0' NULL,
				inpt_ctl_typ varchar (1) NULL,
				alloc_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_mrp_orderz$temp
				ADD CONSTRAINT msw_mrp_orderz_ck01 CHECK (alloc_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mrp_orderz$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mrp_orderz$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mrp_orderz
AS
SELECT *
FROM msw_mrp_orderz();
ALTER VIEW msw_mrp_orderz ALTER COLUMN rqmt_no SET DEFAULT '0';
ALTER VIEW msw_mrp_orderz ALTER COLUMN alloc_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_mrp_orderz$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mrp_orderz$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mrp_orderz$temp(
				data_typ varchar (1) NOT NULL,
				itm_ord_no varchar (15) NULL,
				io_schd_no varchar (15) NULL,
				io_schd_typ varchar (5) NULL,
				io_schd_sts_typ varchar (2) NULL,
				itm_ord_typ varchar (1) NULL,
				itm_ord_sts_typ varchar (1) NULL,
				oper_ord_sts_typ varchar (1) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				loc_cd varchar (20) NULL,
				bom_ptn varchar (40) NULL,
				oper_ptn varchar (40) NULL,
				disp_seq numeric (9,0) NULL,
				alt_grp_cd varchar (40) NULL,
				alt_grp_seq numeric (9,0) NULL,
				oper_ord_no varchar (15) NULL,
				oper_inst_no varchar (15) NULL,
				alt_itm_typ varchar (1) NULL,
				alt_itm_ratio numeric (9,0) NULL,
				alt_alloc_prio numeric (9,0) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				lot_seq varchar (15) NULL,
				mfg_loc_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				maker_cd varchar (20) NULL,
				rqst_loc_cd varchar (20) NULL,
				rqst_wg_cd varchar (10) NULL,
				qty numeric (21,8) NULL,
				master_dt timestamp(0)  NULL,
				po_schd_dt timestamp(0)  NULL,
				gi_schd_dt timestamp(0)  NULL,
				mfg_st_schd_dt timestamp(0)  NULL,
				mfg_end_schd_dt timestamp(0)  NULL,
				st_schd_tm timestamp(0)  NULL,
				end_schd_tm timestamp(0)  NULL,
				strg_schd_dt timestamp(0)  NULL,
				accpt_schd_dt timestamp(0)  NULL,
				insp_st_schd_dt timestamp(0)  NULL,
				insp_end_schd_dt timestamp(0)  NULL,
				first_gr_dt timestamp(0)  NULL,
				avl_schd_dt timestamp(0)  NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				sno1 varchar (15) NULL,
				sno_typ1 varchar (1) NULL,
				sno2 varchar (15) NULL,
				sno_typ2 varchar (1) NULL,
				sno3 varchar (15) NULL,
				sno_typ3 varchar (1) NULL,
				sno4 varchar (15) NULL,
				sno_typ4 varchar (1) NULL,
				ex_sno1 varchar (15) NULL,
				ex_sno2 varchar (15) NULL,
				ex_sno3 varchar (15) NULL,
				ex_sno4 varchar (15) NULL,
				gd_cd varchar (2) NULL,
				lmt_dt timestamp(0)  NULL,
				wg_cd varchar (10) NULL,
				rqmt_no varchar (15) DEFAULT '0' NULL,
				inpt_ctl_typ varchar (1) NULL,
				alloc_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_mrp_orderz$temp
			ADD CONSTRAINT msw_mrp_orderz_ck01 CHECK (alloc_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mrp_orderz$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mrp_orderz$temp(
			data_typ,
			itm_ord_no,
			io_schd_no,
			io_schd_typ,
			io_schd_sts_typ,
			itm_ord_typ,
			itm_ord_sts_typ,
			oper_ord_sts_typ,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			ver_no,
			loc_cd,
			bom_ptn,
			oper_ptn,
			disp_seq,
			alt_grp_cd,
			alt_grp_seq,
			oper_ord_no,
			oper_inst_no,
			alt_itm_typ,
			alt_itm_ratio,
			alt_alloc_prio,
			lot_no,
			sublot_no,
			lot_seq,
			mfg_loc_cd,
			sppl_cd,
			maker_cd,
			rqst_loc_cd,
			rqst_wg_cd,
			qty,
			master_dt,
			po_schd_dt,
			gi_schd_dt,
			mfg_st_schd_dt,
			mfg_end_schd_dt,
			st_schd_tm,
			end_schd_tm,
			strg_schd_dt,
			accpt_schd_dt,
			insp_st_schd_dt,
			insp_end_schd_dt,
			first_gr_dt,
			avl_schd_dt,
			oper_cd,
			oper_seq,
			sno1,
			sno_typ1,
			sno2,
			sno_typ2,
			sno3,
			sno_typ3,
			sno4,
			sno_typ4,
			ex_sno1,
			ex_sno2,
			ex_sno3,
			ex_sno4,
			gd_cd,
			lmt_dt,
			wg_cd,
			rqmt_no,
			inpt_ctl_typ,
			alloc_flg
		)VALUES (
			NEW.data_typ,
			NEW.itm_ord_no,
			NEW.io_schd_no,
			NEW.io_schd_typ,
			NEW.io_schd_sts_typ,
			NEW.itm_ord_typ,
			NEW.itm_ord_sts_typ,
			NEW.oper_ord_sts_typ,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.ver_no,
			NEW.loc_cd,
			NEW.bom_ptn,
			NEW.oper_ptn,
			NEW.disp_seq,
			NEW.alt_grp_cd,
			NEW.alt_grp_seq,
			NEW.oper_ord_no,
			NEW.oper_inst_no,
			NEW.alt_itm_typ,
			NEW.alt_itm_ratio,
			NEW.alt_alloc_prio,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.lot_seq,
			NEW.mfg_loc_cd,
			NEW.sppl_cd,
			NEW.maker_cd,
			NEW.rqst_loc_cd,
			NEW.rqst_wg_cd,
			NEW.qty,
			NEW.master_dt,
			NEW.po_schd_dt,
			NEW.gi_schd_dt,
			NEW.mfg_st_schd_dt,
			NEW.mfg_end_schd_dt,
			NEW.st_schd_tm,
			NEW.end_schd_tm,
			NEW.strg_schd_dt,
			NEW.accpt_schd_dt,
			NEW.insp_st_schd_dt,
			NEW.insp_end_schd_dt,
			NEW.first_gr_dt,
			NEW.avl_schd_dt,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.sno1,
			NEW.sno_typ1,
			NEW.sno2,
			NEW.sno_typ2,
			NEW.sno3,
			NEW.sno_typ3,
			NEW.sno4,
			NEW.sno_typ4,
			NEW.ex_sno1,
			NEW.ex_sno2,
			NEW.ex_sno3,
			NEW.ex_sno4,
			NEW.gd_cd,
			NEW.lmt_dt,
			NEW.wg_cd,
			NEW.rqmt_no,
			NEW.inpt_ctl_typ,
			NEW.alloc_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mrp_orderz$temp
		SET 
			data_typ = NEW.data_typ,
			itm_ord_no = NEW.itm_ord_no,
			io_schd_no = NEW.io_schd_no,
			io_schd_typ = NEW.io_schd_typ,
			io_schd_sts_typ = NEW.io_schd_sts_typ,
			itm_ord_typ = NEW.itm_ord_typ,
			itm_ord_sts_typ = NEW.itm_ord_sts_typ,
			oper_ord_sts_typ = NEW.oper_ord_sts_typ,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			ver_no = NEW.ver_no,
			loc_cd = NEW.loc_cd,
			bom_ptn = NEW.bom_ptn,
			oper_ptn = NEW.oper_ptn,
			disp_seq = NEW.disp_seq,
			alt_grp_cd = NEW.alt_grp_cd,
			alt_grp_seq = NEW.alt_grp_seq,
			oper_ord_no = NEW.oper_ord_no,
			oper_inst_no = NEW.oper_inst_no,
			alt_itm_typ = NEW.alt_itm_typ,
			alt_itm_ratio = NEW.alt_itm_ratio,
			alt_alloc_prio = NEW.alt_alloc_prio,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			lot_seq = NEW.lot_seq,
			mfg_loc_cd = NEW.mfg_loc_cd,
			sppl_cd = NEW.sppl_cd,
			maker_cd = NEW.maker_cd,
			rqst_loc_cd = NEW.rqst_loc_cd,
			rqst_wg_cd = NEW.rqst_wg_cd,
			qty = NEW.qty,
			master_dt = NEW.master_dt,
			po_schd_dt = NEW.po_schd_dt,
			gi_schd_dt = NEW.gi_schd_dt,
			mfg_st_schd_dt = NEW.mfg_st_schd_dt,
			mfg_end_schd_dt = NEW.mfg_end_schd_dt,
			st_schd_tm = NEW.st_schd_tm,
			end_schd_tm = NEW.end_schd_tm,
			strg_schd_dt = NEW.strg_schd_dt,
			accpt_schd_dt = NEW.accpt_schd_dt,
			insp_st_schd_dt = NEW.insp_st_schd_dt,
			insp_end_schd_dt = NEW.insp_end_schd_dt,
			first_gr_dt = NEW.first_gr_dt,
			avl_schd_dt = NEW.avl_schd_dt,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			sno1 = NEW.sno1,
			sno_typ1 = NEW.sno_typ1,
			sno2 = NEW.sno2,
			sno_typ2 = NEW.sno_typ2,
			sno3 = NEW.sno3,
			sno_typ3 = NEW.sno_typ3,
			sno4 = NEW.sno4,
			sno_typ4 = NEW.sno_typ4,
			ex_sno1 = NEW.ex_sno1,
			ex_sno2 = NEW.ex_sno2,
			ex_sno3 = NEW.ex_sno3,
			ex_sno4 = NEW.ex_sno4,
			gd_cd = NEW.gd_cd,
			lmt_dt = NEW.lmt_dt,
			wg_cd = NEW.wg_cd,
			rqmt_no = NEW.rqmt_no,
			inpt_ctl_typ = NEW.inpt_ctl_typ,
			alloc_flg = NEW.alloc_flg
		WHERE 0=0
		AND data_typ = OLD.data_typ
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (io_schd_no = OLD.io_schd_no OR io_schd_no IS NULL AND OLD.io_schd_no IS NULL)
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL)
		AND (io_schd_sts_typ = OLD.io_schd_sts_typ OR io_schd_sts_typ IS NULL AND OLD.io_schd_sts_typ IS NULL)
		AND (itm_ord_typ = OLD.itm_ord_typ OR itm_ord_typ IS NULL AND OLD.itm_ord_typ IS NULL)
		AND (itm_ord_sts_typ = OLD.itm_ord_sts_typ OR itm_ord_sts_typ IS NULL AND OLD.itm_ord_sts_typ IS NULL)
		AND (oper_ord_sts_typ = OLD.oper_ord_sts_typ OR oper_ord_sts_typ IS NULL AND OLD.oper_ord_sts_typ IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (alt_grp_seq = OLD.alt_grp_seq OR alt_grp_seq IS NULL AND OLD.alt_grp_seq IS NULL)
		AND (oper_ord_no = OLD.oper_ord_no OR oper_ord_no IS NULL AND OLD.oper_ord_no IS NULL)
		AND (oper_inst_no = OLD.oper_inst_no OR oper_inst_no IS NULL AND OLD.oper_inst_no IS NULL)
		AND (alt_itm_typ = OLD.alt_itm_typ OR alt_itm_typ IS NULL AND OLD.alt_itm_typ IS NULL)
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (alt_alloc_prio = OLD.alt_alloc_prio OR alt_alloc_prio IS NULL AND OLD.alt_alloc_prio IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (lot_seq = OLD.lot_seq OR lot_seq IS NULL AND OLD.lot_seq IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (rqst_loc_cd = OLD.rqst_loc_cd OR rqst_loc_cd IS NULL AND OLD.rqst_loc_cd IS NULL)
		AND (rqst_wg_cd = OLD.rqst_wg_cd OR rqst_wg_cd IS NULL AND OLD.rqst_wg_cd IS NULL)
		AND (qty = OLD.qty OR qty IS NULL AND OLD.qty IS NULL)
		AND (master_dt = OLD.master_dt OR master_dt IS NULL AND OLD.master_dt IS NULL)
		AND (po_schd_dt = OLD.po_schd_dt OR po_schd_dt IS NULL AND OLD.po_schd_dt IS NULL)
		AND (gi_schd_dt = OLD.gi_schd_dt OR gi_schd_dt IS NULL AND OLD.gi_schd_dt IS NULL)
		AND (mfg_st_schd_dt = OLD.mfg_st_schd_dt OR mfg_st_schd_dt IS NULL AND OLD.mfg_st_schd_dt IS NULL)
		AND (mfg_end_schd_dt = OLD.mfg_end_schd_dt OR mfg_end_schd_dt IS NULL AND OLD.mfg_end_schd_dt IS NULL)
		AND (st_schd_tm = OLD.st_schd_tm OR st_schd_tm IS NULL AND OLD.st_schd_tm IS NULL)
		AND (end_schd_tm = OLD.end_schd_tm OR end_schd_tm IS NULL AND OLD.end_schd_tm IS NULL)
		AND (strg_schd_dt = OLD.strg_schd_dt OR strg_schd_dt IS NULL AND OLD.strg_schd_dt IS NULL)
		AND (accpt_schd_dt = OLD.accpt_schd_dt OR accpt_schd_dt IS NULL AND OLD.accpt_schd_dt IS NULL)
		AND (insp_st_schd_dt = OLD.insp_st_schd_dt OR insp_st_schd_dt IS NULL AND OLD.insp_st_schd_dt IS NULL)
		AND (insp_end_schd_dt = OLD.insp_end_schd_dt OR insp_end_schd_dt IS NULL AND OLD.insp_end_schd_dt IS NULL)
		AND (first_gr_dt = OLD.first_gr_dt OR first_gr_dt IS NULL AND OLD.first_gr_dt IS NULL)
		AND (avl_schd_dt = OLD.avl_schd_dt OR avl_schd_dt IS NULL AND OLD.avl_schd_dt IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno_typ1 = OLD.sno_typ1 OR sno_typ1 IS NULL AND OLD.sno_typ1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno_typ2 = OLD.sno_typ2 OR sno_typ2 IS NULL AND OLD.sno_typ2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno_typ3 = OLD.sno_typ3 OR sno_typ3 IS NULL AND OLD.sno_typ3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (sno_typ4 = OLD.sno_typ4 OR sno_typ4 IS NULL AND OLD.sno_typ4 IS NULL)
		AND (ex_sno1 = OLD.ex_sno1 OR ex_sno1 IS NULL AND OLD.ex_sno1 IS NULL)
		AND (ex_sno2 = OLD.ex_sno2 OR ex_sno2 IS NULL AND OLD.ex_sno2 IS NULL)
		AND (ex_sno3 = OLD.ex_sno3 OR ex_sno3 IS NULL AND OLD.ex_sno3 IS NULL)
		AND (ex_sno4 = OLD.ex_sno4 OR ex_sno4 IS NULL AND OLD.ex_sno4 IS NULL)
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL)
		AND (lmt_dt = OLD.lmt_dt OR lmt_dt IS NULL AND OLD.lmt_dt IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL)
		AND (inpt_ctl_typ = OLD.inpt_ctl_typ OR inpt_ctl_typ IS NULL AND OLD.inpt_ctl_typ IS NULL)
		AND alloc_flg = OLD.alloc_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mrp_orderz$temp
		WHERE 0=0
		AND data_typ = OLD.data_typ
		AND (itm_ord_no = OLD.itm_ord_no OR itm_ord_no IS NULL AND OLD.itm_ord_no IS NULL)
		AND (io_schd_no = OLD.io_schd_no OR io_schd_no IS NULL AND OLD.io_schd_no IS NULL)
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL)
		AND (io_schd_sts_typ = OLD.io_schd_sts_typ OR io_schd_sts_typ IS NULL AND OLD.io_schd_sts_typ IS NULL)
		AND (itm_ord_typ = OLD.itm_ord_typ OR itm_ord_typ IS NULL AND OLD.itm_ord_typ IS NULL)
		AND (itm_ord_sts_typ = OLD.itm_ord_sts_typ OR itm_ord_sts_typ IS NULL AND OLD.itm_ord_sts_typ IS NULL)
		AND (oper_ord_sts_typ = OLD.oper_ord_sts_typ OR oper_ord_sts_typ IS NULL AND OLD.oper_ord_sts_typ IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (alt_grp_seq = OLD.alt_grp_seq OR alt_grp_seq IS NULL AND OLD.alt_grp_seq IS NULL)
		AND (oper_ord_no = OLD.oper_ord_no OR oper_ord_no IS NULL AND OLD.oper_ord_no IS NULL)
		AND (oper_inst_no = OLD.oper_inst_no OR oper_inst_no IS NULL AND OLD.oper_inst_no IS NULL)
		AND (alt_itm_typ = OLD.alt_itm_typ OR alt_itm_typ IS NULL AND OLD.alt_itm_typ IS NULL)
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (alt_alloc_prio = OLD.alt_alloc_prio OR alt_alloc_prio IS NULL AND OLD.alt_alloc_prio IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (lot_seq = OLD.lot_seq OR lot_seq IS NULL AND OLD.lot_seq IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (rqst_loc_cd = OLD.rqst_loc_cd OR rqst_loc_cd IS NULL AND OLD.rqst_loc_cd IS NULL)
		AND (rqst_wg_cd = OLD.rqst_wg_cd OR rqst_wg_cd IS NULL AND OLD.rqst_wg_cd IS NULL)
		AND (qty = OLD.qty OR qty IS NULL AND OLD.qty IS NULL)
		AND (master_dt = OLD.master_dt OR master_dt IS NULL AND OLD.master_dt IS NULL)
		AND (po_schd_dt = OLD.po_schd_dt OR po_schd_dt IS NULL AND OLD.po_schd_dt IS NULL)
		AND (gi_schd_dt = OLD.gi_schd_dt OR gi_schd_dt IS NULL AND OLD.gi_schd_dt IS NULL)
		AND (mfg_st_schd_dt = OLD.mfg_st_schd_dt OR mfg_st_schd_dt IS NULL AND OLD.mfg_st_schd_dt IS NULL)
		AND (mfg_end_schd_dt = OLD.mfg_end_schd_dt OR mfg_end_schd_dt IS NULL AND OLD.mfg_end_schd_dt IS NULL)
		AND (st_schd_tm = OLD.st_schd_tm OR st_schd_tm IS NULL AND OLD.st_schd_tm IS NULL)
		AND (end_schd_tm = OLD.end_schd_tm OR end_schd_tm IS NULL AND OLD.end_schd_tm IS NULL)
		AND (strg_schd_dt = OLD.strg_schd_dt OR strg_schd_dt IS NULL AND OLD.strg_schd_dt IS NULL)
		AND (accpt_schd_dt = OLD.accpt_schd_dt OR accpt_schd_dt IS NULL AND OLD.accpt_schd_dt IS NULL)
		AND (insp_st_schd_dt = OLD.insp_st_schd_dt OR insp_st_schd_dt IS NULL AND OLD.insp_st_schd_dt IS NULL)
		AND (insp_end_schd_dt = OLD.insp_end_schd_dt OR insp_end_schd_dt IS NULL AND OLD.insp_end_schd_dt IS NULL)
		AND (first_gr_dt = OLD.first_gr_dt OR first_gr_dt IS NULL AND OLD.first_gr_dt IS NULL)
		AND (avl_schd_dt = OLD.avl_schd_dt OR avl_schd_dt IS NULL AND OLD.avl_schd_dt IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno_typ1 = OLD.sno_typ1 OR sno_typ1 IS NULL AND OLD.sno_typ1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno_typ2 = OLD.sno_typ2 OR sno_typ2 IS NULL AND OLD.sno_typ2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno_typ3 = OLD.sno_typ3 OR sno_typ3 IS NULL AND OLD.sno_typ3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (sno_typ4 = OLD.sno_typ4 OR sno_typ4 IS NULL AND OLD.sno_typ4 IS NULL)
		AND (ex_sno1 = OLD.ex_sno1 OR ex_sno1 IS NULL AND OLD.ex_sno1 IS NULL)
		AND (ex_sno2 = OLD.ex_sno2 OR ex_sno2 IS NULL AND OLD.ex_sno2 IS NULL)
		AND (ex_sno3 = OLD.ex_sno3 OR ex_sno3 IS NULL AND OLD.ex_sno3 IS NULL)
		AND (ex_sno4 = OLD.ex_sno4 OR ex_sno4 IS NULL AND OLD.ex_sno4 IS NULL)
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL)
		AND (lmt_dt = OLD.lmt_dt OR lmt_dt IS NULL AND OLD.lmt_dt IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL)
		AND (inpt_ctl_typ = OLD.inpt_ctl_typ OR inpt_ctl_typ IS NULL AND OLD.inpt_ctl_typ IS NULL)
		AND alloc_flg = OLD.alloc_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mrp_orderz$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mrp_orderz
FOR EACH ROW
EXECUTE PROCEDURE msw_mrp_orderz$func();
;

