\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_chk_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	msg_id varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_chk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_chk_key$temp(
				calc_grp_cd varchar (10) NULL,
				msg_id varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_chk_key_pk_ie ON mgw_calc_chk_key$temp
				USING BTREE (calc_grp_cd,msg_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_chk_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_chk_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_chk_key
AS
SELECT *
FROM mgw_calc_chk_key();

CREATE OR REPLACE FUNCTION mgw_calc_chk_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_chk_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_chk_key$temp(
				calc_grp_cd varchar (10) NULL,
				msg_id varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_chk_key_pk_ie ON mgw_calc_chk_key$temp
				USING BTREE (calc_grp_cd,msg_id);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_chk_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_chk_key$temp(
			calc_grp_cd,
			msg_id
		)VALUES (
			NEW.calc_grp_cd,
			NEW.msg_id
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_chk_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			msg_id = NEW.msg_id
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (msg_id = OLD.msg_id OR msg_id IS NULL AND OLD.msg_id IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_chk_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (msg_id = OLD.msg_id OR msg_id IS NULL AND OLD.msg_id IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_chk_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_chk_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_chk_key$func();
;

