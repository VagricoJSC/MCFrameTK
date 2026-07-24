\encoding UTF-8

CREATE TABLE mbt_sls_slip_snd_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
sls_act_no varchar (15) NULL,
sls_act_seq numeric (4,0) NULL,
sls_act_rev numeric (4,0) NULL,
prov_act_no varchar (15) NULL,
prov_act_seq numeric (4,0) NULL,
prov_act_rev numeric (4,0) NULL,
sls_slip_no varchar (20) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
dpt_cd varchar (20) NOT NULL,
usr_cd varchar (500) NULL,
cst_cd varchar (20) NULL,
prsppl_cd varchar (20) NULL,
tax_calc_typ varchar (1) NULL,
iv_flg char (1) DEFAULT '0' NOT NULL,
iv_no varchar (15) NULL,
cred_cd varchar (20) NULL,
bcst_cd varchar (20) NULL,
sls_dpt_cd varchar (20) NULL,
bill_dpt_cd varchar (20) NULL,
asst_dpt_cd varchar (20) NULL,
ar_dpt_cd varchar (20) NULL,
trd_cur_cd varchar (3) NOT NULL,
base_cur_cd varchar (3) NOT NULL,
xrate_cd varchar (2) NOT NULL,
xrate numeric (21,8) NOT NULL,
ddlv_sls_flg char (1) DEFAULT '0' NOT NULL,
ship_lg_grp_cd varchar (10) NULL,
ar_sttl_cd varchar (10) NOT NULL,
rcv_schd_dt timestamp(0)  NOT NULL,
sls_act_d_no varchar (15) NULL,
sls_act_d_seq numeric (4,0) NULL,
sls_slip_lno numeric (4) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
stk_mng_typ varchar (1) NOT NULL,
itm_jnl_cd varchar (5) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
tax_cd varchar (5) NULL,
inc_tax_flg char (1) DEFAULT '0' NOT NULL,
tax_typ varchar (1) NULL,
trd_cur_upri numeric (21,8) NOT NULL,
trd_cur_amt numeric (21,8) NOT NULL,
trd_cur_tax_amt numeric (21,8) NOT NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
base_cur_upri numeric (21,8) NOT NULL,
base_cur_amt numeric (21,8) NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
dtl_dscnt_flg char (1) DEFAULT '0' NOT NULL,
sls_adj_flg char (1) DEFAULT '0' NOT NULL,
re_snd_flg char (1) DEFAULT '0' NOT NULL,
not_snd_flg char (1) DEFAULT '0' NOT NULL,
snd_to_err_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mbt_sls_slip_snd_if_all
ADD CONSTRAINT mbt_sls_slip_snd_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mbt_sls_slip_snd_if_all_ie01
ON mbt_sls_slip_snd_if_all USING BTREE (sls_act_no, sls_act_seq, co_cd);


CREATE INDEX mbt_sls_slip_snd_if_all_ie02
ON mbt_sls_slip_snd_if_all USING BTREE (prov_act_no, prov_act_seq, co_cd);


CREATE INDEX mbt_sls_slip_snd_if_all_ie03
ON mbt_sls_slip_snd_if_all USING BTREE (sls_act_d_no, sls_act_d_seq, co_cd);


CREATE INDEX mbt_sls_slip_snd_if_all_ie04
ON mbt_sls_slip_snd_if_all USING BTREE (sls_slip_no, co_cd);


CREATE INDEX mbt_sls_slip_snd_if_all_ie05
ON mbt_sls_slip_snd_if_all USING BTREE (iv_no, co_cd);


CREATE INDEX mbt_sls_slip_snd_if_all_ie06
ON mbt_sls_slip_snd_if_all USING BTREE (snd_to_err_flg, co_cd);


CREATE INDEX mbt_sls_slip_snd_if_all_ie07
ON mbt_sls_slip_snd_if_all USING BTREE (data_no,co_cd);


CREATE INDEX mbt_sls_slip_snd_if_all_ie08
ON mbt_sls_slip_snd_if_all USING BTREE (exe_sts_typ,co_cd);

