\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ship_valid_key()
RETURNS TABLE (
	ship_valid_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ship_valid_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ship_valid_key$temp(
				ship_valid_grp_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ship_valid_key_pk_ie ON maw_ship_valid_key$temp
				USING BTREE (ship_valid_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ship_valid_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ship_valid_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ship_valid_key
AS
SELECT *
FROM maw_ship_valid_key();

CREATE OR REPLACE FUNCTION maw_ship_valid_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ship_valid_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ship_valid_key$temp(
				ship_valid_grp_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ship_valid_key_pk_ie ON maw_ship_valid_key$temp
				USING BTREE (ship_valid_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ship_valid_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ship_valid_key$temp(
			ship_valid_grp_cd
		)VALUES (
			NEW.ship_valid_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ship_valid_key$temp
		SET 
			ship_valid_grp_cd = NEW.ship_valid_grp_cd
		WHERE 0=0
		AND (ship_valid_grp_cd = OLD.ship_valid_grp_cd OR ship_valid_grp_cd IS NULL AND OLD.ship_valid_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ship_valid_key$temp
		WHERE 0=0
		AND (ship_valid_grp_cd = OLD.ship_valid_grp_cd OR ship_valid_grp_cd IS NULL AND OLD.ship_valid_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ship_valid_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ship_valid_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ship_valid_key$func();
;

