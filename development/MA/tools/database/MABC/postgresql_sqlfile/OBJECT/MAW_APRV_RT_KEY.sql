\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_aprv_rt_key()
RETURNS TABLE (
	aprv_func_typ varchar,
	aprv_rt_ptn varchar,
	aprv_role_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_aprv_rt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_aprv_rt_key$temp(
				aprv_func_typ varchar (2) NULL,
				aprv_rt_ptn varchar (10) NULL,
				aprv_role_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_aprv_rt_key_pk_ie ON maw_aprv_rt_key$temp
				USING BTREE (aprv_func_typ,aprv_rt_ptn,aprv_role_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_aprv_rt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_aprv_rt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_aprv_rt_key
AS
SELECT *
FROM maw_aprv_rt_key();

CREATE OR REPLACE FUNCTION maw_aprv_rt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_aprv_rt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_aprv_rt_key$temp(
				aprv_func_typ varchar (2) NULL,
				aprv_rt_ptn varchar (10) NULL,
				aprv_role_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_aprv_rt_key_pk_ie ON maw_aprv_rt_key$temp
				USING BTREE (aprv_func_typ,aprv_rt_ptn,aprv_role_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_aprv_rt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_aprv_rt_key$temp(
			aprv_func_typ,
			aprv_rt_ptn,
			aprv_role_cd,
			st_dt
		)VALUES (
			NEW.aprv_func_typ,
			NEW.aprv_rt_ptn,
			NEW.aprv_role_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_aprv_rt_key$temp
		SET 
			aprv_func_typ = NEW.aprv_func_typ,
			aprv_rt_ptn = NEW.aprv_rt_ptn,
			aprv_role_cd = NEW.aprv_role_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (aprv_func_typ = OLD.aprv_func_typ OR aprv_func_typ IS NULL AND OLD.aprv_func_typ IS NULL)
		AND (aprv_rt_ptn = OLD.aprv_rt_ptn OR aprv_rt_ptn IS NULL AND OLD.aprv_rt_ptn IS NULL)
		AND (aprv_role_cd = OLD.aprv_role_cd OR aprv_role_cd IS NULL AND OLD.aprv_role_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_aprv_rt_key$temp
		WHERE 0=0
		AND (aprv_func_typ = OLD.aprv_func_typ OR aprv_func_typ IS NULL AND OLD.aprv_func_typ IS NULL)
		AND (aprv_rt_ptn = OLD.aprv_rt_ptn OR aprv_rt_ptn IS NULL AND OLD.aprv_rt_ptn IS NULL)
		AND (aprv_role_cd = OLD.aprv_role_cd OR aprv_role_cd IS NULL AND OLD.aprv_role_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_aprv_rt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_aprv_rt_key
FOR EACH ROW
EXECUTE PROCEDURE maw_aprv_rt_key$func();
;

