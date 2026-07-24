\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_tax_key()
RETURNS TABLE (
	tax_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_tax_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_tax_key$temp(
				tax_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_tax_key_pk_ie ON maw_tax_key$temp
				USING BTREE (tax_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_tax_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_tax_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_tax_key
AS
SELECT *
FROM maw_tax_key();

CREATE OR REPLACE FUNCTION maw_tax_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_tax_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_tax_key$temp(
				tax_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_tax_key_pk_ie ON maw_tax_key$temp
				USING BTREE (tax_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_tax_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_tax_key$temp(
			tax_cd
		)VALUES (
			NEW.tax_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_tax_key$temp
		SET 
			tax_cd = NEW.tax_cd
		WHERE 0=0
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_tax_key$temp
		WHERE 0=0
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_tax_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_tax_key
FOR EACH ROW
EXECUTE PROCEDURE maw_tax_key$func();
;

