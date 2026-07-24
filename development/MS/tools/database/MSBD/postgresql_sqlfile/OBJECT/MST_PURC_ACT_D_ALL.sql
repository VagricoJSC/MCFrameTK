\encoding UTF-8

CREATE TABLE mst_purc_act_d_all
(purc_act_d_no varchar (15) NOT NULL,
purc_act_d_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
purc_act_no varchar (15) NOT NULL,
purc_act_seq numeric (4,0) NOT NULL,
disp_seq numeric (5,0) NOT NULL,
purc_schd_no varchar (15) NULL,
purc_src_typ varchar (1) NULL,
purc_src_no varchar (15) NULL,
sync_flg char (1) DEFAULT '0' NOT NULL,
po_d_no varchar (15) NULL,
rcpt_iv_d_no varchar (15) NULL,
purc_ret_act_d_no varchar (15) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
ap_typ varchar (1) NULL,
purc_id_typ varchar (1) NOT NULL,
purc_typ varchar (1) NOT NULL,
mfg_inst_no varchar (15) NULL,
rsn_cd varchar (10) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
ver_no varchar (10) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sno1_mng_typ varchar (1) NOT NULL,
sno2_mng_typ varchar (1) NOT NULL,
sno3_mng_typ varchar (1) NOT NULL,
sno4_mng_typ varchar (1) NOT NULL,
in_to_loc_cd varchar (20) NULL,
in_to_loc_wg_cd varchar (10) NULL,
str_ln_cd varchar (10) NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
bp_lot_no varchar (15) NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
upri_not_tgt_flg char (1) NOT NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
temp_ap_flg char (1) DEFAULT '0' NOT NULL,
tax_cd varchar (5) NULL,
purc_dtl_upd_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_proc_upri numeric (21,8) NULL,
trd_cur_onr_prov_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_proc_amt numeric (21,8) NULL,
trd_cur_onr_prov_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
base_cur_upri numeric (21,8) NULL,
base_cur_proc_upri numeric (21,8) NULL,
base_cur_onr_prov_upri numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_proc_amt numeric (21,8) NULL,
base_cur_onr_prov_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
ptax_cur_upri numeric (21,8) NULL,
ptax_cur_proc_upri numeric (21,8) NULL,
ptax_cur_onr_prov_upri numeric (21,8) NULL,
ptax_cur_dscnt_amt numeric (21,8) NULL,
ptax_cur_proc_amt numeric (21,8) NULL,
ptax_cur_onr_prov_amt numeric (21,8) NULL,
ptax_cur_amt numeric (21,8) NULL,
ptax_cur_tax_amt numeric (21,8) NULL,
dscnt_rsn_cd varchar (10) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
ap_dpt_cd varchar (20) NULL,
pay_crryovr_times numeric (2,0) NULL,
ncv_flg char (1) DEFAULT '0' NOT NULL,
stk_mng_typ varchar (1) NOT NULL,
edi_flg char (1) DEFAULT '0' NOT NULL,
accpt_dfct_flg char (1) DEFAULT '0' NOT NULL,
re_arr_flg char (1) DEFAULT '0' NOT NULL,
re_arr_sync_flg char (1) DEFAULT '0' NOT NULL,
re_arr_loc_cd varchar (20) NULL,
re_arr_loc_wg_cd varchar (10) NULL,
re_arr_str_ln_cd varchar (10) DEFAULT '*' NULL,
re_arr_rqst_tm timestamp(0)  NULL,
re_arr_purc_schd_dt timestamp(0)  NULL,
trd_unit_re_arr_qty numeric (21,8) NULL,
base_unit_re_arr_qty numeric (21,8) NULL,
bd_itm_cd varchar (40) NULL,
bd_itm_sub1 varchar (5) NULL,
bd_itm_sub2 varchar (5) NULL,
bd_itm_sub3 varchar (5) NULL,
bd_sno1 varchar (15) NULL,
bd_sno2 varchar (15) NULL,
bd_sno3 varchar (15) NULL,
bd_sno4 varchar (15) NULL,
bd_loc_cd varchar (20) NULL,
bd_lot_no varchar (15) NULL,
bd_sublot_no varchar (15) NULL,
bd_dpt_cd varchar (20) NULL,
bd_wg_cd varchar (10) NULL,
bd_ctg_cd varchar (20) NULL,
bd_oper_cd varchar (10) NULL,
bd_slo_no varchar (15) NULL,
bd_iv_no varchar (15) NULL,
bd_po_no varchar (15) NULL,
bd_bp_cd varchar (20) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
ref_purc_act_no varchar (15) NULL,
ref_purc_act_seq numeric (4,0) NULL,
ref_purc_act_d_no varchar (15) NULL,
ref_purc_act_d_seq numeric (4,0) NULL,
base_purc_ac_dt timestamp(0)  NULL,
bp_dlv_slip_no varchar (15) NULL,
bp_dlv_slip_d_no varchar (15) NULL,
intr_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE mst_purc_act_d_all
ADD CONSTRAINT mst_purc_act_d_all_pk PRIMARY KEY(purc_act_d_no,purc_act_d_seq,co_cd);


CREATE INDEX mst_purc_act_d_all_ie01
ON mst_purc_act_d_all USING BTREE (purc_act_no, purc_act_seq, co_cd);


CREATE INDEX mst_purc_act_d_all_ie02
ON mst_purc_act_d_all USING BTREE (purc_schd_no, co_cd);


CREATE INDEX mst_purc_act_d_all_ie03
ON mst_purc_act_d_all USING BTREE (purc_src_no, purc_src_typ,co_cd);


CREATE INDEX mst_purc_act_d_all_ie04
ON mst_purc_act_d_all USING BTREE (po_d_no, co_cd);


CREATE INDEX mst_purc_act_d_all_ie05
ON mst_purc_act_d_all USING BTREE (purc_ret_act_d_no, co_cd);


CREATE INDEX mst_purc_act_d_all_ie06
ON mst_purc_act_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, lot_no, sublot_no,co_cd);


CREATE INDEX mst_purc_act_d_all_ie07
ON mst_purc_act_d_all USING BTREE (in_to_loc_cd,str_ln_cd,co_cd);

