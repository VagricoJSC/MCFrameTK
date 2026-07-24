\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_bp_grp_key()
RETURNS TABLE (
	bp_grp_typ varchar,
	bp_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bp_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bp_grp_key$temp(
				bp_grp_typ varchar (2) NULL,
				bp_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bp_grp_key_pk_ie ON maw_bp_grp_key$temp
				USING BTREE (bp_grp_typ,bp_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bp_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_bp_grp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_bp_grp_key
AS
SELECT *
FROM maw_bp_grp_key();

CREATE OR REPLACE FUNCTION maw_bp_grp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bp_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bp_grp_key$temp(
				bp_grp_typ varchar (2) NULL,
				bp_grp_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bp_grp_key_pk_ie ON maw_bp_grp_key$temp
				USING BTREE (bp_grp_typ,bp_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bp_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_bp_grp_key$temp(
			bp_grp_typ,
			bp_grp_cd
		)VALUES (
			NEW.bp_grp_typ,
			NEW.bp_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_bp_grp_key$temp
		SET 
			bp_grp_typ = NEW.bp_grp_typ,
			bp_grp_cd = NEW.bp_grp_cd
		WHERE 0=0
		AND (bp_grp_typ = OLD.bp_grp_typ OR bp_grp_typ IS NULL AND OLD.bp_grp_typ IS NULL)
		AND (bp_grp_cd = OLD.bp_grp_cd OR bp_grp_cd IS NULL AND OLD.bp_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_bp_grp_key$temp
		WHERE 0=0
		AND (bp_grp_typ = OLD.bp_grp_typ OR bp_grp_typ IS NULL AND OLD.bp_grp_typ IS NULL)
		AND (bp_grp_cd = OLD.bp_grp_cd OR bp_grp_cd IS NULL AND OLD.bp_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_bp_grp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_bp_grp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_bp_grp_key$func();
;

