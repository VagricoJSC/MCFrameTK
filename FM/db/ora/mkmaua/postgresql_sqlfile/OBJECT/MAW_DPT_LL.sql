\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_dpt_ll()
RETURNS TABLE (
	dpt_cd varchar,
	dt timestamp(0),
	usr_cd varchar,
	bcst_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_ll$temp(
				dpt_cd varchar (20) NULL,
				dt timestamp(0)  NULL,
				usr_cd varchar (500) NULL,
				bcst_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_ll$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_dpt_ll$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_dpt_ll
AS
SELECT *
FROM maw_dpt_ll();

CREATE OR REPLACE FUNCTION maw_dpt_ll$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_ll$temp(
				dpt_cd varchar (20) NULL,
				dt timestamp(0)  NULL,
				usr_cd varchar (500) NULL,
				bcst_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_ll$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_dpt_ll$temp(
			dpt_cd,
			dt,
			usr_cd,
			bcst_cd
		)VALUES (
			NEW.dpt_cd,
			NEW.dt,
			NEW.usr_cd,
			NEW.bcst_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_dpt_ll$temp
		SET 
			dpt_cd = NEW.dpt_cd,
			dt = NEW.dt,
			usr_cd = NEW.usr_cd,
			bcst_cd = NEW.bcst_cd
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (bcst_cd = OLD.bcst_cd OR bcst_cd IS NULL AND OLD.bcst_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_dpt_ll$temp
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (bcst_cd = OLD.bcst_cd OR bcst_cd IS NULL AND OLD.bcst_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_dpt_ll$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_dpt_ll
FOR EACH ROW
EXECUTE PROCEDURE maw_dpt_ll$func();
;

