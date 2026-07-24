\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_bom_ex_proc()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	wg_cd varchar,
	calc_ctg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_proc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_proc$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				calc_ctg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_proc$temp
			ADD CONSTRAINT mgw_bom_ex_proc_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_proc$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_bom_ex_proc$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_bom_ex_proc
AS
SELECT *
FROM mgw_bom_ex_proc();
ALTER VIEW mgw_bom_ex_proc ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_proc ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_proc ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_bom_ex_proc$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_proc$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_proc$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				calc_ctg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_proc$temp
			ADD CONSTRAINT mgw_bom_ex_proc_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_proc$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_bom_ex_proc$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.wg_cd,
			NEW.calc_ctg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_bom_ex_proc$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			wg_cd = NEW.wg_cd,
			calc_ctg_cd = NEW.calc_ctg_cd
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND wg_cd = OLD.wg_cd
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_bom_ex_proc$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND wg_cd = OLD.wg_cd
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_bom_ex_proc$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_bom_ex_proc
FOR EACH ROW
EXECUTE PROCEDURE mgw_bom_ex_proc$func();
;

