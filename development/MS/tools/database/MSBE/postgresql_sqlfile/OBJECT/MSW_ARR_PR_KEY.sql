\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_arr_pr_key()
RETURNS TABLE (
	arr_pr_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_arr_pr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_arr_pr_key$temp(
				arr_pr_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_arr_pr_key_pk_ie ON msw_arr_pr_key$temp
				USING BTREE (arr_pr_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_arr_pr_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_arr_pr_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_arr_pr_key
AS
SELECT *
FROM msw_arr_pr_key();

CREATE OR REPLACE FUNCTION msw_arr_pr_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_arr_pr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_arr_pr_key$temp(
				arr_pr_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_arr_pr_key_pk_ie ON msw_arr_pr_key$temp
				USING BTREE (arr_pr_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_arr_pr_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_arr_pr_key$temp(
			arr_pr_no
		)VALUES (
			NEW.arr_pr_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_arr_pr_key$temp
		SET 
			arr_pr_no = NEW.arr_pr_no
		WHERE 0=0
		AND (arr_pr_no = OLD.arr_pr_no OR arr_pr_no IS NULL AND OLD.arr_pr_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_arr_pr_key$temp
		WHERE 0=0
		AND (arr_pr_no = OLD.arr_pr_no OR arr_pr_no IS NULL AND OLD.arr_pr_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_arr_pr_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_arr_pr_key
FOR EACH ROW
EXECUTE PROCEDURE msw_arr_pr_key$func();
;

