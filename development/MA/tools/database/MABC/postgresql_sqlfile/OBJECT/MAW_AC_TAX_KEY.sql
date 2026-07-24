\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ac_tax_key()
RETURNS TABLE (
	ac_tax_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ac_tax_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ac_tax_key$temp(
				ac_tax_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ac_tax_key_pk_ie ON maw_ac_tax_key$temp
				USING BTREE (ac_tax_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ac_tax_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ac_tax_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ac_tax_key
AS
SELECT *
FROM maw_ac_tax_key();

CREATE OR REPLACE FUNCTION maw_ac_tax_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ac_tax_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ac_tax_key$temp(
				ac_tax_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ac_tax_key_pk_ie ON maw_ac_tax_key$temp
				USING BTREE (ac_tax_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ac_tax_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ac_tax_key$temp(
			ac_tax_cd
		)VALUES (
			NEW.ac_tax_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ac_tax_key$temp
		SET 
			ac_tax_cd = NEW.ac_tax_cd
		WHERE 0=0
		AND (ac_tax_cd = OLD.ac_tax_cd OR ac_tax_cd IS NULL AND OLD.ac_tax_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ac_tax_key$temp
		WHERE 0=0
		AND (ac_tax_cd = OLD.ac_tax_cd OR ac_tax_cd IS NULL AND OLD.ac_tax_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ac_tax_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ac_tax_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ac_tax_key$func();
;

