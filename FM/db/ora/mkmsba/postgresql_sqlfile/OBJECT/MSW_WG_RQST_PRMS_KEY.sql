\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_wg_rqst_prms_key()
RETURNS TABLE (
	wg_rqst_prms_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_wg_rqst_prms_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_wg_rqst_prms_key$temp(
				wg_rqst_prms_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_wg_rqst_prms_key_pk_ie ON msw_wg_rqst_prms_key$temp
				USING BTREE (wg_rqst_prms_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_wg_rqst_prms_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_wg_rqst_prms_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_wg_rqst_prms_key
AS
SELECT *
FROM msw_wg_rqst_prms_key();

CREATE OR REPLACE FUNCTION msw_wg_rqst_prms_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_wg_rqst_prms_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_wg_rqst_prms_key$temp(
				wg_rqst_prms_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_wg_rqst_prms_key_pk_ie ON msw_wg_rqst_prms_key$temp
				USING BTREE (wg_rqst_prms_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_wg_rqst_prms_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_wg_rqst_prms_key$temp(
			wg_rqst_prms_no
		)VALUES (
			NEW.wg_rqst_prms_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_wg_rqst_prms_key$temp
		SET 
			wg_rqst_prms_no = NEW.wg_rqst_prms_no
		WHERE 0=0
		AND (wg_rqst_prms_no = OLD.wg_rqst_prms_no OR wg_rqst_prms_no IS NULL AND OLD.wg_rqst_prms_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_wg_rqst_prms_key$temp
		WHERE 0=0
		AND (wg_rqst_prms_no = OLD.wg_rqst_prms_no OR wg_rqst_prms_no IS NULL AND OLD.wg_rqst_prms_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_wg_rqst_prms_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_wg_rqst_prms_key
FOR EACH ROW
EXECUTE PROCEDURE msw_wg_rqst_prms_key$func();
;

