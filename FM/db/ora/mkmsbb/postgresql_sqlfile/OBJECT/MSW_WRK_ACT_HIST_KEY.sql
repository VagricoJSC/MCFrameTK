\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_wrk_act_hist_key()
RETURNS TABLE (
	wrk_no varchar,
	hist_no numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_wrk_act_hist_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_wrk_act_hist_key$temp(
				wrk_no varchar (15) NULL,
				hist_no numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_wrk_act_hist_key_pk_ie ON msw_wrk_act_hist_key$temp
				USING BTREE (wrk_no,hist_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_wrk_act_hist_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_wrk_act_hist_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_wrk_act_hist_key
AS
SELECT *
FROM msw_wrk_act_hist_key();

CREATE OR REPLACE FUNCTION msw_wrk_act_hist_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_wrk_act_hist_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_wrk_act_hist_key$temp(
				wrk_no varchar (15) NULL,
				hist_no numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_wrk_act_hist_key_pk_ie ON msw_wrk_act_hist_key$temp
				USING BTREE (wrk_no,hist_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_wrk_act_hist_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_wrk_act_hist_key$temp(
			wrk_no,
			hist_no
		)VALUES (
			NEW.wrk_no,
			NEW.hist_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_wrk_act_hist_key$temp
		SET 
			wrk_no = NEW.wrk_no,
			hist_no = NEW.hist_no
		WHERE 0=0
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (hist_no = OLD.hist_no OR hist_no IS NULL AND OLD.hist_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_wrk_act_hist_key$temp
		WHERE 0=0
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (hist_no = OLD.hist_no OR hist_no IS NULL AND OLD.hist_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_wrk_act_hist_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_wrk_act_hist_key
FOR EACH ROW
EXECUTE PROCEDURE msw_wrk_act_hist_key$func();
;

