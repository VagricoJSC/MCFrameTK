\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_grp_ctg()
RETURNS TABLE (
	calc_ctg_typ varchar,
	calc_ctg_cd varchar,
	ctg_prio numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_grp_ctg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_grp_ctg$temp(
				calc_ctg_typ varchar (2) NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				ctg_prio numeric (2,0) DEFAULT 0 NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_calc_grp_ctg$temp
			ADD CONSTRAINT mgw_calc_grp_ctg_pk PRIMARY KEY(calc_ctg_typ,calc_ctg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_grp_ctg$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_grp_ctg$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_grp_ctg
AS
SELECT *
FROM mgw_calc_grp_ctg();
ALTER VIEW mgw_calc_grp_ctg ALTER COLUMN ctg_prio SET DEFAULT 0;

CREATE OR REPLACE FUNCTION mgw_calc_grp_ctg$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_grp_ctg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_grp_ctg$temp(
				calc_ctg_typ varchar (2) NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				ctg_prio numeric (2,0) DEFAULT 0 NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_calc_grp_ctg$temp
			ADD CONSTRAINT mgw_calc_grp_ctg_pk PRIMARY KEY(calc_ctg_typ,calc_ctg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_grp_ctg$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_grp_ctg$temp(
			calc_ctg_typ,
			calc_ctg_cd,
			ctg_prio
		)VALUES (
			NEW.calc_ctg_typ,
			NEW.calc_ctg_cd,
			NEW.ctg_prio
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_grp_ctg$temp
		SET 
			calc_ctg_typ = NEW.calc_ctg_typ,
			calc_ctg_cd = NEW.calc_ctg_cd,
			ctg_prio = NEW.ctg_prio
		WHERE 0=0
		AND calc_ctg_typ = OLD.calc_ctg_typ
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND ctg_prio = OLD.ctg_prio;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_grp_ctg$temp
		WHERE 0=0
		AND calc_ctg_typ = OLD.calc_ctg_typ
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND ctg_prio = OLD.ctg_prio;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_grp_ctg$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_grp_ctg
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_grp_ctg$func();
;

