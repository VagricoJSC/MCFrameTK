\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_spln_usr_vers_key()
RETURNS TABLE (
	usr_cd varchar,
	ym timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_usr_vers_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_usr_vers_key$temp(
				usr_cd varchar (500) NULL,
				ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_usr_vers_key_pk_ie ON msw_spln_usr_vers_key$temp
				USING BTREE (usr_cd,ym);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_usr_vers_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_spln_usr_vers_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_spln_usr_vers_key
AS
SELECT *
FROM msw_spln_usr_vers_key();

CREATE OR REPLACE FUNCTION msw_spln_usr_vers_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_usr_vers_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_usr_vers_key$temp(
				usr_cd varchar (500) NULL,
				ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_usr_vers_key_pk_ie ON msw_spln_usr_vers_key$temp
				USING BTREE (usr_cd,ym);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_usr_vers_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_spln_usr_vers_key$temp(
			usr_cd,
			ym
		)VALUES (
			NEW.usr_cd,
			NEW.ym
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_spln_usr_vers_key$temp
		SET 
			usr_cd = NEW.usr_cd,
			ym = NEW.ym
		WHERE 0=0
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_spln_usr_vers_key$temp
		WHERE 0=0
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_spln_usr_vers_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_spln_usr_vers_key
FOR EACH ROW
EXECUTE PROCEDURE msw_spln_usr_vers_key$func();
;

