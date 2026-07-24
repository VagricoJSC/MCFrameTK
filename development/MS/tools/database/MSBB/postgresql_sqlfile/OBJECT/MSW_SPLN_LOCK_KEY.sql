\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_spln_lock_key()
RETURNS TABLE (
	dpt_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_lock_key$temp(
				dpt_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_lock_key_pk_ie ON msw_spln_lock_key$temp
				USING BTREE (dpt_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_spln_lock_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_spln_lock_key
AS
SELECT *
FROM msw_spln_lock_key();

CREATE OR REPLACE FUNCTION msw_spln_lock_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_lock_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_lock_key$temp(
				dpt_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_lock_key_pk_ie ON msw_spln_lock_key$temp
				USING BTREE (dpt_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_lock_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_spln_lock_key$temp(
			dpt_cd
		)VALUES (
			NEW.dpt_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_spln_lock_key$temp
		SET 
			dpt_cd = NEW.dpt_cd
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_spln_lock_key$temp
		WHERE 0=0
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_spln_lock_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_spln_lock_key
FOR EACH ROW
EXECUTE PROCEDURE msw_spln_lock_key$func();
;

