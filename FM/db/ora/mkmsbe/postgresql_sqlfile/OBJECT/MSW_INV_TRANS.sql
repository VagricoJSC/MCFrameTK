\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_inv_trans()
RETURNS TABLE (
	io_schd_typ varchar,
	io_schd_sts_typ varchar,
	trd_cd varchar,
	trd_ptn_typ varchar,
	trn_typ varchar,
	io_act_typ varchar,
	io_typ varchar,
	dt timestamp(0),
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_nm varchar,
	ver_flg char,
	ver_no varchar,
	gd_cd varchar,
	quality_typ varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	loc_cd varchar,
	wg_cd varchar,
	gr_schd_qty numeric,
	gi_schd_qty numeric,
	gr_act_qty numeric,
	gi_act_qty numeric,
	stk_qty numeric,
	base_unit_cd varchar,
	base_unit_dec_place numeric,
	io_schd_no varchar,
	io_schd_sub_typ1 varchar,
	io_schd_sub_no1 varchar,
	io_schd_sub_typ2 varchar,
	io_schd_sub_no2 varchar,
	io_schd_sub_typ3 varchar,
	io_schd_sub_no3 varchar,
	io_schd_sub_typ4 varchar,
	io_schd_sub_no4 varchar,
	slo_no varchar,
	slo_d_no varchar,
	po_no varchar,
	po_d_no varchar,
	mfg_inst_no varchar,
	oper_inst_no varchar,
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	par_itm_nm varchar,
	par_lot_no varchar,
	par_sublot_no varchar,
	par_sno1 varchar,
	par_sno2 varchar,
	par_sno3 varchar,
	par_sno4 varchar,
	par_itm_ord_no varchar,
	par_oper_ord_no varchar,
	par_dt_fr timestamp(0),
	bom_ptn varchar,
	mfg_act_no varchar,
	oper_act_no varchar,
	str_ln_cd varchar,
	prcd_flg char,
	sim_flg char,
	stk_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_inv_trans$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_inv_trans$temp(
				io_schd_typ varchar (5) NULL,
				io_schd_sts_typ varchar (2) NULL,
				trd_cd varchar (4) NULL,
				trd_ptn_typ varchar (4) NULL,
				trn_typ varchar (4) NULL,
				io_act_typ varchar (5) NULL,
				io_typ varchar (1) NULL,
				dt timestamp(0)  NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				itm_nm varchar (100) NULL,
				ver_flg char (1) DEFAULT '0' NOT NULL,
				ver_no varchar (10) NULL,
				gd_cd varchar (2) NOT NULL,
				quality_typ varchar (1) NOT NULL,
				sno1 varchar (15) DEFAULT '*' NOT NULL,
				sno2 varchar (15) DEFAULT '*' NOT NULL,
				sno3 varchar (15) DEFAULT '*' NOT NULL,
				sno4 varchar (15) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				gr_schd_qty numeric (21,8) NOT NULL,
				gi_schd_qty numeric (21,8) NOT NULL,
				gr_act_qty numeric (21,8) NOT NULL,
				gi_act_qty numeric (21,8) NOT NULL,
				stk_qty numeric (21,8) NOT NULL,
				base_unit_cd varchar (5) NULL,
				base_unit_dec_place numeric (2,0) NULL,
				io_schd_no varchar (15) NULL,
				io_schd_sub_typ1 varchar (2) NULL,
				io_schd_sub_no1 varchar (15) NULL,
				io_schd_sub_typ2 varchar (2) NULL,
				io_schd_sub_no2 varchar (15) NULL,
				io_schd_sub_typ3 varchar (2) NULL,
				io_schd_sub_no3 varchar (15) NULL,
				io_schd_sub_typ4 varchar (2) NULL,
				io_schd_sub_no4 varchar (15) NULL,
				slo_no varchar (15) NULL,
				slo_d_no varchar (15) NULL,
				po_no varchar (15) NULL,
				po_d_no varchar (15) NULL,
				mfg_inst_no varchar (15) NULL,
				oper_inst_no varchar (15) NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_itm_nm varchar (100) NULL,
				par_lot_no varchar (15) NULL,
				par_sublot_no varchar (15) NULL,
				par_sno1 varchar (15) NULL,
				par_sno2 varchar (15) NULL,
				par_sno3 varchar (15) NULL,
				par_sno4 varchar (15) NULL,
				par_itm_ord_no varchar (15) NULL,
				par_oper_ord_no varchar (15) NULL,
				par_dt_fr timestamp(0)  NULL,
				bom_ptn varchar (40) NULL,
				mfg_act_no varchar (15) NULL,
				oper_act_no varchar (15) NULL,
				str_ln_cd varchar (10) NULL,
				prcd_flg char (1) DEFAULT '0' NOT NULL,
				sim_flg char (1) DEFAULT '0' NOT NULL,
				stk_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_inv_trans$temp
				ADD CONSTRAINT msw_inv_trans_ck01 CHECK (ver_flg IN ('0', '1'));
			ALTER TABLE msw_inv_trans$temp
				ADD CONSTRAINT msw_inv_trans_ck02 CHECK (prcd_flg IN ('0', '1'));
			ALTER TABLE msw_inv_trans$temp
				ADD CONSTRAINT msw_inv_trans_ck03 CHECK (sim_flg IN ('0', '1'));
			ALTER TABLE msw_inv_trans$temp
				ADD CONSTRAINT msw_inv_trans_ck04 CHECK (stk_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_inv_trans$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_inv_trans$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_inv_trans
AS
SELECT *
FROM msw_inv_trans();
ALTER VIEW msw_inv_trans ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_inv_trans ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_inv_trans ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_inv_trans ALTER COLUMN ver_flg SET DEFAULT '0';
ALTER VIEW msw_inv_trans ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW msw_inv_trans ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW msw_inv_trans ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW msw_inv_trans ALTER COLUMN sno4 SET DEFAULT '*';
ALTER VIEW msw_inv_trans ALTER COLUMN prcd_flg SET DEFAULT '0';
ALTER VIEW msw_inv_trans ALTER COLUMN sim_flg SET DEFAULT '0';
ALTER VIEW msw_inv_trans ALTER COLUMN stk_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_inv_trans$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_inv_trans$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_inv_trans$temp(
				io_schd_typ varchar (5) NULL,
				io_schd_sts_typ varchar (2) NULL,
				trd_cd varchar (4) NULL,
				trd_ptn_typ varchar (4) NULL,
				trn_typ varchar (4) NULL,
				io_act_typ varchar (5) NULL,
				io_typ varchar (1) NULL,
				dt timestamp(0)  NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				itm_nm varchar (100) NULL,
				ver_flg char (1) DEFAULT '0' NOT NULL,
				ver_no varchar (10) NULL,
				gd_cd varchar (2) NOT NULL,
				quality_typ varchar (1) NOT NULL,
				sno1 varchar (15) DEFAULT '*' NOT NULL,
				sno2 varchar (15) DEFAULT '*' NOT NULL,
				sno3 varchar (15) DEFAULT '*' NOT NULL,
				sno4 varchar (15) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				gr_schd_qty numeric (21,8) NOT NULL,
				gi_schd_qty numeric (21,8) NOT NULL,
				gr_act_qty numeric (21,8) NOT NULL,
				gi_act_qty numeric (21,8) NOT NULL,
				stk_qty numeric (21,8) NOT NULL,
				base_unit_cd varchar (5) NULL,
				base_unit_dec_place numeric (2,0) NULL,
				io_schd_no varchar (15) NULL,
				io_schd_sub_typ1 varchar (2) NULL,
				io_schd_sub_no1 varchar (15) NULL,
				io_schd_sub_typ2 varchar (2) NULL,
				io_schd_sub_no2 varchar (15) NULL,
				io_schd_sub_typ3 varchar (2) NULL,
				io_schd_sub_no3 varchar (15) NULL,
				io_schd_sub_typ4 varchar (2) NULL,
				io_schd_sub_no4 varchar (15) NULL,
				slo_no varchar (15) NULL,
				slo_d_no varchar (15) NULL,
				po_no varchar (15) NULL,
				po_d_no varchar (15) NULL,
				mfg_inst_no varchar (15) NULL,
				oper_inst_no varchar (15) NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_itm_nm varchar (100) NULL,
				par_lot_no varchar (15) NULL,
				par_sublot_no varchar (15) NULL,
				par_sno1 varchar (15) NULL,
				par_sno2 varchar (15) NULL,
				par_sno3 varchar (15) NULL,
				par_sno4 varchar (15) NULL,
				par_itm_ord_no varchar (15) NULL,
				par_oper_ord_no varchar (15) NULL,
				par_dt_fr timestamp(0)  NULL,
				bom_ptn varchar (40) NULL,
				mfg_act_no varchar (15) NULL,
				oper_act_no varchar (15) NULL,
				str_ln_cd varchar (10) NULL,
				prcd_flg char (1) DEFAULT '0' NOT NULL,
				sim_flg char (1) DEFAULT '0' NOT NULL,
				stk_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_inv_trans$temp
			ADD CONSTRAINT msw_inv_trans_ck01 CHECK (ver_flg IN ('0', '1'));
			ALTER TABLE msw_inv_trans$temp
			ADD CONSTRAINT msw_inv_trans_ck02 CHECK (prcd_flg IN ('0', '1'));
			ALTER TABLE msw_inv_trans$temp
			ADD CONSTRAINT msw_inv_trans_ck03 CHECK (sim_flg IN ('0', '1'));
			ALTER TABLE msw_inv_trans$temp
			ADD CONSTRAINT msw_inv_trans_ck04 CHECK (stk_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_inv_trans$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_inv_trans$temp(
			io_schd_typ,
			io_schd_sts_typ,
			trd_cd,
			trd_ptn_typ,
			trn_typ,
			io_act_typ,
			io_typ,
			dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_nm,
			ver_flg,
			ver_no,
			gd_cd,
			quality_typ,
			sno1,
			sno2,
			sno3,
			sno4,
			loc_cd,
			wg_cd,
			gr_schd_qty,
			gi_schd_qty,
			gr_act_qty,
			gi_act_qty,
			stk_qty,
			base_unit_cd,
			base_unit_dec_place,
			io_schd_no,
			io_schd_sub_typ1,
			io_schd_sub_no1,
			io_schd_sub_typ2,
			io_schd_sub_no2,
			io_schd_sub_typ3,
			io_schd_sub_no3,
			io_schd_sub_typ4,
			io_schd_sub_no4,
			slo_no,
			slo_d_no,
			po_no,
			po_d_no,
			mfg_inst_no,
			oper_inst_no,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_itm_nm,
			par_lot_no,
			par_sublot_no,
			par_sno1,
			par_sno2,
			par_sno3,
			par_sno4,
			par_itm_ord_no,
			par_oper_ord_no,
			par_dt_fr,
			bom_ptn,
			mfg_act_no,
			oper_act_no,
			str_ln_cd,
			prcd_flg,
			sim_flg,
			stk_flg
		)VALUES (
			NEW.io_schd_typ,
			NEW.io_schd_sts_typ,
			NEW.trd_cd,
			NEW.trd_ptn_typ,
			NEW.trn_typ,
			NEW.io_act_typ,
			NEW.io_typ,
			NEW.dt,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_nm,
			NEW.ver_flg,
			NEW.ver_no,
			NEW.gd_cd,
			NEW.quality_typ,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.loc_cd,
			NEW.wg_cd,
			NEW.gr_schd_qty,
			NEW.gi_schd_qty,
			NEW.gr_act_qty,
			NEW.gi_act_qty,
			NEW.stk_qty,
			NEW.base_unit_cd,
			NEW.base_unit_dec_place,
			NEW.io_schd_no,
			NEW.io_schd_sub_typ1,
			NEW.io_schd_sub_no1,
			NEW.io_schd_sub_typ2,
			NEW.io_schd_sub_no2,
			NEW.io_schd_sub_typ3,
			NEW.io_schd_sub_no3,
			NEW.io_schd_sub_typ4,
			NEW.io_schd_sub_no4,
			NEW.slo_no,
			NEW.slo_d_no,
			NEW.po_no,
			NEW.po_d_no,
			NEW.mfg_inst_no,
			NEW.oper_inst_no,
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.par_itm_nm,
			NEW.par_lot_no,
			NEW.par_sublot_no,
			NEW.par_sno1,
			NEW.par_sno2,
			NEW.par_sno3,
			NEW.par_sno4,
			NEW.par_itm_ord_no,
			NEW.par_oper_ord_no,
			NEW.par_dt_fr,
			NEW.bom_ptn,
			NEW.mfg_act_no,
			NEW.oper_act_no,
			NEW.str_ln_cd,
			NEW.prcd_flg,
			NEW.sim_flg,
			NEW.stk_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_inv_trans$temp
		SET 
			io_schd_typ = NEW.io_schd_typ,
			io_schd_sts_typ = NEW.io_schd_sts_typ,
			trd_cd = NEW.trd_cd,
			trd_ptn_typ = NEW.trd_ptn_typ,
			trn_typ = NEW.trn_typ,
			io_act_typ = NEW.io_act_typ,
			io_typ = NEW.io_typ,
			dt = NEW.dt,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_nm = NEW.itm_nm,
			ver_flg = NEW.ver_flg,
			ver_no = NEW.ver_no,
			gd_cd = NEW.gd_cd,
			quality_typ = NEW.quality_typ,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			loc_cd = NEW.loc_cd,
			wg_cd = NEW.wg_cd,
			gr_schd_qty = NEW.gr_schd_qty,
			gi_schd_qty = NEW.gi_schd_qty,
			gr_act_qty = NEW.gr_act_qty,
			gi_act_qty = NEW.gi_act_qty,
			stk_qty = NEW.stk_qty,
			base_unit_cd = NEW.base_unit_cd,
			base_unit_dec_place = NEW.base_unit_dec_place,
			io_schd_no = NEW.io_schd_no,
			io_schd_sub_typ1 = NEW.io_schd_sub_typ1,
			io_schd_sub_no1 = NEW.io_schd_sub_no1,
			io_schd_sub_typ2 = NEW.io_schd_sub_typ2,
			io_schd_sub_no2 = NEW.io_schd_sub_no2,
			io_schd_sub_typ3 = NEW.io_schd_sub_typ3,
			io_schd_sub_no3 = NEW.io_schd_sub_no3,
			io_schd_sub_typ4 = NEW.io_schd_sub_typ4,
			io_schd_sub_no4 = NEW.io_schd_sub_no4,
			slo_no = NEW.slo_no,
			slo_d_no = NEW.slo_d_no,
			po_no = NEW.po_no,
			po_d_no = NEW.po_d_no,
			mfg_inst_no = NEW.mfg_inst_no,
			oper_inst_no = NEW.oper_inst_no,
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			par_itm_nm = NEW.par_itm_nm,
			par_lot_no = NEW.par_lot_no,
			par_sublot_no = NEW.par_sublot_no,
			par_sno1 = NEW.par_sno1,
			par_sno2 = NEW.par_sno2,
			par_sno3 = NEW.par_sno3,
			par_sno4 = NEW.par_sno4,
			par_itm_ord_no = NEW.par_itm_ord_no,
			par_oper_ord_no = NEW.par_oper_ord_no,
			par_dt_fr = NEW.par_dt_fr,
			bom_ptn = NEW.bom_ptn,
			mfg_act_no = NEW.mfg_act_no,
			oper_act_no = NEW.oper_act_no,
			str_ln_cd = NEW.str_ln_cd,
			prcd_flg = NEW.prcd_flg,
			sim_flg = NEW.sim_flg,
			stk_flg = NEW.stk_flg
		WHERE 0=0
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL)
		AND (io_schd_sts_typ = OLD.io_schd_sts_typ OR io_schd_sts_typ IS NULL AND OLD.io_schd_sts_typ IS NULL)
		AND (trd_cd = OLD.trd_cd OR trd_cd IS NULL AND OLD.trd_cd IS NULL)
		AND (trd_ptn_typ = OLD.trd_ptn_typ OR trd_ptn_typ IS NULL AND OLD.trd_ptn_typ IS NULL)
		AND (trn_typ = OLD.trn_typ OR trn_typ IS NULL AND OLD.trn_typ IS NULL)
		AND (io_act_typ = OLD.io_act_typ OR io_act_typ IS NULL AND OLD.io_act_typ IS NULL)
		AND (io_typ = OLD.io_typ OR io_typ IS NULL AND OLD.io_typ IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND ver_flg = OLD.ver_flg
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND gd_cd = OLD.gd_cd
		AND quality_typ = OLD.quality_typ
		AND sno1 = OLD.sno1
		AND sno2 = OLD.sno2
		AND sno3 = OLD.sno3
		AND sno4 = OLD.sno4
		AND loc_cd = OLD.loc_cd
		AND wg_cd = OLD.wg_cd
		AND gr_schd_qty = OLD.gr_schd_qty
		AND gi_schd_qty = OLD.gi_schd_qty
		AND gr_act_qty = OLD.gr_act_qty
		AND gi_act_qty = OLD.gi_act_qty
		AND stk_qty = OLD.stk_qty
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL)
		AND (base_unit_dec_place = OLD.base_unit_dec_place OR base_unit_dec_place IS NULL AND OLD.base_unit_dec_place IS NULL)
		AND (io_schd_no = OLD.io_schd_no OR io_schd_no IS NULL AND OLD.io_schd_no IS NULL)
		AND (io_schd_sub_typ1 = OLD.io_schd_sub_typ1 OR io_schd_sub_typ1 IS NULL AND OLD.io_schd_sub_typ1 IS NULL)
		AND (io_schd_sub_no1 = OLD.io_schd_sub_no1 OR io_schd_sub_no1 IS NULL AND OLD.io_schd_sub_no1 IS NULL)
		AND (io_schd_sub_typ2 = OLD.io_schd_sub_typ2 OR io_schd_sub_typ2 IS NULL AND OLD.io_schd_sub_typ2 IS NULL)
		AND (io_schd_sub_no2 = OLD.io_schd_sub_no2 OR io_schd_sub_no2 IS NULL AND OLD.io_schd_sub_no2 IS NULL)
		AND (io_schd_sub_typ3 = OLD.io_schd_sub_typ3 OR io_schd_sub_typ3 IS NULL AND OLD.io_schd_sub_typ3 IS NULL)
		AND (io_schd_sub_no3 = OLD.io_schd_sub_no3 OR io_schd_sub_no3 IS NULL AND OLD.io_schd_sub_no3 IS NULL)
		AND (io_schd_sub_typ4 = OLD.io_schd_sub_typ4 OR io_schd_sub_typ4 IS NULL AND OLD.io_schd_sub_typ4 IS NULL)
		AND (io_schd_sub_no4 = OLD.io_schd_sub_no4 OR io_schd_sub_no4 IS NULL AND OLD.io_schd_sub_no4 IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (slo_d_no = OLD.slo_d_no OR slo_d_no IS NULL AND OLD.slo_d_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (po_d_no = OLD.po_d_no OR po_d_no IS NULL AND OLD.po_d_no IS NULL)
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL)
		AND (oper_inst_no = OLD.oper_inst_no OR oper_inst_no IS NULL AND OLD.oper_inst_no IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_itm_nm = OLD.par_itm_nm OR par_itm_nm IS NULL AND OLD.par_itm_nm IS NULL)
		AND (par_lot_no = OLD.par_lot_no OR par_lot_no IS NULL AND OLD.par_lot_no IS NULL)
		AND (par_sublot_no = OLD.par_sublot_no OR par_sublot_no IS NULL AND OLD.par_sublot_no IS NULL)
		AND (par_sno1 = OLD.par_sno1 OR par_sno1 IS NULL AND OLD.par_sno1 IS NULL)
		AND (par_sno2 = OLD.par_sno2 OR par_sno2 IS NULL AND OLD.par_sno2 IS NULL)
		AND (par_sno3 = OLD.par_sno3 OR par_sno3 IS NULL AND OLD.par_sno3 IS NULL)
		AND (par_sno4 = OLD.par_sno4 OR par_sno4 IS NULL AND OLD.par_sno4 IS NULL)
		AND (par_itm_ord_no = OLD.par_itm_ord_no OR par_itm_ord_no IS NULL AND OLD.par_itm_ord_no IS NULL)
		AND (par_oper_ord_no = OLD.par_oper_ord_no OR par_oper_ord_no IS NULL AND OLD.par_oper_ord_no IS NULL)
		AND (par_dt_fr = OLD.par_dt_fr OR par_dt_fr IS NULL AND OLD.par_dt_fr IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (mfg_act_no = OLD.mfg_act_no OR mfg_act_no IS NULL AND OLD.mfg_act_no IS NULL)
		AND (oper_act_no = OLD.oper_act_no OR oper_act_no IS NULL AND OLD.oper_act_no IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL)
		AND prcd_flg = OLD.prcd_flg
		AND sim_flg = OLD.sim_flg
		AND stk_flg = OLD.stk_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_inv_trans$temp
		WHERE 0=0
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL)
		AND (io_schd_sts_typ = OLD.io_schd_sts_typ OR io_schd_sts_typ IS NULL AND OLD.io_schd_sts_typ IS NULL)
		AND (trd_cd = OLD.trd_cd OR trd_cd IS NULL AND OLD.trd_cd IS NULL)
		AND (trd_ptn_typ = OLD.trd_ptn_typ OR trd_ptn_typ IS NULL AND OLD.trd_ptn_typ IS NULL)
		AND (trn_typ = OLD.trn_typ OR trn_typ IS NULL AND OLD.trn_typ IS NULL)
		AND (io_act_typ = OLD.io_act_typ OR io_act_typ IS NULL AND OLD.io_act_typ IS NULL)
		AND (io_typ = OLD.io_typ OR io_typ IS NULL AND OLD.io_typ IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND ver_flg = OLD.ver_flg
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND gd_cd = OLD.gd_cd
		AND quality_typ = OLD.quality_typ
		AND sno1 = OLD.sno1
		AND sno2 = OLD.sno2
		AND sno3 = OLD.sno3
		AND sno4 = OLD.sno4
		AND loc_cd = OLD.loc_cd
		AND wg_cd = OLD.wg_cd
		AND gr_schd_qty = OLD.gr_schd_qty
		AND gi_schd_qty = OLD.gi_schd_qty
		AND gr_act_qty = OLD.gr_act_qty
		AND gi_act_qty = OLD.gi_act_qty
		AND stk_qty = OLD.stk_qty
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL)
		AND (base_unit_dec_place = OLD.base_unit_dec_place OR base_unit_dec_place IS NULL AND OLD.base_unit_dec_place IS NULL)
		AND (io_schd_no = OLD.io_schd_no OR io_schd_no IS NULL AND OLD.io_schd_no IS NULL)
		AND (io_schd_sub_typ1 = OLD.io_schd_sub_typ1 OR io_schd_sub_typ1 IS NULL AND OLD.io_schd_sub_typ1 IS NULL)
		AND (io_schd_sub_no1 = OLD.io_schd_sub_no1 OR io_schd_sub_no1 IS NULL AND OLD.io_schd_sub_no1 IS NULL)
		AND (io_schd_sub_typ2 = OLD.io_schd_sub_typ2 OR io_schd_sub_typ2 IS NULL AND OLD.io_schd_sub_typ2 IS NULL)
		AND (io_schd_sub_no2 = OLD.io_schd_sub_no2 OR io_schd_sub_no2 IS NULL AND OLD.io_schd_sub_no2 IS NULL)
		AND (io_schd_sub_typ3 = OLD.io_schd_sub_typ3 OR io_schd_sub_typ3 IS NULL AND OLD.io_schd_sub_typ3 IS NULL)
		AND (io_schd_sub_no3 = OLD.io_schd_sub_no3 OR io_schd_sub_no3 IS NULL AND OLD.io_schd_sub_no3 IS NULL)
		AND (io_schd_sub_typ4 = OLD.io_schd_sub_typ4 OR io_schd_sub_typ4 IS NULL AND OLD.io_schd_sub_typ4 IS NULL)
		AND (io_schd_sub_no4 = OLD.io_schd_sub_no4 OR io_schd_sub_no4 IS NULL AND OLD.io_schd_sub_no4 IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (slo_d_no = OLD.slo_d_no OR slo_d_no IS NULL AND OLD.slo_d_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (po_d_no = OLD.po_d_no OR po_d_no IS NULL AND OLD.po_d_no IS NULL)
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL)
		AND (oper_inst_no = OLD.oper_inst_no OR oper_inst_no IS NULL AND OLD.oper_inst_no IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_itm_nm = OLD.par_itm_nm OR par_itm_nm IS NULL AND OLD.par_itm_nm IS NULL)
		AND (par_lot_no = OLD.par_lot_no OR par_lot_no IS NULL AND OLD.par_lot_no IS NULL)
		AND (par_sublot_no = OLD.par_sublot_no OR par_sublot_no IS NULL AND OLD.par_sublot_no IS NULL)
		AND (par_sno1 = OLD.par_sno1 OR par_sno1 IS NULL AND OLD.par_sno1 IS NULL)
		AND (par_sno2 = OLD.par_sno2 OR par_sno2 IS NULL AND OLD.par_sno2 IS NULL)
		AND (par_sno3 = OLD.par_sno3 OR par_sno3 IS NULL AND OLD.par_sno3 IS NULL)
		AND (par_sno4 = OLD.par_sno4 OR par_sno4 IS NULL AND OLD.par_sno4 IS NULL)
		AND (par_itm_ord_no = OLD.par_itm_ord_no OR par_itm_ord_no IS NULL AND OLD.par_itm_ord_no IS NULL)
		AND (par_oper_ord_no = OLD.par_oper_ord_no OR par_oper_ord_no IS NULL AND OLD.par_oper_ord_no IS NULL)
		AND (par_dt_fr = OLD.par_dt_fr OR par_dt_fr IS NULL AND OLD.par_dt_fr IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (mfg_act_no = OLD.mfg_act_no OR mfg_act_no IS NULL AND OLD.mfg_act_no IS NULL)
		AND (oper_act_no = OLD.oper_act_no OR oper_act_no IS NULL AND OLD.oper_act_no IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL)
		AND prcd_flg = OLD.prcd_flg
		AND sim_flg = OLD.sim_flg
		AND stk_flg = OLD.stk_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_inv_trans$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_inv_trans
FOR EACH ROW
EXECUTE PROCEDURE msw_inv_trans$func();
;

