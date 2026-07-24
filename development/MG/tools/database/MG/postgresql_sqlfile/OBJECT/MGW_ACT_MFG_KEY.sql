\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_mfg_key()
RETURNS TABLE (
	act_mfg_id varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_mfg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_mfg_key$temp(
				act_mfg_id varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_mfg_key_pk_ie ON mgw_act_mfg_key$temp
				USING BTREE (act_mfg_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_mfg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_mfg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_mfg_key
AS
SELECT *
FROM mgw_act_mfg_key();

CREATE OR REPLACE FUNCTION mgw_act_mfg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_mfg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_mfg_key$temp(
				act_mfg_id varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_mfg_key_pk_ie ON mgw_act_mfg_key$temp
				USING BTREE (act_mfg_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_mfg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_mfg_key$temp(
			act_mfg_id
		)VALUES (
			NEW.act_mfg_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_mfg_key$temp
		SET 
			act_mfg_id = NEW.act_mfg_id
		WHERE 0=0
		AND (act_mfg_id = OLD.act_mfg_id OR act_mfg_id IS NULL AND OLD.act_mfg_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_mfg_key$temp
		WHERE 0=0
		AND (act_mfg_id = OLD.act_mfg_id OR act_mfg_id IS NULL AND OLD.act_mfg_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_mfg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_mfg_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_mfg_key$func();
;

