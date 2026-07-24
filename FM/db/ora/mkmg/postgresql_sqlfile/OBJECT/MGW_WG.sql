\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_wg()
RETURNS TABLE (
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_wg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_wg$temp(
				wg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			ALTER TABLE mgw_wg$temp
			ADD CONSTRAINT mgw_wg_pk PRIMARY KEY(wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_wg$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_wg$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_wg
AS
SELECT *
FROM mgw_wg();

CREATE OR REPLACE FUNCTION mgw_wg$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_wg$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_wg$temp(
				wg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT PRESERVE ROWS;
			ALTER TABLE mgw_wg$temp
			ADD CONSTRAINT mgw_wg_pk PRIMARY KEY(wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_wg$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_wg$temp(
			wg_cd
		)VALUES (
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_wg$temp
		SET 
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND wg_cd = OLD.wg_cd;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_wg$temp
		WHERE 0=0
		AND wg_cd = OLD.wg_cd;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_wg$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_wg
FOR EACH ROW
EXECUTE PROCEDURE mgw_wg$func();
;

