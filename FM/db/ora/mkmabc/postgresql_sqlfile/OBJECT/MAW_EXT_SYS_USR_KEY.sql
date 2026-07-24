\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ext_sys_usr_key()
RETURNS TABLE (
	ext_sys_cd varchar,
	usr_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ext_sys_usr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ext_sys_usr_key$temp(
				ext_sys_cd varchar (10) NULL,
				usr_cd varchar (500) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ext_sys_usr_key_pk_ie ON maw_ext_sys_usr_key$temp
				USING BTREE (ext_sys_cd,usr_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ext_sys_usr_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ext_sys_usr_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ext_sys_usr_key
AS
SELECT *
FROM maw_ext_sys_usr_key();
ALTER VIEW maw_ext_sys_usr_key ALTER COLUMN usr_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_ext_sys_usr_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ext_sys_usr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ext_sys_usr_key$temp(
				ext_sys_cd varchar (10) NULL,
				usr_cd varchar (500) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ext_sys_usr_key_pk_ie ON maw_ext_sys_usr_key$temp
				USING BTREE (ext_sys_cd,usr_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ext_sys_usr_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ext_sys_usr_key$temp(
			ext_sys_cd,
			usr_cd
		)VALUES (
			NEW.ext_sys_cd,
			NEW.usr_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ext_sys_usr_key$temp
		SET 
			ext_sys_cd = NEW.ext_sys_cd,
			usr_cd = NEW.usr_cd
		WHERE 0=0
		AND (ext_sys_cd = OLD.ext_sys_cd OR ext_sys_cd IS NULL AND OLD.ext_sys_cd IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ext_sys_usr_key$temp
		WHERE 0=0
		AND (ext_sys_cd = OLD.ext_sys_cd OR ext_sys_cd IS NULL AND OLD.ext_sys_cd IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ext_sys_usr_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ext_sys_usr_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ext_sys_usr_key$func();
;

