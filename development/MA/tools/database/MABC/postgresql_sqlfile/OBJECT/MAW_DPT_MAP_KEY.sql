\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_dpt_map_key()
RETURNS TABLE (
	old_dpt_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_map_key$temp(
				old_dpt_cd varchar (20) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_map_key_pk_ie ON maw_dpt_map_key$temp
				USING BTREE (old_dpt_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_dpt_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_dpt_map_key
AS
SELECT *
FROM maw_dpt_map_key();

CREATE OR REPLACE FUNCTION maw_dpt_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_map_key$temp(
				old_dpt_cd varchar (20) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_map_key_pk_ie ON maw_dpt_map_key$temp
				USING BTREE (old_dpt_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_dpt_map_key$temp(
			old_dpt_cd,
			st_dt
		)VALUES (
			NEW.old_dpt_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_dpt_map_key$temp
		SET 
			old_dpt_cd = NEW.old_dpt_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (old_dpt_cd = OLD.old_dpt_cd OR old_dpt_cd IS NULL AND OLD.old_dpt_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_dpt_map_key$temp
		WHERE 0=0
		AND (old_dpt_cd = OLD.old_dpt_cd OR old_dpt_cd IS NULL AND OLD.old_dpt_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_dpt_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_dpt_map_key
FOR EACH ROW
EXECUTE PROCEDURE maw_dpt_map_key$func();
;

