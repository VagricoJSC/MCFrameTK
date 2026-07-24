\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_bank_key()
RETURNS TABLE (
	bank_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bank_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bank_key$temp(
				bank_cd varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bank_key_pk_ie ON maw_bank_key$temp
				USING BTREE (bank_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bank_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_bank_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_bank_key
AS
SELECT *
FROM maw_bank_key();

CREATE OR REPLACE FUNCTION maw_bank_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bank_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bank_key$temp(
				bank_cd varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bank_key_pk_ie ON maw_bank_key$temp
				USING BTREE (bank_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bank_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_bank_key$temp(
			bank_cd
		)VALUES (
			NEW.bank_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_bank_key$temp
		SET 
			bank_cd = NEW.bank_cd
		WHERE 0=0
		AND (bank_cd = OLD.bank_cd OR bank_cd IS NULL AND OLD.bank_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_bank_key$temp
		WHERE 0=0
		AND (bank_cd = OLD.bank_cd OR bank_cd IS NULL AND OLD.bank_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_bank_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_bank_key
FOR EACH ROW
EXECUTE PROCEDURE maw_bank_key$func();
;

