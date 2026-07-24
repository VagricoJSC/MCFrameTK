\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_act_inpt_expns_key()
RETURNS TABLE (
	act_inpt_id varchar,
	act_inpt_id_sub varchar,
	expns_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_inpt_expns_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_inpt_expns_key$temp(
				act_inpt_id varchar (20) NULL,
				act_inpt_id_sub varchar (3) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_inpt_expns_key_pk_ie ON mgw_act_inpt_expns_key$temp
				USING BTREE (act_inpt_id,act_inpt_id_sub,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_inpt_expns_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_act_inpt_expns_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_act_inpt_expns_key
AS
SELECT *
FROM mgw_act_inpt_expns_key();

CREATE OR REPLACE FUNCTION mgw_act_inpt_expns_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_act_inpt_expns_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_act_inpt_expns_key$temp(
				act_inpt_id varchar (20) NULL,
				act_inpt_id_sub varchar (3) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_act_inpt_expns_key_pk_ie ON mgw_act_inpt_expns_key$temp
				USING BTREE (act_inpt_id,act_inpt_id_sub,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_act_inpt_expns_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_act_inpt_expns_key$temp(
			act_inpt_id,
			act_inpt_id_sub,
			expns_cd
		)VALUES (
			NEW.act_inpt_id,
			NEW.act_inpt_id_sub,
			NEW.expns_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_act_inpt_expns_key$temp
		SET 
			act_inpt_id = NEW.act_inpt_id,
			act_inpt_id_sub = NEW.act_inpt_id_sub,
			expns_cd = NEW.expns_cd
		WHERE 0=0
		AND (act_inpt_id = OLD.act_inpt_id OR act_inpt_id IS NULL AND OLD.act_inpt_id IS NULL)
		AND (act_inpt_id_sub = OLD.act_inpt_id_sub OR act_inpt_id_sub IS NULL AND OLD.act_inpt_id_sub IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_act_inpt_expns_key$temp
		WHERE 0=0
		AND (act_inpt_id = OLD.act_inpt_id OR act_inpt_id IS NULL AND OLD.act_inpt_id IS NULL)
		AND (act_inpt_id_sub = OLD.act_inpt_id_sub OR act_inpt_id_sub IS NULL AND OLD.act_inpt_id_sub IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_act_inpt_expns_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_act_inpt_expns_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_act_inpt_expns_key$func();
;

