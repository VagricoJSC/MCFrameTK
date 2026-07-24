\encoding UTF-8

CREATE TABLE mam_bp_all
(bp_cd varchar (20) NOT NULL,
bp_nm varchar (100) NOT NULL,
bp_alt_nm1 varchar (100) NULL,
bp_alt_nm2 varchar (100) NULL,
bp_alt_nm3 varchar (100) NULL,
bp_alt_nm4 varchar (100) NULL,
zip_cd varchar (10) NULL,
addr1 varchar (250) NULL,
addr2 varchar (250) NULL,
addr3 varchar (250) NULL,
addr4 varchar (250) NULL,
tel varchar (30) NULL,
fax varchar (30) NULL,
biz_co_no varchar (20) NULL,
ein varchar (13) NULL,
std_co_cd varchar (20) NULL,
cntry_cd varchar (2) NOT NULL,
area_cd varchar (3) NULL,
cur_cd varchar (3) NOT NULL,
prnt_lcl_cd varchar (7) NULL,
bp_grp_cd1 varchar (10) NULL,
bp_grp_cd2 varchar (10) NULL,
bp_grp_cd3 varchar (10) NULL,
bp_grp_cd4 varchar (10) NULL,
bp_grp_cd5 varchar (10) NULL,
bp_grp_cd6 varchar (10) NULL,
bp_grp_cd7 varchar (10) NULL,
bp_grp_cd8 varchar (10) NULL,
bp_grp_cd9 varchar (10) NULL,
bp_grp_cd10 varchar (10) NULL,
bp_alc_grp varchar (10) NULL,
cst_flg char (1) DEFAULT '0' NOT NULL,
acst_flg char (1) DEFAULT '0' NOT NULL,
bcst_flg char (1) DEFAULT '0' NOT NULL,
rcst_flg char (1) DEFAULT '0' NOT NULL,
sppl_flg char (1) DEFAULT '0' NOT NULL,
asppl_flg char (1) DEFAULT '0' NOT NULL,
bsppl_flg char (1) DEFAULT '0' NOT NULL,
psppl_flg char (1) DEFAULT '0' NOT NULL,
cred_flg char (1) DEFAULT '0' NOT NULL,
dlv_flg char (1) DEFAULT '0' NOT NULL,
maker_flg char (1) DEFAULT '0' NOT NULL,
dest_flg char (1) DEFAULT '0' NOT NULL,
all_com_flg char (1) DEFAULT '0' NOT NULL,
acst_cd varchar (20) NULL,
ar_dpt_typ varchar (1) NULL,
ar_dpt_cd varchar (20) NULL,
cst_cntct_dpt varchar (100) NULL,
cst_cntct_psn varchar (100) NULL,
cst_cntct_psn_title varchar (10) NULL,
cst_sundry_flg char (1) DEFAULT '0' NOT NULL,
sls_upri_req_typ varchar (1) NULL,
sls_upri_cng_flg char (1) DEFAULT '0' NOT NULL,
sls_upri_rnd_typ varchar (1) NULL,
sls_amt_rnd_typ varchar (1) NULL,
sls_tax_calc_typ varchar (1) NULL,
sls_tax_rnd_typ varchar (1) NULL,
sls_basis_typ varchar (1) NULL,
bill_basis_typ varchar (1) NULL,
ship_schd_split_typ varchar (1) NULL,
bill_crryovr_times numeric (2,0) NULL,
lot_back_stop_typ varchar (1) NULL,
slip_each_lot_typ varchar (1) NULL,
cst_ship_form_cd varchar (20) NULL,
stk_lst_issue_flg char (1) DEFAULT '0' NOT NULL,
stk_lst_form_cd varchar (20) NULL,
sls_tax_cd varchar (5) NULL,
sls_tax_cd_prio_flg char (1) DEFAULT '0' NOT NULL,
wrk_ar_flg char (1) DEFAULT '0' NOT NULL,
cst_iv_flg char (1) DEFAULT '0' NOT NULL,
ship_lt numeric (9,0) NULL,
cst_tterm_cd1 varchar (5) NULL,
cst_tterm_cd2 varchar (5) NULL,
cst_tterm_cd3 varchar (5) NULL,
sls_anly_cd1 varchar (10) NULL,
sls_anly_cd2 varchar (10) NULL,
sls_anly_cd3 varchar (10) NULL,
bcst_cd varchar (20) NULL,
rcst_cd varchar (20) NULL,
ar_cred_cd varchar (20) NULL,
bill_dpt_typ varchar (1) NULL,
bcst_dpt_cd varchar (20) NULL,
bill_cl_typ varchar (1) NULL,
bill_cl_day1 numeric (2,0) NULL,
bill_cl_day2 numeric (2,0) NULL,
bill_cl_day3 numeric (2,0) NULL,
bill_cl_day4 numeric (2,0) NULL,
bill_cl_day5 numeric (2,0) NULL,
tax_on_bill_flg char (1) DEFAULT '0' NOT NULL,
bill_tax_rnd_typ varchar (1) NULL,
bill_cl_delay_days numeric (2,0) NULL,
bill_cl_ba_typ varchar (1) NULL,
sls_interim_cl_flg char (1) DEFAULT '0' NOT NULL,
bill_cal_cd varchar (10) NULL,
rcv_ba_typ varchar (1) NULL,
bill_zip_cd varchar (10) NULL,
bill_addr1 varchar (250) NULL,
bill_addr2 varchar (250) NULL,
bill_addr3 varchar (250) NULL,
bill_addr4 varchar (250) NULL,
bill_tel varchar (30) NULL,
bill_bcst_nm varchar (100) NULL,
bill_bcst_dpt varchar (100) NULL,
bill_bcst_psn varchar (100) NULL,
bill_bcst_psn_title varchar (10) NULL,
bfw_bal_disp_flg char (1) DEFAULT '0' NOT NULL,
sls_dtl_outp_typ varchar (1) NULL,
bill_prnt_typ varchar (1) NULL,
bill_dtl_outp_flg char (1) DEFAULT '0' NOT NULL,
bill_dtl_adv_flg char (1) DEFAULT '0' NOT NULL,
bill_dtl_rcv_flg char (1) DEFAULT '0' NOT NULL,
bill_dtl_subttl_typ varchar (1) NULL,
bill_dtl_brk_typ varchar (1) NULL,
bill_dtl_sort_typ varchar (1) NULL,
bill_can_slip_typ varchar (1) NULL,
auto_line_appl_flg char (1) DEFAULT '0' NOT NULL,
ar_setoff_grp_cd varchar (20) NULL,
xfr_psn varchar (100) NULL,
rcv_auto_appl_tgt_flg char (1) DEFAULT '0' NOT NULL,
rcv_amt_match_flg char (1) DEFAULT '0' NOT NULL,
ar_sttl_typ_match_flg char (1) DEFAULT '0' NOT NULL,
calc_com_paid_flg char (1) DEFAULT '0' NOT NULL,
auto_appl_delay_days numeric (2,0) NULL,
asppl_cd varchar (20) NULL,
vmi_purc_dpt_cd varchar (20) NULL,
subcon_flg char (1) DEFAULT '0' NOT NULL,
repurc_obli_flg char (1) DEFAULT '0' NOT NULL,
po_print_cd varchar (5) NULL,
sppl_ship_form_cd varchar (20) NULL,
po_dlv_slip_flg char (1) DEFAULT '0' NOT NULL,
dlv_inst_dlv_slip_flg char (1) DEFAULT '0' NOT NULL,
prms_rcpt_dlv_slip_flg char (1) DEFAULT '0' NOT NULL,
pay_crryovr_times numeric (2,0) NULL,
sppl_cntct_dpt varchar (100) NULL,
sppl_cntct_psn varchar (100) NULL,
sppl_cntct_psn_title varchar (10) NULL,
purc_upri_req_typ varchar (1) NULL,
purc_upri_cng_flg char (1) DEFAULT '0' NOT NULL,
purc_amt_rnd_typ varchar (1) NULL,
purc_tax_rnd_typ varchar (1) NULL,
purc_tax_calc_typ varchar (1) NULL,
purc_tax_cd varchar (5) NULL,
purc_tax_cd_prio_flg char (1) DEFAULT '0' NOT NULL,
wrk_po_flg char (1) DEFAULT '0' NOT NULL,
wrk_ap_flg char (1) DEFAULT '0' NOT NULL,
purc_slip_each_lot_typ varchar (1) NULL,
prov_rcv_typ varchar (1) NULL,
onr_prsppl_flg char (1) DEFAULT '0' NOT NULL,
outsrc_upri_typ varchar (1) NULL,
prov_basis_typ varchar (1) NULL,
prov_upri_cng_flg char (1) DEFAULT '0' NOT NULL,
prov_amt_rnd_typ varchar (1) NULL,
prov_tax_rnd_typ varchar (1) NULL,
prov_tax_calc_typ varchar (1) NULL,
prov_tax_cd varchar (5) NULL,
prov_tax_cd_prio_flg char (1) DEFAULT '0' NOT NULL,
sppl_cal_cd varchar (10) NULL,
sppl_iv_flg char (1) DEFAULT '0' NOT NULL,
rcpt_iv_dup_flg char (1) DEFAULT '0' NOT NULL,
purc_basis_typ varchar (1) NULL,
prms_recv_flg char (1) DEFAULT '0' NOT NULL,
sppl_tterm_cd1 varchar (5) NULL,
sppl_tterm_cd2 varchar (5) NULL,
sppl_tterm_cd3 varchar (5) NULL,
bsppl_cd varchar (20) NULL,
ap_dpt_cd varchar (20) NULL,
psppl_cd varchar (20) NULL,
ap_cred_cd varchar (20) NULL,
bsppl_dpt_cd varchar (20) NULL,
pay_spot_flg char (1) DEFAULT '0' NOT NULL,
psppl_cl_day1 numeric (2,0) NULL,
psppl_cl_day2 numeric (2,0) NULL,
psppl_cl_day3 numeric (2,0) NULL,
psppl_cl_day4 numeric (2,0) NULL,
psppl_cl_day5 numeric (2,0) NULL,
purc_interim_cl_flg char (1) DEFAULT '0' NOT NULL,
ap_setoff_grp_cd varchar (20) NULL,
pay_bank_ac_cd varchar (40) NULL,
pay_schd_ba_typ varchar (1) NULL,
tax_on_pay_flg char (1) DEFAULT '0' NOT NULL,
pay_tax_rnd_typ varchar (1) NULL,
batch_pay_schd_cl_flg char (1) DEFAULT '0' NOT NULL,
pay_schd_cl_delay_days numeric (2,0) NULL,
pay_schd_cl_ba_typ varchar (1) NULL,
pay_ntc_prnt_flg char (1) DEFAULT '0' NOT NULL,
pay_ntc_zip_cd varchar (10) NULL,
pay_ntc_addr1 varchar (250) NULL,
pay_ntc_addr2 varchar (250) NULL,
pay_ntc_addr3 varchar (250) NULL,
pay_ntc_addr4 varchar (250) NULL,
pay_ntc_bsppl_nm varchar (100) NULL,
pay_ntc_bsppl_dpt varchar (100) NULL,
pay_ntc_bsppl_psn varchar (100) NULL,
pay_ntc_bsppl_psn_title varchar (10) NULL,
pay_ntc_tel varchar (30) NULL,
pay_ntc_dtl_outp_flg char (1) DEFAULT '0' NOT NULL,
pay_ntc_bfw_bal_disp_flg char (1) DEFAULT '0' NOT NULL,
pay_ntc_adv_pay_flg char (1) DEFAULT '0' NOT NULL,
pay_ntc_dtl_pay_flg char (1) DEFAULT '0' NOT NULL,
pay_ntc_dtl_subttl_typ varchar (1) NULL,
pay_ntc_dtl_brk_typ varchar (1) NULL,
pay_ntc_dtl_sort_typ varchar (1) NULL,
pay_ntc_can_slip_typ varchar (1) NULL,
psppl_rmrks varchar (100) NULL,
note_days numeric (3,0) NULL,
pay_dpt_cd varchar (20) NULL,
dlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
dlv_cntct_dpt varchar (100) NULL,
dlv_cntct_psn varchar (100) NULL,
dlv_cntct_psn_title varchar (10) NULL,
pri_prnt_flg char (1) DEFAULT '0' NOT NULL,
cnsgn_stktk_flg char (1) DEFAULT '0' NOT NULL,
tdlv_flg char (1) DEFAULT '0' NOT NULL,
via_dlv_typ varchar (1) NULL,
tdlv_req_flg char (1) DEFAULT '0' NOT NULL,
lg_grp_cd varchar (10) NULL,
dlv_cal_cd varchar (10) NULL,
dlv_chnnl1 varchar (10) NULL,
dlv_chnnl2 varchar (10) NULL,
dlv_chnnl3 varchar (10) NULL,
cst_prnt_typ varchar (1) NULL,
acst_prnt_typ varchar (1) NULL,
bcst_prnt_typ varchar (1) NULL,
rcst_prnt_typ varchar (1) NULL,
sppl_prnt_typ varchar (1) NULL,
asppl_prnt_typ varchar (1) NULL,
bsppl_prnt_typ varchar (1) NULL,
psppl_prnt_typ varchar (1) NULL,
dlv_prnt_typ varchar (1) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL,
memo4 varchar (100) NULL,
memo5 varchar (100) NULL,
memo6 varchar (100) NULL,
memo7 varchar (100) NULL,
memo8 varchar (100) NULL,
memo9 varchar (100) NULL,
memo10 varchar (100) NULL,
memo11 varchar (100) NULL,
memo12 varchar (100) NULL,
memo13 varchar (100) NULL,
memo14 varchar (100) NULL,
memo15 varchar (100) NULL,
memo16 varchar (100) NULL,
memo17 varchar (100) NULL,
memo18 varchar (100) NULL,
memo19 varchar (100) NULL,
memo20 varchar (100) NULL,
not_lg_mix_flg char (1) DEFAULT '0' NOT NULL,
not_lot_mix_flg char (1) DEFAULT '0' NOT NULL,
not_sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mam_bp_all
ADD CONSTRAINT mam_bp_all_pk PRIMARY KEY(bp_cd,co_cd);


CREATE INDEX mam_bp_all_ie01
ON mam_bp_all USING BTREE (bp_nm);


CREATE INDEX mam_bp_all_ie02
ON mam_bp_all USING BTREE (bp_alt_nm1);


CREATE INDEX mam_bp_all_ie03
ON mam_bp_all USING BTREE (bp_alt_nm2);


CREATE INDEX mam_bp_all_ie04
ON mam_bp_all USING BTREE (bp_alt_nm3);


CREATE INDEX mam_bp_all_ie05
ON mam_bp_all USING BTREE (bp_alt_nm4);


CREATE INDEX mam_bp_all_ie06
ON mam_bp_all USING BTREE (ein);


CREATE INDEX mam_bp_all_ie07
ON mam_bp_all USING BTREE (cntry_cd);


CREATE INDEX mam_bp_all_ie08
ON mam_bp_all USING BTREE (area_cd);


CREATE INDEX mam_bp_all_ie09
ON mam_bp_all USING BTREE (bp_grp_cd1);


CREATE INDEX mam_bp_all_ie10
ON mam_bp_all USING BTREE (bp_grp_cd2);


CREATE INDEX mam_bp_all_ie11
ON mam_bp_all USING BTREE (bp_grp_cd3);


CREATE INDEX mam_bp_all_ie12
ON mam_bp_all USING BTREE (bp_grp_cd4);


CREATE INDEX mam_bp_all_ie13
ON mam_bp_all USING BTREE (bp_grp_cd5);


CREATE INDEX mam_bp_all_ie14
ON mam_bp_all USING BTREE (bp_grp_cd6);


CREATE INDEX mam_bp_all_ie15
ON mam_bp_all USING BTREE (bp_grp_cd7);


CREATE INDEX mam_bp_all_ie16
ON mam_bp_all USING BTREE (bp_grp_cd8);


CREATE INDEX mam_bp_all_ie17
ON mam_bp_all USING BTREE (bp_grp_cd9);


CREATE INDEX mam_bp_all_ie18
ON mam_bp_all USING BTREE (bp_grp_cd10);


CREATE INDEX mam_bp_all_ie19
ON mam_bp_all USING BTREE (sls_anly_cd1);


CREATE INDEX mam_bp_all_ie20
ON mam_bp_all USING BTREE (sls_anly_cd2);


CREATE INDEX mam_bp_all_ie21
ON mam_bp_all USING BTREE (sls_anly_cd3);


CREATE INDEX mam_bp_all_ie22
ON mam_bp_all USING BTREE (lg_grp_cd);


CREATE INDEX mam_bp_all_ie23
ON mam_bp_all USING BTREE (ar_setoff_grp_cd);


CREATE INDEX mam_bp_all_ie24
ON mam_bp_all USING BTREE (ap_setoff_grp_cd);

