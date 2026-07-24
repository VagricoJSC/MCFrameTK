\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_bp_ll()
RETURNS TABLE (
	bp_cd varchar,
	dt timestamp(0),
	dlv_cd varchar,
	cst_cd varchar,
	bsppl_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bp_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bp_ll$temp(
				bp_cd varchar (20) NULL,
				dt timestamp(0)  NULL,
				dlv_cd varchar (20) NULL,
				cst_cd varchar (20) NULL,
				bsppl_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bp_ll$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_bp_ll$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_bp_ll
AS
SELECT *
FROM maw_bp_ll();

CREATE OR REPLACE FUNCTION maw_bp_ll$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bp_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bp_ll$temp(
				bp_cd varchar (20) NULL,
				dt timestamp(0)  NULL,
				dlv_cd varchar (20) NULL,
				cst_cd varchar (20) NULL,
				bsppl_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bp_ll$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_bp_ll$temp(
			bp_cd,
			dt,
			dlv_cd,
			cst_cd,
			bsppl_cd
		)VALUES (
			NEW.bp_cd,
			NEW.dt,
			NEW.dlv_cd,
			NEW.cst_cd,
			NEW.bsppl_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_bp_ll$temp
		SET 
			bp_cd = NEW.bp_cd,
			dt = NEW.dt,
			dlv_cd = NEW.dlv_cd,
			cst_cd = NEW.cst_cd,
			bsppl_cd = NEW.bsppl_cd
		WHERE 0=0
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (bsppl_cd = OLD.bsppl_cd OR bsppl_cd IS NULL AND OLD.bsppl_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_bp_ll$temp
		WHERE 0=0
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (bsppl_cd = OLD.bsppl_cd OR bsppl_cd IS NULL AND OLD.bsppl_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_bp_ll$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_bp_ll
FOR EACH ROW
EXECUTE PROCEDURE maw_bp_ll$func();
;

