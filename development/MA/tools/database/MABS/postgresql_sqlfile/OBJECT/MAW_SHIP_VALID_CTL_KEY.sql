\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ship_valid_ctl_key()
RETURNS TABLE (
	cst_cd varchar,
	dlv_cd varchar,
	ship_valid_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ship_valid_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ship_valid_ctl_key$temp(
				cst_cd varchar (20) DEFAULT '*' NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				ship_valid_grp_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ship_valid_ctl_key_pk_ie ON maw_ship_valid_ctl_key$temp
				USING BTREE (cst_cd,dlv_cd,ship_valid_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ship_valid_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ship_valid_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ship_valid_ctl_key
AS
SELECT *
FROM maw_ship_valid_ctl_key();
ALTER VIEW maw_ship_valid_ctl_key ALTER COLUMN cst_cd SET DEFAULT '*';
ALTER VIEW maw_ship_valid_ctl_key ALTER COLUMN dlv_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_ship_valid_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ship_valid_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ship_valid_ctl_key$temp(
				cst_cd varchar (20) DEFAULT '*' NULL,
				dlv_cd varchar (20) DEFAULT '*' NULL,
				ship_valid_grp_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ship_valid_ctl_key_pk_ie ON maw_ship_valid_ctl_key$temp
				USING BTREE (cst_cd,dlv_cd,ship_valid_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ship_valid_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ship_valid_ctl_key$temp(
			cst_cd,
			dlv_cd,
			ship_valid_grp_cd
		)VALUES (
			NEW.cst_cd,
			NEW.dlv_cd,
			NEW.ship_valid_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ship_valid_ctl_key$temp
		SET 
			cst_cd = NEW.cst_cd,
			dlv_cd = NEW.dlv_cd,
			ship_valid_grp_cd = NEW.ship_valid_grp_cd
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (ship_valid_grp_cd = OLD.ship_valid_grp_cd OR ship_valid_grp_cd IS NULL AND OLD.ship_valid_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ship_valid_ctl_key$temp
		WHERE 0=0
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (ship_valid_grp_cd = OLD.ship_valid_grp_cd OR ship_valid_grp_cd IS NULL AND OLD.ship_valid_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ship_valid_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ship_valid_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ship_valid_ctl_key$func();
;

