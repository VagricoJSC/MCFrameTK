\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ac_itm_grp_key()
RETURNS TABLE (
	ac_itm_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ac_itm_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ac_itm_grp_key$temp(
				ac_itm_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ac_itm_grp_key_pk_ie ON maw_ac_itm_grp_key$temp
				USING BTREE (ac_itm_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ac_itm_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ac_itm_grp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ac_itm_grp_key
AS
SELECT *
FROM maw_ac_itm_grp_key();

CREATE OR REPLACE FUNCTION maw_ac_itm_grp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ac_itm_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ac_itm_grp_key$temp(
				ac_itm_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ac_itm_grp_key_pk_ie ON maw_ac_itm_grp_key$temp
				USING BTREE (ac_itm_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ac_itm_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ac_itm_grp_key$temp(
			ac_itm_grp_cd
		)VALUES (
			NEW.ac_itm_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ac_itm_grp_key$temp
		SET 
			ac_itm_grp_cd = NEW.ac_itm_grp_cd
		WHERE 0=0
		AND (ac_itm_grp_cd = OLD.ac_itm_grp_cd OR ac_itm_grp_cd IS NULL AND OLD.ac_itm_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ac_itm_grp_key$temp
		WHERE 0=0
		AND (ac_itm_grp_cd = OLD.ac_itm_grp_cd OR ac_itm_grp_cd IS NULL AND OLD.ac_itm_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ac_itm_grp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ac_itm_grp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ac_itm_grp_key$func();
;

