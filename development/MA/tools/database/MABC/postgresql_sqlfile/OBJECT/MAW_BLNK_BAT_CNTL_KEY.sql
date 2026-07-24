\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_blnk_bat_cntl_key()
RETURNS TABLE (
	if_proc_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_blnk_bat_cntl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_blnk_bat_cntl_key$temp(
				if_proc_typ varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_blnk_bat_cntl_key_pk_ie ON maw_blnk_bat_cntl_key$temp
				USING BTREE (if_proc_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_blnk_bat_cntl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_blnk_bat_cntl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_blnk_bat_cntl_key
AS
SELECT *
FROM maw_blnk_bat_cntl_key();

CREATE OR REPLACE FUNCTION maw_blnk_bat_cntl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_blnk_bat_cntl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_blnk_bat_cntl_key$temp(
				if_proc_typ varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_blnk_bat_cntl_key_pk_ie ON maw_blnk_bat_cntl_key$temp
				USING BTREE (if_proc_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_blnk_bat_cntl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_blnk_bat_cntl_key$temp(
			if_proc_typ
		)VALUES (
			NEW.if_proc_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_blnk_bat_cntl_key$temp
		SET 
			if_proc_typ = NEW.if_proc_typ
		WHERE 0=0
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_blnk_bat_cntl_key$temp
		WHERE 0=0
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_blnk_bat_cntl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_blnk_bat_cntl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_blnk_bat_cntl_key$func();
;

