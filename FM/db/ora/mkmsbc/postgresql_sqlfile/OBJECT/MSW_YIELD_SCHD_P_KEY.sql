\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_yield_schd_p_key()
RETURNS TABLE (
	yield_schd_no varchar,
	mfg_inst_rev numeric,
	mfg_inst_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_yield_schd_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_yield_schd_p_key$temp(
				yield_schd_no varchar (15) NULL,
				mfg_inst_rev numeric (4,0) NULL,
				mfg_inst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_yield_schd_p_key_pk_ie ON msw_yield_schd_p_key$temp
				USING BTREE (yield_schd_no,mfg_inst_rev,mfg_inst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_yield_schd_p_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_yield_schd_p_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_yield_schd_p_key
AS
SELECT *
FROM msw_yield_schd_p_key();

CREATE OR REPLACE FUNCTION msw_yield_schd_p_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_yield_schd_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_yield_schd_p_key$temp(
				yield_schd_no varchar (15) NULL,
				mfg_inst_rev numeric (4,0) NULL,
				mfg_inst_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_yield_schd_p_key_pk_ie ON msw_yield_schd_p_key$temp
				USING BTREE (yield_schd_no,mfg_inst_rev,mfg_inst_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_yield_schd_p_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_yield_schd_p_key$temp(
			yield_schd_no,
			mfg_inst_rev,
			mfg_inst_no
		)VALUES (
			NEW.yield_schd_no,
			NEW.mfg_inst_rev,
			NEW.mfg_inst_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_yield_schd_p_key$temp
		SET 
			yield_schd_no = NEW.yield_schd_no,
			mfg_inst_rev = NEW.mfg_inst_rev,
			mfg_inst_no = NEW.mfg_inst_no
		WHERE 0=0
		AND (yield_schd_no = OLD.yield_schd_no OR yield_schd_no IS NULL AND OLD.yield_schd_no IS NULL)
		AND (mfg_inst_rev = OLD.mfg_inst_rev OR mfg_inst_rev IS NULL AND OLD.mfg_inst_rev IS NULL)
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_yield_schd_p_key$temp
		WHERE 0=0
		AND (yield_schd_no = OLD.yield_schd_no OR yield_schd_no IS NULL AND OLD.yield_schd_no IS NULL)
		AND (mfg_inst_rev = OLD.mfg_inst_rev OR mfg_inst_rev IS NULL AND OLD.mfg_inst_rev IS NULL)
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_yield_schd_p_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_yield_schd_p_key
FOR EACH ROW
EXECUTE PROCEDURE msw_yield_schd_p_key$func();
;

