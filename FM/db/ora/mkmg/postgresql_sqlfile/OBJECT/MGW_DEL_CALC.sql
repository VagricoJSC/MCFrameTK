\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_del_calc()
RETURNS TABLE (
	calc_grp_cd varchar,
	calc_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_del_calc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_del_calc$temp(
				calc_grp_cd varchar (10) NOT NULL,
				calc_no varchar (15) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			ALTER TABLE mgw_del_calc$temp
			ADD CONSTRAINT mgw_del_calc_pk PRIMARY KEY(calc_grp_cd,calc_no);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_del_calc$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_del_calc$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_del_calc
AS
SELECT *
FROM mgw_del_calc();

CREATE OR REPLACE FUNCTION mgw_del_calc$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_del_calc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_del_calc$temp(
				calc_grp_cd varchar (10) NOT NULL,
				calc_no varchar (15) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			ALTER TABLE mgw_del_calc$temp
			ADD CONSTRAINT mgw_del_calc_pk PRIMARY KEY(calc_grp_cd,calc_no);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_del_calc$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_del_calc$temp(
			calc_grp_cd,
			calc_no
		)VALUES (
			NEW.calc_grp_cd,
			NEW.calc_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_del_calc$temp
		SET 
			calc_grp_cd = NEW.calc_grp_cd,
			calc_no = NEW.calc_no
		WHERE 0=0
		AND calc_grp_cd = OLD.calc_grp_cd
		AND calc_no = OLD.calc_no;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_del_calc$temp
		WHERE 0=0
		AND calc_grp_cd = OLD.calc_grp_cd
		AND calc_no = OLD.calc_no;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_del_calc$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_del_calc
FOR EACH ROW
EXECUTE PROCEDURE mgw_del_calc$func();
;

