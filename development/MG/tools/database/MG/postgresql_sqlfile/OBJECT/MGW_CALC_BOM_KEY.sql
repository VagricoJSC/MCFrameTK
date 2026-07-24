\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_calc_bom_key()
RETURNS TABLE (
	calc_no varchar,
	calc_grp_cd varchar,
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	bom_ptn varchar,
	oper_cd varchar,
	oper_seq numeric,
	chd_itm_cd varchar,
	chd_itm_sub1 varchar,
	chd_itm_sub2 varchar,
	chd_itm_sub3 varchar,
	alt_grp_cd varchar,
	expns_cd varchar,
	wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_bom_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_bom_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NULL,
				bom_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
				alt_grp_cd varchar (40) NULL,
				expns_cd varchar (20) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_bom_key_pk_ie ON mgw_calc_bom_key$temp
				USING BTREE (calc_no,calc_grp_cd,par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,oper_cd,oper_seq,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,alt_grp_cd,expns_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_bom_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_calc_bom_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_calc_bom_key
AS
SELECT *
FROM mgw_calc_bom_key();
ALTER VIEW mgw_calc_bom_key ALTER COLUMN par_itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_calc_bom_key ALTER COLUMN par_itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_calc_bom_key ALTER COLUMN par_itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_calc_bom_key ALTER COLUMN chd_itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_calc_bom_key ALTER COLUMN chd_itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_calc_bom_key ALTER COLUMN chd_itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_calc_bom_key ALTER COLUMN wg_cd SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_calc_bom_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_calc_bom_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_calc_bom_key$temp(
				calc_no varchar (15) NULL,
				calc_grp_cd varchar (10) NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NULL,
				bom_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				chd_itm_cd varchar (40) NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
				alt_grp_cd varchar (40) NULL,
				expns_cd varchar (20) NULL,
				wg_cd varchar (10) DEFAULT '*' NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_calc_bom_key_pk_ie ON mgw_calc_bom_key$temp
				USING BTREE (calc_no,calc_grp_cd,par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,oper_cd,oper_seq,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,alt_grp_cd,expns_cd,wg_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_calc_bom_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_calc_bom_key$temp(
			calc_no,
			calc_grp_cd,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			alt_grp_cd,
			expns_cd,
			wg_cd
		)VALUES (
			NEW.calc_no,
			NEW.calc_grp_cd,
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.bom_ptn,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.chd_itm_cd,
			NEW.chd_itm_sub1,
			NEW.chd_itm_sub2,
			NEW.chd_itm_sub3,
			NEW.alt_grp_cd,
			NEW.expns_cd,
			NEW.wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_calc_bom_key$temp
		SET 
			calc_no = NEW.calc_no,
			calc_grp_cd = NEW.calc_grp_cd,
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			bom_ptn = NEW.bom_ptn,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			chd_itm_cd = NEW.chd_itm_cd,
			chd_itm_sub1 = NEW.chd_itm_sub1,
			chd_itm_sub2 = NEW.chd_itm_sub2,
			chd_itm_sub3 = NEW.chd_itm_sub3,
			alt_grp_cd = NEW.alt_grp_cd,
			expns_cd = NEW.expns_cd,
			wg_cd = NEW.wg_cd
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_calc_bom_key$temp
		WHERE 0=0
		AND (calc_no = OLD.calc_no OR calc_no IS NULL AND OLD.calc_no IS NULL)
		AND (calc_grp_cd = OLD.calc_grp_cd OR calc_grp_cd IS NULL AND OLD.calc_grp_cd IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND (chd_itm_cd = OLD.chd_itm_cd OR chd_itm_cd IS NULL AND OLD.chd_itm_cd IS NULL)
		AND (chd_itm_sub1 = OLD.chd_itm_sub1 OR chd_itm_sub1 IS NULL AND OLD.chd_itm_sub1 IS NULL)
		AND (chd_itm_sub2 = OLD.chd_itm_sub2 OR chd_itm_sub2 IS NULL AND OLD.chd_itm_sub2 IS NULL)
		AND (chd_itm_sub3 = OLD.chd_itm_sub3 OR chd_itm_sub3 IS NULL AND OLD.chd_itm_sub3 IS NULL)
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_calc_bom_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_calc_bom_key
FOR EACH ROW
EXECUTE PROCEDURE mgw_calc_bom_key$func();
;

