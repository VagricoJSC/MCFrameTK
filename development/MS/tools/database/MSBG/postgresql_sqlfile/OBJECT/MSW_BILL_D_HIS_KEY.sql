\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_bill_d_his_key()
RETURNS TABLE (
	bill_d_his_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_d_his_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_d_his_key$temp(
				bill_d_his_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_bill_d_his_key_pk_ie ON msw_bill_d_his_key$temp
				USING BTREE (bill_d_his_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_d_his_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_bill_d_his_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_bill_d_his_key
AS
SELECT *
FROM msw_bill_d_his_key();

CREATE OR REPLACE FUNCTION msw_bill_d_his_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_bill_d_his_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_bill_d_his_key$temp(
				bill_d_his_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_bill_d_his_key_pk_ie ON msw_bill_d_his_key$temp
				USING BTREE (bill_d_his_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_bill_d_his_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_bill_d_his_key$temp(
			bill_d_his_no
		)VALUES (
			NEW.bill_d_his_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_bill_d_his_key$temp
		SET 
			bill_d_his_no = NEW.bill_d_his_no
		WHERE 0=0
		AND (bill_d_his_no = OLD.bill_d_his_no OR bill_d_his_no IS NULL AND OLD.bill_d_his_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_bill_d_his_key$temp
		WHERE 0=0
		AND (bill_d_his_no = OLD.bill_d_his_no OR bill_d_his_no IS NULL AND OLD.bill_d_his_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_bill_d_his_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_bill_d_his_key
FOR EACH ROW
EXECUTE PROCEDURE msw_bill_d_his_key$func();
;

