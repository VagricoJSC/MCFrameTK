\encoding UTF-8

CREATE OR REPLACE FUNCTION fcw_hst_id()
RETURNS TABLE (
	hst_id numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_hst_id$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_hst_id$temp(
				hst_id numeric (24) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_hst_id$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM fcw_hst_id$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW fcw_hst_id
AS
SELECT *
FROM fcw_hst_id();

CREATE OR REPLACE FUNCTION fcw_hst_id$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_hst_id$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_hst_id$temp(
				hst_id numeric (24) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_hst_id$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO fcw_hst_id$temp(
			hst_id
		)VALUES (
			NEW.hst_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE fcw_hst_id$temp
		SET 
			hst_id = NEW.hst_id
		WHERE 0=0
		AND hst_id = OLD.hst_id;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM fcw_hst_id$temp
		WHERE 0=0
		AND hst_id = OLD.hst_id;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER fcw_hst_id$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON fcw_hst_id
FOR EACH ROW
EXECUTE PROCEDURE fcw_hst_id$func();
;

