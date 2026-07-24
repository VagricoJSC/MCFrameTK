\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_sub_ac_map_key()
RETURNS TABLE (
	ac_cd varchar,
	sub_ac_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_sub_ac_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_sub_ac_map_key$temp(
				ac_cd varchar (10) NULL,
				sub_ac_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_sub_ac_map_key_pk_ie ON maw_sub_ac_map_key$temp
				USING BTREE (ac_cd,sub_ac_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_sub_ac_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_sub_ac_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_sub_ac_map_key
AS
SELECT *
FROM maw_sub_ac_map_key();

CREATE OR REPLACE FUNCTION maw_sub_ac_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_sub_ac_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_sub_ac_map_key$temp(
				ac_cd varchar (10) NULL,
				sub_ac_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_sub_ac_map_key_pk_ie ON maw_sub_ac_map_key$temp
				USING BTREE (ac_cd,sub_ac_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_sub_ac_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_sub_ac_map_key$temp(
			ac_cd,
			sub_ac_cd,
			st_dt
		)VALUES (
			NEW.ac_cd,
			NEW.sub_ac_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_sub_ac_map_key$temp
		SET 
			ac_cd = NEW.ac_cd,
			sub_ac_cd = NEW.sub_ac_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (ac_cd = OLD.ac_cd OR ac_cd IS NULL AND OLD.ac_cd IS NULL)
		AND (sub_ac_cd = OLD.sub_ac_cd OR sub_ac_cd IS NULL AND OLD.sub_ac_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_sub_ac_map_key$temp
		WHERE 0=0
		AND (ac_cd = OLD.ac_cd OR ac_cd IS NULL AND OLD.ac_cd IS NULL)
		AND (sub_ac_cd = OLD.sub_ac_cd OR sub_ac_cd IS NULL AND OLD.sub_ac_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_sub_ac_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_sub_ac_map_key
FOR EACH ROW
EXECUTE PROCEDURE maw_sub_ac_map_key$func();
;

