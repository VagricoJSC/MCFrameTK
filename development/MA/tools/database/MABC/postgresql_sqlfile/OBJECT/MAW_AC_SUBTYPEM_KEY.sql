\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_ac_subtypem_key()
RETURNS TABLE (
	ac_subtyp varchar,
	ac_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ac_subtypem_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ac_subtypem_key$temp(
				ac_subtyp varchar (2) NULL,
				ac_typ varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ac_subtypem_key_pk_ie ON maw_ac_subtypem_key$temp
				USING BTREE (ac_subtyp,ac_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ac_subtypem_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_ac_subtypem_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_ac_subtypem_key
AS
SELECT *
FROM maw_ac_subtypem_key();

CREATE OR REPLACE FUNCTION maw_ac_subtypem_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_ac_subtypem_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_ac_subtypem_key$temp(
				ac_subtyp varchar (2) NULL,
				ac_typ varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_ac_subtypem_key_pk_ie ON maw_ac_subtypem_key$temp
				USING BTREE (ac_subtyp,ac_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_ac_subtypem_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_ac_subtypem_key$temp(
			ac_subtyp,
			ac_typ
		)VALUES (
			NEW.ac_subtyp,
			NEW.ac_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_ac_subtypem_key$temp
		SET 
			ac_subtyp = NEW.ac_subtyp,
			ac_typ = NEW.ac_typ
		WHERE 0=0
		AND (ac_subtyp = OLD.ac_subtyp OR ac_subtyp IS NULL AND OLD.ac_subtyp IS NULL)
		AND (ac_typ = OLD.ac_typ OR ac_typ IS NULL AND OLD.ac_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_ac_subtypem_key$temp
		WHERE 0=0
		AND (ac_subtyp = OLD.ac_subtyp OR ac_subtyp IS NULL AND OLD.ac_subtyp IS NULL)
		AND (ac_typ = OLD.ac_typ OR ac_typ IS NULL AND OLD.ac_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_ac_subtypem_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_ac_subtypem_key
FOR EACH ROW
EXECUTE PROCEDURE maw_ac_subtypem_key$func();
;

