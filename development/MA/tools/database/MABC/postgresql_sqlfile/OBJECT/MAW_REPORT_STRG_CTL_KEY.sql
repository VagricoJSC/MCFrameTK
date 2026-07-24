\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_report_strg_ctl_key()
RETURNS TABLE (
	biz_typ varchar,
	bp_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_report_strg_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_report_strg_ctl_key$temp(
				biz_typ varchar (2) DEFAULT '*' NULL,
				bp_cd varchar (20) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_report_strg_ctl_key_pk_ie ON maw_report_strg_ctl_key$temp
				USING BTREE (biz_typ,bp_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_report_strg_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_report_strg_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_report_strg_ctl_key
AS
SELECT *
FROM maw_report_strg_ctl_key();
ALTER VIEW maw_report_strg_ctl_key ALTER COLUMN biz_typ SET DEFAULT '*';
ALTER VIEW maw_report_strg_ctl_key ALTER COLUMN bp_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_report_strg_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_report_strg_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_report_strg_ctl_key$temp(
				biz_typ varchar (2) DEFAULT '*' NULL,
				bp_cd varchar (20) DEFAULT '*' NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_report_strg_ctl_key_pk_ie ON maw_report_strg_ctl_key$temp
				USING BTREE (biz_typ,bp_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_report_strg_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_report_strg_ctl_key$temp(
			biz_typ,
			bp_cd,
			st_dt
		)VALUES (
			NEW.biz_typ,
			NEW.bp_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_report_strg_ctl_key$temp
		SET 
			biz_typ = NEW.biz_typ,
			bp_cd = NEW.bp_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (biz_typ = OLD.biz_typ OR biz_typ IS NULL AND OLD.biz_typ IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_report_strg_ctl_key$temp
		WHERE 0=0
		AND (biz_typ = OLD.biz_typ OR biz_typ IS NULL AND OLD.biz_typ IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_report_strg_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_report_strg_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_report_strg_ctl_key$func();
;

