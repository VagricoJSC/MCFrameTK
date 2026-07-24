\encoding UTF-8

CREATE TABLE mst_bill_his_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
bill_his_no varchar (15) NULL,
co_cd varchar (10) NULL,
bill_no varchar (15) NULL,
bill_rev numeric (4,0) NULL,
latest_flg char (1) DEFAULT '0' NULL,
can_flg char (1) DEFAULT '0' NULL,
bill_cl_dt timestamp(0)  NULL,
bill_each_sls_flg char (1) DEFAULT '0' NULL,
iv_no varchar (15) NULL,
wrk_no varchar (15) NULL,
bcst_cd varchar (20) NULL,
bill_dpt_cd varchar (20) NULL,
bill_xrate numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
last_bill_amt numeric (21,8) NULL,
rcv_amt numeric (21,8) NULL,
sw_amt numeric (21,8) NULL,
bfw_amt numeric (21,8) NULL,
sls_amt numeric (21,8) NULL,
dscnt_amt numeric (21,8) NULL,
ret_amt numeric (21,8) NULL,
setoff_amt numeric (21,8) NULL,
tax_amt numeric (21,8) NULL,
sw_to_amt numeric (21,8) DEFAULT 0 NULL,
bill_amt numeric (21,8) NULL,
adv_amt_bal numeric (21,8) NULL,
adv_amt numeric (21,8) NULL,
adv_setoff_amt numeric (21,8) NULL,
adv_setoff_tax_amt numeric (21,8) NULL,
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



ALTER TABLE mst_bill_his_all_r ADD CONSTRAINT mst_bill_his_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_bill_his_all_r', 'mst_bill_his_all', 'mst_bill_his_all_tr_r');

