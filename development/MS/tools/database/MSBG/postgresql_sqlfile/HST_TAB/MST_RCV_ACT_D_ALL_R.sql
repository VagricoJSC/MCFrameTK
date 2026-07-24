\encoding UTF-8

CREATE TABLE mst_rcv_act_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
rcv_act_d_no varchar (15) NULL,
rcv_act_d_seq numeric (4,0) NULL,
co_cd varchar (10) NULL,
rcv_act_no varchar (15) NULL,
rcv_act_seq numeric (4,0) NULL,
disp_seq numeric (5,0) NULL,
bill_mng_no varchar (15) NULL,
bcst_cd varchar (20) NULL,
bill_dpt_cd varchar (20) NULL,
acst_cd varchar (20) NULL,
ar_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
iv_no varchar (15) NULL,
wrk_no varchar (15) NULL,
ar_typ varchar (1) NULL,
ar_sttl_cd1 varchar (10) NULL,
ar_sttl_typ1 varchar (1) NULL,
trd_cur_amt1 numeric (21,8) NULL,
trd_cur_tax_amt1 numeric (21,8) NULL,
trd_cur_amt2 numeric (21,8) NULL,
trd_cur_tax_amt2 numeric (21,8) NULL,
trd_cur_amt3 numeric (21,8) NULL,
trd_cur_tax_amt3 numeric (21,8) NULL,
base_cur_amt1 numeric (21,8) NULL,
base_cur_tax_amt1 numeric (21,8) NULL,
base_cur_amt2 numeric (21,8) NULL,
base_cur_tax_amt2 numeric (21,8) NULL,
base_cur_amt3 numeric (21,8) NULL,
base_cur_tax_amt3 numeric (21,8) NULL,
trd_xrate numeric (21,8) NULL,
gen_rcv_no varchar (15) NULL,
bill_d_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
appl_cmpl_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_rcv_act_d_all_r ADD CONSTRAINT mst_rcv_act_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_rcv_act_d_all_r', 'mst_rcv_act_d_all', 'mst_rcv_act_d_all_tr_r');

