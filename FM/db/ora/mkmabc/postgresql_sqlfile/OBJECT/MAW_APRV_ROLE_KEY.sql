\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_aprv_role_key()
RETURNS TABLE (
	aprv_role_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_aprv_role_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_aprv_role_key$temp(
				aprv_role_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_aprv_role_key_pk_ie ON maw_aprv_role_key$temp
				USING BTREE (aprv_role_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_aprv_role_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_aprv_role_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_aprv_role_key
AS
SELECT *
FROM maw_aprv_role_key();

CREATE OR REPLACE FUNCTION maw_aprv_role_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_aprv_role_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_aprv_role_key$temp(
				aprv_role_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_aprv_role_key_pk_ie ON maw_aprv_role_key$temp
				USING BTREE (aprv_role_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_aprv_role_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_aprv_role_key$temp(
			aprv_role_cd
		)VALUES (
			NEW.aprv_role_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_aprv_role_key$temp
		SET 
			aprv_role_cd = NEW.aprv_role_cd
		WHERE 0=0
		AND (aprv_role_cd = OLD.aprv_role_cd OR aprv_role_cd IS NULL AND OLD.aprv_role_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_aprv_role_key$temp
		WHERE 0=0
		AND (aprv_role_cd = OLD.aprv_role_cd OR aprv_role_cd IS NULL AND OLD.aprv_role_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_aprv_role_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_aprv_role_key
FOR EACH ROW
EXECUTE PROCEDURE maw_aprv_role_key$func();
;

