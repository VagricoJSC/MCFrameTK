\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sls_sum_ig_lvl()
RETURNS TABLE (
	sls_itm_grp_cd varchar,
	crnt_sls_itm_grp_cd varchar,
	dw_sls_itm_grp_cd varchar,
	lvl numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_sum_ig_lvl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_sum_ig_lvl$temp(
				sls_itm_grp_cd varchar (10) NULL,
				crnt_sls_itm_grp_cd varchar (10) NULL,
				dw_sls_itm_grp_cd varchar (10) NULL,
				lvl numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_sum_ig_lvl$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sls_sum_ig_lvl$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sls_sum_ig_lvl
AS
SELECT *
FROM msw_sls_sum_ig_lvl();

CREATE OR REPLACE FUNCTION msw_sls_sum_ig_lvl$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_sum_ig_lvl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_sum_ig_lvl$temp(
				sls_itm_grp_cd varchar (10) NULL,
				crnt_sls_itm_grp_cd varchar (10) NULL,
				dw_sls_itm_grp_cd varchar (10) NULL,
				lvl numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_sum_ig_lvl$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sls_sum_ig_lvl$temp(
			sls_itm_grp_cd,
			crnt_sls_itm_grp_cd,
			dw_sls_itm_grp_cd,
			lvl
		)VALUES (
			NEW.sls_itm_grp_cd,
			NEW.crnt_sls_itm_grp_cd,
			NEW.dw_sls_itm_grp_cd,
			NEW.lvl
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sls_sum_ig_lvl$temp
		SET 
			sls_itm_grp_cd = NEW.sls_itm_grp_cd,
			crnt_sls_itm_grp_cd = NEW.crnt_sls_itm_grp_cd,
			dw_sls_itm_grp_cd = NEW.dw_sls_itm_grp_cd,
			lvl = NEW.lvl
		WHERE 0=0
		AND (sls_itm_grp_cd = OLD.sls_itm_grp_cd OR sls_itm_grp_cd IS NULL AND OLD.sls_itm_grp_cd IS NULL)
		AND (crnt_sls_itm_grp_cd = OLD.crnt_sls_itm_grp_cd OR crnt_sls_itm_grp_cd IS NULL AND OLD.crnt_sls_itm_grp_cd IS NULL)
		AND (dw_sls_itm_grp_cd = OLD.dw_sls_itm_grp_cd OR dw_sls_itm_grp_cd IS NULL AND OLD.dw_sls_itm_grp_cd IS NULL)
		AND (lvl = OLD.lvl OR lvl IS NULL AND OLD.lvl IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sls_sum_ig_lvl$temp
		WHERE 0=0
		AND (sls_itm_grp_cd = OLD.sls_itm_grp_cd OR sls_itm_grp_cd IS NULL AND OLD.sls_itm_grp_cd IS NULL)
		AND (crnt_sls_itm_grp_cd = OLD.crnt_sls_itm_grp_cd OR crnt_sls_itm_grp_cd IS NULL AND OLD.crnt_sls_itm_grp_cd IS NULL)
		AND (dw_sls_itm_grp_cd = OLD.dw_sls_itm_grp_cd OR dw_sls_itm_grp_cd IS NULL AND OLD.dw_sls_itm_grp_cd IS NULL)
		AND (lvl = OLD.lvl OR lvl IS NULL AND OLD.lvl IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sls_sum_ig_lvl$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sls_sum_ig_lvl
FOR EACH ROW
EXECUTE PROCEDURE msw_sls_sum_ig_lvl$func();
;

