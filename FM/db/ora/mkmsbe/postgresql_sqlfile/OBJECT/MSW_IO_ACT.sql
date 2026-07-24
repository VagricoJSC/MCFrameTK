\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_io_act()
RETURNS TABLE (
	data_crud_typ varchar,
	ac_dt timestamp(0),
	can_ac_dt timestamp(0),
	act_tm timestamp(0),
	act_no varchar,
	act_seq numeric,
	act_rev_no numeric,
	act_d_no varchar,
	act_d_seq numeric,
	act_io_no varchar,
	act_io_seq numeric,
	un_fix_flg char,
	temp_ap_flg char,
	trd_cd varchar,
	trd_ptn_typ varchar,
	trn_typ varchar,
	io_act_typ varchar,
	rsn_cd varchar,
	gi_wg_cd varchar,
	gr_wg_cd varchar,
	act_dpt_cd varchar,
	purc_dpt_cd varchar,
	ap_dpt_cd varchar,
	sls_dpt_cd varchar,
	ar_dpt_cd varchar,
	bd_dpt_cd varchar,
	sub_dpt_cd1 varchar,
	sub_dpt_cd2 varchar,
	sub_dpt_cd3 varchar,
	act_usr_cd varchar,
	sls_usr_cd varchar,
	mfg_usr_cd varchar,
	purc_usr_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	itm_nm varchar,
	stk_mng_typ varchar,
	sundry_itm_flg char,
	gi_loc_cd varchar,
	gi_str_ln_cd varchar,
	gr_loc_cd varchar,
	gr_str_ln_cd varchar,
	stk_arrv_bp_cd varchar,
	lot_no varchar,
	sublot_no varchar,
	sno1 varchar,
	sno2 varchar,
	sno3 varchar,
	sno4 varchar,
	sno1_mng_typ varchar,
	sno2_mng_typ varchar,
	sno3_mng_typ varchar,
	sno4_mng_typ varchar,
	fix_no_typ varchar,
	fix_no varchar,
	gi_gd_cd varchar,
	gr_gd_cd varchar,
	in_xfr_typ varchar,
	quality_typ varchar,
	stk_insp_typ varchar,
	stk_id_typ varchar,
	stk_bp_cd varchar,
	trd_unit_qty numeric,
	trd_unit_cd varchar,
	pack_unit_qty numeric,
	pack_unit_cd varchar,
	base_unit_qty numeric,
	base_unit_cd varchar,
	trd_cur_cd varchar,
	trd_cur_upri numeric,
	trd_cur_amt numeric,
	trd_cur_proc_amt numeric,
	trd_cur_onr_prov_amt numeric,
	trd_cur_tax_amt numeric,
	base_cur_cd varchar,
	base_cur_upri numeric,
	base_cur_amt numeric,
	base_cur_proc_amt numeric,
	base_cur_onr_prov_amt numeric,
	base_cur_tax_amt numeric,
	ptax_cur_cd varchar,
	ptax_cur_upri numeric,
	ptax_cur_amt numeric,
	ptax_cur_proc_amt numeric,
	ptax_cur_onr_prov_amt numeric,
	ptax_cur_tax_amt numeric,
	wtax_rate numeric,
	wtax_amt numeric,
	tax_cd varchar,
	xrate_cd varchar,
	xrate numeric,
	ptax_xrate_cd varchar,
	ptax_xrate numeric,
	slo_no varchar,
	po_no varchar,
	iv_no varchar,
	rcpt_iv_no varchar,
	bd_ctg_cd varchar,
	bd_bp_cd varchar,
	bd_oper_cd varchar,
	bd_loc_cd varchar,
	bd_slo_no varchar,
	bd_po_no varchar,
	bd_iv_no varchar,
	bd_wg_cd varchar,
	dlv_cd varchar,
	tdlv_cd varchar,
	acst_cd varchar,
	cst_cd varchar,
	dest_cd1 varchar,
	dest_cd2 varchar,
	dest_cd3 varchar,
	asppl_cd varchar,
	sppl_cd varchar,
	spot_flg char,
	sttl_schd_dt timestamp(0),
	sttl_cd varchar,
	cst_itm_cd varchar,
	cst_itm_nm varchar,
	sppl_itm_cd varchar,
	sppl_itm_nm varchar,
	purc_typ varchar,
	itm_mfg_inst_no varchar,
	itm_inst_qty numeric,
	mfg_inst_no varchar,
	mfg_act_no varchar,
	mfg_st_qty numeric,
	oper_act_no varchar,
	yield_rate numeric,
	disp_seq numeric,
	oper_cd varchar,
	inpt_loc_cd varchar,
	inpt_str_ln_cd varchar,
	strg_loc_cd varchar,
	strg_str_ln_cd varchar,
	par_itm_cd varchar,
	par_itm_sub1 varchar,
	par_itm_sub2 varchar,
	par_itm_sub3 varchar,
	par_itm_nm varchar,
	par_lot_no varchar,
	par_sublot_no varchar,
	par_sno1 varchar,
	par_sno2 varchar,
	par_sno3 varchar,
	par_sno4 varchar,
	stktk_diff_qty numeric,
	pack_xfr_unit_cd varchar,
	pack_xfr_qty numeric,
	mfg_inst_unit_typ varchar,
	via_dlv_typ varchar,
	arr_ptn_typ varchar,
	yield_typ varchar,
	prov_typ varchar,
	purc_id_typ varchar,
	io_typ varchar,
	accpt_dfct_flg char,
	par_slip_io_act_typ varchar,
	no_gi_alloc_flg char,
	acxfr_stk_id_typ varchar,
	acxfr_stk_bp_cd varchar,
	acxfr_stk_arrv_bp_cd varchar,
	trd_rmrks varchar,
	trd_d_rmrks varchar,
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
	rsn_cd2 varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_io_act$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_io_act$temp(
				data_crud_typ varchar (1) NOT NULL,
				ac_dt timestamp(0)  NULL,
				can_ac_dt timestamp(0)  NULL,
				act_tm timestamp(0)  NULL,
				act_no varchar (15) NULL,
				act_seq numeric (4,0) NULL,
				act_rev_no numeric (4,0) NULL,
				act_d_no varchar (15) NULL,
				act_d_seq numeric (4,0) NULL,
				act_io_no varchar (15) NULL,
				act_io_seq numeric (4,0) NULL,
				un_fix_flg char (1) DEFAULT '0' NOT NULL,
				temp_ap_flg char (1) DEFAULT '0' NOT NULL,
				trd_cd varchar (4) NULL,
				trd_ptn_typ varchar (4) NULL,
				trn_typ varchar (4) NULL,
				io_act_typ varchar (5) NULL,
				rsn_cd varchar (10) NULL,
				gi_wg_cd varchar (10) NULL,
				gr_wg_cd varchar (10) NULL,
				act_dpt_cd varchar (20) NULL,
				purc_dpt_cd varchar (20) NULL,
				ap_dpt_cd varchar (20) NULL,
				sls_dpt_cd varchar (20) NULL,
				ar_dpt_cd varchar (20) NULL,
				bd_dpt_cd varchar (20) NULL,
				sub_dpt_cd1 varchar (20) NULL,
				sub_dpt_cd2 varchar (20) NULL,
				sub_dpt_cd3 varchar (20) NULL,
				act_usr_cd varchar (500) NULL,
				sls_usr_cd varchar (500) NULL,
				mfg_usr_cd varchar (500) NULL,
				purc_usr_cd varchar (500) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				itm_nm varchar (100) NULL,
				stk_mng_typ varchar (1) NULL,
				sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
				gi_loc_cd varchar (20) NULL,
				gi_str_ln_cd varchar (10) NULL,
				gr_loc_cd varchar (20) NULL,
				gr_str_ln_cd varchar (10) NULL,
				stk_arrv_bp_cd varchar (20) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				sno1_mng_typ varchar (1) NULL,
				sno2_mng_typ varchar (1) NULL,
				sno3_mng_typ varchar (1) NULL,
				sno4_mng_typ varchar (1) NULL,
				fix_no_typ varchar (1) NULL,
				fix_no varchar (15) NULL,
				gi_gd_cd varchar (2) NULL,
				gr_gd_cd varchar (2) NULL,
				in_xfr_typ varchar (1) NULL,
				quality_typ varchar (1) NULL,
				stk_insp_typ varchar (1) NULL,
				stk_id_typ varchar (1) NULL,
				stk_bp_cd varchar (20) NULL,
				trd_unit_qty numeric (21,8) NULL,
				trd_unit_cd varchar (5) NULL,
				pack_unit_qty numeric (21,8) NULL,
				pack_unit_cd varchar (5) NULL,
				base_unit_qty numeric (21,8) NULL,
				base_unit_cd varchar (5) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_upri numeric (21,8) NULL,
				trd_cur_amt numeric (21,8) NULL,
				trd_cur_proc_amt numeric (21,8) NULL,
				trd_cur_onr_prov_amt numeric (21,8) NULL,
				trd_cur_tax_amt numeric (21,8) NULL,
				base_cur_cd varchar (3) NULL,
				base_cur_upri numeric (21,8) NULL,
				base_cur_amt numeric (21,8) NULL,
				base_cur_proc_amt numeric (21,8) NULL,
				base_cur_onr_prov_amt numeric (21,8) NULL,
				base_cur_tax_amt numeric (21,8) NULL,
				ptax_cur_cd varchar (3) NULL,
				ptax_cur_upri numeric (21,8) NULL,
				ptax_cur_amt numeric (21,8) NULL,
				ptax_cur_proc_amt numeric (21,8) NULL,
				ptax_cur_onr_prov_amt numeric (21,8) NULL,
				ptax_cur_tax_amt numeric (21,8) NULL,
				wtax_rate numeric (5,2) NULL,
				wtax_amt numeric (21,8) NULL,
				tax_cd varchar (5) NULL,
				xrate_cd varchar (2) NULL,
				xrate numeric (21,8) NULL,
				ptax_xrate_cd varchar (2) NULL,
				ptax_xrate numeric (21,8) NULL,
				slo_no varchar (15) NULL,
				po_no varchar (15) NULL,
				iv_no varchar (15) NULL,
				rcpt_iv_no varchar (15) NULL,
				bd_ctg_cd varchar (20) NULL,
				bd_bp_cd varchar (20) NULL,
				bd_oper_cd varchar (10) NULL,
				bd_loc_cd varchar (20) NULL,
				bd_slo_no varchar (15) NULL,
				bd_po_no varchar (15) NULL,
				bd_iv_no varchar (15) NULL,
				bd_wg_cd varchar (10) NULL,
				dlv_cd varchar (20) NULL,
				tdlv_cd varchar (20) NULL,
				acst_cd varchar (20) NULL,
				cst_cd varchar (20) NULL,
				dest_cd1 varchar (20) NULL,
				dest_cd2 varchar (20) NULL,
				dest_cd3 varchar (20) NULL,
				asppl_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				spot_flg char (1) DEFAULT '0' NOT NULL,
				sttl_schd_dt timestamp(0)  NULL,
				sttl_cd varchar (10) NULL,
				cst_itm_cd varchar (40) NULL,
				cst_itm_nm varchar (100) NULL,
				sppl_itm_cd varchar (40) NULL,
				sppl_itm_nm varchar (100) NULL,
				purc_typ varchar (1) NULL,
				itm_mfg_inst_no varchar (15) NULL,
				itm_inst_qty numeric (21,8) NULL,
				mfg_inst_no varchar (15) NULL,
				mfg_act_no varchar (15) NULL,
				mfg_st_qty numeric (21,8) NULL,
				oper_act_no varchar (15) NULL,
				yield_rate numeric (5,2) NULL,
				disp_seq numeric (9,0) NULL,
				oper_cd varchar (10) NULL,
				inpt_loc_cd varchar (20) NULL,
				inpt_str_ln_cd varchar (10) NULL,
				strg_loc_cd varchar (20) NULL,
				strg_str_ln_cd varchar (10) NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_itm_nm varchar (100) NULL,
				par_lot_no varchar (15) NULL,
				par_sublot_no varchar (15) NULL,
				par_sno1 varchar (15) NULL,
				par_sno2 varchar (15) NULL,
				par_sno3 varchar (15) NULL,
				par_sno4 varchar (15) NULL,
				stktk_diff_qty numeric (21,8) NULL,
				pack_xfr_unit_cd varchar (5) NULL,
				pack_xfr_qty numeric (21,8) NULL,
				mfg_inst_unit_typ varchar (1) NULL,
				via_dlv_typ varchar (1) NULL,
				arr_ptn_typ varchar (1) NULL,
				yield_typ varchar (1) NULL,
				prov_typ varchar (1) NULL,
				purc_id_typ varchar (1) NULL,
				io_typ varchar (1) NULL,
				accpt_dfct_flg char (1) DEFAULT '0' NOT NULL,
				par_slip_io_act_typ varchar (5) NULL,
				no_gi_alloc_flg char (1) DEFAULT '0' NOT NULL,
				acxfr_stk_id_typ varchar (1) NULL,
				acxfr_stk_bp_cd varchar (20) NULL,
				acxfr_stk_arrv_bp_cd varchar (20) NULL,
				trd_rmrks varchar (100) NULL,
				trd_d_rmrks varchar (100) NULL,
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
				rsn_cd2 varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_io_act$temp
				ADD CONSTRAINT msw_io_act_ck01 CHECK (un_fix_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
				ADD CONSTRAINT msw_io_act_ck02 CHECK (temp_ap_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
				ADD CONSTRAINT msw_io_act_ck03 CHECK (sundry_itm_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
				ADD CONSTRAINT msw_io_act_ck04 CHECK (spot_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
				ADD CONSTRAINT msw_io_act_ck05 CHECK (accpt_dfct_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
				ADD CONSTRAINT msw_io_act_ck06 CHECK (no_gi_alloc_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_io_act$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_io_act$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_io_act
AS
SELECT *
FROM msw_io_act();
ALTER VIEW msw_io_act ALTER COLUMN un_fix_flg SET DEFAULT '0';
ALTER VIEW msw_io_act ALTER COLUMN temp_ap_flg SET DEFAULT '0';
ALTER VIEW msw_io_act ALTER COLUMN sundry_itm_flg SET DEFAULT '0';
ALTER VIEW msw_io_act ALTER COLUMN spot_flg SET DEFAULT '0';
ALTER VIEW msw_io_act ALTER COLUMN accpt_dfct_flg SET DEFAULT '0';
ALTER VIEW msw_io_act ALTER COLUMN no_gi_alloc_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION msw_io_act$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_io_act$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_io_act$temp(
				data_crud_typ varchar (1) NOT NULL,
				ac_dt timestamp(0)  NULL,
				can_ac_dt timestamp(0)  NULL,
				act_tm timestamp(0)  NULL,
				act_no varchar (15) NULL,
				act_seq numeric (4,0) NULL,
				act_rev_no numeric (4,0) NULL,
				act_d_no varchar (15) NULL,
				act_d_seq numeric (4,0) NULL,
				act_io_no varchar (15) NULL,
				act_io_seq numeric (4,0) NULL,
				un_fix_flg char (1) DEFAULT '0' NOT NULL,
				temp_ap_flg char (1) DEFAULT '0' NOT NULL,
				trd_cd varchar (4) NULL,
				trd_ptn_typ varchar (4) NULL,
				trn_typ varchar (4) NULL,
				io_act_typ varchar (5) NULL,
				rsn_cd varchar (10) NULL,
				gi_wg_cd varchar (10) NULL,
				gr_wg_cd varchar (10) NULL,
				act_dpt_cd varchar (20) NULL,
				purc_dpt_cd varchar (20) NULL,
				ap_dpt_cd varchar (20) NULL,
				sls_dpt_cd varchar (20) NULL,
				ar_dpt_cd varchar (20) NULL,
				bd_dpt_cd varchar (20) NULL,
				sub_dpt_cd1 varchar (20) NULL,
				sub_dpt_cd2 varchar (20) NULL,
				sub_dpt_cd3 varchar (20) NULL,
				act_usr_cd varchar (500) NULL,
				sls_usr_cd varchar (500) NULL,
				mfg_usr_cd varchar (500) NULL,
				purc_usr_cd varchar (500) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) NULL,
				itm_sub2 varchar (5) NULL,
				itm_sub3 varchar (5) NULL,
				itm_nm varchar (100) NULL,
				stk_mng_typ varchar (1) NULL,
				sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
				gi_loc_cd varchar (20) NULL,
				gi_str_ln_cd varchar (10) NULL,
				gr_loc_cd varchar (20) NULL,
				gr_str_ln_cd varchar (10) NULL,
				stk_arrv_bp_cd varchar (20) NULL,
				lot_no varchar (15) NULL,
				sublot_no varchar (15) NULL,
				sno1 varchar (15) NULL,
				sno2 varchar (15) NULL,
				sno3 varchar (15) NULL,
				sno4 varchar (15) NULL,
				sno1_mng_typ varchar (1) NULL,
				sno2_mng_typ varchar (1) NULL,
				sno3_mng_typ varchar (1) NULL,
				sno4_mng_typ varchar (1) NULL,
				fix_no_typ varchar (1) NULL,
				fix_no varchar (15) NULL,
				gi_gd_cd varchar (2) NULL,
				gr_gd_cd varchar (2) NULL,
				in_xfr_typ varchar (1) NULL,
				quality_typ varchar (1) NULL,
				stk_insp_typ varchar (1) NULL,
				stk_id_typ varchar (1) NULL,
				stk_bp_cd varchar (20) NULL,
				trd_unit_qty numeric (21,8) NULL,
				trd_unit_cd varchar (5) NULL,
				pack_unit_qty numeric (21,8) NULL,
				pack_unit_cd varchar (5) NULL,
				base_unit_qty numeric (21,8) NULL,
				base_unit_cd varchar (5) NULL,
				trd_cur_cd varchar (3) NULL,
				trd_cur_upri numeric (21,8) NULL,
				trd_cur_amt numeric (21,8) NULL,
				trd_cur_proc_amt numeric (21,8) NULL,
				trd_cur_onr_prov_amt numeric (21,8) NULL,
				trd_cur_tax_amt numeric (21,8) NULL,
				base_cur_cd varchar (3) NULL,
				base_cur_upri numeric (21,8) NULL,
				base_cur_amt numeric (21,8) NULL,
				base_cur_proc_amt numeric (21,8) NULL,
				base_cur_onr_prov_amt numeric (21,8) NULL,
				base_cur_tax_amt numeric (21,8) NULL,
				ptax_cur_cd varchar (3) NULL,
				ptax_cur_upri numeric (21,8) NULL,
				ptax_cur_amt numeric (21,8) NULL,
				ptax_cur_proc_amt numeric (21,8) NULL,
				ptax_cur_onr_prov_amt numeric (21,8) NULL,
				ptax_cur_tax_amt numeric (21,8) NULL,
				wtax_rate numeric (5,2) NULL,
				wtax_amt numeric (21,8) NULL,
				tax_cd varchar (5) NULL,
				xrate_cd varchar (2) NULL,
				xrate numeric (21,8) NULL,
				ptax_xrate_cd varchar (2) NULL,
				ptax_xrate numeric (21,8) NULL,
				slo_no varchar (15) NULL,
				po_no varchar (15) NULL,
				iv_no varchar (15) NULL,
				rcpt_iv_no varchar (15) NULL,
				bd_ctg_cd varchar (20) NULL,
				bd_bp_cd varchar (20) NULL,
				bd_oper_cd varchar (10) NULL,
				bd_loc_cd varchar (20) NULL,
				bd_slo_no varchar (15) NULL,
				bd_po_no varchar (15) NULL,
				bd_iv_no varchar (15) NULL,
				bd_wg_cd varchar (10) NULL,
				dlv_cd varchar (20) NULL,
				tdlv_cd varchar (20) NULL,
				acst_cd varchar (20) NULL,
				cst_cd varchar (20) NULL,
				dest_cd1 varchar (20) NULL,
				dest_cd2 varchar (20) NULL,
				dest_cd3 varchar (20) NULL,
				asppl_cd varchar (20) NULL,
				sppl_cd varchar (20) NULL,
				spot_flg char (1) DEFAULT '0' NOT NULL,
				sttl_schd_dt timestamp(0)  NULL,
				sttl_cd varchar (10) NULL,
				cst_itm_cd varchar (40) NULL,
				cst_itm_nm varchar (100) NULL,
				sppl_itm_cd varchar (40) NULL,
				sppl_itm_nm varchar (100) NULL,
				purc_typ varchar (1) NULL,
				itm_mfg_inst_no varchar (15) NULL,
				itm_inst_qty numeric (21,8) NULL,
				mfg_inst_no varchar (15) NULL,
				mfg_act_no varchar (15) NULL,
				mfg_st_qty numeric (21,8) NULL,
				oper_act_no varchar (15) NULL,
				yield_rate numeric (5,2) NULL,
				disp_seq numeric (9,0) NULL,
				oper_cd varchar (10) NULL,
				inpt_loc_cd varchar (20) NULL,
				inpt_str_ln_cd varchar (10) NULL,
				strg_loc_cd varchar (20) NULL,
				strg_str_ln_cd varchar (10) NULL,
				par_itm_cd varchar (40) NULL,
				par_itm_sub1 varchar (5) NULL,
				par_itm_sub2 varchar (5) NULL,
				par_itm_sub3 varchar (5) NULL,
				par_itm_nm varchar (100) NULL,
				par_lot_no varchar (15) NULL,
				par_sublot_no varchar (15) NULL,
				par_sno1 varchar (15) NULL,
				par_sno2 varchar (15) NULL,
				par_sno3 varchar (15) NULL,
				par_sno4 varchar (15) NULL,
				stktk_diff_qty numeric (21,8) NULL,
				pack_xfr_unit_cd varchar (5) NULL,
				pack_xfr_qty numeric (21,8) NULL,
				mfg_inst_unit_typ varchar (1) NULL,
				via_dlv_typ varchar (1) NULL,
				arr_ptn_typ varchar (1) NULL,
				yield_typ varchar (1) NULL,
				prov_typ varchar (1) NULL,
				purc_id_typ varchar (1) NULL,
				io_typ varchar (1) NULL,
				accpt_dfct_flg char (1) DEFAULT '0' NOT NULL,
				par_slip_io_act_typ varchar (5) NULL,
				no_gi_alloc_flg char (1) DEFAULT '0' NOT NULL,
				acxfr_stk_id_typ varchar (1) NULL,
				acxfr_stk_bp_cd varchar (20) NULL,
				acxfr_stk_arrv_bp_cd varchar (20) NULL,
				trd_rmrks varchar (100) NULL,
				trd_d_rmrks varchar (100) NULL,
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
				rsn_cd2 varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE msw_io_act$temp
			ADD CONSTRAINT msw_io_act_ck01 CHECK (un_fix_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
			ADD CONSTRAINT msw_io_act_ck02 CHECK (temp_ap_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
			ADD CONSTRAINT msw_io_act_ck03 CHECK (sundry_itm_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
			ADD CONSTRAINT msw_io_act_ck04 CHECK (spot_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
			ADD CONSTRAINT msw_io_act_ck05 CHECK (accpt_dfct_flg IN ('0', '1'));
			ALTER TABLE msw_io_act$temp
			ADD CONSTRAINT msw_io_act_ck06 CHECK (no_gi_alloc_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_io_act$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_io_act$temp(
			data_crud_typ,
			ac_dt,
			can_ac_dt,
			act_tm,
			act_no,
			act_seq,
			act_rev_no,
			act_d_no,
			act_d_seq,
			act_io_no,
			act_io_seq,
			un_fix_flg,
			temp_ap_flg,
			trd_cd,
			trd_ptn_typ,
			trn_typ,
			io_act_typ,
			rsn_cd,
			gi_wg_cd,
			gr_wg_cd,
			act_dpt_cd,
			purc_dpt_cd,
			ap_dpt_cd,
			sls_dpt_cd,
			ar_dpt_cd,
			bd_dpt_cd,
			sub_dpt_cd1,
			sub_dpt_cd2,
			sub_dpt_cd3,
			act_usr_cd,
			sls_usr_cd,
			mfg_usr_cd,
			purc_usr_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_nm,
			stk_mng_typ,
			sundry_itm_flg,
			gi_loc_cd,
			gi_str_ln_cd,
			gr_loc_cd,
			gr_str_ln_cd,
			stk_arrv_bp_cd,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			sno1_mng_typ,
			sno2_mng_typ,
			sno3_mng_typ,
			sno4_mng_typ,
			fix_no_typ,
			fix_no,
			gi_gd_cd,
			gr_gd_cd,
			in_xfr_typ,
			quality_typ,
			stk_insp_typ,
			stk_id_typ,
			stk_bp_cd,
			trd_unit_qty,
			trd_unit_cd,
			pack_unit_qty,
			pack_unit_cd,
			base_unit_qty,
			base_unit_cd,
			trd_cur_cd,
			trd_cur_upri,
			trd_cur_amt,
			trd_cur_proc_amt,
			trd_cur_onr_prov_amt,
			trd_cur_tax_amt,
			base_cur_cd,
			base_cur_upri,
			base_cur_amt,
			base_cur_proc_amt,
			base_cur_onr_prov_amt,
			base_cur_tax_amt,
			ptax_cur_cd,
			ptax_cur_upri,
			ptax_cur_amt,
			ptax_cur_proc_amt,
			ptax_cur_onr_prov_amt,
			ptax_cur_tax_amt,
			wtax_rate,
			wtax_amt,
			tax_cd,
			xrate_cd,
			xrate,
			ptax_xrate_cd,
			ptax_xrate,
			slo_no,
			po_no,
			iv_no,
			rcpt_iv_no,
			bd_ctg_cd,
			bd_bp_cd,
			bd_oper_cd,
			bd_loc_cd,
			bd_slo_no,
			bd_po_no,
			bd_iv_no,
			bd_wg_cd,
			dlv_cd,
			tdlv_cd,
			acst_cd,
			cst_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			asppl_cd,
			sppl_cd,
			spot_flg,
			sttl_schd_dt,
			sttl_cd,
			cst_itm_cd,
			cst_itm_nm,
			sppl_itm_cd,
			sppl_itm_nm,
			purc_typ,
			itm_mfg_inst_no,
			itm_inst_qty,
			mfg_inst_no,
			mfg_act_no,
			mfg_st_qty,
			oper_act_no,
			yield_rate,
			disp_seq,
			oper_cd,
			inpt_loc_cd,
			inpt_str_ln_cd,
			strg_loc_cd,
			strg_str_ln_cd,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			par_itm_nm,
			par_lot_no,
			par_sublot_no,
			par_sno1,
			par_sno2,
			par_sno3,
			par_sno4,
			stktk_diff_qty,
			pack_xfr_unit_cd,
			pack_xfr_qty,
			mfg_inst_unit_typ,
			via_dlv_typ,
			arr_ptn_typ,
			yield_typ,
			prov_typ,
			purc_id_typ,
			io_typ,
			accpt_dfct_flg,
			par_slip_io_act_typ,
			no_gi_alloc_flg,
			acxfr_stk_id_typ,
			acxfr_stk_bp_cd,
			acxfr_stk_arrv_bp_cd,
			trd_rmrks,
			trd_d_rmrks,
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
			rsn_cd2
		)VALUES (
			NEW.data_crud_typ,
			NEW.ac_dt,
			NEW.can_ac_dt,
			NEW.act_tm,
			NEW.act_no,
			NEW.act_seq,
			NEW.act_rev_no,
			NEW.act_d_no,
			NEW.act_d_seq,
			NEW.act_io_no,
			NEW.act_io_seq,
			NEW.un_fix_flg,
			NEW.temp_ap_flg,
			NEW.trd_cd,
			NEW.trd_ptn_typ,
			NEW.trn_typ,
			NEW.io_act_typ,
			NEW.rsn_cd,
			NEW.gi_wg_cd,
			NEW.gr_wg_cd,
			NEW.act_dpt_cd,
			NEW.purc_dpt_cd,
			NEW.ap_dpt_cd,
			NEW.sls_dpt_cd,
			NEW.ar_dpt_cd,
			NEW.bd_dpt_cd,
			NEW.sub_dpt_cd1,
			NEW.sub_dpt_cd2,
			NEW.sub_dpt_cd3,
			NEW.act_usr_cd,
			NEW.sls_usr_cd,
			NEW.mfg_usr_cd,
			NEW.purc_usr_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_nm,
			NEW.stk_mng_typ,
			NEW.sundry_itm_flg,
			NEW.gi_loc_cd,
			NEW.gi_str_ln_cd,
			NEW.gr_loc_cd,
			NEW.gr_str_ln_cd,
			NEW.stk_arrv_bp_cd,
			NEW.lot_no,
			NEW.sublot_no,
			NEW.sno1,
			NEW.sno2,
			NEW.sno3,
			NEW.sno4,
			NEW.sno1_mng_typ,
			NEW.sno2_mng_typ,
			NEW.sno3_mng_typ,
			NEW.sno4_mng_typ,
			NEW.fix_no_typ,
			NEW.fix_no,
			NEW.gi_gd_cd,
			NEW.gr_gd_cd,
			NEW.in_xfr_typ,
			NEW.quality_typ,
			NEW.stk_insp_typ,
			NEW.stk_id_typ,
			NEW.stk_bp_cd,
			NEW.trd_unit_qty,
			NEW.trd_unit_cd,
			NEW.pack_unit_qty,
			NEW.pack_unit_cd,
			NEW.base_unit_qty,
			NEW.base_unit_cd,
			NEW.trd_cur_cd,
			NEW.trd_cur_upri,
			NEW.trd_cur_amt,
			NEW.trd_cur_proc_amt,
			NEW.trd_cur_onr_prov_amt,
			NEW.trd_cur_tax_amt,
			NEW.base_cur_cd,
			NEW.base_cur_upri,
			NEW.base_cur_amt,
			NEW.base_cur_proc_amt,
			NEW.base_cur_onr_prov_amt,
			NEW.base_cur_tax_amt,
			NEW.ptax_cur_cd,
			NEW.ptax_cur_upri,
			NEW.ptax_cur_amt,
			NEW.ptax_cur_proc_amt,
			NEW.ptax_cur_onr_prov_amt,
			NEW.ptax_cur_tax_amt,
			NEW.wtax_rate,
			NEW.wtax_amt,
			NEW.tax_cd,
			NEW.xrate_cd,
			NEW.xrate,
			NEW.ptax_xrate_cd,
			NEW.ptax_xrate,
			NEW.slo_no,
			NEW.po_no,
			NEW.iv_no,
			NEW.rcpt_iv_no,
			NEW.bd_ctg_cd,
			NEW.bd_bp_cd,
			NEW.bd_oper_cd,
			NEW.bd_loc_cd,
			NEW.bd_slo_no,
			NEW.bd_po_no,
			NEW.bd_iv_no,
			NEW.bd_wg_cd,
			NEW.dlv_cd,
			NEW.tdlv_cd,
			NEW.acst_cd,
			NEW.cst_cd,
			NEW.dest_cd1,
			NEW.dest_cd2,
			NEW.dest_cd3,
			NEW.asppl_cd,
			NEW.sppl_cd,
			NEW.spot_flg,
			NEW.sttl_schd_dt,
			NEW.sttl_cd,
			NEW.cst_itm_cd,
			NEW.cst_itm_nm,
			NEW.sppl_itm_cd,
			NEW.sppl_itm_nm,
			NEW.purc_typ,
			NEW.itm_mfg_inst_no,
			NEW.itm_inst_qty,
			NEW.mfg_inst_no,
			NEW.mfg_act_no,
			NEW.mfg_st_qty,
			NEW.oper_act_no,
			NEW.yield_rate,
			NEW.disp_seq,
			NEW.oper_cd,
			NEW.inpt_loc_cd,
			NEW.inpt_str_ln_cd,
			NEW.strg_loc_cd,
			NEW.strg_str_ln_cd,
			NEW.par_itm_cd,
			NEW.par_itm_sub1,
			NEW.par_itm_sub2,
			NEW.par_itm_sub3,
			NEW.par_itm_nm,
			NEW.par_lot_no,
			NEW.par_sublot_no,
			NEW.par_sno1,
			NEW.par_sno2,
			NEW.par_sno3,
			NEW.par_sno4,
			NEW.stktk_diff_qty,
			NEW.pack_xfr_unit_cd,
			NEW.pack_xfr_qty,
			NEW.mfg_inst_unit_typ,
			NEW.via_dlv_typ,
			NEW.arr_ptn_typ,
			NEW.yield_typ,
			NEW.prov_typ,
			NEW.purc_id_typ,
			NEW.io_typ,
			NEW.accpt_dfct_flg,
			NEW.par_slip_io_act_typ,
			NEW.no_gi_alloc_flg,
			NEW.acxfr_stk_id_typ,
			NEW.acxfr_stk_bp_cd,
			NEW.acxfr_stk_arrv_bp_cd,
			NEW.trd_rmrks,
			NEW.trd_d_rmrks,
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
			NEW.rsn_cd2
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_io_act$temp
		SET 
			data_crud_typ = NEW.data_crud_typ,
			ac_dt = NEW.ac_dt,
			can_ac_dt = NEW.can_ac_dt,
			act_tm = NEW.act_tm,
			act_no = NEW.act_no,
			act_seq = NEW.act_seq,
			act_rev_no = NEW.act_rev_no,
			act_d_no = NEW.act_d_no,
			act_d_seq = NEW.act_d_seq,
			act_io_no = NEW.act_io_no,
			act_io_seq = NEW.act_io_seq,
			un_fix_flg = NEW.un_fix_flg,
			temp_ap_flg = NEW.temp_ap_flg,
			trd_cd = NEW.trd_cd,
			trd_ptn_typ = NEW.trd_ptn_typ,
			trn_typ = NEW.trn_typ,
			io_act_typ = NEW.io_act_typ,
			rsn_cd = NEW.rsn_cd,
			gi_wg_cd = NEW.gi_wg_cd,
			gr_wg_cd = NEW.gr_wg_cd,
			act_dpt_cd = NEW.act_dpt_cd,
			purc_dpt_cd = NEW.purc_dpt_cd,
			ap_dpt_cd = NEW.ap_dpt_cd,
			sls_dpt_cd = NEW.sls_dpt_cd,
			ar_dpt_cd = NEW.ar_dpt_cd,
			bd_dpt_cd = NEW.bd_dpt_cd,
			sub_dpt_cd1 = NEW.sub_dpt_cd1,
			sub_dpt_cd2 = NEW.sub_dpt_cd2,
			sub_dpt_cd3 = NEW.sub_dpt_cd3,
			act_usr_cd = NEW.act_usr_cd,
			sls_usr_cd = NEW.sls_usr_cd,
			mfg_usr_cd = NEW.mfg_usr_cd,
			purc_usr_cd = NEW.purc_usr_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			itm_nm = NEW.itm_nm,
			stk_mng_typ = NEW.stk_mng_typ,
			sundry_itm_flg = NEW.sundry_itm_flg,
			gi_loc_cd = NEW.gi_loc_cd,
			gi_str_ln_cd = NEW.gi_str_ln_cd,
			gr_loc_cd = NEW.gr_loc_cd,
			gr_str_ln_cd = NEW.gr_str_ln_cd,
			stk_arrv_bp_cd = NEW.stk_arrv_bp_cd,
			lot_no = NEW.lot_no,
			sublot_no = NEW.sublot_no,
			sno1 = NEW.sno1,
			sno2 = NEW.sno2,
			sno3 = NEW.sno3,
			sno4 = NEW.sno4,
			sno1_mng_typ = NEW.sno1_mng_typ,
			sno2_mng_typ = NEW.sno2_mng_typ,
			sno3_mng_typ = NEW.sno3_mng_typ,
			sno4_mng_typ = NEW.sno4_mng_typ,
			fix_no_typ = NEW.fix_no_typ,
			fix_no = NEW.fix_no,
			gi_gd_cd = NEW.gi_gd_cd,
			gr_gd_cd = NEW.gr_gd_cd,
			in_xfr_typ = NEW.in_xfr_typ,
			quality_typ = NEW.quality_typ,
			stk_insp_typ = NEW.stk_insp_typ,
			stk_id_typ = NEW.stk_id_typ,
			stk_bp_cd = NEW.stk_bp_cd,
			trd_unit_qty = NEW.trd_unit_qty,
			trd_unit_cd = NEW.trd_unit_cd,
			pack_unit_qty = NEW.pack_unit_qty,
			pack_unit_cd = NEW.pack_unit_cd,
			base_unit_qty = NEW.base_unit_qty,
			base_unit_cd = NEW.base_unit_cd,
			trd_cur_cd = NEW.trd_cur_cd,
			trd_cur_upri = NEW.trd_cur_upri,
			trd_cur_amt = NEW.trd_cur_amt,
			trd_cur_proc_amt = NEW.trd_cur_proc_amt,
			trd_cur_onr_prov_amt = NEW.trd_cur_onr_prov_amt,
			trd_cur_tax_amt = NEW.trd_cur_tax_amt,
			base_cur_cd = NEW.base_cur_cd,
			base_cur_upri = NEW.base_cur_upri,
			base_cur_amt = NEW.base_cur_amt,
			base_cur_proc_amt = NEW.base_cur_proc_amt,
			base_cur_onr_prov_amt = NEW.base_cur_onr_prov_amt,
			base_cur_tax_amt = NEW.base_cur_tax_amt,
			ptax_cur_cd = NEW.ptax_cur_cd,
			ptax_cur_upri = NEW.ptax_cur_upri,
			ptax_cur_amt = NEW.ptax_cur_amt,
			ptax_cur_proc_amt = NEW.ptax_cur_proc_amt,
			ptax_cur_onr_prov_amt = NEW.ptax_cur_onr_prov_amt,
			ptax_cur_tax_amt = NEW.ptax_cur_tax_amt,
			wtax_rate = NEW.wtax_rate,
			wtax_amt = NEW.wtax_amt,
			tax_cd = NEW.tax_cd,
			xrate_cd = NEW.xrate_cd,
			xrate = NEW.xrate,
			ptax_xrate_cd = NEW.ptax_xrate_cd,
			ptax_xrate = NEW.ptax_xrate,
			slo_no = NEW.slo_no,
			po_no = NEW.po_no,
			iv_no = NEW.iv_no,
			rcpt_iv_no = NEW.rcpt_iv_no,
			bd_ctg_cd = NEW.bd_ctg_cd,
			bd_bp_cd = NEW.bd_bp_cd,
			bd_oper_cd = NEW.bd_oper_cd,
			bd_loc_cd = NEW.bd_loc_cd,
			bd_slo_no = NEW.bd_slo_no,
			bd_po_no = NEW.bd_po_no,
			bd_iv_no = NEW.bd_iv_no,
			bd_wg_cd = NEW.bd_wg_cd,
			dlv_cd = NEW.dlv_cd,
			tdlv_cd = NEW.tdlv_cd,
			acst_cd = NEW.acst_cd,
			cst_cd = NEW.cst_cd,
			dest_cd1 = NEW.dest_cd1,
			dest_cd2 = NEW.dest_cd2,
			dest_cd3 = NEW.dest_cd3,
			asppl_cd = NEW.asppl_cd,
			sppl_cd = NEW.sppl_cd,
			spot_flg = NEW.spot_flg,
			sttl_schd_dt = NEW.sttl_schd_dt,
			sttl_cd = NEW.sttl_cd,
			cst_itm_cd = NEW.cst_itm_cd,
			cst_itm_nm = NEW.cst_itm_nm,
			sppl_itm_cd = NEW.sppl_itm_cd,
			sppl_itm_nm = NEW.sppl_itm_nm,
			purc_typ = NEW.purc_typ,
			itm_mfg_inst_no = NEW.itm_mfg_inst_no,
			itm_inst_qty = NEW.itm_inst_qty,
			mfg_inst_no = NEW.mfg_inst_no,
			mfg_act_no = NEW.mfg_act_no,
			mfg_st_qty = NEW.mfg_st_qty,
			oper_act_no = NEW.oper_act_no,
			yield_rate = NEW.yield_rate,
			disp_seq = NEW.disp_seq,
			oper_cd = NEW.oper_cd,
			inpt_loc_cd = NEW.inpt_loc_cd,
			inpt_str_ln_cd = NEW.inpt_str_ln_cd,
			strg_loc_cd = NEW.strg_loc_cd,
			strg_str_ln_cd = NEW.strg_str_ln_cd,
			par_itm_cd = NEW.par_itm_cd,
			par_itm_sub1 = NEW.par_itm_sub1,
			par_itm_sub2 = NEW.par_itm_sub2,
			par_itm_sub3 = NEW.par_itm_sub3,
			par_itm_nm = NEW.par_itm_nm,
			par_lot_no = NEW.par_lot_no,
			par_sublot_no = NEW.par_sublot_no,
			par_sno1 = NEW.par_sno1,
			par_sno2 = NEW.par_sno2,
			par_sno3 = NEW.par_sno3,
			par_sno4 = NEW.par_sno4,
			stktk_diff_qty = NEW.stktk_diff_qty,
			pack_xfr_unit_cd = NEW.pack_xfr_unit_cd,
			pack_xfr_qty = NEW.pack_xfr_qty,
			mfg_inst_unit_typ = NEW.mfg_inst_unit_typ,
			via_dlv_typ = NEW.via_dlv_typ,
			arr_ptn_typ = NEW.arr_ptn_typ,
			yield_typ = NEW.yield_typ,
			prov_typ = NEW.prov_typ,
			purc_id_typ = NEW.purc_id_typ,
			io_typ = NEW.io_typ,
			accpt_dfct_flg = NEW.accpt_dfct_flg,
			par_slip_io_act_typ = NEW.par_slip_io_act_typ,
			no_gi_alloc_flg = NEW.no_gi_alloc_flg,
			acxfr_stk_id_typ = NEW.acxfr_stk_id_typ,
			acxfr_stk_bp_cd = NEW.acxfr_stk_bp_cd,
			acxfr_stk_arrv_bp_cd = NEW.acxfr_stk_arrv_bp_cd,
			trd_rmrks = NEW.trd_rmrks,
			trd_d_rmrks = NEW.trd_d_rmrks,
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
			rsn_cd2 = NEW.rsn_cd2
		WHERE 0=0
		AND data_crud_typ = OLD.data_crud_typ
		AND (ac_dt = OLD.ac_dt OR ac_dt IS NULL AND OLD.ac_dt IS NULL)
		AND (can_ac_dt = OLD.can_ac_dt OR can_ac_dt IS NULL AND OLD.can_ac_dt IS NULL)
		AND (act_tm = OLD.act_tm OR act_tm IS NULL AND OLD.act_tm IS NULL)
		AND (act_no = OLD.act_no OR act_no IS NULL AND OLD.act_no IS NULL)
		AND (act_seq = OLD.act_seq OR act_seq IS NULL AND OLD.act_seq IS NULL)
		AND (act_rev_no = OLD.act_rev_no OR act_rev_no IS NULL AND OLD.act_rev_no IS NULL)
		AND (act_d_no = OLD.act_d_no OR act_d_no IS NULL AND OLD.act_d_no IS NULL)
		AND (act_d_seq = OLD.act_d_seq OR act_d_seq IS NULL AND OLD.act_d_seq IS NULL)
		AND (act_io_no = OLD.act_io_no OR act_io_no IS NULL AND OLD.act_io_no IS NULL)
		AND (act_io_seq = OLD.act_io_seq OR act_io_seq IS NULL AND OLD.act_io_seq IS NULL)
		AND un_fix_flg = OLD.un_fix_flg
		AND temp_ap_flg = OLD.temp_ap_flg
		AND (trd_cd = OLD.trd_cd OR trd_cd IS NULL AND OLD.trd_cd IS NULL)
		AND (trd_ptn_typ = OLD.trd_ptn_typ OR trd_ptn_typ IS NULL AND OLD.trd_ptn_typ IS NULL)
		AND (trn_typ = OLD.trn_typ OR trn_typ IS NULL AND OLD.trn_typ IS NULL)
		AND (io_act_typ = OLD.io_act_typ OR io_act_typ IS NULL AND OLD.io_act_typ IS NULL)
		AND (rsn_cd = OLD.rsn_cd OR rsn_cd IS NULL AND OLD.rsn_cd IS NULL)
		AND (gi_wg_cd = OLD.gi_wg_cd OR gi_wg_cd IS NULL AND OLD.gi_wg_cd IS NULL)
		AND (gr_wg_cd = OLD.gr_wg_cd OR gr_wg_cd IS NULL AND OLD.gr_wg_cd IS NULL)
		AND (act_dpt_cd = OLD.act_dpt_cd OR act_dpt_cd IS NULL AND OLD.act_dpt_cd IS NULL)
		AND (purc_dpt_cd = OLD.purc_dpt_cd OR purc_dpt_cd IS NULL AND OLD.purc_dpt_cd IS NULL)
		AND (ap_dpt_cd = OLD.ap_dpt_cd OR ap_dpt_cd IS NULL AND OLD.ap_dpt_cd IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (ar_dpt_cd = OLD.ar_dpt_cd OR ar_dpt_cd IS NULL AND OLD.ar_dpt_cd IS NULL)
		AND (bd_dpt_cd = OLD.bd_dpt_cd OR bd_dpt_cd IS NULL AND OLD.bd_dpt_cd IS NULL)
		AND (sub_dpt_cd1 = OLD.sub_dpt_cd1 OR sub_dpt_cd1 IS NULL AND OLD.sub_dpt_cd1 IS NULL)
		AND (sub_dpt_cd2 = OLD.sub_dpt_cd2 OR sub_dpt_cd2 IS NULL AND OLD.sub_dpt_cd2 IS NULL)
		AND (sub_dpt_cd3 = OLD.sub_dpt_cd3 OR sub_dpt_cd3 IS NULL AND OLD.sub_dpt_cd3 IS NULL)
		AND (act_usr_cd = OLD.act_usr_cd OR act_usr_cd IS NULL AND OLD.act_usr_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (mfg_usr_cd = OLD.mfg_usr_cd OR mfg_usr_cd IS NULL AND OLD.mfg_usr_cd IS NULL)
		AND (purc_usr_cd = OLD.purc_usr_cd OR purc_usr_cd IS NULL AND OLD.purc_usr_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND (stk_mng_typ = OLD.stk_mng_typ OR stk_mng_typ IS NULL AND OLD.stk_mng_typ IS NULL)
		AND sundry_itm_flg = OLD.sundry_itm_flg
		AND (gi_loc_cd = OLD.gi_loc_cd OR gi_loc_cd IS NULL AND OLD.gi_loc_cd IS NULL)
		AND (gi_str_ln_cd = OLD.gi_str_ln_cd OR gi_str_ln_cd IS NULL AND OLD.gi_str_ln_cd IS NULL)
		AND (gr_loc_cd = OLD.gr_loc_cd OR gr_loc_cd IS NULL AND OLD.gr_loc_cd IS NULL)
		AND (gr_str_ln_cd = OLD.gr_str_ln_cd OR gr_str_ln_cd IS NULL AND OLD.gr_str_ln_cd IS NULL)
		AND (stk_arrv_bp_cd = OLD.stk_arrv_bp_cd OR stk_arrv_bp_cd IS NULL AND OLD.stk_arrv_bp_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (sno1_mng_typ = OLD.sno1_mng_typ OR sno1_mng_typ IS NULL AND OLD.sno1_mng_typ IS NULL)
		AND (sno2_mng_typ = OLD.sno2_mng_typ OR sno2_mng_typ IS NULL AND OLD.sno2_mng_typ IS NULL)
		AND (sno3_mng_typ = OLD.sno3_mng_typ OR sno3_mng_typ IS NULL AND OLD.sno3_mng_typ IS NULL)
		AND (sno4_mng_typ = OLD.sno4_mng_typ OR sno4_mng_typ IS NULL AND OLD.sno4_mng_typ IS NULL)
		AND (fix_no_typ = OLD.fix_no_typ OR fix_no_typ IS NULL AND OLD.fix_no_typ IS NULL)
		AND (fix_no = OLD.fix_no OR fix_no IS NULL AND OLD.fix_no IS NULL)
		AND (gi_gd_cd = OLD.gi_gd_cd OR gi_gd_cd IS NULL AND OLD.gi_gd_cd IS NULL)
		AND (gr_gd_cd = OLD.gr_gd_cd OR gr_gd_cd IS NULL AND OLD.gr_gd_cd IS NULL)
		AND (in_xfr_typ = OLD.in_xfr_typ OR in_xfr_typ IS NULL AND OLD.in_xfr_typ IS NULL)
		AND (quality_typ = OLD.quality_typ OR quality_typ IS NULL AND OLD.quality_typ IS NULL)
		AND (stk_insp_typ = OLD.stk_insp_typ OR stk_insp_typ IS NULL AND OLD.stk_insp_typ IS NULL)
		AND (stk_id_typ = OLD.stk_id_typ OR stk_id_typ IS NULL AND OLD.stk_id_typ IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND (trd_unit_qty = OLD.trd_unit_qty OR trd_unit_qty IS NULL AND OLD.trd_unit_qty IS NULL)
		AND (trd_unit_cd = OLD.trd_unit_cd OR trd_unit_cd IS NULL AND OLD.trd_unit_cd IS NULL)
		AND (pack_unit_qty = OLD.pack_unit_qty OR pack_unit_qty IS NULL AND OLD.pack_unit_qty IS NULL)
		AND (pack_unit_cd = OLD.pack_unit_cd OR pack_unit_cd IS NULL AND OLD.pack_unit_cd IS NULL)
		AND (base_unit_qty = OLD.base_unit_qty OR base_unit_qty IS NULL AND OLD.base_unit_qty IS NULL)
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_upri = OLD.trd_cur_upri OR trd_cur_upri IS NULL AND OLD.trd_cur_upri IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (trd_cur_proc_amt = OLD.trd_cur_proc_amt OR trd_cur_proc_amt IS NULL AND OLD.trd_cur_proc_amt IS NULL)
		AND (trd_cur_onr_prov_amt = OLD.trd_cur_onr_prov_amt OR trd_cur_onr_prov_amt IS NULL AND OLD.trd_cur_onr_prov_amt IS NULL)
		AND (trd_cur_tax_amt = OLD.trd_cur_tax_amt OR trd_cur_tax_amt IS NULL AND OLD.trd_cur_tax_amt IS NULL)
		AND (base_cur_cd = OLD.base_cur_cd OR base_cur_cd IS NULL AND OLD.base_cur_cd IS NULL)
		AND (base_cur_upri = OLD.base_cur_upri OR base_cur_upri IS NULL AND OLD.base_cur_upri IS NULL)
		AND (base_cur_amt = OLD.base_cur_amt OR base_cur_amt IS NULL AND OLD.base_cur_amt IS NULL)
		AND (base_cur_proc_amt = OLD.base_cur_proc_amt OR base_cur_proc_amt IS NULL AND OLD.base_cur_proc_amt IS NULL)
		AND (base_cur_onr_prov_amt = OLD.base_cur_onr_prov_amt OR base_cur_onr_prov_amt IS NULL AND OLD.base_cur_onr_prov_amt IS NULL)
		AND (base_cur_tax_amt = OLD.base_cur_tax_amt OR base_cur_tax_amt IS NULL AND OLD.base_cur_tax_amt IS NULL)
		AND (ptax_cur_cd = OLD.ptax_cur_cd OR ptax_cur_cd IS NULL AND OLD.ptax_cur_cd IS NULL)
		AND (ptax_cur_upri = OLD.ptax_cur_upri OR ptax_cur_upri IS NULL AND OLD.ptax_cur_upri IS NULL)
		AND (ptax_cur_amt = OLD.ptax_cur_amt OR ptax_cur_amt IS NULL AND OLD.ptax_cur_amt IS NULL)
		AND (ptax_cur_proc_amt = OLD.ptax_cur_proc_amt OR ptax_cur_proc_amt IS NULL AND OLD.ptax_cur_proc_amt IS NULL)
		AND (ptax_cur_onr_prov_amt = OLD.ptax_cur_onr_prov_amt OR ptax_cur_onr_prov_amt IS NULL AND OLD.ptax_cur_onr_prov_amt IS NULL)
		AND (ptax_cur_tax_amt = OLD.ptax_cur_tax_amt OR ptax_cur_tax_amt IS NULL AND OLD.ptax_cur_tax_amt IS NULL)
		AND (wtax_rate = OLD.wtax_rate OR wtax_rate IS NULL AND OLD.wtax_rate IS NULL)
		AND (wtax_amt = OLD.wtax_amt OR wtax_amt IS NULL AND OLD.wtax_amt IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (ptax_xrate_cd = OLD.ptax_xrate_cd OR ptax_xrate_cd IS NULL AND OLD.ptax_xrate_cd IS NULL)
		AND (ptax_xrate = OLD.ptax_xrate OR ptax_xrate IS NULL AND OLD.ptax_xrate IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (rcpt_iv_no = OLD.rcpt_iv_no OR rcpt_iv_no IS NULL AND OLD.rcpt_iv_no IS NULL)
		AND (bd_ctg_cd = OLD.bd_ctg_cd OR bd_ctg_cd IS NULL AND OLD.bd_ctg_cd IS NULL)
		AND (bd_bp_cd = OLD.bd_bp_cd OR bd_bp_cd IS NULL AND OLD.bd_bp_cd IS NULL)
		AND (bd_oper_cd = OLD.bd_oper_cd OR bd_oper_cd IS NULL AND OLD.bd_oper_cd IS NULL)
		AND (bd_loc_cd = OLD.bd_loc_cd OR bd_loc_cd IS NULL AND OLD.bd_loc_cd IS NULL)
		AND (bd_slo_no = OLD.bd_slo_no OR bd_slo_no IS NULL AND OLD.bd_slo_no IS NULL)
		AND (bd_po_no = OLD.bd_po_no OR bd_po_no IS NULL AND OLD.bd_po_no IS NULL)
		AND (bd_iv_no = OLD.bd_iv_no OR bd_iv_no IS NULL AND OLD.bd_iv_no IS NULL)
		AND (bd_wg_cd = OLD.bd_wg_cd OR bd_wg_cd IS NULL AND OLD.bd_wg_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (tdlv_cd = OLD.tdlv_cd OR tdlv_cd IS NULL AND OLD.tdlv_cd IS NULL)
		AND (acst_cd = OLD.acst_cd OR acst_cd IS NULL AND OLD.acst_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dest_cd1 = OLD.dest_cd1 OR dest_cd1 IS NULL AND OLD.dest_cd1 IS NULL)
		AND (dest_cd2 = OLD.dest_cd2 OR dest_cd2 IS NULL AND OLD.dest_cd2 IS NULL)
		AND (dest_cd3 = OLD.dest_cd3 OR dest_cd3 IS NULL AND OLD.dest_cd3 IS NULL)
		AND (asppl_cd = OLD.asppl_cd OR asppl_cd IS NULL AND OLD.asppl_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND spot_flg = OLD.spot_flg
		AND (sttl_schd_dt = OLD.sttl_schd_dt OR sttl_schd_dt IS NULL AND OLD.sttl_schd_dt IS NULL)
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL)
		AND (cst_itm_cd = OLD.cst_itm_cd OR cst_itm_cd IS NULL AND OLD.cst_itm_cd IS NULL)
		AND (cst_itm_nm = OLD.cst_itm_nm OR cst_itm_nm IS NULL AND OLD.cst_itm_nm IS NULL)
		AND (sppl_itm_cd = OLD.sppl_itm_cd OR sppl_itm_cd IS NULL AND OLD.sppl_itm_cd IS NULL)
		AND (sppl_itm_nm = OLD.sppl_itm_nm OR sppl_itm_nm IS NULL AND OLD.sppl_itm_nm IS NULL)
		AND (purc_typ = OLD.purc_typ OR purc_typ IS NULL AND OLD.purc_typ IS NULL)
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (itm_inst_qty = OLD.itm_inst_qty OR itm_inst_qty IS NULL AND OLD.itm_inst_qty IS NULL)
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL)
		AND (mfg_act_no = OLD.mfg_act_no OR mfg_act_no IS NULL AND OLD.mfg_act_no IS NULL)
		AND (mfg_st_qty = OLD.mfg_st_qty OR mfg_st_qty IS NULL AND OLD.mfg_st_qty IS NULL)
		AND (oper_act_no = OLD.oper_act_no OR oper_act_no IS NULL AND OLD.oper_act_no IS NULL)
		AND (yield_rate = OLD.yield_rate OR yield_rate IS NULL AND OLD.yield_rate IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (inpt_loc_cd = OLD.inpt_loc_cd OR inpt_loc_cd IS NULL AND OLD.inpt_loc_cd IS NULL)
		AND (inpt_str_ln_cd = OLD.inpt_str_ln_cd OR inpt_str_ln_cd IS NULL AND OLD.inpt_str_ln_cd IS NULL)
		AND (strg_loc_cd = OLD.strg_loc_cd OR strg_loc_cd IS NULL AND OLD.strg_loc_cd IS NULL)
		AND (strg_str_ln_cd = OLD.strg_str_ln_cd OR strg_str_ln_cd IS NULL AND OLD.strg_str_ln_cd IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_itm_nm = OLD.par_itm_nm OR par_itm_nm IS NULL AND OLD.par_itm_nm IS NULL)
		AND (par_lot_no = OLD.par_lot_no OR par_lot_no IS NULL AND OLD.par_lot_no IS NULL)
		AND (par_sublot_no = OLD.par_sublot_no OR par_sublot_no IS NULL AND OLD.par_sublot_no IS NULL)
		AND (par_sno1 = OLD.par_sno1 OR par_sno1 IS NULL AND OLD.par_sno1 IS NULL)
		AND (par_sno2 = OLD.par_sno2 OR par_sno2 IS NULL AND OLD.par_sno2 IS NULL)
		AND (par_sno3 = OLD.par_sno3 OR par_sno3 IS NULL AND OLD.par_sno3 IS NULL)
		AND (par_sno4 = OLD.par_sno4 OR par_sno4 IS NULL AND OLD.par_sno4 IS NULL)
		AND (stktk_diff_qty = OLD.stktk_diff_qty OR stktk_diff_qty IS NULL AND OLD.stktk_diff_qty IS NULL)
		AND (pack_xfr_unit_cd = OLD.pack_xfr_unit_cd OR pack_xfr_unit_cd IS NULL AND OLD.pack_xfr_unit_cd IS NULL)
		AND (pack_xfr_qty = OLD.pack_xfr_qty OR pack_xfr_qty IS NULL AND OLD.pack_xfr_qty IS NULL)
		AND (mfg_inst_unit_typ = OLD.mfg_inst_unit_typ OR mfg_inst_unit_typ IS NULL AND OLD.mfg_inst_unit_typ IS NULL)
		AND (via_dlv_typ = OLD.via_dlv_typ OR via_dlv_typ IS NULL AND OLD.via_dlv_typ IS NULL)
		AND (arr_ptn_typ = OLD.arr_ptn_typ OR arr_ptn_typ IS NULL AND OLD.arr_ptn_typ IS NULL)
		AND (yield_typ = OLD.yield_typ OR yield_typ IS NULL AND OLD.yield_typ IS NULL)
		AND (prov_typ = OLD.prov_typ OR prov_typ IS NULL AND OLD.prov_typ IS NULL)
		AND (purc_id_typ = OLD.purc_id_typ OR purc_id_typ IS NULL AND OLD.purc_id_typ IS NULL)
		AND (io_typ = OLD.io_typ OR io_typ IS NULL AND OLD.io_typ IS NULL)
		AND accpt_dfct_flg = OLD.accpt_dfct_flg
		AND (par_slip_io_act_typ = OLD.par_slip_io_act_typ OR par_slip_io_act_typ IS NULL AND OLD.par_slip_io_act_typ IS NULL)
		AND no_gi_alloc_flg = OLD.no_gi_alloc_flg
		AND (acxfr_stk_id_typ = OLD.acxfr_stk_id_typ OR acxfr_stk_id_typ IS NULL AND OLD.acxfr_stk_id_typ IS NULL)
		AND (acxfr_stk_bp_cd = OLD.acxfr_stk_bp_cd OR acxfr_stk_bp_cd IS NULL AND OLD.acxfr_stk_bp_cd IS NULL)
		AND (acxfr_stk_arrv_bp_cd = OLD.acxfr_stk_arrv_bp_cd OR acxfr_stk_arrv_bp_cd IS NULL AND OLD.acxfr_stk_arrv_bp_cd IS NULL)
		AND (trd_rmrks = OLD.trd_rmrks OR trd_rmrks IS NULL AND OLD.trd_rmrks IS NULL)
		AND (trd_d_rmrks = OLD.trd_d_rmrks OR trd_d_rmrks IS NULL AND OLD.trd_d_rmrks IS NULL)
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
		AND (rsn_cd2 = OLD.rsn_cd2 OR rsn_cd2 IS NULL AND OLD.rsn_cd2 IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_io_act$temp
		WHERE 0=0
		AND data_crud_typ = OLD.data_crud_typ
		AND (ac_dt = OLD.ac_dt OR ac_dt IS NULL AND OLD.ac_dt IS NULL)
		AND (can_ac_dt = OLD.can_ac_dt OR can_ac_dt IS NULL AND OLD.can_ac_dt IS NULL)
		AND (act_tm = OLD.act_tm OR act_tm IS NULL AND OLD.act_tm IS NULL)
		AND (act_no = OLD.act_no OR act_no IS NULL AND OLD.act_no IS NULL)
		AND (act_seq = OLD.act_seq OR act_seq IS NULL AND OLD.act_seq IS NULL)
		AND (act_rev_no = OLD.act_rev_no OR act_rev_no IS NULL AND OLD.act_rev_no IS NULL)
		AND (act_d_no = OLD.act_d_no OR act_d_no IS NULL AND OLD.act_d_no IS NULL)
		AND (act_d_seq = OLD.act_d_seq OR act_d_seq IS NULL AND OLD.act_d_seq IS NULL)
		AND (act_io_no = OLD.act_io_no OR act_io_no IS NULL AND OLD.act_io_no IS NULL)
		AND (act_io_seq = OLD.act_io_seq OR act_io_seq IS NULL AND OLD.act_io_seq IS NULL)
		AND un_fix_flg = OLD.un_fix_flg
		AND temp_ap_flg = OLD.temp_ap_flg
		AND (trd_cd = OLD.trd_cd OR trd_cd IS NULL AND OLD.trd_cd IS NULL)
		AND (trd_ptn_typ = OLD.trd_ptn_typ OR trd_ptn_typ IS NULL AND OLD.trd_ptn_typ IS NULL)
		AND (trn_typ = OLD.trn_typ OR trn_typ IS NULL AND OLD.trn_typ IS NULL)
		AND (io_act_typ = OLD.io_act_typ OR io_act_typ IS NULL AND OLD.io_act_typ IS NULL)
		AND (rsn_cd = OLD.rsn_cd OR rsn_cd IS NULL AND OLD.rsn_cd IS NULL)
		AND (gi_wg_cd = OLD.gi_wg_cd OR gi_wg_cd IS NULL AND OLD.gi_wg_cd IS NULL)
		AND (gr_wg_cd = OLD.gr_wg_cd OR gr_wg_cd IS NULL AND OLD.gr_wg_cd IS NULL)
		AND (act_dpt_cd = OLD.act_dpt_cd OR act_dpt_cd IS NULL AND OLD.act_dpt_cd IS NULL)
		AND (purc_dpt_cd = OLD.purc_dpt_cd OR purc_dpt_cd IS NULL AND OLD.purc_dpt_cd IS NULL)
		AND (ap_dpt_cd = OLD.ap_dpt_cd OR ap_dpt_cd IS NULL AND OLD.ap_dpt_cd IS NULL)
		AND (sls_dpt_cd = OLD.sls_dpt_cd OR sls_dpt_cd IS NULL AND OLD.sls_dpt_cd IS NULL)
		AND (ar_dpt_cd = OLD.ar_dpt_cd OR ar_dpt_cd IS NULL AND OLD.ar_dpt_cd IS NULL)
		AND (bd_dpt_cd = OLD.bd_dpt_cd OR bd_dpt_cd IS NULL AND OLD.bd_dpt_cd IS NULL)
		AND (sub_dpt_cd1 = OLD.sub_dpt_cd1 OR sub_dpt_cd1 IS NULL AND OLD.sub_dpt_cd1 IS NULL)
		AND (sub_dpt_cd2 = OLD.sub_dpt_cd2 OR sub_dpt_cd2 IS NULL AND OLD.sub_dpt_cd2 IS NULL)
		AND (sub_dpt_cd3 = OLD.sub_dpt_cd3 OR sub_dpt_cd3 IS NULL AND OLD.sub_dpt_cd3 IS NULL)
		AND (act_usr_cd = OLD.act_usr_cd OR act_usr_cd IS NULL AND OLD.act_usr_cd IS NULL)
		AND (sls_usr_cd = OLD.sls_usr_cd OR sls_usr_cd IS NULL AND OLD.sls_usr_cd IS NULL)
		AND (mfg_usr_cd = OLD.mfg_usr_cd OR mfg_usr_cd IS NULL AND OLD.mfg_usr_cd IS NULL)
		AND (purc_usr_cd = OLD.purc_usr_cd OR purc_usr_cd IS NULL AND OLD.purc_usr_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (itm_nm = OLD.itm_nm OR itm_nm IS NULL AND OLD.itm_nm IS NULL)
		AND (stk_mng_typ = OLD.stk_mng_typ OR stk_mng_typ IS NULL AND OLD.stk_mng_typ IS NULL)
		AND sundry_itm_flg = OLD.sundry_itm_flg
		AND (gi_loc_cd = OLD.gi_loc_cd OR gi_loc_cd IS NULL AND OLD.gi_loc_cd IS NULL)
		AND (gi_str_ln_cd = OLD.gi_str_ln_cd OR gi_str_ln_cd IS NULL AND OLD.gi_str_ln_cd IS NULL)
		AND (gr_loc_cd = OLD.gr_loc_cd OR gr_loc_cd IS NULL AND OLD.gr_loc_cd IS NULL)
		AND (gr_str_ln_cd = OLD.gr_str_ln_cd OR gr_str_ln_cd IS NULL AND OLD.gr_str_ln_cd IS NULL)
		AND (stk_arrv_bp_cd = OLD.stk_arrv_bp_cd OR stk_arrv_bp_cd IS NULL AND OLD.stk_arrv_bp_cd IS NULL)
		AND (lot_no = OLD.lot_no OR lot_no IS NULL AND OLD.lot_no IS NULL)
		AND (sublot_no = OLD.sublot_no OR sublot_no IS NULL AND OLD.sublot_no IS NULL)
		AND (sno1 = OLD.sno1 OR sno1 IS NULL AND OLD.sno1 IS NULL)
		AND (sno2 = OLD.sno2 OR sno2 IS NULL AND OLD.sno2 IS NULL)
		AND (sno3 = OLD.sno3 OR sno3 IS NULL AND OLD.sno3 IS NULL)
		AND (sno4 = OLD.sno4 OR sno4 IS NULL AND OLD.sno4 IS NULL)
		AND (sno1_mng_typ = OLD.sno1_mng_typ OR sno1_mng_typ IS NULL AND OLD.sno1_mng_typ IS NULL)
		AND (sno2_mng_typ = OLD.sno2_mng_typ OR sno2_mng_typ IS NULL AND OLD.sno2_mng_typ IS NULL)
		AND (sno3_mng_typ = OLD.sno3_mng_typ OR sno3_mng_typ IS NULL AND OLD.sno3_mng_typ IS NULL)
		AND (sno4_mng_typ = OLD.sno4_mng_typ OR sno4_mng_typ IS NULL AND OLD.sno4_mng_typ IS NULL)
		AND (fix_no_typ = OLD.fix_no_typ OR fix_no_typ IS NULL AND OLD.fix_no_typ IS NULL)
		AND (fix_no = OLD.fix_no OR fix_no IS NULL AND OLD.fix_no IS NULL)
		AND (gi_gd_cd = OLD.gi_gd_cd OR gi_gd_cd IS NULL AND OLD.gi_gd_cd IS NULL)
		AND (gr_gd_cd = OLD.gr_gd_cd OR gr_gd_cd IS NULL AND OLD.gr_gd_cd IS NULL)
		AND (in_xfr_typ = OLD.in_xfr_typ OR in_xfr_typ IS NULL AND OLD.in_xfr_typ IS NULL)
		AND (quality_typ = OLD.quality_typ OR quality_typ IS NULL AND OLD.quality_typ IS NULL)
		AND (stk_insp_typ = OLD.stk_insp_typ OR stk_insp_typ IS NULL AND OLD.stk_insp_typ IS NULL)
		AND (stk_id_typ = OLD.stk_id_typ OR stk_id_typ IS NULL AND OLD.stk_id_typ IS NULL)
		AND (stk_bp_cd = OLD.stk_bp_cd OR stk_bp_cd IS NULL AND OLD.stk_bp_cd IS NULL)
		AND (trd_unit_qty = OLD.trd_unit_qty OR trd_unit_qty IS NULL AND OLD.trd_unit_qty IS NULL)
		AND (trd_unit_cd = OLD.trd_unit_cd OR trd_unit_cd IS NULL AND OLD.trd_unit_cd IS NULL)
		AND (pack_unit_qty = OLD.pack_unit_qty OR pack_unit_qty IS NULL AND OLD.pack_unit_qty IS NULL)
		AND (pack_unit_cd = OLD.pack_unit_cd OR pack_unit_cd IS NULL AND OLD.pack_unit_cd IS NULL)
		AND (base_unit_qty = OLD.base_unit_qty OR base_unit_qty IS NULL AND OLD.base_unit_qty IS NULL)
		AND (base_unit_cd = OLD.base_unit_cd OR base_unit_cd IS NULL AND OLD.base_unit_cd IS NULL)
		AND (trd_cur_cd = OLD.trd_cur_cd OR trd_cur_cd IS NULL AND OLD.trd_cur_cd IS NULL)
		AND (trd_cur_upri = OLD.trd_cur_upri OR trd_cur_upri IS NULL AND OLD.trd_cur_upri IS NULL)
		AND (trd_cur_amt = OLD.trd_cur_amt OR trd_cur_amt IS NULL AND OLD.trd_cur_amt IS NULL)
		AND (trd_cur_proc_amt = OLD.trd_cur_proc_amt OR trd_cur_proc_amt IS NULL AND OLD.trd_cur_proc_amt IS NULL)
		AND (trd_cur_onr_prov_amt = OLD.trd_cur_onr_prov_amt OR trd_cur_onr_prov_amt IS NULL AND OLD.trd_cur_onr_prov_amt IS NULL)
		AND (trd_cur_tax_amt = OLD.trd_cur_tax_amt OR trd_cur_tax_amt IS NULL AND OLD.trd_cur_tax_amt IS NULL)
		AND (base_cur_cd = OLD.base_cur_cd OR base_cur_cd IS NULL AND OLD.base_cur_cd IS NULL)
		AND (base_cur_upri = OLD.base_cur_upri OR base_cur_upri IS NULL AND OLD.base_cur_upri IS NULL)
		AND (base_cur_amt = OLD.base_cur_amt OR base_cur_amt IS NULL AND OLD.base_cur_amt IS NULL)
		AND (base_cur_proc_amt = OLD.base_cur_proc_amt OR base_cur_proc_amt IS NULL AND OLD.base_cur_proc_amt IS NULL)
		AND (base_cur_onr_prov_amt = OLD.base_cur_onr_prov_amt OR base_cur_onr_prov_amt IS NULL AND OLD.base_cur_onr_prov_amt IS NULL)
		AND (base_cur_tax_amt = OLD.base_cur_tax_amt OR base_cur_tax_amt IS NULL AND OLD.base_cur_tax_amt IS NULL)
		AND (ptax_cur_cd = OLD.ptax_cur_cd OR ptax_cur_cd IS NULL AND OLD.ptax_cur_cd IS NULL)
		AND (ptax_cur_upri = OLD.ptax_cur_upri OR ptax_cur_upri IS NULL AND OLD.ptax_cur_upri IS NULL)
		AND (ptax_cur_amt = OLD.ptax_cur_amt OR ptax_cur_amt IS NULL AND OLD.ptax_cur_amt IS NULL)
		AND (ptax_cur_proc_amt = OLD.ptax_cur_proc_amt OR ptax_cur_proc_amt IS NULL AND OLD.ptax_cur_proc_amt IS NULL)
		AND (ptax_cur_onr_prov_amt = OLD.ptax_cur_onr_prov_amt OR ptax_cur_onr_prov_amt IS NULL AND OLD.ptax_cur_onr_prov_amt IS NULL)
		AND (ptax_cur_tax_amt = OLD.ptax_cur_tax_amt OR ptax_cur_tax_amt IS NULL AND OLD.ptax_cur_tax_amt IS NULL)
		AND (wtax_rate = OLD.wtax_rate OR wtax_rate IS NULL AND OLD.wtax_rate IS NULL)
		AND (wtax_amt = OLD.wtax_amt OR wtax_amt IS NULL AND OLD.wtax_amt IS NULL)
		AND (tax_cd = OLD.tax_cd OR tax_cd IS NULL AND OLD.tax_cd IS NULL)
		AND (xrate_cd = OLD.xrate_cd OR xrate_cd IS NULL AND OLD.xrate_cd IS NULL)
		AND (xrate = OLD.xrate OR xrate IS NULL AND OLD.xrate IS NULL)
		AND (ptax_xrate_cd = OLD.ptax_xrate_cd OR ptax_xrate_cd IS NULL AND OLD.ptax_xrate_cd IS NULL)
		AND (ptax_xrate = OLD.ptax_xrate OR ptax_xrate IS NULL AND OLD.ptax_xrate IS NULL)
		AND (slo_no = OLD.slo_no OR slo_no IS NULL AND OLD.slo_no IS NULL)
		AND (po_no = OLD.po_no OR po_no IS NULL AND OLD.po_no IS NULL)
		AND (iv_no = OLD.iv_no OR iv_no IS NULL AND OLD.iv_no IS NULL)
		AND (rcpt_iv_no = OLD.rcpt_iv_no OR rcpt_iv_no IS NULL AND OLD.rcpt_iv_no IS NULL)
		AND (bd_ctg_cd = OLD.bd_ctg_cd OR bd_ctg_cd IS NULL AND OLD.bd_ctg_cd IS NULL)
		AND (bd_bp_cd = OLD.bd_bp_cd OR bd_bp_cd IS NULL AND OLD.bd_bp_cd IS NULL)
		AND (bd_oper_cd = OLD.bd_oper_cd OR bd_oper_cd IS NULL AND OLD.bd_oper_cd IS NULL)
		AND (bd_loc_cd = OLD.bd_loc_cd OR bd_loc_cd IS NULL AND OLD.bd_loc_cd IS NULL)
		AND (bd_slo_no = OLD.bd_slo_no OR bd_slo_no IS NULL AND OLD.bd_slo_no IS NULL)
		AND (bd_po_no = OLD.bd_po_no OR bd_po_no IS NULL AND OLD.bd_po_no IS NULL)
		AND (bd_iv_no = OLD.bd_iv_no OR bd_iv_no IS NULL AND OLD.bd_iv_no IS NULL)
		AND (bd_wg_cd = OLD.bd_wg_cd OR bd_wg_cd IS NULL AND OLD.bd_wg_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (tdlv_cd = OLD.tdlv_cd OR tdlv_cd IS NULL AND OLD.tdlv_cd IS NULL)
		AND (acst_cd = OLD.acst_cd OR acst_cd IS NULL AND OLD.acst_cd IS NULL)
		AND (cst_cd = OLD.cst_cd OR cst_cd IS NULL AND OLD.cst_cd IS NULL)
		AND (dest_cd1 = OLD.dest_cd1 OR dest_cd1 IS NULL AND OLD.dest_cd1 IS NULL)
		AND (dest_cd2 = OLD.dest_cd2 OR dest_cd2 IS NULL AND OLD.dest_cd2 IS NULL)
		AND (dest_cd3 = OLD.dest_cd3 OR dest_cd3 IS NULL AND OLD.dest_cd3 IS NULL)
		AND (asppl_cd = OLD.asppl_cd OR asppl_cd IS NULL AND OLD.asppl_cd IS NULL)
		AND (sppl_cd = OLD.sppl_cd OR sppl_cd IS NULL AND OLD.sppl_cd IS NULL)
		AND spot_flg = OLD.spot_flg
		AND (sttl_schd_dt = OLD.sttl_schd_dt OR sttl_schd_dt IS NULL AND OLD.sttl_schd_dt IS NULL)
		AND (sttl_cd = OLD.sttl_cd OR sttl_cd IS NULL AND OLD.sttl_cd IS NULL)
		AND (cst_itm_cd = OLD.cst_itm_cd OR cst_itm_cd IS NULL AND OLD.cst_itm_cd IS NULL)
		AND (cst_itm_nm = OLD.cst_itm_nm OR cst_itm_nm IS NULL AND OLD.cst_itm_nm IS NULL)
		AND (sppl_itm_cd = OLD.sppl_itm_cd OR sppl_itm_cd IS NULL AND OLD.sppl_itm_cd IS NULL)
		AND (sppl_itm_nm = OLD.sppl_itm_nm OR sppl_itm_nm IS NULL AND OLD.sppl_itm_nm IS NULL)
		AND (purc_typ = OLD.purc_typ OR purc_typ IS NULL AND OLD.purc_typ IS NULL)
		AND (itm_mfg_inst_no = OLD.itm_mfg_inst_no OR itm_mfg_inst_no IS NULL AND OLD.itm_mfg_inst_no IS NULL)
		AND (itm_inst_qty = OLD.itm_inst_qty OR itm_inst_qty IS NULL AND OLD.itm_inst_qty IS NULL)
		AND (mfg_inst_no = OLD.mfg_inst_no OR mfg_inst_no IS NULL AND OLD.mfg_inst_no IS NULL)
		AND (mfg_act_no = OLD.mfg_act_no OR mfg_act_no IS NULL AND OLD.mfg_act_no IS NULL)
		AND (mfg_st_qty = OLD.mfg_st_qty OR mfg_st_qty IS NULL AND OLD.mfg_st_qty IS NULL)
		AND (oper_act_no = OLD.oper_act_no OR oper_act_no IS NULL AND OLD.oper_act_no IS NULL)
		AND (yield_rate = OLD.yield_rate OR yield_rate IS NULL AND OLD.yield_rate IS NULL)
		AND (disp_seq = OLD.disp_seq OR disp_seq IS NULL AND OLD.disp_seq IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (inpt_loc_cd = OLD.inpt_loc_cd OR inpt_loc_cd IS NULL AND OLD.inpt_loc_cd IS NULL)
		AND (inpt_str_ln_cd = OLD.inpt_str_ln_cd OR inpt_str_ln_cd IS NULL AND OLD.inpt_str_ln_cd IS NULL)
		AND (strg_loc_cd = OLD.strg_loc_cd OR strg_loc_cd IS NULL AND OLD.strg_loc_cd IS NULL)
		AND (strg_str_ln_cd = OLD.strg_str_ln_cd OR strg_str_ln_cd IS NULL AND OLD.strg_str_ln_cd IS NULL)
		AND (par_itm_cd = OLD.par_itm_cd OR par_itm_cd IS NULL AND OLD.par_itm_cd IS NULL)
		AND (par_itm_sub1 = OLD.par_itm_sub1 OR par_itm_sub1 IS NULL AND OLD.par_itm_sub1 IS NULL)
		AND (par_itm_sub2 = OLD.par_itm_sub2 OR par_itm_sub2 IS NULL AND OLD.par_itm_sub2 IS NULL)
		AND (par_itm_sub3 = OLD.par_itm_sub3 OR par_itm_sub3 IS NULL AND OLD.par_itm_sub3 IS NULL)
		AND (par_itm_nm = OLD.par_itm_nm OR par_itm_nm IS NULL AND OLD.par_itm_nm IS NULL)
		AND (par_lot_no = OLD.par_lot_no OR par_lot_no IS NULL AND OLD.par_lot_no IS NULL)
		AND (par_sublot_no = OLD.par_sublot_no OR par_sublot_no IS NULL AND OLD.par_sublot_no IS NULL)
		AND (par_sno1 = OLD.par_sno1 OR par_sno1 IS NULL AND OLD.par_sno1 IS NULL)
		AND (par_sno2 = OLD.par_sno2 OR par_sno2 IS NULL AND OLD.par_sno2 IS NULL)
		AND (par_sno3 = OLD.par_sno3 OR par_sno3 IS NULL AND OLD.par_sno3 IS NULL)
		AND (par_sno4 = OLD.par_sno4 OR par_sno4 IS NULL AND OLD.par_sno4 IS NULL)
		AND (stktk_diff_qty = OLD.stktk_diff_qty OR stktk_diff_qty IS NULL AND OLD.stktk_diff_qty IS NULL)
		AND (pack_xfr_unit_cd = OLD.pack_xfr_unit_cd OR pack_xfr_unit_cd IS NULL AND OLD.pack_xfr_unit_cd IS NULL)
		AND (pack_xfr_qty = OLD.pack_xfr_qty OR pack_xfr_qty IS NULL AND OLD.pack_xfr_qty IS NULL)
		AND (mfg_inst_unit_typ = OLD.mfg_inst_unit_typ OR mfg_inst_unit_typ IS NULL AND OLD.mfg_inst_unit_typ IS NULL)
		AND (via_dlv_typ = OLD.via_dlv_typ OR via_dlv_typ IS NULL AND OLD.via_dlv_typ IS NULL)
		AND (arr_ptn_typ = OLD.arr_ptn_typ OR arr_ptn_typ IS NULL AND OLD.arr_ptn_typ IS NULL)
		AND (yield_typ = OLD.yield_typ OR yield_typ IS NULL AND OLD.yield_typ IS NULL)
		AND (prov_typ = OLD.prov_typ OR prov_typ IS NULL AND OLD.prov_typ IS NULL)
		AND (purc_id_typ = OLD.purc_id_typ OR purc_id_typ IS NULL AND OLD.purc_id_typ IS NULL)
		AND (io_typ = OLD.io_typ OR io_typ IS NULL AND OLD.io_typ IS NULL)
		AND accpt_dfct_flg = OLD.accpt_dfct_flg
		AND (par_slip_io_act_typ = OLD.par_slip_io_act_typ OR par_slip_io_act_typ IS NULL AND OLD.par_slip_io_act_typ IS NULL)
		AND no_gi_alloc_flg = OLD.no_gi_alloc_flg
		AND (acxfr_stk_id_typ = OLD.acxfr_stk_id_typ OR acxfr_stk_id_typ IS NULL AND OLD.acxfr_stk_id_typ IS NULL)
		AND (acxfr_stk_bp_cd = OLD.acxfr_stk_bp_cd OR acxfr_stk_bp_cd IS NULL AND OLD.acxfr_stk_bp_cd IS NULL)
		AND (acxfr_stk_arrv_bp_cd = OLD.acxfr_stk_arrv_bp_cd OR acxfr_stk_arrv_bp_cd IS NULL AND OLD.acxfr_stk_arrv_bp_cd IS NULL)
		AND (trd_rmrks = OLD.trd_rmrks OR trd_rmrks IS NULL AND OLD.trd_rmrks IS NULL)
		AND (trd_d_rmrks = OLD.trd_d_rmrks OR trd_d_rmrks IS NULL AND OLD.trd_d_rmrks IS NULL)
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
		AND (rsn_cd2 = OLD.rsn_cd2 OR rsn_cd2 IS NULL AND OLD.rsn_cd2 IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_io_act$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_io_act
FOR EACH ROW
EXECUTE PROCEDURE msw_io_act$func();
;

