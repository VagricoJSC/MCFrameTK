\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_zoho_sls_schd_d_key()
RETURNS TABLE (
	zoho_sls_schd_no varchar,
	zoho_sls_schd_br_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_zoho_sls_schd_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_zoho_sls_schd_d_key$temp(
				zoho_sls_schd_no varchar (15) NULL,
				zoho_sls_schd_br_no varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_zoho_sls_schd_d_key_pk_ie ON msw_zoho_sls_schd_d_key$temp
				USING BTREE (zoho_sls_schd_no,zoho_sls_schd_br_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_zoho_sls_schd_d_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_zoho_sls_schd_d_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_zoho_sls_schd_d_key
AS
SELECT *
FROM msw_zoho_sls_schd_d_key();

CREATE OR REPLACE FUNCTION msw_zoho_sls_schd_d_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_zoho_sls_schd_d_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_zoho_sls_schd_d_key$temp(
				zoho_sls_schd_no varchar (15) NULL,
				zoho_sls_schd_br_no varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_zoho_sls_schd_d_key_pk_ie ON msw_zoho_sls_schd_d_key$temp
				USING BTREE (zoho_sls_schd_no,zoho_sls_schd_br_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_zoho_sls_schd_d_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_zoho_sls_schd_d_key$temp(
			zoho_sls_schd_no,
			zoho_sls_schd_br_no
		)VALUES (
			NEW.zoho_sls_schd_no,
			NEW.zoho_sls_schd_br_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_zoho_sls_schd_d_key$temp
		SET 
			zoho_sls_schd_no = NEW.zoho_sls_schd_no,
			zoho_sls_schd_br_no = NEW.zoho_sls_schd_br_no
		WHERE 0=0
		AND (zoho_sls_schd_no = OLD.zoho_sls_schd_no OR zoho_sls_schd_no IS NULL AND OLD.zoho_sls_schd_no IS NULL)
		AND (zoho_sls_schd_br_no = OLD.zoho_sls_schd_br_no OR zoho_sls_schd_br_no IS NULL AND OLD.zoho_sls_schd_br_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_zoho_sls_schd_d_key$temp
		WHERE 0=0
		AND (zoho_sls_schd_no = OLD.zoho_sls_schd_no OR zoho_sls_schd_no IS NULL AND OLD.zoho_sls_schd_no IS NULL)
		AND (zoho_sls_schd_br_no = OLD.zoho_sls_schd_br_no OR zoho_sls_schd_br_no IS NULL AND OLD.zoho_sls_schd_br_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_zoho_sls_schd_d_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_zoho_sls_schd_d_key
FOR EACH ROW
EXECUTE PROCEDURE msw_zoho_sls_schd_d_key$func();
;

