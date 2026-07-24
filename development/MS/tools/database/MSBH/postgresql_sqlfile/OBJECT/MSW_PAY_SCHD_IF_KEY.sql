\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_pay_schd_if_key()
RETURNS TABLE (
	pay_schd_if_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_pay_schd_if_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_pay_schd_if_key$temp(
				pay_schd_if_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_pay_schd_if_key_pk_ie ON msw_pay_schd_if_key$temp
				USING BTREE (pay_schd_if_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_pay_schd_if_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_pay_schd_if_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_pay_schd_if_key
AS
SELECT *
FROM msw_pay_schd_if_key();

CREATE OR REPLACE FUNCTION msw_pay_schd_if_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_pay_schd_if_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_pay_schd_if_key$temp(
				pay_schd_if_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_pay_schd_if_key_pk_ie ON msw_pay_schd_if_key$temp
				USING BTREE (pay_schd_if_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_pay_schd_if_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_pay_schd_if_key$temp(
			pay_schd_if_no
		)VALUES (
			NEW.pay_schd_if_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_pay_schd_if_key$temp
		SET 
			pay_schd_if_no = NEW.pay_schd_if_no
		WHERE 0=0
		AND (pay_schd_if_no = OLD.pay_schd_if_no OR pay_schd_if_no IS NULL AND OLD.pay_schd_if_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_pay_schd_if_key$temp
		WHERE 0=0
		AND (pay_schd_if_no = OLD.pay_schd_if_no OR pay_schd_if_no IS NULL AND OLD.pay_schd_if_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_pay_schd_if_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_pay_schd_if_key
FOR EACH ROW
EXECUTE PROCEDURE msw_pay_schd_if_key$func();
;

