\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cal_key()
RETURNS TABLE (
	cal_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cal_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cal_key$temp(
				cal_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cal_key_pk_ie ON maw_cal_key$temp
				USING BTREE (cal_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cal_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cal_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cal_key
AS
SELECT *
FROM maw_cal_key();

CREATE OR REPLACE FUNCTION maw_cal_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cal_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cal_key$temp(
				cal_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cal_key_pk_ie ON maw_cal_key$temp
				USING BTREE (cal_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cal_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cal_key$temp(
			cal_cd,
			st_dt
		)VALUES (
			NEW.cal_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cal_key$temp
		SET 
			cal_cd = NEW.cal_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (cal_cd = OLD.cal_cd OR cal_cd IS NULL AND OLD.cal_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cal_key$temp
		WHERE 0=0
		AND (cal_cd = OLD.cal_cd OR cal_cd IS NULL AND OLD.cal_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cal_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cal_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cal_key$func();
;

