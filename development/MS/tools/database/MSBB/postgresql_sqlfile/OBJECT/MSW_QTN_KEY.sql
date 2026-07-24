\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_qtn_key()
RETURNS TABLE (
	qtn_no varchar,
	qtn_rev numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_qtn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_qtn_key$temp(
				qtn_no varchar (15) NULL,
				qtn_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_qtn_key_pk_ie ON msw_qtn_key$temp
				USING BTREE (qtn_no,qtn_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_qtn_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_qtn_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_qtn_key
AS
SELECT *
FROM msw_qtn_key();

CREATE OR REPLACE FUNCTION msw_qtn_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_qtn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_qtn_key$temp(
				qtn_no varchar (15) NULL,
				qtn_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_qtn_key_pk_ie ON msw_qtn_key$temp
				USING BTREE (qtn_no,qtn_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_qtn_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_qtn_key$temp(
			qtn_no,
			qtn_rev
		)VALUES (
			NEW.qtn_no,
			NEW.qtn_rev
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_qtn_key$temp
		SET 
			qtn_no = NEW.qtn_no,
			qtn_rev = NEW.qtn_rev
		WHERE 0=0
		AND (qtn_no = OLD.qtn_no OR qtn_no IS NULL AND OLD.qtn_no IS NULL)
		AND (qtn_rev = OLD.qtn_rev OR qtn_rev IS NULL AND OLD.qtn_rev IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_qtn_key$temp
		WHERE 0=0
		AND (qtn_no = OLD.qtn_no OR qtn_no IS NULL AND OLD.qtn_no IS NULL)
		AND (qtn_rev = OLD.qtn_rev OR qtn_rev IS NULL AND OLD.qtn_rev IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_qtn_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_qtn_key
FOR EACH ROW
EXECUTE PROCEDURE msw_qtn_key$func();
;

