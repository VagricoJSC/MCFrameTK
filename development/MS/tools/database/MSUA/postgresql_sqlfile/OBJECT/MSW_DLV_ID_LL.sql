\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_dlv_id_ll()
RETURNS TABLE (
	dlv_id_cd varchar,
	dlv_id_typ varchar,
	base_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dlv_id_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dlv_id_ll$temp(
				dlv_id_cd varchar (20) NULL,
				dlv_id_typ varchar (1) NULL,
				base_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dlv_id_ll$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_dlv_id_ll$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_dlv_id_ll
AS
SELECT *
FROM msw_dlv_id_ll();

CREATE OR REPLACE FUNCTION msw_dlv_id_ll$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dlv_id_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dlv_id_ll$temp(
				dlv_id_cd varchar (20) NULL,
				dlv_id_typ varchar (1) NULL,
				base_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dlv_id_ll$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_dlv_id_ll$temp(
			dlv_id_cd,
			dlv_id_typ,
			base_dt
		)VALUES (
			NEW.dlv_id_cd,
			NEW.dlv_id_typ,
			NEW.base_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_dlv_id_ll$temp
		SET 
			dlv_id_cd = NEW.dlv_id_cd,
			dlv_id_typ = NEW.dlv_id_typ,
			base_dt = NEW.base_dt
		WHERE 0=0
		AND (dlv_id_cd = OLD.dlv_id_cd OR dlv_id_cd IS NULL AND OLD.dlv_id_cd IS NULL)
		AND (dlv_id_typ = OLD.dlv_id_typ OR dlv_id_typ IS NULL AND OLD.dlv_id_typ IS NULL)
		AND (base_dt = OLD.base_dt OR base_dt IS NULL AND OLD.base_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_dlv_id_ll$temp
		WHERE 0=0
		AND (dlv_id_cd = OLD.dlv_id_cd OR dlv_id_cd IS NULL AND OLD.dlv_id_cd IS NULL)
		AND (dlv_id_typ = OLD.dlv_id_typ OR dlv_id_typ IS NULL AND OLD.dlv_id_typ IS NULL)
		AND (base_dt = OLD.base_dt OR base_dt IS NULL AND OLD.base_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_dlv_id_ll$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_dlv_id_ll
FOR EACH ROW
EXECUTE PROCEDURE msw_dlv_id_ll$func();
;

