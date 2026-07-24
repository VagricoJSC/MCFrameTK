\encoding UTF-8

CREATE OR REPLACE FUNCTION fcw_upd_tables()
RETURNS TABLE (
	table_name varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_upd_tables$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_upd_tables$temp(
				table_name varchar (30) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_upd_tables$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM fcw_upd_tables$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW fcw_upd_tables
AS
SELECT *
FROM fcw_upd_tables();

CREATE OR REPLACE FUNCTION fcw_upd_tables$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_upd_tables$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_upd_tables$temp(
				table_name varchar (30) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_upd_tables$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO fcw_upd_tables$temp(
			table_name
		)VALUES (
			NEW.table_name
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE fcw_upd_tables$temp
		SET 
			table_name = NEW.table_name
		WHERE 0=0
		AND table_name = OLD.table_name;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM fcw_upd_tables$temp
		WHERE 0=0
		AND table_name = OLD.table_name;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER fcw_upd_tables$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON fcw_upd_tables
FOR EACH ROW
EXECUTE PROCEDURE fcw_upd_tables$func();
;

