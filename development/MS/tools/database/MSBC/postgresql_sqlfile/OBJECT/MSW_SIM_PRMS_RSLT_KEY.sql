\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sim_prms_rslt_key()
RETURNS TABLE (
	wg_cd varchar,
	wg_rqst_no varchar,
	slo_d_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sim_prms_rslt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sim_prms_rslt_key$temp(
				wg_cd varchar (10) NULL,
				wg_rqst_no varchar (15) NULL,
				slo_d_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sim_prms_rslt_key_pk_ie ON msw_sim_prms_rslt_key$temp
				USING BTREE (wg_cd,wg_rqst_no,slo_d_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sim_prms_rslt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sim_prms_rslt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sim_prms_rslt_key
AS
SELECT *
FROM msw_sim_prms_rslt_key();

CREATE OR REPLACE FUNCTION msw_sim_prms_rslt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sim_prms_rslt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sim_prms_rslt_key$temp(
				wg_cd varchar (10) NULL,
				wg_rqst_no varchar (15) NULL,
				slo_d_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sim_prms_rslt_key_pk_ie ON msw_sim_prms_rslt_key$temp
				USING BTREE (wg_cd,wg_rqst_no,slo_d_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sim_prms_rslt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sim_prms_rslt_key$temp(
			wg_cd,
			wg_rqst_no,
			slo_d_no
		)VALUES (
			NEW.wg_cd,
			NEW.wg_rqst_no,
			NEW.slo_d_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sim_prms_rslt_key$temp
		SET 
			wg_cd = NEW.wg_cd,
			wg_rqst_no = NEW.wg_rqst_no,
			slo_d_no = NEW.slo_d_no
		WHERE 0=0
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (wg_rqst_no = OLD.wg_rqst_no OR wg_rqst_no IS NULL AND OLD.wg_rqst_no IS NULL)
		AND (slo_d_no = OLD.slo_d_no OR slo_d_no IS NULL AND OLD.slo_d_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sim_prms_rslt_key$temp
		WHERE 0=0
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (wg_rqst_no = OLD.wg_rqst_no OR wg_rqst_no IS NULL AND OLD.wg_rqst_no IS NULL)
		AND (slo_d_no = OLD.slo_d_no OR slo_d_no IS NULL AND OLD.slo_d_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sim_prms_rslt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sim_prms_rslt_key
FOR EACH ROW
EXECUTE PROCEDURE msw_sim_prms_rslt_key$func();
;

