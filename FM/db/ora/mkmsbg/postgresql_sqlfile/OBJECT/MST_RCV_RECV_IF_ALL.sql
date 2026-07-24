\encoding UTF-8

CREATE TABLE mst_rcv_recv_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
exe_sts_typ varchar (1) DEFAULT '1' NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
ext_data_no numeric (15,0) NOT NULL,
ext_data_lno numeric (15,0) NOT NULL,
data_make_dt timestamp(0)  NOT NULL,
imp_flg char (1) DEFAULT '0' NOT NULL,
recv_dt timestamp(0)  NOT NULL,
ext_rcv_no varchar (300) NOT NULL,
rcst_cd varchar (20) NULL,
if_rcst_cd varchar (500) NULL,
if_rcst_nm varchar (100) NULL,
bcst_cd varchar (20) NULL,
if_bcst_cd varchar (500) NULL,
if_bcst_nm varchar (100) NULL,
bill_dpt_cd varchar (20) NULL,
if_bill_dpt_cd varchar (500) NULL,
if_bill_dpt_nm varchar (100) NULL,
rcv_dpt_cd varchar (20) NULL,
if_rcv_dpt_cd varchar (500) NULL,
if_rcv_dpt_nm varchar (100) NULL,
rcv_usr_cd varchar (500) NULL,
if_rcv_usr_cd varchar (500) NULL,
if_rcv_usr_nm varchar (100) NULL,
rcv_dt timestamp(0)  NULL,
ar_sttl_typ varchar (1) NULL,
bank_cd varchar (15) NULL,
if_bank_cd varchar (500) NULL,
if_bank_nm varchar (100) NULL,
rcv_mtd_cd varchar (10) NULL,
if_rcv_mtd_cd varchar (500) NULL,
if_rcv_mtd_nm varchar (100) NULL,
bank_ac_cd varchar (40) NULL,
if_bank_ac_cd varchar (500) NULL,
if_bank_ac_nm varchar (100) NULL,
xfr_psn varchar (100) NULL,
trd_cur_cd varchar (3) NULL,
if_trd_cur_cd varchar (500) NULL,
if_trd_cur_nm varchar (100) NULL,
xrate numeric (21,8) NULL,
rcv_amt numeric (21,8) NULL,
com_paid numeric (21,8) NULL,
rcv_rmrks varchar (100) NULL,
note_no varchar (20) NULL,
note_typ varchar (1) NULL,
draw_dt timestamp(0)  NULL,
due_dt timestamp(0)  NULL,
drawer_nm varchar (40) NULL,
endrsr varchar (30) NULL,
accptr varchar (30) NULL,
note_rsn_cd varchar (10) NULL,
if_note_rsn_cd varchar (500) NULL,
if_note_rsn_nm varchar (100) NULL,
draw_bank_cd varchar (15) NULL,
if_draw_bank_cd varchar (500) NULL,
if_draw_bank_nm varchar (100) NULL,
draw_branch_cd varchar (15) NULL,
if_draw_branch_cd varchar (500) NULL,
if_draw_branch_nm varchar (100) NULL,
if_co_cd varchar (500) NULL,
if_co_nm varchar (100) NULL,
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


ALTER TABLE mst_rcv_recv_if_all
ADD CONSTRAINT mst_rcv_recv_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie01
ON mst_rcv_recv_if_all USING BTREE (ext_rcv_no, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie02
ON mst_rcv_recv_if_all USING BTREE (rcst_cd, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie03
ON mst_rcv_recv_if_all USING BTREE (rcv_mtd_cd, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie04
ON mst_rcv_recv_if_all USING BTREE (ext_data_no, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie05
ON mst_rcv_recv_if_all USING BTREE (rcv_dt, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie06
ON mst_rcv_recv_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie07
ON mst_rcv_recv_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie08
ON mst_rcv_recv_if_all USING BTREE (ext_sys_cd, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie09
ON mst_rcv_recv_if_all USING BTREE (imp_flg, co_cd);


CREATE INDEX mst_rcv_recv_if_all_ie10
ON mst_rcv_recv_if_all USING BTREE (batch_log_no, co_cd);

