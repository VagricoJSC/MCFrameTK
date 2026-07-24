\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_po_crct_rsn_key()
RETURNS TABLE (
	po_crct_rsn_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_po_crct_rsn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_po_crct_rsn_key$temp(
				po_crct_rsn_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_po_crct_rsn_key_pk_ie ON msw_po_crct_rsn_key$temp
				USING BTREE (po_crct_rsn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_po_crct_rsn_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_po_crct_rsn_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_po_crct_rsn_key
AS
SELECT *
FROM msw_po_crct_rsn_key();

CREATE OR REPLACE FUNCTION msw_po_crct_rsn_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_po_crct_rsn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_po_crct_rsn_key$temp(
				po_crct_rsn_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_po_crct_rsn_key_pk_ie ON msw_po_crct_rsn_key$temp
				USING BTREE (po_crct_rsn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_po_crct_rsn_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_po_crct_rsn_key$temp(
			po_crct_rsn_cd
		)VALUES (
			NEW.po_crct_rsn_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_po_crct_rsn_key$temp
		SET 
			po_crct_rsn_cd = NEW.po_crct_rsn_cd
		WHERE 0=0
		AND (po_crct_rsn_cd = OLD.po_crct_rsn_cd OR po_crct_rsn_cd IS NULL AND OLD.po_crct_rsn_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_po_crct_rsn_key$temp
		WHERE 0=0
		AND (po_crct_rsn_cd = OLD.po_crct_rsn_cd OR po_crct_rsn_cd IS NULL AND OLD.po_crct_rsn_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_po_crct_rsn_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_po_crct_rsn_key
FOR EACH ROW
EXECUTE PROCEDURE msw_po_crct_rsn_key$func();
;

