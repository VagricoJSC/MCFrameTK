\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_dlv_inst_rcpt_key()
RETURNS TABLE (
	dlv_inst_rcpt_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dlv_inst_rcpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dlv_inst_rcpt_key$temp(
				dlv_inst_rcpt_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_dlv_inst_rcpt_key_pk_ie ON msw_dlv_inst_rcpt_key$temp
				USING BTREE (dlv_inst_rcpt_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dlv_inst_rcpt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_dlv_inst_rcpt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_dlv_inst_rcpt_key
AS
SELECT *
FROM msw_dlv_inst_rcpt_key();

CREATE OR REPLACE FUNCTION msw_dlv_inst_rcpt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_dlv_inst_rcpt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_dlv_inst_rcpt_key$temp(
				dlv_inst_rcpt_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_dlv_inst_rcpt_key_pk_ie ON msw_dlv_inst_rcpt_key$temp
				USING BTREE (dlv_inst_rcpt_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_dlv_inst_rcpt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_dlv_inst_rcpt_key$temp(
			dlv_inst_rcpt_no
		)VALUES (
			NEW.dlv_inst_rcpt_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_dlv_inst_rcpt_key$temp
		SET 
			dlv_inst_rcpt_no = NEW.dlv_inst_rcpt_no
		WHERE 0=0
		AND (dlv_inst_rcpt_no = OLD.dlv_inst_rcpt_no OR dlv_inst_rcpt_no IS NULL AND OLD.dlv_inst_rcpt_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_dlv_inst_rcpt_key$temp
		WHERE 0=0
		AND (dlv_inst_rcpt_no = OLD.dlv_inst_rcpt_no OR dlv_inst_rcpt_no IS NULL AND OLD.dlv_inst_rcpt_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_dlv_inst_rcpt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_dlv_inst_rcpt_key
FOR EACH ROW
EXECUTE PROCEDURE msw_dlv_inst_rcpt_key$func();
;

