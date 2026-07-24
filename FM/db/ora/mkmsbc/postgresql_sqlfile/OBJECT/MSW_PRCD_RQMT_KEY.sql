\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_prcd_rqmt_key()
RETURNS TABLE (
	rqmt_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_prcd_rqmt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_prcd_rqmt_key$temp(
				rqmt_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_prcd_rqmt_key_pk_ie ON msw_prcd_rqmt_key$temp
				USING BTREE (rqmt_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_prcd_rqmt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_prcd_rqmt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_prcd_rqmt_key
AS
SELECT *
FROM msw_prcd_rqmt_key();

CREATE OR REPLACE FUNCTION msw_prcd_rqmt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_prcd_rqmt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_prcd_rqmt_key$temp(
				rqmt_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_prcd_rqmt_key_pk_ie ON msw_prcd_rqmt_key$temp
				USING BTREE (rqmt_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_prcd_rqmt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_prcd_rqmt_key$temp(
			rqmt_no
		)VALUES (
			NEW.rqmt_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_prcd_rqmt_key$temp
		SET 
			rqmt_no = NEW.rqmt_no
		WHERE 0=0
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_prcd_rqmt_key$temp
		WHERE 0=0
		AND (rqmt_no = OLD.rqmt_no OR rqmt_no IS NULL AND OLD.rqmt_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_prcd_rqmt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_prcd_rqmt_key
FOR EACH ROW
EXECUTE PROCEDURE msw_prcd_rqmt_key$func();
;

