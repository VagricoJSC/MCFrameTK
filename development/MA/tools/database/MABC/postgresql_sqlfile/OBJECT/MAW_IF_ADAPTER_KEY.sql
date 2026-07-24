\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_if_adapter_key()
RETURNS TABLE (
	ext_sys_cd varchar,
	if_proc_typ varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_if_adapter_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_if_adapter_key$temp(
				ext_sys_cd varchar (10) NULL,
				if_proc_typ varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_if_adapter_key_pk_ie ON maw_if_adapter_key$temp
				USING BTREE (ext_sys_cd,if_proc_typ,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_if_adapter_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_if_adapter_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_if_adapter_key
AS
SELECT *
FROM maw_if_adapter_key();

CREATE OR REPLACE FUNCTION maw_if_adapter_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_if_adapter_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_if_adapter_key$temp(
				ext_sys_cd varchar (10) NULL,
				if_proc_typ varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_if_adapter_key_pk_ie ON maw_if_adapter_key$temp
				USING BTREE (ext_sys_cd,if_proc_typ,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_if_adapter_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_if_adapter_key$temp(
			ext_sys_cd,
			if_proc_typ,
			st_dt
		)VALUES (
			NEW.ext_sys_cd,
			NEW.if_proc_typ,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_if_adapter_key$temp
		SET 
			ext_sys_cd = NEW.ext_sys_cd,
			if_proc_typ = NEW.if_proc_typ,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (ext_sys_cd = OLD.ext_sys_cd OR ext_sys_cd IS NULL AND OLD.ext_sys_cd IS NULL)
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_if_adapter_key$temp
		WHERE 0=0
		AND (ext_sys_cd = OLD.ext_sys_cd OR ext_sys_cd IS NULL AND OLD.ext_sys_cd IS NULL)
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_if_adapter_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_if_adapter_key
FOR EACH ROW
EXECUTE PROCEDURE maw_if_adapter_key$func();
;

