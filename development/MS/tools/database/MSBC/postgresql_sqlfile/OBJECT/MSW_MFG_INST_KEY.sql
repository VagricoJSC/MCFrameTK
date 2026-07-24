\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_mfg_inst_key()
RETURNS TABLE (
	mfg_inst_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mfg_inst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mfg_inst_key$temp(
				mfg_inst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mfg_inst_key_pk_ie ON msw_mfg_inst_key$temp
				USING BTREE (mfg_inst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mfg_inst_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_mfg_inst_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_mfg_inst_key
AS
SELECT *
FROM msw_mfg_inst_key();

CREATE OR REPLACE FUNCTION msw_mfg_inst_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_mfg_inst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_mfg_inst_key$temp(
				mfg_inst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_mfg_inst_key_pk_ie ON msw_mfg_inst_key$temp
				USING BTREE (mfg_inst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_mfg_inst_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_mfg_inst_key$temp(
			mfg_inst_no
		)VALUES (
			NEW.mfg_inst_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_mfg_inst_key$temp
		SET 
			mfg_inst_no = NEW.mfg_inst_no
		WHERE 0=0
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_mfg_inst_key$temp
		WHERE 0=0
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_mfg_inst_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_mfg_inst_key
FOR EACH ROW
EXECUTE PROCEDURE msw_mfg_inst_key$func();
;

