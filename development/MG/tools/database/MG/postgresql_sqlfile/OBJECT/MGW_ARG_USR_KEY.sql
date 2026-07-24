\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_arg_usr_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	usr_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_arg_usr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_arg_usr_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				usr_cd varchar (500) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_arg_usr_key_pk_ie ON mgw_arg_usr_key$temp
				USING BTREE (calc_no,calc_grp_cd,usr_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_arg_usr_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_arg_usr_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_arg_usr_key
AS
SELECT *
FROM mgw_arg_usr_key();

CREATE OR REPLACE FUNCTION mgw_arg_usr_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_arg_usr_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_arg_usr_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				usr_cd varchar (500) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_arg_usr_key_pk_ie ON mgw_arg_usr_key$temp
				USING BTREE (calc_no,calc_grp_cd,usr_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_arg_usr_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_arg_usr_key$temp(
			calc_no,
			calc_grp_cd,
			usr_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.usr_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_arg_usr_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			usr_cd = NEW.usr_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_arg_usr_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_arg_usr_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_arg_usr_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_arg_usr_key$func();
;

