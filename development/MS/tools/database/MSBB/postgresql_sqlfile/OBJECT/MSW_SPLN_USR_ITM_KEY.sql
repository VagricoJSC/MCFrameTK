\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_spln_usr_itm_key()
RETURNS TABLE (
	usr_cd varchar,
	ym timestamp(0),
	dpt_cd varchar,
	cst_cd varchar,
	wrk_no varchar,
	spln_itm_cd varchar,
	cur_cd varchar,
	spln_ym timestamp(0),
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_usr_itm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_usr_itm_key$temp(
				usr_cd varchar (500) NULL,
				ym timestamp(0)  NULL,
				dpt_cd varchar (20) NULL,
				cst_cd varchar (20) DEFAULT '*' NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				spln_itm_cd varchar (40) NULL,
				cur_cd varchar (3) NULL,
				spln_ym timestamp(0)  NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_usr_itm_key_pk_ie ON msw_spln_usr_itm_key$temp
				USING BTREE (usr_cd,ym,dpt_cd,cst_cd,wrk_no,spln_itm_cd,cur_cd,spln_ym,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_usr_itm_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_spln_usr_itm_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_spln_usr_itm_key
AS
SELECT *
FROM msw_spln_usr_itm_key();
ALTER VIEW msw_spln_usr_itm_key ALTER COLUMN cst_cd SET DEFAULT '*';
ALTER VIEW msw_spln_usr_itm_key ALTER COLUMN wrk_no SET DEFAULT '*';
ALTER VIEW msw_spln_usr_itm_key ALTER COLUMN itm_cd SET DEFAULT '*';
ALTER VIEW msw_spln_usr_itm_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW msw_spln_usr_itm_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW msw_spln_usr_itm_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION msw_spln_usr_itm_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_spln_usr_itm_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_spln_usr_itm_key$temp(
				usr_cd varchar (500) NULL,
				ym timestamp(0)  NULL,
				dpt_cd varchar (20) NULL,
				cst_cd varchar (20) DEFAULT '*' NULL,
				wrk_no varchar (15) DEFAULT '*' NULL,
				spln_itm_cd varchar (40) NULL,
				cur_cd varchar (3) NULL,
				spln_ym timestamp(0)  NULL,
				itm_cd varchar (40) DEFAULT '*' NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX msw_spln_usr_itm_key_pk_ie ON msw_spln_usr_itm_key$temp
				USING BTREE (usr_cd,ym,dpt_cd,cst_cd,wrk_no,spln_itm_cd,cur_cd,spln_ym,itm_cd,itm_sub1,itm_sub2,itm_sub3);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_spln_usr_itm_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_spln_usr_itm_key$temp(
			usr_cd,
			ym,
			dpt_cd,
			cst_cd,
			wrk_no,
			spln_itm_cd,
			cur_cd,
			spln_ym,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)VALUES (
			NEW.usr_cd,
			NEW.ym,
			NEW.dpt_cd,
			NEW.cst_cd,
			NEW.wrk_no,
			NEW.spln_itm_cd,
			NEW.cur_cd,
			NEW.spln_ym,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_spln_usr_itm_key$temp
		SET 
			usr_cd = NEW.usr_cd,
			ym = NEW.ym,
			dpt_cd = NEW.dpt_cd,
			cst_cd = NEW.cst_cd,
			wrk_no = NEW.wrk_no,
			spln_itm_cd = NEW.spln_itm_cd,
			cur_cd = NEW.cur_cd,
			spln_ym = NEW.spln_ym,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3
		WHERE 0=0
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (spln_itm_cd = OLD.spln_itm_cd OR spln_itm_cd IS NULL AND OLD.spln_itm_cd IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (spln_ym = OLD.spln_ym OR spln_ym IS NULL AND OLD.spln_ym IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_spln_usr_itm_key$temp
		WHERE 0=0
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (ym = OLD.ym OR ym IS NULL AND OLD.ym IS NULL)
		AND (dpt_cd = OLD.dpt_cd OR dpt_cd IS NULL AND OLD.dpt_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (spln_itm_cd = OLD.spln_itm_cd OR spln_itm_cd IS NULL AND OLD.spln_itm_cd IS NULL)
		AND (cur_cd = OLD.cur_cd OR cur_cd IS NULL AND OLD.cur_cd IS NULL)
		AND (spln_ym = OLD.spln_ym OR spln_ym IS NULL AND OLD.spln_ym IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_spln_usr_itm_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_spln_usr_itm_key
FOR EACH ROW
EXECUTE PROCEDURE msw_spln_usr_itm_key$func();
;

