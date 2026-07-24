\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_pln_mfg_key()
RETURNS TABLE (
	pln_mfg_key numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pln_mfg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pln_mfg_key$temp(
				pln_mfg_key numeric (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_pln_mfg_key_pk_ie ON mgw_pln_mfg_key$temp
				USING BTREE (pln_mfg_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pln_mfg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_pln_mfg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_pln_mfg_key
AS
SELECT *
FROM mgw_pln_mfg_key();

CREATE OR REPLACE FUNCTION mgw_pln_mfg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_pln_mfg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_pln_mfg_key$temp(
				pln_mfg_key numeric (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_pln_mfg_key_pk_ie ON mgw_pln_mfg_key$temp
				USING BTREE (pln_mfg_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_pln_mfg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_pln_mfg_key$temp(
			pln_mfg_key
		)VALUES (
			NEW.pln_mfg_key
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_pln_mfg_key$temp
		SET 
			pln_mfg_key = NEW.pln_mfg_key
		WHERE 0=0
		AND (pln_mfg_key = OLD.pln_mfg_key OR pln_mfg_key IS NULL AND OLD.pln_mfg_key IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_pln_mfg_key$temp
		WHERE 0=0
		AND (pln_mfg_key = OLD.pln_mfg_key OR pln_mfg_key IS NULL AND OLD.pln_mfg_key IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_pln_mfg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_pln_mfg_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_pln_mfg_key$func();
;

