\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_pre_rate_mly()
RETURNS TABLE (
	pre_alc_rate_cd varchar,
	ym timestamp(0),
	wg_cd varchar,
	dpt_cd varchar,
	loc_cd varchar,
	oper_cd varchar,
	bp_cd varchar,
	ctg_cd varchar,
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
	itm_mfg_inst_no varchar,
	iv_no varchar,
	po_no varchar,
	slo_no varchar,
	alc_ac_cd varchar,
	trd_wg_cd varchar,
	pre_alc_rate numeric,
	adj_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_rate_mly$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_rate_mly$temp(
				pre_alc_rate_cd varchar (20) NOT NULL,
				ym timestamp(0)  NOT NULL,
				wg_cd varchar (10) NOT NULL,
				dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				ctg_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				itm_mfg_inst_no varchar (15) NULL,
				iv_no varchar (15) NULL,
				po_no varchar (15) NULL,
				slo_no varchar (15) NULL,
				alc_ac_cd varchar (20) NULL,
				trd_wg_cd varchar (10) NULL,
				pre_alc_rate numeric (21,8) NOT NULL,
				adj_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_pre_rate_mly$temp
			ADD CONSTRAINT mgw_pre_rate_mly_pk UNIQUE(pre_alc_rate_cd,ym,wg_cd,dpt_cd,loc_cd,oper_cd,bp_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,itm_mfg_inst_no,iv_no,po_no,slo_no,alc_ac_cd,trd_wg_cd);
			CREATE UNIQUE INDEX MGW_PRE_RATE_MLY_pk_ie ON mgw_pre_rate_mly$temp (pre_alc_rate_cd,ym,wg_cd,COALESCE(dpt_cd,''),COALESCE(loc_cd,''),COALESCE(oper_cd,''),COALESCE(bp_cd,''),COALESCE(ctg_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),COALESCE(lot_no,''),COALESCE(sublot_no,''),COALESCE(sno1,''),COALESCE(sno2,''),COALESCE(sno3,''),COALESCE(sno4,''),COALESCE(itm_mfg_inst_no,''),COALESCE(iv_no,''),COALESCE(po_no,''),COALESCE(slo_no,''),COALESCE(alc_ac_cd,''),COALESCE(trd_wg_cd,''));
			ALTER TABLE mgw_pre_rate_mly$temp
				ADD CONSTRAINT mgw_pre_rate_mly_ck01 CHECK (adj_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_rate_mly$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_pre_rate_mly$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_pre_rate_mly
AS
SELECT *
FROM mgw_pre_rate_mly();
ALTER VIEW mgw_pre_rate_mly ALTER COLUMN adj_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_pre_rate_mly$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_rate_mly$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_rate_mly$temp(
				pre_alc_rate_cd varchar (20) NOT NULL,
				ym timestamp(0)  NOT NULL,
				wg_cd varchar (10) NOT NULL,
				dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				oper_cd varchar (10) NULL,
				bp_cd varchar (20) NULL,
				ctg_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				itm_mfg_inst_no varchar (15) NULL,
				iv_no varchar (15) NULL,
				po_no varchar (15) NULL,
				slo_no varchar (15) NULL,
				alc_ac_cd varchar (20) NULL,
				trd_wg_cd varchar (10) NULL,
				pre_alc_rate numeric (21,8) NOT NULL,
				adj_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_pre_rate_mly$temp
			ADD CONSTRAINT mgw_pre_rate_mly_pk UNIQUE(pre_alc_rate_cd,ym,wg_cd,dpt_cd,loc_cd,oper_cd,bp_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,itm_mfg_inst_no,iv_no,po_no,slo_no,alc_ac_cd,trd_wg_cd);
			CREATE UNIQUE INDEX MGW_PRE_RATE_MLY_pk_ie ON mgw_pre_rate_mly$temp (pre_alc_rate_cd,ym,wg_cd,COALESCE(dpt_cd,''),COALESCE(loc_cd,''),COALESCE(oper_cd,''),COALESCE(bp_cd,''),COALESCE(ctg_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),COALESCE(lot_no,''),COALESCE(sublot_no,''),COALESCE(sno1,''),COALESCE(sno2,''),COALESCE(sno3,''),COALESCE(sno4,''),COALESCE(itm_mfg_inst_no,''),COALESCE(iv_no,''),COALESCE(po_no,''),COALESCE(slo_no,''),COALESCE(alc_ac_cd,''),COALESCE(trd_wg_cd,''));
			ALTER TABLE mgw_pre_rate_mly$temp
			ADD CONSTRAINT mgw_pre_rate_mly_ck01 CHECK (adj_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_rate_mly$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_pre_rate_mly$temp(
			pre_alc_rate_cd,
			ym,
			wg_cd,
			dpt_cd,
			loc_cd,
			oper_cd,
			bp_cd,
			ctg_cd,
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
			itm_mfg_inst_no,
			iv_no,
			po_no,
			slo_no,
			alc_ac_cd,
			trd_wg_cd,
			pre_alc_rate,
			adj_flg
		)VALUES (
			NEW.pre_alc_rate_cd,
			NEW.ym,
			NEW.wg_cd,
			NEW.dpt_cd,
			NEW.loc_cd,
			NEW.oper_cd,
			NEW.bp_cd,
			NEW.ctg_cd,
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
			NEW.itm_mfg_inst_no,
			NEW.iv_no,
			NEW.po_no,
			NEW.slo_no,
			NEW.alc_ac_cd,
			NEW.trd_wg_cd,
			NEW.pre_alc_rate,
			NEW.adj_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_pre_rate_mly$temp
		SET 
			pre_alc_rate_cd = NEW.pre_alc_rate_cd,
			ym = NEW.ym,
			wg_cd = NEW.wg_cd,
			dpt_cd = NEW.dpt_cd,
			loc_cd = NEW.loc_cd,
			oper_cd = NEW.oper_cd,
			bp_cd = NEW.bp_cd,
			ctg_cd = NEW.ctg_cd,
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
			itm_mfg_inst_no = NEW.itm_mfg_inst_no,
			iv_no = NEW.iv_no,
			po_no = NEW.po_no,
			slo_no = NEW.slo_no,
			alc_ac_cd = NEW.alc_ac_cd,
			trd_wg_cd = NEW.trd_wg_cd,
			pre_alc_rate = NEW.pre_alc_rate,
			adj_flg = NEW.adj_flg
		WHERE 0=0
		AND pre_alc_rate_cd = OLD.pre_alc_rate_cd
		AND ym = OLD.ym
		AND wg_cd = OLD.wg_cd
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
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
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (trd_wg_cd = OLD.trd_wg_cd OR trd_wg_cd IS NULL AND OLD.trd_wg_cd IS NULL)
		AND pre_alc_rate = OLD.pre_alc_rate
		AND adj_flg = OLD.adj_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_pre_rate_mly$temp
		WHERE 0=0
		AND pre_alc_rate_cd = OLD.pre_alc_rate_cd
		AND ym = OLD.ym
		AND wg_cd = OLD.wg_cd
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (ctg_cd = OLD.ctg_cd OR ctg_cd IS NULL AND OLD.ctg_cd IS NULL)
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
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (trd_wg_cd = OLD.trd_wg_cd OR trd_wg_cd IS NULL AND OLD.trd_wg_cd IS NULL)
		AND pre_alc_rate = OLD.pre_alc_rate
		AND adj_flg = OLD.adj_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_pre_rate_mly$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_pre_rate_mly
FOR EACH ROW
EXECUTE PROCEDURE mgw_pre_rate_mly$func();
;

