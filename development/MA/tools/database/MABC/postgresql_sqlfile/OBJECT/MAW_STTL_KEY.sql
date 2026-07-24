\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_sttl_key()
RETURNS TABLE (
	sttl_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_sttl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_sttl_key$temp(
				sttl_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_sttl_key_pk_ie ON maw_sttl_key$temp
				USING BTREE (sttl_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_sttl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_sttl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_sttl_key
AS
SELECT *
FROM maw_sttl_key();

CREATE OR REPLACE FUNCTION maw_sttl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_sttl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_sttl_key$temp(
				sttl_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_sttl_key_pk_ie ON maw_sttl_key$temp
				USING BTREE (sttl_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_sttl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_sttl_key$temp(
			sttl_cd
		)VALUES (
			NEW.sttl_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_sttl_key$temp
		SET 
			sttl_cd = NEW.sttl_cd
		WHERE 0=0
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_sttl_key$temp
		WHERE 0=0
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_sttl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_sttl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_sttl_key$func();
;

