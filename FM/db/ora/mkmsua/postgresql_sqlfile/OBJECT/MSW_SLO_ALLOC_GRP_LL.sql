\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_slo_alloc_grp_ll()
RETURNS TABLE (
	alloc_grp_cd varchar,
	dlv_cd varchar,
	tdlv_cd varchar,
	sls_dpt_cd varchar,
	base_dt timestamp(0),
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_slo_alloc_grp_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_slo_alloc_grp_ll$temp(
				alloc_grp_cd varchar (10) NULL,
				dlv_cd varchar (20) NULL,
				tdlv_cd varchar (20) NULL,
				sls_dpt_cd varchar (20) NULL,
				base_dt timestamp(0)  NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_slo_alloc_grp_ll$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_slo_alloc_grp_ll$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_slo_alloc_grp_ll
AS
SELECT *
FROM msw_slo_alloc_grp_ll();

CREATE OR REPLACE FUNCTION msw_slo_alloc_grp_ll$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_slo_alloc_grp_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_slo_alloc_grp_ll$temp(
				alloc_grp_cd varchar (10) NULL,
				dlv_cd varchar (20) NULL,
				tdlv_cd varchar (20) NULL,
				sls_dpt_cd varchar (20) NULL,
				base_dt timestamp(0)  NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_slo_alloc_grp_ll$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_slo_alloc_grp_ll$temp(
			alloc_grp_cd,
			dlv_cd,
			tdlv_cd,
			sls_dpt_cd,
			base_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.alloc_grp_cd,
			NEW.dlv_cd,
			NEW.tdlv_cd,
			NEW.sls_dpt_cd,
			NEW.base_dt,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_slo_alloc_grp_ll$temp
		SET 
			alloc_grp_cd = NEW.alloc_grp_cd,
			dlv_cd = NEW.dlv_cd,
			tdlv_cd = NEW.tdlv_cd,
			sls_dpt_cd = NEW.sls_dpt_cd,
			base_dt = NEW.base_dt,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (tdlv_cd = OLD.tdlv_cd OR tdlv_cd IS NULL AND OLD.tdlv_cd IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (base_dt = OLD.base_dt OR base_dt IS NULL AND OLD.base_dt IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_slo_alloc_grp_ll$temp
		WHERE 0=0
		AND (alloc_grp_cd = OLD.alloc_grp_cd OR alloc_grp_cd IS NULL AND OLD.alloc_grp_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (tdlv_cd = OLD.tdlv_cd OR tdlv_cd IS NULL AND OLD.tdlv_cd IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (base_dt = OLD.base_dt OR base_dt IS NULL AND OLD.base_dt IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_slo_alloc_grp_ll$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_slo_alloc_grp_ll
FOR EACH ROW
EXECUTE PROCEDURE msw_slo_alloc_grp_ll$func();
;

