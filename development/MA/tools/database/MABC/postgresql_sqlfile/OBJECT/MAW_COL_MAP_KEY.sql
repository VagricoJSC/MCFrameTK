\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_col_map_key()
RETURNS TABLE (
	sum_col_typ varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_col_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_col_map_key$temp(
				sum_col_typ varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_col_map_key_pk_ie ON maw_col_map_key$temp
				USING BTREE (sum_col_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_col_map_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_col_map_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_col_map_key
AS
SELECT *
FROM maw_col_map_key();

CREATE OR REPLACE FUNCTION maw_col_map_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_col_map_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_col_map_key$temp(
				sum_col_typ varchar (3) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_col_map_key_pk_ie ON maw_col_map_key$temp
				USING BTREE (sum_col_typ);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_col_map_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_col_map_key$temp(
			sum_col_typ
		)VALUES (
			NEW.sum_col_typ
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_col_map_key$temp
		SET 
			sum_col_typ = NEW.sum_col_typ
		WHERE 0=0
		AND (sum_col_typ = OLD.sum_col_typ OR sum_col_typ IS NULL AND OLD.sum_col_typ IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_col_map_key$temp
		WHERE 0=0
		AND (sum_col_typ = OLD.sum_col_typ OR sum_col_typ IS NULL AND OLD.sum_col_typ IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_col_map_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_col_map_key
FOR EACH ROW
EXECUTE PROCEDURE maw_col_map_key$func();
;

