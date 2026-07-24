\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alt_itm_key()
RETURNS TABLE (
	alt_grp_cd varchar,
	chd_itm_cd varchar,
	chd_itm_sub1 varchar,
	chd_itm_sub2 varchar,
	chd_itm_sub3 varchar,
	ver_no varchar,
	wg_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alt_itm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alt_itm_key$temp(
				alt_grp_cd varchar (40) NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
				ver_no varchar (10) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alt_itm_key_pk_ie ON maw_alt_itm_key$temp
				USING BTREE (alt_grp_cd,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,ver_no,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alt_itm_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alt_itm_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alt_itm_key
AS
SELECT *
FROM maw_alt_itm_key();
ALTER VIEW maw_alt_itm_key ALTER COLUMN chd_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_alt_itm_key ALTER COLUMN chd_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_alt_itm_key ALTER COLUMN chd_itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_alt_itm_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_alt_itm_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alt_itm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alt_itm_key$temp(
				alt_grp_cd varchar (40) NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
				ver_no varchar (10) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alt_itm_key_pk_ie ON maw_alt_itm_key$temp
				USING BTREE (alt_grp_cd,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,ver_no,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alt_itm_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alt_itm_key$temp(
			alt_grp_cd,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			ver_no,
			wg_cd,
			st_dt
		)VALUES (
			NEW.alt_grp_cd,
			NEW.chd_itm_cd,
			NEW.chd_itm_sub1,
			NEW.chd_itm_sub2,
			NEW.chd_itm_sub3,
			NEW.ver_no,
			NEW.wg_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alt_itm_key$temp
		SET 
			alt_grp_cd = NEW.alt_grp_cd,
			chd_itm_cd = NEW.chd_itm_cd,
			chd_itm_sub1 = NEW.chd_itm_sub1,
			chd_itm_sub2 = NEW.chd_itm_sub2,
			chd_itm_sub3 = NEW.chd_itm_sub3,
			ver_no = NEW.ver_no,
			wg_cd = NEW.wg_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alt_itm_key$temp
		WHERE 0=0
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alt_itm_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alt_itm_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alt_itm_key$func();
;

