\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_fix_itm_dtl()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	loc_cd varchar,
	sppl_cd varchar,
	rqst_wg_cd varchar,
	term timestamp(0),
	calc_ctg_cd varchar,
	wg_cd varchar,
	cost_ratio numeric,
	oper_ptn varchar,
	bom_ptn varchar,
	min_lot_qty numeric,
	batch_lot_qty numeric,
	fxd_lot_qty numeric,
	fxd_yield_qty numeric,
	nmr_qty numeric,
	dnm_qty numeric,
	alc_dpt_cd varchar,
	exp_dpt_cd varchar,
	exp_prio numeric,
	max_qty numeric,
	alc_val1 numeric,
	alc_val2 numeric,
	alc_val3 numeric,
	alc_val4 numeric,
	alc_val5 numeric,
	rmrks varchar,
	sub_char1 varchar,
	sub_char2 varchar,
	sub_char3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_fix_itm_dtl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_fix_itm_dtl$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) DEFAULT '*' NOT NULL,
				sppl_cd varchar (20) DEFAULT '*' NOT NULL,
				rqst_wg_cd varchar (10) DEFAULT '*' NOT NULL,
				term timestamp(0)  NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) DEFAULT '*' NOT NULL,
				cost_ratio numeric (21,8) NOT NULL,
				oper_ptn varchar (40) NULL,
				bom_ptn varchar (40) NULL,
				min_lot_qty numeric (21,8) NOT NULL,
				batch_lot_qty numeric (21,8) NOT NULL,
				fxd_lot_qty numeric (21,8) NOT NULL,
				fxd_yield_qty numeric (21,8) NOT NULL,
				nmr_qty numeric (21,8) NOT NULL,
				dnm_qty numeric (21,8) NOT NULL,
				alc_dpt_cd varchar (20) NULL,
				exp_dpt_cd varchar (20) NULL,
				exp_prio numeric (9,0) NULL,
				max_qty numeric (21,8) NULL,
				alc_val1 numeric (21,8) NULL,
				alc_val2 numeric (21,8) NULL,
				alc_val3 numeric (21,8) NULL,
				alc_val4 numeric (21,8) NULL,
				alc_val5 numeric (21,8) NULL,
				rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_fix_itm_dtl$temp
			ADD CONSTRAINT mgw_fix_itm_dtl_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,sppl_cd,rqst_wg_cd,term,calc_ctg_cd,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_fix_itm_dtl$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_fix_itm_dtl$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_fix_itm_dtl
