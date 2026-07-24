\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_slo_alloc_key()
RETURNS TABLE (
	to_lg_grp_cd varchar,
	itm_ship_grp_cd varchar,
	wg_cd varchar,
	loc_cd varchar,
	lg_grp_cd varchar,
	alloc_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_slo_alloc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_slo_alloc_key$temp(
				to_lg_grp_cd varchar (10) DEFAULT '*' NULL,
				itm_ship_grp_cd varchar (5) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				loc_cd varchar (20) NULL,
				lg_grp_cd varchar (10) NULL,
				alloc_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_slo_alloc_key_pk_ie ON maw_slo_alloc_key$temp
				USING BTREE (to_lg_grp_cd,itm_ship_grp_cd,wg_cd,loc_cd,lg_grp_cd,alloc_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_slo_alloc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_slo_alloc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_slo_alloc_key
AS
SELECT *
FROM maw_slo_alloc_key();
ALTER VIEW maw_slo_alloc_key ALTER COLUMN to_lg_grp_cd SET DEFAULT '*';
ALTER VIEW maw_slo_alloc_key ALTER COLUMN itm_ship_grp_cd SET DEFAULT '*';
ALTER VIEW maw_slo_alloc_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_slo_alloc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_slo_alloc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_slo_alloc_key$temp(
				to_lg_grp_cd varchar (10) DEFAULT '*' NULL,
				itm_ship_grp_cd varchar (5) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				loc_cd varchar (20) NULL,
				lg_grp_cd varchar (10) NULL,
				alloc_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_slo_alloc_key_pk_ie ON maw_slo_alloc_key$temp
				USING BTREE (to_lg_grp_cd,itm_ship_grp_cd,wg_cd,loc_cd,lg_grp_cd,alloc_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_slo_alloc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_slo_alloc_key$temp(
			to_lg_grp_cd,
			itm_ship_grp_cd,
			wg_cd,
			loc_cd,
			lg_grp_cd,
			alloc_grp_cd
		)VALUES (
			NEW.to_lg_grp_cd,
			NEW.itm_ship_grp_cd,
			NEW.wg_cd,
			NEW.loc_cd,
			NEW.lg_grp_cd,
			NEW.alloc_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_slo_alloc_key$temp
		SET 
			to_lg_grp_cd = NEW.to_lg_grp_cd,
			itm_ship_grp_cd = NEW.itm_ship_grp_cd,
			wg_cd = NEW.wg_cd,
			loc_cd = NEW.loc_cd,
			lg_grp_cd = NEW.lg_grp_cd,
			alloc_grp_cd = NEW.alloc_grp_cd
		WHERE 0=0
		AND (to_lg_grp_cd = OLD.to_lg_grp_cd OR to_lg_grp_cd IS NULL AND OLD.to_lg_grp_cd IS NULL)
		AND (itm_ship_grp_cd = OLD.itm_ship_grp_cd OR itm_ship_grp_cd IS NULL AND OLD.itm_ship_grp_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_slo_alloc_key$temp
		WHERE 0=0
		AND (to_lg_grp_cd = OLD.to_lg_grp_cd OR to_lg_grp_cd IS NULL AND OLD.to_lg_grp_cd IS NULL)
		AND (itm_ship_grp_cd = OLD.itm_ship_grp_cd OR itm_ship_grp_cd IS NULL AND OLD.itm_ship_grp_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_slo_alloc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_slo_alloc_key
FOR EACH ROW
EXECUTE PROCEDURE maw_slo_alloc_key$func();
;

