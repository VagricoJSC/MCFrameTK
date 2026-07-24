\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sls_sum_dpt_lvl()
RETURNS TABLE (
	ym timestamp(0),
	sls_dpt_cd varchar,
	crnt_dpt_cd varchar,
	dw_dpt_cd varchar,
	lvl numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_sum_dpt_lvl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_sum_dpt_lvl$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				crnt_dpt_cd varchar (20) NULL,
				dw_dpt_cd varchar (20) NULL,
				lvl numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_sum_dpt_lvl$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sls_sum_dpt_lvl$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sls_sum_dpt_lvl
AS
SELECT *
FROM msw_sls_sum_dpt_lvl();

CREATE OR REPLACE FUNCTION msw_sls_sum_dpt_lvl$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_sum_dpt_lvl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_sum_dpt_lvl$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				crnt_dpt_cd varchar (20) NULL,
				dw_dpt_cd varchar (20) NULL,
				lvl numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_sum_dpt_lvl$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sls_sum_dpt_lvl$temp(
			ym,
			sls_dpt_cd,
			crnt_dpt_cd,
			dw_dpt_cd,
			lvl
		)VALUES (
			NEW.ym,
			NEW.sls_dpt_cd,
			NEW.crnt_dpt_cd,
			NEW.dw_dpt_cd,
			NEW.lvl
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sls_sum_dpt_lvl$temp
		SET 
			ym = NEW.ym,
			sls_dpt_cd = NEW.sls_dpt_cd,
			crnt_dpt_cd = NEW.crnt_dpt_cd,
			dw_dpt_cd = NEW.dw_dpt_cd,
			lvl = NEW.lvl
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (crnt_dpt_cd = OLD.crnt_dpt_cd OR crnt_dpt_cd IS NULL AND OLD.crnt_dpt_cd IS NULL)
		AND (dw_dpt_cd = OLD.dw_dpt_cd OR dw_dpt_cd IS NULL AND OLD.dw_dpt_cd IS NULL)
		AND (lvl = OLD.lvl OR lvl IS NULL AND OLD.lvl IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sls_sum_dpt_lvl$temp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (crnt_dpt_cd = OLD.crnt_dpt_cd OR crnt_dpt_cd IS NULL AND OLD.crnt_dpt_cd IS NULL)
		AND (dw_dpt_cd = OLD.dw_dpt_cd OR dw_dpt_cd IS NULL AND OLD.dw_dpt_cd IS NULL)
		AND (lvl = OLD.lvl OR lvl IS NULL AND OLD.lvl IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sls_sum_dpt_lvl$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sls_sum_dpt_lvl
FOR EACH ROW
EXECUTE PROCEDURE msw_sls_sum_dpt_lvl$func();
;

