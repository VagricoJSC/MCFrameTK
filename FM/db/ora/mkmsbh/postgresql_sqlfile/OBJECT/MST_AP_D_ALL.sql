\encoding UTF-8

CREATE TABLE mst_ap_d_all
(ap_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
po_no varchar (15) NULL,
po_d_no varchar (15) NULL,
purc_act_d_no varchar (15) NOT NULL,
purc_act_d_seq numeric (4,0) NOT NULL,
purc_act_no varchar (15) NOT NULL,
purc_act_seq numeric (4,0) NOT NULL,
purc_act_rev numeric (4,0) NOT NULL,
bp_dlv_slip_no varchar (15) NULL,
bp_dlv_slip_d_no varchar (15) NULL,
rcpt_iv_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_mng_no varchar (15) DEFAULT '*' NOT NULL,
ap_typ varchar (1) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
sppl_cd varchar (20) NOT NULL,
asppl_cd varchar (20) NOT NULL,
bsppl_cd varchar (20) NOT NULL,
bsppl_dpt_cd varchar (20) NOT NULL,
ap_dpt_cd varchar (20) NOT NULL,
purc_dpt_cd varchar (20) NOT NULL,
purc_usr_cd varchar (500) NULL,
po_wrk_no varchar (15) NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
act_dt timestamp(0)  NULL,
ac_dt timestamp(0)  NOT NULL,
ac_ym timestamp(0)  NOT NULL,
bsppl_cl_dt timestamp(0)  NULL,
bsppl_cl_day numeric (2,0) NULL,
pay_crryovr_times numeric (2,0) NULL,
pay_basis_dt timestamp(0)  NULL,
pay_schd_dt timestamp(0)  NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) DEFAULT 0 NOT NULL,
tax_cd varchar (5) NOT NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
xrate numeric (21,8) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
trd_cur_upri numeric (21,8) NOT NULL,
trd_cur_amt numeric (21,8) NOT NULL,
trd_cur_tax_amt numeric (21,8) NOT NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
trd_cur_proc_upri numeric (21,8) NULL,
trd_cur_proc_amt numeric (21,8) NULL,
trd_cur_onr_prov_upri numeric (21,8) NULL,
trd_cur_onr_prov_amt numeric (21,8) NULL,
base_cur_upri numeric (21,8) NOT NULL,
base_cur_amt numeric (21,8) NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
base_cur_proc_upri numeric (21,8) NULL,
base_cur_proc_amt numeric (21,8) NULL,
base_cur_onr_prov_upri numeric (21,8) NULL,
base_cur_onr_prov_amt numeric (21,8) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
pay_mtd_typ varchar (1) NOT NULL,
org_ap_d_no varchar (15) NOT NULL,
crryovr_ap_d_no varchar (15) NULL,
crryovr_src_ap_d_no varchar (15) NULL,
base_purc_ac_dt timestamp(0)  NULL,
pay_ntc_d_print_rmrks varchar (100) NULL,
pay_schd_d_print_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
pay_chk_no varchar (15) NULL,
pay_chk_mng_no varchar (15) NULL,
chk_flg char (1) DEFAULT '0' NOT NULL,
crryovr_flg char (1) DEFAULT '0' NOT NULL,
repurc_obli_flg char (1) DEFAULT '0' NOT NULL,
outsrc_flg char (1) DEFAULT '0' NOT NULL,
valid_flg char (1) DEFAULT '1' NOT NULL,
sw_flg char (1) DEFAULT '0' NOT NULL,
sw_src_ap_appl_schd_no varchar (15) NULL,
sw_src_pay_chk_no varchar (15) NULL,
sw_src_pay_chk_mng_no varchar (15) NULL,
sw_src_pay_schd_no varchar (15) NULL,
sw_src_ap_d_no varchar (15) NULL,
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


ALTER TABLE mst_ap_d_all
ADD CONSTRAINT mst_ap_d_all_pk PRIMARY KEY(ap_d_no,co_cd);


CREATE INDEX mst_ap_d_all_ie01
ON mst_ap_d_all USING BTREE (bsppl_cd,chk_flg,valid_flg,co_cd);


CREATE INDEX mst_ap_d_all_ie02
ON mst_ap_d_all USING BTREE (bsppl_cd, bsppl_dpt_cd, trd_cur_cd, co_cd);


CREATE INDEX mst_ap_d_all_ie03
ON mst_ap_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_ap_d_all_ie04
ON mst_ap_d_all USING BTREE (sppl_cd, co_cd);


CREATE INDEX mst_ap_d_all_ie05
ON mst_ap_d_all USING BTREE (asppl_cd, co_cd);


CREATE INDEX mst_ap_d_all_ie06
ON mst_ap_d_all USING BTREE (purc_act_no, co_cd);


CREATE INDEX mst_ap_d_all_ie07
ON mst_ap_d_all USING BTREE (rcpt_iv_mng_no, co_cd);


CREATE INDEX mst_ap_d_all_ie08
ON mst_ap_d_all USING BTREE (ac_ym, co_cd);


CREATE INDEX mst_ap_d_all_ie09
ON mst_ap_d_all USING BTREE (org_ap_d_no, co_cd);


CREATE INDEX mst_ap_d_all_ie10
ON mst_ap_d_all USING BTREE (pay_chk_no, co_cd);


CREATE INDEX mst_ap_d_all_ie11
ON mst_ap_d_all USING BTREE (pay_chk_mng_no, co_cd);


CREATE INDEX mst_ap_d_all_ie12
ON mst_ap_d_all USING BTREE (crryovr_src_ap_d_no, co_cd);


CREATE INDEX mst_ap_d_all_ie13
ON mst_ap_d_all USING BTREE (sw_src_ap_appl_schd_no, co_cd);


CREATE INDEX mst_ap_d_all_ie14
ON mst_ap_d_all USING BTREE (sw_src_ap_d_no, co_cd);

