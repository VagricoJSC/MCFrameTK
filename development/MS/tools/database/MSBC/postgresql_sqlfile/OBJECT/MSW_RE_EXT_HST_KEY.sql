\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_re_ext_hst_key()
RETURNS TABLE (
	mfg_inst_no varchar,
	ref_ord numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_re_ext_hst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_re_ext_hst_key$temp(
				mfg_inst_no varchar (15) NULL,
				ref_ord numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_re_ext_hst_key_pk_ie ON msw_re_ext_hst_key$temp
				USING BTREE (mfg_inst_no,ref_ord);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_re_ext_hst_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_re_ext_hst_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_re_ext_hst_key
AS
SELECT *
FROM msw_re_ext_hst_key();

CREATE OR REPLACE FUNCTION msw_re_ext_hst_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_re_ext_hst_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_re_ext_hst_key$temp(
				mfg_inst_no varchar (15) NULL,
				ref_ord numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_re_ext_hst_key_pk_ie ON msw_re_ext_hst_key$temp
				USING BTREE (mfg_inst_no,ref_ord);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_re_ext_hst_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_re_ext_hst_key$temp(
			mfg_inst_no,
			ref_ord
		)VALUES (
			NEW.mfg_inst_no,
			NEW.ref_ord
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_re_ext_hst_key$temp
		SET 
			mfg_inst_no = NEW.mfg_inst_no,
			ref_ord = NEW.ref_ord
		WHERE 0=0
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL)
		AND (ref_ord = OLD.ref_ord OR ref_ord IS NULL AND OLD.ref_ord IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_re_ext_hst_key$temp
		WHERE 0=0
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL)
		AND (ref_ord = OLD.ref_ord OR ref_ord IS NULL AND OLD.ref_ord IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_re_ext_hst_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_re_ext_hst_key
FOR EACH ROW
EXECUTE PROCEDURE msw_re_ext_hst_key$func();
;

