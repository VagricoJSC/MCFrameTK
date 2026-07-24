\encoding UTF-8

CREATE OR REPLACE FUNCTION pfw_sdrv_if_key()
RETURNS TABLE (
	data_no numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('pfw_sdrv_if_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE pfw_sdrv_if_key$temp(
				data_no numeric (15,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX pfw_sdrv_if_key_pk_ie ON pfw_sdrv_if_key$temp
				USING BTREE (data_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('pfw_sdrv_if_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM pfw_sdrv_if_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW pfw_sdrv_if_key
AS
SELECT *
FROM pfw_sdrv_if_key();

CREATE OR REPLACE FUNCTION pfw_sdrv_if_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('pfw_sdrv_if_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE pfw_sdrv_if_key$temp(
				data_no numeric (15,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX pfw_sdrv_if_key_pk_ie ON pfw_sdrv_if_key$temp
				USING BTREE (data_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('pfw_sdrv_if_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO pfw_sdrv_if_key$temp(
			data_no
		)VALUES (
			NEW.data_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE pfw_sdrv_if_key$temp
		SET 
			data_no = NEW.data_no
		WHERE 0=0
		AND (data_no = OLD.data_no OR data_no IS NULL AND OLD.data_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM pfw_sdrv_if_key$temp
		WHERE 0=0
		AND (data_no = OLD.data_no OR data_no IS NULL AND OLD.data_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER pfw_sdrv_if_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON pfw_sdrv_if_key
FOR EACH ROW
EXECUTE PROCEDURE pfw_sdrv_if_key$func();
;

