\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_inpt_if()
RETURNS TABLE (
	calc_ctg_cd varchar,
	wg_cd varchar,
	ym timestamp(0),
	ac_dt timestamp(0),
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	par_lot_no varchar,
	par_sublot_no varchar,
	par_sno1 varchar,
	par_sno2 varchar,
	par_sno3 varchar,
	par_sno4 varchar,
	itm_mfg_inst_no varchar,
	mfg_act_no varchar,
	oper_act_no varchar,
	loc_cd varchar,
	str_ln_cd varchar,
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
	ac_slip_typ varchar,
	ac_rsn_cd varchar,
	stk_bp_cd varchar,
	asst_typ varchar,
	qty numeric,
	amt numeric,
	trd_cur_cd varchar,
	trd_cur_amt numeric,
	xrate numeric,
	rec_eval_typ varchar,
	expns_cd varchar,
	slip_no varchar,
	slip_seq_no numeric,
	rmrks varchar,
	sub_char1 varchar,
	sub_char2 varchar,
	sub_char3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_inpt_if$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_inpt_if$temp(
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ym timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				par_itm_cd varchar (40) NOT NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				par_lot_no varchar (15) DEFAULT '*' NOT NULL,
				par_sublot_no varchar (15) DEFAULT '*' NOT NULL,
				par_sno1 varchar (15) DEFAULT '*' NOT NULL,
				par_sno2 varchar (15) DEFAULT '*' NOT NULL,
				par_sno3 varchar (15) DEFAULT '*' NOT NULL,
				par_sno4 varchar (15) DEFAULT '*' NOT NULL,
				itm_mfg_inst_no varchar (15) NOT NULL,
				mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
				oper_act_no varchar (15) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
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
				ac_slip_typ varchar (5) NOT NULL,
				ac_rsn_cd varchar (10) NULL,
				stk_bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				amt numeric (21,8) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_amt numeric (21,8) NULL,
				xrate numeric (21,8) NULL,
				rec_eval_typ varchar (1) NULL,
				expns_cd varchar (20) NULL,
				slip_no varchar (15) NULL,
				slip_seq_no numeric (4,0) NULL,
				rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_inpt_if_ie01 ON mgw_act_inpt_if$temp
				USING BTREE (par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_inpt_if$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_inpt_if$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_inpt_if
AS
SELECT *
FROM mgw_act_inpt_if();
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_lot_no SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_sublot_no SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_sno1 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_sno2 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_sno3 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN par_sno4 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN mfg_act_no SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN oper_act_no SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN str_ln_cd SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_act_inpt_if ALTER COLUMN sno4 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_act_inpt_if$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_inpt_if$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_inpt_if$temp(
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ym timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				par_itm_cd varchar (40) NOT NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				par_lot_no varchar (15) DEFAULT '*' NOT NULL,
				par_sublot_no varchar (15) DEFAULT '*' NOT NULL,
				par_sno1 varchar (15) DEFAULT '*' NOT NULL,
				par_sno2 varchar (15) DEFAULT '*' NOT NULL,
				par_sno3 varchar (15) DEFAULT '*' NOT NULL,
				par_sno4 varchar (15) DEFAULT '*' NOT NULL,
				itm_mfg_inst_no varchar (15) NOT NULL,
				mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
				oper_act_no varchar (15) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) NOT NULL,
				str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
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
				ac_slip_typ varchar (5) NOT NULL,
				ac_rsn_cd varchar (10) NULL,
				stk_bp_cd varchar (20) NULL,
				asst_typ varchar (1) NOT NULL,
				qty numeric (21,8) NOT NULL,
				amt numeric (21,8) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_amt numeric (21,8) NULL,
				xrate numeric (21,8) NULL,
				rec_eval_typ varchar (1) NULL,
				expns_cd varchar (20) NULL,
				slip_no varchar (15) NULL,
				slip_seq_no numeric (4,0) NULL,
				rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_inpt_if_ie01 ON mgw_act_inpt_if$temp
				USING BTREE (par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_inpt_if$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_inpt_if$temp(
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_lot_no,
			par_sublot_no,
			par_sno1,
			par_sno2,
			par_sno3,
			par_sno4,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
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
			ac_slip_typ,
			ac_rsn_cd,
			stk_bp_cd,
			asst_typ,
			qty,
			amt,
			trd_cur_cd,
			trd_cur_amt,
			xrate,
			rec_eval_typ,
			expns_cd,
			slip_no,
			slip_seq_no,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		)VALUES (
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.ym,
			NEW.ac_dt,
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.par_lot_no,
			NEW.par_sublot_no,
			NEW.par_sno1,
			NEW.par_sno2,
			NEW.par_sno3,
			NEW.par_sno4,
			NEW.itm_mfg_inst_no,
			NEW.mfg_act_no,
			NEW.oper_act_no,
			NEW.loc_cd,
			NEW.str_ln_cd,
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
			NEW.ac_slip_typ,
			NEW.ac_rsn_cd,
			NEW.stk_bp_cd,
			NEW.asst_typ,
			NEW.qty,
			NEW.amt,
			NEW.trd_cur_cd,
			NEW.trd_cur_amt,
			NEW.xrate,
			NEW.rec_eval_typ,
			NEW.expns_cd,
			NEW.slip_no,
			NEW.slip_seq_no,
			NEW.rmrks,
			NEW.sub_char1,
			NEW.sub_char2,
			NEW.sub_char3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_inpt_if$temp
		SET 
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			ym = NEW.ym,
			ac_dt = NEW.ac_dt,
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			par_lot_no = NEW.par_lot_no,
			par_sublot_no = NEW.par_sublot_no,
			par_sno1 = NEW.par_sno1,
			par_sno2 = NEW.par_sno2,
			par_sno3 = NEW.par_sno3,
			par_sno4 = NEW.par_sno4,
			itm_mfg_inst_no = NEW.itm_mfg_inst_no,
			mfg_act_no = NEW.mfg_act_no,
			oper_act_no = NEW.oper_act_no,
			loc_cd = NEW.loc_cd,
			str_ln_cd = NEW.str_ln_cd,
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
			ac_slip_typ = NEW.ac_slip_typ,
			ac_rsn_cd = NEW.ac_rsn_cd,
			stk_bp_cd = NEW.stk_bp_cd,
			asst_typ = NEW.asst_typ,
			qty = NEW.qty,
			amt = NEW.amt,
			trd_cur_cd = NEW.trd_cur_cd,
			trd_cur_amt = NEW.trd_cur_amt,
			xrate = NEW.xrate,
			rec_eval_typ = NEW.rec_eval_typ,
			expns_cd = NEW.expns_cd,
			slip_no = NEW.slip_no,
			slip_seq_no = NEW.slip_seq_no,
			rmrks = NEW.rmrks,
			sub_char1 = NEW.sub_char1,
			sub_char2 = NEW.sub_char2,
			sub_char3 = NEW.sub_char3
		WHERE 0=0
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND ym = OLD.ym
		AND ac_dt = OLD.ac_dt
		AND par_itm_cd = OLD.par_itm_cd
		AND par_itm_sub1 = OLD.par_itm_sub1
		AND par_itm_sub2 = OLD.par_itm_sub2
		AND par_itm_sub3 = OLD.par_itm_sub3
		AND par_lot_no = OLD.par_lot_no
		AND par_sublot_no = OLD.par_sublot_no
		AND par_sno1 = OLD.par_sno1
		AND par_sno2 = OLD.par_sno2
		AND par_sno3 = OLD.par_sno3
		AND par_sno4 = OLD.par_sno4
		AND itm_mfg_inst_no = OLD.itm_mfg_inst_no
		AND mfg_act_no = OLD.mfg_act_no
		AND oper_act_no = OLD.oper_act_no
		AND loc_cd = OLD.loc_cd
		AND str_ln_cd = OLD.str_ln_cd
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
		AND ac_slip_typ = OLD.ac_slip_typ
		AND (ac_rsn_cd = OLD.ac_rsn_cd OR ac_rsn_cd IS NULL AND OLD.ac_rsn_cd IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND (amt = OLD.amt OR amt IS NULL AND OLD.amt IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (rec_eval_typ = OLD.rec_eval_typ OR rec_eval_typ IS NULL AND OLD.rec_eval_typ IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_seq_no = OLD.slip_seq_no OR slip_seq_no IS NULL AND OLD.slip_seq_no IS NULL)
		AND (rmrks = OLD.rmrks OR rmrks IS NULL AND OLD.rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_inpt_if$temp
		WHERE 0=0
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND ym = OLD.ym
		AND ac_dt = OLD.ac_dt
		AND par_itm_cd = OLD.par_itm_cd
		AND par_itm_sub1 = OLD.par_itm_sub1
		AND par_itm_sub2 = OLD.par_itm_sub2
		AND par_itm_sub3 = OLD.par_itm_sub3
		AND par_lot_no = OLD.par_lot_no
		AND par_sublot_no = OLD.par_sublot_no
		AND par_sno1 = OLD.par_sno1
		AND par_sno2 = OLD.par_sno2
		AND par_sno3 = OLD.par_sno3
		AND par_sno4 = OLD.par_sno4
		AND itm_mfg_inst_no = OLD.itm_mfg_inst_no
		AND mfg_act_no = OLD.mfg_act_no
		AND oper_act_no = OLD.oper_act_no
		AND loc_cd = OLD.loc_cd
		AND str_ln_cd = OLD.str_ln_cd
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
		AND ac_slip_typ = OLD.ac_slip_typ
		AND (ac_rsn_cd = OLD.ac_rsn_cd OR ac_rsn_cd IS NULL AND OLD.ac_rsn_cd IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND asst_typ = OLD.asst_typ
		AND qty = OLD.qty
		AND (amt = OLD.amt OR amt IS NULL AND OLD.amt IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (rec_eval_typ = OLD.rec_eval_typ OR rec_eval_typ IS NULL AND OLD.rec_eval_typ IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_seq_no = OLD.slip_seq_no OR slip_seq_no IS NULL AND OLD.slip_seq_no IS NULL)
		AND (rmrks = OLD.rmrks OR rmrks IS NULL AND OLD.rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_inpt_if$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_inpt_if
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_inpt_if$func();
;

