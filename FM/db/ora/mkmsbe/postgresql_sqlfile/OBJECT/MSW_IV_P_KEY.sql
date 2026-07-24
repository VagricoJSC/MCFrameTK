\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_iv_p_key()
RETURNS TABLE (
	iv_mng_no varchar,
	iv_rev numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_iv_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_iv_p_key$temp(
				iv_mng_no varchar (15) NULL,
				iv_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_iv_p_key_pk_ie ON msw_iv_p_key$temp
				USING BTREE (iv_mng_no,iv_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_iv_p_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_iv_p_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_iv_p_key
AS
SELECT *
FROM msw_iv_p_key();

CREATE OR REPLACE FUNCTION msw_iv_p_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_iv_p_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_iv_p_key$temp(
				iv_mng_no varchar (15) NULL,
				iv_rev numeric (4,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_iv_p_key_pk_ie ON msw_iv_p_key$temp
				USING BTREE (iv_mng_no,iv_rev);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_iv_p_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_iv_p_key$temp(
			iv_mng_no,
			iv_rev
		)VALUES (
			NEW.iv_mng_no,
			NEW.iv_rev
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_iv_p_key$temp
		SET 
			iv_mng_no = NEW.iv_mng_no,
			iv_rev = NEW.iv_rev
		WHERE 0=0
		AND (iv_mng_no = OLD.iv_mng_no OR iv_mng_no IS NULL AND OLD.iv_mng_no IS NULL)
		AND (iv_rev = OLD.iv_rev OR iv_rev IS NULL AND OLD.iv_rev IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_iv_p_key$temp
		WHERE 0=0
		AND (iv_mng_no = OLD.iv_mng_no OR iv_mng_no IS NULL AND OLD.iv_mng_no IS NULL)
		AND (iv_rev = OLD.iv_rev OR iv_rev IS NULL AND OLD.iv_rev IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_iv_p_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_iv_p_key
FOR EACH ROW
EXECUTE PROCEDURE msw_iv_p_key$func();
;

