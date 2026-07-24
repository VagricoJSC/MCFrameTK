\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_hs_key()
RETURNS TABLE (
	hs_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_hs_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_hs_key$temp(
				hs_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_hs_key_pk_ie ON maw_hs_key$temp
				USING BTREE (hs_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_hs_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_hs_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_hs_key
AS
SELECT *
FROM maw_hs_key();

CREATE OR REPLACE FUNCTION maw_hs_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_hs_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_hs_key$temp(
				hs_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_hs_key_pk_ie ON maw_hs_key$temp
				USING BTREE (hs_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_hs_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_hs_key$temp(
			hs_cd
		)VALUES (
			NEW.hs_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_hs_key$temp
		SET 
			hs_cd = NEW.hs_cd
		WHERE 0=0
		AND (hs_cd = OLD.hs_cd OR hs_cd IS NULL AND OLD.hs_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_hs_key$temp
		WHERE 0=0
		AND (hs_cd = OLD.hs_cd OR hs_cd IS NULL AND OLD.hs_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_hs_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_hs_key
FOR EACH ROW
EXECUTE PROCEDURE maw_hs_key$func();
;

