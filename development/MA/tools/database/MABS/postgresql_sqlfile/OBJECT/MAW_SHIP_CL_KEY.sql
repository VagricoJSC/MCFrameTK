\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ship_cl_key()
RETURNS TABLE (
	fr_lg_grp_cd varchar,
	to_lg_grp_cd varchar,
	ship_term_cd varchar,
	day_week_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ship_cl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ship_cl_key$temp(
				fr_lg_grp_cd varchar (10) NULL,
				to_lg_grp_cd varchar (10) NULL,
				ship_term_cd varchar (5) DEFAULT '*' NULL,
				day_week_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ship_cl_key_pk_ie ON maw_ship_cl_key$temp
				USING BTREE (fr_lg_grp_cd,to_lg_grp_cd,ship_term_cd,day_week_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ship_cl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ship_cl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ship_cl_key
AS
SELECT *
FROM maw_ship_cl_key();
ALTER VIEW maw_ship_cl_key ALTER COLUMN ship_term_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_ship_cl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ship_cl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ship_cl_key$temp(
				fr_lg_grp_cd varchar (10) NULL,
				to_lg_grp_cd varchar (10) NULL,
				ship_term_cd varchar (5) DEFAULT '*' NULL,
				day_week_typ varchar (1) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ship_cl_key_pk_ie ON maw_ship_cl_key$temp
				USING BTREE (fr_lg_grp_cd,to_lg_grp_cd,ship_term_cd,day_week_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ship_cl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ship_cl_key$temp(
			fr_lg_grp_cd,
			to_lg_grp_cd,
			ship_term_cd,
			day_week_typ
		)VALUES (
			NEW.fr_lg_grp_cd,
			NEW.to_lg_grp_cd,
			NEW.ship_term_cd,
			NEW.day_week_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ship_cl_key$temp
		SET 
			fr_lg_grp_cd = NEW.fr_lg_grp_cd,
			to_lg_grp_cd = NEW.to_lg_grp_cd,
			ship_term_cd = NEW.ship_term_cd,
			day_week_typ = NEW.day_week_typ
		WHERE 0=0
		AND (fr_lg_grp_cd = OLD.fr_lg_grp_cd OR fr_lg_grp_cd IS NULL AND OLD.fr_lg_grp_cd IS NULL)
		AND (to_lg_grp_cd = OLD.to_lg_grp_cd OR to_lg_grp_cd IS NULL AND OLD.to_lg_grp_cd IS NULL)
		AND (ship_term_cd = OLD.ship_term_cd OR ship_term_cd IS NULL AND OLD.ship_term_cd IS NULL)
		AND (day_week_typ = OLD.day_week_typ OR day_week_typ IS NULL AND OLD.day_week_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ship_cl_key$temp
		WHERE 0=0
		AND (fr_lg_grp_cd = OLD.fr_lg_grp_cd OR fr_lg_grp_cd IS NULL AND OLD.fr_lg_grp_cd IS NULL)
		AND (to_lg_grp_cd = OLD.to_lg_grp_cd OR to_lg_grp_cd IS NULL AND OLD.to_lg_grp_cd IS NULL)
		AND (ship_term_cd = OLD.ship_term_cd OR ship_term_cd IS NULL AND OLD.ship_term_cd IS NULL)
		AND (day_week_typ = OLD.day_week_typ OR day_week_typ IS NULL AND OLD.day_week_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ship_cl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ship_cl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ship_cl_key$func();
;