AS
SELECT *
FROM mgw_fix_itm_dtl();
ALTER VIEW mgw_fix_itm_dtl ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_fix_itm_dtl ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_fix_itm_dtl ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_fix_itm_dtl ALTER COLUMN loc_cd SET DEFAULT '*';
ALTER VIEW mgw_fix_itm_dtl ALTER COLUMN sppl_cd SET DEFAULT '*';
ALTER VIEW mgw_fix_itm_dtl ALTER COLUMN rqst_wg_cd SET DEFAULT '*';
ALTER VIEW mgw_fix_itm_dtl ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_fix_itm_dtl$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_fix_itm_dtl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_fix_itm_dtl$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				loc_cd varchar (20) DEFAULT '*' NOT NULL,
				sppl_cd varchar (20) DEFAULT '*' NOT NULL,
				rqst_wg_cd varchar (10) DEFAULT '*' NOT NULL,
				term timestamp(0)  NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) DEFAULT '*' NOT NULL,
				cost_ratio numeric (21,8) NOT NULL,
				oper_ptn varchar (40) NULL,
				bom_ptn varchar (40) NULL,
				min_lot_qty numeric (21,8) NOT NULL,
				batch_lot_qty numeric (21,8) NOT NULL,
				fxd_lot_qty numeric (21,8) NOT NULL,
				fxd_yield_qty numeric (21,8) NOT NULL,
				nmr_qty numeric (21,8) NOT NULL,
				dnm_qty numeric (21,8) NOT NULL,
				alc_dpt_cd varchar (20) NULL,
				exp_dpt_cd varchar (20) NULL,
				exp_prio numeric (9,0) NULL,
				max_qty numeric (21,8) NULL,
				alc_val1 numeric (21,8) NULL,
				alc_val2 numeric (21,8) NULL,
				alc_val3 numeric (21,8) NULL,
				alc_val4 numeric (21,8) NULL,
				alc_val5 numeric (21,8) NULL,
				rmrks varchar (100) NULL,
				sub_char1 varchar (20) NULL,
				sub_char2 varchar (20) NULL,
				sub_char3 varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_fix_itm_dtl$temp
			ADD CONSTRAINT mgw_fix_itm_dtl_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,sppl_cd,rqst_wg_cd,term,calc_ctg_cd,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_fix_itm_dtl$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_fix_itm_dtl$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			sppl_cd,
			rqst_wg_cd,
			term,
			calc_ctg_cd,
			wg_cd,
			cost_ratio,
			oper_ptn,
			bom_ptn,
			min_lot_qty,
			batch_lot_qty,
			fxd_lot_qty,
			fxd_yield_qty,
			nmr_qty,
			dnm_qty,
			alc_dpt_cd,
			exp_dpt_cd,
			exp_prio,
			max_qty,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.loc_cd,
			NEW.sppl_cd,
			NEW.rqst_wg_cd,
			NEW.term,
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.cost_ratio,
			NEW.oper_ptn,
			NEW.bom_ptn,
			NEW.min_lot_qty,
			NEW.batch_lot_qty,
			NEW.fxd_lot_qty,
			NEW.fxd_yield_qty,
			NEW.nmr_qty,
			NEW.dnm_qty,
			NEW.alc_dpt_cd,
			NEW.exp_dpt_cd,
			NEW.exp_prio,
			NEW.max_qty,
			NEW.alc_val1,
			NEW.alc_val2,
			NEW.alc_val3,
			NEW.alc_val4,
			NEW.alc_val5,
			NEW.rmrks,
			NEW.sub_char1,
			NEW.sub_char2,
			NEW.sub_char3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_fix_itm_dtl$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			loc_cd = NEW.loc_cd,
			sppl_cd = NEW.sppl_cd,
			rqst_wg_cd = NEW.rqst_wg_cd,
			term = NEW.term,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			cost_ratio = NEW.cost_ratio,
			oper_ptn = NEW.oper_ptn,
			bom_ptn = NEW.bom_ptn,
			min_lot_qty = NEW.min_lot_qty,
			batch_lot_qty = NEW.batch_lot_qty,
			fxd_lot_qty = NEW.fxd_lot_qty,
			fxd_yield_qty = NEW.fxd_yield_qty,
			nmr_qty = NEW.nmr_qty,
			dnm_qty = NEW.dnm_qty,
			alc_dpt_cd = NEW.alc_dpt_cd,
			exp_dpt_cd = NEW.exp_dpt_cd,
			exp_prio = NEW.exp_prio,
			max_qty = NEW.max_qty,
			alc_val1 = NEW.alc_val1,
			alc_val2 = NEW.alc_val2,
			alc_val3 = NEW.alc_val3,
			alc_val4 = NEW.alc_val4,
			alc_val5 = NEW.alc_val5,
			rmrks = NEW.rmrks,
			sub_char1 = NEW.sub_char1,
			sub_char2 = NEW.sub_char2,
			sub_char3 = NEW.sub_char3
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND loc_cd = OLD.loc_cd
		AND sppl_cd = OLD.sppl_cd
		AND rqst_wg_cd = OLD.rqst_wg_cd
		AND term = OLD.term
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND cost_ratio = OLD.cost_ratio
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND min_lot_qty = OLD.min_lot_qty
		AND batch_lot_qty = OLD.batch_lot_qty
		AND fxd_lot_qty = OLD.fxd_lot_qty
		AND fxd_yield_qty = OLD.fxd_yield_qty
		AND nmr_qty = OLD.nmr_qty
		AND dnm_qty = OLD.dnm_qty
		AND (alc_dpt_cd = OLD.alc_dpt_cd OR alc_dpt_cd IS NULL AND OLD.alc_dpt_cd IS NULL)
		AND (exp_dpt_cd = OLD.exp_dpt_cd OR exp_dpt_cd IS NULL AND OLD.exp_dpt_cd IS NULL)
		AND (exp_prio = OLD.exp_prio OR exp_prio IS NULL AND OLD.exp_prio IS NULL)
		AND (max_qty = OLD.max_qty OR max_qty IS NULL AND OLD.max_qty IS NULL)
		AND (alc_val1 = OLD.alc_val1 OR alc_val1 IS NULL AND OLD.alc_val1 IS NULL)
		AND (alc_val2 = OLD.alc_val2 OR alc_val2 IS NULL AND OLD.alc_val2 IS NULL)
		AND (alc_val3 = OLD.alc_val3 OR alc_val3 IS NULL AND OLD.alc_val3 IS NULL)
		AND (alc_val4 = OLD.alc_val4 OR alc_val4 IS NULL AND OLD.alc_val4 IS NULL)
		AND (alc_val5 = OLD.alc_val5 OR alc_val5 IS NULL AND OLD.alc_val5 IS NULL)
		AND (rmrks = OLD.rmrks OR rmrks IS NULL AND OLD.rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_fix_itm_dtl$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND loc_cd = OLD.loc_cd
		AND sppl_cd = OLD.sppl_cd
		AND rqst_wg_cd = OLD.rqst_wg_cd
		AND term = OLD.term
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd
		AND cost_ratio = OLD.cost_ratio
		AND (oper_ptn = OLD.oper_ptn OR oper_ptn IS NULL AND OLD.oper_ptn IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND min_lot_qty = OLD.min_lot_qty
		AND batch_lot_qty = OLD.batch_lot_qty
		AND fxd_lot_qty = OLD.fxd_lot_qty
		AND fxd_yield_qty = OLD.fxd_yield_qty
		AND nmr_qty = OLD.nmr_qty
		AND dnm_qty = OLD.dnm_qty
		AND (alc_dpt_cd = OLD.alc_dpt_cd OR alc_dpt_cd IS NULL AND OLD.alc_dpt_cd IS NULL)
		AND (exp_dpt_cd = OLD.exp_dpt_cd OR exp_dpt_cd IS NULL AND OLD.exp_dpt_cd IS NULL)
		AND (exp_prio = OLD.exp_prio OR exp_prio IS NULL AND OLD.exp_prio IS NULL)
		AND (max_qty = OLD.max_qty OR max_qty IS NULL AND OLD.max_qty IS NULL)
		AND (alc_val1 = OLD.alc_val1 OR alc_val1 IS NULL AND OLD.alc_val1 IS NULL)
		AND (alc_val2 = OLD.alc_val2 OR alc_val2 IS NULL AND OLD.alc_val2 IS NULL)
		AND (alc_val3 = OLD.alc_val3 OR alc_val3 IS NULL AND OLD.alc_val3 IS NULL)
		AND (alc_val4 = OLD.alc_val4 OR alc_val4 IS NULL AND OLD.alc_val4 IS NULL)
		AND (alc_val5 = OLD.alc_val5 OR alc_val5 IS NULL AND OLD.alc_val5 IS NULL)
		AND (rmrks = OLD.rmrks OR rmrks IS NULL AND OLD.rmrks IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_fix_itm_dtl$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_fix_itm_dtl
FOR EACH ROW
EXECUTE PROCEDURE mgw_fix_itm_dtl$func();
;

