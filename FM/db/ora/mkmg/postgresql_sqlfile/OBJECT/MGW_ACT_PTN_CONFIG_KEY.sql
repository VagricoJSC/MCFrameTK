\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_ptn_config_key()
RETURNS TABLE (
	act_ptn_cd varchar,
	calc_act_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_ptn_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_ptn_config_key$temp(
				act_ptn_cd varchar (10) NULL,
				calc_act_seq numeric (3,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_ptn_config_key_pk_ie ON mgw_act_ptn_config_key$temp
				USING BTREE (act_ptn_cd,calc_act_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_ptn_config_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_ptn_config_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_ptn_config_key
AS
SELECT *
FROM mgw_act_ptn_config_key();

CREATE OR REPLACE FUNCTION mgw_act_ptn_config_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_ptn_config_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_ptn_config_key$temp(
				act_ptn_cd varchar (10) NULL,
				calc_act_seq numeric (3,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_ptn_config_key_pk_ie ON mgw_act_ptn_config_key$temp
				USING BTREE (act_ptn_cd,calc_act_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_ptn_config_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_ptn_config_key$temp(
			act_ptn_cd,
			calc_act_seq
		)VALUES (
			NEW.act_ptn_cd,
			NEW.calc_act_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_ptn_config_key$temp
		SET 
			act_ptn_cd = NEW.act_ptn_cd,
			calc_act_seq = NEW.calc_act_seq
		WHERE 0=0
		AND (act_ptn_cd = OLD.act_ptn_cd OR act_ptn_cd IS NULL AND OLD.act_ptn_cd IS NULL)
		AND (calc_act_seq = OLD.calc_act_seq OR calc_act_seq IS NULL AND OLD.calc_act_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_ptn_config_key$temp
		WHERE 0=0
		AND (act_ptn_cd = OLD.act_ptn_cd OR act_ptn_cd IS NULL AND OLD.act_ptn_cd IS NULL)
		AND (calc_act_seq = OLD.calc_act_seq OR calc_act_seq IS NULL AND OLD.calc_act_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_ptn_config_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_ptn_config_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_ptn_config_key$func();
;

