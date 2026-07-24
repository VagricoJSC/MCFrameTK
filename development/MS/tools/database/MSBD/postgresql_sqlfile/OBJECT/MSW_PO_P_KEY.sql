\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_po_p_key()
RETURNS TABLE (
	po_no varchar,
	po_rev numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_po_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_po_p_key$temp(
				po_no varchar (15) NULL,
				po_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_po_p_key_pk_ie ON msw_po_p_key$temp
				USING BTREE (po_no,po_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_po_p_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_po_p_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_po_p_key
AS
SELECT *
FROM msw_po_p_key();

CREATE OR REPLACE FUNCTION msw_po_p_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_po_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_po_p_key$temp(
				po_no varchar (15) NULL,
				po_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_po_p_key_pk_ie ON msw_po_p_key$temp
				USING BTREE (po_no,po_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_po_p_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_po_p_key$temp(
			po_no,
			po_rev
		)VALUES (
			NEW.po_no,
			NEW.po_rev
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_po_p_key$temp
		SET 
			po_no = NEW.po_no,
			po_rev = NEW.po_rev
		WHERE 0=0
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (po_rev = OLD.po_rev OR po_rev IS NULL AND OLD.po_rev IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_po_p_key$temp
		WHERE 0=0
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (po_rev = OLD.po_rev OR po_rev IS NULL AND OLD.po_rev IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_po_p_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_po_p_key
FOR EACH ROW
EXECUTE PROCEDURE msw_po_p_key$func();
;

