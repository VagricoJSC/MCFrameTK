\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_purc_frcst_fix_key()
RETURNS TABLE (
	purc_frcst_fix_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_purc_frcst_fix_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_purc_frcst_fix_key$temp(
				purc_frcst_fix_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_purc_frcst_fix_key_pk_ie ON msw_purc_frcst_fix_key$temp
				USING BTREE (purc_frcst_fix_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_purc_frcst_fix_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_purc_frcst_fix_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_purc_frcst_fix_key
AS
SELECT *
FROM msw_purc_frcst_fix_key();

CREATE OR REPLACE FUNCTION msw_purc_frcst_fix_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_purc_frcst_fix_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_purc_frcst_fix_key$temp(
				purc_frcst_fix_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_purc_frcst_fix_key_pk_ie ON msw_purc_frcst_fix_key$temp
				USING BTREE (purc_frcst_fix_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_purc_frcst_fix_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_purc_frcst_fix_key$temp(
			purc_frcst_fix_no
		)VALUES (
			NEW.purc_frcst_fix_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_purc_frcst_fix_key$temp
		SET 
			purc_frcst_fix_no = NEW.purc_frcst_fix_no
		WHERE 0=0
		AND (purc_frcst_fix_no = OLD.purc_frcst_fix_no OR purc_frcst_fix_no IS NULL AND OLD.purc_frcst_fix_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_purc_frcst_fix_key$temp
		WHERE 0=0
		AND (purc_frcst_fix_no = OLD.purc_frcst_fix_no OR purc_frcst_fix_no IS NULL AND OLD.purc_frcst_fix_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_purc_frcst_fix_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_purc_frcst_fix_key
FOR EACH ROW
EXECUTE PROCEDURE msw_purc_frcst_fix_key$func();
;

