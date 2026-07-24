\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_http_header_key()
RETURNS TABLE (
	ext_sys_cd varchar,
	if_proc_typ varchar,
	http_header_nm varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_http_header_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_http_header_key$temp(
				ext_sys_cd varchar (10) NULL,
				if_proc_typ varchar (10) NULL,
				http_header_nm varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_http_header_key_pk_ie ON maw_http_header_key$temp
				USING BTREE (ext_sys_cd,if_proc_typ,http_header_nm);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_http_header_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_http_header_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_http_header_key
AS
SELECT *
FROM maw_http_header_key();

CREATE OR REPLACE FUNCTION maw_http_header_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_http_header_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_http_header_key$temp(
				ext_sys_cd varchar (10) NULL,
				if_proc_typ varchar (10) NULL,
				http_header_nm varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_http_header_key_pk_ie ON maw_http_header_key$temp
				USING BTREE (ext_sys_cd,if_proc_typ,http_header_nm);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_http_header_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_http_header_key$temp(
			ext_sys_cd,
			if_proc_typ,
			http_header_nm
		)VALUES (
			NEW.ext_sys_cd,
			NEW.if_proc_typ,
			NEW.http_header_nm
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_http_header_key$temp
		SET 
			ext_sys_cd = NEW.ext_sys_cd,
			if_proc_typ = NEW.if_proc_typ,
			http_header_nm = NEW.http_header_nm
		WHERE 0=0
		AND (ext_sys_cd = OLD.ext_sys_cd OR ext_sys_cd IS NULL AND OLD.ext_sys_cd IS NULL)
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (http_header_nm = OLD.http_header_nm OR http_header_nm IS NULL AND OLD.http_header_nm IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_http_header_key$temp
		WHERE 0=0
		AND (ext_sys_cd = OLD.ext_sys_cd OR ext_sys_cd IS NULL AND OLD.ext_sys_cd IS NULL)
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (http_header_nm = OLD.http_header_nm OR http_header_nm IS NULL AND OLD.http_header_nm IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_http_header_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_http_header_key
FOR EACH ROW
EXECUTE PROCEDURE maw_http_header_key$func();
;

