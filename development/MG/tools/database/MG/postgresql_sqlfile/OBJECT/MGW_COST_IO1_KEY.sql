\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_cost_io1_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
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
	bp_cd varchar,
	asst_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_cost_io1_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_cost_io1_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
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
				bp_cd varchar (20) NULL,
				asst_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_cost_io1_key_pk_ie ON mgw_cost_io1_key$temp
				USING BTREE (calc_no,calc_grp_cd,wg_cd,ym,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,bp_cd,asst_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_cost_io1_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_cost_io1_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_cost_io1_key
AS
SELECT *
FROM mgw_cost_io1_key();
ALTER VIEW mgw_cost_io1_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_cost_io1_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_cost_io1_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_cost_io1_key ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_cost_io1_key ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_cost_io1_key ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_cost_io1_key ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_cost_io1_key ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_cost_io1_key ALTER COLUMN sno4 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_cost_io1_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_cost_io1_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_cost_io1_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
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
				bp_cd varchar (20) NULL,
				asst_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_cost_io1_key_pk_ie ON mgw_cost_io1_key$temp
				USING BTREE (calc_no,calc_grp_cd,wg_cd,ym,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,bp_cd,asst_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_cost_io1_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_cost_io1_key$temp(
			calc_no,
			calc_grp_cd,
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
			bp_cd,
			asst_typ
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
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
			NEW.bp_cd,
			NEW.asst_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_cost_io1_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
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
			bp_cd = NEW.bp_cd,
			asst_typ = NEW.asst_typ
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
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
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (asst_typ = OLD.asst_typ OR asst_typ IS NULL AND OLD.asst_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_cost_io1_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
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
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (asst_typ = OLD.asst_typ OR asst_typ IS NULL AND OLD.asst_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_cost_io1_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_cost_io1_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_cost_io1_key$func();
;

