\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_stk_eval_key()
RETURNS TABLE (
	stk_eval_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_stk_eval_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_stk_eval_key$temp(
				stk_eval_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_stk_eval_key_pk_ie ON maw_stk_eval_key$temp
				USING BTREE (stk_eval_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_stk_eval_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_stk_eval_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_stk_eval_key
AS
SELECT *
FROM maw_stk_eval_key();

CREATE OR REPLACE FUNCTION maw_stk_eval_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_stk_eval_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_stk_eval_key$temp(
				stk_eval_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_stk_eval_key_pk_ie ON maw_stk_eval_key$temp
				USING BTREE (stk_eval_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_stk_eval_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_stk_eval_key$temp(
			stk_eval_cd
		)VALUES (
			NEW.stk_eval_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_stk_eval_key$temp
		SET 
			stk_eval_cd = NEW.stk_eval_cd
		WHERE 0=0
		AND (stk_eval_cd = OLD.stk_eval_cd OR stk_eval_cd IS NULL AND OLD.stk_eval_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_stk_eval_key$temp
		WHERE 0=0
		AND (stk_eval_cd = OLD.stk_eval_cd OR stk_eval_cd IS NULL AND OLD.stk_eval_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_stk_eval_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_stk_eval_key
FOR EACH ROW
EXECUTE PROCEDURE maw_stk_eval_key$func();
;

