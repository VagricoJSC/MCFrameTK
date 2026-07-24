\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_itm_mfg_inst()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_mfg_inst_no varchar,
	mfg_act_no varchar,
	wg_cd varchar,
	ym timestamp(0),
	mng_dpt_cd varchar,
	lot_no varchar,
	sublot_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	loc_cd varchar,
	str_ln_cd varchar,
	sppl_cd varchar,
	po_no varchar,
	slo_no varchar,
	iv_no varchar,
	asst_typ varchar,
	qty numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_itm_mfg_inst$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_itm_mfg_inst$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				itm_mfg_inst_no varchar (15) NOT NULL,
				mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				mng_dpt_cd varchar (20) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				loc_cd varchar (20) NULL,
				str_ln_cd varchar (10) NULL,
				sppl_cd varchar (20) NULL,
				po_no varchar (15) NULL,
				slo_no varchar (15) NULL,
				iv_no varchar (15) NULL,
				asst_typ varchar (1) NULL,
				qty numeric (21,8) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			ALTER TABLE mgw_calc_itm_mfg_inst$temp
			ADD CONSTRAINT mgw_calc_itm_mfg_inst_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_itm_mfg_inst$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_itm_mfg_inst$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_itm_mfg_inst
AS
SELECT *
FROM mgw_calc_itm_mfg_inst();
ALTER VIEW mgw_calc_itm_mfg_inst ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_mfg_inst ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_mfg_inst ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_calc_itm_mfg_inst ALTER COLUMN mfg_act_no SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_calc_itm_mfg_inst$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_itm_mfg_inst$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_itm_mfg_inst$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				itm_mfg_inst_no varchar (15) NOT NULL,
				mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				mng_dpt_cd varchar (20) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				loc_cd varchar (20) NULL,
				str_ln_cd varchar (10) NULL,
				sppl_cd varchar (20) NULL,
				po_no varchar (15) NULL,
				slo_no varchar (15) NULL,
				iv_no varchar (15) NULL,
				asst_typ varchar (1) NULL,
				qty numeric (21,8) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			ALTER TABLE mgw_calc_itm_mfg_inst$temp
			ADD CONSTRAINT mgw_calc_itm_mfg_inst_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_itm_mfg_inst$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_itm_mfg_inst$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			wg_cd,
			ym,
			mng_dpt_cd,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			loc_cd,
			str_ln_cd,
			sppl_cd,
			po_no,
			slo_no,
			iv_no,
			asst_typ,
			qty
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_mfg_inst_no,
			NEW.mfg_act_no,
			NEW.wg_cd,
			NEW.ym,
			NEW.mng_dpt_cd,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.loc_cd,
			NEW.str_ln_cd,
			NEW.sppl_cd,
			NEW.po_no,
			NEW.slo_no,
			NEW.iv_no,
			NEW.asst_typ,
			NEW.qty
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_itm_mfg_inst$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_mfg_inst_no = NEW.itm_mfg_inst_no,
			mfg_act_no = NEW.mfg_act_no,
			wg_cd = NEW.wg_cd,
			ym = NEW.ym,
			mng_dpt_cd = NEW.mng_dpt_cd,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			loc_cd = NEW.loc_cd,
			str_ln_cd = NEW.str_ln_cd,
			sppl_cd = NEW.sppl_cd,
			po_no = NEW.po_no,
			slo_no = NEW.slo_no,
			iv_no = NEW.iv_no,
			asst_typ = NEW.asst_typ,
			qty = NEW.qty
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND itm_mfg_inst_no = OLD.itm_mfg_inst_no
		AND mfg_act_no = OLD.mfg_act_no
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (asst_typ = OLD.asst_typ OR asst_typ IS NULL AND OLD.asst_typ IS NULL)
		AND (qty = OLD.qty OR qty IS NULL AND OLD.qty IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_itm_mfg_inst$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND itm_mfg_inst_no = OLD.itm_mfg_inst_no
		AND mfg_act_no = OLD.mfg_act_no
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (str_ln_cd = OLD.str_ln_cd OR str_ln_cd IS NULL AND OLD.str_ln_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (asst_typ = OLD.asst_typ OR asst_typ IS NULL AND OLD.asst_typ IS NULL)
		AND (qty = OLD.qty OR qty IS NULL AND OLD.qty IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_itm_mfg_inst$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_itm_mfg_inst
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_itm_mfg_inst$func();
;

