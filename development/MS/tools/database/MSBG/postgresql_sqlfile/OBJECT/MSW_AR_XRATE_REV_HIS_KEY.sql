\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ar_xrate_rev_his_key()
RETURNS TABLE (
	ar_xrate_rev_his_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ar_xrate_rev_his_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ar_xrate_rev_his_key$temp(
				ar_xrate_rev_his_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ar_xrate_rev_his_key_pk_ie ON msw_ar_xrate_rev_his_key$temp
				USING BTREE (ar_xrate_rev_his_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ar_xrate_rev_his_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ar_xrate_rev_his_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ar_xrate_rev_his_key
AS
SELECT *
FROM msw_ar_xrate_rev_his_key();

CREATE OR REPLACE FUNCTION msw_ar_xrate_rev_his_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ar_xrate_rev_his_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ar_xrate_rev_his_key$temp(
				ar_xrate_rev_his_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ar_xrate_rev_his_key_pk_ie ON msw_ar_xrate_rev_his_key$temp
				USING BTREE (ar_xrate_rev_his_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ar_xrate_rev_his_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ar_xrate_rev_his_key$temp(
			ar_xrate_rev_his_no
		)VALUES (
			NEW.ar_xrate_rev_his_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ar_xrate_rev_his_key$temp
		SET 
			ar_xrate_rev_his_no = NEW.ar_xrate_rev_his_no
		WHERE 0=0
		AND (ar_xrate_rev_his_no = OLD.ar_xrate_rev_his_no OR ar_xrate_rev_his_no IS NULL AND OLD.ar_xrate_rev_his_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ar_xrate_rev_his_key$temp
		WHERE 0=0
		AND (ar_xrate_rev_his_no = OLD.ar_xrate_rev_his_no OR ar_xrate_rev_his_no IS NULL AND OLD.ar_xrate_rev_his_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ar_xrate_rev_his_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ar_xrate_rev_his_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ar_xrate_rev_his_key$func();
;

