\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_da_key()
RETURNS TABLE (
	da_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_da_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_da_key$temp(
				da_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_da_key_pk_ie ON maw_da_key$temp
				USING BTREE (da_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_da_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_da_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_da_key
AS
SELECT *
FROM maw_da_key();

CREATE OR REPLACE FUNCTION maw_da_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_da_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_da_key$temp(
				da_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_da_key_pk_ie ON maw_da_key$temp
				USING BTREE (da_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_da_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_da_key$temp(
			da_cd
		)VALUES (
			NEW.da_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_da_key$temp
		SET 
			da_cd = NEW.da_cd
		WHERE 0=0
		AND (da_cd = OLD.da_cd OR da_cd IS NULL AND OLD.da_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_da_key$temp
		WHERE 0=0
		AND (da_cd = OLD.da_cd OR da_cd IS NULL AND OLD.da_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_da_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_da_key
FOR EACH ROW
EXECUTE PROCEDURE maw_da_key$func();
;

