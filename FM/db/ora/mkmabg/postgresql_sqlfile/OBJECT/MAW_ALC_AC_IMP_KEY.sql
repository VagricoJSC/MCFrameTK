\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alc_ac_imp_key()
RETURNS TABLE (
	dpt_cd varchar,
	alc_ac_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_ac_imp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_ac_imp_key$temp(
				dpt_cd varchar (20) NULL,
				alc_ac_cd varchar (20) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_ac_imp_key_pk_ie ON maw_alc_ac_imp_key$temp
				USING BTREE (dpt_cd,alc_ac_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_ac_imp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alc_ac_imp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alc_ac_imp_key
AS
SELECT *
FROM maw_alc_ac_imp_key();

CREATE OR REPLACE FUNCTION maw_alc_ac_imp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_ac_imp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_ac_imp_key$temp(
				dpt_cd varchar (20) NULL,
				alc_ac_cd varchar (20) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_ac_imp_key_pk_ie ON maw_alc_ac_imp_key$temp
				USING BTREE (dpt_cd,alc_ac_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_ac_imp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alc_ac_imp_key$temp(
			dpt_cd,
			alc_ac_cd,
			st_dt
		)VALUES (
			NEW.dpt_cd,
			NEW.alc_ac_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alc_ac_imp_key$temp
		SET 
			dpt_cd = NEW.dpt_cd,
			alc_ac_cd = NEW.alc_ac_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alc_ac_imp_key$temp
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (alc_ac_cd = OLD.alc_ac_cd OR alc_ac_cd IS NULL AND OLD.alc_ac_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alc_ac_imp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alc_ac_imp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alc_ac_imp_key$func();
;

