\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_lg_ctl_key()
RETURNS TABLE (
	fr_lg_grp_cd varchar,
	to_lg_grp_cd varchar,
	ship_term_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_lg_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_lg_ctl_key$temp(
				fr_lg_grp_cd varchar (10) NULL,
				to_lg_grp_cd varchar (10) NULL,
				ship_term_cd varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_lg_ctl_key_pk_ie ON maw_lg_ctl_key$temp
				USING BTREE (fr_lg_grp_cd,to_lg_grp_cd,ship_term_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_lg_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_lg_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_lg_ctl_key
AS
SELECT *
FROM maw_lg_ctl_key();
ALTER VIEW maw_lg_ctl_key ALTER COLUMN ship_term_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_lg_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_lg_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_lg_ctl_key$temp(
				fr_lg_grp_cd varchar (10) NULL,
				to_lg_grp_cd varchar (10) NULL,
				ship_term_cd varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_lg_ctl_key_pk_ie ON maw_lg_ctl_key$temp
				USING BTREE (fr_lg_grp_cd,to_lg_grp_cd,ship_term_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_lg_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_lg_ctl_key$temp(
			fr_lg_grp_cd,
			to_lg_grp_cd,
			ship_term_cd
		)VALUES (
			NEW.fr_lg_grp_cd,
			NEW.to_lg_grp_cd,
			NEW.ship_term_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_lg_ctl_key$temp
		SET 
			fr_lg_grp_cd = NEW.fr_lg_grp_cd,
			to_lg_grp_cd = NEW.to_lg_grp_cd,
			ship_term_cd = NEW.ship_term_cd
		WHERE 0=0
		AND (fr_lg_grp_cd = OLD.fr_lg_grp_cd OR fr_lg_grp_cd IS NULL AND OLD.fr_lg_grp_cd IS NULL)
		AND (to_lg_grp_cd = OLD.to_lg_grp_cd OR to_lg_grp_cd IS NULL AND OLD.to_lg_grp_cd IS NULL)
		AND (ship_term_cd = OLD.ship_term_cd OR ship_term_cd IS NULL AND OLD.ship_term_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_lg_ctl_key$temp
		WHERE 0=0
		AND (fr_lg_grp_cd = OLD.fr_lg_grp_cd OR fr_lg_grp_cd IS NULL AND OLD.fr_lg_grp_cd IS NULL)
		AND (to_lg_grp_cd = OLD.to_lg_grp_cd OR to_lg_grp_cd IS NULL AND OLD.to_lg_grp_cd IS NULL)
		AND (ship_term_cd = OLD.ship_term_cd OR ship_term_cd IS NULL AND OLD.ship_term_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_lg_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_lg_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_lg_ctl_key$func();
;

