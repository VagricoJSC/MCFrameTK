\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_wio2()
RETURNS TABLE (
	gi_act_io_id varchar,
	gi_act_io_id_sub varchar,
	gr_act_io_id varchar,
	gr_act_io_id_sub varchar,
	gi_calc_ctg_cd varchar,
	gi_wg_cd varchar,
	gi_ym timestamp(0),
	gi_ac_dt timestamp(0),
	gi_mng_dpt_cd varchar,
	gi_itm_cd varchar,
	gi_itm_sub1 varchar,
	gi_itm_sub2 varchar,
	gi_itm_sub3 varchar,
	gi_lot_no varchar,
	gi_sublot_no varchar,
	gi_sno1 varchar,
	gi_sno2 varchar,
	gi_sno3 varchar,
	gi_sno4 varchar,
	gi_cost_io_typ varchar,
	gi_ac_slip_typ varchar,
	gi_ac_rsn_cd varchar,
	gi_bp_cd varchar,
	gi_stk_bp_cd varchar,
	gi_asst_typ varchar,
	gi_qty numeric,
	gi_amt numeric,
	gi_trd_cur_cd varchar,
	gi_trd_cur_amt numeric,
	gi_xrate numeric,
	gi_trd_grp varchar,
	gi_rec_eval_typ varchar,
	gi_calc_seq numeric,
	gi_zero_effect_flg char,
	gr_calc_ctg_cd varchar,
	gr_wg_cd varchar,
	gr_ym timestamp(0),
	gr_ac_dt timestamp(0),
	gr_mng_dpt_cd varchar,
	gr_itm_cd varchar,
	gr_itm_sub1 varchar,
	gr_itm_sub2 varchar,
	gr_itm_sub3 varchar,
	gr_lot_no varchar,
	gr_sublot_no varchar,
	gr_sno1 varchar,
	gr_sno2 varchar,
	gr_sno3 varchar,
	gr_sno4 varchar,
	gr_cost_io_typ varchar,
	gr_ac_slip_typ varchar,
	gr_ac_rsn_cd varchar,
	gr_bp_cd varchar,
	gr_stk_bp_cd varchar,
	gr_asst_typ varchar,
	gr_qty numeric,
	gr_amt numeric,
	gr_trd_cur_cd varchar,
	gr_trd_cur_amt numeric,
	gr_xrate numeric,
	gr_trd_grp varchar,
	gr_rec_eval_typ varchar,
	gr_calc_seq numeric,
	gr_zero_effect_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_wio2$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_wio2$temp(
				gi_act_io_id varchar (20) NOT NULL,
				gi_act_io_id_sub varchar (3) NOT NULL,
				gr_act_io_id varchar (20) NOT NULL,
				gr_act_io_id_sub varchar (3) NOT NULL,
				gi_calc_ctg_cd varchar (10) NOT NULL,
				gi_wg_cd varchar (10) NOT NULL,
				gi_ym timestamp(0)  NOT NULL,
				gi_ac_dt timestamp(0)  NOT NULL,
				gi_mng_dpt_cd varchar (20) NOT NULL,
				gi_itm_cd varchar (40) NOT NULL,
				gi_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				gi_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				gi_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				gi_lot_no varchar (15) DEFAULT '*' NOT NULL,
				gi_sublot_no varchar (15) DEFAULT '*' NOT NULL,
				gi_sno1 varchar (15) DEFAULT '*' NOT NULL,
				gi_sno2 varchar (15) DEFAULT '*' NOT NULL,
				gi_sno3 varchar (15) DEFAULT '*' NOT NULL,
				gi_sno4 varchar (15) DEFAULT '*' NOT NULL,
				gi_cost_io_typ varchar (2) NOT NULL,
				gi_ac_slip_typ varchar (5) NOT NULL,
				gi_ac_rsn_cd varchar (10) NULL,
				gi_bp_cd varchar (20) NULL,
				gi_stk_bp_cd varchar (20) NULL,
				gi_asst_typ varchar (1) NOT NULL,
				gi_qty numeric (21,8) NOT NULL,
				gi_amt numeric (21,8) NULL,
				gi_trd_cur_cd varchar (3) NULL,
				gi_trd_cur_amt numeric (21,8) NULL,
				gi_xrate numeric (21,8) NULL,
				gi_trd_grp varchar (50) NULL,
				gi_rec_eval_typ varchar (1) NULL,
				gi_calc_seq numeric (3,0) NULL,
				gi_zero_effect_flg char (1) DEFAULT '0' NOT NULL,
				gr_calc_ctg_cd varchar (10) NOT NULL,
				gr_wg_cd varchar (10) NOT NULL,
				gr_ym timestamp(0)  NOT NULL,
				gr_ac_dt timestamp(0)  NOT NULL,
				gr_mng_dpt_cd varchar (20) NOT NULL,
				gr_itm_cd varchar (40) NOT NULL,
				gr_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				gr_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				gr_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				gr_lot_no varchar (15) DEFAULT '*' NOT NULL,
				gr_sublot_no varchar (15) DEFAULT '*' NOT NULL,
				gr_sno1 varchar (15) DEFAULT '*' NOT NULL,
				gr_sno2 varchar (15) DEFAULT '*' NOT NULL,
				gr_sno3 varchar (15) DEFAULT '*' NOT NULL,
				gr_sno4 varchar (15) DEFAULT '*' NOT NULL,
				gr_cost_io_typ varchar (2) NOT NULL,
				gr_ac_slip_typ varchar (5) NOT NULL,
				gr_ac_rsn_cd varchar (10) NULL,
				gr_bp_cd varchar (20) NULL,
				gr_stk_bp_cd varchar (20) NULL,
				gr_asst_typ varchar (1) NOT NULL,
				gr_qty numeric (21,8) NOT NULL,
				gr_amt numeric (21,8) NULL,
				gr_trd_cur_cd varchar (3) NULL,
				gr_trd_cur_amt numeric (21,8) NULL,
				gr_xrate numeric (21,8) NULL,
				gr_trd_grp varchar (50) NULL,
				gr_rec_eval_typ varchar (1) NULL,
				gr_calc_seq numeric (3,0) NULL,
				gr_zero_effect_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_wio2_ie01 ON mgw_wio2$temp
				USING BTREE (gi_itm_cd, gi_itm_sub1, gi_itm_sub2, gi_itm_sub3);
			CREATE INDEX mgw_wio2_ie02 ON mgw_wio2$temp
				USING BTREE (gr_itm_cd, gr_itm_sub1, gr_itm_sub2, gr_itm_sub3);
			ALTER TABLE mgw_wio2$temp
			ADD CONSTRAINT mgw_wio2_pk PRIMARY KEY(gi_act_io_id,gi_act_io_id_sub,gr_act_io_id,gr_act_io_id_sub);
			
			ALTER TABLE mgw_wio2$temp
				ADD CONSTRAINT mgw_wio2_ck01 CHECK (gi_zero_effect_flg IN ('0', '1'));
			ALTER TABLE mgw_wio2$temp
				ADD CONSTRAINT mgw_wio2_ck02 CHECK (gr_zero_effect_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_wio2$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_wio2$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_wio2
AS
SELECT *
FROM mgw_wio2();
ALTER VIEW mgw_wio2 ALTER COLUMN gi_itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_lot_no SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_sublot_no SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_sno1 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_sno2 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_sno3 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_sno4 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gi_zero_effect_flg SET DEFAULT '0';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_lot_no SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_sublot_no SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_sno1 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_sno2 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_sno3 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_sno4 SET DEFAULT '*';
ALTER VIEW mgw_wio2 ALTER COLUMN gr_zero_effect_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_wio2$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_wio2$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_wio2$temp(
				gi_act_io_id varchar (20) NOT NULL,
				gi_act_io_id_sub varchar (3) NOT NULL,
				gr_act_io_id varchar (20) NOT NULL,
				gr_act_io_id_sub varchar (3) NOT NULL,
				gi_calc_ctg_cd varchar (10) NOT NULL,
				gi_wg_cd varchar (10) NOT NULL,
				gi_ym timestamp(0)  NOT NULL,
				gi_ac_dt timestamp(0)  NOT NULL,
				gi_mng_dpt_cd varchar (20) NOT NULL,
				gi_itm_cd varchar (40) NOT NULL,
				gi_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				gi_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				gi_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				gi_lot_no varchar (15) DEFAULT '*' NOT NULL,
				gi_sublot_no varchar (15) DEFAULT '*' NOT NULL,
				gi_sno1 varchar (15) DEFAULT '*' NOT NULL,
				gi_sno2 varchar (15) DEFAULT '*' NOT NULL,
				gi_sno3 varchar (15) DEFAULT '*' NOT NULL,
				gi_sno4 varchar (15) DEFAULT '*' NOT NULL,
				gi_cost_io_typ varchar (2) NOT NULL,
				gi_ac_slip_typ varchar (5) NOT NULL,
				gi_ac_rsn_cd varchar (10) NULL,
				gi_bp_cd varchar (20) NULL,
				gi_stk_bp_cd varchar (20) NULL,
				gi_asst_typ varchar (1) NOT NULL,
				gi_qty numeric (21,8) NOT NULL,
				gi_amt numeric (21,8) NULL,
				gi_trd_cur_cd varchar (3) NULL,
				gi_trd_cur_amt numeric (21,8) NULL,
				gi_xrate numeric (21,8) NULL,
				gi_trd_grp varchar (50) NULL,
				gi_rec_eval_typ varchar (1) NULL,
				gi_calc_seq numeric (3,0) NULL,
				gi_zero_effect_flg char (1) DEFAULT '0' NOT NULL,
				gr_calc_ctg_cd varchar (10) NOT NULL,
				gr_wg_cd varchar (10) NOT NULL,
				gr_ym timestamp(0)  NOT NULL,
				gr_ac_dt timestamp(0)  NOT NULL,
				gr_mng_dpt_cd varchar (20) NOT NULL,
				gr_itm_cd varchar (40) NOT NULL,
				gr_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				gr_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				gr_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				gr_lot_no varchar (15) DEFAULT '*' NOT NULL,
				gr_sublot_no varchar (15) DEFAULT '*' NOT NULL,
				gr_sno1 varchar (15) DEFAULT '*' NOT NULL,
				gr_sno2 varchar (15) DEFAULT '*' NOT NULL,
				gr_sno3 varchar (15) DEFAULT '*' NOT NULL,
				gr_sno4 varchar (15) DEFAULT '*' NOT NULL,
				gr_cost_io_typ varchar (2) NOT NULL,
				gr_ac_slip_typ varchar (5) NOT NULL,
				gr_ac_rsn_cd varchar (10) NULL,
				gr_bp_cd varchar (20) NULL,
				gr_stk_bp_cd varchar (20) NULL,
				gr_asst_typ varchar (1) NOT NULL,
				gr_qty numeric (21,8) NOT NULL,
				gr_amt numeric (21,8) NULL,
				gr_trd_cur_cd varchar (3) NULL,
				gr_trd_cur_amt numeric (21,8) NULL,
				gr_xrate numeric (21,8) NULL,
				gr_trd_grp varchar (50) NULL,
				gr_rec_eval_typ varchar (1) NULL,
				gr_calc_seq numeric (3,0) NULL,
				gr_zero_effect_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_wio2_ie01 ON mgw_wio2$temp
				USING BTREE (gi_itm_cd, gi_itm_sub1, gi_itm_sub2, gi_itm_sub3);
			CREATE INDEX mgw_wio2_ie02 ON mgw_wio2$temp
				USING BTREE (gr_itm_cd, gr_itm_sub1, gr_itm_sub2, gr_itm_sub3);
			ALTER TABLE mgw_wio2$temp
			ADD CONSTRAINT mgw_wio2_pk PRIMARY KEY(gi_act_io_id,gi_act_io_id_sub,gr_act_io_id,gr_act_io_id_sub);
			
			ALTER TABLE mgw_wio2$temp
			ADD CONSTRAINT mgw_wio2_ck01 CHECK (gi_zero_effect_flg IN ('0', '1'));
			ALTER TABLE mgw_wio2$temp
			ADD CONSTRAINT mgw_wio2_ck02 CHECK (gr_zero_effect_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_wio2$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_wio2$temp(
			gi_act_io_id,
			gi_act_io_id_sub,
			gr_act_io_id,
			gr_act_io_id_sub,
			gi_calc_ctg_cd,
			gi_wg_cd,
			gi_ym,
			gi_ac_dt,
			gi_mng_dpt_cd,
			gi_itm_cd,
			gi_itm_sub1,
			gi_itm_sub2,
			gi_itm_sub3,
			gi_lot_no,
			gi_sublot_no,
			gi_sno1,
			gi_sno2,
			gi_sno3,
			gi_sno4,
			gi_cost_io_typ,
			gi_ac_slip_typ,
			gi_ac_rsn_cd,
			gi_bp_cd,
			gi_stk_bp_cd,
			gi_asst_typ,
			gi_qty,
			gi_amt,
			gi_trd_cur_cd,
			gi_trd_cur_amt,
			gi_xrate,
			gi_trd_grp,
			gi_rec_eval_typ,
			gi_calc_seq,
			gi_zero_effect_flg,
			gr_calc_ctg_cd,
			gr_wg_cd,
			gr_ym,
			gr_ac_dt,
			gr_mng_dpt_cd,
			gr_itm_cd,
			gr_itm_sub1,
			gr_itm_sub2,
			gr_itm_sub3,
			gr_lot_no,
			gr_sublot_no,
			gr_sno1,
			gr_sno2,
			gr_sno3,
			gr_sno4,
			gr_cost_io_typ,
			gr_ac_slip_typ,
			gr_ac_rsn_cd,
			gr_bp_cd,
			gr_stk_bp_cd,
			gr_asst_typ,
			gr_qty,
			gr_amt,
			gr_trd_cur_cd,
			gr_trd_cur_amt,
			gr_xrate,
			gr_trd_grp,
			gr_rec_eval_typ,
			gr_calc_seq,
			gr_zero_effect_flg
		)VALUES (
			NEW.gi_act_io_id,
			NEW.gi_act_io_id_sub,
			NEW.gr_act_io_id,
			NEW.gr_act_io_id_sub,
			NEW.gi_calc_ctg_cd,
			NEW.gi_wg_cd,
			NEW.gi_ym,
			NEW.gi_ac_dt,
			NEW.gi_mng_dpt_cd,
			NEW.gi_itm_cd,
			NEW.gi_itm_sub1,
			NEW.gi_itm_sub2,
			NEW.gi_itm_sub3,
			NEW.gi_lot_no,
			NEW.gi_sublot_no,
			NEW.gi_sno1,
			NEW.gi_sno2,
			NEW.gi_sno3,
			NEW.gi_sno4,
			NEW.gi_cost_io_typ,
			NEW.gi_ac_slip_typ,
			NEW.gi_ac_rsn_cd,
			NEW.gi_bp_cd,
			NEW.gi_stk_bp_cd,
			NEW.gi_asst_typ,
			NEW.gi_qty,
			NEW.gi_amt,
			NEW.gi_trd_cur_cd,
			NEW.gi_trd_cur_amt,
			NEW.gi_xrate,
			NEW.gi_trd_grp,
			NEW.gi_rec_eval_typ,
			NEW.gi_calc_seq,
			NEW.gi_zero_effect_flg,
			NEW.gr_calc_ctg_cd,
			NEW.gr_wg_cd,
			NEW.gr_ym,
			NEW.gr_ac_dt,
			NEW.gr_mng_dpt_cd,
			NEW.gr_itm_cd,
			NEW.gr_itm_sub1,
			NEW.gr_itm_sub2,
			NEW.gr_itm_sub3,
			NEW.gr_lot_no,
			NEW.gr_sublot_no,
			NEW.gr_sno1,
			NEW.gr_sno2,
			NEW.gr_sno3,
			NEW.gr_sno4,
			NEW.gr_cost_io_typ,
			NEW.gr_ac_slip_typ,
			NEW.gr_ac_rsn_cd,
			NEW.gr_bp_cd,
			NEW.gr_stk_bp_cd,
			NEW.gr_asst_typ,
			NEW.gr_qty,
			NEW.gr_amt,
			NEW.gr_trd_cur_cd,
			NEW.gr_trd_cur_amt,
			NEW.gr_xrate,
			NEW.gr_trd_grp,
			NEW.gr_rec_eval_typ,
			NEW.gr_calc_seq,
			NEW.gr_zero_effect_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_wio2$temp
		SET 
			gi_act_io_id = NEW.gi_act_io_id,
			gi_act_io_id_sub = NEW.gi_act_io_id_sub,
			gr_act_io_id = NEW.gr_act_io_id,
			gr_act_io_id_sub = NEW.gr_act_io_id_sub,
			gi_calc_ctg_cd = NEW.gi_calc_ctg_cd,
			gi_wg_cd = NEW.gi_wg_cd,
			gi_ym = NEW.gi_ym,
			gi_ac_dt = NEW.gi_ac_dt,
			gi_mng_dpt_cd = NEW.gi_mng_dpt_cd,
			gi_itm_cd = NEW.gi_itm_cd,
			gi_itm_sub1 = NEW.gi_itm_sub1,
			gi_itm_sub2 = NEW.gi_itm_sub2,
			gi_itm_sub3 = NEW.gi_itm_sub3,
			gi_lot_no = NEW.gi_lot_no,
			gi_sublot_no = NEW.gi_sublot_no,
			gi_sno1 = NEW.gi_sno1,
			gi_sno2 = NEW.gi_sno2,
			gi_sno3 = NEW.gi_sno3,
			gi_sno4 = NEW.gi_sno4,
			gi_cost_io_typ = NEW.gi_cost_io_typ,
			gi_ac_slip_typ = NEW.gi_ac_slip_typ,
			gi_ac_rsn_cd = NEW.gi_ac_rsn_cd,
			gi_bp_cd = NEW.gi_bp_cd,
			gi_stk_bp_cd = NEW.gi_stk_bp_cd,
			gi_asst_typ = NEW.gi_asst_typ,
			gi_qty = NEW.gi_qty,
			gi_amt = NEW.gi_amt,
			gi_trd_cur_cd = NEW.gi_trd_cur_cd,
			gi_trd_cur_amt = NEW.gi_trd_cur_amt,
			gi_xrate = NEW.gi_xrate,
			gi_trd_grp = NEW.gi_trd_grp,
			gi_rec_eval_typ = NEW.gi_rec_eval_typ,
			gi_calc_seq = NEW.gi_calc_seq,
			gi_zero_effect_flg = NEW.gi_zero_effect_flg,
			gr_calc_ctg_cd = NEW.gr_calc_ctg_cd,
			gr_wg_cd = NEW.gr_wg_cd,
			gr_ym = NEW.gr_ym,
			gr_ac_dt = NEW.gr_ac_dt,
			gr_mng_dpt_cd = NEW.gr_mng_dpt_cd,
			gr_itm_cd = NEW.gr_itm_cd,
			gr_itm_sub1 = NEW.gr_itm_sub1,
			gr_itm_sub2 = NEW.gr_itm_sub2,
			gr_itm_sub3 = NEW.gr_itm_sub3,
			gr_lot_no = NEW.gr_lot_no,
			gr_sublot_no = NEW.gr_sublot_no,
			gr_sno1 = NEW.gr_sno1,
			gr_sno2 = NEW.gr_sno2,
			gr_sno3 = NEW.gr_sno3,
			gr_sno4 = NEW.gr_sno4,
			gr_cost_io_typ = NEW.gr_cost_io_typ,
			gr_ac_slip_typ = NEW.gr_ac_slip_typ,
			gr_ac_rsn_cd = NEW.gr_ac_rsn_cd,
			gr_bp_cd = NEW.gr_bp_cd,
			gr_stk_bp_cd = NEW.gr_stk_bp_cd,
			gr_asst_typ = NEW.gr_asst_typ,
			gr_qty = NEW.gr_qty,
			gr_amt = NEW.gr_amt,
			gr_trd_cur_cd = NEW.gr_trd_cur_cd,
			gr_trd_cur_amt = NEW.gr_trd_cur_amt,
			gr_xrate = NEW.gr_xrate,
			gr_trd_grp = NEW.gr_trd_grp,
			gr_rec_eval_typ = NEW.gr_rec_eval_typ,
			gr_calc_seq = NEW.gr_calc_seq,
			gr_zero_effect_flg = NEW.gr_zero_effect_flg
		WHERE 0=0
		AND gi_act_io_id = OLD.gi_act_io_id
		AND gi_act_io_id_sub = OLD.gi_act_io_id_sub
		AND gr_act_io_id = OLD.gr_act_io_id
		AND gr_act_io_id_sub = OLD.gr_act_io_id_sub
		AND gi_calc_ctg_cd = OLD.gi_calc_ctg_cd
		AND gi_wg_cd = OLD.gi_wg_cd
		AND gi_ym = OLD.gi_ym
		AND gi_ac_dt = OLD.gi_ac_dt
		AND gi_mng_dpt_cd = OLD.gi_mng_dpt_cd
		AND gi_itm_cd = OLD.gi_itm_cd
		AND gi_itm_sub1 = OLD.gi_itm_sub1
		AND gi_itm_sub2 = OLD.gi_itm_sub2
		AND gi_itm_sub3 = OLD.gi_itm_sub3
		AND gi_lot_no = OLD.gi_lot_no
		AND gi_sublot_no = OLD.gi_sublot_no
		AND gi_sno1 = OLD.gi_sno1
		AND gi_sno2 = OLD.gi_sno2
		AND gi_sno3 = OLD.gi_sno3
		AND gi_sno4 = OLD.gi_sno4
		AND gi_cost_io_typ = OLD.gi_cost_io_typ
		AND gi_ac_slip_typ = OLD.gi_ac_slip_typ
		AND (gi_ac_rsn_cd = OLD.gi_ac_rsn_cd OR gi_ac_rsn_cd IS NULL AND OLD.gi_ac_rsn_cd IS NULL)
		AND (gi_bp_cd = OLD.gi_bp_cd OR gi_bp_cd IS NULL AND OLD.gi_bp_cd IS NULL)
		AND (gi_stk_bp_cd = OLD.gi_stk_bp_cd OR gi_stk_bp_cd IS NULL AND OLD.gi_stk_bp_cd IS NULL)
		AND gi_asst_typ = OLD.gi_asst_typ
		AND gi_qty = OLD.gi_qty
		AND (gi_amt = OLD.gi_amt OR gi_amt IS NULL AND OLD.gi_amt IS NULL)
		AND (gi_trd_cur_cd = OLD.gi_trd_cur_cd OR gi_trd_cur_cd IS NULL AND OLD.gi_trd_cur_cd IS NULL)
		AND (gi_trd_cur_amt = OLD.gi_trd_cur_amt OR gi_trd_cur_amt IS NULL AND OLD.gi_trd_cur_amt IS NULL)
		AND (gi_xrate = OLD.gi_xrate OR gi_xrate IS NULL AND OLD.gi_xrate IS NULL)
		AND (gi_trd_grp = OLD.gi_trd_grp OR gi_trd_grp IS NULL AND OLD.gi_trd_grp IS NULL)
		AND (gi_rec_eval_typ = OLD.gi_rec_eval_typ OR gi_rec_eval_typ IS NULL AND OLD.gi_rec_eval_typ IS NULL)
		AND (gi_calc_seq = OLD.gi_calc_seq OR gi_calc_seq IS NULL AND OLD.gi_calc_seq IS NULL)
		AND gi_zero_effect_flg = OLD.gi_zero_effect_flg
		AND gr_calc_ctg_cd = OLD.gr_calc_ctg_cd
		AND gr_wg_cd = OLD.gr_wg_cd
		AND gr_ym = OLD.gr_ym
		AND gr_ac_dt = OLD.gr_ac_dt
		AND gr_mng_dpt_cd = OLD.gr_mng_dpt_cd
		AND gr_itm_cd = OLD.gr_itm_cd
		AND gr_itm_sub1 = OLD.gr_itm_sub1
		AND gr_itm_sub2 = OLD.gr_itm_sub2
		AND gr_itm_sub3 = OLD.gr_itm_sub3
		AND gr_lot_no = OLD.gr_lot_no
		AND gr_sublot_no = OLD.gr_sublot_no
		AND gr_sno1 = OLD.gr_sno1
		AND gr_sno2 = OLD.gr_sno2
		AND gr_sno3 = OLD.gr_sno3
		AND gr_sno4 = OLD.gr_sno4
		AND gr_cost_io_typ = OLD.gr_cost_io_typ
		AND gr_ac_slip_typ = OLD.gr_ac_slip_typ
		AND (gr_ac_rsn_cd = OLD.gr_ac_rsn_cd OR gr_ac_rsn_cd IS NULL AND OLD.gr_ac_rsn_cd IS NULL)
		AND (gr_bp_cd = OLD.gr_bp_cd OR gr_bp_cd IS NULL AND OLD.gr_bp_cd IS NULL)
		AND (gr_stk_bp_cd = OLD.gr_stk_bp_cd OR gr_stk_bp_cd IS NULL AND OLD.gr_stk_bp_cd IS NULL)
		AND gr_asst_typ = OLD.gr_asst_typ
		AND gr_qty = OLD.gr_qty
		AND (gr_amt = OLD.gr_amt OR gr_amt IS NULL AND OLD.gr_amt IS NULL)
		AND (gr_trd_cur_cd = OLD.gr_trd_cur_cd OR gr_trd_cur_cd IS NULL AND OLD.gr_trd_cur_cd IS NULL)
		AND (gr_trd_cur_amt = OLD.gr_trd_cur_amt OR gr_trd_cur_amt IS NULL AND OLD.gr_trd_cur_amt IS NULL)
		AND (gr_xrate = OLD.gr_xrate OR gr_xrate IS NULL AND OLD.gr_xrate IS NULL)
		AND (gr_trd_grp = OLD.gr_trd_grp OR gr_trd_grp IS NULL AND OLD.gr_trd_grp IS NULL)
		AND (gr_rec_eval_typ = OLD.gr_rec_eval_typ OR gr_rec_eval_typ IS NULL AND OLD.gr_rec_eval_typ IS NULL)
		AND (gr_calc_seq = OLD.gr_calc_seq OR gr_calc_seq IS NULL AND OLD.gr_calc_seq IS NULL)
		AND gr_zero_effect_flg = OLD.gr_zero_effect_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_wio2$temp
		WHERE 0=0
		AND gi_act_io_id = OLD.gi_act_io_id
		AND gi_act_io_id_sub = OLD.gi_act_io_id_sub
		AND gr_act_io_id = OLD.gr_act_io_id
		AND gr_act_io_id_sub = OLD.gr_act_io_id_sub
		AND gi_calc_ctg_cd = OLD.gi_calc_ctg_cd
		AND gi_wg_cd = OLD.gi_wg_cd
		AND gi_ym = OLD.gi_ym
		AND gi_ac_dt = OLD.gi_ac_dt
		AND gi_mng_dpt_cd = OLD.gi_mng_dpt_cd
		AND gi_itm_cd = OLD.gi_itm_cd
		AND gi_itm_sub1 = OLD.gi_itm_sub1
		AND gi_itm_sub2 = OLD.gi_itm_sub2
		AND gi_itm_sub3 = OLD.gi_itm_sub3
		AND gi_lot_no = OLD.gi_lot_no
		AND gi_sublot_no = OLD.gi_sublot_no
		AND gi_sno1 = OLD.gi_sno1
		AND gi_sno2 = OLD.gi_sno2
		AND gi_sno3 = OLD.gi_sno3
		AND gi_sno4 = OLD.gi_sno4
		AND gi_cost_io_typ = OLD.gi_cost_io_typ
		AND gi_ac_slip_typ = OLD.gi_ac_slip_typ
		AND (gi_ac_rsn_cd = OLD.gi_ac_rsn_cd OR gi_ac_rsn_cd IS NULL AND OLD.gi_ac_rsn_cd IS NULL)
		AND (gi_bp_cd = OLD.gi_bp_cd OR gi_bp_cd IS NULL AND OLD.gi_bp_cd IS NULL)
		AND (gi_stk_bp_cd = OLD.gi_stk_bp_cd OR gi_stk_bp_cd IS NULL AND OLD.gi_stk_bp_cd IS NULL)
		AND gi_asst_typ = OLD.gi_asst_typ
		AND gi_qty = OLD.gi_qty
		AND (gi_amt = OLD.gi_amt OR gi_amt IS NULL AND OLD.gi_amt IS NULL)
		AND (gi_trd_cur_cd = OLD.gi_trd_cur_cd OR gi_trd_cur_cd IS NULL AND OLD.gi_trd_cur_cd IS NULL)
		AND (gi_trd_cur_amt = OLD.gi_trd_cur_amt OR gi_trd_cur_amt IS NULL AND OLD.gi_trd_cur_amt IS NULL)
		AND (gi_xrate = OLD.gi_xrate OR gi_xrate IS NULL AND OLD.gi_xrate IS NULL)
		AND (gi_trd_grp = OLD.gi_trd_grp OR gi_trd_grp IS NULL AND OLD.gi_trd_grp IS NULL)
		AND (gi_rec_eval_typ = OLD.gi_rec_eval_typ OR gi_rec_eval_typ IS NULL AND OLD.gi_rec_eval_typ IS NULL)
		AND (gi_calc_seq = OLD.gi_calc_seq OR gi_calc_seq IS NULL AND OLD.gi_calc_seq IS NULL)
		AND gi_zero_effect_flg = OLD.gi_zero_effect_flg
		AND gr_calc_ctg_cd = OLD.gr_calc_ctg_cd
		AND gr_wg_cd = OLD.gr_wg_cd
		AND gr_ym = OLD.gr_ym
		AND gr_ac_dt = OLD.gr_ac_dt
		AND gr_mng_dpt_cd = OLD.gr_mng_dpt_cd
		AND gr_itm_cd = OLD.gr_itm_cd
		AND gr_itm_sub1 = OLD.gr_itm_sub1
		AND gr_itm_sub2 = OLD.gr_itm_sub2
		AND gr_itm_sub3 = OLD.gr_itm_sub3
		AND gr_lot_no = OLD.gr_lot_no
		AND gr_sublot_no = OLD.gr_sublot_no
		AND gr_sno1 = OLD.gr_sno1
		AND gr_sno2 = OLD.gr_sno2
		AND gr_sno3 = OLD.gr_sno3
		AND gr_sno4 = OLD.gr_sno4
		AND gr_cost_io_typ = OLD.gr_cost_io_typ
		AND gr_ac_slip_typ = OLD.gr_ac_slip_typ
		AND (gr_ac_rsn_cd = OLD.gr_ac_rsn_cd OR gr_ac_rsn_cd IS NULL AND OLD.gr_ac_rsn_cd IS NULL)
		AND (gr_bp_cd = OLD.gr_bp_cd OR gr_bp_cd IS NULL AND OLD.gr_bp_cd IS NULL)
		AND (gr_stk_bp_cd = OLD.gr_stk_bp_cd OR gr_stk_bp_cd IS NULL AND OLD.gr_stk_bp_cd IS NULL)
		AND gr_asst_typ = OLD.gr_asst_typ
		AND gr_qty = OLD.gr_qty
		AND (gr_amt = OLD.gr_amt OR gr_amt IS NULL AND OLD.gr_amt IS NULL)
		AND (gr_trd_cur_cd = OLD.gr_trd_cur_cd OR gr_trd_cur_cd IS NULL AND OLD.gr_trd_cur_cd IS NULL)
		AND (gr_trd_cur_amt = OLD.gr_trd_cur_amt OR gr_trd_cur_amt IS NULL AND OLD.gr_trd_cur_amt IS NULL)
		AND (gr_xrate = OLD.gr_xrate OR gr_xrate IS NULL AND OLD.gr_xrate IS NULL)
		AND (gr_trd_grp = OLD.gr_trd_grp OR gr_trd_grp IS NULL AND OLD.gr_trd_grp IS NULL)
		AND (gr_rec_eval_typ = OLD.gr_rec_eval_typ OR gr_rec_eval_typ IS NULL AND OLD.gr_rec_eval_typ IS NULL)
		AND (gr_calc_seq = OLD.gr_calc_seq OR gr_calc_seq IS NULL AND OLD.gr_calc_seq IS NULL)
		AND gr_zero_effect_flg = OLD.gr_zero_effect_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_wio2$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_wio2
FOR EACH ROW
EXECUTE PROCEDURE mgw_wio2$func();
;

