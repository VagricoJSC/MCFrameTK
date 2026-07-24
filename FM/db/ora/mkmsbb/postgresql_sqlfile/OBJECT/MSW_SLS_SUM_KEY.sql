\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_sls_sum_key()
RETURNS TABLE (
	ym timestamp(0),
	sls_dpt_cd varchar,
	sls_usr_cd varchar,
	cst_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	cur_cd varchar,
	wrk_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_sum_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_sum_key$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				sls_usr_cd varchar (500) NULL,
				cst_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				cur_cd varchar (3) NULL,
				wrk_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sls_sum_key_pk_ie ON msw_sls_sum_key$temp
				USING BTREE (ym,sls_dpt_cd,sls_usr_cd,cst_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,cur_cd,wrk_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_sum_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_sls_sum_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_sls_sum_key
AS
SELECT *
FROM msw_sls_sum_key();
ALTER VIEW msw_sls_sum_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_sls_sum_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_sls_sum_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_sls_sum_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_sls_sum_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_sls_sum_key$temp(
				ym timestamp(0)  NULL,
				sls_dpt_cd varchar (20) NULL,
				sls_usr_cd varchar (500) NULL,
				cst_cd varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				cur_cd varchar (3) NULL,
				wrk_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_sls_sum_key_pk_ie ON msw_sls_sum_key$temp
				USING BTREE (ym,sls_dpt_cd,sls_usr_cd,cst_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,cur_cd,wrk_no);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_sls_sum_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_sls_sum_key$temp(
			ym,
			sls_dpt_cd,
			sls_usr_cd,
			cst_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			cur_cd,
			wrk_no
		)VALUES (
			NEW.ym,
			NEW.sls_dpt_cd,
			NEW.sls_usr_cd,
			NEW.cst_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.cur_cd,
			NEW.wrk_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_sls_sum_key$temp
		SET 
			ym = NEW.ym,
			sls_dpt_cd = NEW.sls_dpt_cd,
			sls_usr_cd = NEW.sls_usr_cd,
			cst_cd = NEW.cst_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			cur_cd = NEW.cur_cd,
			wrk_no = NEW.wrk_no
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_sls_sum_key$temp
		WHERE 0=0
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_sls_sum_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_sls_sum_key
FOR EACH ROW
EXECUTE PROCEDURE msw_sls_sum_key$func();
;

