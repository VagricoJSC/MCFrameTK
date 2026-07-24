\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cntry_key()
RETURNS TABLE (
	cntry_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cntry_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cntry_key$temp(
				cntry_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cntry_key_pk_ie ON maw_cntry_key$temp
				USING BTREE (cntry_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cntry_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cntry_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cntry_key
AS
SELECT *
FROM maw_cntry_key();

CREATE OR REPLACE FUNCTION maw_cntry_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cntry_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cntry_key$temp(
				cntry_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cntry_key_pk_ie ON maw_cntry_key$temp
				USING BTREE (cntry_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cntry_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cntry_key$temp(
			cntry_cd
		)VALUES (
			NEW.cntry_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cntry_key$temp
		SET 
			cntry_cd = NEW.cntry_cd
		WHERE 0=0
		AND (cntry_cd = OLD.cntry_cd OR cntry_cd IS NULL AND OLD.cntry_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cntry_key$temp
		WHERE 0=0
		AND (cntry_cd = OLD.cntry_cd OR cntry_cd IS NULL AND OLD.cntry_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cntry_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cntry_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cntry_key$func();
;

