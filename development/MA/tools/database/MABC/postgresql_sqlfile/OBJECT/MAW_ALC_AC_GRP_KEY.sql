\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alc_ac_grp_key()
RETURNS TABLE (
	alc_ac_grp_typ varchar,
	alc_ac_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_ac_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_ac_grp_key$temp(
				alc_ac_grp_typ varchar (1) NULL,
				alc_ac_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_ac_grp_key_pk_ie ON maw_alc_ac_grp_key$temp
				USING BTREE (alc_ac_grp_typ,alc_ac_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_ac_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alc_ac_grp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alc_ac_grp_key
AS
SELECT *
FROM maw_alc_ac_grp_key();

CREATE OR REPLACE FUNCTION maw_alc_ac_grp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alc_ac_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alc_ac_grp_key$temp(
				alc_ac_grp_typ varchar (1) NULL,
				alc_ac_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alc_ac_grp_key_pk_ie ON maw_alc_ac_grp_key$temp
				USING BTREE (alc_ac_grp_typ,alc_ac_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alc_ac_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alc_ac_grp_key$temp(
			alc_ac_grp_typ,
			alc_ac_grp_cd
		)VALUES (
			NEW.alc_ac_grp_typ,
			NEW.alc_ac_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alc_ac_grp_key$temp
		SET 
			alc_ac_grp_typ = NEW.alc_ac_grp_typ,
			alc_ac_grp_cd = NEW.alc_ac_grp_cd
		WHERE 0=0
		AND (alc_ac_grp_typ = OLD.alc_ac_grp_typ OR alc_ac_grp_typ IS NULL AND OLD.alc_ac_grp_typ IS NULL)
		AND (alc_ac_grp_cd = OLD.alc_ac_grp_cd OR alc_ac_grp_cd IS NULL AND OLD.alc_ac_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alc_ac_grp_key$temp
		WHERE 0=0
		AND (alc_ac_grp_typ = OLD.alc_ac_grp_typ OR alc_ac_grp_typ IS NULL AND OLD.alc_ac_grp_typ IS NULL)
		AND (alc_ac_grp_cd = OLD.alc_ac_grp_cd OR alc_ac_grp_cd IS NULL AND OLD.alc_ac_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alc_ac_grp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alc_ac_grp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alc_ac_grp_key$func();
;

