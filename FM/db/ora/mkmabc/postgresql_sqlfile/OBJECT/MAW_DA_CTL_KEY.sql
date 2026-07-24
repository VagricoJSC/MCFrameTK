\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_da_ctl_key()
RETURNS TABLE (
	da_cd varchar,
	wg_cd varchar,
	dpt_cd varchar,
	loc_cd varchar,
	lg_grp_cd varchar,
	alloc_grp_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_da_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_da_ctl_key$temp(
				da_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				lg_grp_cd varchar (10) NULL,
				alloc_grp_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_da_ctl_key_pk_ie ON maw_da_ctl_key$temp
				USING BTREE (da_cd,wg_cd,dpt_cd,loc_cd,lg_grp_cd,alloc_grp_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_da_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_da_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_da_ctl_key
AS
SELECT *
FROM maw_da_ctl_key();

CREATE OR REPLACE FUNCTION maw_da_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_da_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_da_ctl_key$temp(
				da_cd varchar (10) NULL,
				wg_cd varchar (10) NULL,
				dpt_cd varchar (20) NULL,
				loc_cd varchar (20) NULL,
				lg_grp_cd varchar (10) NULL,
				alloc_grp_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_da_ctl_key_pk_ie ON maw_da_ctl_key$temp
				USING BTREE (da_cd,wg_cd,dpt_cd,loc_cd,lg_grp_cd,alloc_grp_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_da_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_da_ctl_key$temp(
			da_cd,
			wg_cd,
			dpt_cd,
			loc_cd,
			lg_grp_cd,
			alloc_grp_cd,
			st_dt
		)VALUES (
			NEW.da_cd,
			NEW.wg_cd,
			NEW.dpt_cd,
			NEW.loc_cd,
			NEW.lg_grp_cd,
			NEW.alloc_grp_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_da_ctl_key$temp
		SET 
			da_cd = NEW.da_cd,
			wg_cd = NEW.wg_cd,
			dpt_cd = NEW.dpt_cd,
			loc_cd = NEW.loc_cd,
			lg_grp_cd = NEW.lg_grp_cd,
			alloc_grp_cd = NEW.alloc_grp_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (da_cd = OLD.da_cd OR da_cd IS NULL AND OLD.da_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_da_ctl_key$temp
		WHERE 0=0
		AND (da_cd = OLD.da_cd OR da_cd IS NULL AND OLD.da_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_da_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_da_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_da_ctl_key$func();
;

