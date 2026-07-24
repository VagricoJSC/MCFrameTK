\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_wio()
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
	bp_cd varchar,
	stk_bp_cd varchar,
	asst_typ varchar,
	qty numeric,
	amt numeric,
	trd_cur_cd varchar,
	trd_cur_amt numeric,
	xrate numeric,
	trd_grp varchar,
	rec_eval_typ varchar,
	calc_seq numeric,
	other_calc_seq numeric,
	zero_effect_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_wio$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_wio$temp(
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
				bp_cd varchar (20) NULL,
				stk_bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				amt numeric (21,8) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_amt numeric (21,8) NULL,
				xrate numeric (21,8) NULL,
				trd_grp varchar (50) NULL,
				rec_eval_typ varchar (1) NULL,
				calc_seq numeric (3,0) NULL,
				other_calc_seq numeric (3,0) NULL,
				zero_effect_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_wio_ie01 ON mgw_wio$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			CREATE INDEX mgw_wio_ie02 ON mgw_wio$temp
				USING BTREE (ym, trd_grp, cost_io_typ);
			ALTER TABLE mgw_wio$temp
			ADD CONSTRAINT mgw_wio_pk PRIMARY KEY(act_io_id,act_io_id_sub);
			
			ALTER TABLE mgw_wio$temp
				ADD CONSTRAINT mgw_wio_ck01 CHECK (zero_effect_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_wio$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_wio$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_wio
AS
SELECT *
FROM mgw_wio();
ALTER VIEW mgw_wio ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN sno4 SET DEFAULT '*';
ALTER VIEW mgw_wio ALTER COLUMN zero_effect_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_wio$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_wio$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_wio$temp(
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
				bp_cd varchar (20) NULL,
				stk_bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				amt numeric (21,8) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_amt numeric (21,8) NULL,
				xrate numeric (21,8) NULL,
				trd_grp varchar (50) NULL,
				rec_eval_typ varchar (1) NULL,
				calc_seq numeric (3,0) NULL,
				other_calc_seq numeric (3,0) NULL,
				zero_effect_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_wio_ie01 ON mgw_wio$temp
				USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);
			CREATE INDEX mgw_wio_ie02 ON mgw_wio$temp
				USING BTREE (ym, trd_grp, cost_io_typ);
			ALTER TABLE mgw_wio$temp
			ADD CONSTRAINT mgw_wio_pk PRIMARY KEY(act_io_id,act_io_id_sub);
			
			ALTER TABLE mgw_wio$temp
			ADD CONSTRAINT mgw_wio_ck01 CHECK (zero_effect_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_wio$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_wio$temp(
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
			bp_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			trd_grp,
			rec_eval_typ,
			calc_seq,
			other_calc_seq,
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
			NEW.bp_cd,
			NEW.stk_bp_cd,
			NEW.asst_typ,
			NEW.qty,
			NEW.amt,
			NEW.trd_cur_cd,
			NEW.trd_cur_amt,
			NEW.xrate,
			NEW.trd_grp,
			NEW.rec_eval_typ,
			NEW.calc_seq,
			NEW.other_calc_seq,
			NEW.zero_effect_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_wio$temp
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
			bp_cd = NEW.bp_cd,
			stk_bp_cd = NEW.stk_bp_cd,
			asst_typ = NEW.asst_typ,
			qty = NEW.qty,
			amt = NEW.amt,
			trd_cur_cd = NEW.trd_cur_cd,
			trd_cur_amt = NEW.trd_cur_amt,
			xrate = NEW.xrate,
			trd_grp = NEW.trd_grp,
			rec_eval_typ = NEW.rec_eval_typ,
			calc_seq = NEW.calc_seq,
			other_calc_seq = NEW.other_calc_seq,
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
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND (amt = OLD.amt OR amt IS NULL AND OLD.amt IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (trd_grp = OLD.trd_grp OR trd_grp IS NULL AND OLD.trd_grp IS NULL)
		AND (rec_eval_typ = OLD.rec_eval_typ OR rec_eval_typ IS NULL AND OLD.rec_eval_typ IS NULL)
		AND (calc_seq = OLD.calc_seq OR calc_seq IS NULL AND OLD.calc_seq IS NULL)
		AND (other_calc_seq = OLD.other_calc_seq OR other_calc_seq IS NULL AND OLD.other_calc_seq IS NULL)
		AND zero_effect_flg = OLD.zero_effect_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_wio$temp
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
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND (amt = OLD.amt OR amt IS NULL AND OLD.amt IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (trd_grp = OLD.trd_grp OR trd_grp IS NULL AND OLD.trd_grp IS NULL)
		AND (rec_eval_typ = OLD.rec_eval_typ OR rec_eval_typ IS NULL AND OLD.rec_eval_typ IS NULL)
		AND (calc_seq = OLD.calc_seq OR calc_seq IS NULL AND OLD.calc_seq IS NULL)
		AND (other_calc_seq = OLD.other_calc_seq OR other_calc_seq IS NULL AND OLD.other_calc_seq IS NULL)
		AND zero_effect_flg = OLD.zero_effect_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_wio$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_wio
FOR EACH ROW
EXECUTE PROCEDURE mgw_wio$func();
;

