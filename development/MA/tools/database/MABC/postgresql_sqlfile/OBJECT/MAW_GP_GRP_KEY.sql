\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_gp_grp_key()
RETURNS TABLE (
	gp_grp_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_gp_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_gp_grp_key$temp(
				gp_grp_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_gp_grp_key_pk_ie ON maw_gp_grp_key$temp
				USING BTREE (gp_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_gp_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_gp_grp_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_gp_grp_key
AS
SELECT *
FROM maw_gp_grp_key();

CREATE OR REPLACE FUNCTION maw_gp_grp_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_gp_grp_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_gp_grp_key$temp(
				gp_grp_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_gp_grp_key_pk_ie ON maw_gp_grp_key$temp
				USING BTREE (gp_grp_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_gp_grp_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_gp_grp_key$temp(
			gp_grp_cd
		)VALUES (
			NEW.gp_grp_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_gp_grp_key$temp
		SET 
			gp_grp_cd = NEW.gp_grp_cd
		WHERE 0=0
		AND (gp_grp_cd = OLD.gp_grp_cd OR gp_grp_cd IS NULL AND OLD.gp_grp_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_gp_grp_key$temp
		WHERE 0=0
		AND (gp_grp_cd = OLD.gp_grp_cd OR gp_grp_cd IS NULL AND OLD.gp_grp_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_gp_grp_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_gp_grp_key
FOR EACH ROW
EXECUTE PROCEDURE maw_gp_grp_key$func();
;

