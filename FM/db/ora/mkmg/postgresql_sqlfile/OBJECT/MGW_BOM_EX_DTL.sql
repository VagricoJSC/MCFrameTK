\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_bom_ex_dtl()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	bom_ptn varchar,
	wg_cd varchar,
	rqst_wg_cd varchar,
	calc_ctg_cd varchar,
	bom_calc_ctg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_dtl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_dtl$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				bom_ptn varchar (40) NULL,
				wg_cd varchar (10) NOT NULL,
				rqst_wg_cd varchar (10) NULL,
				calc_ctg_cd varchar (10) NULL,
				bom_calc_ctg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_dtl$temp
			ADD CONSTRAINT mgw_bom_ex_dtl_pk UNIQUE(itm_cd,itm_sub1,itm_sub2,itm_sub3,bom_ptn,wg_cd,rqst_wg_cd);
			CREATE UNIQUE INDEX MGW_BOM_EX_DTL_pk_ie ON mgw_bom_ex_dtl$temp (itm_cd,itm_sub1,itm_sub2,itm_sub3,COALESCE(bom_ptn,''),wg_cd,COALESCE(rqst_wg_cd,''));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_dtl$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_bom_ex_dtl$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_bom_ex_dtl
AS
SELECT *
FROM mgw_bom_ex_dtl();
ALTER VIEW mgw_bom_ex_dtl ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_dtl ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_dtl ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_bom_ex_dtl$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_dtl$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_dtl$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				bom_ptn varchar (40) NULL,
				wg_cd varchar (10) NOT NULL,
				rqst_wg_cd varchar (10) NULL,
				calc_ctg_cd varchar (10) NULL,
				bom_calc_ctg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_dtl$temp
			ADD CONSTRAINT mgw_bom_ex_dtl_pk UNIQUE(itm_cd,itm_sub1,itm_sub2,itm_sub3,bom_ptn,wg_cd,rqst_wg_cd);
			CREATE UNIQUE INDEX MGW_BOM_EX_DTL_pk_ie ON mgw_bom_ex_dtl$temp (itm_cd,itm_sub1,itm_sub2,itm_sub3,COALESCE(bom_ptn,''),wg_cd,COALESCE(rqst_wg_cd,''));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_dtl$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_bom_ex_dtl$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			bom_ptn,
			wg_cd,
			rqst_wg_cd,
			calc_ctg_cd,
			bom_calc_ctg_cd
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.bom_ptn,
			NEW.wg_cd,
			NEW.rqst_wg_cd,
			NEW.calc_ctg_cd,
			NEW.bom_calc_ctg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_bom_ex_dtl$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			bom_ptn = NEW.bom_ptn,
			wg_cd = NEW.wg_cd,
			rqst_wg_cd = NEW.rqst_wg_cd,
			calc_ctg_cd = NEW.calc_ctg_cd,
			bom_calc_ctg_cd = NEW.bom_calc_ctg_cd
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND wg_cd = OLD.wg_cd
		AND (rqst_wg_cd = OLD.rqst_wg_cd OR rqst_wg_cd IS NULL AND OLD.rqst_wg_cd IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (bom_calc_ctg_cd = OLD.bom_calc_ctg_cd OR bom_calc_ctg_cd IS NULL AND OLD.bom_calc_ctg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_bom_ex_dtl$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND wg_cd = OLD.wg_cd
		AND (rqst_wg_cd = OLD.rqst_wg_cd OR rqst_wg_cd IS NULL AND OLD.rqst_wg_cd IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (bom_calc_ctg_cd = OLD.bom_calc_ctg_cd OR bom_calc_ctg_cd IS NULL AND OLD.bom_calc_ctg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_bom_ex_dtl$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_bom_ex_dtl
FOR EACH ROW
EXECUTE PROCEDURE mgw_bom_ex_dtl$func();
;

