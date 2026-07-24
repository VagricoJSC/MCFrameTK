\encoding UTF-8

CREATE OR REPLACE FUNCTION mgw_imp_bom_ex()
RETURNS TABLE (
	bom_lvl numeric,
	wg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	bom_ptn varchar,
	oper_cd varchar,
	oper_seq numeric,
	ph_flg char,
	ph_bom_ptn varchar,
	alt_grp_cd varchar,
	par_inst_qty numeric,
	chd_rqmt_qty numeric,
	chd_inpt_qty numeric,
	fxd_chd_rqmt_qty numeric,
	byprod_flg char,
	alt_itm_ratio numeric,
	inpt_ctl_typ varchar,
	disp_seq numeric,
	not_cost_flg char,
	st_dt timestamp(0),
	end_dt timestamp(0),
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_imp_bom_ex$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_imp_bom_ex$temp(
				bom_lvl numeric (3,0) NOT NULL,
				wg_cd varchar (10) DEFAULT '*' NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				bom_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				ph_flg char (1) DEFAULT '0' NOT NULL,
				ph_bom_ptn varchar (40) NULL,
				alt_grp_cd varchar (40) NULL,
				par_inst_qty numeric (21,8) NULL,
				chd_rqmt_qty numeric (21,8) NULL,
				chd_inpt_qty numeric (21,8) NULL,
				fxd_chd_rqmt_qty numeric (21,8) NULL,
				byprod_flg char (1) DEFAULT '0' NOT NULL,
				alt_itm_ratio numeric (9,0) NULL,
				inpt_ctl_typ varchar (1) NULL,
				disp_seq numeric (9,0) NULL,
				not_cost_flg char (1) DEFAULT '0' NOT NULL,
				st_dt timestamp(0)  NULL,
				end_dt timestamp(0)  NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_imp_bom_ex_ie01 ON mgw_imp_bom_ex$temp
				USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,wg_cd);
			ALTER TABLE mgw_imp_bom_ex$temp
				ADD CONSTRAINT mgw_imp_bom_ex_ck01 CHECK (ph_flg IN ('0', '1'));
			ALTER TABLE mgw_imp_bom_ex$temp
				ADD CONSTRAINT mgw_imp_bom_ex_ck02 CHECK (byprod_flg IN ('0', '1'));
			ALTER TABLE mgw_imp_bom_ex$temp
				ADD CONSTRAINT mgw_imp_bom_ex_ck03 CHECK (not_cost_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_imp_bom_ex$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mgw_imp_bom_ex$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mgw_imp_bom_ex
AS
SELECT *
FROM mgw_imp_bom_ex();
ALTER VIEW mgw_imp_bom_ex ALTER COLUMN wg_cd SET DEFAULT '*';
ALTER VIEW mgw_imp_bom_ex ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW mgw_imp_bom_ex ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW mgw_imp_bom_ex ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW mgw_imp_bom_ex ALTER COLUMN ph_flg SET DEFAULT '0';
ALTER VIEW mgw_imp_bom_ex ALTER COLUMN byprod_flg SET DEFAULT '0';
ALTER VIEW mgw_imp_bom_ex ALTER COLUMN not_cost_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mgw_imp_bom_ex$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mgw_imp_bom_ex$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mgw_imp_bom_ex$temp(
				bom_lvl numeric (3,0) NOT NULL,
				wg_cd varchar (10) DEFAULT '*' NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				bom_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				ph_flg char (1) DEFAULT '0' NOT NULL,
				ph_bom_ptn varchar (40) NULL,
				alt_grp_cd varchar (40) NULL,
				par_inst_qty numeric (21,8) NULL,
				chd_rqmt_qty numeric (21,8) NULL,
				chd_inpt_qty numeric (21,8) NULL,
				fxd_chd_rqmt_qty numeric (21,8) NULL,
				byprod_flg char (1) DEFAULT '0' NOT NULL,
				alt_itm_ratio numeric (9,0) NULL,
				inpt_ctl_typ varchar (1) NULL,
				disp_seq numeric (9,0) NULL,
				not_cost_flg char (1) DEFAULT '0' NOT NULL,
				st_dt timestamp(0)  NULL,
				end_dt timestamp(0)  NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX mgw_imp_bom_ex_ie01 ON mgw_imp_bom_ex$temp
				USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,wg_cd);
			ALTER TABLE mgw_imp_bom_ex$temp
			ADD CONSTRAINT mgw_imp_bom_ex_ck01 CHECK (ph_flg IN ('0', '1'));
			ALTER TABLE mgw_imp_bom_ex$temp
			ADD CONSTRAINT mgw_imp_bom_ex_ck02 CHECK (byprod_flg IN ('0', '1'));
			ALTER TABLE mgw_imp_bom_ex$temp
			ADD CONSTRAINT mgw_imp_bom_ex_ck03 CHECK (not_cost_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mgw_imp_bom_ex$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mgw_imp_bom_ex$temp(
			bom_lvl,
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			ph_flg,
			ph_bom_ptn,
			alt_grp_cd,
			par_inst_qty,
			chd_rqmt_qty,
			chd_inpt_qty,
			fxd_chd_rqmt_qty,
			byprod_flg,
			alt_itm_ratio,
			inpt_ctl_typ,
			disp_seq,
			not_cost_flg,
			st_dt,
			end_dt,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3
		)VALUES (
			NEW.bom_lvl,
			NEW.wg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.bom_ptn,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.ph_flg,
			NEW.ph_bom_ptn,
			NEW.alt_grp_cd,
			NEW.par_inst_qty,
			NEW.chd_rqmt_qty,
			NEW.chd_inpt_qty,
			NEW.fxd_chd_rqmt_qty,
			NEW.byprod_flg,
			NEW.alt_itm_ratio,
			NEW.inpt_ctl_typ,
			NEW.disp_seq,
			NEW.not_cost_flg,
			NEW.st_dt,
			NEW.end_dt,
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mgw_imp_bom_ex$temp
		SET 
			bom_lvl = NEW.bom_lvl,
			wg_cd = NEW.wg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			bom_ptn = NEW.bom_ptn,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			ph_flg = NEW.ph_flg,
			ph_bom_ptn = NEW.ph_bom_ptn,
			alt_grp_cd = NEW.alt_grp_cd,
			par_inst_qty = NEW.par_inst_qty,
			chd_rqmt_qty = NEW.chd_rqmt_qty,
			chd_inpt_qty = NEW.chd_inpt_qty,
			fxd_chd_rqmt_qty = NEW.fxd_chd_rqmt_qty,
			byprod_flg = NEW.byprod_flg,
			alt_itm_ratio = NEW.alt_itm_ratio,
			inpt_ctl_typ = NEW.inpt_ctl_typ,
			disp_seq = NEW.disp_seq,
			not_cost_flg = NEW.not_cost_flg,
			st_dt = NEW.st_dt,
			end_dt = NEW.end_dt,
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3
		WHERE 0=0
		AND bom_lvl = OLD.bom_lvl
		AND wg_cd = OLD.wg_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND ph_flg = OLD.ph_flg
		AND (ph_bom_ptn = OLD.ph_bom_ptn OR ph_bom_ptn IS NULL AND OLD.ph_bom_ptn IS NULL)
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (par_inst_qty = OLD.par_inst_qty OR par_inst_qty IS NULL AND OLD.par_inst_qty IS NULL)
		AND (chd_rqmt_qty = OLD.chd_rqmt_qty OR chd_rqmt_qty IS NULL AND OLD.chd_rqmt_qty IS NULL)
		AND (chd_inpt_qty = OLD.chd_inpt_qty OR chd_inpt_qty IS NULL AND OLD.chd_inpt_qty IS NULL)
		AND (fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty OR fxd_chd_rqmt_qty IS NULL AND OLD.fxd_chd_rqmt_qty IS NULL)
		AND byprod_flg = OLD.byprod_flg
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (inpt_ctl_typ = OLD.inpt_ctl_typ OR inpt_ctl_typ IS NULL AND OLD.inpt_ctl_typ IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND not_cost_flg = OLD.not_cost_flg
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL)
		AND (end_dt = OLD.end_dt OR end_dt IS NULL AND OLD.end_dt IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mgw_imp_bom_ex$temp
		WHERE 0=0
		AND bom_lvl = OLD.bom_lvl
		AND wg_cd = OLD.wg_cd
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND ph_flg = OLD.ph_flg
		AND (ph_bom_ptn = OLD.ph_bom_ptn OR ph_bom_ptn IS NULL AND OLD.ph_bom_ptn IS NULL)
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (par_inst_qty = OLD.par_inst_qty OR par_inst_qty IS NULL AND OLD.par_inst_qty IS NULL)
		AND (chd_rqmt_qty = OLD.chd_rqmt_qty OR chd_rqmt_qty IS NULL AND OLD.chd_rqmt_qty IS NULL)
		AND (chd_inpt_qty = OLD.chd_inpt_qty OR chd_inpt_qty IS NULL AND OLD.chd_inpt_qty IS NULL)
		AND (fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty OR fxd_chd_rqmt_qty IS NULL AND OLD.fxd_chd_rqmt_qty IS NULL)
		AND byprod_flg = OLD.byprod_flg
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (inpt_ctl_typ = OLD.inpt_ctl_typ OR inpt_ctl_typ IS NULL AND OLD.inpt_ctl_typ IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND not_cost_flg = OLD.not_cost_flg
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL)
		AND (end_dt = OLD.end_dt OR end_dt IS NULL AND OLD.end_dt IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgw_imp_bom_ex$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mgw_imp_bom_ex
FOR EACH ROW
EXECUTE PROCEDURE mgw_imp_bom_ex$func();
;

