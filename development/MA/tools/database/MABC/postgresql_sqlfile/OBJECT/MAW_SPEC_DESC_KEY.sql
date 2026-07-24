\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_spec_desc_key()
RETURNS TABLE (
	spec_cd varchar,
	spec_desc_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_spec_desc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_spec_desc_key$temp(
				spec_cd varchar (10) NULL,
				spec_desc_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_spec_desc_key_pk_ie ON maw_spec_desc_key$temp
				USING BTREE (spec_cd,spec_desc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_spec_desc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_spec_desc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_spec_desc_key
AS
SELECT *
FROM maw_spec_desc_key();

CREATE OR REPLACE FUNCTION maw_spec_desc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_spec_desc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_spec_desc_key$temp(
				spec_cd varchar (10) NULL,
				spec_desc_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_spec_desc_key_pk_ie ON maw_spec_desc_key$temp
				USING BTREE (spec_cd,spec_desc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_spec_desc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_spec_desc_key$temp(
			spec_cd,
			spec_desc_cd
		)VALUES (
			NEW.spec_cd,
			NEW.spec_desc_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_spec_desc_key$temp
		SET 
			spec_cd = NEW.spec_cd,
			spec_desc_cd = NEW.spec_desc_cd
		WHERE 0=0
		AND (spec_cd = OLD.spec_cd OR spec_cd IS NULL AND OLD.spec_cd IS NULL)
		AND (spec_desc_cd = OLD.spec_desc_cd OR spec_desc_cd IS NULL AND OLD.spec_desc_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_spec_desc_key$temp
		WHERE 0=0
		AND (spec_cd = OLD.spec_cd OR spec_cd IS NULL AND OLD.spec_cd IS NULL)
		AND (spec_desc_cd = OLD.spec_desc_cd OR spec_desc_cd IS NULL AND OLD.spec_desc_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_spec_desc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_spec_desc_key
FOR EACH ROW
EXECUTE PROCEDURE maw_spec_desc_key$func();
;

