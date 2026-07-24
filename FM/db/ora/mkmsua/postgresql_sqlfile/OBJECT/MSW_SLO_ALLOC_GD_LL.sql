\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_slo_alloc_gd_ll()
RETURNS TABLE (
	gd_cd varchar,
	cst_cd varchar,
	dlv_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_slo_alloc_gd_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_slo_alloc_gd_ll$temp(
				gd_cd varchar (2) NULL,
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_slo_alloc_gd_ll$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_slo_alloc_gd_ll$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_slo_alloc_gd_ll
AS
SELECT *
FROM msw_slo_alloc_gd_ll();

CREATE OR REPLACE FUNCTION msw_slo_alloc_gd_ll$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_slo_alloc_gd_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_slo_alloc_gd_ll$temp(
				gd_cd varchar (2) NULL,
				cst_cd varchar (20) NULL,
				dlv_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_slo_alloc_gd_ll$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_slo_alloc_gd_ll$temp(
			gd_cd,
			cst_cd,
			dlv_cd
		)VALUES (
			NEW.gd_cd,
			NEW.cst_cd,
			NEW.dlv_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_slo_alloc_gd_ll$temp
		SET 
			gd_cd = NEW.gd_cd,
			cst_cd = NEW.cst_cd,
			dlv_cd = NEW.dlv_cd
		WHERE 0=0
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_slo_alloc_gd_ll$temp
		WHERE 0=0
		AND (gd_cd = OLD.gd_cd OR gd_cd IS NULL AND OLD.gd_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_slo_alloc_gd_ll$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_slo_alloc_gd_ll
FOR EACH ROW
EXECUTE PROCEDURE msw_slo_alloc_gd_ll$func();
;

