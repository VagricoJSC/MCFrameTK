\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_edi_if_ctl_key()
RETURNS TABLE (
	bp_cd varchar,
	if_proc_typ varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_edi_if_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_edi_if_ctl_key$temp(
				bp_cd varchar (20) NULL,
				if_proc_typ varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_edi_if_ctl_key_pk_ie ON maw_edi_if_ctl_key$temp
				USING BTREE (bp_cd,if_proc_typ,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_edi_if_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_edi_if_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_edi_if_ctl_key
AS
SELECT *
FROM maw_edi_if_ctl_key();

CREATE OR REPLACE FUNCTION maw_edi_if_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_edi_if_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_edi_if_ctl_key$temp(
				bp_cd varchar (20) NULL,
				if_proc_typ varchar (10) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_edi_if_ctl_key_pk_ie ON maw_edi_if_ctl_key$temp
				USING BTREE (bp_cd,if_proc_typ,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_edi_if_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_edi_if_ctl_key$temp(
			bp_cd,
			if_proc_typ,
			st_dt
		)VALUES (
			NEW.bp_cd,
			NEW.if_proc_typ,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_edi_if_ctl_key$temp
		SET 
			bp_cd = NEW.bp_cd,
			if_proc_typ = NEW.if_proc_typ,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_edi_if_ctl_key$temp
		WHERE 0=0
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_edi_if_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_edi_if_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_edi_if_ctl_key$func();
;

