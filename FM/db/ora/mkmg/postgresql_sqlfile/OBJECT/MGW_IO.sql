\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_io()
RETURNS TABLE (
	act_io_id varchar,
	act_io_id_sub varchar,
	calc_ctg_cd varchar,
	wg_cd varchar,
	ym timestamp(0),
	ac_dt timestamp(0),
	mng_dpt_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	lot_no varchar,
	sublot_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	cost_io_typ varchar,
	ac_slip_typ varchar,
	ac_rsn_cd varchar,
	other_wg_cd varchar,
	other_dpt_cd varchar,
	mfg_act_grp varchar,
	bp_cd varchar,
	stk_bp_cd varchar,
	asst_typ varchar,
	qty numeric,
	amt numeric,
	trd_cur_cd varchar,
	trd_cur_amt numeric,
	xrate numeric,
	trd_grp varchar,
	trd_ratio numeric,
	alc_ac_cd varchar,
	alc_amt_flg char,
	alc_wg_cd varchar,
	alc_dpt_cd varchar,
	alc_loc_cd varchar,
	alc_oper_cd varchar,
	alc_bp_cd varchar,
	alc_ctg_cd varchar,
	alc_itm_cd varchar,
	alc_itm_sub1 varchar,
	alc_itm_sub2 varchar,
	alc_itm_sub3 varchar,
	alc_lot_no varchar,
	alc_sublot_no varchar,
	alc_sno1 varchar,
	alc_sno2 varchar,
	alc_sno3 varchar,
	alc_sno4 varchar,
	alc_itm_mfg_inst_no varchar,
	rec_eval_typ varchar,
	sml_key varchar,
	itm_jnl_cd varchar,
	zero_effect_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_io$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_io$temp(
				act_io_id varchar (20) NOT NULL,
				act_io_id_sub varchar (3) NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ym timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				mng_dpt_cd varchar (20) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				lot_no varchar (15) DEFAULT '*' NOT NULL,
				sublot_no varchar (15) DEFAULT '*' NOT NULL,
				sno1 varchar (15) DEFAULT '*' NOT NULL,
				sno2 varchar (15) DEFAULT '*' NOT NULL,
				sno3 varchar (15) DEFAULT '*' NOT NULL,
				sno4 varchar (15) DEFAULT '*' NOT NULL,
				cost_io_typ varchar (2) NOT NULL,
				ac_slip_typ varchar (5) NOT NULL,
				ac_rsn_cd varchar (10) NULL,
				other_wg_cd varchar (10) NULL,
				other_dpt_cd varchar (20) NULL,
				mfg_act_grp varchar (100) NULL,
				bp_cd varchar (20) NULL,
				stk_bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				amt numeric (21,8) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_amt numeric (21,8) NULL,
				xrate numeric (21,8) NULL,
				trd_grp varchar (50) NULL,
				trd_ratio numeric (21,8) NULL,
				alc_ac_cd varchar (20) NULL,
				alc_amt_flg char (1) DEFAULT '0' NOT NULL,
				alc_wg_cd varchar (10) NULL,
				alc_dpt_cd varchar (20) NULL,
				alc_loc_cd varchar (20) NULL,
				alc_oper_cd varchar (10) NULL,
				alc_bp_cd varchar (20) NULL,
				alc_ctg_cd varchar (20) NULL,
				alc_itm_cd varchar (40) NULL,
				alc_itm_sub1 varchar (5) NULL,
				alc_itm_sub2 varchar (5) NULL,
				alc_itm_sub3 varchar (5) NULL,
				alc_lot_no varchar (15) NULL,
				alc_sublot_no varchar (15) NULL,
				alc_sno1 varchar (15) NULL,
				alc_sno2 varchar (15) NULL,
				alc_sno3 varchar (15) NULL,
				alc_sno4 varchar (15) NULL,
				alc_itm_mfg_inst_no varchar (15) NULL,
				rec_eval_typ varchar (1) NULL,
				sml_key varchar (50) NULL,
				itm_jnl_cd varchar (5) NOT NULL,
				zero_effect_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_io_ie01 ON mgw_io$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			ALTER TABLE mgw_io$temp
			ADD CONSTRAINT mgw_io_pk PRIMARY KEY(act_io_id,act_io_id_sub);
			
			ALTER TABLE mgw_io$temp
				ADD CONSTRAINT mgw_io_ck01 CHECK (alc_amt_flg IN ('0', '1'));
			ALTER TABLE mgw_io$temp
				ADD CONSTRAINT mgw_io_ck02 CHECK (zero_effect_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_io$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_io$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_io
AS
SELECT *
FROM mgw_io();
ALTER VIEW mgw_io ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN sno4 SET DEFAULT '*';
ALTER VIEW mgw_io ALTER COLUMN alc_amt_flg SET DEFAULT '0';
ALTER VIEW mgw_io ALTER COLUMN zero_effect_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_io$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_io$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_io$temp(
				act_io_id varchar (20) NOT NULL,
				act_io_id_sub varchar (3) NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ym timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				mng_dpt_cd varchar (20) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				lot_no varchar (15) DEFAULT '*' NOT NULL,
				sublot_no varchar (15) DEFAULT '*' NOT NULL,
				sno1 varchar (15) DEFAULT '*' NOT NULL,
				sno2 varchar (15) DEFAULT '*' NOT NULL,
				sno3 varchar (15) DEFAULT '*' NOT NULL,
				sno4 varchar (15) DEFAULT '*' NOT NULL,
				cost_io_typ varchar (2) NOT NULL,
				ac_slip_typ varchar (5) NOT NULL,
				ac_rsn_cd varchar (10) NULL,
				other_wg_cd varchar (10) NULL,
				other_dpt_cd varchar (20) NULL,
				mfg_act_grp varchar (100) NULL,
				bp_cd varchar (20) NULL,
				stk_bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				amt numeric (21,8) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_amt numeric (21,8) NULL,
				xrate numeric (21,8) NULL,
				trd_grp varchar (50) NULL,
				trd_ratio numeric (21,8) NULL,
				alc_ac_cd varchar (20) NULL,
				alc_amt_flg char (1) DEFAULT '0' NOT NULL,
				alc_wg_cd varchar (10) NULL,
				alc_dpt_cd varchar (20) NULL,
				alc_loc_cd varchar (20) NULL,
				alc_oper_cd varchar (10) NULL,
				alc_bp_cd varchar (20) NULL,
				alc_ctg_cd varchar (20) NULL,
				alc_itm_cd varchar (40) NULL,
				alc_itm_sub1 varchar (5) NULL,
				alc_itm_sub2 varchar (5) NULL,
				alc_itm_sub3 varchar (5) NULL,
				alc_lot_no varchar (15) NULL,
				alc_sublot_no varchar (15) NULL,
				alc_sno1 varchar (15) NULL,
				alc_sno2 varchar (15) NULL,
				alc_sno3 varchar (15) NULL,
				alc_sno4 varchar (15) NULL,
				alc_itm_mfg_inst_no varchar (15) NULL,
				rec_eval_typ varchar (1) NULL,
				sml_key varchar (50) NULL,
				itm_jnl_cd varchar (5) NOT NULL,
				zero_effect_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_io_ie01 ON mgw_io$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			ALTER TABLE mgw_io$temp
			ADD CONSTRAINT mgw_io_pk PRIMARY KEY(act_io_id,act_io_id_sub);
			
			ALTER TABLE mgw_io$temp
			ADD CONSTRAINT mgw_io_ck01 CHECK (alc_amt_flg IN ('0', '1'));
			ALTER TABLE mgw_io$temp
			ADD CONSTRAINT mgw_io_ck02 CHECK (zero_effect_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_io$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_io$temp(
			act_io_id,
			act_io_id_sub,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			cost_io_typ,
			ac_slip_typ,
			ac_rsn_cd,
			other_wg_cd,
			other_dpt_cd,
			mfg_act_grp,
			bp_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			trd_grp,
			trd_ratio,
			alc_ac_cd,
			alc_amt_flg,
			alc_wg_cd,
			alc_dpt_cd,
			alc_loc_cd,
			alc_oper_cd,
			alc_bp_cd,
			alc_ctg_cd,
			alc_itm_cd,
			alc_itm_sub1,
			alc_itm_sub2,
			alc_itm_sub3,
			alc_lot_no,
			alc_sublot_no,
			alc_sno1,
			alc_sno2,
			alc_sno3,
			alc_sno4,
			alc_itm_mfg_inst_no,
			rec_eval_typ,
			sml_key,
			itm_jnl_cd,
			zero_effect_flg
		)VALUES (
			NEW.act_io_id,
			NEW.act_io_id_sub,
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.ym,
			NEW.ac_dt,
			NEW.mng_dpt_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.cost_io_typ,
			NEW.ac_slip_typ,
			NEW.ac_rsn_cd,
			NEW.other_wg_cd,
			NEW.other_dpt_cd,
			NEW.mfg_act_grp,
			NEW.bp_cd,
			NEW.stk_bp_cd,
			NEW.asst_typ,
			NEW.qty,
			NEW.amt,
			NEW.trd_cur_cd,
			NEW.trd_cur_amt,
			NEW.xrate,
			NEW.trd_grp,
			NEW.trd_ratio,
			NEW.alc_ac_cd,
			NEW.alc_amt_flg,
			NEW.alc_wg_cd,
			NEW.alc_dpt_cd,
			NEW.alc_loc_cd,
			NEW.alc_oper_cd,
			NEW.alc_bp_cd,
			NEW.alc_ctg_cd,
			NEW.alc_itm_cd,
			NEW.alc_itm_sub1,
			NEW.alc_itm_sub2,
			NEW.alc_itm_sub3,
			NEW.alc_lot_no,
			NEW.alc_sublot_no,
			NEW.alc_sno1,
			NEW.alc_sno2,
			NEW.alc_sno3,
			NEW.alc_sno4,
			NEW.alc_itm_mfg_inst_no,
			NEW.rec_eval_typ,
			NEW.sml_key,
			NEW.itm_jnl_cd,
			NEW.zero_effect_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_io$temp
		SET 
			act_io_id = NEW.act_io_id,
			act_io_id_sub = NEW.act_io_id_sub,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			ym = NEW.ym,
			ac_dt = NEW.ac_dt,
			mng_dpt_cd = NEW.mng_dpt_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			cost_io_typ = NEW.cost_io_typ,
			ac_slip_typ = NEW.ac_slip_typ,
			ac_rsn_cd = NEW.ac_rsn_cd,
			other_wg_cd = NEW.other_wg_cd,
			other_dpt_cd = NEW.other_dpt_cd,
			mfg_act_grp = NEW.mfg_act_grp,
			bp_cd = NEW.bp_cd,
			stk_bp_cd = NEW.stk_bp_cd,
			asst_typ = NEW.asst_typ,
			qty = NEW.qty,
			amt = NEW.amt,
			trd_cur_cd = NEW.trd_cur_cd,
			trd_cur_amt = NEW.trd_cur_amt,
			xrate = NEW.xrate,
			trd_grp = NEW.trd_grp,
			trd_ratio = NEW.trd_ratio,
			alc_ac_cd = NEW.alc_ac_cd,
			alc_amt_flg = NEW.alc_amt_flg,
			alc_wg_cd = NEW.alc_wg_cd,
			alc_dpt_cd = NEW.alc_dpt_cd,
			alc_loc_cd = NEW.alc_loc_cd,
			alc_oper_cd = NEW.alc_oper_cd,
			alc_bp_cd = NEW.alc_bp_cd,
			alc_ctg_cd = NEW.alc_ctg_cd,
			alc_itm_cd = NEW.alc_itm_cd,
			alc_itm_sub1 = NEW.alc_itm_sub1,
			alc_itm_sub2 = NEW.alc_itm_sub2,
			alc_itm_sub3 = NEW.alc_itm_sub3,
			alc_lot_no = NEW.alc_lot_no,
			alc_sublot_no = NEW.alc_sublot_no,
			alc_sno1 = NEW.alc_sno1,
			alc_sno2 = NEW.alc_sno2,
			alc_sno3 = NEW.alc_sno3,
			alc_sno4 = NEW.alc_sno4,
			alc_itm_mfg_inst_no = NEW.alc_itm_mfg_inst_no,
			rec_eval_typ = NEW.rec_eval_typ,
			sml_key = NEW.sml_key,
			itm_jnl_cd = NEW.itm_jnl_cd,
			zero_effect_flg = NEW.zero_effect_flg
		WHERE 0=0
		AND act_io_id = OLD.act_io_id
		AND act_io_id_sub = OLD.act_io_id_sub
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND ym = OLD.ym
		AND ac_dt = OLD.ac_dt
		AND mng_dpt_cd = OLD.mng_dpt_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND lot_no = OLD.lot_no
		AND sublot_no = OLD.sublot_no
		AND sno1 = OLD.sno1
		AND sno2 = OLD.sno2
		AND sno3 = OLD.sno3
		AND sno4 = OLD.sno4
		AND cost_io_typ = OLD.cost_io_typ
		AND ac_slip_typ = OLD.ac_slip_typ
		AND (ac_rsn_cd = OLD.ac_rsn_cd OR ac_rsn_cd IS NULL AND OLD.ac_rsn_cd IS NULL)
		AND (other_wg_cd = OLD.other_wg_cd OR other_wg_cd IS NULL AND OLD.other_wg_cd IS NULL)
		AND (other_dpt_cd = OLD.other_dpt_cd OR other_dpt_cd IS NULL AND OLD.other_dpt_cd IS NULL)
		AND (mfg_act_grp = OLD.mfg_act_grp OR mfg_act_grp IS NULL AND OLD.mfg_act_grp IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND (amt = OLD.amt OR amt IS NULL AND OLD.amt IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (trd_grp = OLD.trd_grp OR trd_grp IS NULL AND OLD.trd_grp IS NULL)
		AND (trd_ratio = OLD.trd_ratio OR trd_ratio IS NULL AND OLD.trd_ratio IS NULL)
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND alc_amt_flg = OLD.alc_amt_flg
		AND (alc_wg_cd = OLD.alc_wg_cd OR alc_wg_cd IS NULL AND OLD.alc_wg_cd IS NULL)
		AND (alc_dpt_cd = OLD.alc_dpt_cd OR alc_dpt_cd IS NULL AND OLD.alc_dpt_cd IS NULL)
		AND (alc_loc_cd = OLD.alc_loc_cd OR alc_loc_cd IS NULL AND OLD.alc_loc_cd IS NULL)
		AND (alc_oper_cd = OLD.alc_oper_cd OR alc_oper_cd IS NULL AND OLD.alc_oper_cd IS NULL)
		AND (alc_bp_cd = OLD.alc_bp_cd OR alc_bp_cd IS NULL AND OLD.alc_bp_cd IS NULL)
		AND (alc_ctg_cd = OLD.alc_ctg_cd OR alc_ctg_cd IS NULL AND OLD.alc_ctg_cd IS NULL)
		AND (alc_itm_cd = OLD.alc_itm_cd OR alc_itm_cd IS NULL AND OLD.alc_itm_cd IS NULL)
		AND (alc_itm_sub1 = OLD.alc_itm_sub1 OR alc_itm_sub1 IS NULL AND OLD.alc_itm_sub1 IS NULL)
		AND (alc_itm_sub2 = OLD.alc_itm_sub2 OR alc_itm_sub2 IS NULL AND OLD.alc_itm_sub2 IS NULL)
		AND (alc_itm_sub3 = OLD.alc_itm_sub3 OR alc_itm_sub3 IS NULL AND OLD.alc_itm_sub3 IS NULL)
		AND (alc_lot_no = OLD.alc_lot_no OR alc_lot_no IS NULL AND OLD.alc_lot_no IS NULL)
		AND (alc_sublot_no = OLD.alc_sublot_no OR alc_sublot_no IS NULL AND OLD.alc_sublot_no IS NULL)
		AND (alc_sno1 = OLD.alc_sno1 OR alc_sno1 IS NULL AND OLD.alc_sno1 IS NULL)
		AND (alc_sno2 = OLD.alc_sno2 OR alc_sno2 IS NULL AND OLD.alc_sno2 IS NULL)
		AND (alc_sno3 = OLD.alc_sno3 OR alc_sno3 IS NULL AND OLD.alc_sno3 IS NULL)
		AND (alc_sno4 = OLD.alc_sno4 OR alc_sno4 IS NULL AND OLD.alc_sno4 IS NULL)
		AND (alc_itm_mfg_inst_no = OLD.alc_itm_mfg_inst_no OR alc_itm_mfg_inst_no IS NULL AND OLD.alc_itm_mfg_inst_no IS NULL)
		AND (rec_eval_typ = OLD.rec_eval_typ OR rec_eval_typ IS NULL AND OLD.rec_eval_typ IS NULL)
		AND (sml_key = OLD.sml_key OR sml_key IS NULL AND OLD.sml_key IS NULL)
		AND itm_jnl_cd = OLD.itm_jnl_cd
		AND zero_effect_flg = OLD.zero_effect_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_io$temp
		WHERE 0=0
		AND act_io_id = OLD.act_io_id
		AND act_io_id_sub = OLD.act_io_id_sub
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND ym = OLD.ym
		AND ac_dt = OLD.ac_dt
		AND mng_dpt_cd = OLD.mng_dpt_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND lot_no = OLD.lot_no
		AND sublot_no = OLD.sublot_no
		AND sno1 = OLD.sno1
		AND sno2 = OLD.sno2
		AND sno3 = OLD.sno3
		AND sno4 = OLD.sno4
		AND cost_io_typ = OLD.cost_io_typ
		AND ac_slip_typ = OLD.ac_slip_typ
		AND (ac_rsn_cd = OLD.ac_rsn_cd OR ac_rsn_cd IS NULL AND OLD.ac_rsn_cd IS NULL)
		AND (other_wg_cd = OLD.other_wg_cd OR other_wg_cd IS NULL AND OLD.other_wg_cd IS NULL)
		AND (other_dpt_cd = OLD.other_dpt_cd OR other_dpt_cd IS NULL AND OLD.other_dpt_cd IS NULL)
		AND (mfg_act_grp = OLD.mfg_act_grp OR mfg_act_grp IS NULL AND OLD.mfg_act_grp IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND (amt = OLD.amt OR amt IS NULL AND OLD.amt IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (trd_grp = OLD.trd_grp OR trd_grp IS NULL AND OLD.trd_grp IS NULL)
		AND (trd_ratio = OLD.trd_ratio OR trd_ratio IS NULL AND OLD.trd_ratio IS NULL)
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND alc_amt_flg = OLD.alc_amt_flg
		AND (alc_wg_cd = OLD.alc_wg_cd OR alc_wg_cd IS NULL AND OLD.alc_wg_cd IS NULL)
		AND (alc_dpt_cd = OLD.alc_dpt_cd OR alc_dpt_cd IS NULL AND OLD.alc_dpt_cd IS NULL)
		AND (alc_loc_cd = OLD.alc_loc_cd OR alc_loc_cd IS NULL AND OLD.alc_loc_cd IS NULL)
		AND (alc_oper_cd = OLD.alc_oper_cd OR alc_oper_cd IS NULL AND OLD.alc_oper_cd IS NULL)
		AND (alc_bp_cd = OLD.alc_bp_cd OR alc_bp_cd IS NULL AND OLD.alc_bp_cd IS NULL)
		AND (alc_ctg_cd = OLD.alc_ctg_cd OR alc_ctg_cd IS NULL AND OLD.alc_ctg_cd IS NULL)
		AND (alc_itm_cd = OLD.alc_itm_cd OR alc_itm_cd IS NULL AND OLD.alc_itm_cd IS NULL)
		AND (alc_itm_sub1 = OLD.alc_itm_sub1 OR alc_itm_sub1 IS NULL AND OLD.alc_itm_sub1 IS NULL)
		AND (alc_itm_sub2 = OLD.alc_itm_sub2 OR alc_itm_sub2 IS NULL AND OLD.alc_itm_sub2 IS NULL)
		AND (alc_itm_sub3 = OLD.alc_itm_sub3 OR alc_itm_sub3 IS NULL AND OLD.alc_itm_sub3 IS NULL)
		AND (alc_lot_no = OLD.alc_lot_no OR alc_lot_no IS NULL AND OLD.alc_lot_no IS NULL)
		AND (alc_sublot_no = OLD.alc_sublot_no OR alc_sublot_no IS NULL AND OLD.alc_sublot_no IS NULL)
		AND (alc_sno1 = OLD.alc_sno1 OR alc_sno1 IS NULL AND OLD.alc_sno1 IS NULL)
		AND (alc_sno2 = OLD.alc_sno2 OR alc_sno2 IS NULL AND OLD.alc_sno2 IS NULL)
		AND (alc_sno3 = OLD.alc_sno3 OR alc_sno3 IS NULL AND OLD.alc_sno3 IS NULL)
		AND (alc_sno4 = OLD.alc_sno4 OR alc_sno4 IS NULL AND OLD.alc_sno4 IS NULL)
		AND (alc_itm_mfg_inst_no = OLD.alc_itm_mfg_inst_no OR alc_itm_mfg_inst_no IS NULL AND OLD.alc_itm_mfg_inst_no IS NULL)
		AND (rec_eval_typ = OLD.rec_eval_typ OR rec_eval_typ IS NULL AND OLD.rec_eval_typ IS NULL)
		AND (sml_key = OLD.sml_key OR sml_key IS NULL AND OLD.sml_key IS NULL)
		AND itm_jnl_cd = OLD.itm_jnl_cd
		AND zero_effect_flg = OLD.zero_effect_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_io$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_io
FOR EACH ROW
EXECUTE PROCEDURE mgw_io$func();
;

