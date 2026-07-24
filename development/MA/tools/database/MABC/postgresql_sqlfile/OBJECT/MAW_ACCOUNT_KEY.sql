\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_account_key()
RETURNS TABLE (
	ac_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_account_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_account_key$temp(
				ac_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_account_key_pk_ie ON maw_account_key$temp
				USING BTREE (ac_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_account_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_account_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_account_key
AS
SELECT *
FROM maw_account_key();

CREATE OR REPLACE FUNCTION maw_account_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_account_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_account_key$temp(
				ac_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_account_key_pk_ie ON maw_account_key$temp
				USING BTREE (ac_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_account_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_account_key$temp(
			ac_cd
		)VALUES (
			NEW.ac_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_account_key$temp
		SET 
			ac_cd = NEW.ac_cd
		WHERE 0=0
		AND (ac_cd = OLD.ac_cd OR ac_cd IS NULL AND OLD.ac_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_account_key$temp
		WHERE 0=0
		AND (ac_cd = OLD.ac_cd OR ac_cd IS NULL AND OLD.ac_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_account_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_account_key
FOR EACH ROW
EXECUTE PROCEDURE maw_account_key$func();
;

