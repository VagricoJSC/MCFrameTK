\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_xrate()
RETURNS TABLE (
	fr_cur_cd varchar,
	to_cur_cd varchar,
	xrate numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_xrate$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_xrate$temp(
				fr_cur_cd varchar (3) NOT NULL,
				to_cur_cd varchar (3) NOT NULL,
				xrate numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			ALTER TABLE mgw_calc_xrate$temp
			ADD CONSTRAINT mgw_calc_xrate_pk PRIMARY KEY(fr_cur_cd,to_cur_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_xrate$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_xrate$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_xrate
AS
SELECT *
FROM mgw_calc_xrate();

CREATE OR REPLACE FUNCTION mgw_calc_xrate$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_xrate$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_xrate$temp(
				fr_cur_cd varchar (3) NOT NULL,
				to_cur_cd varchar (3) NOT NULL,
				xrate numeric (21,8) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			ALTER TABLE mgw_calc_xrate$temp
			ADD CONSTRAINT mgw_calc_xrate_pk PRIMARY KEY(fr_cur_cd,to_cur_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_xrate$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_xrate$temp(
			fr_cur_cd,
			to_cur_cd,
			xrate
		)VALUES (
			NEW.fr_cur_cd,
			NEW.to_cur_cd,
			NEW.xrate
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_xrate$temp
		SET 
			fr_cur_cd = NEW.fr_cur_cd,
			to_cur_cd = NEW.to_cur_cd,
			xrate = NEW.xrate
		WHERE 0=0
		AND fr_cur_cd = OLD.fr_cur_cd
		AND to_cur_cd = OLD.to_cur_cd
		AND xrate = OLD.xrate;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_xrate$temp
		WHERE 0=0
		AND fr_cur_cd = OLD.fr_cur_cd
		AND to_cur_cd = OLD.to_cur_cd
		AND xrate = OLD.xrate;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_xrate$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_xrate
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_xrate$func();
;

