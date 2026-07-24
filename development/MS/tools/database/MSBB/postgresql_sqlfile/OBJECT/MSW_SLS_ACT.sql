\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sls_act()
RETURNS TABLE (
	sls_schd_no varchar,
	unit_cd varchar,
	tax_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_act$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_act$temp(
				sls_schd_no varchar (15) NULL,
				unit_cd varchar (5) NULL,
				tax_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_act$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sls_act$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sls_act
AS
SELECT *
FROM msw_sls_act();

CREATE OR REPLACE FUNCTION msw_sls_act$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_act$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_act$temp(
				sls_schd_no varchar (15) NULL,
				unit_cd varchar (5) NULL,
				tax_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_act$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sls_act$temp(
			sls_schd_no,
			unit_cd,
			tax_cd
		)VALUES (
			NEW.sls_schd_no,
			NEW.unit_cd,
			NEW.tax_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sls_act$temp
		SET 
			sls_schd_no = NEW.sls_schd_no,
			unit_cd = NEW.unit_cd,
			tax_cd = NEW.tax_cd
		WHERE 0=0
		AND (sls_schd_no = OLD.sls_schd_no OR sls_schd_no IS NULL AND OLD.sls_schd_no IS NULL)
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sls_act$temp
		WHERE 0=0
		AND (sls_schd_no = OLD.sls_schd_no OR sls_schd_no IS NULL AND OLD.sls_schd_no IS NULL)
		AND (unit_cd = OLD.unit_cd OR unit_cd IS NULL AND OLD.unit_cd IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sls_act$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sls_act
FOR EACH ROW
EXECUTE PROCEDURE msw_sls_act$func();
;

