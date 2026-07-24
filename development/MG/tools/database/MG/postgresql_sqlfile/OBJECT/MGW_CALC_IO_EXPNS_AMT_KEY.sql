\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_io_expns_amt_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_ext varchar,
	wg_cd varchar,
	act_io_id varchar,
	act_io_id_sub varchar,
	amt_add_typ varchar,
	expns_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_io_expns_amt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_io_expns_amt_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				itm_ext varchar (100) DEFAULT '*' NULL,
				wg_cd varchar (10) NULL,
				act_io_id varchar (20) NULL,
				act_io_id_sub varchar (3) NULL,
				amt_add_typ varchar (1) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_io_expns_amt_key_pk_ie ON mgw_calc_io_expns_amt_key$temp
				USING BTREE (calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_ext,wg_cd,act_io_id,act_io_id_sub,amt_add_typ,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_io_expns_amt_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_io_expns_amt_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_io_expns_amt_key
AS
SELECT *
FROM mgw_calc_io_expns_amt_key();
ALTER VIEW mgw_calc_io_expns_amt_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_calc_io_expns_amt_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_calc_io_expns_amt_key ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_calc_io_expns_amt_key ALTER COLUMN itm_ext SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_calc_io_expns_amt_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_io_expns_amt_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_io_expns_amt_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				itm_ext varchar (100) DEFAULT '*' NULL,
				wg_cd varchar (10) NULL,
				act_io_id varchar (20) NULL,
				act_io_id_sub varchar (3) NULL,
				amt_add_typ varchar (1) NULL,
				expns_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_io_expns_amt_key_pk_ie ON mgw_calc_io_expns_amt_key$temp
				USING BTREE (calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_ext,wg_cd,act_io_id,act_io_id_sub,amt_add_typ,expns_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_io_expns_amt_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_io_expns_amt_key$temp(
			calc_no,
			calc_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_ext,
			wg_cd,
			act_io_id,
			act_io_id_sub,
			amt_add_typ,
			expns_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_ext,
			NEW.wg_cd,
			NEW.act_io_id,
			NEW.act_io_id_sub,
			NEW.amt_add_typ,
			NEW.expns_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_io_expns_amt_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_ext = NEW.itm_ext,
			wg_cd = NEW.wg_cd,
			act_io_id = NEW.act_io_id,
			act_io_id_sub = NEW.act_io_id_sub,
			amt_add_typ = NEW.amt_add_typ,
			expns_cd = NEW.expns_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_ext = OLD.itm_ext OR itm_ext IS NULL AND OLD.itm_ext IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (act_io_id = OLD.act_io_id OR act_io_id IS NULL AND OLD.act_io_id IS NULL)
		AND (act_io_id_sub = OLD.act_io_id_sub OR act_io_id_sub IS NULL AND OLD.act_io_id_sub IS NULL)
		AND (amt_add_typ = OLD.amt_add_typ OR amt_add_typ IS NULL AND OLD.amt_add_typ IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_io_expns_amt_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_ext = OLD.itm_ext OR itm_ext IS NULL AND OLD.itm_ext IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (act_io_id = OLD.act_io_id OR act_io_id IS NULL AND OLD.act_io_id IS NULL)
		AND (act_io_id_sub = OLD.act_io_id_sub OR act_io_id_sub IS NULL AND OLD.act_io_id_sub IS NULL)
		AND (amt_add_typ = OLD.amt_add_typ OR amt_add_typ IS NULL AND OLD.amt_add_typ IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_io_expns_amt_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_io_expns_amt_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_io_expns_amt_key$func();
;

