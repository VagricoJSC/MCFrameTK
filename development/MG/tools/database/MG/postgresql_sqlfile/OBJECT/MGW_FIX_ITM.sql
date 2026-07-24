\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_fix_itm()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	wg_cd varchar,
	calc_ctg_cd varchar,
	calc_ptn_cd varchar,
	std_qty numeric,
	fix_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_fix_itm$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_fix_itm$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				calc_ptn_cd varchar (10) NULL,
				std_qty numeric (21,8) NULL,
				fix_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_fix_itm$temp
			ADD CONSTRAINT mgw_fix_itm_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd);
			
			ALTER TABLE mgw_fix_itm$temp
				ADD CONSTRAINT mgw_fix_itm_ck01 CHECK (fix_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_fix_itm$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_fix_itm$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_fix_itm
AS
SELECT *
FROM mgw_fix_itm();
ALTER VIEW mgw_fix_itm ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_fix_itm ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_fix_itm ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_fix_itm ALTER COLUMN fix_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_fix_itm$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_fix_itm$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_fix_itm$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				calc_ctg_cd varchar (10) NOT NULL,
				calc_ptn_cd varchar (10) NULL,
				std_qty numeric (21,8) NULL,
				fix_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_fix_itm$temp
			ADD CONSTRAINT mgw_fix_itm_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd);
			
			ALTER TABLE mgw_fix_itm$temp
			ADD CONSTRAINT mgw_fix_itm_ck01 CHECK (fix_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_fix_itm$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_fix_itm$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd,
			calc_ptn_cd,
			std_qty,
			fix_flg
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.wg_cd,
			NEW.calc_ctg_cd,
			NEW.calc_ptn_cd,
			NEW.std_qty,
			NEW.fix_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_fix_itm$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			wg_cd = NEW.wg_cd,
			calc_ctg_cd = NEW.calc_ctg_cd,
			calc_ptn_cd = NEW.calc_ptn_cd,
			std_qty = NEW.std_qty,
			fix_flg = NEW.fix_flg
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND wg_cd = OLD.wg_cd
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND (calc_ptn_cd = OLD.calc_ptn_cd OR calc_ptn_cd IS NULL AND OLD.calc_ptn_cd IS NULL)
		AND (std_qty = OLD.std_qty OR std_qty IS NULL AND OLD.std_qty IS NULL)
		AND fix_flg = OLD.fix_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_fix_itm$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND wg_cd = OLD.wg_cd
		AND calc_ctg_cd = OLD.calc_ctg_cd
		AND (calc_ptn_cd = OLD.calc_ptn_cd OR calc_ptn_cd IS NULL AND OLD.calc_ptn_cd IS NULL)
		AND (std_qty = OLD.std_qty OR std_qty IS NULL AND OLD.std_qty IS NULL)
		AND fix_flg = OLD.fix_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_fix_itm$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_fix_itm
FOR EACH ROW
EXECUTE PROCEDURE mgw_fix_itm$func();
;

