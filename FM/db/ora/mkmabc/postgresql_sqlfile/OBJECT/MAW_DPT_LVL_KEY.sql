\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_dpt_lvl_key()
RETURNS TABLE (
	dpt_lvl_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_lvl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_lvl_key$temp(
				dpt_lvl_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_lvl_key_pk_ie ON maw_dpt_lvl_key$temp
				USING BTREE (dpt_lvl_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_lvl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_dpt_lvl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_dpt_lvl_key
AS
SELECT *
FROM maw_dpt_lvl_key();

CREATE OR REPLACE FUNCTION maw_dpt_lvl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_dpt_lvl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_dpt_lvl_key$temp(
				dpt_lvl_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_dpt_lvl_key_pk_ie ON maw_dpt_lvl_key$temp
				USING BTREE (dpt_lvl_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_dpt_lvl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_dpt_lvl_key$temp(
			dpt_lvl_cd
		)VALUES (
			NEW.dpt_lvl_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_dpt_lvl_key$temp
		SET 
			dpt_lvl_cd = NEW.dpt_lvl_cd
		WHERE 0=0
		AND (dpt_lvl_cd = OLD.dpt_lvl_cd OR dpt_lvl_cd IS NULL AND OLD.dpt_lvl_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_dpt_lvl_key$temp
		WHERE 0=0
		AND (dpt_lvl_cd = OLD.dpt_lvl_cd OR dpt_lvl_cd IS NULL AND OLD.dpt_lvl_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_dpt_lvl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_dpt_lvl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_dpt_lvl_key$func();
;

