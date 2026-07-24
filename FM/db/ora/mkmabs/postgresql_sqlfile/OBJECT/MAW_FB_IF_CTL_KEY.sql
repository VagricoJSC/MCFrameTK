\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_fb_if_ctl_key()
RETURNS TABLE (
	if_proc_typ varchar,
	bp_cd varchar,
	bp_cd_null_flg char,
	ar_sttl_typ varchar,
	bank_cd varchar,
	bank_ac_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_fb_if_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_fb_if_ctl_key$temp(
				if_proc_typ varchar (10) NULL,
				bp_cd varchar (20) NULL,
				bp_cd_null_flg char (1) DEFAULT '0' NULL,
				ar_sttl_typ varchar (1) NULL,
				bank_cd varchar (15) NULL,
				bank_ac_cd varchar (40) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_fb_if_ctl_key_pk_ie ON maw_fb_if_ctl_key$temp
				USING BTREE (if_proc_typ,bp_cd,bp_cd_null_flg,ar_sttl_typ,bank_cd,bank_ac_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_fb_if_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_fb_if_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_fb_if_ctl_key
AS
SELECT *
FROM maw_fb_if_ctl_key();
ALTER VIEW maw_fb_if_ctl_key ALTER COLUMN bp_cd_null_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION maw_fb_if_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_fb_if_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_fb_if_ctl_key$temp(
				if_proc_typ varchar (10) NULL,
				bp_cd varchar (20) NULL,
				bp_cd_null_flg char (1) DEFAULT '0' NULL,
				ar_sttl_typ varchar (1) NULL,
				bank_cd varchar (15) NULL,
				bank_ac_cd varchar (40) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_fb_if_ctl_key_pk_ie ON maw_fb_if_ctl_key$temp
				USING BTREE (if_proc_typ,bp_cd,bp_cd_null_flg,ar_sttl_typ,bank_cd,bank_ac_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_fb_if_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_fb_if_ctl_key$temp(
			if_proc_typ,
			bp_cd,
			bp_cd_null_flg,
			ar_sttl_typ,
			bank_cd,
			bank_ac_cd,
			st_dt
		)VALUES (
			NEW.if_proc_typ,
			NEW.bp_cd,
			NEW.bp_cd_null_flg,
			NEW.ar_sttl_typ,
			NEW.bank_cd,
			NEW.bank_ac_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_fb_if_ctl_key$temp
		SET 
			if_proc_typ = NEW.if_proc_typ,
			bp_cd = NEW.bp_cd,
			bp_cd_null_flg = NEW.bp_cd_null_flg,
			ar_sttl_typ = NEW.ar_sttl_typ,
			bank_cd = NEW.bank_cd,
			bank_ac_cd = NEW.bank_ac_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (bp_cd_null_flg = OLD.bp_cd_null_flg OR bp_cd_null_flg IS NULL AND OLD.bp_cd_null_flg IS NULL)
		AND (ar_sttl_typ = OLD.ar_sttl_typ OR ar_sttl_typ IS NULL AND OLD.ar_sttl_typ IS NULL)
		AND (bank_cd = OLD.bank_cd OR bank_cd IS NULL AND OLD.bank_cd IS NULL)
		AND (bank_ac_cd = OLD.bank_ac_cd OR bank_ac_cd IS NULL AND OLD.bank_ac_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_fb_if_ctl_key$temp
		WHERE 0=0
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (bp_cd_null_flg = OLD.bp_cd_null_flg OR bp_cd_null_flg IS NULL AND OLD.bp_cd_null_flg IS NULL)
		AND (ar_sttl_typ = OLD.ar_sttl_typ OR ar_sttl_typ IS NULL AND OLD.ar_sttl_typ IS NULL)
		AND (bank_cd = OLD.bank_cd OR bank_cd IS NULL AND OLD.bank_cd IS NULL)
		AND (bank_ac_cd = OLD.bank_ac_cd OR bank_ac_cd IS NULL AND OLD.bank_ac_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_fb_if_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_fb_if_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_fb_if_ctl_key$func();
;

