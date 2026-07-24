\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ex_ctrl_key()
RETURNS TABLE (
	hs_cd varchar,
	cntry_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ex_ctrl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ex_ctrl_key$temp(
				hs_cd varchar (10) NULL,
				cntry_cd varchar (2) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ex_ctrl_key_pk_ie ON maw_ex_ctrl_key$temp
				USING BTREE (hs_cd,cntry_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ex_ctrl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ex_ctrl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ex_ctrl_key
AS
SELECT *
FROM maw_ex_ctrl_key();

CREATE OR REPLACE FUNCTION maw_ex_ctrl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ex_ctrl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ex_ctrl_key$temp(
				hs_cd varchar (10) NULL,
				cntry_cd varchar (2) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ex_ctrl_key_pk_ie ON maw_ex_ctrl_key$temp
				USING BTREE (hs_cd,cntry_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ex_ctrl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ex_ctrl_key$temp(
			hs_cd,
			cntry_cd,
			st_dt
		)VALUES (
			NEW.hs_cd,
			NEW.cntry_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ex_ctrl_key$temp
		SET 
			hs_cd = NEW.hs_cd,
			cntry_cd = NEW.cntry_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (hs_cd = OLD.hs_cd OR hs_cd IS NULL AND OLD.hs_cd IS NULL)
		AND (cntry_cd = OLD.cntry_cd OR cntry_cd IS NULL AND OLD.cntry_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ex_ctrl_key$temp
		WHERE 0=0
		AND (hs_cd = OLD.hs_cd OR hs_cd IS NULL AND OLD.hs_cd IS NULL)
		AND (cntry_cd = OLD.cntry_cd OR cntry_cd IS NULL AND OLD.cntry_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ex_ctrl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ex_ctrl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ex_ctrl_key$func();
;

