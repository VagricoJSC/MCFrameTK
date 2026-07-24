\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_no()
RETURNS TABLE (
	calc_grp_cd varchar,
	calc_no varchar,
	ym timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_no$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_no$temp(
				calc_grp_cd varchar (10) NOT NULL,
				calc_no varchar (15) NOT NULL,
				ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_calc_no$temp
			ADD CONSTRAINT mgw_calc_no_pk UNIQUE(calc_grp_cd,calc_no,ym);
			CREATE UNIQUE INDEX MGW_CALC_NO_pk_ie ON mgw_calc_no$temp (calc_grp_cd,calc_no,COALESCE(ym,'1999-04-01 00:00:00'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_no$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_no$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_no
AS
SELECT *
FROM mgw_calc_no();

CREATE OR REPLACE FUNCTION mgw_calc_no$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_no$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_no$temp(
				calc_grp_cd varchar (10) NOT NULL,
				calc_no varchar (15) NOT NULL,
				ym timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_calc_no$temp
			ADD CONSTRAINT mgw_calc_no_pk UNIQUE(calc_grp_cd,calc_no,ym);
			CREATE UNIQUE INDEX MGW_CALC_NO_pk_ie ON mgw_calc_no$temp (calc_grp_cd,calc_no,COALESCE(ym,'1999-04-01 00:00:00'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_no$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_no$temp(
			calc_grp_cd,
			calc_no,
			ym
		)VALUES (
			NEW.calc_grp_cd,
			NEW.calc_no,
			NEW.ym
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_no$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			calc_no = NEW.calc_no,
			ym = NEW.ym
		WHERE 0=0
		AND calc_grp_cd = OLD.calc_grp_cd
		AND calc_no = OLD.calc_no
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_no$temp
		WHERE 0=0
		AND calc_grp_cd = OLD.calc_grp_cd
		AND calc_no = OLD.calc_no
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_no$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_no
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_no$func();
;

