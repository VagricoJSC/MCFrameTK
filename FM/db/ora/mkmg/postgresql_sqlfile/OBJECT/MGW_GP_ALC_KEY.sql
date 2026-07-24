\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_gp_alc_key()
RETURNS TABLE (
	calc_ctg_cd varchar,
	wg_cd varchar,
	ym timestamp(0),
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
	loc_cd varchar,
	oper_cd varchar,
	bp_cd varchar,
	alc_dpt_cd varchar,
	itm_mfg_inst_no varchar,
	iv_no varchar,
	po_no varchar,
	slo_no varchar,
	asst_typ varchar,
	gp_alc_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_gp_alc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_gp_alc_key$temp(
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				mng_dpt_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				lot_no varchar (15) DEFAULT '*' NULL,
				sublot_no varchar (15) DEFAULT '*' NULL,
				sno1 varchar (15) DEFAULT '*' NULL,
				sno2 varchar (15) DEFAULT '*' NULL,
				sno3 varchar (15) DEFAULT '*' NULL,
				sno4 varchar (15) DEFAULT '*' NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				alc_dpt_cd varchar (20) NULL,
				itm_mfg_inst_no varchar (15) NULL,
				iv_no varchar (15) NULL,
				po_no varchar (15) NULL,
				slo_no varchar (15) NULL,
				asst_typ varchar (1) NULL,
				gp_alc_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_gp_alc_key_pk_ie ON mgw_gp_alc_key$temp
				USING BTREE (calc_ctg_cd,wg_cd,ym,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,loc_cd,oper_cd,bp_cd,alc_dpt_cd,itm_mfg_inst_no,iv_no,po_no,slo_no,asst_typ,gp_alc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_gp_alc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_gp_alc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_gp_alc_key
AS
SELECT *
FROM mgw_gp_alc_key();
ALTER VIEW mgw_gp_alc_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_gp_alc_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_gp_alc_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_gp_alc_key ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_gp_alc_key ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_gp_alc_key ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_gp_alc_key ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_gp_alc_key ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_gp_alc_key ALTER COLUMN sno4 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_gp_alc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_gp_alc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_gp_alc_key$temp(
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				mng_dpt_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				lot_no varchar (15) DEFAULT '*' NULL,
				sublot_no varchar (15) DEFAULT '*' NULL,
				sno1 varchar (15) DEFAULT '*' NULL,
				sno2 varchar (15) DEFAULT '*' NULL,
				sno3 varchar (15) DEFAULT '*' NULL,
				sno4 varchar (15) DEFAULT '*' NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				alc_dpt_cd varchar (20) NULL,
				itm_mfg_inst_no varchar (15) NULL,
				iv_no varchar (15) NULL,
				po_no varchar (15) NULL,
				slo_no varchar (15) NULL,
				asst_typ varchar (1) NULL,
				gp_alc_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_gp_alc_key_pk_ie ON mgw_gp_alc_key$temp
				USING BTREE (calc_ctg_cd,wg_cd,ym,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,loc_cd,oper_cd,bp_cd,alc_dpt_cd,itm_mfg_inst_no,iv_no,po_no,slo_no,asst_typ,gp_alc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_gp_alc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_gp_alc_key$temp(
			calc_ctg_cd,
			wg_cd,
			ym,
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
			loc_cd,
			oper_cd,
			bp_cd,
			alc_dpt_cd,
			itm_mfg_inst_no,
			iv_no,
			po_no,
			slo_no,
			asst_typ,
			gp_alc_cd
		)VALUES (
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.ym,
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
			NEW.loc_cd,
			NEW.oper_cd,
			NEW.bp_cd,
			NEW.alc_dpt_cd,
			NEW.itm_mfg_inst_no,
			NEW.iv_no,
			NEW.po_no,
			NEW.slo_no,
			NEW.asst_typ,
			NEW.gp_alc_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_gp_alc_key$temp
		SET 
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			ym = NEW.ym,
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
			loc_cd = NEW.loc_cd,
			oper_cd = NEW.oper_cd,
			bp_cd = NEW.bp_cd,
			alc_dpt_cd = NEW.alc_dpt_cd,
			itm_mfg_inst_no = NEW.itm_mfg_inst_no,
			iv_no = NEW.iv_no,
			po_no = NEW.po_no,
			slo_no = NEW.slo_no,
			asst_typ = NEW.asst_typ,
			gp_alc_cd = NEW.gp_alc_cd
		WHERE 0=0
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (alc_dpt_cd = OLD.alc_dpt_cd OR alc_dpt_cd IS NULL AND OLD.alc_dpt_cd IS NULL)
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (asst_typ = OLD.asst_typ OR asst_typ IS NULL AND OLD.asst_typ IS NULL)
		AND (gp_alc_cd = OLD.gp_alc_cd OR gp_alc_cd IS NULL AND OLD.gp_alc_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_gp_alc_key$temp
		WHERE 0=0
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (alc_dpt_cd = OLD.alc_dpt_cd OR alc_dpt_cd IS NULL AND OLD.alc_dpt_cd IS NULL)
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (asst_typ = OLD.asst_typ OR asst_typ IS NULL AND OLD.asst_typ IS NULL)
		AND (gp_alc_cd = OLD.gp_alc_cd OR gp_alc_cd IS NULL AND OLD.gp_alc_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_gp_alc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_gp_alc_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_gp_alc_key$func();
;

