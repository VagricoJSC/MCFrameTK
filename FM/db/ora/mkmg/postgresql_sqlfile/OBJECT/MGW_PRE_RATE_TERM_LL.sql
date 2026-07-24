\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_pre_rate_term_ll()
RETURNS TABLE (
	pre_alc_rate_cd varchar,
	term timestamp(0),
	calc_ctg_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_rate_term_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_rate_term_ll$temp(
				pre_alc_rate_cd varchar (20) NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_rate_term_ll$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_pre_rate_term_ll$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_pre_rate_term_ll
AS
SELECT *
FROM mgw_pre_rate_term_ll();

CREATE OR REPLACE FUNCTION mgw_pre_rate_term_ll$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_rate_term_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_rate_term_ll$temp(
				pre_alc_rate_cd varchar (20) NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_rate_term_ll$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_pre_rate_term_ll$temp(
			pre_alc_rate_cd,
			term,
			calc_ctg_cd,
			wg_cd
		)VALUES (
			NEW.pre_alc_rate_cd,
			NEW.term,
			NEW.calc_ctg_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_pre_rate_term_ll$temp
		SET 
			pre_alc_rate_cd = NEW.pre_alc_rate_cd,
			term = NEW.term,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (pre_alc_rate_cd = OLD.pre_alc_rate_cd OR pre_alc_rate_cd IS NULL AND OLD.pre_alc_rate_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_pre_rate_term_ll$temp
		WHERE 0=0
		AND (pre_alc_rate_cd = OLD.pre_alc_rate_cd OR pre_alc_rate_cd IS NULL AND OLD.pre_alc_rate_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_pre_rate_term_ll$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_pre_rate_term_ll
FOR EACH ROW
EXECUTE PROCEDURE mgw_pre_rate_term_ll$func();
;

