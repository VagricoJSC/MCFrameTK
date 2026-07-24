\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_bill_acst_key()
RETURNS TABLE (
	bill_acst_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_acst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_acst_key$temp(
				bill_acst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_bill_acst_key_pk_ie ON msw_bill_acst_key$temp
				USING BTREE (bill_acst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_acst_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_bill_acst_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_bill_acst_key
AS
SELECT *
FROM msw_bill_acst_key();

CREATE OR REPLACE FUNCTION msw_bill_acst_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_acst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_acst_key$temp(
				bill_acst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_bill_acst_key_pk_ie ON msw_bill_acst_key$temp
				USING BTREE (bill_acst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_acst_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_bill_acst_key$temp(
			bill_acst_no
		)VALUES (
			NEW.bill_acst_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_bill_acst_key$temp
		SET 
			bill_acst_no = NEW.bill_acst_no
		WHERE 0=0
		AND (bill_acst_no = OLD.bill_acst_no OR bill_acst_no IS NULL AND OLD.bill_acst_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_bill_acst_key$temp
		WHERE 0=0
		AND (bill_acst_no = OLD.bill_acst_no OR bill_acst_no IS NULL AND OLD.bill_acst_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_bill_acst_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_bill_acst_key
FOR EACH ROW
EXECUTE PROCEDURE msw_bill_acst_key$func();
;

