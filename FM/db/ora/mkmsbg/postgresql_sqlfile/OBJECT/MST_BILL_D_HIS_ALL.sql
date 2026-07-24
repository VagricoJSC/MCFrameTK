\encoding UTF-8

CREATE TABLE mst_bill_d_his_all
(bill_d_his_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
bill_his_no varchar (15) NOT NULL,
bill_d_no varchar (15) NULL,
bill_d_his_typ varchar (1) NOT NULL,
trd_cd varchar (4) NULL,
slip_sts_typ varchar (1) NULL,
act_no varchar (15) NULL,
act_seq numeric (4,0) NULL,
act_rev numeric (4,0) NULL,
act_d_no varchar (15) NULL,
act_d_seq numeric (4,0) NULL,
rcv_mtd_cd varchar (10) NULL,
cst_cd varchar (20) NULL,
dlv_cd varchar (20) NULL,
dlv_dt timestamp(0)  NULL,
base_sls_ac_dt timestamp(0)  NULL,
rcv_dt timestamp(0)  NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
base_cur_upri numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
trd_d_rmrks varchar (100) NULL,
bill_d_rmrks varchar (100) NULL,
dlv_slip_no varchar (15) NULL,
dlv_slip_d_no varchar (15) NULL,
ship_dlv_slip_no varchar (15) NULL,
ship_dlv_slip_d_no varchar (15) NULL,
ship_dlv_slip_multi_flg char (1) DEFAULT '0' NOT NULL,
bill_mtd_typ varchar (1) NULL,
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


ALTER TABLE mst_bill_d_his_all
ADD CONSTRAINT mst_bill_d_his_all_pk PRIMARY KEY(bill_d_his_no,co_cd);


CREATE INDEX mst_bill_d_his_all_ie01
ON mst_bill_d_his_all USING BTREE (bill_his_no,co_cd);


CREATE INDEX mst_bill_d_his_all_ie02
ON mst_bill_d_his_all USING BTREE (bill_d_no,co_cd);

