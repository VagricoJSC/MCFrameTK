\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sls_itm_comp_key()
RETURNS TABLE (
	sls_itm_comp_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_itm_comp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_itm_comp_key$temp(
				sls_itm_comp_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sls_itm_comp_key_pk_ie ON msw_sls_itm_comp_key$temp
				USING BTREE (sls_itm_comp_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_itm_comp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sls_itm_comp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sls_itm_comp_key
AS
SELECT *
FROM msw_sls_itm_comp_key();

CREATE OR REPLACE FUNCTION msw_sls_itm_comp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_itm_comp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_itm_comp_key$temp(
				sls_itm_comp_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sls_itm_comp_key_pk_ie ON msw_sls_itm_comp_key$temp
				USING BTREE (sls_itm_comp_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_itm_comp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sls_itm_comp_key$temp(
			sls_itm_comp_no
		)VALUES (
			NEW.sls_itm_comp_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sls_itm_comp_key$temp
		SET 
			sls_itm_comp_no = NEW.sls_itm_comp_no
		WHERE 0=0
		AND (sls_itm_comp_no = OLD.sls_itm_comp_no OR sls_itm_comp_no IS NULL AND OLD.sls_itm_comp_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sls_itm_comp_key$temp
		WHERE 0=0
		AND (sls_itm_comp_no = OLD.sls_itm_comp_no OR sls_itm_comp_no IS NULL AND OLD.sls_itm_comp_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sls_itm_comp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sls_itm_comp_key
FOR EACH ROW
EXECUTE PROCEDURE msw_sls_itm_comp_key$func();
;

