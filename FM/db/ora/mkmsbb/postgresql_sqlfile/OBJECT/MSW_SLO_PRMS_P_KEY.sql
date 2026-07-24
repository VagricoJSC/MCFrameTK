\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_slo_prms_p_key()
RETURNS TABLE (
	slo_prms_no varchar,
	slo_prms_rev numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_slo_prms_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_slo_prms_p_key$temp(
				slo_prms_no varchar (15) NULL,
				slo_prms_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_slo_prms_p_key_pk_ie ON msw_slo_prms_p_key$temp
				USING BTREE (slo_prms_no,slo_prms_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_slo_prms_p_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_slo_prms_p_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_slo_prms_p_key
AS
SELECT *
FROM msw_slo_prms_p_key();

CREATE OR REPLACE FUNCTION msw_slo_prms_p_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_slo_prms_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_slo_prms_p_key$temp(
				slo_prms_no varchar (15) NULL,
				slo_prms_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_slo_prms_p_key_pk_ie ON msw_slo_prms_p_key$temp
				USING BTREE (slo_prms_no,slo_prms_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_slo_prms_p_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_slo_prms_p_key$temp(
			slo_prms_no,
			slo_prms_rev
		)VALUES (
			NEW.slo_prms_no,
			NEW.slo_prms_rev
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_slo_prms_p_key$temp
		SET 
			slo_prms_no = NEW.slo_prms_no,
			slo_prms_rev = NEW.slo_prms_rev
		WHERE 0=0
		AND (slo_prms_no = OLD.slo_prms_no OR slo_prms_no IS NULL AND OLD.slo_prms_no IS NULL)
		AND (slo_prms_rev = OLD.slo_prms_rev OR slo_prms_rev IS NULL AND OLD.slo_prms_rev IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_slo_prms_p_key$temp
		WHERE 0=0
		AND (slo_prms_no = OLD.slo_prms_no OR slo_prms_no IS NULL AND OLD.slo_prms_no IS NULL)
		AND (slo_prms_rev = OLD.slo_prms_rev OR slo_prms_rev IS NULL AND OLD.slo_prms_rev IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_slo_prms_p_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_slo_prms_p_key
FOR EACH ROW
EXECUTE PROCEDURE msw_slo_prms_p_key$func();
;

