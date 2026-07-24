\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ac_tax_map_key()
RETURNS TABLE (
	ac_slip_typ varchar,
	tax_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ac_tax_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ac_tax_map_key$temp(
				ac_slip_typ varchar (5) NULL,
				tax_cd varchar (5) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ac_tax_map_key_pk_ie ON maw_ac_tax_map_key$temp
				USING BTREE (ac_slip_typ,tax_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ac_tax_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ac_tax_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ac_tax_map_key
AS
SELECT *
FROM maw_ac_tax_map_key();

CREATE OR REPLACE FUNCTION maw_ac_tax_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ac_tax_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ac_tax_map_key$temp(
				ac_slip_typ varchar (5) NULL,
				tax_cd varchar (5) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ac_tax_map_key_pk_ie ON maw_ac_tax_map_key$temp
				USING BTREE (ac_slip_typ,tax_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ac_tax_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ac_tax_map_key$temp(
			ac_slip_typ,
			tax_cd,
			st_dt
		)VALUES (
			NEW.ac_slip_typ,
			NEW.tax_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ac_tax_map_key$temp
		SET 
			ac_slip_typ = NEW.ac_slip_typ,
			tax_cd = NEW.tax_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ac_tax_map_key$temp
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ac_tax_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ac_tax_map_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ac_tax_map_key$func();
;

