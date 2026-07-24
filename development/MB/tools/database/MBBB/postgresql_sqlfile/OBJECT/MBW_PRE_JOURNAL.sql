\encoding UTF-8

CREATE OR REPLACE FUNCTION mbw_pre_journal()
RETURNS TABLE (
	jnl_grp_no varchar,
	ac_ym timestamp(0),
	pre_jnl_seq numeric,
	jnl_unit varchar,
	wg_cd varchar,
	ac_slip_dt timestamp(0),
	ac_dt timestamp(0),
	slip_no varchar,
	slip_seq_no numeric,
	ac_slip_typ varchar,
	ac_rsn_cd varchar,
	itm_jnl_cd varchar,
	can_flg char,
	purc_dpt_cd varchar,
	ap_dpt_cd varchar,
	sls_dpt_cd varchar,
	ar_dpt_cd varchar,
	gi_dpt_cd varchar,
	gr_dpt_cd varchar,
	bd_dpt_cd varchar,
	rcv_dpt_cd varchar,
	so_dpt_cd varchar,
	sub_dpt_cd1 varchar,
	sub_dpt_cd2 varchar,
	sub_dpt_cd3 varchar,
	usr_cd varchar,
	purc_typ varchar,
	un_fix_flg char,
	temp_ap_flg char,
	foreign_flg char,
	asst_typ varchar,
	ac_itm_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_nm varchar,
	base_unit_qty numeric,
	base_unit_cd varchar,
	trd_unit_qty numeric,
	trd_unit_cd varchar,
	base_cur_cd varchar,
	base_cur_amt numeric,
	base_cur_tax_amt numeric,
	trd_cur_cd varchar,
	trd_cur_amt numeric,
	trd_cur_tax_amt numeric,
	ptax_cur_cd varchar,
	ptax_cur_amt numeric,
	ptax_cur_tax_amt numeric,
	tax_cd varchar,
	xrate_cd varchar,
	xrate numeric,
	ptax_xrate_cd varchar,
	ptax_xrate numeric,
	repurc_obli_flg char,
	trd_cur_proc_amt numeric,
	trd_cur_onr_prov_amt numeric,
	base_cur_proc_amt numeric,
	base_cur_onr_prov_amt numeric,
	ptax_cur_proc_amt numeric,
	ptax_cur_onr_prov_amt numeric,
	iv_no varchar,
	wrk_no varchar,
	bill_no varchar,
	acst_cd varchar,
	cst_cd varchar,
	asppl_cd varchar,
	sppl_cd varchar,
	inv_com_cd varchar,
	rcst_cd varchar,
	setoff_cd varchar,
	quality_typ varchar,
	spot_flg char,
	sttl_schd_dt timestamp(0),
	sttl_cd varchar,
	cst_itm_cd varchar,
	cst_itm_nm varchar,
	sppl_itm_cd varchar,
	sppl_itm_nm varchar,
	slo_no varchar,
	po_no varchar,
	bank_ac_cd varchar,
	xfr_psn varchar,
	project_cd varchar,
	summary_cd0 varchar,
	summary_cd1 varchar,
	summary_cd2 varchar,
	summary_cd3 varchar,
	summary_cd4 varchar,
	summary_cd5 varchar,
	trd_itm_cd varchar,
	trd_itm_sub1 varchar,
	trd_itm_sub2 varchar,
	trd_itm_sub3 varchar,
	trd_itm_nm varchar,
	trd_project_cd varchar,
	trd_summary_cd0 varchar,
	trd_summary_cd1 varchar,
	trd_summary_cd2 varchar,
	trd_summary_cd3 varchar,
	trd_summary_cd4 varchar,
	trd_summary_cd5 varchar,
	trd_rmrks varchar,
	trd_d_rmrks varchar,
	jnl_key1 varchar,
	jnl_key2 varchar,
	jnl_key3 varchar,
	jnl_key4 varchar,
	jnl_key5 varchar,
	jnl_key6 varchar,
	jnl_key7 varchar,
	jnl_key8 varchar,
	jnl_key9 varchar,
	jnl_key10 varchar,
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
	tmp_num numeric,
	auto_jnl_key_cd varchar,
	setoff_nm varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_pre_journal$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_pre_journal$temp(
				jnl_grp_no varchar (10) NOT NULL,
				ac_ym timestamp(0)  NOT NULL,
				pre_jnl_seq numeric (9,0) NOT NULL,
				jnl_unit varchar (80) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ac_slip_dt timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				slip_no varchar (15) NULL,
				slip_seq_no numeric (4,0) NULL,
				ac_slip_typ varchar (5) NOT NULL,
				ac_rsn_cd varchar (10) NULL,
				itm_jnl_cd varchar (5) NULL,
				can_flg char (1) DEFAULT '0' NOT NULL,
				purc_dpt_cd varchar (20) NULL,
				ap_dpt_cd varchar (20) NULL,
				sls_dpt_cd varchar (20) NULL,
				ar_dpt_cd varchar (20) NULL,
				gi_dpt_cd varchar (20) NULL,
				gr_dpt_cd varchar (20) NULL,
				bd_dpt_cd varchar (20) NULL,
				rcv_dpt_cd varchar (20) NULL,
				so_dpt_cd varchar (20) NULL,
				sub_dpt_cd1 varchar (20) NULL,
				sub_dpt_cd2 varchar (20) NULL,
				sub_dpt_cd3 varchar (20) NULL,
				usr_cd varchar (500) NULL,
				purc_typ varchar (1) NULL,
				un_fix_flg char (1) DEFAULT '0' NOT NULL,
				temp_ap_flg char (1) DEFAULT '0' NOT NULL,
				foreign_flg char (1) DEFAULT '0' NOT NULL,
				asst_typ varchar (1) NULL,
				ac_itm_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				itm_nm varchar (100) NULL,
				base_unit_qty numeric (21,8) NULL,
				base_unit_cd varchar (5) NULL,
				trd_unit_qty numeric (21,8) NULL,
				trd_unit_cd varchar (5) NULL,
				base_cur_cd varchar (3) NULL,
				base_cur_amt numeric (21,8) NULL,
				base_cur_tax_amt numeric (21,8) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_amt numeric (21,8) NULL,
				trd_cur_tax_amt numeric (21,8) NULL,
				ptax_cur_cd varchar (3) NULL,
				ptax_cur_amt numeric (21,8) NULL,
				ptax_cur_tax_amt numeric (21,8) NULL,
				tax_cd varchar (5) NULL,
				xrate_cd varchar (2) NULL,
				xrate numeric (21,8) NULL,
				ptax_xrate_cd varchar (2) NULL,
				ptax_xrate numeric (21,8) NULL,
				repurc_obli_flg char (1) DEFAULT '0' NOT NULL,
				trd_cur_proc_amt numeric (21,8) NULL,
				trd_cur_onr_prov_amt numeric (21,8) NULL,
				base_cur_proc_amt numeric (21,8) NULL,
				base_cur_onr_prov_amt numeric (21,8) NULL,
				ptax_cur_proc_amt numeric (21,8) NULL,
				ptax_cur_onr_prov_amt numeric (21,8) NULL,
				iv_no varchar (15) NULL,
				wrk_no varchar (15) NULL,
				bill_no varchar (15) NULL,
				acst_cd varchar (20) NULL,
				cst_cd varchar (20) NULL,
				asppl_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				inv_com_cd varchar (20) NULL,
				rcst_cd varchar (20) NULL,
				setoff_cd varchar (20) NULL,
				quality_typ varchar (1) NULL,
				spot_flg char (1) DEFAULT '0' NOT NULL,
				sttl_schd_dt timestamp(0)  NULL,
				sttl_cd varchar (10) NULL,
				cst_itm_cd varchar (40) NULL,
				cst_itm_nm varchar (100) NULL,
				sppl_itm_cd varchar (40) NULL,
				sppl_itm_nm varchar (100) NULL,
				slo_no varchar (15) NULL,
				po_no varchar (15) NULL,
				bank_ac_cd varchar (40) NULL,
				xfr_psn varchar (100) NULL,
				project_cd varchar (20) NULL,
				summary_cd0 varchar (20) NULL,
				summary_cd1 varchar (20) NULL,
				summary_cd2 varchar (20) NULL,
				summary_cd3 varchar (20) NULL,
				summary_cd4 varchar (20) NULL,
				summary_cd5 varchar (20) NULL,
				trd_itm_cd varchar (40) NULL,
				trd_itm_sub1 varchar (5) NULL,
				trd_itm_sub2 varchar (5) NULL,
				trd_itm_sub3 varchar (5) NULL,
				trd_itm_nm varchar (100) NULL,
				trd_project_cd varchar (20) NULL,
				trd_summary_cd0 varchar (20) NULL,
				trd_summary_cd1 varchar (20) NULL,
				trd_summary_cd2 varchar (20) NULL,
				trd_summary_cd3 varchar (20) NULL,
				trd_summary_cd4 varchar (20) NULL,
				trd_summary_cd5 varchar (20) NULL,
				trd_rmrks varchar (100) NULL,
				trd_d_rmrks varchar (100) NULL,
				jnl_key1 varchar (20) NULL,
				jnl_key2 varchar (20) NULL,
				jnl_key3 varchar (20) NULL,
				jnl_key4 varchar (20) NULL,
				jnl_key5 varchar (20) NULL,
				jnl_key6 varchar (20) NULL,
				jnl_key7 varchar (20) NULL,
				jnl_key8 varchar (20) NULL,
				jnl_key9 varchar (20) NULL,
				jnl_key10 varchar (20) NULL,
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
				tmp_num numeric (21,8) NULL,
				auto_jnl_key_cd varchar (5) NULL,
				setoff_nm varchar (100) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mbw_pre_journal$temp
			ADD CONSTRAINT mbw_pre_journal_pk PRIMARY KEY(jnl_grp_no,ac_ym,pre_jnl_seq);
			
			ALTER TABLE mbw_pre_journal$temp
				ADD CONSTRAINT mbw_pre_journal_ck01 CHECK (can_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
				ADD CONSTRAINT mbw_pre_journal_ck02 CHECK (un_fix_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
				ADD CONSTRAINT mbw_pre_journal_ck03 CHECK (temp_ap_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
				ADD CONSTRAINT mbw_pre_journal_ck04 CHECK (foreign_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
				ADD CONSTRAINT mbw_pre_journal_ck05 CHECK (repurc_obli_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
				ADD CONSTRAINT mbw_pre_journal_ck06 CHECK (spot_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_pre_journal$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM mbw_pre_journal$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW mbw_pre_journal
AS
SELECT *
FROM mbw_pre_journal();
ALTER VIEW mbw_pre_journal ALTER COLUMN can_flg SET DEFAULT '0';
ALTER VIEW mbw_pre_journal ALTER COLUMN un_fix_flg SET DEFAULT '0';
ALTER VIEW mbw_pre_journal ALTER COLUMN temp_ap_flg SET DEFAULT '0';
ALTER VIEW mbw_pre_journal ALTER COLUMN foreign_flg SET DEFAULT '0';
ALTER VIEW mbw_pre_journal ALTER COLUMN repurc_obli_flg SET DEFAULT '0';
ALTER VIEW mbw_pre_journal ALTER COLUMN spot_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION mbw_pre_journal$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('mbw_pre_journal$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE mbw_pre_journal$temp(
				jnl_grp_no varchar (10) NOT NULL,
				ac_ym timestamp(0)  NOT NULL,
				pre_jnl_seq numeric (9,0) NOT NULL,
				jnl_unit varchar (80) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				ac_slip_dt timestamp(0)  NOT NULL,
				ac_dt timestamp(0)  NOT NULL,
				slip_no varchar (15) NULL,
				slip_seq_no numeric (4,0) NULL,
				ac_slip_typ varchar (5) NOT NULL,
				ac_rsn_cd varchar (10) NULL,
				itm_jnl_cd varchar (5) NULL,
				can_flg char (1) DEFAULT '0' NOT NULL,
				purc_dpt_cd varchar (20) NULL,
				ap_dpt_cd varchar (20) NULL,
				sls_dpt_cd varchar (20) NULL,
				ar_dpt_cd varchar (20) NULL,
				gi_dpt_cd varchar (20) NULL,
				gr_dpt_cd varchar (20) NULL,
				bd_dpt_cd varchar (20) NULL,
				rcv_dpt_cd varchar (20) NULL,
				so_dpt_cd varchar (20) NULL,
				sub_dpt_cd1 varchar (20) NULL,
				sub_dpt_cd2 varchar (20) NULL,
				sub_dpt_cd3 varchar (20) NULL,
				usr_cd varchar (500) NULL,
				purc_typ varchar (1) NULL,
				un_fix_flg char (1) DEFAULT '0' NOT NULL,
				temp_ap_flg char (1) DEFAULT '0' NOT NULL,
				foreign_flg char (1) DEFAULT '0' NOT NULL,
				asst_typ varchar (1) NULL,
				ac_itm_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				itm_nm varchar (100) NULL,
				base_unit_qty numeric (21,8) NULL,
				base_unit_cd varchar (5) NULL,
				trd_unit_qty numeric (21,8) NULL,
				trd_unit_cd varchar (5) NULL,
				base_cur_cd varchar (3) NULL,
				base_cur_amt numeric (21,8) NULL,
				base_cur_tax_amt numeric (21,8) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_amt numeric (21,8) NULL,
				trd_cur_tax_amt numeric (21,8) NULL,
				ptax_cur_cd varchar (3) NULL,
				ptax_cur_amt numeric (21,8) NULL,
				ptax_cur_tax_amt numeric (21,8) NULL,
				tax_cd varchar (5) NULL,
				xrate_cd varchar (2) NULL,
				xrate numeric (21,8) NULL,
				ptax_xrate_cd varchar (2) NULL,
				ptax_xrate numeric (21,8) NULL,
				repurc_obli_flg char (1) DEFAULT '0' NOT NULL,
				trd_cur_proc_amt numeric (21,8) NULL,
				trd_cur_onr_prov_amt numeric (21,8) NULL,
				base_cur_proc_amt numeric (21,8) NULL,
				base_cur_onr_prov_amt numeric (21,8) NULL,
				ptax_cur_proc_amt numeric (21,8) NULL,
				ptax_cur_onr_prov_amt numeric (21,8) NULL,
				iv_no varchar (15) NULL,
				wrk_no varchar (15) NULL,
				bill_no varchar (15) NULL,
				acst_cd varchar (20) NULL,
				cst_cd varchar (20) NULL,
				asppl_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				inv_com_cd varchar (20) NULL,
				rcst_cd varchar (20) NULL,
				setoff_cd varchar (20) NULL,
				quality_typ varchar (1) NULL,
				spot_flg char (1) DEFAULT '0' NOT NULL,
				sttl_schd_dt timestamp(0)  NULL,
				sttl_cd varchar (10) NULL,
				cst_itm_cd varchar (40) NULL,
				cst_itm_nm varchar (100) NULL,
				sppl_itm_cd varchar (40) NULL,
				sppl_itm_nm varchar (100) NULL,
				slo_no varchar (15) NULL,
				po_no varchar (15) NULL,
				bank_ac_cd varchar (40) NULL,
				xfr_psn varchar (100) NULL,
				project_cd varchar (20) NULL,
				summary_cd0 varchar (20) NULL,
				summary_cd1 varchar (20) NULL,
				summary_cd2 varchar (20) NULL,
				summary_cd3 varchar (20) NULL,
				summary_cd4 varchar (20) NULL,
				summary_cd5 varchar (20) NULL,
				trd_itm_cd varchar (40) NULL,
				trd_itm_sub1 varchar (5) NULL,
				trd_itm_sub2 varchar (5) NULL,
				trd_itm_sub3 varchar (5) NULL,
				trd_itm_nm varchar (100) NULL,
				trd_project_cd varchar (20) NULL,
				trd_summary_cd0 varchar (20) NULL,
				trd_summary_cd1 varchar (20) NULL,
				trd_summary_cd2 varchar (20) NULL,
				trd_summary_cd3 varchar (20) NULL,
				trd_summary_cd4 varchar (20) NULL,
				trd_summary_cd5 varchar (20) NULL,
				trd_rmrks varchar (100) NULL,
				trd_d_rmrks varchar (100) NULL,
				jnl_key1 varchar (20) NULL,
				jnl_key2 varchar (20) NULL,
				jnl_key3 varchar (20) NULL,
				jnl_key4 varchar (20) NULL,
				jnl_key5 varchar (20) NULL,
				jnl_key6 varchar (20) NULL,
				jnl_key7 varchar (20) NULL,
				jnl_key8 varchar (20) NULL,
				jnl_key9 varchar (20) NULL,
				jnl_key10 varchar (20) NULL,
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
				tmp_num numeric (21,8) NULL,
				auto_jnl_key_cd varchar (5) NULL,
				setoff_nm varchar (100) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE mbw_pre_journal$temp
			ADD CONSTRAINT mbw_pre_journal_pk PRIMARY KEY(jnl_grp_no,ac_ym,pre_jnl_seq);
			
			ALTER TABLE mbw_pre_journal$temp
			ADD CONSTRAINT mbw_pre_journal_ck01 CHECK (can_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
			ADD CONSTRAINT mbw_pre_journal_ck02 CHECK (un_fix_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
			ADD CONSTRAINT mbw_pre_journal_ck03 CHECK (temp_ap_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
			ADD CONSTRAINT mbw_pre_journal_ck04 CHECK (foreign_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
			ADD CONSTRAINT mbw_pre_journal_ck05 CHECK (repurc_obli_flg IN ('0', '1'));
			ALTER TABLE mbw_pre_journal$temp
			ADD CONSTRAINT mbw_pre_journal_ck06 CHECK (spot_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('mbw_pre_journal$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO mbw_pre_journal$temp(
			jnl_grp_no,
			ac_ym,
			pre_jnl_seq,
			jnl_unit,
			wg_cd,
			ac_slip_dt,
			ac_dt,
			slip_no,
			slip_seq_no,
			ac_slip_typ,
			ac_rsn_cd,
			itm_jnl_cd,
			can_flg,
			purc_dpt_cd,
			ap_dpt_cd,
			sls_dpt_cd,
			ar_dpt_cd,
			gi_dpt_cd,
			gr_dpt_cd,
			bd_dpt_cd,
			rcv_dpt_cd,
			so_dpt_cd,
			sub_dpt_cd1,
			sub_dpt_cd2,
			sub_dpt_cd3,
			usr_cd,
			purc_typ,
			un_fix_flg,
			temp_ap_flg,
			foreign_flg,
			asst_typ,
			ac_itm_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_nm,
			base_unit_qty,
			base_unit_cd,
			trd_unit_qty,
			trd_unit_cd,
			base_cur_cd,
			base_cur_amt,
			base_cur_tax_amt,
			trd_cur_cd,
			trd_cur_amt,
			trd_cur_tax_amt,
			ptax_cur_cd,
			ptax_cur_amt,
			ptax_cur_tax_amt,
			tax_cd,
			xrate_cd,
			xrate,
			ptax_xrate_cd,
			ptax_xrate,
			repurc_obli_flg,
			trd_cur_proc_amt,
			trd_cur_onr_prov_amt,
			base_cur_proc_amt,
			base_cur_onr_prov_amt,
			ptax_cur_proc_amt,
			ptax_cur_onr_prov_amt,
			iv_no,
			wrk_no,
			bill_no,
			acst_cd,
			cst_cd,
			asppl_cd,
			sppl_cd,
			inv_com_cd,
			rcst_cd,
			setoff_cd,
			quality_typ,
			spot_flg,
			sttl_schd_dt,
			sttl_cd,
			cst_itm_cd,
			cst_itm_nm,
			sppl_itm_cd,
			sppl_itm_nm,
			slo_no,
			po_no,
			bank_ac_cd,
			xfr_psn,
			project_cd,
			summary_cd0,
			summary_cd1,
			summary_cd2,
			summary_cd3,
			summary_cd4,
			summary_cd5,
			trd_itm_cd,
			trd_itm_sub1,
			trd_itm_sub2,
			trd_itm_sub3,
			trd_itm_nm,
			trd_project_cd,
			trd_summary_cd0,
			trd_summary_cd1,
			trd_summary_cd2,
			trd_summary_cd3,
			trd_summary_cd4,
			trd_summary_cd5,
			trd_rmrks,
			trd_d_rmrks,
			jnl_key1,
			jnl_key2,
			jnl_key3,
			jnl_key4,
			jnl_key5,
			jnl_key6,
			jnl_key7,
			jnl_key8,
			jnl_key9,
			jnl_key10,
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
			tmp_num,
			auto_jnl_key_cd,
			setoff_nm
		)VALUES (
			NEW.jnl_grp_no,
			NEW.ac_ym,
			NEW.pre_jnl_seq,
			NEW.jnl_unit,
			NEW.wg_cd,
			NEW.ac_slip_dt,
			NEW.ac_dt,
			NEW.slip_no,
			NEW.slip_seq_no,
			NEW.ac_slip_typ,
			NEW.ac_rsn_cd,
			NEW.itm_jnl_cd,
			NEW.can_flg,
			NEW.purc_dpt_cd,
			NEW.ap_dpt_cd,
			NEW.sls_dpt_cd,
			NEW.ar_dpt_cd,
			NEW.gi_dpt_cd,
			NEW.gr_dpt_cd,
			NEW.bd_dpt_cd,
			NEW.rcv_dpt_cd,
			NEW.so_dpt_cd,
			NEW.sub_dpt_cd1,
			NEW.sub_dpt_cd2,
			NEW.sub_dpt_cd3,
			NEW.usr_cd,
			NEW.purc_typ,
			NEW.un_fix_flg,
			NEW.temp_ap_flg,
			NEW.foreign_flg,
			NEW.asst_typ,
			NEW.ac_itm_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_nm,
			NEW.base_unit_qty,
			NEW.base_unit_cd,
			NEW.trd_unit_qty,
			NEW.trd_unit_cd,
			NEW.base_cur_cd,
			NEW.base_cur_amt,
			NEW.base_cur_tax_amt,
			NEW.trd_cur_cd,
			NEW.trd_cur_amt,
			NEW.trd_cur_tax_amt,
			NEW.ptax_cur_cd,
			NEW.ptax_cur_amt,
			NEW.ptax_cur_tax_amt,
			NEW.tax_cd,
			NEW.xrate_cd,
			NEW.xrate,
			NEW.ptax_xrate_cd,
			NEW.ptax_xrate,
			NEW.repurc_obli_flg,
			NEW.trd_cur_proc_amt,
			NEW.trd_cur_onr_prov_amt,
			NEW.base_cur_proc_amt,
			NEW.base_cur_onr_prov_amt,
			NEW.ptax_cur_proc_amt,
			NEW.ptax_cur_onr_prov_amt,
			NEW.iv_no,
			NEW.wrk_no,
			NEW.bill_no,
			NEW.acst_cd,
			NEW.cst_cd,
			NEW.asppl_cd,
			NEW.sppl_cd,
			NEW.inv_com_cd,
			NEW.rcst_cd,
			NEW.setoff_cd,
			NEW.quality_typ,
			NEW.spot_flg,
			NEW.sttl_schd_dt,
			NEW.sttl_cd,
			NEW.cst_itm_cd,
			NEW.cst_itm_nm,
			NEW.sppl_itm_cd,
			NEW.sppl_itm_nm,
			NEW.slo_no,
			NEW.po_no,
			NEW.bank_ac_cd,
			NEW.xfr_psn,
			NEW.project_cd,
			NEW.summary_cd0,
			NEW.summary_cd1,
			NEW.summary_cd2,
			NEW.summary_cd3,
			NEW.summary_cd4,
			NEW.summary_cd5,
			NEW.trd_itm_cd,
			NEW.trd_itm_sub1,
			NEW.trd_itm_sub2,
			NEW.trd_itm_sub3,
			NEW.trd_itm_nm,
			NEW.trd_project_cd,
			NEW.trd_summary_cd0,
			NEW.trd_summary_cd1,
			NEW.trd_summary_cd2,
			NEW.trd_summary_cd3,
			NEW.trd_summary_cd4,
			NEW.trd_summary_cd5,
			NEW.trd_rmrks,
			NEW.trd_d_rmrks,
			NEW.jnl_key1,
			NEW.jnl_key2,
			NEW.jnl_key3,
			NEW.jnl_key4,
			NEW.jnl_key5,
			NEW.jnl_key6,
			NEW.jnl_key7,
			NEW.jnl_key8,
			NEW.jnl_key9,
			NEW.jnl_key10,
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
			NEW.tmp_num,
			NEW.auto_jnl_key_cd,
			NEW.setoff_nm
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE mbw_pre_journal$temp
		SET 
			jnl_grp_no = NEW.jnl_grp_no,
			ac_ym = NEW.ac_ym,
			pre_jnl_seq = NEW.pre_jnl_seq,
			jnl_unit = NEW.jnl_unit,
			wg_cd = NEW.wg_cd,
			ac_slip_dt = NEW.ac_slip_dt,
			ac_dt = NEW.ac_dt,
			slip_no = NEW.slip_no,
			slip_seq_no = NEW.slip_seq_no,
			ac_slip_typ = NEW.ac_slip_typ,
			ac_rsn_cd = NEW.ac_rsn_cd,
			itm_jnl_cd = NEW.itm_jnl_cd,
			can_flg = NEW.can_flg,
			purc_dpt_cd = NEW.purc_dpt_cd,
			ap_dpt_cd = NEW.ap_dpt_cd,
			sls_dpt_cd = NEW.sls_dpt_cd,
			ar_dpt_cd = NEW.ar_dpt_cd,
			gi_dpt_cd = NEW.gi_dpt_cd,
			gr_dpt_cd = NEW.gr_dpt_cd,
			bd_dpt_cd = NEW.bd_dpt_cd,
			rcv_dpt_cd = NEW.rcv_dpt_cd,
			so_dpt_cd = NEW.so_dpt_cd,
			sub_dpt_cd1 = NEW.sub_dpt_cd1,
			sub_dpt_cd2 = NEW.sub_dpt_cd2,
			sub_dpt_cd3 = NEW.sub_dpt_cd3,
			usr_cd = NEW.usr_cd,
			purc_typ = NEW.purc_typ,
			un_fix_flg = NEW.un_fix_flg,
			temp_ap_flg = NEW.temp_ap_flg,
			foreign_flg = NEW.foreign_flg,
			asst_typ = NEW.asst_typ,
			ac_itm_grp_cd = NEW.ac_itm_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_nm = NEW.itm_nm,
			base_unit_qty = NEW.base_unit_qty,
			base_unit_cd = NEW.base_unit_cd,
			trd_unit_qty = NEW.trd_unit_qty,
			trd_unit_cd = NEW.trd_unit_cd,
			base_cur_cd = NEW.base_cur_cd,
			base_cur_amt = NEW.base_cur_amt,
			base_cur_tax_amt = NEW.base_cur_tax_amt,
			trd_cur_cd = NEW.trd_cur_cd,
			trd_cur_amt = NEW.trd_cur_amt,
			trd_cur_tax_amt = NEW.trd_cur_tax_amt,
			ptax_cur_cd = NEW.ptax_cur_cd,
			ptax_cur_amt = NEW.ptax_cur_amt,
			ptax_cur_tax_amt = NEW.ptax_cur_tax_amt,
			tax_cd = NEW.tax_cd,
			xrate_cd = NEW.xrate_cd,
			xrate = NEW.xrate,
			ptax_xrate_cd = NEW.ptax_xrate_cd,
			ptax_xrate = NEW.ptax_xrate,
			repurc_obli_flg = NEW.repurc_obli_flg,
			trd_cur_proc_amt = NEW.trd_cur_proc_amt,
			trd_cur_onr_prov_amt = NEW.trd_cur_onr_prov_amt,
			base_cur_proc_amt = NEW.base_cur_proc_amt,
			base_cur_onr_prov_amt = NEW.base_cur_onr_prov_amt,
			ptax_cur_proc_amt = NEW.ptax_cur_proc_amt,
			ptax_cur_onr_prov_amt = NEW.ptax_cur_onr_prov_amt,
			iv_no = NEW.iv_no,
			wrk_no = NEW.wrk_no,
			bill_no = NEW.bill_no,
			acst_cd = NEW.acst_cd,
			cst_cd = NEW.cst_cd,
			asppl_cd = NEW.asppl_cd,
			sppl_cd = NEW.sppl_cd,
			inv_com_cd = NEW.inv_com_cd,
			rcst_cd = NEW.rcst_cd,
			setoff_cd = NEW.setoff_cd,
			quality_typ = NEW.quality_typ,
			spot_flg = NEW.spot_flg,
			sttl_schd_dt = NEW.sttl_schd_dt,
			sttl_cd = NEW.sttl_cd,
			cst_itm_cd = NEW.cst_itm_cd,
			cst_itm_nm = NEW.cst_itm_nm,
			sppl_itm_cd = NEW.sppl_itm_cd,
			sppl_itm_nm = NEW.sppl_itm_nm,
			slo_no = NEW.slo_no,
			po_no = NEW.po_no,
			bank_ac_cd = NEW.bank_ac_cd,
			xfr_psn = NEW.xfr_psn,
			project_cd = NEW.project_cd,
			summary_cd0 = NEW.summary_cd0,
			summary_cd1 = NEW.summary_cd1,
			summary_cd2 = NEW.summary_cd2,
			summary_cd3 = NEW.summary_cd3,
			summary_cd4 = NEW.summary_cd4,
			summary_cd5 = NEW.summary_cd5,
			trd_itm_cd = NEW.trd_itm_cd,
			trd_itm_sub1 = NEW.trd_itm_sub1,
			trd_itm_sub2 = NEW.trd_itm_sub2,
			trd_itm_sub3 = NEW.trd_itm_sub3,
			trd_itm_nm = NEW.trd_itm_nm,
			trd_project_cd = NEW.trd_project_cd,
			trd_summary_cd0 = NEW.trd_summary_cd0,
			trd_summary_cd1 = NEW.trd_summary_cd1,
			trd_summary_cd2 = NEW.trd_summary_cd2,
			trd_summary_cd3 = NEW.trd_summary_cd3,
			trd_summary_cd4 = NEW.trd_summary_cd4,
			trd_summary_cd5 = NEW.trd_summary_cd5,
			trd_rmrks = NEW.trd_rmrks,
			trd_d_rmrks = NEW.trd_d_rmrks,
			jnl_key1 = NEW.jnl_key1,
			jnl_key2 = NEW.jnl_key2,
			jnl_key3 = NEW.jnl_key3,
			jnl_key4 = NEW.jnl_key4,
			jnl_key5 = NEW.jnl_key5,
			jnl_key6 = NEW.jnl_key6,
			jnl_key7 = NEW.jnl_key7,
			jnl_key8 = NEW.jnl_key8,
			jnl_key9 = NEW.jnl_key9,
			jnl_key10 = NEW.jnl_key10,
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
			tmp_num = NEW.tmp_num,
			auto_jnl_key_cd = NEW.auto_jnl_key_cd,
			setoff_nm = NEW.setoff_nm
		WHERE 0=0
		AND jnl_grp_no = OLD.jnl_grp_no
		AND ac_ym = OLD.ac_ym
		AND pre_jnl_seq = OLD.pre_jnl_seq
		AND jnl_unit = OLD.jnl_unit
		AND wg_cd = OLD.wg_cd
		AND ac_slip_dt = OLD.ac_slip_dt
		AND ac_dt = OLD.ac_dt
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_seq_no = OLD.slip_seq_no OR slip_seq_no IS NULL AND OLD.slip_seq_no IS NULL)
		AND ac_slip_typ = OLD.ac_slip_typ
		AND (ac_rsn_cd = OLD.ac_rsn_cd OR ac_rsn_cd IS NULL AND OLD.ac_rsn_cd IS NULL)
		AND (itm_jnl_cd = OLD.itm_jnl_cd OR itm_jnl_cd IS NULL AND OLD.itm_jnl_cd IS NULL)
		AND can_flg = OLD.can_flg
		AND (purc_dpt_cd = OLD.purc_dpt_cd OR purc_dpt_cd IS NULL AND OLD.purc_dpt_cd IS NULL)
		AND (ap_dpt_cd = OLD.ap_dpt_cd OR ap_dpt_cd IS NULL AND OLD.ap_dpt_cd IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (ar_dpt_cd = OLD.ar_dpt_cd OR ar_dpt_cd IS NULL AND OLD.ar_dpt_cd IS NULL)
		AND (gi_dpt_cd = OLD.gi_dpt_cd OR gi_dpt_cd IS NULL AND OLD.gi_dpt_cd IS NULL)
		AND (gr_dpt_cd = OLD.gr_dpt_cd OR gr_dpt_cd IS NULL AND OLD.gr_dpt_cd IS NULL)
		AND (bd_dpt_cd = OLD.bd_dpt_cd OR bd_dpt_cd IS NULL AND OLD.bd_dpt_cd IS NULL)
		AND (rcv_dpt_cd = OLD.rcv_dpt_cd OR rcv_dpt_cd IS NULL AND OLD.rcv_dpt_cd IS NULL)
		AND (so_dpt_cd = OLD.so_dpt_cd OR so_dpt_cd IS NULL AND OLD.so_dpt_cd IS NULL)
		AND (sub_dpt_cd1 = OLD.sub_dpt_cd1 OR sub_dpt_cd1 IS NULL AND OLD.sub_dpt_cd1 IS NULL)
		AND (sub_dpt_cd2 = OLD.sub_dpt_cd2 OR sub_dpt_cd2 IS NULL AND OLD.sub_dpt_cd2 IS NULL)
		AND (sub_dpt_cd3 = OLD.sub_dpt_cd3 OR sub_dpt_cd3 IS NULL AND OLD.sub_dpt_cd3 IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (purc_typ = OLD.purc_typ OR purc_typ IS NULL AND OLD.purc_typ IS NULL)
		AND un_fix_flg = OLD.un_fix_flg
		AND temp_ap_flg = OLD.temp_ap_flg
		AND foreign_flg = OLD.foreign_flg
		AND (asst_typ = OLD.asst_typ OR asst_typ IS NULL AND OLD.asst_typ IS NULL)
		AND (ac_itm_grp_cd = OLD.ac_itm_grp_cd OR ac_itm_grp_cd IS NULL AND OLD.ac_itm_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND (base_unit_qty = OLD.base_unit_qty OR base_unit_qty IS NULL AND OLD.base_unit_qty IS NULL)
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL)
		AND (trd_unit_qty = OLD.trd_unit_qty OR trd_unit_qty IS NULL AND OLD.trd_unit_qty IS NULL)
		AND (trd_unit_cd = OLD.trd_unit_cd OR trd_unit_cd IS NULL AND OLD.trd_unit_cd IS NULL)
		AND (base_cur_cd = OLD.base_cur_cd OR base_cur_cd IS NULL AND OLD.base_cur_cd IS NULL)
		AND (base_cur_amt = OLD.base_cur_amt OR base_cur_amt IS NULL AND OLD.base_cur_amt IS NULL)
		AND (base_cur_tax_amt = OLD.base_cur_tax_amt OR base_cur_tax_amt IS NULL AND OLD.base_cur_tax_amt IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (trd_cur_tax_amt = OLD.trd_cur_tax_amt OR trd_cur_tax_amt IS NULL AND OLD.trd_cur_tax_amt IS NULL)
		AND (ptax_cur_cd = OLD.ptax_cur_cd OR ptax_cur_cd IS NULL AND OLD.ptax_cur_cd IS NULL)
		AND (ptax_cur_amt = OLD.ptax_cur_amt OR ptax_cur_amt IS NULL AND OLD.ptax_cur_amt IS NULL)
		AND (ptax_cur_tax_amt = OLD.ptax_cur_tax_amt OR ptax_cur_tax_amt IS NULL AND OLD.ptax_cur_tax_amt IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (ptax_xrate_cd = OLD.ptax_xrate_cd OR ptax_xrate_cd IS NULL AND OLD.ptax_xrate_cd IS NULL)
		AND (ptax_xrate = OLD.ptax_xrate OR ptax_xrate IS NULL AND OLD.ptax_xrate IS NULL)
		AND repurc_obli_flg = OLD.repurc_obli_flg
		AND (trd_cur_proc_amt = OLD.trd_cur_proc_amt OR trd_cur_proc_amt IS NULL AND OLD.trd_cur_proc_amt IS NULL)
		AND (trd_cur_onr_prov_amt = OLD.trd_cur_onr_prov_amt OR trd_cur_onr_prov_amt IS NULL AND OLD.trd_cur_onr_prov_amt IS NULL)
		AND (base_cur_proc_amt = OLD.base_cur_proc_amt OR base_cur_proc_amt IS NULL AND OLD.base_cur_proc_amt IS NULL)
		AND (base_cur_onr_prov_amt = OLD.base_cur_onr_prov_amt OR base_cur_onr_prov_amt IS NULL AND OLD.base_cur_onr_prov_amt IS NULL)
		AND (ptax_cur_proc_amt = OLD.ptax_cur_proc_amt OR ptax_cur_proc_amt IS NULL AND OLD.ptax_cur_proc_amt IS NULL)
		AND (ptax_cur_onr_prov_amt = OLD.ptax_cur_onr_prov_amt OR ptax_cur_onr_prov_amt IS NULL AND OLD.ptax_cur_onr_prov_amt IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (bill_no = OLD.bill_no OR bill_no IS NULL AND OLD.bill_no IS NULL)
		AND (acst_cd = OLD.acst_cd OR acst_cd IS NULL AND OLD.acst_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (asppl_cd = OLD.asppl_cd OR asppl_cd IS NULL AND OLD.asppl_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (inv_com_cd = OLD.inv_com_cd OR inv_com_cd IS NULL AND OLD.inv_com_cd IS NULL)
		AND (rcst_cd = OLD.rcst_cd OR rcst_cd IS NULL AND OLD.rcst_cd IS NULL)
		AND (setoff_cd = OLD.setoff_cd OR setoff_cd IS NULL AND OLD.setoff_cd IS NULL)
		AND (quality_typ = OLD.quality_typ OR quality_typ IS NULL AND OLD.quality_typ IS NULL)
		AND spot_flg = OLD.spot_flg
		AND (sttl_schd_dt = OLD.sttl_schd_dt OR sttl_schd_dt IS NULL AND OLD.sttl_schd_dt IS NULL)
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL)
		AND (cst_itm_cd = OLD.cst_itm_cd OR cst_itm_cd IS NULL AND OLD.cst_itm_cd IS NULL)
		AND (cst_itm_nm = OLD.cst_itm_nm OR cst_itm_nm IS NULL AND OLD.cst_itm_nm IS NULL)
		AND (sppl_itm_cd = OLD.sppl_itm_cd OR sppl_itm_cd IS NULL AND OLD.sppl_itm_cd IS NULL)
		AND (sppl_itm_nm = OLD.sppl_itm_nm OR sppl_itm_nm IS NULL AND OLD.sppl_itm_nm IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (bank_ac_cd = OLD.bank_ac_cd OR bank_ac_cd IS NULL AND OLD.bank_ac_cd IS NULL)
		AND (xfr_psn = OLD.xfr_psn OR xfr_psn IS NULL AND OLD.xfr_psn IS NULL)
		AND (project_cd = OLD.project_cd OR project_cd IS NULL AND OLD.project_cd IS NULL)
		AND (summary_cd0 = OLD.summary_cd0 OR summary_cd0 IS NULL AND OLD.summary_cd0 IS NULL)
		AND (summary_cd1 = OLD.summary_cd1 OR summary_cd1 IS NULL AND OLD.summary_cd1 IS NULL)
		AND (summary_cd2 = OLD.summary_cd2 OR summary_cd2 IS NULL AND OLD.summary_cd2 IS NULL)
		AND (summary_cd3 = OLD.summary_cd3 OR summary_cd3 IS NULL AND OLD.summary_cd3 IS NULL)
		AND (summary_cd4 = OLD.summary_cd4 OR summary_cd4 IS NULL AND OLD.summary_cd4 IS NULL)
		AND (summary_cd5 = OLD.summary_cd5 OR summary_cd5 IS NULL AND OLD.summary_cd5 IS NULL)
		AND (trd_itm_cd = OLD.trd_itm_cd OR trd_itm_cd IS NULL AND OLD.trd_itm_cd IS NULL)
		AND (trd_itm_sub1 = OLD.trd_itm_sub1 OR trd_itm_sub1 IS NULL AND OLD.trd_itm_sub1 IS NULL)
		AND (trd_itm_sub2 = OLD.trd_itm_sub2 OR trd_itm_sub2 IS NULL AND OLD.trd_itm_sub2 IS NULL)
		AND (trd_itm_sub3 = OLD.trd_itm_sub3 OR trd_itm_sub3 IS NULL AND OLD.trd_itm_sub3 IS NULL)
		AND (trd_itm_nm = OLD.trd_itm_nm OR trd_itm_nm IS NULL AND OLD.trd_itm_nm IS NULL)
		AND (trd_project_cd = OLD.trd_project_cd OR trd_project_cd IS NULL AND OLD.trd_project_cd IS NULL)
		AND (trd_summary_cd0 = OLD.trd_summary_cd0 OR trd_summary_cd0 IS NULL AND OLD.trd_summary_cd0 IS NULL)
		AND (trd_summary_cd1 = OLD.trd_summary_cd1 OR trd_summary_cd1 IS NULL AND OLD.trd_summary_cd1 IS NULL)
		AND (trd_summary_cd2 = OLD.trd_summary_cd2 OR trd_summary_cd2 IS NULL AND OLD.trd_summary_cd2 IS NULL)
		AND (trd_summary_cd3 = OLD.trd_summary_cd3 OR trd_summary_cd3 IS NULL AND OLD.trd_summary_cd3 IS NULL)
		AND (trd_summary_cd4 = OLD.trd_summary_cd4 OR trd_summary_cd4 IS NULL AND OLD.trd_summary_cd4 IS NULL)
		AND (trd_summary_cd5 = OLD.trd_summary_cd5 OR trd_summary_cd5 IS NULL AND OLD.trd_summary_cd5 IS NULL)
		AND (trd_rmrks = OLD.trd_rmrks OR trd_rmrks IS NULL AND OLD.trd_rmrks IS NULL)
		AND (trd_d_rmrks = OLD.trd_d_rmrks OR trd_d_rmrks IS NULL AND OLD.trd_d_rmrks IS NULL)
		AND (jnl_key1 = OLD.jnl_key1 OR jnl_key1 IS NULL AND OLD.jnl_key1 IS NULL)
		AND (jnl_key2 = OLD.jnl_key2 OR jnl_key2 IS NULL AND OLD.jnl_key2 IS NULL)
		AND (jnl_key3 = OLD.jnl_key3 OR jnl_key3 IS NULL AND OLD.jnl_key3 IS NULL)
		AND (jnl_key4 = OLD.jnl_key4 OR jnl_key4 IS NULL AND OLD.jnl_key4 IS NULL)
		AND (jnl_key5 = OLD.jnl_key5 OR jnl_key5 IS NULL AND OLD.jnl_key5 IS NULL)
		AND (jnl_key6 = OLD.jnl_key6 OR jnl_key6 IS NULL AND OLD.jnl_key6 IS NULL)
		AND (jnl_key7 = OLD.jnl_key7 OR jnl_key7 IS NULL AND OLD.jnl_key7 IS NULL)
		AND (jnl_key8 = OLD.jnl_key8 OR jnl_key8 IS NULL AND OLD.jnl_key8 IS NULL)
		AND (jnl_key9 = OLD.jnl_key9 OR jnl_key9 IS NULL AND OLD.jnl_key9 IS NULL)
		AND (jnl_key10 = OLD.jnl_key10 OR jnl_key10 IS NULL AND OLD.jnl_key10 IS NULL)
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
		AND (tmp_num = OLD.tmp_num OR tmp_num IS NULL AND OLD.tmp_num IS NULL)
		AND (auto_jnl_key_cd = OLD.auto_jnl_key_cd OR auto_jnl_key_cd IS NULL AND OLD.auto_jnl_key_cd IS NULL)
		AND (setoff_nm = OLD.setoff_nm OR setoff_nm IS NULL AND OLD.setoff_nm IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM mbw_pre_journal$temp
		WHERE 0=0
		AND jnl_grp_no = OLD.jnl_grp_no
		AND ac_ym = OLD.ac_ym
		AND pre_jnl_seq = OLD.pre_jnl_seq
		AND jnl_unit = OLD.jnl_unit
		AND wg_cd = OLD.wg_cd
		AND ac_slip_dt = OLD.ac_slip_dt
		AND ac_dt = OLD.ac_dt
		AND (slip_no = OLD.slip_no OR slip_no IS NULL AND OLD.slip_no IS NULL)
		AND (slip_seq_no = OLD.slip_seq_no OR slip_seq_no IS NULL AND OLD.slip_seq_no IS NULL)
		AND ac_slip_typ = OLD.ac_slip_typ
		AND (ac_rsn_cd = OLD.ac_rsn_cd OR ac_rsn_cd IS NULL AND OLD.ac_rsn_cd IS NULL)
		AND (itm_jnl_cd = OLD.itm_jnl_cd OR itm_jnl_cd IS NULL AND OLD.itm_jnl_cd IS NULL)
		AND can_flg = OLD.can_flg
		AND (purc_dpt_cd = OLD.purc_dpt_cd OR purc_dpt_cd IS NULL AND OLD.purc_dpt_cd IS NULL)
		AND (ap_dpt_cd = OLD.ap_dpt_cd OR ap_dpt_cd IS NULL AND OLD.ap_dpt_cd IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (ar_dpt_cd = OLD.ar_dpt_cd OR ar_dpt_cd IS NULL AND OLD.ar_dpt_cd IS NULL)
		AND (gi_dpt_cd = OLD.gi_dpt_cd OR gi_dpt_cd IS NULL AND OLD.gi_dpt_cd IS NULL)
		AND (gr_dpt_cd = OLD.gr_dpt_cd OR gr_dpt_cd IS NULL AND OLD.gr_dpt_cd IS NULL)
		AND (bd_dpt_cd = OLD.bd_dpt_cd OR bd_dpt_cd IS NULL AND OLD.bd_dpt_cd IS NULL)
		AND (rcv_dpt_cd = OLD.rcv_dpt_cd OR rcv_dpt_cd IS NULL AND OLD.rcv_dpt_cd IS NULL)
		AND (so_dpt_cd = OLD.so_dpt_cd OR so_dpt_cd IS NULL AND OLD.so_dpt_cd IS NULL)
		AND (sub_dpt_cd1 = OLD.sub_dpt_cd1 OR sub_dpt_cd1 IS NULL AND OLD.sub_dpt_cd1 IS NULL)
		AND (sub_dpt_cd2 = OLD.sub_dpt_cd2 OR sub_dpt_cd2 IS NULL AND OLD.sub_dpt_cd2 IS NULL)
		AND (sub_dpt_cd3 = OLD.sub_dpt_cd3 OR sub_dpt_cd3 IS NULL AND OLD.sub_dpt_cd3 IS NULL)
		AND (usr_cd = OLD.usr_cd OR usr_cd IS NULL AND OLD.usr_cd IS NULL)
		AND (purc_typ = OLD.purc_typ OR purc_typ IS NULL AND OLD.purc_typ IS NULL)
		AND un_fix_flg = OLD.un_fix_flg
		AND temp_ap_flg = OLD.temp_ap_flg
		AND foreign_flg = OLD.foreign_flg
		AND (asst_typ = OLD.asst_typ OR asst_typ IS NULL AND OLD.asst_typ IS NULL)
		AND (ac_itm_grp_cd = OLD.ac_itm_grp_cd OR ac_itm_grp_cd IS NULL AND OLD.ac_itm_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND (base_unit_qty = OLD.base_unit_qty OR base_unit_qty IS NULL AND OLD.base_unit_qty IS NULL)
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL)
		AND (trd_unit_qty = OLD.trd_unit_qty OR trd_unit_qty IS NULL AND OLD.trd_unit_qty IS NULL)
		AND (trd_unit_cd = OLD.trd_unit_cd OR trd_unit_cd IS NULL AND OLD.trd_unit_cd IS NULL)
		AND (base_cur_cd = OLD.base_cur_cd OR base_cur_cd IS NULL AND OLD.base_cur_cd IS NULL)
		AND (base_cur_amt = OLD.base_cur_amt OR base_cur_amt IS NULL AND OLD.base_cur_amt IS NULL)
		AND (base_cur_tax_amt = OLD.base_cur_tax_amt OR base_cur_tax_amt IS NULL AND OLD.base_cur_tax_amt IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (trd_cur_tax_amt = OLD.trd_cur_tax_amt OR trd_cur_tax_amt IS NULL AND OLD.trd_cur_tax_amt IS NULL)
		AND (ptax_cur_cd = OLD.ptax_cur_cd OR ptax_cur_cd IS NULL AND OLD.ptax_cur_cd IS NULL)
		AND (ptax_cur_amt = OLD.ptax_cur_amt OR ptax_cur_amt IS NULL AND OLD.ptax_cur_amt IS NULL)
		AND (ptax_cur_tax_amt = OLD.ptax_cur_tax_amt OR ptax_cur_tax_amt IS NULL AND OLD.ptax_cur_tax_amt IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (ptax_xrate_cd = OLD.ptax_xrate_cd OR ptax_xrate_cd IS NULL AND OLD.ptax_xrate_cd IS NULL)
		AND (ptax_xrate = OLD.ptax_xrate OR ptax_xrate IS NULL AND OLD.ptax_xrate IS NULL)
		AND repurc_obli_flg = OLD.repurc_obli_flg
		AND (trd_cur_proc_amt = OLD.trd_cur_proc_amt OR trd_cur_proc_amt IS NULL AND OLD.trd_cur_proc_amt IS NULL)
		AND (trd_cur_onr_prov_amt = OLD.trd_cur_onr_prov_amt OR trd_cur_onr_prov_amt IS NULL AND OLD.trd_cur_onr_prov_amt IS NULL)
		AND (base_cur_proc_amt = OLD.base_cur_proc_amt OR base_cur_proc_amt IS NULL AND OLD.base_cur_proc_amt IS NULL)
		AND (base_cur_onr_prov_amt = OLD.base_cur_onr_prov_amt OR base_cur_onr_prov_amt IS NULL AND OLD.base_cur_onr_prov_amt IS NULL)
		AND (ptax_cur_proc_amt = OLD.ptax_cur_proc_amt OR ptax_cur_proc_amt IS NULL AND OLD.ptax_cur_proc_amt IS NULL)
		AND (ptax_cur_onr_prov_amt = OLD.ptax_cur_onr_prov_amt OR ptax_cur_onr_prov_amt IS NULL AND OLD.ptax_cur_onr_prov_amt IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (wrk_no = OLD.wrk_no OR wrk_no IS NULL AND OLD.wrk_no IS NULL)
		AND (bill_no = OLD.bill_no OR bill_no IS NULL AND OLD.bill_no IS NULL)
		AND (acst_cd = OLD.acst_cd OR acst_cd IS NULL AND OLD.acst_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (asppl_cd = OLD.asppl_cd OR asppl_cd IS NULL AND OLD.asppl_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND (inv_com_cd = OLD.inv_com_cd OR inv_com_cd IS NULL AND OLD.inv_com_cd IS NULL)
		AND (rcst_cd = OLD.rcst_cd OR rcst_cd IS NULL AND OLD.rcst_cd IS NULL)
		AND (setoff_cd = OLD.setoff_cd OR setoff_cd IS NULL AND OLD.setoff_cd IS NULL)
		AND (quality_typ = OLD.quality_typ OR quality_typ IS NULL AND OLD.quality_typ IS NULL)
		AND spot_flg = OLD.spot_flg
		AND (sttl_schd_dt = OLD.sttl_schd_dt OR sttl_schd_dt IS NULL AND OLD.sttl_schd_dt IS NULL)
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL)
		AND (cst_itm_cd = OLD.cst_itm_cd OR cst_itm_cd IS NULL AND OLD.cst_itm_cd IS NULL)
		AND (cst_itm_nm = OLD.cst_itm_nm OR cst_itm_nm IS NULL AND OLD.cst_itm_nm IS NULL)
		AND (sppl_itm_cd = OLD.sppl_itm_cd OR sppl_itm_cd IS NULL AND OLD.sppl_itm_cd IS NULL)
		AND (sppl_itm_nm = OLD.sppl_itm_nm OR sppl_itm_nm IS NULL AND OLD.sppl_itm_nm IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (bank_ac_cd = OLD.bank_ac_cd OR bank_ac_cd IS NULL AND OLD.bank_ac_cd IS NULL)
		AND (xfr_psn = OLD.xfr_psn OR xfr_psn IS NULL AND OLD.xfr_psn IS NULL)
		AND (project_cd = OLD.project_cd OR project_cd IS NULL AND OLD.project_cd IS NULL)
		AND (summary_cd0 = OLD.summary_cd0 OR summary_cd0 IS NULL AND OLD.summary_cd0 IS NULL)
		AND (summary_cd1 = OLD.summary_cd1 OR summary_cd1 IS NULL AND OLD.summary_cd1 IS NULL)
		AND (summary_cd2 = OLD.summary_cd2 OR summary_cd2 IS NULL AND OLD.summary_cd2 IS NULL)
		AND (summary_cd3 = OLD.summary_cd3 OR summary_cd3 IS NULL AND OLD.summary_cd3 IS NULL)
		AND (summary_cd4 = OLD.summary_cd4 OR summary_cd4 IS NULL AND OLD.summary_cd4 IS NULL)
		AND (summary_cd5 = OLD.summary_cd5 OR summary_cd5 IS NULL AND OLD.summary_cd5 IS NULL)
		AND (trd_itm_cd = OLD.trd_itm_cd OR trd_itm_cd IS NULL AND OLD.trd_itm_cd IS NULL)
		AND (trd_itm_sub1 = OLD.trd_itm_sub1 OR trd_itm_sub1 IS NULL AND OLD.trd_itm_sub1 IS NULL)
		AND (trd_itm_sub2 = OLD.trd_itm_sub2 OR trd_itm_sub2 IS NULL AND OLD.trd_itm_sub2 IS NULL)
		AND (trd_itm_sub3 = OLD.trd_itm_sub3 OR trd_itm_sub3 IS NULL AND OLD.trd_itm_sub3 IS NULL)
		AND (trd_itm_nm = OLD.trd_itm_nm OR trd_itm_nm IS NULL AND OLD.trd_itm_nm IS NULL)
		AND (trd_project_cd = OLD.trd_project_cd OR trd_project_cd IS NULL AND OLD.trd_project_cd IS NULL)
		AND (trd_summary_cd0 = OLD.trd_summary_cd0 OR trd_summary_cd0 IS NULL AND OLD.trd_summary_cd0 IS NULL)
		AND (trd_summary_cd1 = OLD.trd_summary_cd1 OR trd_summary_cd1 IS NULL AND OLD.trd_summary_cd1 IS NULL)
		AND (trd_summary_cd2 = OLD.trd_summary_cd2 OR trd_summary_cd2 IS NULL AND OLD.trd_summary_cd2 IS NULL)
		AND (trd_summary_cd3 = OLD.trd_summary_cd3 OR trd_summary_cd3 IS NULL AND OLD.trd_summary_cd3 IS NULL)
		AND (trd_summary_cd4 = OLD.trd_summary_cd4 OR trd_summary_cd4 IS NULL AND OLD.trd_summary_cd4 IS NULL)
		AND (trd_summary_cd5 = OLD.trd_summary_cd5 OR trd_summary_cd5 IS NULL AND OLD.trd_summary_cd5 IS NULL)
		AND (trd_rmrks = OLD.trd_rmrks OR trd_rmrks IS NULL AND OLD.trd_rmrks IS NULL)
		AND (trd_d_rmrks = OLD.trd_d_rmrks OR trd_d_rmrks IS NULL AND OLD.trd_d_rmrks IS NULL)
		AND (jnl_key1 = OLD.jnl_key1 OR jnl_key1 IS NULL AND OLD.jnl_key1 IS NULL)
		AND (jnl_key2 = OLD.jnl_key2 OR jnl_key2 IS NULL AND OLD.jnl_key2 IS NULL)
		AND (jnl_key3 = OLD.jnl_key3 OR jnl_key3 IS NULL AND OLD.jnl_key3 IS NULL)
		AND (jnl_key4 = OLD.jnl_key4 OR jnl_key4 IS NULL AND OLD.jnl_key4 IS NULL)
		AND (jnl_key5 = OLD.jnl_key5 OR jnl_key5 IS NULL AND OLD.jnl_key5 IS NULL)
		AND (jnl_key6 = OLD.jnl_key6 OR jnl_key6 IS NULL AND OLD.jnl_key6 IS NULL)
		AND (jnl_key7 = OLD.jnl_key7 OR jnl_key7 IS NULL AND OLD.jnl_key7 IS NULL)
		AND (jnl_key8 = OLD.jnl_key8 OR jnl_key8 IS NULL AND OLD.jnl_key8 IS NULL)
		AND (jnl_key9 = OLD.jnl_key9 OR jnl_key9 IS NULL AND OLD.jnl_key9 IS NULL)
		AND (jnl_key10 = OLD.jnl_key10 OR jnl_key10 IS NULL AND OLD.jnl_key10 IS NULL)
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
		AND (tmp_num = OLD.tmp_num OR tmp_num IS NULL AND OLD.tmp_num IS NULL)
		AND (auto_jnl_key_cd = OLD.auto_jnl_key_cd OR auto_jnl_key_cd IS NULL AND OLD.auto_jnl_key_cd IS NULL)
		AND (setoff_nm = OLD.setoff_nm OR setoff_nm IS NULL AND OLD.setoff_nm IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mbw_pre_journal$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON mbw_pre_journal
FOR EACH ROW
EXECUTE PROCEDURE mbw_pre_journal$func();
;

