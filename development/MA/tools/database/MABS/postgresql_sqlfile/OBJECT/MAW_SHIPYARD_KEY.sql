\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_shipyard_key()
RETURNS TABLE (
	shipyard_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_shipyard_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_shipyard_key$temp(
				shipyard_cd varchar (4) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_shipyard_key_pk_ie ON maw_shipyard_key$temp
				USING BTREE (shipyard_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_shipyard_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_shipyard_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_shipyard_key
AS
SELECT *
FROM maw_shipyard_key();

CREATE OR REPLACE FUNCTION maw_shipyard_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_shipyard_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_shipyard_key$temp(
				shipyard_cd varchar (4) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_shipyard_key_pk_ie ON maw_shipyard_key$temp
				USING BTREE (shipyard_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_shipyard_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_shipyard_key$temp(
			shipyard_cd
		)VALUES (
			NEW.shipyard_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_shipyard_key$temp
		SET 
			shipyard_cd = NEW.shipyard_cd
		WHERE 0=0
		AND (shipyard_cd = OLD.shipyard_cd OR shipyard_cd IS NULL AND OLD.shipyard_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_shipyard_key$temp
		WHERE 0=0
		AND (shipyard_cd = OLD.shipyard_cd OR shipyard_cd IS NULL AND OLD.shipyard_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_shipyard_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_shipyard_key
FOR EACH ROW
EXECUTE PROCEDURE maw_shipyard_key$func();
;

