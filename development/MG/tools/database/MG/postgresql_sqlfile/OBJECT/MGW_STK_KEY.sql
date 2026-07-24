\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_stk_key()
RETURNS TABLE (
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
	asst_typ varchar,
	wg_cd varchar,
	bp_cd varchar,
	mng_dpt_cd varchar,
	ym timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_stk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_stk_key$temp(
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
				asst_typ varchar (1) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				bp_cd varchar (20) NULL,
				mng_dpt_cd varchar (20) NULL,
				ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_stk_key$temp
			ADD CONSTRAINT mgw_stk_key_pk UNIQUE(itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,asst_typ,wg_cd,bp_cd,mng_dpt_cd,ym);
			CREATE UNIQUE INDEX MGW_STK_KEY_pk_ie ON mgw_stk_key$temp (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,asst_typ,wg_cd,COALESCE(bp_cd,''),COALESCE(mng_dpt_cd,''),COALESCE(ym,'1999-04-01 00:00:00'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_stk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_stk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_stk_key
AS
SELECT *
FROM mgw_stk_key();
ALTER VIEW mgw_stk_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_stk_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_stk_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_stk_key ALTER COLUMN lot_no SET DEFAULT '*';
ALTER VIEW mgw_stk_key ALTER COLUMN sublot_no SET DEFAULT '*';
ALTER VIEW mgw_stk_key ALTER COLUMN sno1 SET DEFAULT '*';
ALTER VIEW mgw_stk_key ALTER COLUMN sno2 SET DEFAULT '*';
ALTER VIEW mgw_stk_key ALTER COLUMN sno3 SET DEFAULT '*';
ALTER VIEW mgw_stk_key ALTER COLUMN sno4 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_stk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_stk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_stk_key$temp(
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
				asst_typ varchar (1) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				bp_cd varchar (20) NULL,
				mng_dpt_cd varchar (20) NULL,
				ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_stk_key$temp
			ADD CONSTRAINT mgw_stk_key_pk UNIQUE(itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,asst_typ,wg_cd,bp_cd,mng_dpt_cd,ym);
			CREATE UNIQUE INDEX MGW_STK_KEY_pk_ie ON mgw_stk_key$temp (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,asst_typ,wg_cd,COALESCE(bp_cd,''),COALESCE(mng_dpt_cd,''),COALESCE(ym,'1999-04-01 00:00:00'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_stk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_stk_key$temp(
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
			asst_typ,
			wg_cd,
			bp_cd,
			mng_dpt_cd,
			ym
		)VALUES (
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
			NEW.asst_typ,
			NEW.wg_cd,
			NEW.bp_cd,
			NEW.mng_dpt_cd,
			NEW.ym
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_stk_key$temp
		SET 
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
			asst_typ = NEW.asst_typ,
			wg_cd = NEW.wg_cd,
			bp_cd = NEW.bp_cd,
			mng_dpt_cd = NEW.mng_dpt_cd,
			ym = NEW.ym
		WHERE 0=0
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
		AND asst_typ = OLD.asst_typ
		AND wg_cd = OLD.wg_cd
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_stk_key$temp
		WHERE 0=0
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
		AND asst_typ = OLD.asst_typ
		AND wg_cd = OLD.wg_cd
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (mng_dpt_cd = OLD.mng_dpt_cd OR mng_dpt_cd IS NULL AND OLD.mng_dpt_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_stk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_stk_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_stk_key$func();
;

