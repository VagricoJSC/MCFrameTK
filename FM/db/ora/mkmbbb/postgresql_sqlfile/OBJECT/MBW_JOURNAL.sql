\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_journal()
RETURNS TABLE (
	jnl_grp_no varchar,
	ac_ym timestamp(0),
	ac_if_typ varchar,
	slip_cnt_id varchar,
	jnl_no varchar,
	jnl_no_seq numeric,
	dc_typ varchar,
	ac_slip_dt timestamp(0),
	ac_dt timestamp(0),
	slip_no varchar,
	slip_seq_no numeric,
	dpt_cd varchar,
	ac_cd varchar,
	sub_ac_cd varchar,
	project_cd varchar,
	summary_cd0 varchar,
	summary_cd1 varchar,
	summary_cd2 varchar,
	summary_cd3 varchar,
	summary_cd4 varchar,
	summary_cd5 varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_nm varchar,
	bp_typ varchar,
	bp_cd varchar,
	base_unit_qty numeric,
	base_unit_cd varchar,
	base_cur_sum_amt numeric,
	base_cur_amt numeric,
	base_cur_tax_amt numeric,
	base_cur_cd varchar,
	trd_cur_sum_amt numeric,
	trd_cur_amt numeric,
	trd_cur_tax_amt numeric,
	trd_cur_cd varchar,
	ptax_cur_sum_amt numeric,
	ptax_cur_amt numeric,
	ptax_cur_tax_amt numeric,
	ptax_cur_cd varchar,
	tax_typ varchar,
	tax_cd varchar,
	foreign_flg char,
	xrate numeric,
	xrate_cd varchar,
	ptax_xrate numeric,
	ptax_xrate_cd varchar,
	iv_no varchar,
	bill_no varchar,
	slo_no varchar,
	po_no varchar,
	usr_cd varchar,
	cls_jnl_typ varchar,
	alloc_jnl_flg char,
	spot_flg char,
	sttl_schd_dt timestamp(0),
	sttl_cd varchar,
	bank_ac_cd varchar,
	other_ac_cd varchar,
	other_sub_ac_cd varchar,
	other_dpt_cd varchar,
	abstract1 varchar,
	abstract2 varchar,
	sub_char1 varchar,
	sub_char2 varchar,
	sub_char3 varchar,
	sub_char4 varchar,
	sub_char5 varchar,
	sub_char6 varchar,
	sub_char7 varchar,
	sub_char8 varchar,
	sub_char9 varchar,
	sub_char10 varchar,
	sub_num1 numeric,
	sub_num2 numeric,
	sub_num3 numeric,
	sub_dt1 timestamp(0),
	sub_dt2 timestamp(0),
	sub_dt3 timestamp(0),
	send_flg char,
	jnl_ptn_cd varchar,
	jnl_seq numeric,
	jnl_unit varchar,
	compound_jnl_typ varchar,
	base_cur_tax_base_amt numeric,
	trd_cur_tax_base_amt numeric,
	ptax_cur_tax_base_amt numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_journal$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_journal$temp(
				jnl_grp_no varchar (10) NOT NULL,
				ac_ym timestamp(0)  NOT NULL,
				ac_if_typ varchar (1) NOT NULL,
				slip_cnt_id varchar (3) NOT NULL,
				jnl_no varchar (20) NOT NULL,
				jnl_no_seq numeric (9,0) NOT NULL,
				dc_typ varchar (1) NOT NULL,
				ac_slip_dt timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				slip_no varchar (15) NULL,
				slip_seq_no numeric (4,0) NULL,
				dpt_cd varchar (20) NOT NULL,
				ac_cd varchar (10) NOT NULL,
				sub_ac_cd varchar (10) NULL,
				project_cd varchar (20) NULL,
				summary_cd0 varchar (20) NULL,
				summary_cd1 varchar (20) NULL,
				summary_cd2 varchar (20) NULL,
				summary_cd3 varchar (20) NULL,
				summary_cd4 varchar (20) NULL,
				summary_cd5 varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				itm_nm varchar (100) NULL,
				bp_typ varchar (1) NULL,
				bp_cd varchar (20) NULL,
				base_unit_qty numeric (21,8) NULL,
				base_unit_cd varchar (5) NULL,
				base_cur_sum_amt numeric (21,8) NOT NULL,
				base_cur_amt numeric (21,8) NOT NULL,
				base_cur_tax_amt numeric (21,8) NOT NULL,
				base_cur_cd varchar (3) NOT NULL,
				trd_cur_sum_amt numeric (21,8) NOT NULL,
				trd_cur_amt numeric (21,8) NOT NULL,
				trd_cur_tax_amt numeric (21,8) NOT NULL,
				trd_cur_cd varchar (3) NULL,
				ptax_cur_sum_amt numeric (21,8) NOT NULL,
				ptax_cur_amt numeric (21,8) NOT NULL,
				ptax_cur_tax_amt numeric (21,8) NOT NULL,
				ptax_cur_cd varchar (3) NULL,
				tax_typ varchar (1) NULL,
				tax_cd varchar (5) NULL,
				foreign_flg char (1) DEFAULT '0' NOT NULL,
				xrate numeric (21,8) NULL,
				xrate_cd varchar (2) NULL,
				ptax_xrate numeric (21,8) NULL,
				ptax_xrate_cd varchar (2) NULL,
				iv_no varchar (15) NULL,
				bill_no varchar (15) NULL,
				slo_no varchar (15) NULL,
				po_no varchar (15) NULL,
				usr_cd varchar (500) NULL,
				cls_jnl_typ varchar (1) NULL,
				alloc_jnl_flg char (1) DEFAULT '0' NOT NULL,
				spot_flg char (1) DEFAULT '0' NOT NULL,
				sttl_schd_dt timestamp(0)  NULL,
				sttl_cd varchar (10) NULL,
				bank_ac_cd varchar (40) NULL,
				other_ac_cd varchar (10) NULL,
				other_sub_ac_cd varchar (10) NULL,
				other_dpt_cd varchar (20) NULL,
				abstract1 varchar (100) NULL,
				abstract2 varchar (100) NULL,
				sub_char1 varchar (50) NULL,
				sub_char2 varchar (50) NULL,
				sub_char3 varchar (50) NULL,
				sub_char4 varchar (50) NULL,
				sub_char5 varchar (50) NULL,
				sub_char6 varchar (50) NULL,
				sub_char7 varchar (50) NULL,
				sub_char8 varchar (50) NULL,
				sub_char9 varchar (50) NULL,
				sub_char10 varchar (50) NULL,
				sub_num1 numeric (21,8) NULL,
				sub_num2 numeric (21,8) NULL,
				sub_num3 numeric (21,8) NULL,
				sub_dt1 timestamp(0)  NULL,
				sub_dt2 timestamp(0)  NULL,
				sub_dt3 timestamp(0)  NULL,
				send_flg char (1) DEFAULT '0' NOT NULL,
				jnl_ptn_cd varchar (20) NULL,
				jnl_seq numeric (4,0) NULL,
				jnl_unit varchar (80) NOT NULL,
				compound_jnl_typ varchar (1) NULL,
				base_cur_tax_base_amt numeric (21,8) DEFAULT 0 NOT NULL,
				trd_cur_tax_base_amt numeric (21,8) DEFAULT 0 NOT NULL,
				ptax_cur_tax_base_amt numeric (21,8) DEFAULT 0 NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mbw_journal$temp
			ADD CONSTRAINT mbw_journal_pk PRIMARY KEY(jnl_grp_no,ac_ym,ac_if_typ,slip_cnt_id,jnl_no,jnl_no_seq,dc_typ);
			
			ALTER TABLE mbw_journal$temp
				ADD CONSTRAINT mbw_journal_ck01 CHECK (foreign_flg IN ('0', '1'));
			ALTER TABLE mbw_journal$temp
				ADD CONSTRAINT mbw_journal_ck02 CHECK (alloc_jnl_flg IN ('0', '1'));
			ALTER TABLE mbw_journal$temp
				ADD CONSTRAINT mbw_journal_ck03 CHECK (spot_flg IN ('0', '1'));
			ALTER TABLE mbw_journal$temp
				ADD CONSTRAINT mbw_journal_ck04 CHECK (send_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_journal$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_journal$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_journal
AS
SELECT *
FROM mbw_journal();
ALTER VIEW mbw_journal ALTER COLUMN foreign_flg SET DEFAULT '0';
ALTER VIEW mbw_journal ALTER COLUMN alloc_jnl_flg SET DEFAULT '0';
ALTER VIEW mbw_journal ALTER COLUMN spot_flg SET DEFAULT '0';
ALTER VIEW mbw_journal ALTER COLUMN send_flg SET DEFAULT '0';
ALTER VIEW mbw_journal ALTER COLUMN base_cur_tax_base_amt SET DEFAULT 0;
ALTER VIEW mbw_journal ALTER COLUMN trd_cur_tax_base_amt SET DEFAULT 0;
ALTER VIEW mbw_journal ALTER COLUMN ptax_cur_tax_base_amt SET DEFAULT 0;

CREATE OR REPLACE FUNCTION mbw_journal$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_journal$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_journal$temp(
				jnl_grp_no varchar (10) NOT NULL,
				ac_ym timestamp(0)  NOT NULL,
				ac_if_typ varchar (1) NOT NULL,
				slip_cnt_id varchar (3) NOT NULL,
				jnl_no varchar (20) NOT NULL,
				jnl_no_seq numeric (9,0) NOT NULL,
				dc_typ varchar (1) NOT NULL,
				ac_slip_dt timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				slip_no varchar (15) NULL,
				slip_seq_no numeric (4,0) NULL,
				dpt_cd varchar (20) NOT NULL,
				ac_cd varchar (10) NOT NULL,
				sub_ac_cd varchar (10) NULL,
				project_cd varchar (20) NULL,
				summary_cd0 varchar (20) NULL,
				summary_cd1 varchar (20) NULL,
				summary_cd2 varchar (20) NULL,
				summary_cd3 varchar (20) NULL,
				summary_cd4 varchar (20) NULL,
				summary_cd5 varchar (20) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				itm_nm varchar (100) NULL,
				bp_typ varchar (1) NULL,
				bp_cd varchar (20) NULL,
				base_unit_qty numeric (21,8) NULL,
				base_unit_cd varchar (5) NULL,
				base_cur_sum_amt numeric (21,8) NOT NULL,
				base_cur_amt numeric (21,8) NOT NULL,
				base_cur_tax_amt numeric (21,8) NOT NULL,
				base_cur_cd varchar (3) NOT NULL,
				trd_cur_sum_amt numeric (21,8) NOT NULL,
				trd_cur_amt numeric (21,8) NOT NULL,
				trd_cur_tax_amt numeric (21,8) NOT NULL,
				trd_cur_cd varchar (3) NULL,
				ptax_cur_sum_amt numeric (21,8) NOT NULL,
				ptax_cur_amt numeric (21,8) NOT NULL,
				ptax_cur_tax_amt numeric (21,8) NOT NULL,
				ptax_cur_cd varchar (3) NULL,
				tax_typ varchar (1) NULL,
				tax_cd varchar (5) NULL,
				foreign_flg char (1) DEFAULT '0' NOT NULL,
				xrate numeric (21,8) NULL,
				xrate_cd varchar (2) NULL,
				ptax_xrate numeric (21,8) NULL,
				ptax_xrate_cd varchar (2) NULL,
				iv_no varchar (15) NULL,
				bill_no varchar (15) NULL,
				slo_no varchar (15) NULL,
				po_no varchar (15) NULL,
				usr_cd varchar (500) NULL,
				cls_jnl_typ varchar (1) NULL,
				alloc_jnl_flg char (1) DEFAULT '0' NOT NULL,
				spot_flg char (1) DEFAULT '0' NOT NULL,
				sttl_schd_dt timestamp(0)  NULL,
				sttl_cd varchar (10) NULL,
				bank_ac_cd varchar (40) NULL,
				other_ac_cd varchar (10) NULL,
				other_sub_ac_cd varchar (10) NULL,
				other_dpt_cd varchar (20) NULL,
				abstract1 varchar (100) NULL,
				abstract2 varchar (100) NULL,
				sub_char1 varchar (50) NULL,
				sub_char2 varchar (50) NULL,
				sub_char3 varchar (50) NULL,
				sub_char4 varchar (50) NULL,
				sub_char5 varchar (50) NULL,
				sub_char6 varchar (50) NULL,
				sub_char7 varchar (50) NULL,
				sub_char8 varchar (50) NULL,
				sub_char9 varchar (50) NULL,
				sub_char10 varchar (50) NULL,
				sub_num1 numeric (21,8) NULL,
				sub_num2 numeric (21,8) NULL,
				sub_num3 numeric (21,8) NULL,
				sub_dt1 timestamp(0)  NULL,
				sub_dt2 timestamp(0)  NULL,
				sub_dt3 timestamp(0)  NULL,
				send_flg char (1) DEFAULT '0' NOT NULL,
				jnl_ptn_cd varchar (20) NULL,
				jnl_seq numeric (4,0) NULL,
				jnl_unit varchar (80) NOT NULL,
				compound_jnl_typ varchar (1) NULL,
				base_cur_tax_base_amt numeric (21,8) DEFAULT 0 NOT NULL,
				trd_cur_tax_base_amt numeric (21,8) DEFAULT 0 NOT NULL,
				ptax_cur_tax_base_amt numeric (21,8) DEFAULT 0 NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mbw_journal$temp
			ADD CONSTRAINT mbw_journal_pk PRIMARY KEY(jnl_grp_no,ac_ym,ac_if_typ,slip_cnt_id,jnl_no,jnl_no_seq,dc_typ);
			
			ALTER TABLE mbw_journal$temp
			ADD CONSTRAINT mbw_journal_ck01 CHECK (foreign_flg IN ('0', '1'));
			ALTER TABLE mbw_journal$temp
			ADD CONSTRAINT mbw_journal_ck02 CHECK (alloc_jnl_flg IN ('0', '1'));
			ALTER TABLE mbw_journal$temp
			ADD CONSTRAINT mbw_journal_ck03 CHECK (spot_flg IN ('0', '1'));
			ALTER TABLE mbw_journal$temp
			ADD CONSTRAINT mbw_journal_ck04 CHECK (send_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_journal$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_journal$temp(
			jnl_grp_no,
			ac_ym,
			ac_if_typ,
			slip_cnt_id,
			jnl_no,
			jnl_no_seq,
			dc_typ,
			ac_slip_dt,
			ac_dt,
			slip_no,
			slip_seq_no,
			dpt_cd,
			ac_cd,
			sub_ac_cd,
			project_cd,
			summary_cd0,
			summary_cd1,
			summary_cd2,
			summary_cd3,
			summary_cd4,
			summary_cd5,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_nm,
			bp_typ,
			bp_cd,
			base_unit_qty,
			base_unit_cd,
			base_cur_sum_amt,
			base_cur_amt,
			base_cur_tax_amt,
			base_cur_cd,
			trd_cur_sum_amt,
			trd_cur_amt,
			trd_cur_tax_amt,
			trd_cur_cd,
			ptax_cur_sum_amt,
			ptax_cur_amt,
			ptax_cur_tax_amt,
			ptax_cur_cd,
			tax_typ,
			tax_cd,
			foreign_flg,
			xrate,
			xrate_cd,
			ptax_xrate,
			ptax_xrate_cd,
			iv_no,
			bill_no,
			slo_no,
			po_no,
			usr_cd,
			cls_jnl_typ,
			alloc_jnl_flg,
			spot_flg,
			sttl_schd_dt,
			sttl_cd,
			bank_ac_cd,
			other_ac_cd,
			other_sub_ac_cd,
			other_dpt_cd,
			abstract1,
			abstract2,
			sub_char1,
			sub_char2,
			sub_char3,
			sub_char4,
			sub_char5,
			sub_char6,
			sub_char7,
			sub_char8,
			sub_char9,
			sub_char10,
			sub_num1,
			sub_num2,
			sub_num3,
			sub_dt1,
			sub_dt2,
			sub_dt3,
			send_flg,
			jnl_ptn_cd,
			jnl_seq,
			jnl_unit,
			compound_jnl_typ,
			base_cur_tax_base_amt,
			trd_cur_tax_base_amt,
			ptax_cur_tax_base_amt
		)VALUES (
			NEW.jnl_grp_no,
			NEW.ac_ym,
			NEW.ac_if_typ,
			NEW.slip_cnt_id,
			NEW.jnl_no,
			NEW.jnl_no_seq,
			NEW.dc_typ,
			NEW.ac_slip_dt,
			NEW.ac_dt,
			NEW.slip_no,
			NEW.slip_seq_no,
			NEW.dpt_cd,
			NEW.ac_cd,
			NEW.sub_ac_cd,
			NEW.project_cd,
			NEW.summary_cd0,
			NEW.summary_cd1,
			NEW.summary_cd2,
			NEW.summary_cd3,
			NEW.summary_cd4,
			NEW.summary_cd5,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_nm,
			NEW.bp_typ,
			NEW.bp_cd,
			NEW.base_unit_qty,
			NEW.base_unit_cd,
			NEW.base_cur_sum_amt,
			NEW.base_cur_amt,
			NEW.base_cur_tax_amt,
			NEW.base_cur_cd,
			NEW.trd_cur_sum_amt,
			NEW.trd_cur_amt,
			NEW.trd_cur_tax_amt,
			NEW.trd_cur_cd,
			NEW.ptax_cur_sum_amt,
			NEW.ptax_cur_amt,
			NEW.ptax_cur_tax_amt,
			NEW.ptax_cur_cd,
			NEW.tax_typ,
			NEW.tax_cd,
			NEW.foreign_flg,
			NEW.xrate,
			NEW.xrate_cd,
			NEW.ptax_xrate,
			NEW.ptax_xrate_cd,
			NEW.iv_no,
			NEW.bill_no,
			NEW.slo_no,
			NEW.po_no,
			NEW.usr_cd,
			NEW.cls_jnl_typ,
			NEW.alloc_jnl_flg,
			NEW.spot_flg,
			NEW.sttl_schd_dt,
			NEW.sttl_cd,
			NEW.bank_ac_cd,
			NEW.other_ac_cd,
			NEW.other_sub_ac_cd,
			NEW.other_dpt_cd,
			NEW.abstract1,
			NEW.abstract2,
			NEW.sub_char1,
			NEW.sub_char2,
			NEW.sub_char3,
			NEW.sub_char4,
			NEW.sub_char5,
			NEW.sub_char6,
			NEW.sub_char7,
			NEW.sub_char8,
			NEW.sub_char9,
			NEW.sub_char10,
			NEW.sub_num1,
			NEW.sub_num2,
			NEW.sub_num3,
			NEW.sub_dt1,
			NEW.sub_dt2,
			NEW.sub_dt3,
			NEW.send_flg,
			NEW.jnl_ptn_cd,
			NEW.jnl_seq,
			NEW.jnl_unit,
			NEW.compound_jnl_typ,
			NEW.base_cur_tax_base_amt,
			NEW.trd_cur_tax_base_amt,
			NEW.ptax_cur_tax_base_amt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_journal$temp
		SET 
			jnl_grp_no = NEW.jnl_grp_no,
			ac_ym = NEW.ac_ym,
			ac_if_typ = NEW.ac_if_typ,
			slip_cnt_id = NEW.slip_cnt_id,
			jnl_no = NEW.jnl_no,
			jnl_no_seq = NEW.jnl_no_seq,
			dc_typ = NEW.dc_typ,
			ac_slip_dt = NEW.ac_slip_dt,
			ac_dt = NEW.ac_dt,
			slip_no = NEW.slip_no,
			slip_seq_no = NEW.slip_seq_no,
			dpt_cd = NEW.dpt_cd,
			ac_cd = NEW.ac_cd,
			sub_ac_cd = NEW.sub_ac_cd,
			project_cd = NEW.project_cd,
			summary_cd0 = NEW.summary_cd0,
			summary_cd1 = NEW.summary_cd1,
			summary_cd2 = NEW.summary_cd2,
			summary_cd3 = NEW.summary_cd3,
			summary_cd4 = NEW.summary_cd4,
			summary_cd5 = NEW.summary_cd5,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_nm = NEW.itm_nm,
			bp_typ = NEW.bp_typ,
			bp_cd = NEW.bp_cd,
			base_unit_qty = NEW.base_unit_qty,
			base_unit_cd = NEW.base_unit_cd,
			base_cur_sum_amt = NEW.base_cur_sum_amt,
			base_cur_amt = NEW.base_cur_amt,
			base_cur_tax_amt = NEW.base_cur_tax_amt,
			base_cur_cd = NEW.base_cur_cd,
			trd_cur_sum_amt = NEW.trd_cur_sum_amt,
			trd_cur_amt = NEW.trd_cur_amt,
			trd_cur_tax_amt = NEW.trd_cur_tax_amt,
			trd_cur_cd = NEW.trd_cur_cd,
			ptax_cur_sum_amt = NEW.ptax_cur_sum_amt,
			ptax_cur_amt = NEW.ptax_cur_amt,
			ptax_cur_tax_amt = NEW.ptax_cur_tax_amt,
			ptax_cur_cd = NEW.ptax_cur_cd,
			tax_typ = NEW.tax_typ,
			tax_cd = NEW.tax_cd,
			foreign_flg = NEW.foreign_flg,
			xrate = NEW.xrate,
			xrate_cd = NEW.xrate_cd,
			ptax_xrate = NEW.ptax_xrate,
			ptax_xrate_cd = NEW.ptax_xrate_cd,
			iv_no = NEW.iv_no,
			bill_no = NEW.bill_no,
			slo_no = NEW.slo_no,
			po_no = NEW.po_no,
			usr_cd = NEW.usr_cd,
			cls_jnl_typ = NEW.cls_jnl_typ,
			alloc_jnl_flg = NEW.alloc_jnl_flg,
			spot_flg = NEW.spot_flg,
			sttl_schd_dt = NEW.sttl_schd_dt,
			sttl_cd = NEW.sttl_cd,
			bank_ac_cd = NEW.bank_ac_cd,
			other_ac_cd = NEW.other_ac_cd,
			other_sub_ac_cd = NEW.other_sub_ac_cd,
			other_dpt_cd = NEW.other_dpt_cd,
			abstract1 = NEW.abstract1,
			abstract2 = NEW.abstract2,
			sub_char1 = NEW.sub_char1,
			sub_char2 = NEW.sub_char2,
			sub_char3 = NEW.sub_char3,
			sub_char4 = NEW.sub_char4,
			sub_char5 = NEW.sub_char5,
			sub_char6 = NEW.sub_char6,
			sub_char7 = NEW.sub_char7,
			sub_char8 = NEW.sub_char8,
			sub_char9 = NEW.sub_char9,
			sub_char10 = NEW.sub_char10,
			sub_num1 = NEW.sub_num1,
			sub_num2 = NEW.sub_num2,
			sub_num3 = NEW.sub_num3,
			sub_dt1 = NEW.sub_dt1,
			sub_dt2 = NEW.sub_dt2,
			sub_dt3 = NEW.sub_dt3,
			send_flg = NEW.send_flg,
			jnl_ptn_cd = NEW.jnl_ptn_cd,
			jnl_seq = NEW.jnl_seq,
			jnl_unit = NEW.jnl_unit,
			compound_jnl_typ = NEW.compound_jnl_typ,
			base_cur_tax_base_amt = NEW.base_cur_tax_base_amt,
			trd_cur_tax_base_amt = NEW.trd_cur_tax_base_amt,
			ptax_cur_tax_base_amt = NEW.ptax_cur_tax_base_amt
		WHERE 0=0
		AND jnl_grp_no = OLD.jnl_grp_no
		AND ac_ym = OLD.ac_ym
		AND ac_if_typ = OLD.ac_if_typ
		AND slip_cnt_id = OLD.slip_cnt_id
		AND jnl_no = OLD.jnl_no
		AND jnl_no_seq = OLD.jnl_no_seq
		AND dc_typ = OLD.dc_typ
		AND ac_slip_dt = OLD.ac_slip_dt
		AND ac_dt = OLD.ac_dt
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_seq_no = OLD.slip_seq_no OR slip_seq_no IS NULL AND OLD.slip_seq_no IS NULL)
		AND dpt_cd = OLD.dpt_cd
		AND ac_cd = OLD.ac_cd
		AND (sub_ac_cd = OLD.sub_ac_cd OR sub_ac_cd IS NULL AND OLD.sub_ac_cd IS NULL)
		AND (project_cd = OLD.project_cd OR project_cd IS NULL AND OLD.project_cd IS NULL)
		AND (summary_cd0 = OLD.summary_cd0 OR summary_cd0 IS NULL AND OLD.summary_cd0 IS NULL)
		AND (summary_cd1 = OLD.summary_cd1 OR summary_cd1 IS NULL AND OLD.summary_cd1 IS NULL)
		AND (summary_cd2 = OLD.summary_cd2 OR summary_cd2 IS NULL AND OLD.summary_cd2 IS NULL)
		AND (summary_cd3 = OLD.summary_cd3 OR summary_cd3 IS NULL AND OLD.summary_cd3 IS NULL)
		AND (summary_cd4 = OLD.summary_cd4 OR summary_cd4 IS NULL AND OLD.summary_cd4 IS NULL)
		AND (summary_cd5 = OLD.summary_cd5 OR summary_cd5 IS NULL AND OLD.summary_cd5 IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND (bp_typ = OLD.bp_typ OR bp_typ IS NULL AND OLD.bp_typ IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (base_unit_qty = OLD.base_unit_qty OR base_unit_qty IS NULL AND OLD.base_unit_qty IS NULL)
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL)
		AND base_cur_sum_amt = OLD.base_cur_sum_amt
		AND base_cur_amt = OLD.base_cur_amt
		AND base_cur_tax_amt = OLD.base_cur_tax_amt
		AND base_cur_cd = OLD.base_cur_cd
		AND trd_cur_sum_amt = OLD.trd_cur_sum_amt
		AND trd_cur_amt = OLD.trd_cur_amt
		AND trd_cur_tax_amt = OLD.trd_cur_tax_amt
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND ptax_cur_sum_amt = OLD.ptax_cur_sum_amt
		AND ptax_cur_amt = OLD.ptax_cur_amt
		AND ptax_cur_tax_amt = OLD.ptax_cur_tax_amt
		AND (ptax_cur_cd = OLD.ptax_cur_cd OR ptax_cur_cd IS NULL AND OLD.ptax_cur_cd IS NULL)
		AND (tax_typ = OLD.tax_typ OR tax_typ IS NULL AND OLD.tax_typ IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL)
		AND foreign_flg = OLD.foreign_flg
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (ptax_xrate = OLD.ptax_xrate OR ptax_xrate IS NULL AND OLD.ptax_xrate IS NULL)
		AND (ptax_xrate_cd = OLD.ptax_xrate_cd OR ptax_xrate_cd IS NULL AND OLD.ptax_xrate_cd IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (bill_no = OLD.bill_no OR bill_no IS NULL AND OLD.bill_no IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (cls_jnl_typ = OLD.cls_jnl_typ OR cls_jnl_typ IS NULL AND OLD.cls_jnl_typ IS NULL)
		AND alloc_jnl_flg = OLD.alloc_jnl_flg
		AND spot_flg = OLD.spot_flg
		AND (sttl_schd_dt = OLD.sttl_schd_dt OR sttl_schd_dt IS NULL AND OLD.sttl_schd_dt IS NULL)
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL)
		AND (bank_ac_cd = OLD.bank_ac_cd OR bank_ac_cd IS NULL AND OLD.bank_ac_cd IS NULL)
		AND (other_ac_cd = OLD.other_ac_cd OR other_ac_cd IS NULL AND OLD.other_ac_cd IS NULL)
		AND (other_sub_ac_cd = OLD.other_sub_ac_cd OR other_sub_ac_cd IS NULL AND OLD.other_sub_ac_cd IS NULL)
		AND (other_dpt_cd = OLD.other_dpt_cd OR other_dpt_cd IS NULL AND OLD.other_dpt_cd IS NULL)
		AND (abstract1 = OLD.abstract1 OR abstract1 IS NULL AND OLD.abstract1 IS NULL)
		AND (abstract2 = OLD.abstract2 OR abstract2 IS NULL AND OLD.abstract2 IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL)
		AND (sub_char4 = OLD.sub_char4 OR sub_char4 IS NULL AND OLD.sub_char4 IS NULL)
		AND (sub_char5 = OLD.sub_char5 OR sub_char5 IS NULL AND OLD.sub_char5 IS NULL)
		AND (sub_char6 = OLD.sub_char6 OR sub_char6 IS NULL AND OLD.sub_char6 IS NULL)
		AND (sub_char7 = OLD.sub_char7 OR sub_char7 IS NULL AND OLD.sub_char7 IS NULL)
		AND (sub_char8 = OLD.sub_char8 OR sub_char8 IS NULL AND OLD.sub_char8 IS NULL)
		AND (sub_char9 = OLD.sub_char9 OR sub_char9 IS NULL AND OLD.sub_char9 IS NULL)
		AND (sub_char10 = OLD.sub_char10 OR sub_char10 IS NULL AND OLD.sub_char10 IS NULL)
		AND (sub_num1 = OLD.sub_num1 OR sub_num1 IS NULL AND OLD.sub_num1 IS NULL)
		AND (sub_num2 = OLD.sub_num2 OR sub_num2 IS NULL AND OLD.sub_num2 IS NULL)
		AND (sub_num3 = OLD.sub_num3 OR sub_num3 IS NULL AND OLD.sub_num3 IS NULL)
		AND (sub_dt1 = OLD.sub_dt1 OR sub_dt1 IS NULL AND OLD.sub_dt1 IS NULL)
		AND (sub_dt2 = OLD.sub_dt2 OR sub_dt2 IS NULL AND OLD.sub_dt2 IS NULL)
		AND (sub_dt3 = OLD.sub_dt3 OR sub_dt3 IS NULL AND OLD.sub_dt3 IS NULL)
		AND send_flg = OLD.send_flg
		AND (jnl_ptn_cd = OLD.jnl_ptn_cd OR jnl_ptn_cd IS NULL AND OLD.jnl_ptn_cd IS NULL)
		AND (jnl_seq = OLD.jnl_seq OR jnl_seq IS NULL AND OLD.jnl_seq IS NULL)
		AND jnl_unit = OLD.jnl_unit
		AND (compound_jnl_typ = OLD.compound_jnl_typ OR compound_jnl_typ IS NULL AND OLD.compound_jnl_typ IS NULL)
		AND base_cur_tax_base_amt = OLD.base_cur_tax_base_amt
		AND trd_cur_tax_base_amt = OLD.trd_cur_tax_base_amt
		AND ptax_cur_tax_base_amt = OLD.ptax_cur_tax_base_amt;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_journal$temp
		WHERE 0=0
		AND jnl_grp_no = OLD.jnl_grp_no
		AND ac_ym = OLD.ac_ym
		AND ac_if_typ = OLD.ac_if_typ
		AND slip_cnt_id = OLD.slip_cnt_id
		AND jnl_no = OLD.jnl_no
		AND jnl_no_seq = OLD.jnl_no_seq
		AND dc_typ = OLD.dc_typ
		AND ac_slip_dt = OLD.ac_slip_dt
		AND ac_dt = OLD.ac_dt
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_seq_no = OLD.slip_seq_no OR slip_seq_no IS NULL AND OLD.slip_seq_no IS NULL)
		AND dpt_cd = OLD.dpt_cd
		AND ac_cd = OLD.ac_cd
		AND (sub_ac_cd = OLD.sub_ac_cd OR sub_ac_cd IS NULL AND OLD.sub_ac_cd IS NULL)
		AND (project_cd = OLD.project_cd OR project_cd IS NULL AND OLD.project_cd IS NULL)
		AND (summary_cd0 = OLD.summary_cd0 OR summary_cd0 IS NULL AND OLD.summary_cd0 IS NULL)
		AND (summary_cd1 = OLD.summary_cd1 OR summary_cd1 IS NULL AND OLD.summary_cd1 IS NULL)
		AND (summary_cd2 = OLD.summary_cd2 OR summary_cd2 IS NULL AND OLD.summary_cd2 IS NULL)
		AND (summary_cd3 = OLD.summary_cd3 OR summary_cd3 IS NULL AND OLD.summary_cd3 IS NULL)
		AND (summary_cd4 = OLD.summary_cd4 OR summary_cd4 IS NULL AND OLD.summary_cd4 IS NULL)
		AND (summary_cd5 = OLD.summary_cd5 OR summary_cd5 IS NULL AND OLD.summary_cd5 IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND (bp_typ = OLD.bp_typ OR bp_typ IS NULL AND OLD.bp_typ IS NULL)
		AND (bp_cd = OLD.bp_cd OR bp_cd IS NULL AND OLD.bp_cd IS NULL)
		AND (base_unit_qty = OLD.base_unit_qty OR base_unit_qty IS NULL AND OLD.base_unit_qty IS NULL)
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL)
		AND base_cur_sum_amt = OLD.base_cur_sum_amt
		AND base_cur_amt = OLD.base_cur_amt
		AND base_cur_tax_amt = OLD.base_cur_tax_amt
		AND base_cur_cd = OLD.base_cur_cd
		AND trd_cur_sum_amt = OLD.trd_cur_sum_amt
		AND trd_cur_amt = OLD.trd_cur_amt
		AND trd_cur_tax_amt = OLD.trd_cur_tax_amt
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND ptax_cur_sum_amt = OLD.ptax_cur_sum_amt
		AND ptax_cur_amt = OLD.ptax_cur_amt
		AND ptax_cur_tax_amt = OLD.ptax_cur_tax_amt
		AND (ptax_cur_cd = OLD.ptax_cur_cd OR ptax_cur_cd IS NULL AND OLD.ptax_cur_cd IS NULL)
		AND (tax_typ = OLD.tax_typ OR tax_typ IS NULL AND OLD.tax_typ IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL)
		AND foreign_flg = OLD.foreign_flg
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (ptax_xrate = OLD.ptax_xrate OR ptax_xrate IS NULL AND OLD.ptax_xrate IS NULL)
		AND (ptax_xrate_cd = OLD.ptax_xrate_cd OR ptax_xrate_cd IS NULL AND OLD.ptax_xrate_cd IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (bill_no = OLD.bill_no OR bill_no IS NULL AND OLD.bill_no IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (cls_jnl_typ = OLD.cls_jnl_typ OR cls_jnl_typ IS NULL AND OLD.cls_jnl_typ IS NULL)
		AND alloc_jnl_flg = OLD.alloc_jnl_flg
		AND spot_flg = OLD.spot_flg
		AND (sttl_schd_dt = OLD.sttl_schd_dt OR sttl_schd_dt IS NULL AND OLD.sttl_schd_dt IS NULL)
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL)
		AND (bank_ac_cd = OLD.bank_ac_cd OR bank_ac_cd IS NULL AND OLD.bank_ac_cd IS NULL)
		AND (other_ac_cd = OLD.other_ac_cd OR other_ac_cd IS NULL AND OLD.other_ac_cd IS NULL)
		AND (other_sub_ac_cd = OLD.other_sub_ac_cd OR other_sub_ac_cd IS NULL AND OLD.other_sub_ac_cd IS NULL)
		AND (other_dpt_cd = OLD.other_dpt_cd OR other_dpt_cd IS NULL AND OLD.other_dpt_cd IS NULL)
		AND (abstract1 = OLD.abstract1 OR abstract1 IS NULL AND OLD.abstract1 IS NULL)
		AND (abstract2 = OLD.abstract2 OR abstract2 IS NULL AND OLD.abstract2 IS NULL)
		AND (sub_char1 = OLD.sub_char1 OR sub_char1 IS NULL AND OLD.sub_char1 IS NULL)
		AND (sub_char2 = OLD.sub_char2 OR sub_char2 IS NULL AND OLD.sub_char2 IS NULL)
		AND (sub_char3 = OLD.sub_char3 OR sub_char3 IS NULL AND OLD.sub_char3 IS NULL)
		AND (sub_char4 = OLD.sub_char4 OR sub_char4 IS NULL AND OLD.sub_char4 IS NULL)
		AND (sub_char5 = OLD.sub_char5 OR sub_char5 IS NULL AND OLD.sub_char5 IS NULL)
		AND (sub_char6 = OLD.sub_char6 OR sub_char6 IS NULL AND OLD.sub_char6 IS NULL)
		AND (sub_char7 = OLD.sub_char7 OR sub_char7 IS NULL AND OLD.sub_char7 IS NULL)
		AND (sub_char8 = OLD.sub_char8 OR sub_char8 IS NULL AND OLD.sub_char8 IS NULL)
		AND (sub_char9 = OLD.sub_char9 OR sub_char9 IS NULL AND OLD.sub_char9 IS NULL)
		AND (sub_char10 = OLD.sub_char10 OR sub_char10 IS NULL AND OLD.sub_char10 IS NULL)
		AND (sub_num1 = OLD.sub_num1 OR sub_num1 IS NULL AND OLD.sub_num1 IS NULL)
		AND (sub_num2 = OLD.sub_num2 OR sub_num2 IS NULL AND OLD.sub_num2 IS NULL)
		AND (sub_num3 = OLD.sub_num3 OR sub_num3 IS NULL AND OLD.sub_num3 IS NULL)
		AND (sub_dt1 = OLD.sub_dt1 OR sub_dt1 IS NULL AND OLD.sub_dt1 IS NULL)
		AND (sub_dt2 = OLD.sub_dt2 OR sub_dt2 IS NULL AND OLD.sub_dt2 IS NULL)
		AND (sub_dt3 = OLD.sub_dt3 OR sub_dt3 IS NULL AND OLD.sub_dt3 IS NULL)
		AND send_flg = OLD.send_flg
		AND (jnl_ptn_cd = OLD.jnl_ptn_cd OR jnl_ptn_cd IS NULL AND OLD.jnl_ptn_cd IS NULL)
		AND (jnl_seq = OLD.jnl_seq OR jnl_seq IS NULL AND OLD.jnl_seq IS NULL)
		AND jnl_unit = OLD.jnl_unit
		AND (compound_jnl_typ = OLD.compound_jnl_typ OR compound_jnl_typ IS NULL AND OLD.compound_jnl_typ IS NULL)
		AND base_cur_tax_base_amt = OLD.base_cur_tax_base_amt
		AND trd_cur_tax_base_amt = OLD.trd_cur_tax_base_amt
		AND ptax_cur_tax_base_amt = OLD.ptax_cur_tax_base_amt;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_journal$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_journal
FOR EACH ROW
EXECUTE PROCEDURE mbw_journal$func();
;

