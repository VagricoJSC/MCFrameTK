\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_rsrc_key()
RETURNS TABLE (
	rsrc_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rsrc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rsrc_key$temp(
				rsrc_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rsrc_key_pk_ie ON maw_rsrc_key$temp
				USING BTREE (rsrc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rsrc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_rsrc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_rsrc_key
AS
SELECT *
FROM maw_rsrc_key();

CREATE OR REPLACE FUNCTION maw_rsrc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_rsrc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_rsrc_key$temp(
				rsrc_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_rsrc_key_pk_ie ON maw_rsrc_key$temp
				USING BTREE (rsrc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_rsrc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_rsrc_key$temp(
			rsrc_cd
		)VALUES (
			NEW.rsrc_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_rsrc_key$temp
		SET 
			rsrc_cd = NEW.rsrc_cd
		WHERE 0=0
		AND (rsrc_cd = OLD.rsrc_cd OR rsrc_cd IS NULL AND OLD.rsrc_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_rsrc_key$temp
		WHERE 0=0
		AND (rsrc_cd = OLD.rsrc_cd OR rsrc_cd IS NULL AND OLD.rsrc_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_rsrc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_rsrc_key
FOR EACH ROW
EXECUTE PROCEDURE maw_rsrc_key$func();
;

