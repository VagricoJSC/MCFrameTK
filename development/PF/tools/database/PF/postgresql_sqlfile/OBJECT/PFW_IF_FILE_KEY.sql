\encoding UTF-8

CREATE OR REPLACE FUNCTION pfw_if_file_key()
RETURNS TABLE (
	file_id numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('pfw_if_file_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE pfw_if_file_key$temp(
				file_id numeric (15,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX pfw_if_file_key_pk_ie ON pfw_if_file_key$temp
				USING BTREE (file_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('pfw_if_file_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM pfw_if_file_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW pfw_if_file_key
AS
SELECT *
FROM pfw_if_file_key();

CREATE OR REPLACE FUNCTION pfw_if_file_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('pfw_if_file_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE pfw_if_file_key$temp(
				file_id numeric (15,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX pfw_if_file_key_pk_ie ON pfw_if_file_key$temp
				USING BTREE (file_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('pfw_if_file_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO pfw_if_file_key$temp(
			file_id
		)VALUES (
			NEW.file_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE pfw_if_file_key$temp
		SET 
			file_id = NEW.file_id
		WHERE 0=0
		AND (file_id = OLD.file_id OR file_id IS NULL AND OLD.file_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM pfw_if_file_key$temp
		WHERE 0=0
		AND (file_id = OLD.file_id OR file_id IS NULL AND OLD.file_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER pfw_if_file_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON pfw_if_file_key
FOR EACH ROW
EXECUTE PROCEDURE pfw_if_file_key$func();
;

