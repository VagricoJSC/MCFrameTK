\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ver_chg_key()
RETURNS TABLE (
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	chd_itm_cd varchar,
	chd_itm_sub1 varchar,
	chd_itm_sub2 varchar,
	chd_itm_sub3 varchar,
	ver_no varchar,
	bom_ptn varchar,
	wg_cd varchar,
	site_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ver_chg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ver_chg_key$temp(
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
				ver_no varchar (10) NULL,
				bom_ptn varchar (40) NULL,
				wg_cd varchar (10) NULL,
				site_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ver_chg_key_pk_ie ON msw_ver_chg_key$temp
				USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,ver_no,bom_ptn,wg_cd,site_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ver_chg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ver_chg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ver_chg_key
AS
SELECT *
FROM msw_ver_chg_key();
ALTER VIEW msw_ver_chg_key ALTER COLUMN par_itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_ver_chg_key ALTER COLUMN par_itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_ver_chg_key ALTER COLUMN par_itm_sub3 SET DEFAULT '*';
ALTER VIEW msw_ver_chg_key ALTER COLUMN chd_itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_ver_chg_key ALTER COLUMN chd_itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_ver_chg_key ALTER COLUMN chd_itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_ver_chg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ver_chg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ver_chg_key$temp(
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
				ver_no varchar (10) NULL,
				bom_ptn varchar (40) NULL,
				wg_cd varchar (10) NULL,
				site_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ver_chg_key_pk_ie ON msw_ver_chg_key$temp
				USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,ver_no,bom_ptn,wg_cd,site_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ver_chg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ver_chg_key$temp(
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			ver_no,
			bom_ptn,
			wg_cd,
			site_cd
		)VALUES (
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.chd_itm_cd,
			NEW.chd_itm_sub1,
			NEW.chd_itm_sub2,
			NEW.chd_itm_sub3,
			NEW.ver_no,
			NEW.bom_ptn,
			NEW.wg_cd,
			NEW.site_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ver_chg_key$temp
		SET 
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			chd_itm_cd = NEW.chd_itm_cd,
			chd_itm_sub1 = NEW.chd_itm_sub1,
			chd_itm_sub2 = NEW.chd_itm_sub2,
			chd_itm_sub3 = NEW.chd_itm_sub3,
			ver_no = NEW.ver_no,
			bom_ptn = NEW.bom_ptn,
			wg_cd = NEW.wg_cd,
			site_cd = NEW.site_cd
		WHERE 0=0
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (site_cd = OLD.site_cd OR site_cd IS NULL AND OLD.site_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ver_chg_key$temp
		WHERE 0=0
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (site_cd = OLD.site_cd OR site_cd IS NULL AND OLD.site_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ver_chg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ver_chg_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ver_chg_key$func();
;

