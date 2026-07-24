\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_alt_grp_key()
RETURNS TABLE (
	alt_grp_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alt_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alt_grp_key$temp(
				alt_grp_cd varchar (40) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alt_grp_key_pk_ie ON maw_alt_grp_key$temp
				USING BTREE (alt_grp_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alt_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_alt_grp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_alt_grp_key
AS
SELECT *
FROM maw_alt_grp_key();
ALTER VIEW maw_alt_grp_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_alt_grp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_alt_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_alt_grp_key$temp(
				alt_grp_cd varchar (40) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_alt_grp_key_pk_ie ON maw_alt_grp_key$temp
				USING BTREE (alt_grp_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_alt_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_alt_grp_key$temp(
			alt_grp_cd,
			wg_cd
		)VALUES (
			NEW.alt_grp_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_alt_grp_key$temp
		SET 
			alt_grp_cd = NEW.alt_grp_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_alt_grp_key$temp
		WHERE 0=0
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_alt_grp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_alt_grp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_alt_grp_key$func();
;

