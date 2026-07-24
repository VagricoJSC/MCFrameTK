\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_expns_key()
RETURNS TABLE (
	expns_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_expns_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_expns_key$temp(
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_expns_key_pk_ie ON maw_expns_key$temp
				USING BTREE (expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_expns_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_expns_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_expns_key
AS
SELECT *
FROM maw_expns_key();

CREATE OR REPLACE FUNCTION maw_expns_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_expns_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_expns_key$temp(
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_expns_key_pk_ie ON maw_expns_key$temp
				USING BTREE (expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_expns_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_expns_key$temp(
			expns_cd
		)VALUES (
			NEW.expns_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_expns_key$temp
		SET 
			expns_cd = NEW.expns_cd
		WHERE 0=0
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_expns_key$temp
		WHERE 0=0
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_expns_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_expns_key
FOR EACH ROW
EXECUTE PROCEDURE maw_expns_key$func();
;

