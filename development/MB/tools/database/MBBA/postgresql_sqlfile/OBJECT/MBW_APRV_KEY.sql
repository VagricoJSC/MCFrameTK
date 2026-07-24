\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_aprv_key()
RETURNS TABLE (
	aprv_no varchar,
	aprv_no_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_aprv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_aprv_key$temp(
				aprv_no varchar (15) NULL,
				aprv_no_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_aprv_key_pk_ie ON mbw_aprv_key$temp
				USING BTREE (aprv_no,aprv_no_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_aprv_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_aprv_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_aprv_key
AS
SELECT *
FROM mbw_aprv_key();

CREATE OR REPLACE FUNCTION mbw_aprv_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_aprv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_aprv_key$temp(
				aprv_no varchar (15) NULL,
				aprv_no_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_aprv_key_pk_ie ON mbw_aprv_key$temp
				USING BTREE (aprv_no,aprv_no_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_aprv_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_aprv_key$temp(
			aprv_no,
			aprv_no_seq
		)VALUES (
			NEW.aprv_no,
			NEW.aprv_no_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_aprv_key$temp
		SET 
			aprv_no = NEW.aprv_no,
			aprv_no_seq = NEW.aprv_no_seq
		WHERE 0=0
		AND (aprv_no = OLD.aprv_no OR aprv_no IS NULL AND OLD.aprv_no IS NULL)
		AND (aprv_no_seq = OLD.aprv_no_seq OR aprv_no_seq IS NULL AND OLD.aprv_no_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_aprv_key$temp
		WHERE 0=0
		AND (aprv_no = OLD.aprv_no OR aprv_no IS NULL AND OLD.aprv_no IS NULL)
		AND (aprv_no_seq = OLD.aprv_no_seq OR aprv_no_seq IS NULL AND OLD.aprv_no_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_aprv_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_aprv_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_aprv_key$func();
;

