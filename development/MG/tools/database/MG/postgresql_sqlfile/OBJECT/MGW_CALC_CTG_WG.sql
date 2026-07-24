\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_ctg_wg()
RETURNS TABLE (
	calc_ctg_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_ctg_wg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_ctg_wg$temp(
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_calc_ctg_wg$temp
			ADD CONSTRAINT mgw_calc_ctg_wg_pk PRIMARY KEY(calc_ctg_cd,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_ctg_wg$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_ctg_wg$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_ctg_wg
AS
SELECT *
FROM mgw_calc_ctg_wg();

CREATE OR REPLACE FUNCTION mgw_calc_ctg_wg$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_ctg_wg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_ctg_wg$temp(
				calc_ctg_cd varchar (10) NOT NULL,
				wg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_calc_ctg_wg$temp
			ADD CONSTRAINT mgw_calc_ctg_wg_pk PRIMARY KEY(calc_ctg_cd,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_ctg_wg$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_ctg_wg$temp(
			calc_ctg_cd,
			wg_cd
		)VALUES (
			NEW.calc_ctg_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_ctg_wg$temp
		SET 
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_ctg_wg$temp
		WHERE 0=0
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND wg_cd = OLD.wg_cd;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_ctg_wg$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_ctg_wg
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_ctg_wg$func();
;

