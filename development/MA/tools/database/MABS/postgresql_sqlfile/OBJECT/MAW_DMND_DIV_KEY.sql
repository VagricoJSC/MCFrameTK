\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_dmnd_div_key()
RETURNS TABLE (
	to_lg_grp_cd varchar,
	itm_ship_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	wg_cd varchar,
	sls_dpt_cd varchar,
	ship_loc_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dmnd_div_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dmnd_div_key$temp(
				to_lg_grp_cd varchar (10) DEFAULT '*' NULL,
				itm_ship_grp_cd varchar (5) DEFAULT '*' NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				sls_dpt_cd varchar (20) DEFAULT '*' NULL,
				ship_loc_cd varchar (20) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dmnd_div_key_pk_ie ON maw_dmnd_div_key$temp
				USING BTREE (to_lg_grp_cd,itm_ship_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd,sls_dpt_cd,ship_loc_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dmnd_div_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_dmnd_div_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_dmnd_div_key
AS
SELECT *
FROM maw_dmnd_div_key();
ALTER VIEW maw_dmnd_div_key ALTER COLUMN to_lg_grp_cd SET DEFAULT '*';
ALTER VIEW maw_dmnd_div_key ALTER COLUMN itm_ship_grp_cd SET DEFAULT '*';
ALTER VIEW maw_dmnd_div_key ALTER COLUMN itm_cd SET DEFAULT '*';
ALTER VIEW maw_dmnd_div_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_dmnd_div_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_dmnd_div_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_dmnd_div_key ALTER COLUMN wg_cd SET DEFAULT '*';
ALTER VIEW maw_dmnd_div_key ALTER COLUMN sls_dpt_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_dmnd_div_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dmnd_div_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dmnd_div_key$temp(
				to_lg_grp_cd varchar (10) DEFAULT '*' NULL,
				itm_ship_grp_cd varchar (5) DEFAULT '*' NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				sls_dpt_cd varchar (20) DEFAULT '*' NULL,
				ship_loc_cd varchar (20) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dmnd_div_key_pk_ie ON maw_dmnd_div_key$temp
				USING BTREE (to_lg_grp_cd,itm_ship_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd,sls_dpt_cd,ship_loc_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dmnd_div_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_dmnd_div_key$temp(
			to_lg_grp_cd,
			itm_ship_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			sls_dpt_cd,
			ship_loc_cd,
			st_dt
		)VALUES (
			NEW.to_lg_grp_cd,
			NEW.itm_ship_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.wg_cd,
			NEW.sls_dpt_cd,
			NEW.ship_loc_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_dmnd_div_key$temp
		SET 
			to_lg_grp_cd = NEW.to_lg_grp_cd,
			itm_ship_grp_cd = NEW.itm_ship_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			wg_cd = NEW.wg_cd,
			sls_dpt_cd = NEW.sls_dpt_cd,
			ship_loc_cd = NEW.ship_loc_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (to_lg_grp_cd = OLD.to_lg_grp_cd OR to_lg_grp_cd IS NULL AND OLD.to_lg_grp_cd IS NULL)
		AND (itm_ship_grp_cd = OLD.itm_ship_grp_cd OR itm_ship_grp_cd IS NULL AND OLD.itm_ship_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (ship_loc_cd = OLD.ship_loc_cd OR ship_loc_cd IS NULL AND OLD.ship_loc_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_dmnd_div_key$temp
		WHERE 0=0
		AND (to_lg_grp_cd = OLD.to_lg_grp_cd OR to_lg_grp_cd IS NULL AND OLD.to_lg_grp_cd IS NULL)
		AND (itm_ship_grp_cd = OLD.itm_ship_grp_cd OR itm_ship_grp_cd IS NULL AND OLD.itm_ship_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (ship_loc_cd = OLD.ship_loc_cd OR ship_loc_cd IS NULL AND OLD.ship_loc_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_dmnd_div_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_dmnd_div_key
FOR EACH ROW
EXECUTE PROCEDURE maw_dmnd_div_key$func();
;

