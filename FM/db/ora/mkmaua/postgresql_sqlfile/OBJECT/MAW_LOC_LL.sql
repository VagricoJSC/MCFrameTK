\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_loc_ll()
RETURNS TABLE (
	loc_cd varchar,
	dt timestamp(0),
	to_loc_cd varchar,
	rqst_fr_wg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_loc_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_loc_ll$temp(
				loc_cd varchar (20) NULL,
				dt timestamp(0)  NULL,
				to_loc_cd varchar (20) NULL,
				rqst_fr_wg_cd varchar (10) NULL,
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
		PERFORM fcpa_postgres_util$set_var('maw_loc_ll$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_loc_ll$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_loc_ll
AS
SELECT *
FROM maw_loc_ll();

CREATE OR REPLACE FUNCTION maw_loc_ll$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_loc_ll$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_loc_ll$temp(
				loc_cd varchar (20) NULL,
				dt timestamp(0)  NULL,
				to_loc_cd varchar (20) NULL,
				rqst_fr_wg_cd varchar (10) NULL,
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
		PERFORM fcpa_postgres_util$set_var('maw_loc_ll$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_loc_ll$temp(
			loc_cd,
			dt,
			to_loc_cd,
			rqst_fr_wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.loc_cd,
			NEW.dt,
			NEW.to_loc_cd,
			NEW.rqst_fr_wg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_loc_ll$temp
		SET 
			loc_cd = NEW.loc_cd,
			dt = NEW.dt,
			to_loc_cd = NEW.to_loc_cd,
			rqst_fr_wg_cd = NEW.rqst_fr_wg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (to_loc_cd = OLD.to_loc_cd OR to_loc_cd IS NULL AND OLD.to_loc_cd IS NULL)
		AND (rqst_fr_wg_cd = OLD.rqst_fr_wg_cd OR rqst_fr_wg_cd IS NULL AND OLD.rqst_fr_wg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_loc_ll$temp
		WHERE 0=0
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (dt = OLD.dt OR dt IS NULL AND OLD.dt IS NULL)
		AND (to_loc_cd = OLD.to_loc_cd OR to_loc_cd IS NULL AND OLD.to_loc_cd IS NULL)
		AND (rqst_fr_wg_cd = OLD.rqst_fr_wg_cd OR rqst_fr_wg_cd IS NULL AND OLD.rqst_fr_wg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_loc_ll$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_loc_ll
FOR EACH ROW
EXECUTE PROCEDURE maw_loc_ll$func();
;

