\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_sys_parm_key()
RETURNS TABLE (
	parm_key varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_sys_parm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_sys_parm_key$temp(
				parm_key varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_sys_parm_key_pk_ie ON maw_sys_parm_key$temp
				USING BTREE (parm_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_sys_parm_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_sys_parm_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_sys_parm_key
AS
SELECT *
FROM maw_sys_parm_key();

CREATE OR REPLACE FUNCTION maw_sys_parm_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_sys_parm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_sys_parm_key$temp(
				parm_key varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_sys_parm_key_pk_ie ON maw_sys_parm_key$temp
				USING BTREE (parm_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_sys_parm_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_sys_parm_key$temp(
			parm_key
		)VALUES (
			NEW.parm_key
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_sys_parm_key$temp
		SET 
			parm_key = NEW.parm_key
		WHERE 0=0
		AND (parm_key = OLD.parm_key OR parm_key IS NULL AND OLD.parm_key IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_sys_parm_key$temp
		WHERE 0=0
		AND (parm_key = OLD.parm_key OR parm_key IS NULL AND OLD.parm_key IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_sys_parm_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_sys_parm_key
FOR EACH ROW
EXECUTE PROCEDURE maw_sys_parm_key$func();
;

