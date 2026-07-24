\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_pay_chk_key()
RETURNS TABLE (
	pay_chk_mng_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_pay_chk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_pay_chk_key$temp(
				pay_chk_mng_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_pay_chk_key_pk_ie ON msw_pay_chk_key$temp
				USING BTREE (pay_chk_mng_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_pay_chk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_pay_chk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_pay_chk_key
AS
SELECT *
FROM msw_pay_chk_key();

CREATE OR REPLACE FUNCTION msw_pay_chk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_pay_chk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_pay_chk_key$temp(
				pay_chk_mng_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_pay_chk_key_pk_ie ON msw_pay_chk_key$temp
				USING BTREE (pay_chk_mng_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_pay_chk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_pay_chk_key$temp(
			pay_chk_mng_no
		)VALUES (
			NEW.pay_chk_mng_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_pay_chk_key$temp
		SET 
			pay_chk_mng_no = NEW.pay_chk_mng_no
		WHERE 0=0
		AND (pay_chk_mng_no = OLD.pay_chk_mng_no OR pay_chk_mng_no IS NULL AND OLD.pay_chk_mng_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_pay_chk_key$temp
		WHERE 0=0
		AND (pay_chk_mng_no = OLD.pay_chk_mng_no OR pay_chk_mng_no IS NULL AND OLD.pay_chk_mng_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_pay_chk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_pay_chk_key
FOR EACH ROW
EXECUTE PROCEDURE msw_pay_chk_key$func();
;

