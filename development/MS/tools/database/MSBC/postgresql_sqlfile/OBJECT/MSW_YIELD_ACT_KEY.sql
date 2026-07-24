\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_yield_act_key()
RETURNS TABLE (
	yield_act_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_yield_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_yield_act_key$temp(
				yield_act_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_yield_act_key_pk_ie ON msw_yield_act_key$temp
				USING BTREE (yield_act_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_yield_act_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_yield_act_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_yield_act_key
AS
SELECT *
FROM msw_yield_act_key();

CREATE OR REPLACE FUNCTION msw_yield_act_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_yield_act_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_yield_act_key$temp(
				yield_act_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_yield_act_key_pk_ie ON msw_yield_act_key$temp
				USING BTREE (yield_act_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_yield_act_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_yield_act_key$temp(
			yield_act_no
		)VALUES (
			NEW.yield_act_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_yield_act_key$temp
		SET 
			yield_act_no = NEW.yield_act_no
		WHERE 0=0
		AND (yield_act_no = OLD.yield_act_no OR yield_act_no IS NULL AND OLD.yield_act_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_yield_act_key$temp
		WHERE 0=0
		AND (yield_act_no = OLD.yield_act_no OR yield_act_no IS NULL AND OLD.yield_act_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_yield_act_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_yield_act_key
FOR EACH ROW
EXECUTE PROCEDURE msw_yield_act_key$func();
;

