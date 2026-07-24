\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_loc_key()
RETURNS TABLE (
	loc_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_loc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_loc_key$temp(
				loc_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_loc_key_pk_ie ON maw_loc_key$temp
				USING BTREE (loc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_loc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_loc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_loc_key
AS
SELECT *
FROM maw_loc_key();

CREATE OR REPLACE FUNCTION maw_loc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_loc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_loc_key$temp(
				loc_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_loc_key_pk_ie ON maw_loc_key$temp
				USING BTREE (loc_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_loc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_loc_key$temp(
			loc_cd
		)VALUES (
			NEW.loc_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_loc_key$temp
		SET 
			loc_cd = NEW.loc_cd
		WHERE 0=0
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_loc_key$temp
		WHERE 0=0
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_loc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_loc_key
FOR EACH ROW
EXECUTE PROCEDURE maw_loc_key$func();
;

