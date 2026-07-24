\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_st_stk_key()
RETURNS TABLE (
	st_stk_key numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_st_stk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_st_stk_key$temp(
				st_stk_key numeric (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_st_stk_key_pk_ie ON mgw_st_stk_key$temp
				USING BTREE (st_stk_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_st_stk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_st_stk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_st_stk_key
AS
SELECT *
FROM mgw_st_stk_key();

CREATE OR REPLACE FUNCTION mgw_st_stk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_st_stk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_st_stk_key$temp(
				st_stk_key numeric (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_st_stk_key_pk_ie ON mgw_st_stk_key$temp
				USING BTREE (st_stk_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_st_stk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_st_stk_key$temp(
			st_stk_key
		)VALUES (
			NEW.st_stk_key
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_st_stk_key$temp
		SET 
			st_stk_key = NEW.st_stk_key
		WHERE 0=0
		AND (st_stk_key = OLD.st_stk_key OR st_stk_key IS NULL AND OLD.st_stk_key IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_st_stk_key$temp
		WHERE 0=0
		AND (st_stk_key = OLD.st_stk_key OR st_stk_key IS NULL AND OLD.st_stk_key IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_st_stk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_st_stk_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_st_stk_key$func();
;

