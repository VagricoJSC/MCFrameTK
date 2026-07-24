\encoding UTF-8

CREATE TABLE mst_io_schd_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
dpt_st_dt timestamp(0)  NULL,
data_upd_ts timestamp(3)  NOT NULL,
bi_not_send_flg char (1) DEFAULT '0' NOT NULL,
dpt_cd varchar (20) NULL,
std_cost_amt numeric (21,8) NULL,
slip_schd_no varchar (15) NOT NULL,
io_schd_typ varchar (5) NOT NULL,
io_typ varchar (1) NOT NULL,
io_schd_sts_typ varchar (2) NOT NULL,
io_schd_no varchar (15) NOT NULL,
io_schd_seq numeric (3,0) NULL,
io_schd_sub_typ1 varchar (2) NULL,
io_schd_sub_no1 varchar (15) NULL,
io_schd_sub_seq1 numeric (3,0) NULL,
io_schd_sub_typ2 varchar (2) NULL,
io_schd_sub_no2 varchar (15) NULL,
io_schd_sub_seq2 numeric (3,0) NULL,
io_schd_sub_typ3 varchar (2) NULL,
io_schd_sub_no3 varchar (15) NULL,
io_schd_sub_seq3 numeric (3,0) NULL,
io_schd_sub_typ4 varchar (2) NULL,
io_schd_sub_no4 varchar (15) NULL,
io_schd_sub_seq4 numeric (3,0) NULL,
io_schd_pr_no varchar (15) NULL,
schd_dt timestamp(0)  NOT NULL,
accpt_schd_dt timestamp(0)  NULL,
avl_schd_dt timestamp(0)  NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
gd_cd varchar (2) NOT NULL,
in_xfr_typ varchar (1) NOT NULL,
quality_typ varchar (1) NOT NULL,
asst_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
wg_cd varchar (10) NOT NULL,
sppl_cd varchar (20) NULL,
gi_loc_cd varchar (20) NULL,
gr_loc_cd varchar (20) NULL,
accrual_flg char (1) DEFAULT '0' NOT NULL,
accpt_flg char (1) DEFAULT '0' NOT NULL,
avl_flg char (1) DEFAULT '0' NOT NULL,
st_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
buf_qty numeric (21,8) NULL,
rord_stk_qty numeric (21,8) NULL,
rord_rqst_qty numeric (21,8) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
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


ALTER TABLE mst_io_schd_if_all
ADD CONSTRAINT mst_io_schd_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_io_schd_if_all_ie05
ON mst_io_schd_if_all USING BTREE (slip_schd_no, co_cd);


CREATE INDEX mst_io_schd_if_all_ie01
ON mst_io_schd_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_io_schd_if_all_ie02
ON mst_io_schd_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_io_schd_if_all_ie03
ON mst_io_schd_if_all USING BTREE (ext_sys_cd, co_cd);


CREATE INDEX mst_io_schd_if_all_ie04
ON mst_io_schd_if_all USING BTREE (batch_log_no, co_cd);

