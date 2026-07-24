\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_xrate_key()
RETURNS TABLE (
	xrate_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_xrate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_xrate_key$temp(
				xrate_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_xrate_key_pk_ie ON maw_xrate_key$temp
				USING BTREE (xrate_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_xrate_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_xrate_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_xrate_key
AS
SELECT *
FROM maw_xrate_key();

CREATE OR REPLACE FUNCTION maw_xrate_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_xrate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_xrate_key$temp(
				xrate_cd varchar (2) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_xrate_key_pk_ie ON maw_xrate_key$temp
				USING BTREE (xrate_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_xrate_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_xrate_key$temp(
			xrate_cd
		)VALUES (
			NEW.xrate_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_xrate_key$temp
		SET 
			xrate_cd = NEW.xrate_cd
		WHERE 0=0
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_xrate_key$temp
		WHERE 0=0
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_xrate_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_xrate_key
FOR EACH ROW
EXECUTE PROCEDURE maw_xrate_key$func();
;

