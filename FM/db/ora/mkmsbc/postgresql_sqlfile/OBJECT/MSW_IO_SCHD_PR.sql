\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_io_schd_pr()
RETURNS TABLE (
	io_schd_pr_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_io_schd_pr$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_io_schd_pr$temp(
				io_schd_pr_no varchar (15) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_io_schd_pr$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_io_schd_pr$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_io_schd_pr
AS
SELECT *
FROM msw_io_schd_pr();

CREATE OR REPLACE FUNCTION msw_io_schd_pr$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_io_schd_pr$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_io_schd_pr$temp(
				io_schd_pr_no varchar (15) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_io_schd_pr$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_io_schd_pr$temp(
			io_schd_pr_no
		)VALUES (
			NEW.io_schd_pr_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_io_schd_pr$temp
		SET 
			io_schd_pr_no = NEW.io_schd_pr_no
		WHERE 0=0
		AND io_schd_pr_no = OLD.io_schd_pr_no;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_io_schd_pr$temp
		WHERE 0=0
		AND io_schd_pr_no = OLD.io_schd_pr_no;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_io_schd_pr$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_io_schd_pr
FOR EACH ROW
EXECUTE PROCEDURE msw_io_schd_pr$func();
;

