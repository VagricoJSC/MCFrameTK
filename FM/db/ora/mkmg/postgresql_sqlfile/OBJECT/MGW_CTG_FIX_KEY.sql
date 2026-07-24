\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_ctg_fix_key()
RETURNS TABLE (
	calc_grp_cd varchar,
	ym timestamp(0),
	calc_ctg_typ varchar,
	calc_ctg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_ctg_fix_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_ctg_fix_key$temp(
				calc_grp_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				calc_ctg_typ varchar (2) NULL,
				calc_ctg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_ctg_fix_key_pk_ie ON mgw_ctg_fix_key$temp
				USING BTREE (calc_grp_cd,ym,calc_ctg_typ,calc_ctg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_ctg_fix_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_ctg_fix_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_ctg_fix_key
AS
SELECT *
FROM mgw_ctg_fix_key();

CREATE OR REPLACE FUNCTION mgw_ctg_fix_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_ctg_fix_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_ctg_fix_key$temp(
				calc_grp_cd varchar (10) NULL,
				ym timestamp(0)  NULL,
				calc_ctg_typ varchar (2) NULL,
				calc_ctg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_ctg_fix_key_pk_ie ON mgw_ctg_fix_key$temp
				USING BTREE (calc_grp_cd,ym,calc_ctg_typ,calc_ctg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_ctg_fix_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_ctg_fix_key$temp(
			calc_grp_cd,
			ym,
			calc_ctg_typ,
			calc_ctg_cd
		)VALUES (
			NEW.calc_grp_cd,
			NEW.ym,
			NEW.calc_ctg_typ,
			NEW.calc_ctg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_ctg_fix_key$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			ym = NEW.ym,
			calc_ctg_typ = NEW.calc_ctg_typ,
			calc_ctg_cd = NEW.calc_ctg_cd
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (calc_ctg_typ = OLD.calc_ctg_typ OR calc_ctg_typ IS NULL AND OLD.calc_ctg_typ IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_ctg_fix_key$temp
		WHERE 0=0
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (calc_ctg_typ = OLD.calc_ctg_typ OR calc_ctg_typ IS NULL AND OLD.calc_ctg_typ IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_ctg_fix_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_ctg_fix_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_ctg_fix_key$func();
;

