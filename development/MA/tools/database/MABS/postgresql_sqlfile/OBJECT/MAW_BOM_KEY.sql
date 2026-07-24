\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_bom_key()
RETURNS TABLE (
	bom_key varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bom_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bom_key$temp(
				bom_key varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bom_key_pk_ie ON maw_bom_key$temp
				USING BTREE (bom_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bom_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_bom_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_bom_key
AS
SELECT *
FROM maw_bom_key();

CREATE OR REPLACE FUNCTION maw_bom_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bom_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bom_key$temp(
				bom_key varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bom_key_pk_ie ON maw_bom_key$temp
				USING BTREE (bom_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bom_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_bom_key$temp(
			bom_key
		)VALUES (
			NEW.bom_key
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_bom_key$temp
		SET 
			bom_key = NEW.bom_key
		WHERE 0=0
		AND (bom_key = OLD.bom_key OR bom_key IS NULL AND OLD.bom_key IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_bom_key$temp
		WHERE 0=0
		AND (bom_key = OLD.bom_key OR bom_key IS NULL AND OLD.bom_key IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_bom_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_bom_key
FOR EACH ROW
EXECUTE PROCEDURE maw_bom_key$func();
;

