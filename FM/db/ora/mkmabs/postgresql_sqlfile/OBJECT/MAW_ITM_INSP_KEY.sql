\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_itm_insp_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	mfg_loc_cd varchar,
	sppl_cd varchar,
	maker_cd varchar,
	from_site_cd varchar,
	to_site_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_insp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_insp_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				mfg_loc_cd varchar (20) DEFAULT '*' NULL,
				sppl_cd varchar (20) DEFAULT '*' NULL,
				maker_cd varchar (20) DEFAULT '*' NULL,
				from_site_cd varchar (10) DEFAULT '*' NULL,
				to_site_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_insp_key_pk_ie ON maw_itm_insp_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,mfg_loc_cd,sppl_cd,maker_cd,from_site_cd,to_site_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_insp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_itm_insp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_itm_insp_key
AS
SELECT *
FROM maw_itm_insp_key();
ALTER VIEW maw_itm_insp_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_itm_insp_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_itm_insp_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_itm_insp_key ALTER COLUMN mfg_loc_cd SET DEFAULT '*';
ALTER VIEW maw_itm_insp_key ALTER COLUMN sppl_cd SET DEFAULT '*';
ALTER VIEW maw_itm_insp_key ALTER COLUMN maker_cd SET DEFAULT '*';
ALTER VIEW maw_itm_insp_key ALTER COLUMN from_site_cd SET DEFAULT '*';
ALTER VIEW maw_itm_insp_key ALTER COLUMN to_site_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_itm_insp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_insp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_insp_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				mfg_loc_cd varchar (20) DEFAULT '*' NULL,
				sppl_cd varchar (20) DEFAULT '*' NULL,
				maker_cd varchar (20) DEFAULT '*' NULL,
				from_site_cd varchar (10) DEFAULT '*' NULL,
				to_site_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_itm_insp_key_pk_ie ON maw_itm_insp_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,mfg_loc_cd,sppl_cd,maker_cd,from_site_cd,to_site_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_insp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_itm_insp_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			mfg_loc_cd,
			sppl_cd,
			maker_cd,
			from_site_cd,
			to_site_cd,
			st_dt
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.mfg_loc_cd,
			NEW.sppl_cd,
			NEW.maker_cd,
			NEW.from_site_cd,
			NEW.to_site_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_itm_insp_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			mfg_loc_cd = NEW.mfg_loc_cd,
			sppl_cd = NEW.sppl_cd,
			maker_cd = NEW.maker_cd,
			from_site_cd = NEW.from_site_cd,
			to_site_cd = NEW.to_site_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (from_site_cd = OLD.from_site_cd OR from_site_cd IS NULL AND OLD.from_site_cd IS NULL)
		AND (to_site_cd = OLD.to_site_cd OR to_site_cd IS NULL AND OLD.to_site_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_itm_insp_key$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND (from_site_cd = OLD.from_site_cd OR from_site_cd IS NULL AND OLD.from_site_cd IS NULL)
		AND (to_site_cd = OLD.to_site_cd OR to_site_cd IS NULL AND OLD.to_site_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_itm_insp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_itm_insp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_itm_insp_key$func();
;

