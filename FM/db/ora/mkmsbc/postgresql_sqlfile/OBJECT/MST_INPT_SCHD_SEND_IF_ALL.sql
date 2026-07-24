\encoding UTF-8

CREATE TABLE mst_inpt_schd_send_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
inpt_schd_no varchar (15) NOT NULL,
oper_inst_no varchar (15) NOT NULL,
mfg_inst_no varchar (15) NOT NULL,
mfg_inst_rev numeric (4,0) NOT NULL,
mfg_loc_cd varchar (20) NOT NULL,
if_mfg_loc_cd varchar (500) NULL,
mfg_loc_nm varchar (40) NULL,
mfg_itm_cd varchar (40) NOT NULL,
mfg_itm_sub1 varchar (5) DEFAULT '*' NULL,
mfg_itm_sub2 varchar (5) DEFAULT '*' NULL,
mfg_itm_sub3 varchar (5) DEFAULT '*' NULL,
if_mfg_itm_cd varchar (500) NULL,
if_mfg_itm_sub1 varchar (5) NULL,
if_mfg_itm_sub2 varchar (5) NULL,
if_mfg_itm_sub3 varchar (5) NULL,
mfg_itm_nm varchar (100) NULL,
oper_cd varchar (10) NULL,
if_oper_cd varchar (500) NULL,
oper_nm varchar (40) NULL,
oper_seq numeric (9,0) NULL,
schd_tm timestamp(0)  NOT NULL,
alt_grp_cd varchar (40) NULL,
if_alt_grp_cd varchar (500) NULL,
alt_grp_seq numeric (9,0) NULL,
alt_grp_nm varchar (100) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
if_itm_cd varchar (500) NULL,
if_itm_sub1 varchar (5) NULL,
if_itm_sub2 varchar (5) NULL,
if_itm_sub3 varchar (5) NULL,
itm_nm varchar (100) NULL,
ver_no varchar (10) NULL,
base_unit_inpt_qty numeric (21,8) NOT NULL,
base_unit_rqmt_qty numeric (21,8) NOT NULL,
base_unit_fxd_rqmt_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
if_base_unit_cd varchar (500) NULL,
base_unit_nm varchar (40) NULL,
inpt_loc_cd varchar (20) NOT NULL,
if_inpt_loc_cd varchar (500) NULL,
inpt_loc_nm varchar (40) NULL,
inpt_str_ln_cd varchar (10) DEFAULT '*' NULL,
if_inpt_str_ln_cd varchar (500) NULL,
inpt_str_ln_nm varchar (40) NULL,
gd_cd varchar (2) NOT NULL,
if_gd_cd varchar (500) NULL,
gd_nm varchar (40) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno1_null_flg char (1) DEFAULT '0' NOT NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno2_null_flg char (1) DEFAULT '0' NOT NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno3_null_flg char (1) DEFAULT '0' NOT NULL,
sno4 varchar (15) DEFAULT '*' NULL,
sno4_null_flg char (1) DEFAULT '0' NOT NULL,
alloc_sno1 varchar (15) DEFAULT '*' NULL,
alloc_sno2 varchar (15) DEFAULT '*' NULL,
alloc_sno3 varchar (15) DEFAULT '*' NULL,
alloc_sno4 varchar (15) DEFAULT '*' NULL,
bkf_typ varchar (1) NOT NULL,
cont_inpt_qty numeric (21,8) NULL,
cont_rqmt_qty numeric (21,8) NULL,
cont_fxd_rqmt_qty numeric (21,8) NULL,
cont_fctr_unit_cd varchar (5) NULL,
if_cont_fctr_unit_cd varchar (500) NULL,
cont_fctr_unit_nm varchar (40) NULL,
std_cont_fctr numeric (21,8) NULL,
act_cont_fctr numeric (21,8) NULL,
prov_typ varchar (1) NULL,
disp_seq numeric (9,0) NOT NULL,
lot_mix_flg char (1) DEFAULT '0' NOT NULL,
sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
yield_calc_flg char (1) DEFAULT '0' NOT NULL,
alloc_flg char (1) DEFAULT '0' NOT NULL,
base_unit_alt_qty numeric (21,8) NULL,
alt_itm_fix_flg char (1) DEFAULT '0' NOT NULL,
alt_itm_typ varchar (1) NULL,
alt_alloc_prio numeric (9,0) NULL,
alt_itm_ratio numeric (9,0) NULL,
alloc_ctl_typ varchar (1) NOT NULL,
inpt_ctl_typ varchar (1) NOT NULL,
inpt_rsn_cd varchar (10) NULL,
if_inpt_rsn_cd varchar (500) NULL,
inpt_rsn_nm varchar (100) NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
inst_rpt_rmrks varchar (100) NULL,
mfg_sts_typ varchar (1) NOT NULL,
if_co_cd varchar (500) NULL,
co_nm varchar (100) NULL,
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
sub_char11 varchar (50) NULL,
sub_char12 varchar (50) NULL,
sub_char13 varchar (50) NULL,
sub_char14 varchar (50) NULL,
sub_char15 varchar (50) NULL,
sub_char16 varchar (50) NULL,
sub_char17 varchar (50) NULL,
sub_char18 varchar (50) NULL,
sub_char19 varchar (50) NULL,
sub_char20 varchar (50) NULL,
sub_char21 varchar (50) NULL,
sub_char22 varchar (50) NULL,
sub_char23 varchar (50) NULL,
sub_char24 varchar (50) NULL,
sub_char25 varchar (50) NULL,
sub_char26 varchar (50) NULL,
sub_char27 varchar (50) NULL,
sub_char28 varchar (50) NULL,
sub_char29 varchar (50) NULL,
sub_char30 varchar (50) NULL,
sub_num1 numeric (21,8) NULL,
sub_num2 numeric (21,8) NULL,
sub_num3 numeric (21,8) NULL,
sub_num4 numeric (21,8) NULL,
sub_num5 numeric (21,8) NULL,
sub_dt1 timestamp(0)  NULL,
sub_dt2 timestamp(0)  NULL,
sub_dt3 timestamp(0)  NULL,
sub_dt4 timestamp(0)  NULL,
sub_dt5 timestamp(0)  NULL,
batch_log_no varchar (15) NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
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


ALTER TABLE mst_inpt_schd_send_if_all
ADD CONSTRAINT mst_inpt_schd_send_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie01
ON mst_inpt_schd_send_if_all USING BTREE (inpt_schd_no, co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie02
ON mst_inpt_schd_send_if_all USING BTREE (oper_inst_no, co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie03
ON mst_inpt_schd_send_if_all USING BTREE (mfg_inst_no, co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie04
ON mst_inpt_schd_send_if_all USING BTREE (oper_cd, oper_seq, co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie05
ON mst_inpt_schd_send_if_all USING BTREE (schd_tm, co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie06
ON mst_inpt_schd_send_if_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie07
ON mst_inpt_schd_send_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie08
ON mst_inpt_schd_send_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_inpt_schd_send_if_all_ie09
ON mst_inpt_schd_send_if_all USING BTREE (batch_log_no, co_cd);

