\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_grs_alloc_ctl_key()
RETURNS TABLE (
	alloc_grp_cd varchar,
	itm_ship_grp_cd varchar,
	lg_grp_cd varchar,
	loc_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_grs_alloc_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_grs_alloc_ctl_key$temp(
				alloc_grp_cd varchar (10) DEFAULT '*' NULL,
				itm_ship_grp_cd varchar (5) DEFAULT '*' NULL,
				lg_grp_cd varchar (10) DEFAULT '*' NULL,
				loc_cd varchar (20) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_grs_alloc_ctl_key_pk_ie ON maw_grs_alloc_ctl_key$temp
				USING BTREE (alloc_grp_cd,itm_ship_grp_cd,lg_grp_cd,loc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_grs_alloc_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_grs_alloc_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_grs_alloc_ctl_key
AS
SELECT *
FROM maw_grs_alloc_ctl_key();
ALTER VIEW maw_grs_alloc_ctl_key ALTER COLUMN alloc_grp_cd SET DEFAULT '*';
ALTER VIEW maw_grs_alloc_ctl_key ALTER COLUMN itm_ship_grp_cd SET DEFAULT '*';
ALTER VIEW maw_grs_alloc_ctl_key ALTER COLUMN lg_grp_cd SET DEFAULT '*';
ALTER VIEW maw_grs_alloc_ctl_key ALTER COLUMN loc_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_grs_alloc_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_grs_alloc_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_grs_alloc_ctl_key$temp(
				alloc_grp_cd varchar (10) DEFAULT '*' NULL,
				itm_ship_grp_cd varchar (5) DEFAULT '*' NULL,
				lg_grp_cd varchar (10) DEFAULT '*' NULL,
				loc_cd varchar (20) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_grs_alloc_ctl_key_pk_ie ON maw_grs_alloc_ctl_key$temp
				USING BTREE (alloc_grp_cd,itm_ship_grp_cd,lg_grp_cd,loc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_grs_alloc_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_grs_alloc_ctl_key$temp(
			alloc_grp_cd,
			itm_ship_grp_cd,
			lg_grp_cd,
			loc_cd
		)VALUES (
			NEW.alloc_grp_cd,
			NEW.itm_ship_grp_cd,
			NEW.lg_grp_cd,
			NEW.loc_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_grs_alloc_ctl_key$temp
		SET 
			alloc_grp_cd = NEW.alloc_grp_cd,
			itm_ship_grp_cd = NEW.itm_ship_grp_cd,
			lg_grp_cd = NEW.lg_grp_cd,
			loc_cd = NEW.loc_cd
		WHERE 0=0
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL)
		AND (itm_ship_grp_cd = OLD.itm_ship_grp_cd OR itm_ship_grp_cd IS NULL AND OLD.itm_ship_grp_cd IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_grs_alloc_ctl_key$temp
		WHERE 0=0
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL)
		AND (itm_ship_grp_cd = OLD.itm_ship_grp_cd OR itm_ship_grp_cd IS NULL AND OLD.itm_ship_grp_cd IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_grs_alloc_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_grs_alloc_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_grs_alloc_ctl_key$func();
;

