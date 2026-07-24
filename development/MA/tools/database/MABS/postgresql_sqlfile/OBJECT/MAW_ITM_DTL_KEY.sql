\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_itm_dtl_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	mfg_loc_cd varchar,
	sppl_cd varchar,
	maker_cd varchar,
	rqst_loc_cd varchar,
	wg_cd varchar,
	bom_ptn varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_dtl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_dtl_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				mfg_loc_cd varchar (20) DEFAULT '*' NULL,
				sppl_cd varchar (20) DEFAULT '*' NULL,
				maker_cd varchar (20) DEFAULT '*' NULL,
				rqst_loc_cd varchar (20) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				bom_ptn varchar (40) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_dtl_key_pk_ie ON maw_itm_dtl_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,mfg_loc_cd,sppl_cd,maker_cd,rqst_loc_cd,wg_cd,bom_ptn,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_dtl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_itm_dtl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_itm_dtl_key
AS
SELECT *
FROM maw_itm_dtl_key();
ALTER VIEW maw_itm_dtl_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_itm_dtl_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_itm_dtl_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_itm_dtl_key ALTER COLUMN mfg_loc_cd SET DEFAULT '*';
ALTER VIEW maw_itm_dtl_key ALTER COLUMN sppl_cd SET DEFAULT '*';
ALTER VIEW maw_itm_dtl_key ALTER COLUMN maker_cd SET DEFAULT '*';
ALTER VIEW maw_itm_dtl_key ALTER COLUMN rqst_loc_cd SET DEFAULT '*';
ALTER VIEW maw_itm_dtl_key ALTER COLUMN wg_cd SET DEFAULT '*';
ALTER VIEW maw_itm_dtl_key ALTER COLUMN bom_ptn SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_itm_dtl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_dtl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_dtl_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				mfg_loc_cd varchar (20) DEFAULT '*' NULL,
				sppl_cd varchar (20) DEFAULT '*' NULL,
				maker_cd varchar (20) DEFAULT '*' NULL,
				rqst_loc_cd varchar (20) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				bom_ptn varchar (40) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_dtl_key_pk_ie ON maw_itm_dtl_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,mfg_loc_cd,sppl_cd,maker_cd,rqst_loc_cd,wg_cd,bom_ptn,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_dtl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_itm_dtl_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			mfg_loc_cd,
			sppl_cd,
			maker_cd,
			rqst_loc_cd,
			wg_cd,
			bom_ptn,
			st_dt
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.mfg_loc_cd,
			NEW.sppl_cd,
			NEW.maker_cd,
			NEW.rqst_loc_cd,
			NEW.wg_cd,
			NEW.bom_ptn,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_itm_dtl_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			mfg_loc_cd = NEW.mfg_loc_cd,
			sppl_cd = NEW.sppl_cd,
			maker_cd = NEW.maker_cd,
			rqst_loc_cd = NEW.rqst_loc_cd,
			wg_cd = NEW.wg_cd,
			bom_ptn = NEW.bom_ptn,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (rqst_loc_cd = OLD.rqst_loc_cd OR rqst_loc_cd IS NULL AND OLD.rqst_loc_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_itm_dtl_key$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (rqst_loc_cd = OLD.rqst_loc_cd OR rqst_loc_cd IS NULL AND OLD.rqst_loc_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_itm_dtl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_itm_dtl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_itm_dtl_key$func();
;

