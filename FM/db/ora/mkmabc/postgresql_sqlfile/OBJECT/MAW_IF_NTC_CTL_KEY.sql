\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_if_ntc_ctl_key()
RETURNS TABLE (
	module_id varchar,
	logic_id varchar,
	wg_cd varchar,
	bp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_if_ntc_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_if_ntc_ctl_key$temp(
				module_id varchar (3) DEFAULT '*' NULL,
				logic_id varchar (50) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				bp_cd varchar (20) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_if_ntc_ctl_key_pk_ie ON maw_if_ntc_ctl_key$temp
				USING BTREE (module_id,logic_id,wg_cd,bp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_if_ntc_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_if_ntc_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_if_ntc_ctl_key
AS
SELECT *
FROM maw_if_ntc_ctl_key();
ALTER VIEW maw_if_ntc_ctl_key ALTER COLUMN module_id SET DEFAULT '*';
ALTER VIEW maw_if_ntc_ctl_key ALTER COLUMN logic_id SET DEFAULT '*';
ALTER VIEW maw_if_ntc_ctl_key ALTER COLUMN wg_cd SET DEFAULT '*';
ALTER VIEW maw_if_ntc_ctl_key ALTER COLUMN bp_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_if_ntc_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_if_ntc_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_if_ntc_ctl_key$temp(
				module_id varchar (3) DEFAULT '*' NULL,
				logic_id varchar (50) DEFAULT '*' NULL,
				wg_cd varchar (10) DEFAULT '*' NULL,
				bp_cd varchar (20) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_if_ntc_ctl_key_pk_ie ON maw_if_ntc_ctl_key$temp
				USING BTREE (module_id,logic_id,wg_cd,bp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_if_ntc_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_if_ntc_ctl_key$temp(
			module_id,
			logic_id,
			wg_cd,
			bp_cd
		)VALUES (
			NEW.module_id,
			NEW.logic_id,
			NEW.wg_cd,
			NEW.bp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_if_ntc_ctl_key$temp
		SET 
			module_id = NEW.module_id,
			logic_id = NEW.logic_id,
			wg_cd = NEW.wg_cd,
			bp_cd = NEW.bp_cd
		WHERE 0=0
		AND (module_id = OLD.module_id OR module_id IS NULL AND OLD.module_id IS NULL)
		AND (logic_id = OLD.logic_id OR logic_id IS NULL AND OLD.logic_id IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_if_ntc_ctl_key$temp
		WHERE 0=0
		AND (module_id = OLD.module_id OR module_id IS NULL AND OLD.module_id IS NULL)
		AND (logic_id = OLD.logic_id OR logic_id IS NULL AND OLD.logic_id IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_if_ntc_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_if_ntc_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_if_ntc_ctl_key$func();
;

