\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_ym_no_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	ym timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_ym_no_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_ym_no_key$temp(
				calc_grp_cd varchar (10) NULL,
				ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_ym_no_key_pk_ie ON mgw_ym_no_key$temp
				USING BTREE (calc_grp_cd,ym);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_ym_no_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_ym_no_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_ym_no_key
AS
SELECT *
FROM mgw_ym_no_key();

CREATE OR REPLACE FUNCTION mgw_ym_no_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_ym_no_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_ym_no_key$temp(
				calc_grp_cd varchar (10) NULL,
				ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_ym_no_key_pk_ie ON mgw_ym_no_key$temp
				USING BTREE (calc_grp_cd,ym);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_ym_no_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_ym_no_key$temp(
			calc_grp_cd,
			ym
		)VALUES (
			NEW.calc_grp_cd,
			NEW.ym
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_ym_no_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			ym = NEW.ym
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_ym_no_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_ym_no_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_ym_no_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_ym_no_key$func();
;

