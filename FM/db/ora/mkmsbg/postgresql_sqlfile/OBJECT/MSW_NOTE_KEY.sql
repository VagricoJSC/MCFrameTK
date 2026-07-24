\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_note_key()
RETURNS TABLE (
	note_mng_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_note_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_note_key$temp(
				note_mng_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_note_key_pk_ie ON msw_note_key$temp
				USING BTREE (note_mng_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_note_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_note_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_note_key
AS
SELECT *
FROM msw_note_key();

CREATE OR REPLACE FUNCTION msw_note_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_note_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_note_key$temp(
				note_mng_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_note_key_pk_ie ON msw_note_key$temp
				USING BTREE (note_mng_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_note_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_note_key$temp(
			note_mng_no
		)VALUES (
			NEW.note_mng_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_note_key$temp
		SET 
			note_mng_no = NEW.note_mng_no
		WHERE 0=0
		AND (note_mng_no = OLD.note_mng_no OR note_mng_no IS NULL AND OLD.note_mng_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_note_key$temp
		WHERE 0=0
		AND (note_mng_no = OLD.note_mng_no OR note_mng_no IS NULL AND OLD.note_mng_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_note_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_note_key
FOR EACH ROW
EXECUTE PROCEDURE msw_note_key$func();
;

