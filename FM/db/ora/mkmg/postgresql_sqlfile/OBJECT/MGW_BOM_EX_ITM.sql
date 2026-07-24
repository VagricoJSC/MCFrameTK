\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_bom_ex_itm()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	wg_cd varchar,
	calc_ctg_cd varchar,
	dtl_calc_ctg_cd varchar,
	purc_calc_ctg_cd varchar,
	proc_calc_ctg_cd varchar,
	prov_calc_ctg_cd varchar,
	sls_calc_ctg_cd varchar,
	fix_calc_ctg_cd varchar,
	bom_wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_itm$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_itm$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				calc_ctg_cd varchar (10) NULL,
				dtl_calc_ctg_cd varchar (10) NULL,
				purc_calc_ctg_cd varchar (10) NULL,
				proc_calc_ctg_cd varchar (10) NULL,
				prov_calc_ctg_cd varchar (10) NULL,
				sls_calc_ctg_cd varchar (10) NULL,
				fix_calc_ctg_cd varchar (10) NULL,
				bom_wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_itm$temp
			ADD CONSTRAINT mgw_bom_ex_itm_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_itm$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_bom_ex_itm$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_bom_ex_itm
AS
SELECT *
FROM mgw_bom_ex_itm();
ALTER VIEW mgw_bom_ex_itm ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_itm ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_itm ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_bom_ex_itm$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_itm$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_itm$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				wg_cd varchar (10) NOT NULL,
				calc_ctg_cd varchar (10) NULL,
				dtl_calc_ctg_cd varchar (10) NULL,
				purc_calc_ctg_cd varchar (10) NULL,
				proc_calc_ctg_cd varchar (10) NULL,
				prov_calc_ctg_cd varchar (10) NULL,
				sls_calc_ctg_cd varchar (10) NULL,
				fix_calc_ctg_cd varchar (10) NULL,
				bom_wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_itm$temp
			ADD CONSTRAINT mgw_bom_ex_itm_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd);
			
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_itm$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_bom_ex_itm$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			wg_cd,
			calc_ctg_cd,
			dtl_calc_ctg_cd,
			purc_calc_ctg_cd,
			proc_calc_ctg_cd,
			prov_calc_ctg_cd,
			sls_calc_ctg_cd,
			fix_calc_ctg_cd,
			bom_wg_cd
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.wg_cd,
			NEW.calc_ctg_cd,
			NEW.dtl_calc_ctg_cd,
			NEW.purc_calc_ctg_cd,
			NEW.proc_calc_ctg_cd,
			NEW.prov_calc_ctg_cd,
			NEW.sls_calc_ctg_cd,
			NEW.fix_calc_ctg_cd,
			NEW.bom_wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_bom_ex_itm$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			wg_cd = NEW.wg_cd,
			calc_ctg_cd = NEW.calc_ctg_cd,
			dtl_calc_ctg_cd = NEW.dtl_calc_ctg_cd,
			purc_calc_ctg_cd = NEW.purc_calc_ctg_cd,
			proc_calc_ctg_cd = NEW.proc_calc_ctg_cd,
			prov_calc_ctg_cd = NEW.prov_calc_ctg_cd,
			sls_calc_ctg_cd = NEW.sls_calc_ctg_cd,
			fix_calc_ctg_cd = NEW.fix_calc_ctg_cd,
			bom_wg_cd = NEW.bom_wg_cd
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND wg_cd = OLD.wg_cd
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (dtl_calc_ctg_cd = OLD.dtl_calc_ctg_cd OR dtl_calc_ctg_cd IS NULL AND OLD.dtl_calc_ctg_cd IS NULL)
		AND (purc_calc_ctg_cd = OLD.purc_calc_ctg_cd OR purc_calc_ctg_cd IS NULL AND OLD.purc_calc_ctg_cd IS NULL)
		AND (proc_calc_ctg_cd = OLD.proc_calc_ctg_cd OR proc_calc_ctg_cd IS NULL AND OLD.proc_calc_ctg_cd IS NULL)
		AND (prov_calc_ctg_cd = OLD.prov_calc_ctg_cd OR prov_calc_ctg_cd IS NULL AND OLD.prov_calc_ctg_cd IS NULL)
		AND (sls_calc_ctg_cd = OLD.sls_calc_ctg_cd OR sls_calc_ctg_cd IS NULL AND OLD.sls_calc_ctg_cd IS NULL)
		AND (fix_calc_ctg_cd = OLD.fix_calc_ctg_cd OR fix_calc_ctg_cd IS NULL AND OLD.fix_calc_ctg_cd IS NULL)
		AND (bom_wg_cd = OLD.bom_wg_cd OR bom_wg_cd IS NULL AND OLD.bom_wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_bom_ex_itm$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND wg_cd = OLD.wg_cd
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (dtl_calc_ctg_cd = OLD.dtl_calc_ctg_cd OR dtl_calc_ctg_cd IS NULL AND OLD.dtl_calc_ctg_cd IS NULL)
		AND (purc_calc_ctg_cd = OLD.purc_calc_ctg_cd OR purc_calc_ctg_cd IS NULL AND OLD.purc_calc_ctg_cd IS NULL)
		AND (proc_calc_ctg_cd = OLD.proc_calc_ctg_cd OR proc_calc_ctg_cd IS NULL AND OLD.proc_calc_ctg_cd IS NULL)
		AND (prov_calc_ctg_cd = OLD.prov_calc_ctg_cd OR prov_calc_ctg_cd IS NULL AND OLD.prov_calc_ctg_cd IS NULL)
		AND (sls_calc_ctg_cd = OLD.sls_calc_ctg_cd OR sls_calc_ctg_cd IS NULL AND OLD.sls_calc_ctg_cd IS NULL)
		AND (fix_calc_ctg_cd = OLD.fix_calc_ctg_cd OR fix_calc_ctg_cd IS NULL AND OLD.fix_calc_ctg_cd IS NULL)
		AND (bom_wg_cd = OLD.bom_wg_cd OR bom_wg_cd IS NULL AND OLD.bom_wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_bom_ex_itm$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_bom_ex_itm
FOR EACH ROW
EXECUTE PROCEDURE mgw_bom_ex_itm$func();
;

