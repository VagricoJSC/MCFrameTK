\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_insp_schd_key()
RETURNS TABLE (
	insp_schd_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_insp_schd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_insp_schd_key$temp(
				insp_schd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_insp_schd_key_pk_ie ON msw_insp_schd_key$temp
				USING BTREE (insp_schd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_insp_schd_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_insp_schd_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_insp_schd_key
AS
SELECT *
FROM msw_insp_schd_key();

CREATE OR REPLACE FUNCTION msw_insp_schd_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_insp_schd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_insp_schd_key$temp(
				insp_schd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_insp_schd_key_pk_ie ON msw_insp_schd_key$temp
				USING BTREE (insp_schd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_insp_schd_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_insp_schd_key$temp(
			insp_schd_no
		)VALUES (
			NEW.insp_schd_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_insp_schd_key$temp
		SET 
			insp_schd_no = NEW.insp_schd_no
		WHERE 0=0
		AND (insp_schd_no = OLD.insp_schd_no OR insp_schd_no IS NULL AND OLD.insp_schd_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_insp_schd_key$temp
		WHERE 0=0
		AND (insp_schd_no = OLD.insp_schd_no OR insp_schd_no IS NULL AND OLD.insp_schd_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_insp_schd_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_insp_schd_key
FOR EACH ROW
EXECUTE PROCEDURE msw_insp_schd_key$func();
;

