\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_xfr_alloc_sts_sv_key()
RETURNS TABLE (
	xfr_alloc_sts_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_xfr_alloc_sts_sv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_xfr_alloc_sts_sv_key$temp(
				xfr_alloc_sts_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_xfr_alloc_sts_sv_key_pk_ie ON msw_xfr_alloc_sts_sv_key$temp
				USING BTREE (xfr_alloc_sts_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_xfr_alloc_sts_sv_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_xfr_alloc_sts_sv_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_xfr_alloc_sts_sv_key
AS
SELECT *
FROM msw_xfr_alloc_sts_sv_key();

CREATE OR REPLACE FUNCTION msw_xfr_alloc_sts_sv_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_xfr_alloc_sts_sv_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_xfr_alloc_sts_sv_key$temp(
				xfr_alloc_sts_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_xfr_alloc_sts_sv_key_pk_ie ON msw_xfr_alloc_sts_sv_key$temp
				USING BTREE (xfr_alloc_sts_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_xfr_alloc_sts_sv_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_xfr_alloc_sts_sv_key$temp(
			xfr_alloc_sts_no
		)VALUES (
			NEW.xfr_alloc_sts_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_xfr_alloc_sts_sv_key$temp
		SET 
			xfr_alloc_sts_no = NEW.xfr_alloc_sts_no
		WHERE 0=0
		AND (xfr_alloc_sts_no = OLD.xfr_alloc_sts_no OR xfr_alloc_sts_no IS NULL AND OLD.xfr_alloc_sts_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_xfr_alloc_sts_sv_key$temp
		WHERE 0=0
		AND (xfr_alloc_sts_no = OLD.xfr_alloc_sts_no OR xfr_alloc_sts_no IS NULL AND OLD.xfr_alloc_sts_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_xfr_alloc_sts_sv_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_xfr_alloc_sts_sv_key
FOR EACH ROW
EXECUTE PROCEDURE msw_xfr_alloc_sts_sv_key$func();
;

