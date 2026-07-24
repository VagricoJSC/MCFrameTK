\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_bom_ex_bom_tmp2()
RETURNS TABLE (
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
	wg_cd varchar,
	bom_wg_cd varchar,
	disp_seq numeric,
	par_rqmt_qty numeric,
	chd_rqmt_qty numeric,
	chd_base_qty numeric,
	fxd_chd_rqmt_qty numeric,
	chd_min_qty numeric,
	chd_batch_qty numeric,
	alt_itm_ratio numeric,
	calc_ctg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_bom_tmp2$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_bom_tmp2$temp(
				par_itm_cd varchar (40) NOT NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				bom_ptn varchar (40) NOT NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				chd_itm_cd varchar (40) NOT NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				alt_grp_cd varchar (40) NULL,
				expns_cd varchar (20) NULL,
				wg_cd varchar (10) NOT NULL,
				bom_wg_cd varchar (10) NULL,
				disp_seq numeric (9,0) NOT NULL,
				par_rqmt_qty numeric (21,8) NOT NULL,
				chd_rqmt_qty numeric (21,8) NOT NULL,
				chd_base_qty numeric (21,8) NOT NULL,
				fxd_chd_rqmt_qty numeric (21,8) NOT NULL,
				chd_min_qty numeric (21,8) NOT NULL,
				chd_batch_qty numeric (21,8) NOT NULL,
				alt_itm_ratio numeric (9,0) NULL,
				calc_ctg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_bom_tmp2$temp
			ADD CONSTRAINT mgw_bom_ex_bom_tmp2_pk UNIQUE(par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,oper_cd,oper_seq,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,alt_grp_cd,expns_cd,wg_cd,bom_wg_cd);
			CREATE UNIQUE INDEX MGW_BOM_EX_BOM_TMP2_pk_ie ON mgw_bom_ex_bom_tmp2$temp (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,COALESCE(oper_cd,''),COALESCE(oper_seq,0),chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,COALESCE(alt_grp_cd,''),COALESCE(expns_cd,''),wg_cd,COALESCE(bom_wg_cd,''));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_bom_tmp2$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_bom_ex_bom_tmp2$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_bom_ex_bom_tmp2
AS
SELECT *
FROM mgw_bom_ex_bom_tmp2();
ALTER VIEW mgw_bom_ex_bom_tmp2 ALTER COLUMN par_itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_bom_tmp2 ALTER COLUMN par_itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_bom_tmp2 ALTER COLUMN par_itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_bom_tmp2 ALTER COLUMN chd_itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_bom_tmp2 ALTER COLUMN chd_itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_bom_ex_bom_tmp2 ALTER COLUMN chd_itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION mgw_bom_ex_bom_tmp2$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_bom_ex_bom_tmp2$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_bom_ex_bom_tmp2$temp(
				par_itm_cd varchar (40) NOT NULL,
				par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				bom_ptn varchar (40) NOT NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				chd_itm_cd varchar (40) NOT NULL,
				chd_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				chd_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				chd_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				alt_grp_cd varchar (40) NULL,
				expns_cd varchar (20) NULL,
				wg_cd varchar (10) NOT NULL,
				bom_wg_cd varchar (10) NULL,
				disp_seq numeric (9,0) NOT NULL,
				par_rqmt_qty numeric (21,8) NOT NULL,
				chd_rqmt_qty numeric (21,8) NOT NULL,
				chd_base_qty numeric (21,8) NOT NULL,
				fxd_chd_rqmt_qty numeric (21,8) NOT NULL,
				chd_min_qty numeric (21,8) NOT NULL,
				chd_batch_qty numeric (21,8) NOT NULL,
				alt_itm_ratio numeric (9,0) NULL,
				calc_ctg_cd varchar (10) NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mgw_bom_ex_bom_tmp2$temp
			ADD CONSTRAINT mgw_bom_ex_bom_tmp2_pk UNIQUE(par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,oper_cd,oper_seq,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,alt_grp_cd,expns_cd,wg_cd,bom_wg_cd);
			CREATE UNIQUE INDEX MGW_BOM_EX_BOM_TMP2_pk_ie ON mgw_bom_ex_bom_tmp2$temp (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,COALESCE(oper_cd,''),COALESCE(oper_seq,0),chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,COALESCE(alt_grp_cd,''),COALESCE(expns_cd,''),wg_cd,COALESCE(bom_wg_cd,''));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_bom_ex_bom_tmp2$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_bom_ex_bom_tmp2$temp(
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
			wg_cd,
			bom_wg_cd,
			disp_seq,
			par_rqmt_qty,
			chd_rqmt_qty,
			chd_base_qty,
			fxd_chd_rqmt_qty,
			chd_min_qty,
			chd_batch_qty,
			alt_itm_ratio,
			calc_ctg_cd
		)VALUES (
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
			NEW.wg_cd,
			NEW.bom_wg_cd,
			NEW.disp_seq,
			NEW.par_rqmt_qty,
			NEW.chd_rqmt_qty,
			NEW.chd_base_qty,
			NEW.fxd_chd_rqmt_qty,
			NEW.chd_min_qty,
			NEW.chd_batch_qty,
			NEW.alt_itm_ratio,
			NEW.calc_ctg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_bom_ex_bom_tmp2$temp
		SET 
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
			wg_cd = NEW.wg_cd,
			bom_wg_cd = NEW.bom_wg_cd,
			disp_seq = NEW.disp_seq,
			par_rqmt_qty = NEW.par_rqmt_qty,
			chd_rqmt_qty = NEW.chd_rqmt_qty,
			chd_base_qty = NEW.chd_base_qty,
			fxd_chd_rqmt_qty = NEW.fxd_chd_rqmt_qty,
			chd_min_qty = NEW.chd_min_qty,
			chd_batch_qty = NEW.chd_batch_qty,
			alt_itm_ratio = NEW.alt_itm_ratio,
			calc_ctg_cd = NEW.calc_ctg_cd
		WHERE 0=0
		AND par_itm_cd = OLD.par_itm_cd
		AND par_itm_sub1 = OLD.par_itm_sub1
		AND par_itm_sub2 = OLD.par_itm_sub2
		AND par_itm_sub3 = OLD.par_itm_sub3
		AND bom_ptn = OLD.bom_ptn
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND chd_itm_cd = OLD.chd_itm_cd
		AND chd_itm_sub1 = OLD.chd_itm_sub1
		AND chd_itm_sub2 = OLD.chd_itm_sub2
		AND chd_itm_sub3 = OLD.chd_itm_sub3
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND wg_cd = OLD.wg_cd
		AND (bom_wg_cd = OLD.bom_wg_cd OR bom_wg_cd IS NULL AND OLD.bom_wg_cd IS NULL)
		AND disp_seq = OLD.disp_seq
		AND par_rqmt_qty = OLD.par_rqmt_qty
		AND chd_rqmt_qty = OLD.chd_rqmt_qty
		AND chd_base_qty = OLD.chd_base_qty
		AND fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty
		AND chd_min_qty = OLD.chd_min_qty
		AND chd_batch_qty = OLD.chd_batch_qty
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND calc_ctg_cd = OLD.calc_ctg_cd;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_bom_ex_bom_tmp2$temp
		WHERE 0=0
		AND par_itm_cd = OLD.par_itm_cd
		AND par_itm_sub1 = OLD.par_itm_sub1
		AND par_itm_sub2 = OLD.par_itm_sub2
		AND par_itm_sub3 = OLD.par_itm_sub3
		AND bom_ptn = OLD.bom_ptn
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND chd_itm_cd = OLD.chd_itm_cd
		AND chd_itm_sub1 = OLD.chd_itm_sub1
		AND chd_itm_sub2 = OLD.chd_itm_sub2
		AND chd_itm_sub3 = OLD.chd_itm_sub3
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (expns_cd = OLD.expns_cd OR expns_cd IS NULL AND OLD.expns_cd IS NULL)
		AND wg_cd = OLD.wg_cd
		AND (bom_wg_cd = OLD.bom_wg_cd OR bom_wg_cd IS NULL AND OLD.bom_wg_cd IS NULL)
		AND disp_seq = OLD.disp_seq
		AND par_rqmt_qty = OLD.par_rqmt_qty
		AND chd_rqmt_qty = OLD.chd_rqmt_qty
		AND chd_base_qty = OLD.chd_base_qty
		AND fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty
		AND chd_min_qty = OLD.chd_min_qty
		AND chd_batch_qty = OLD.chd_batch_qty
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND calc_ctg_cd = OLD.calc_ctg_cd;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_bom_ex_bom_tmp2$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_bom_ex_bom_tmp2
FOR EACH ROW
EXECUTE PROCEDURE mgw_bom_ex_bom_tmp2$func();
;

