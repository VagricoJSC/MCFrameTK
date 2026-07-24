\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_itm_dtl_key()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	loc_cd varchar,
	sppl_cd varchar,
	rqst_wg_cd varchar,
	term timestamp(0),
	calc_ctg_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_itm_dtl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_itm_dtl_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				loc_cd varchar (20) DEFAULT '*' NULL,
				sppl_cd varchar (20) DEFAULT '*' NULL,
				rqst_wg_cd varchar (10) DEFAULT '*' NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_itm_dtl_key_pk_ie ON mgw_itm_dtl_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,sppl_cd,rqst_wg_cd,term,calc_ctg_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_itm_dtl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_itm_dtl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_itm_dtl_key
AS
SELECT *
FROM mgw_itm_dtl_key();
ALTER VIEW mgw_itm_dtl_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_itm_dtl_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_itm_dtl_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_itm_dtl_key ALTER COLUMN loc_cd SET DEFAULT '*';
ALTER VIEW mgw_itm_dtl_key ALTER COLUMN sppl_cd SET DEFAULT '*';
ALTER VIEW mgw_itm_dtl_key ALTER COLUMN rqst_wg_cd SET DEFAULT '*';
ALTER VIEW mgw_itm_dtl_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_itm_dtl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_itm_dtl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_itm_dtl_key$temp(
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				loc_cd varchar (20) DEFAULT '*' NULL,
				sppl_cd varchar (20) DEFAULT '*' NULL,
				rqst_wg_cd varchar (10) DEFAULT '*' NULL,
				term timestamp(0)  NULL,
				calc_ctg_cd varchar (10) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_itm_dtl_key_pk_ie ON mgw_itm_dtl_key$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,sppl_cd,rqst_wg_cd,term,calc_ctg_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_itm_dtl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_itm_dtl_key$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			loc_cd,
			sppl_cd,
			rqst_wg_cd,
			term,
			calc_ctg_cd,
			wg_cd
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.loc_cd,
			NEW.sppl_cd,
			NEW.rqst_wg_cd,
			NEW.term,
			NEW.calc_ctg_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_itm_dtl_key$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			loc_cd = NEW.loc_cd,
			sppl_cd = NEW.sppl_cd,
			rqst_wg_cd = NEW.rqst_wg_cd,
			term = NEW.term,
			calc_ctg_cd = NEW.calc_ctg_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (rqst_wg_cd = OLD.rqst_wg_cd OR rqst_wg_cd IS NULL AND OLD.rqst_wg_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_itm_dtl_key$temp
		WHERE 0=0
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (rqst_wg_cd = OLD.rqst_wg_cd OR rqst_wg_cd IS NULL AND OLD.rqst_wg_cd IS NULL)
		AND (term = OLD.term OR term IS NULL AND OLD.term IS NULL)
		AND (calc_ctg_cd = OLD.calc_ctg_cd OR calc_ctg_cd IS NULL AND OLD.calc_ctg_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_itm_dtl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_itm_dtl_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_itm_dtl_key$func();
;

