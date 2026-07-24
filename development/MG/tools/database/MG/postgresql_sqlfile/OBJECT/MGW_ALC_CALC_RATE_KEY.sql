\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_alc_calc_rate_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	alc_grp_id numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_alc_calc_rate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_alc_calc_rate_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				alc_grp_id numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_alc_calc_rate_key_pk_ie ON mgw_alc_calc_rate_key$temp
				USING BTREE (calc_no,calc_grp_cd,alc_grp_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_alc_calc_rate_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_alc_calc_rate_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_alc_calc_rate_key
AS
SELECT *
FROM mgw_alc_calc_rate_key();

CREATE OR REPLACE FUNCTION mgw_alc_calc_rate_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_alc_calc_rate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_alc_calc_rate_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				alc_grp_id numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_alc_calc_rate_key_pk_ie ON mgw_alc_calc_rate_key$temp
				USING BTREE (calc_no,calc_grp_cd,alc_grp_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_alc_calc_rate_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_alc_calc_rate_key$temp(
			calc_no,
			calc_grp_cd,
			alc_grp_id
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.alc_grp_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_alc_calc_rate_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			alc_grp_id = NEW.alc_grp_id
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (alc_grp_id = OLD.alc_grp_id OR alc_grp_id IS NULL AND OLD.alc_grp_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_alc_calc_rate_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (alc_grp_id = OLD.alc_grp_id OR alc_grp_id IS NULL AND OLD.alc_grp_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_alc_calc_rate_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_alc_calc_rate_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_alc_calc_rate_key$func();
;

