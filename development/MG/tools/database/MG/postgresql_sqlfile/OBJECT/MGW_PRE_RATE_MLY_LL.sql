\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_pre_rate_mly_ll()
RETURNS TABLE (
	pre_alc_rate_cd varchar,
	sa_typ varchar,
	ym timestamp(0),
	calc_ctg_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_rate_mly_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_rate_mly_ll$temp(
				pre_alc_rate_cd varchar (20) NULL,
				sa_typ varchar (1) NULL,
				ym timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_rate_mly_ll$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_pre_rate_mly_ll$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_pre_rate_mly_ll
AS
SELECT *
FROM mgw_pre_rate_mly_ll();

CREATE OR REPLACE FUNCTION mgw_pre_rate_mly_ll$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pre_rate_mly_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pre_rate_mly_ll$temp(
				pre_alc_rate_cd varchar (20) NULL,
				sa_typ varchar (1) NULL,
				ym timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pre_rate_mly_ll$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_pre_rate_mly_ll$temp(
			pre_alc_rate_cd,
			sa_typ,
			ym,
			calc_ctg_cd,
			wg_cd
		)VALUES (
			NEW.pre_alc_rate_cd,
			NEW.sa_typ,
			NEW.ym,
			NEW.calc_ctg_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_pre_rate_mly_ll$temp
		SET 
			pre_alc_rate_cd = NEW.pre_alc_rate_cd,
			sa_typ = NEW.sa_typ,
			ym = NEW.ym,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (pre_alc_rate_cd = OLD.pre_alc_rate_cd OR pre_alc_rate_cd IS NULL AND OLD.pre_alc_rate_cd IS NULL)
		AND (sa_typ = OLD.sa_typ OR sa_typ IS NULL AND OLD.sa_typ IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_pre_rate_mly_ll$temp
		WHERE 0=0
		AND (pre_alc_rate_cd = OLD.pre_alc_rate_cd OR pre_alc_rate_cd IS NULL AND OLD.pre_alc_rate_cd IS NULL)
		AND (sa_typ = OLD.sa_typ OR sa_typ IS NULL AND OLD.sa_typ IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_pre_rate_mly_ll$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_pre_rate_mly_ll
FOR EACH ROW
EXECUTE PROCEDURE mgw_pre_rate_mly_ll$func();
;

