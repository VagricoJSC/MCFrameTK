\encoding UTF-8

CREATE OR REPLACE FUNCTION fcw_batch_log_h_key()
RETURNS TABLE (
	batch_log_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_batch_log_h_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_batch_log_h_key$temp(
				batch_log_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX fcw_batch_log_h_key_pk_ie ON fcw_batch_log_h_key$temp
				USING BTREE (batch_log_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_batch_log_h_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM fcw_batch_log_h_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW fcw_batch_log_h_key
AS
SELECT *
FROM fcw_batch_log_h_key();

CREATE OR REPLACE FUNCTION fcw_batch_log_h_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('fcw_batch_log_h_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE fcw_batch_log_h_key$temp(
				batch_log_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX fcw_batch_log_h_key_pk_ie ON fcw_batch_log_h_key$temp
				USING BTREE (batch_log_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('fcw_batch_log_h_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO fcw_batch_log_h_key$temp(
			batch_log_no
		)VALUES (
			NEW.batch_log_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE fcw_batch_log_h_key$temp
		SET 
			batch_log_no = NEW.batch_log_no
		WHERE 0=0
		AND (batch_log_no = OLD.batch_log_no OR batch_log_no IS NULL AND OLD.batch_log_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM fcw_batch_log_h_key$temp
		WHERE 0=0
		AND (batch_log_no = OLD.batch_log_no OR batch_log_no IS NULL AND OLD.batch_log_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER fcw_batch_log_h_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON fcw_batch_log_h_key
FOR EACH ROW
EXECUTE PROCEDURE fcw_batch_log_h_key$func();
;

