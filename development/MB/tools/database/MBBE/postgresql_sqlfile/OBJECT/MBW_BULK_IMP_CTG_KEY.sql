\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_bulk_imp_ctg_key()
RETURNS TABLE (
	table_ctg varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_bulk_imp_ctg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_bulk_imp_ctg_key$temp(
				table_ctg varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_bulk_imp_ctg_key_pk_ie ON mbw_bulk_imp_ctg_key$temp
				USING BTREE (table_ctg);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_bulk_imp_ctg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_bulk_imp_ctg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_bulk_imp_ctg_key
AS
SELECT *
FROM mbw_bulk_imp_ctg_key();

CREATE OR REPLACE FUNCTION mbw_bulk_imp_ctg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_bulk_imp_ctg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_bulk_imp_ctg_key$temp(
				table_ctg varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mbw_bulk_imp_ctg_key_pk_ie ON mbw_bulk_imp_ctg_key$temp
				USING BTREE (table_ctg);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_bulk_imp_ctg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_bulk_imp_ctg_key$temp(
			table_ctg
		)VALUES (
			NEW.table_ctg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_bulk_imp_ctg_key$temp
		SET 
			table_ctg = NEW.table_ctg
		WHERE 0=0
		AND (table_ctg = OLD.table_ctg OR table_ctg IS NULL AND OLD.table_ctg IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_bulk_imp_ctg_key$temp
		WHERE 0=0
		AND (table_ctg = OLD.table_ctg OR table_ctg IS NULL AND OLD.table_ctg IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_bulk_imp_ctg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_bulk_imp_ctg_key
FOR EACH ROW
EXECUTE PROCEDURE mbw_bulk_imp_ctg_key$func();
;

