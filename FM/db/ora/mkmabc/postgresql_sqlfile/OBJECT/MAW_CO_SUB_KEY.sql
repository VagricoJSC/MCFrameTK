\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_co_sub_key()
RETURNS TABLE (
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_co_sub_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_co_sub_key$temp(
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_co_sub_key_pk_ie ON maw_co_sub_key$temp
				USING BTREE (st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_co_sub_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_co_sub_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_co_sub_key
AS
SELECT *
FROM maw_co_sub_key();

CREATE OR REPLACE FUNCTION maw_co_sub_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_co_sub_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_co_sub_key$temp(
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_co_sub_key_pk_ie ON maw_co_sub_key$temp
				USING BTREE (st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_co_sub_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_co_sub_key$temp(
			st_dt
		)VALUES (
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_co_sub_key$temp
		SET 
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_co_sub_key$temp
		WHERE 0=0
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_co_sub_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_co_sub_key
FOR EACH ROW
EXECUTE PROCEDURE maw_co_sub_key$func();
;

