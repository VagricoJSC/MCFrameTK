\encoding UTF-8

CREATE TABLE mst_insp_act_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
dpt_st_dt timestamp(0)  NULL,
data_upd_ts timestamp(3)  NOT NULL,
bi_not_send_flg char (1) DEFAULT '0' NOT NULL,
insp_act_d_no varchar (15) NOT NULL,
insp_act_no varchar (15) NOT NULL,
st_act_tm timestamp(0)  NULL,
end_act_tm timestamp(0)  NULL,
act_usr_cd varchar (500) NULL,
act_dpt_cd varchar (20) NULL,
insp_no varchar (15) NOT NULL,
src_no1 varchar (15) NULL,
src_no2 varchar (15) NULL,
insp_typ varchar (1) NOT NULL,
insp_mtd_typ varchar (1) NOT NULL,
insp_sts_typ varchar (1) NOT NULL,
st_schd_tm timestamp(0)  NULL,
end_schd_tm timestamp(0)  NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
fix_no_typ varchar (1) NOT NULL,
fix_no varchar (15) DEFAULT '*' NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
dfct_rsn_cd varchar (10) NULL,
ac_dt timestamp(0)  NULL,
intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_insp_act_if_all
ADD CONSTRAINT mst_insp_act_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_insp_act_if_all_ie05
ON mst_insp_act_if_all USING BTREE (insp_act_d_no,co_cd);


CREATE INDEX mst_insp_act_if_all_ie01
ON mst_insp_act_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_insp_act_if_all_ie02
ON mst_insp_act_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_insp_act_if_all_ie03
ON mst_insp_act_if_all USING BTREE (ext_sys_cd, co_cd);


CREATE INDEX mst_insp_act_if_all_ie04
ON mst_insp_act_if_all USING BTREE (batch_log_no, co_cd);

