\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_spec_desc_key()
RETURNS TABLE (
	spec_desc_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spec_desc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spec_desc_key$temp(
				spec_desc_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spec_desc_key_pk_ie ON msw_spec_desc_key$temp
				USING BTREE (spec_desc_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spec_desc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_spec_desc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_spec_desc_key
AS
SELECT *
FROM msw_spec_desc_key();

CREATE OR REPLACE FUNCTION msw_spec_desc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spec_desc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spec_desc_key$temp(
				spec_desc_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spec_desc_key_pk_ie ON msw_spec_desc_key$temp
				USING BTREE (spec_desc_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spec_desc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_spec_desc_key$temp(
			spec_desc_no
		)VALUES (
			NEW.spec_desc_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_spec_desc_key$temp
		SET 
			spec_desc_no = NEW.spec_desc_no
		WHERE 0=0
		AND (spec_desc_no = OLD.spec_desc_no OR spec_desc_no IS NULL AND OLD.spec_desc_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_spec_desc_key$temp
		WHERE 0=0
		AND (spec_desc_no = OLD.spec_desc_no OR spec_desc_no IS NULL AND OLD.spec_desc_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_spec_desc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_spec_desc_key
FOR EACH ROW
EXECUTE PROCEDURE msw_spec_desc_key$func();
;

