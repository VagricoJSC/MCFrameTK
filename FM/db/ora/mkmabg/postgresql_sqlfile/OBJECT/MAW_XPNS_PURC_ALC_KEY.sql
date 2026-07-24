\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_xpns_purc_alc_key()
RETURNS TABLE (
	xpns_itm_cd varchar,
	xpns_itm_sub1 varchar,
	xpns_itm_sub2 varchar,
	xpns_itm_sub3 varchar,
	ac_rsn_cd varchar,
	calc_ctg_cd varchar,
	wg_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_xpns_purc_alc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_xpns_purc_alc_key$temp(
				xpns_itm_cd varchar (40) NULL,
				xpns_itm_sub1 varchar (5) DEFAULT '*' NULL,
				xpns_itm_sub2 varchar (5) DEFAULT '*' NULL,
				xpns_itm_sub3 varchar (5) DEFAULT '*' NULL,
				ac_rsn_cd varchar (10) NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_xpns_purc_alc_key_pk_ie ON maw_xpns_purc_alc_key$temp
				USING BTREE (xpns_itm_cd,xpns_itm_sub1,xpns_itm_sub2,xpns_itm_sub3,ac_rsn_cd,calc_ctg_cd,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_xpns_purc_alc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_xpns_purc_alc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_xpns_purc_alc_key
AS
SELECT *
FROM maw_xpns_purc_alc_key();
ALTER VIEW maw_xpns_purc_alc_key ALTER COLUMN xpns_itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_xpns_purc_alc_key ALTER COLUMN xpns_itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_xpns_purc_alc_key ALTER COLUMN xpns_itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_xpns_purc_alc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_xpns_purc_alc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_xpns_purc_alc_key$temp(
				xpns_itm_cd varchar (40) NULL,
				xpns_itm_sub1 varchar (5) DEFAULT '*' NULL,
				xpns_itm_sub2 varchar (5) DEFAULT '*' NULL,
				xpns_itm_sub3 varchar (5) DEFAULT '*' NULL,
				ac_rsn_cd varchar (10) NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_xpns_purc_alc_key_pk_ie ON maw_xpns_purc_alc_key$temp
				USING BTREE (xpns_itm_cd,xpns_itm_sub1,xpns_itm_sub2,xpns_itm_sub3,ac_rsn_cd,calc_ctg_cd,wg_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_xpns_purc_alc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_xpns_purc_alc_key$temp(
			xpns_itm_cd,
			xpns_itm_sub1,
			xpns_itm_sub2,
			xpns_itm_sub3,
			ac_rsn_cd,
			calc_ctg_cd,
			wg_cd,
			st_dt
		)VALUES (
			NEW.xpns_itm_cd,
			NEW.xpns_itm_sub1,
			NEW.xpns_itm_sub2,
			NEW.xpns_itm_sub3,
			NEW.ac_rsn_cd,
			NEW.calc_ctg_cd,
			NEW.wg_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_xpns_purc_alc_key$temp
		SET 
			xpns_itm_cd = NEW.xpns_itm_cd,
			xpns_itm_sub1 = NEW.xpns_itm_sub1,
			xpns_itm_sub2 = NEW.xpns_itm_sub2,
			xpns_itm_sub3 = NEW.xpns_itm_sub3,
			ac_rsn_cd = NEW.ac_rsn_cd,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (xpns_itm_cd = OLD.xpns_itm_cd OR xpns_itm_cd IS NULL AND OLD.xpns_itm_cd IS NULL)
		AND (xpns_itm_sub1 = OLD.xpns_itm_sub1 OR xpns_itm_sub1 IS NULL AND OLD.xpns_itm_sub1 IS NULL)
		AND (xpns_itm_sub2 = OLD.xpns_itm_sub2 OR xpns_itm_sub2 IS NULL AND OLD.xpns_itm_sub2 IS NULL)
		AND (xpns_itm_sub3 = OLD.xpns_itm_sub3 OR xpns_itm_sub3 IS NULL AND OLD.xpns_itm_sub3 IS NULL)
		AND (ac_rsn_cd = OLD.ac_rsn_cd OR ac_rsn_cd IS NULL AND OLD.ac_rsn_cd IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_xpns_purc_alc_key$temp
		WHERE 0=0
		AND (xpns_itm_cd = OLD.xpns_itm_cd OR xpns_itm_cd IS NULL AND OLD.xpns_itm_cd IS NULL)
		AND (xpns_itm_sub1 = OLD.xpns_itm_sub1 OR xpns_itm_sub1 IS NULL AND OLD.xpns_itm_sub1 IS NULL)
		AND (xpns_itm_sub2 = OLD.xpns_itm_sub2 OR xpns_itm_sub2 IS NULL AND OLD.xpns_itm_sub2 IS NULL)
		AND (xpns_itm_sub3 = OLD.xpns_itm_sub3 OR xpns_itm_sub3 IS NULL AND OLD.xpns_itm_sub3 IS NULL)
		AND (ac_rsn_cd = OLD.ac_rsn_cd OR ac_rsn_cd IS NULL AND OLD.ac_rsn_cd IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_xpns_purc_alc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_xpns_purc_alc_key
FOR EACH ROW
EXECUTE PROCEDURE maw_xpns_purc_alc_key$func();
;

