\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mrp_log_key()
RETURNS TABLE (
	wg_cd varchar,
	mrp_calc_no varchar,
	seq_no numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mrp_log_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mrp_log_key$temp(
				wg_cd varchar (10) NULL,
				mrp_calc_no varchar (15) NULL,
				seq_no numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mrp_log_key_pk_ie ON msw_mrp_log_key$temp
				USING BTREE (wg_cd,mrp_calc_no,seq_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mrp_log_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mrp_log_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mrp_log_key
AS
SELECT *
FROM msw_mrp_log_key();

CREATE OR REPLACE FUNCTION msw_mrp_log_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mrp_log_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mrp_log_key$temp(
				wg_cd varchar (10) NULL,
				mrp_calc_no varchar (15) NULL,
				seq_no numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mrp_log_key_pk_ie ON msw_mrp_log_key$temp
				USING BTREE (wg_cd,mrp_calc_no,seq_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mrp_log_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mrp_log_key$temp(
			wg_cd,
			mrp_calc_no,
			seq_no
		)VALUES (
			NEW.wg_cd,
			NEW.mrp_calc_no,
			NEW.seq_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mrp_log_key$temp
		SET 
			wg_cd = NEW.wg_cd,
			mrp_calc_no = NEW.mrp_calc_no,
			seq_no = NEW.seq_no
		WHERE 0=0
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (mrp_calc_no = OLD.mrp_calc_no OR mrp_calc_no IS NULL AND OLD.mrp_calc_no IS NULL)
		AND (seq_no = OLD.seq_no OR seq_no IS NULL AND OLD.seq_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mrp_log_key$temp
		WHERE 0=0
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (mrp_calc_no = OLD.mrp_calc_no OR mrp_calc_no IS NULL AND OLD.mrp_calc_no IS NULL)
		AND (seq_no = OLD.seq_no OR seq_no IS NULL AND OLD.seq_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mrp_log_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mrp_log_key
FOR EACH ROW
EXECUTE PROCEDURE msw_mrp_log_key$func();
;

