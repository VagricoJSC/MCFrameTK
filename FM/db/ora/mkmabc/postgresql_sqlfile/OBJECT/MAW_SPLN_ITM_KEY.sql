\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_spln_itm_key()
RETURNS TABLE (
	spln_itm_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_spln_itm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_spln_itm_key$temp(
				spln_itm_cd varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_spln_itm_key_pk_ie ON maw_spln_itm_key$temp
				USING BTREE (spln_itm_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_spln_itm_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_spln_itm_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_spln_itm_key
AS
SELECT *
FROM maw_spln_itm_key();

CREATE OR REPLACE FUNCTION maw_spln_itm_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_spln_itm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_spln_itm_key$temp(
				spln_itm_cd varchar (40) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_spln_itm_key_pk_ie ON maw_spln_itm_key$temp
				USING BTREE (spln_itm_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_spln_itm_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_spln_itm_key$temp(
			spln_itm_cd
		)VALUES (
			NEW.spln_itm_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_spln_itm_key$temp
		SET 
			spln_itm_cd = NEW.spln_itm_cd
		WHERE 0=0
		AND (spln_itm_cd = OLD.spln_itm_cd OR spln_itm_cd IS NULL AND OLD.spln_itm_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_spln_itm_key$temp
		WHERE 0=0
		AND (spln_itm_cd = OLD.spln_itm_cd OR spln_itm_cd IS NULL AND OLD.spln_itm_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_spln_itm_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_spln_itm_key
FOR EACH ROW
EXECUTE PROCEDURE maw_spln_itm_key$func();
;

