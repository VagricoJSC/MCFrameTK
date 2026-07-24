\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_rsrc_loc_key()
RETURNS TABLE (
	mfg_loc_cd varchar,
	rsrc_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rsrc_loc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rsrc_loc_key$temp(
				mfg_loc_cd varchar (20) NULL,
				rsrc_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rsrc_loc_key_pk_ie ON maw_rsrc_loc_key$temp
				USING BTREE (mfg_loc_cd,rsrc_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rsrc_loc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_rsrc_loc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_rsrc_loc_key
AS
SELECT *
FROM maw_rsrc_loc_key();

CREATE OR REPLACE FUNCTION maw_rsrc_loc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rsrc_loc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rsrc_loc_key$temp(
				mfg_loc_cd varchar (20) NULL,
				rsrc_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rsrc_loc_key_pk_ie ON maw_rsrc_loc_key$temp
				USING BTREE (mfg_loc_cd,rsrc_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rsrc_loc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_rsrc_loc_key$temp(
			mfg_loc_cd,
			rsrc_cd,
			st_dt
		)VALUES (
			NEW.mfg_loc_cd,
			NEW.rsrc_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_rsrc_loc_key$temp
		SET 
			mfg_loc_cd = NEW.mfg_loc_cd,
			rsrc_cd = NEW.rsrc_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (rsrc_cd = OLD.rsrc_cd OR rsrc_cd IS NULL AND OLD.rsrc_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_rsrc_loc_key$temp
		WHERE 0=0
		AND (mfg_loc_cd = OLD.mfg_loc_cd OR mfg_loc_cd IS NULL AND OLD.mfg_loc_cd IS NULL)
		AND (rsrc_cd = OLD.rsrc_cd OR rsrc_cd IS NULL AND OLD.rsrc_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_rsrc_loc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_rsrc_loc_key
FOR EACH ROW
EXECUTE PROCEDURE maw_rsrc_loc_key$func();
;

