\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_ar_pre_close_key()
RETURNS TABLE (
	ym timestamp(0),
	acst_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ar_pre_close_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ar_pre_close_key$temp(
				ym timestamp(0)  NULL,
				acst_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ar_pre_close_key_pk_ie ON msw_ar_pre_close_key$temp
				USING BTREE (ym,acst_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ar_pre_close_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_ar_pre_close_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_ar_pre_close_key
AS
SELECT *
FROM msw_ar_pre_close_key();

CREATE OR REPLACE FUNCTION msw_ar_pre_close_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_ar_pre_close_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_ar_pre_close_key$temp(
				ym timestamp(0)  NULL,
				acst_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_ar_pre_close_key_pk_ie ON msw_ar_pre_close_key$temp
				USING BTREE (ym,acst_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_ar_pre_close_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_ar_pre_close_key$temp(
			ym,
			acst_cd
		)VALUES (
			NEW.ym,
			NEW.acst_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_ar_pre_close_key$temp
		SET 
			ym = NEW.ym,
			acst_cd = NEW.acst_cd
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (acst_cd = OLD.acst_cd OR acst_cd IS NULL AND OLD.acst_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_ar_pre_close_key$temp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (acst_cd = OLD.acst_cd OR acst_cd IS NULL AND OLD.acst_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_ar_pre_close_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_ar_pre_close_key
FOR EACH ROW
EXECUTE PROCEDURE msw_ar_pre_close_key$func();
;

