\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_trd_key()
RETURNS TABLE (
	trd_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_trd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_trd_key$temp(
				trd_cd varchar (4) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_trd_key_pk_ie ON maw_trd_key$temp
				USING BTREE (trd_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_trd_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_trd_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_trd_key
AS
SELECT *
FROM maw_trd_key();

CREATE OR REPLACE FUNCTION maw_trd_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_trd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_trd_key$temp(
				trd_cd varchar (4) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_trd_key_pk_ie ON maw_trd_key$temp
				USING BTREE (trd_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_trd_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_trd_key$temp(
			trd_cd
		)VALUES (
			NEW.trd_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_trd_key$temp
		SET 
			trd_cd = NEW.trd_cd
		WHERE 0=0
		AND (trd_cd = OLD.trd_cd OR trd_cd IS NULL AND OLD.trd_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_trd_key$temp
		WHERE 0=0
		AND (trd_cd = OLD.trd_cd OR trd_cd IS NULL AND OLD.trd_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_trd_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_trd_key
FOR EACH ROW
EXECUTE PROCEDURE maw_trd_key$func();
;

