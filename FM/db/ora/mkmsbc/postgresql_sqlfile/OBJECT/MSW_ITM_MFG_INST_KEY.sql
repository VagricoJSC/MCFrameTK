\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_itm_mfg_inst_key()
RETURNS TABLE (
	itm_mfg_inst_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_itm_mfg_inst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_itm_mfg_inst_key$temp(
				itm_mfg_inst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_itm_mfg_inst_key_pk_ie ON msw_itm_mfg_inst_key$temp
				USING BTREE (itm_mfg_inst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_itm_mfg_inst_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_itm_mfg_inst_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_itm_mfg_inst_key
AS
SELECT *
FROM msw_itm_mfg_inst_key();

CREATE OR REPLACE FUNCTION msw_itm_mfg_inst_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_itm_mfg_inst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_itm_mfg_inst_key$temp(
				itm_mfg_inst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_itm_mfg_inst_key_pk_ie ON msw_itm_mfg_inst_key$temp
				USING BTREE (itm_mfg_inst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_itm_mfg_inst_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_itm_mfg_inst_key$temp(
			itm_mfg_inst_no
		)VALUES (
			NEW.itm_mfg_inst_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_itm_mfg_inst_key$temp
		SET 
			itm_mfg_inst_no = NEW.itm_mfg_inst_no
		WHERE 0=0
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_itm_mfg_inst_key$temp
		WHERE 0=0
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_itm_mfg_inst_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_itm_mfg_inst_key
FOR EACH ROW
EXECUTE PROCEDURE msw_itm_mfg_inst_key$func();
;

