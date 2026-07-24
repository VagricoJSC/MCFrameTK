\encoding UTF-8

CREATE TABLE mst_wk_act_recv_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
ext_data_no numeric (15,0) NOT NULL,
ext_data_lno numeric (15,0) NOT NULL,
data_make_dt timestamp(0)  NOT NULL,
imp_flg char (1) DEFAULT '0' NOT NULL,
recv_dt timestamp(0)  NOT NULL,
wk_schd_no varchar (15) NULL,
oper_inst_no varchar (15) NULL,
mfg_inst_no varchar (15) NULL,
mfg_inst_rev numeric (4,0) NULL,
div_seq numeric (3,0) NULL,
oper_cd varchar (10) NULL,
if_oper_cd varchar (500) NULL,
if_oper_nm varchar (100) NULL,
oper_seq numeric (9,0) NULL,
wk_cost_cd varchar (10) NULL,
if_wk_cost_cd varchar (500) NULL,
if_wk_cost_nm varchar (100) NULL,
wk_cost numeric (21,8) NULL,
st_hm timestamp(0)  NULL,
end_hm timestamp(0)  NULL,
brk_pd numeric (4,0) NULL,
ac_dt timestamp(0)  NULL,
wk_rsn_cd varchar (10) NULL,
if_wk_rsn_cd varchar (500) NULL,
if_wk_rsn_nm varchar (100) NULL,
wk_cost_calc_upd_flg char (1) DEFAULT '0' NOT NULL,
wk_day_cd varchar (10) NULL,
if_wk_day_cd varchar (500) NULL,
if_wk_day_nm varchar (100) NULL,
wk_usr_cd varchar (500) NULL,
if_wk_usr_cd varchar (500) NULL,
if_wk_usr_nm varchar (100) NULL,
wk_usr_dpt_cd varchar (20) NULL,
if_wk_usr_dpt_cd varchar (500) NULL,
if_wk_usr_dpt_nm varchar (100) NULL,
fclty varchar (100) NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
ext_oper_act_no varchar (300) NULL,
ext_wk_act_no varchar (300) NOT NULL,
ext_yield_act_no varchar (300) NULL,
dpt_cd varchar (20) NULL,
if_dpt_cd varchar (500) NULL,
if_dpt_nm varchar (100) NULL,
loc_cd varchar (20) NULL,
if_loc_cd varchar (500) NULL,
if_loc_nm varchar (100) NULL,
str_ln_cd varchar (10) NULL,
if_str_ln_cd varchar (500) NULL,
if_str_ln_nm varchar (100) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
if_itm_cd varchar (500) NULL,
if_itm_sub1 varchar (5) NULL,
if_itm_sub2 varchar (5) NULL,
if_itm_sub3 varchar (5) NULL,
if_itm_nm varchar (100) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
if_co_cd varchar (500) NULL,
if_co_nm varchar (100) NULL,
req_no varchar (50) NULL,
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


ALTER TABLE mst_wk_act_recv_if_all
ADD CONSTRAINT mst_wk_act_recv_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie01
ON mst_wk_act_recv_if_all USING BTREE (wk_schd_no, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie02
ON mst_wk_act_recv_if_all USING BTREE (oper_inst_no, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie03
ON mst_wk_act_recv_if_all USING BTREE (mfg_inst_no, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie04
ON mst_wk_act_recv_if_all USING BTREE (oper_cd, oper_seq, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie05
ON mst_wk_act_recv_if_all USING BTREE (wk_cost_cd, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie06
ON mst_wk_act_recv_if_all USING BTREE (ac_dt, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie07
ON mst_wk_act_recv_if_all USING BTREE (ext_oper_act_no, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie08
ON mst_wk_act_recv_if_all USING BTREE (ext_wk_act_no, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie09
ON mst_wk_act_recv_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie10
ON mst_wk_act_recv_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie11
ON mst_wk_act_recv_if_all USING BTREE (ext_data_no, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie12
ON mst_wk_act_recv_if_all USING BTREE (ext_data_lno, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie13
ON mst_wk_act_recv_if_all USING BTREE (imp_flg, co_cd);


CREATE INDEX mst_wk_act_recv_if_all_ie14
ON mst_wk_act_recv_if_all USING BTREE (batch_log_no, co_cd);

