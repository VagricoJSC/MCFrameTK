\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_po_print_key()
RETURNS TABLE (
	po_print_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_po_print_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_po_print_key$temp(
				po_print_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_po_print_key_pk_ie ON maw_po_print_key$temp
				USING BTREE (po_print_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_po_print_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_po_print_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_po_print_key
AS
SELECT *
FROM maw_po_print_key();

CREATE OR REPLACE FUNCTION maw_po_print_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_po_print_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_po_print_key$temp(
				po_print_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_po_print_key_pk_ie ON maw_po_print_key$temp
				USING BTREE (po_print_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_po_print_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_po_print_key$temp(
			po_print_cd
		)VALUES (
			NEW.po_print_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_po_print_key$temp
		SET 
			po_print_cd = NEW.po_print_cd
		WHERE 0=0
		AND (po_print_cd = OLD.po_print_cd OR po_print_cd IS NULL AND OLD.po_print_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_po_print_key$temp
		WHERE 0=0
		AND (po_print_cd = OLD.po_print_cd OR po_print_cd IS NULL AND OLD.po_print_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_po_print_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_po_print_key
FOR EACH ROW
EXECUTE PROCEDURE maw_po_print_key$func();
;

