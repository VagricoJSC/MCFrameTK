\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_inpt_alloc_sts_key()
RETURNS TABLE (
	inpt_alloc_sts_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_inpt_alloc_sts_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_inpt_alloc_sts_key$temp(
				inpt_alloc_sts_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_inpt_alloc_sts_key_pk_ie ON msw_inpt_alloc_sts_key$temp
				USING BTREE (inpt_alloc_sts_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_inpt_alloc_sts_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_inpt_alloc_sts_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_inpt_alloc_sts_key
AS
SELECT *
FROM msw_inpt_alloc_sts_key();

CREATE OR REPLACE FUNCTION msw_inpt_alloc_sts_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_inpt_alloc_sts_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_inpt_alloc_sts_key$temp(
				inpt_alloc_sts_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_inpt_alloc_sts_key_pk_ie ON msw_inpt_alloc_sts_key$temp
				USING BTREE (inpt_alloc_sts_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_inpt_alloc_sts_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_inpt_alloc_sts_key$temp(
			inpt_alloc_sts_no
		)VALUES (
			NEW.inpt_alloc_sts_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_inpt_alloc_sts_key$temp
		SET 
			inpt_alloc_sts_no = NEW.inpt_alloc_sts_no
		WHERE 0=0
		AND (inpt_alloc_sts_no = OLD.inpt_alloc_sts_no OR inpt_alloc_sts_no IS NULL AND OLD.inpt_alloc_sts_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_inpt_alloc_sts_key$temp
		WHERE 0=0
		AND (inpt_alloc_sts_no = OLD.inpt_alloc_sts_no OR inpt_alloc_sts_no IS NULL AND OLD.inpt_alloc_sts_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_inpt_alloc_sts_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_inpt_alloc_sts_key
FOR EACH ROW
EXECUTE PROCEDURE msw_inpt_alloc_sts_key$func();
;

