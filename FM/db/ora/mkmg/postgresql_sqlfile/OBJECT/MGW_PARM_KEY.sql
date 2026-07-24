\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_parm_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	parm_key varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_parm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_parm_key$temp(
				calc_grp_cd varchar (10) NULL,
				parm_key varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_parm_key_pk_ie ON mgw_parm_key$temp
				USING BTREE (calc_grp_cd,parm_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_parm_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_parm_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_parm_key
AS
SELECT *
FROM mgw_parm_key();

CREATE OR REPLACE FUNCTION mgw_parm_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_parm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_parm_key$temp(
				calc_grp_cd varchar (10) NULL,
				parm_key varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_parm_key_pk_ie ON mgw_parm_key$temp
				USING BTREE (calc_grp_cd,parm_key);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_parm_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_parm_key$temp(
			calc_grp_cd,
			parm_key
		)VALUES (
			NEW.calc_grp_cd,
			NEW.parm_key
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_parm_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			parm_key = NEW.parm_key
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (parm_key = OLD.parm_key OR parm_key IS NULL AND OLD.parm_key IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_parm_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (parm_key = OLD.parm_key OR parm_key IS NULL AND OLD.parm_key IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_parm_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_parm_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_parm_key$func();
;

