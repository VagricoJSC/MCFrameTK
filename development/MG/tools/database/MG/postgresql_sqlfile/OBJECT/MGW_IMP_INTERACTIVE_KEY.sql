\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_imp_interactive_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_imp_interactive_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_imp_interactive_key$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_imp_interactive_key$temp
			ADD CONSTRAINT mgw_imp_interactive_key_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_imp_interactive_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_imp_interactive_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_imp_interactive_key
AS
SELECT *
FROM mgw_imp_interactive_key();
ALTER VIEW mgw_imp_interactive_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_imp_interactive_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_imp_interactive_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_imp_interactive_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_imp_interactive_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_imp_interactive_key$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_imp_interactive_key$temp
			ADD CONSTRAINT mgw_imp_interactive_key_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_imp_interactive_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_imp_interactive_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_imp_interactive_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND wg_cd = OLD.wg_cd;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_imp_interactive_key$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND wg_cd = OLD.wg_cd;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_imp_interactive_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_imp_interactive_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_imp_interactive_key$func();
;

