\encoding UTF-8

CREATE TABLE mst_bill_d_appl_bal_all
(bill_d_no varchar (15) NOT NULL,
parent_bill_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
last_appl_dt timestamp(0)  NULL,
appl_tgt_amt numeric (21,8) NOT NULL,
appl_amt numeric (21,8) NOT NULL,
not_appl_bal numeric (21,8) NOT NULL,
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


ALTER TABLE mst_bill_d_appl_bal_all
ADD CONSTRAINT mst_bill_d_appl_bal_all_pk PRIMARY KEY(bill_d_no,parent_bill_d_no,co_cd);

