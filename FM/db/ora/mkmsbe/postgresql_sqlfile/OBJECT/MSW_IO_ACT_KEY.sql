\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_io_act_key()
RETURNS TABLE (
	slip_no varchar,
	slip_seq_no numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_io_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_io_act_key$temp(
				slip_no varchar (15) NULL,
				slip_seq_no numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_io_act_key_pk_ie ON msw_io_act_key$temp
				USING BTREE (slip_no,slip_seq_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_io_act_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_io_act_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_io_act_key
AS
SELECT *
FROM msw_io_act_key();

CREATE OR REPLACE FUNCTION msw_io_act_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_io_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_io_act_key$temp(
				slip_no varchar (15) NULL,
				slip_seq_no numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_io_act_key_pk_ie ON msw_io_act_key$temp
				USING BTREE (slip_no,slip_seq_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_io_act_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_io_act_key$temp(
			slip_no,
			slip_seq_no
		)VALUES (
			NEW.slip_no,
			NEW.slip_seq_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_io_act_key$temp
		SET 
			slip_no = NEW.slip_no,
			slip_seq_no = NEW.slip_seq_no
		WHERE 0=0
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_seq_no = OLD.slip_seq_no OR slip_seq_no IS NULL AND OLD.slip_seq_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_io_act_key$temp
		WHERE 0=0
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_seq_no = OLD.slip_seq_no OR slip_seq_no IS NULL AND OLD.slip_seq_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_io_act_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_io_act_key
FOR EACH ROW
EXECUTE PROCEDURE msw_io_act_key$func();
;

