\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_site_key()
RETURNS TABLE (
	site_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_site_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_site_key$temp(
				site_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_site_key_pk_ie ON maw_site_key$temp
				USING BTREE (site_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_site_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_site_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_site_key
AS
SELECT *
FROM maw_site_key();

CREATE OR REPLACE FUNCTION maw_site_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_site_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_site_key$temp(
				site_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_site_key_pk_ie ON maw_site_key$temp
				USING BTREE (site_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_site_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_site_key$temp(
			site_cd
		)VALUES (
			NEW.site_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_site_key$temp
		SET 
			site_cd = NEW.site_cd
		WHERE 0=0
		AND (site_cd = OLD.site_cd OR site_cd IS NULL AND OLD.site_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_site_key$temp
		WHERE 0=0
		AND (site_cd = OLD.site_cd OR site_cd IS NULL AND OLD.site_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_site_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_site_key
FOR EACH ROW
EXECUTE PROCEDURE maw_site_key$func();
;

