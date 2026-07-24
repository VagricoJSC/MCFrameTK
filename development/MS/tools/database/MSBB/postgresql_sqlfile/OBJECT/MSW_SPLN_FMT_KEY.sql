\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_spln_fmt_key()
RETURNS TABLE (
	spln_fmt_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_fmt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_fmt_key$temp(
				spln_fmt_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_fmt_key_pk_ie ON msw_spln_fmt_key$temp
				USING BTREE (spln_fmt_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_fmt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_spln_fmt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_spln_fmt_key
AS
SELECT *
FROM msw_spln_fmt_key();

CREATE OR REPLACE FUNCTION msw_spln_fmt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_fmt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_fmt_key$temp(
				spln_fmt_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_fmt_key_pk_ie ON msw_spln_fmt_key$temp
				USING BTREE (spln_fmt_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_fmt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_spln_fmt_key$temp(
			spln_fmt_no
		)VALUES (
			NEW.spln_fmt_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_spln_fmt_key$temp
		SET 
			spln_fmt_no = NEW.spln_fmt_no
		WHERE 0=0
		AND (spln_fmt_no = OLD.spln_fmt_no OR spln_fmt_no IS NULL AND OLD.spln_fmt_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_spln_fmt_key$temp
		WHERE 0=0
		AND (spln_fmt_no = OLD.spln_fmt_no OR spln_fmt_no IS NULL AND OLD.spln_fmt_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_spln_fmt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_spln_fmt_key
FOR EACH ROW
EXECUTE PROCEDURE msw_spln_fmt_key$func();
;

