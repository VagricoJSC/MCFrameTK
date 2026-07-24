\encoding UTF-8

CREATE TABLE mbt_bac_ac_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NULL,
ext_sys_cd varchar (10) NULL,
ext_data_no numeric (15,0) NULL,
ext_data_lno numeric (15,0) NULL,
data_make_dt timestamp(0)  NULL,
imp_flg char (1) DEFAULT '0' NOT NULL,
jnl_grp_cd varchar (5) NOT NULL,
bank_ac_cd varchar (40) NOT NULL,
ac_cd varchar (10) NOT NULL,
sub_ac_cd varchar (10) NULL,
bp_typ varchar (1) NOT NULL,
bp_cd varchar (20) NULL,
itm_typ varchar (1) NOT NULL,
amt_typ varchar (1) NOT NULL,
ac_tax_cd varchar (5) NULL,
abs_typ varchar (1) NOT NULL,
abstract2 varchar (40) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
if_sub_char1 varchar (50) NULL,
if_sub_char2 varchar (50) NULL,
if_sub_char3 varchar (50) NULL,
if_sub_char4 varchar (50) NULL,
if_sub_char5 varchar (50) NULL,
if_sub_char6 varchar (50) NULL,
if_sub_char7 varchar (50) NULL,
if_sub_char8 varchar (50) NULL,
if_sub_char9 varchar (50) NULL,
if_sub_char10 varchar (50) NULL,
if_sub_char11 varchar (50) NULL,
if_sub_char12 varchar (50) NULL,
if_sub_char13 varchar (50) NULL,
if_sub_char14 varchar (50) NULL,
if_sub_char15 varchar (50) NULL,
if_sub_char16 varchar (50) NULL,
if_sub_char17 varchar (50) NULL,
if_sub_char18 varchar (50) NULL,
if_sub_char19 varchar (50) NULL,
if_sub_char20 varchar (50) NULL,
if_sub_char21 varchar (50) NULL,
if_sub_char22 varchar (50) NULL,
if_sub_char23 varchar (50) NULL,
if_sub_char24 varchar (50) NULL,
if_sub_char25 varchar (50) NULL,
if_sub_char26 varchar (50) NULL,
if_sub_char27 varchar (50) NULL,
if_sub_char28 varchar (50) NULL,
if_sub_char29 varchar (50) NULL,
if_sub_char30 varchar (50) NULL,
if_sub_num1 numeric (21,8) NULL,
if_sub_num2 numeric (21,8) NULL,
if_sub_num3 numeric (21,8) NULL,
if_sub_num4 numeric (21,8) NULL,
if_sub_num5 numeric (21,8) NULL,
if_sub_dt1 timestamp(0)  NULL,
if_sub_dt2 timestamp(0)  NULL,
if_sub_dt3 timestamp(0)  NULL,
if_sub_dt4 timestamp(0)  NULL,
if_sub_dt5 timestamp(0)  NULL,
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


ALTER TABLE mbt_bac_ac_if_all
ADD CONSTRAINT mbt_bac_ac_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mbt_bac_ac_if_all_ie01
ON mbt_bac_ac_if_all USING BTREE (data_no,co_cd);


CREATE INDEX mbt_bac_ac_if_all_ie02
ON mbt_bac_ac_if_all USING BTREE (exe_sts_typ,co_cd);

