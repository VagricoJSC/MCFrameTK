\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_bom_ex()
RETURNS TABLE (
	sort_no varchar,
	bom_lvl numeric,
	bottom_flg char,
	loop_flg char,
	wg_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	ver_no varchar,
	bom_ptn varchar,
	oper_cd varchar,
	oper_seq numeric,
	ph_flg char,
	ph_bom_ptn varchar,
	alt_itm_flg char,
	alt_grp_cd varchar,
	alt_itm_typ varchar,
	alt_itm_ratio numeric,
	alt_alloc_prio numeric,
	sno_typ1 varchar,
	sno_typ2 varchar,
	sno_typ3 varchar,
	sno_typ4 varchar,
	min_sno1 varchar,
	max_sno1 varchar,
	min_sno2 varchar,
	max_sno2 varchar,
	min_sno3 varchar,
	max_sno3 varchar,
	min_sno4 varchar,
	max_sno4 varchar,
	par_inst_qty numeric,
	chd_inpt_qty numeric,
	chd_rqmt_qty numeric,
	fxd_chd_rqmt_qty numeric,
	byprod_flg char,
	in_offst_typ varchar,
	in_offst numeric,
	bkf_typ varchar,
	inst_lot_fix_flg char,
	lot_mix_flg char,
	sublot_mix_flg char,
	alloc_ctl_typ varchar,
	main_itm_flg char,
	yield_calc_flg char,
	inpt_ctl_typ varchar,
	disp_seq numeric,
	chng_no varchar,
	ext_sys_no_bom varchar,
	not_cost_flg char,
	st_dt timestamp(0),
	end_dt timestamp(0),
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	par_sort_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bom_ex$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bom_ex$temp(
				sort_no varchar (3000) NOT NULL,
				bom_lvl numeric (3,0) NOT NULL,
				bottom_flg char (1) DEFAULT '0' NOT NULL,
				loop_flg char (1) DEFAULT '0' NOT NULL,
				wg_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				bom_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				ph_flg char (1) DEFAULT '0' NOT NULL,
				ph_bom_ptn varchar (40) NULL,
				alt_itm_flg char (1) DEFAULT '0' NOT NULL,
				alt_grp_cd varchar (40) NULL,
				alt_itm_typ varchar (1) NULL,
				alt_itm_ratio numeric (9,0) NULL,
				alt_alloc_prio numeric (9,0) NULL,
				sno_typ1 varchar (1) NULL,
				sno_typ2 varchar (1) NULL,
				sno_typ3 varchar (1) NULL,
				sno_typ4 varchar (1) NULL,
				min_sno1 varchar (20) NULL,
				max_sno1 varchar (20) NULL,
				min_sno2 varchar (15) NULL,
				max_sno2 varchar (15) NULL,
				min_sno3 varchar (15) NULL,
				max_sno3 varchar (15) NULL,
				min_sno4 varchar (15) NULL,
				max_sno4 varchar (15) NULL,
				par_inst_qty numeric (21,8) NULL,
				chd_inpt_qty numeric (21,8) NULL,
				chd_rqmt_qty numeric (21,8) NULL,
				fxd_chd_rqmt_qty numeric (21,8) NULL,
				byprod_flg char (1) DEFAULT '0' NOT NULL,
				in_offst_typ varchar (1) NULL,
				in_offst numeric (9,0) NULL,
				bkf_typ varchar (1) NULL,
				inst_lot_fix_flg char (1) DEFAULT '0' NOT NULL,
				lot_mix_flg char (1) DEFAULT '0' NOT NULL,
				sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
				alloc_ctl_typ varchar (1) NULL,
				main_itm_flg char (1) DEFAULT '0' NOT NULL,
				yield_calc_flg char (1) DEFAULT '0' NOT NULL,
				inpt_ctl_typ varchar (1) NULL,
				disp_seq numeric (9,0) NULL,
				chng_no varchar (20) NULL,
				ext_sys_no_bom varchar (20) NULL,
				not_cost_flg char (1) DEFAULT '0' NOT NULL,
				st_dt timestamp(0)  NULL,
				end_dt timestamp(0)  NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_sort_no varchar (3000) NULL,
				sno1 varchar (20) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bom_ex_ie01 ON maw_bom_ex$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3);
			CREATE INDEX maw_bom_ex_ie02 ON maw_bom_ex$temp
				USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3);
			CREATE INDEX maw_bom_ex_ie03 ON maw_bom_ex$temp
				USING BTREE (sort_no);
			CREATE INDEX maw_bom_ex_ie04 ON maw_bom_ex$temp
				USING BTREE (bom_lvl);
			CREATE INDEX maw_bom_ex_ie05 ON maw_bom_ex$temp
				USING BTREE (par_sort_no);
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck01 CHECK (bottom_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck02 CHECK (loop_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck03 CHECK (ph_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck04 CHECK (alt_itm_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck05 CHECK (byprod_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck06 CHECK (inst_lot_fix_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck07 CHECK (lot_mix_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck08 CHECK (sublot_mix_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck09 CHECK (main_itm_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck10 CHECK (yield_calc_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
				ADD CONSTRAINT maw_bom_ex_ck11 CHECK (not_cost_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bom_ex$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_bom_ex$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_bom_ex
AS
SELECT *
FROM maw_bom_ex();
ALTER VIEW maw_bom_ex ALTER COLUMN bottom_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN loop_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN ph_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN alt_itm_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN byprod_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN inst_lot_fix_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN lot_mix_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN sublot_mix_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN main_itm_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN yield_calc_flg SET DEFAULT '0';
ALTER VIEW maw_bom_ex ALTER COLUMN not_cost_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION maw_bom_ex$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_bom_ex$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_bom_ex$temp(
				sort_no varchar (3000) NOT NULL,
				bom_lvl numeric (3,0) NOT NULL,
				bottom_flg char (1) DEFAULT '0' NOT NULL,
				loop_flg char (1) DEFAULT '0' NOT NULL,
				wg_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				ver_no varchar (10) NULL,
				bom_ptn varchar (40) NULL,
				oper_cd varchar (10) NULL,
				oper_seq numeric (9,0) NULL,
				ph_flg char (1) DEFAULT '0' NOT NULL,
				ph_bom_ptn varchar (40) NULL,
				alt_itm_flg char (1) DEFAULT '0' NOT NULL,
				alt_grp_cd varchar (40) NULL,
				alt_itm_typ varchar (1) NULL,
				alt_itm_ratio numeric (9,0) NULL,
				alt_alloc_prio numeric (9,0) NULL,
				sno_typ1 varchar (1) NULL,
				sno_typ2 varchar (1) NULL,
				sno_typ3 varchar (1) NULL,
				sno_typ4 varchar (1) NULL,
				min_sno1 varchar (20) NULL,
				max_sno1 varchar (20) NULL,
				min_sno2 varchar (15) NULL,
				max_sno2 varchar (15) NULL,
				min_sno3 varchar (15) NULL,
				max_sno3 varchar (15) NULL,
				min_sno4 varchar (15) NULL,
				max_sno4 varchar (15) NULL,
				par_inst_qty numeric (21,8) NULL,
				chd_inpt_qty numeric (21,8) NULL,
				chd_rqmt_qty numeric (21,8) NULL,
				fxd_chd_rqmt_qty numeric (21,8) NULL,
				byprod_flg char (1) DEFAULT '0' NOT NULL,
				in_offst_typ varchar (1) NULL,
				in_offst numeric (9,0) NULL,
				bkf_typ varchar (1) NULL,
				inst_lot_fix_flg char (1) DEFAULT '0' NOT NULL,
				lot_mix_flg char (1) DEFAULT '0' NOT NULL,
				sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
				alloc_ctl_typ varchar (1) NULL,
				main_itm_flg char (1) DEFAULT '0' NOT NULL,
				yield_calc_flg char (1) DEFAULT '0' NOT NULL,
				inpt_ctl_typ varchar (1) NULL,
				disp_seq numeric (9,0) NULL,
				chng_no varchar (20) NULL,
				ext_sys_no_bom varchar (20) NULL,
				not_cost_flg char (1) DEFAULT '0' NOT NULL,
				st_dt timestamp(0)  NULL,
				end_dt timestamp(0)  NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_sort_no varchar (3000) NULL,
				sno1 varchar (20) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_bom_ex_ie01 ON maw_bom_ex$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3);
			CREATE INDEX maw_bom_ex_ie02 ON maw_bom_ex$temp
				USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3);
			CREATE INDEX maw_bom_ex_ie03 ON maw_bom_ex$temp
				USING BTREE (sort_no);
			CREATE INDEX maw_bom_ex_ie04 ON maw_bom_ex$temp
				USING BTREE (bom_lvl);
			CREATE INDEX maw_bom_ex_ie05 ON maw_bom_ex$temp
				USING BTREE (par_sort_no);
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck01 CHECK (bottom_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck02 CHECK (loop_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck03 CHECK (ph_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck04 CHECK (alt_itm_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck05 CHECK (byprod_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck06 CHECK (inst_lot_fix_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck07 CHECK (lot_mix_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck08 CHECK (sublot_mix_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck09 CHECK (main_itm_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck10 CHECK (yield_calc_flg IN ('0', '1'));
			ALTER TABLE maw_bom_ex$temp
			ADD CONSTRAINT maw_bom_ex_ck11 CHECK (not_cost_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_bom_ex$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_bom_ex$temp(
			sort_no,
			bom_lvl,
			bottom_flg,
			loop_flg,
			wg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			ver_no,
			bom_ptn,
			oper_cd,
			oper_seq,
			ph_flg,
			ph_bom_ptn,
			alt_itm_flg,
			alt_grp_cd,
			alt_itm_typ,
			alt_itm_ratio,
			alt_alloc_prio,
			sno_typ1,
			sno_typ2,
			sno_typ3,
			sno_typ4,
			min_sno1,
			max_sno1,
			min_sno2,
			max_sno2,
			min_sno3,
			max_sno3,
			min_sno4,
			max_sno4,
			par_inst_qty,
			chd_inpt_qty,
			chd_rqmt_qty,
			fxd_chd_rqmt_qty,
			byprod_flg,
			in_offst_typ,
			in_offst,
			bkf_typ,
			inst_lot_fix_flg,
			lot_mix_flg,
			sublot_mix_flg,
			alloc_ctl_typ,
			main_itm_flg,
			yield_calc_flg,
			inpt_ctl_typ,
			disp_seq,
			chng_no,
			ext_sys_no_bom,
			not_cost_flg,
			st_dt,
			end_dt,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_sort_no,
			sno1,
			sno2,
			sno3,
			sno4
		)VALUES (
			NEW.sort_no,
			NEW.bom_lvl,
			NEW.bottom_flg,
			NEW.loop_flg,
			NEW.wg_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.ver_no,
			NEW.bom_ptn,
			NEW.oper_cd,
			NEW.oper_seq,
			NEW.ph_flg,
			NEW.ph_bom_ptn,
			NEW.alt_itm_flg,
			NEW.alt_grp_cd,
			NEW.alt_itm_typ,
			NEW.alt_itm_ratio,
			NEW.alt_alloc_prio,
			NEW.sno_typ1,
			NEW.sno_typ2,
			NEW.sno_typ3,
			NEW.sno_typ4,
			NEW.min_sno1,
			NEW.max_sno1,
			NEW.min_sno2,
			NEW.max_sno2,
			NEW.min_sno3,
			NEW.max_sno3,
			NEW.min_sno4,
			NEW.max_sno4,
			NEW.par_inst_qty,
			NEW.chd_inpt_qty,
			NEW.chd_rqmt_qty,
			NEW.fxd_chd_rqmt_qty,
			NEW.byprod_flg,
			NEW.in_offst_typ,
			NEW.in_offst,
			NEW.bkf_typ,
			NEW.inst_lot_fix_flg,
			NEW.lot_mix_flg,
			NEW.sublot_mix_flg,
			NEW.alloc_ctl_typ,
			NEW.main_itm_flg,
			NEW.yield_calc_flg,
			NEW.inpt_ctl_typ,
			NEW.disp_seq,
			NEW.chng_no,
			NEW.ext_sys_no_bom,
			NEW.not_cost_flg,
			NEW.st_dt,
			NEW.end_dt,
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.par_sort_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_bom_ex$temp
		SET 
			sort_no = NEW.sort_no,
			bom_lvl = NEW.bom_lvl,
			bottom_flg = NEW.bottom_flg,
			loop_flg = NEW.loop_flg,
			wg_cd = NEW.wg_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			ver_no = NEW.ver_no,
			bom_ptn = NEW.bom_ptn,
			oper_cd = NEW.oper_cd,
			oper_seq = NEW.oper_seq,
			ph_flg = NEW.ph_flg,
			ph_bom_ptn = NEW.ph_bom_ptn,
			alt_itm_flg = NEW.alt_itm_flg,
			alt_grp_cd = NEW.alt_grp_cd,
			alt_itm_typ = NEW.alt_itm_typ,
			alt_itm_ratio = NEW.alt_itm_ratio,
			alt_alloc_prio = NEW.alt_alloc_prio,
			sno_typ1 = NEW.sno_typ1,
			sno_typ2 = NEW.sno_typ2,
			sno_typ3 = NEW.sno_typ3,
			sno_typ4 = NEW.sno_typ4,
			min_sno1 = NEW.min_sno1,
			max_sno1 = NEW.max_sno1,
			min_sno2 = NEW.min_sno2,
			max_sno2 = NEW.max_sno2,
			min_sno3 = NEW.min_sno3,
			max_sno3 = NEW.max_sno3,
			min_sno4 = NEW.min_sno4,
			max_sno4 = NEW.max_sno4,
			par_inst_qty = NEW.par_inst_qty,
			chd_inpt_qty = NEW.chd_inpt_qty,
			chd_rqmt_qty = NEW.chd_rqmt_qty,
			fxd_chd_rqmt_qty = NEW.fxd_chd_rqmt_qty,
			byprod_flg = NEW.byprod_flg,
			in_offst_typ = NEW.in_offst_typ,
			in_offst = NEW.in_offst,
			bkf_typ = NEW.bkf_typ,
			inst_lot_fix_flg = NEW.inst_lot_fix_flg,
			lot_mix_flg = NEW.lot_mix_flg,
			sublot_mix_flg = NEW.sublot_mix_flg,
			alloc_ctl_typ = NEW.alloc_ctl_typ,
			main_itm_flg = NEW.main_itm_flg,
			yield_calc_flg = NEW.yield_calc_flg,
			inpt_ctl_typ = NEW.inpt_ctl_typ,
			disp_seq = NEW.disp_seq,
			chng_no = NEW.chng_no,
			ext_sys_no_bom = NEW.ext_sys_no_bom,
			not_cost_flg = NEW.not_cost_flg,
			st_dt = NEW.st_dt,
			end_dt = NEW.end_dt,
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			par_sort_no = NEW.par_sort_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4
		WHERE 0=0
		AND sort_no = OLD.sort_no
		AND bom_lvl = OLD.bom_lvl
		AND bottom_flg = OLD.bottom_flg
		AND loop_flg = OLD.loop_flg
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND ph_flg = OLD.ph_flg
		AND (ph_bom_ptn = OLD.ph_bom_ptn OR ph_bom_ptn IS NULL AND OLD.ph_bom_ptn IS NULL)
		AND alt_itm_flg = OLD.alt_itm_flg
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (alt_itm_typ = OLD.alt_itm_typ OR alt_itm_typ IS NULL AND OLD.alt_itm_typ IS NULL)
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (alt_alloc_prio = OLD.alt_alloc_prio OR alt_alloc_prio IS NULL AND OLD.alt_alloc_prio IS NULL)
		AND (sno_typ1 = OLD.sno_typ1 OR sno_typ1 IS NULL AND OLD.sno_typ1 IS NULL)
		AND (sno_typ2 = OLD.sno_typ2 OR sno_typ2 IS NULL AND OLD.sno_typ2 IS NULL)
		AND (sno_typ3 = OLD.sno_typ3 OR sno_typ3 IS NULL AND OLD.sno_typ3 IS NULL)
		AND (sno_typ4 = OLD.sno_typ4 OR sno_typ4 IS NULL AND OLD.sno_typ4 IS NULL)
		AND (min_sno1 = OLD.min_sno1 OR min_sno1 IS NULL AND OLD.min_sno1 IS NULL)
		AND (max_sno1 = OLD.max_sno1 OR max_sno1 IS NULL AND OLD.max_sno1 IS NULL)
		AND (min_sno2 = OLD.min_sno2 OR min_sno2 IS NULL AND OLD.min_sno2 IS NULL)
		AND (max_sno2 = OLD.max_sno2 OR max_sno2 IS NULL AND OLD.max_sno2 IS NULL)
		AND (min_sno3 = OLD.min_sno3 OR min_sno3 IS NULL AND OLD.min_sno3 IS NULL)
		AND (max_sno3 = OLD.max_sno3 OR max_sno3 IS NULL AND OLD.max_sno3 IS NULL)
		AND (min_sno4 = OLD.min_sno4 OR min_sno4 IS NULL AND OLD.min_sno4 IS NULL)
		AND (max_sno4 = OLD.max_sno4 OR max_sno4 IS NULL AND OLD.max_sno4 IS NULL)
		AND (par_inst_qty = OLD.par_inst_qty OR par_inst_qty IS NULL AND OLD.par_inst_qty IS NULL)
		AND (chd_inpt_qty = OLD.chd_inpt_qty OR chd_inpt_qty IS NULL AND OLD.chd_inpt_qty IS NULL)
		AND (chd_rqmt_qty = OLD.chd_rqmt_qty OR chd_rqmt_qty IS NULL AND OLD.chd_rqmt_qty IS NULL)
		AND (fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty OR fxd_chd_rqmt_qty IS NULL AND OLD.fxd_chd_rqmt_qty IS NULL)
		AND byprod_flg = OLD.byprod_flg
		AND (in_offst_typ = OLD.in_offst_typ OR in_offst_typ IS NULL AND OLD.in_offst_typ IS NULL)
		AND (in_offst = OLD.in_offst OR in_offst IS NULL AND OLD.in_offst IS NULL)
		AND (bkf_typ = OLD.bkf_typ OR bkf_typ IS NULL AND OLD.bkf_typ IS NULL)
		AND inst_lot_fix_flg = OLD.inst_lot_fix_flg
		AND lot_mix_flg = OLD.lot_mix_flg
		AND sublot_mix_flg = OLD.sublot_mix_flg
		AND (alloc_ctl_typ = OLD.alloc_ctl_typ OR alloc_ctl_typ IS NULL AND OLD.alloc_ctl_typ IS NULL)
		AND main_itm_flg = OLD.main_itm_flg
		AND yield_calc_flg = OLD.yield_calc_flg
		AND (inpt_ctl_typ = OLD.inpt_ctl_typ OR inpt_ctl_typ IS NULL AND OLD.inpt_ctl_typ IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (chng_no = OLD.chng_no OR chng_no IS NULL AND OLD.chng_no IS NULL)
		AND (ext_sys_no_bom = OLD.ext_sys_no_bom OR ext_sys_no_bom IS NULL AND OLD.ext_sys_no_bom IS NULL)
		AND not_cost_flg = OLD.not_cost_flg
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL)
		AND (end_dt = OLD.end_dt OR end_dt IS NULL AND OLD.end_dt IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_sort_no = OLD.par_sort_no OR par_sort_no IS NULL AND OLD.par_sort_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_bom_ex$temp
		WHERE 0=0
		AND sort_no = OLD.sort_no
		AND bom_lvl = OLD.bom_lvl
		AND bottom_flg = OLD.bottom_flg
		AND loop_flg = OLD.loop_flg
		AND (wg_cd = OLD.wg_cd OR wg_cd IS NULL AND OLD.wg_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (ver_no = OLD.ver_no OR ver_no IS NULL AND OLD.ver_no IS NULL)
		AND (bom_ptn = OLD.bom_ptn OR bom_ptn IS NULL AND OLD.bom_ptn IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (oper_seq = OLD.oper_seq OR oper_seq IS NULL AND OLD.oper_seq IS NULL)
		AND ph_flg = OLD.ph_flg
		AND (ph_bom_ptn = OLD.ph_bom_ptn OR ph_bom_ptn IS NULL AND OLD.ph_bom_ptn IS NULL)
		AND alt_itm_flg = OLD.alt_itm_flg
		AND (alt_grp_cd = OLD.alt_grp_cd OR alt_grp_cd IS NULL AND OLD.alt_grp_cd IS NULL)
		AND (alt_itm_typ = OLD.alt_itm_typ OR alt_itm_typ IS NULL AND OLD.alt_itm_typ IS NULL)
		AND (alt_itm_ratio = OLD.alt_itm_ratio OR alt_itm_ratio IS NULL AND OLD.alt_itm_ratio IS NULL)
		AND (alt_alloc_prio = OLD.alt_alloc_prio OR alt_alloc_prio IS NULL AND OLD.alt_alloc_prio IS NULL)
		AND (sno_typ1 = OLD.sno_typ1 OR sno_typ1 IS NULL AND OLD.sno_typ1 IS NULL)
		AND (sno_typ2 = OLD.sno_typ2 OR sno_typ2 IS NULL AND OLD.sno_typ2 IS NULL)
		AND (sno_typ3 = OLD.sno_typ3 OR sno_typ3 IS NULL AND OLD.sno_typ3 IS NULL)
		AND (sno_typ4 = OLD.sno_typ4 OR sno_typ4 IS NULL AND OLD.sno_typ4 IS NULL)
		AND (min_sno1 = OLD.min_sno1 OR min_sno1 IS NULL AND OLD.min_sno1 IS NULL)
		AND (max_sno1 = OLD.max_sno1 OR max_sno1 IS NULL AND OLD.max_sno1 IS NULL)
		AND (min_sno2 = OLD.min_sno2 OR min_sno2 IS NULL AND OLD.min_sno2 IS NULL)
		AND (max_sno2 = OLD.max_sno2 OR max_sno2 IS NULL AND OLD.max_sno2 IS NULL)
		AND (min_sno3 = OLD.min_sno3 OR min_sno3 IS NULL AND OLD.min_sno3 IS NULL)
		AND (max_sno3 = OLD.max_sno3 OR max_sno3 IS NULL AND OLD.max_sno3 IS NULL)
		AND (min_sno4 = OLD.min_sno4 OR min_sno4 IS NULL AND OLD.min_sno4 IS NULL)
		AND (max_sno4 = OLD.max_sno4 OR max_sno4 IS NULL AND OLD.max_sno4 IS NULL)
		AND (par_inst_qty = OLD.par_inst_qty OR par_inst_qty IS NULL AND OLD.par_inst_qty IS NULL)
		AND (chd_inpt_qty = OLD.chd_inpt_qty OR chd_inpt_qty IS NULL AND OLD.chd_inpt_qty IS NULL)
		AND (chd_rqmt_qty = OLD.chd_rqmt_qty OR chd_rqmt_qty IS NULL AND OLD.chd_rqmt_qty IS NULL)
		AND (fxd_chd_rqmt_qty = OLD.fxd_chd_rqmt_qty OR fxd_chd_rqmt_qty IS NULL AND OLD.fxd_chd_rqmt_qty IS NULL)
		AND byprod_flg = OLD.byprod_flg
		AND (in_offst_typ = OLD.in_offst_typ OR in_offst_typ IS NULL AND OLD.in_offst_typ IS NULL)
		AND (in_offst = OLD.in_offst OR in_offst IS NULL AND OLD.in_offst IS NULL)
		AND (bkf_typ = OLD.bkf_typ OR bkf_typ IS NULL AND OLD.bkf_typ IS NULL)
		AND inst_lot_fix_flg = OLD.inst_lot_fix_flg
		AND lot_mix_flg = OLD.lot_mix_flg
		AND sublot_mix_flg = OLD.sublot_mix_flg
		AND (alloc_ctl_typ = OLD.alloc_ctl_typ OR alloc_ctl_typ IS NULL AND OLD.alloc_ctl_typ IS NULL)
		AND main_itm_flg = OLD.main_itm_flg
		AND yield_calc_flg = OLD.yield_calc_flg
		AND (inpt_ctl_typ = OLD.inpt_ctl_typ OR inpt_ctl_typ IS NULL AND OLD.inpt_ctl_typ IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (chng_no = OLD.chng_no OR chng_no IS NULL AND OLD.chng_no IS NULL)
		AND (ext_sys_no_bom = OLD.ext_sys_no_bom OR ext_sys_no_bom IS NULL AND OLD.ext_sys_no_bom IS NULL)
		AND not_cost_flg = OLD.not_cost_flg
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL)
		AND (end_dt = OLD.end_dt OR end_dt IS NULL AND OLD.end_dt IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_sort_no = OLD.par_sort_no OR par_sort_no IS NULL AND OLD.par_sort_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_bom_ex$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_bom_ex
FOR EACH ROW
EXECUTE PROCEDURE maw_bom_ex$func();
;

