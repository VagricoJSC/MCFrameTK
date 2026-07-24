\encoding UTF-8

CREATE TABLE mst_wk_schd_send_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
wk_schd_no varchar (15) NOT NULL,
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
wk_cost_cd varchar (10) NOT NULL,
if_wk_cost_cd varchar (500) NULL,
wk_cost_nm varchar (40) NULL,
wk_cost_calc_flg char (1) DEFAULT '0' NOT NULL,
fxd_wk_cost numeric (21,8) NOT NULL,
wk_cost numeric (21,8) NOT NULL,
wk_cost_unit_nm varchar (40) NOT NULL,
disp_seq numeric (9,0) NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_wk_schd_send_if_all
ADD CONSTRAINT mst_wk_schd_send_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_wk_schd_send_if_all_ie01
ON mst_wk_schd_send_if_all USING BTREE (wk_schd_no, co_cd);


CREATE INDEX mst_wk_schd_send_if_all_ie02
ON mst_wk_schd_send_if_all USING BTREE (oper_inst_no, co_cd);


CREATE INDEX mst_wk_schd_send_if_all_ie03
ON mst_wk_schd_send_if_all USING BTREE (mfg_inst_no, co_cd);


CREATE INDEX mst_wk_schd_send_if_all_ie04
ON mst_wk_schd_send_if_all USING BTREE (oper_cd, oper_seq, co_cd);


CREATE INDEX mst_wk_schd_send_if_all_ie05
ON mst_wk_schd_send_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_wk_schd_send_if_all_ie06
ON mst_wk_schd_send_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_wk_schd_send_if_all_ie07
ON mst_wk_schd_send_if_all USING BTREE (batch_log_no, co_cd);

