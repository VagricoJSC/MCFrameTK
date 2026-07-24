\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alc_other_key()
RETURNS TABLE (
	alc_ptn_cd varchar,
	alc_val_typ varchar,
	term timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_other_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_other_key$temp(
				alc_ptn_cd varchar (10) NULL,
				alc_val_typ varchar (1) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_other_key_pk_ie ON maw_alc_other_key$temp
				USING BTREE (alc_ptn_cd,alc_val_typ,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_other_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alc_other_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alc_other_key
AS
SELECT *
FROM maw_alc_other_key();

CREATE OR REPLACE FUNCTION maw_alc_other_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_other_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_other_key$temp(
				alc_ptn_cd varchar (10) NULL,
				alc_val_typ varchar (1) NULL,
				term timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_other_key_pk_ie ON maw_alc_other_key$temp
				USING BTREE (alc_ptn_cd,alc_val_typ,term);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_other_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alc_other_key$temp(
			alc_ptn_cd,
			alc_val_typ,
			term
		)VALUES (
			NEW.alc_ptn_cd,
			NEW.alc_val_typ,
			NEW.term
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alc_other_key$temp
		SET 
			alc_ptn_cd = NEW.alc_ptn_cd,
			alc_val_typ = NEW.alc_val_typ,
			term = NEW.term
		WHERE 0=0
		AND (alc_ptn_cd = OLD.alc_ptn_cd OR alc_ptn_cd IS NULL AND OLD.alc_ptn_cd IS NULL)
		AND (alc_val_typ = OLD.alc_val_typ OR alc_val_typ IS NULL AND OLD.alc_val_typ IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alc_other_key$temp
		WHERE 0=0
		AND (alc_ptn_cd = OLD.alc_ptn_cd OR alc_ptn_cd IS NULL AND OLD.alc_ptn_cd IS NULL)
		AND (alc_val_typ = OLD.alc_val_typ OR alc_val_typ IS NULL AND OLD.alc_val_typ IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alc_other_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alc_other_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alc_other_key$func();
;

