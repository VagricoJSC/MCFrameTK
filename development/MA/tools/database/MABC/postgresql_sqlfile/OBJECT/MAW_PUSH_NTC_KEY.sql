\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_push_ntc_key()
RETURNS TABLE (
	push_ntc_typ varchar,
	ntc_wg_cd varchar,
	ntc_dpt_cd varchar,
	ntc_aprv_role_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc_key$temp(
				push_ntc_typ varchar (50) NULL,
				ntc_wg_cd varchar (10) NULL,
				ntc_dpt_cd varchar (20) NULL,
				ntc_aprv_role_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_push_ntc_key_pk_ie ON maw_push_ntc_key$temp
				USING BTREE (push_ntc_typ,ntc_wg_cd,ntc_dpt_cd,ntc_aprv_role_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_push_ntc_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_push_ntc_key
AS
SELECT *
FROM maw_push_ntc_key();

CREATE OR REPLACE FUNCTION maw_push_ntc_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc_key$temp(
				push_ntc_typ varchar (50) NULL,
				ntc_wg_cd varchar (10) NULL,
				ntc_dpt_cd varchar (20) NULL,
				ntc_aprv_role_cd varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_push_ntc_key_pk_ie ON maw_push_ntc_key$temp
				USING BTREE (push_ntc_typ,ntc_wg_cd,ntc_dpt_cd,ntc_aprv_role_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_push_ntc_key$temp(
			push_ntc_typ,
			ntc_wg_cd,
			ntc_dpt_cd,
			ntc_aprv_role_cd,
			st_dt
		)VALUES (
			NEW.push_ntc_typ,
			NEW.ntc_wg_cd,
			NEW.ntc_dpt_cd,
			NEW.ntc_aprv_role_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_push_ntc_key$temp
		SET 
			push_ntc_typ = NEW.push_ntc_typ,
			ntc_wg_cd = NEW.ntc_wg_cd,
			ntc_dpt_cd = NEW.ntc_dpt_cd,
			ntc_aprv_role_cd = NEW.ntc_aprv_role_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (push_ntc_typ = OLD.push_ntc_typ OR push_ntc_typ IS NULL AND OLD.push_ntc_typ IS NULL)
		AND (ntc_wg_cd = OLD.ntc_wg_cd OR ntc_wg_cd IS NULL AND OLD.ntc_wg_cd IS NULL)
		AND (ntc_dpt_cd = OLD.ntc_dpt_cd OR ntc_dpt_cd IS NULL AND OLD.ntc_dpt_cd IS NULL)
		AND (ntc_aprv_role_cd = OLD.ntc_aprv_role_cd OR ntc_aprv_role_cd IS NULL AND OLD.ntc_aprv_role_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_push_ntc_key$temp
		WHERE 0=0
		AND (push_ntc_typ = OLD.push_ntc_typ OR push_ntc_typ IS NULL AND OLD.push_ntc_typ IS NULL)
		AND (ntc_wg_cd = OLD.ntc_wg_cd OR ntc_wg_cd IS NULL AND OLD.ntc_wg_cd IS NULL)
		AND (ntc_dpt_cd = OLD.ntc_dpt_cd OR ntc_dpt_cd IS NULL AND OLD.ntc_dpt_cd IS NULL)
		AND (ntc_aprv_role_cd = OLD.ntc_aprv_role_cd OR ntc_aprv_role_cd IS NULL AND OLD.ntc_aprv_role_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_push_ntc_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_push_ntc_key
FOR EACH ROW
EXECUTE PROCEDURE maw_push_ntc_key$func();
;

