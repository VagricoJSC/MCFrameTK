\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_pre_alc_amt_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	alc_amt_key numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_pre_alc_amt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_pre_alc_amt_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				alc_amt_key numeric (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_pre_alc_amt_key_pk_ie ON mgw_calc_pre_alc_amt_key$temp
				USING BTREE (calc_no,calc_grp_cd,alc_amt_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_pre_alc_amt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_pre_alc_amt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_pre_alc_amt_key
AS
SELECT *
FROM mgw_calc_pre_alc_amt_key();

CREATE OR REPLACE FUNCTION mgw_calc_pre_alc_amt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_pre_alc_amt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_pre_alc_amt_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				alc_amt_key numeric (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_pre_alc_amt_key_pk_ie ON mgw_calc_pre_alc_amt_key$temp
				USING BTREE (calc_no,calc_grp_cd,alc_amt_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_pre_alc_amt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_pre_alc_amt_key$temp(
			calc_no,
			calc_grp_cd,
			alc_amt_key
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.alc_amt_key
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_pre_alc_amt_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			alc_amt_key = NEW.alc_amt_key
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (alc_amt_key = OLD.alc_amt_key OR alc_amt_key IS NULL AND OLD.alc_amt_key IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_pre_alc_amt_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (alc_amt_key = OLD.alc_amt_key OR alc_amt_key IS NULL AND OLD.alc_amt_key IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_pre_alc_amt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_pre_alc_amt_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_pre_alc_amt_key$func();
;

