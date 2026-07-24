\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_other_wk_key()
RETURNS TABLE (
	act_other_wk_id varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_other_wk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_other_wk_key$temp(
				act_other_wk_id varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_other_wk_key_pk_ie ON mgw_act_other_wk_key$temp
				USING BTREE (act_other_wk_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_other_wk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_other_wk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_other_wk_key
AS
SELECT *
FROM mgw_act_other_wk_key();

CREATE OR REPLACE FUNCTION mgw_act_other_wk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_other_wk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_other_wk_key$temp(
				act_other_wk_id varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_other_wk_key_pk_ie ON mgw_act_other_wk_key$temp
				USING BTREE (act_other_wk_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_other_wk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_other_wk_key$temp(
			act_other_wk_id
		)VALUES (
			NEW.act_other_wk_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_other_wk_key$temp
		SET 
			act_other_wk_id = NEW.act_other_wk_id
		WHERE 0=0
		AND (act_other_wk_id = OLD.act_other_wk_id OR act_other_wk_id IS NULL AND OLD.act_other_wk_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_other_wk_key$temp
		WHERE 0=0
		AND (act_other_wk_id = OLD.act_other_wk_id OR act_other_wk_id IS NULL AND OLD.act_other_wk_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_other_wk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_other_wk_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_other_wk_key$func();
;

