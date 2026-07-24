\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_pay_note_key()
RETURNS TABLE (
	pay_note_mng_no varchar,
	pay_note_mng_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_pay_note_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_pay_note_key$temp(
				pay_note_mng_no varchar (15) NULL,
				pay_note_mng_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_pay_note_key_pk_ie ON msw_pay_note_key$temp
				USING BTREE (pay_note_mng_no,pay_note_mng_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_pay_note_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_pay_note_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_pay_note_key
AS
SELECT *
FROM msw_pay_note_key();

CREATE OR REPLACE FUNCTION msw_pay_note_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_pay_note_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_pay_note_key$temp(
				pay_note_mng_no varchar (15) NULL,
				pay_note_mng_seq numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_pay_note_key_pk_ie ON msw_pay_note_key$temp
				USING BTREE (pay_note_mng_no,pay_note_mng_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_pay_note_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_pay_note_key$temp(
			pay_note_mng_no,
			pay_note_mng_seq
		)VALUES (
			NEW.pay_note_mng_no,
			NEW.pay_note_mng_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_pay_note_key$temp
		SET 
			pay_note_mng_no = NEW.pay_note_mng_no,
			pay_note_mng_seq = NEW.pay_note_mng_seq
		WHERE 0=0
		AND (pay_note_mng_no = OLD.pay_note_mng_no OR pay_note_mng_no IS NULL AND OLD.pay_note_mng_no IS NULL)
		AND (pay_note_mng_seq = OLD.pay_note_mng_seq OR pay_note_mng_seq IS NULL AND OLD.pay_note_mng_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_pay_note_key$temp
		WHERE 0=0
		AND (pay_note_mng_no = OLD.pay_note_mng_no OR pay_note_mng_no IS NULL AND OLD.pay_note_mng_no IS NULL)
		AND (pay_note_mng_seq = OLD.pay_note_mng_seq OR pay_note_mng_seq IS NULL AND OLD.pay_note_mng_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_pay_note_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_pay_note_key
FOR EACH ROW
EXECUTE PROCEDURE msw_pay_note_key$func();
;

