\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_schd_pay_history_key()
RETURNS TABLE (
	proc_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_schd_pay_history_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_schd_pay_history_key$temp(
				proc_no varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_schd_pay_history_key_pk_ie ON mbw_schd_pay_history_key$temp
				USING BTREE (proc_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_schd_pay_history_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_schd_pay_history_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_schd_pay_history_key
AS
SELECT *
FROM mbw_schd_pay_history_key();

CREATE OR REPLACE FUNCTION mbw_schd_pay_history_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_schd_pay_history_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_schd_pay_history_key$temp(
				proc_no varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_schd_pay_history_key_pk_ie ON mbw_schd_pay_history_key$temp
				USING BTREE (proc_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_schd_pay_history_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_schd_pay_history_key$temp(
			proc_no
		)VALUES (
			NEW.proc_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_schd_pay_history_key$temp
		SET 
			proc_no = NEW.proc_no
		WHERE 0=0
		AND (proc_no = OLD.proc_no OR proc_no IS NULL AND OLD.proc_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_schd_pay_history_key$temp
		WHERE 0=0
		AND (proc_no = OLD.proc_no OR proc_no IS NULL AND OLD.proc_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_schd_pay_history_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_schd_pay_history_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_schd_pay_history_key$func();
;

