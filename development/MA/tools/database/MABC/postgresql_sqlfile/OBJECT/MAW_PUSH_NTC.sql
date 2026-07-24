\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_push_ntc()
RETURNS TABLE (
	push_ntc_no varchar,
	push_ntc_typ varchar,
	ntc_wg_cd varchar,
	ntc_dpt_cd varchar,
	ntc_aprv_role_cd varchar,
	ntc_usr_cd varchar,
	master_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc$temp(
				push_ntc_no varchar (15) NULL,
				push_ntc_typ varchar (50) NULL,
				ntc_wg_cd varchar (10) NULL,
				ntc_dpt_cd varchar (20) NULL,
				ntc_aprv_role_cd varchar (10) NULL,
				ntc_usr_cd varchar (500) NULL,
				master_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_push_ntc$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_push_ntc
AS
SELECT *
FROM maw_push_ntc();

CREATE OR REPLACE FUNCTION maw_push_ntc$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc$temp(
				push_ntc_no varchar (15) NULL,
				push_ntc_typ varchar (50) NULL,
				ntc_wg_cd varchar (10) NULL,
				ntc_dpt_cd varchar (20) NULL,
				ntc_aprv_role_cd varchar (10) NULL,
				ntc_usr_cd varchar (500) NULL,
				master_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_push_ntc$temp(
			push_ntc_no,
			push_ntc_typ,
			ntc_wg_cd,
			ntc_dpt_cd,
			ntc_aprv_role_cd,
			ntc_usr_cd,
			master_dt
		)VALUES (
			NEW.push_ntc_no,
			NEW.push_ntc_typ,
			NEW.ntc_wg_cd,
			NEW.ntc_dpt_cd,
			NEW.ntc_aprv_role_cd,
			NEW.ntc_usr_cd,
			NEW.master_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_push_ntc$temp
		SET 
			push_ntc_no = NEW.push_ntc_no,
			push_ntc_typ = NEW.push_ntc_typ,
			ntc_wg_cd = NEW.ntc_wg_cd,
			ntc_dpt_cd = NEW.ntc_dpt_cd,
			ntc_aprv_role_cd = NEW.ntc_aprv_role_cd,
			ntc_usr_cd = NEW.ntc_usr_cd,
			master_dt = NEW.master_dt
		WHERE 0=0
		AND (push_ntc_no = OLD.push_ntc_no OR push_ntc_no IS NULL AND OLD.push_ntc_no IS NULL)
		AND (push_ntc_typ = OLD.push_ntc_typ OR push_ntc_typ IS NULL AND OLD.push_ntc_typ IS NULL)
		AND (ntc_wg_cd = OLD.ntc_wg_cd OR ntc_wg_cd IS NULL AND OLD.ntc_wg_cd IS NULL)
		AND (ntc_dpt_cd = OLD.ntc_dpt_cd OR ntc_dpt_cd IS NULL AND OLD.ntc_dpt_cd IS NULL)
		AND (ntc_aprv_role_cd = OLD.ntc_aprv_role_cd OR ntc_aprv_role_cd IS NULL AND OLD.ntc_aprv_role_cd IS NULL)
		AND (ntc_usr_cd = OLD.ntc_usr_cd OR ntc_usr_cd IS NULL AND OLD.ntc_usr_cd IS NULL)
		AND (master_dt = OLD.master_dt OR master_dt IS NULL AND OLD.master_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_push_ntc$temp
		WHERE 0=0
		AND (push_ntc_no = OLD.push_ntc_no OR push_ntc_no IS NULL AND OLD.push_ntc_no IS NULL)
		AND (push_ntc_typ = OLD.push_ntc_typ OR push_ntc_typ IS NULL AND OLD.push_ntc_typ IS NULL)
		AND (ntc_wg_cd = OLD.ntc_wg_cd OR ntc_wg_cd IS NULL AND OLD.ntc_wg_cd IS NULL)
		AND (ntc_dpt_cd = OLD.ntc_dpt_cd OR ntc_dpt_cd IS NULL AND OLD.ntc_dpt_cd IS NULL)
		AND (ntc_aprv_role_cd = OLD.ntc_aprv_role_cd OR ntc_aprv_role_cd IS NULL AND OLD.ntc_aprv_role_cd IS NULL)
		AND (ntc_usr_cd = OLD.ntc_usr_cd OR ntc_usr_cd IS NULL AND OLD.ntc_usr_cd IS NULL)
		AND (master_dt = OLD.master_dt OR master_dt IS NULL AND OLD.master_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_push_ntc$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_push_ntc
FOR EACH ROW
EXECUTE PROCEDURE maw_push_ntc$func();
;

