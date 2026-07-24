\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_ac_io_key()
RETURNS TABLE (
	data_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_ac_io_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_ac_io_key$temp(
				data_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_ac_io_key_pk_ie ON mbw_ac_io_key$temp
				USING BTREE (data_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_ac_io_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_ac_io_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_ac_io_key
AS
SELECT *
FROM mbw_ac_io_key();

CREATE OR REPLACE FUNCTION mbw_ac_io_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_ac_io_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_ac_io_key$temp(
				data_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_ac_io_key_pk_ie ON mbw_ac_io_key$temp
				USING BTREE (data_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_ac_io_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_ac_io_key$temp(
			data_no
		)VALUES (
			NEW.data_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_ac_io_key$temp
		SET 
			data_no = NEW.data_no
		WHERE 0=0
		AND (data_no = OLD.data_no OR data_no IS NULL AND OLD.data_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_ac_io_key$temp
		WHERE 0=0
		AND (data_no = OLD.data_no OR data_no IS NULL AND OLD.data_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_ac_io_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_ac_io_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_ac_io_key$func();
;

