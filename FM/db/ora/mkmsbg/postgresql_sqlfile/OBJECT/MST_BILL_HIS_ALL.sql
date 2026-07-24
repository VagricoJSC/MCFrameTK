\encoding UTF-8

CREATE TABLE mst_bill_his_all
(bill_his_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
bill_no varchar (15) NOT NULL,
bill_rev numeric (4,0) NOT NULL,
latest_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
bill_cl_dt timestamp(0)  NULL,
bill_each_sls_flg char (1) DEFAULT '0' NOT NULL,
iv_no varchar (15) NULL,
wrk_no varchar (15) NULL,
bcst_cd varchar (20) NOT NULL,
bill_dpt_cd varchar (20) NOT NULL,
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


ALTER TABLE mst_bill_his_all
ADD CONSTRAINT mst_bill_his_all_pk PRIMARY KEY(bill_his_no,co_cd);


CREATE INDEX mst_bill_his_all_ie01
ON mst_bill_his_all USING BTREE (bill_no,latest_flg,co_cd);

