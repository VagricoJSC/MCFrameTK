\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_rcpt_iv_key()
RETURNS TABLE (
	rcpt_iv_mng_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_rcpt_iv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_rcpt_iv_key$temp(
				rcpt_iv_mng_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_rcpt_iv_key_pk_ie ON msw_rcpt_iv_key$temp
				USING BTREE (rcpt_iv_mng_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_rcpt_iv_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_rcpt_iv_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_rcpt_iv_key
AS
SELECT *
FROM msw_rcpt_iv_key();

CREATE OR REPLACE FUNCTION msw_rcpt_iv_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_rcpt_iv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_rcpt_iv_key$temp(
				rcpt_iv_mng_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_rcpt_iv_key_pk_ie ON msw_rcpt_iv_key$temp
				USING BTREE (rcpt_iv_mng_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_rcpt_iv_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_rcpt_iv_key$temp(
			rcpt_iv_mng_no
		)VALUES (
			NEW.rcpt_iv_mng_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_rcpt_iv_key$temp
		SET 
			rcpt_iv_mng_no = NEW.rcpt_iv_mng_no
		WHERE 0=0
		AND (rcpt_iv_mng_no = OLD.rcpt_iv_mng_no OR rcpt_iv_mng_no IS NULL AND OLD.rcpt_iv_mng_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_rcpt_iv_key$temp
		WHERE 0=0
		AND (rcpt_iv_mng_no = OLD.rcpt_iv_mng_no OR rcpt_iv_mng_no IS NULL AND OLD.rcpt_iv_mng_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_rcpt_iv_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_rcpt_iv_key
FOR EACH ROW
EXECUTE PROCEDURE msw_rcpt_iv_key$func();
;

