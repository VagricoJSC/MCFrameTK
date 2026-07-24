\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ap_appl_schd_key()
RETURNS TABLE (
	ap_appl_schd_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ap_appl_schd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ap_appl_schd_key$temp(
				ap_appl_schd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ap_appl_schd_key_pk_ie ON msw_ap_appl_schd_key$temp
				USING BTREE (ap_appl_schd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ap_appl_schd_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ap_appl_schd_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ap_appl_schd_key
AS
SELECT *
FROM msw_ap_appl_schd_key();

CREATE OR REPLACE FUNCTION msw_ap_appl_schd_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ap_appl_schd_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ap_appl_schd_key$temp(
				ap_appl_schd_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ap_appl_schd_key_pk_ie ON msw_ap_appl_schd_key$temp
				USING BTREE (ap_appl_schd_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ap_appl_schd_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ap_appl_schd_key$temp(
			ap_appl_schd_no
		)VALUES (
			NEW.ap_appl_schd_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ap_appl_schd_key$temp
		SET 
			ap_appl_schd_no = NEW.ap_appl_schd_no
		WHERE 0=0
		AND (ap_appl_schd_no = OLD.ap_appl_schd_no OR ap_appl_schd_no IS NULL AND OLD.ap_appl_schd_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ap_appl_schd_key$temp
		WHERE 0=0
		AND (ap_appl_schd_no = OLD.ap_appl_schd_no OR ap_appl_schd_no IS NULL AND OLD.ap_appl_schd_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ap_appl_schd_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ap_appl_schd_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ap_appl_schd_key$func();
;

