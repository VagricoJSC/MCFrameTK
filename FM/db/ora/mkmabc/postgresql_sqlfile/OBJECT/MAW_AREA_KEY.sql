\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_area_key()
RETURNS TABLE (
	area_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_area_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_area_key$temp(
				area_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_area_key_pk_ie ON maw_area_key$temp
				USING BTREE (area_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_area_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_area_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_area_key
AS
SELECT *
FROM maw_area_key();

CREATE OR REPLACE FUNCTION maw_area_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_area_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_area_key$temp(
				area_cd varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_area_key_pk_ie ON maw_area_key$temp
				USING BTREE (area_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_area_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_area_key$temp(
			area_cd
		)VALUES (
			NEW.area_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_area_key$temp
		SET 
			area_cd = NEW.area_cd
		WHERE 0=0
		AND (area_cd = OLD.area_cd OR area_cd IS NULL AND OLD.area_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_area_key$temp
		WHERE 0=0
		AND (area_cd = OLD.area_cd OR area_cd IS NULL AND OLD.area_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_area_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_area_key
FOR EACH ROW
EXECUTE PROCEDURE maw_area_key$func();
;

