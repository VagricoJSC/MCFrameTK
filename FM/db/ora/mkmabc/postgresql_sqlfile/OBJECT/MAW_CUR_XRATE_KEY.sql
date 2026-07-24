\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_cur_xrate_key()
RETURNS TABLE (
	fr_cur_cd varchar,
	to_cur_cd varchar,
	xrate_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cur_xrate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cur_xrate_key$temp(
				fr_cur_cd varchar (3) NULL,
				to_cur_cd varchar (3) NULL,
				xrate_cd varchar (2) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cur_xrate_key_pk_ie ON maw_cur_xrate_key$temp
				USING BTREE (fr_cur_cd,to_cur_cd,xrate_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cur_xrate_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_cur_xrate_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_cur_xrate_key
AS
SELECT *
FROM maw_cur_xrate_key();

CREATE OR REPLACE FUNCTION maw_cur_xrate_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_cur_xrate_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_cur_xrate_key$temp(
				fr_cur_cd varchar (3) NULL,
				to_cur_cd varchar (3) NULL,
				xrate_cd varchar (2) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_cur_xrate_key_pk_ie ON maw_cur_xrate_key$temp
				USING BTREE (fr_cur_cd,to_cur_cd,xrate_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_cur_xrate_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_cur_xrate_key$temp(
			fr_cur_cd,
			to_cur_cd,
			xrate_cd,
			st_dt
		)VALUES (
			NEW.fr_cur_cd,
			NEW.to_cur_cd,
			NEW.xrate_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_cur_xrate_key$temp
		SET 
			fr_cur_cd = NEW.fr_cur_cd,
			to_cur_cd = NEW.to_cur_cd,
			xrate_cd = NEW.xrate_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (fr_cur_cd = OLD.fr_cur_cd OR fr_cur_cd IS NULL AND OLD.fr_cur_cd IS NULL)
		AND (to_cur_cd = OLD.to_cur_cd OR to_cur_cd IS NULL AND OLD.to_cur_cd IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_cur_xrate_key$temp
		WHERE 0=0
		AND (fr_cur_cd = OLD.fr_cur_cd OR fr_cur_cd IS NULL AND OLD.fr_cur_cd IS NULL)
		AND (to_cur_cd = OLD.to_cur_cd OR to_cur_cd IS NULL AND OLD.to_cur_cd IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_cur_xrate_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_cur_xrate_key
FOR EACH ROW
EXECUTE PROCEDURE maw_cur_xrate_key$func();
;

