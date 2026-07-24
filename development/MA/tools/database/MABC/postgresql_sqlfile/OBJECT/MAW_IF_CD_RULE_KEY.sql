\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_if_cd_rule_key()
RETURNS TABLE (
	ext_sys_cd varchar,
	if_col_typ varchar,
	bp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_if_cd_rule_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_if_cd_rule_key$temp(
				ext_sys_cd varchar (10) NULL,
				if_col_typ varchar (30) NULL,
				bp_cd varchar (20) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_if_cd_rule_key_pk_ie ON maw_if_cd_rule_key$temp
				USING BTREE (ext_sys_cd,if_col_typ,bp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_if_cd_rule_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_if_cd_rule_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_if_cd_rule_key
AS
SELECT *
FROM maw_if_cd_rule_key();
ALTER VIEW maw_if_cd_rule_key ALTER COLUMN bp_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_if_cd_rule_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_if_cd_rule_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_if_cd_rule_key$temp(
				ext_sys_cd varchar (10) NULL,
				if_col_typ varchar (30) NULL,
				bp_cd varchar (20) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_if_cd_rule_key_pk_ie ON maw_if_cd_rule_key$temp
				USING BTREE (ext_sys_cd,if_col_typ,bp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_if_cd_rule_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_if_cd_rule_key$temp(
			ext_sys_cd,
			if_col_typ,
			bp_cd
		)VALUES (
			NEW.ext_sys_cd,
			NEW.if_col_typ,
			NEW.bp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_if_cd_rule_key$temp
		SET 
			ext_sys_cd = NEW.ext_sys_cd,
			if_col_typ = NEW.if_col_typ,
			bp_cd = NEW.bp_cd
		WHERE 0=0
		AND (ext_sys_cd = OLD.ext_sys_cd OR ext_sys_cd IS NULL AND OLD.ext_sys_cd IS NULL)
		AND (if_col_typ = OLD.if_col_typ OR if_col_typ IS NULL AND OLD.if_col_typ IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_if_cd_rule_key$temp
		WHERE 0=0
		AND (ext_sys_cd = OLD.ext_sys_cd OR ext_sys_cd IS NULL AND OLD.ext_sys_cd IS NULL)
		AND (if_col_typ = OLD.if_col_typ OR if_col_typ IS NULL AND OLD.if_col_typ IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_if_cd_rule_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_if_cd_rule_key
FOR EACH ROW
EXECUTE PROCEDURE maw_if_cd_rule_key$func();
;

