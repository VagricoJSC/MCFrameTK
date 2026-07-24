\encoding UTF-8

CREATE TABLE mst_bill_rcpt_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
bill_rcpt_d_no varchar (15) NULL,
co_cd varchar (10) NULL,
bill_rcpt_no varchar (15) NULL,
bill_d_no varchar (15) NULL,
trd_cd varchar (4) NULL,
dlv_slip_no varchar (15) NULL,
dlv_slip_d_no varchar (15) NULL,
ship_dlv_slip_no varchar (15) NULL,
ship_dlv_slip_d_no varchar (15) NULL,
act_no varchar (15) NULL,
act_rev numeric (4,0) NULL,
act_d_no varchar (15) NULL,
po_no varchar (15) NULL,
po_d_no varchar (15) NULL,
ac_dt timestamp(0)  NULL,
dlv_dt timestamp(0)  NULL,
rcv_dt timestamp(0)  NULL,
bill_basis_dt timestamp(0)  NULL,
base_ac_dt timestamp(0)  NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
interim_flg char (1) DEFAULT '0' NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
tax_rate numeric (5,2) NULL,
inc_tax_flg char (1) DEFAULT '0' NULL,
trd_cur_tax_amt numeric (21,8) NULL,
trd_d_rmrks varchar (100) NULL,
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



ALTER TABLE mst_bill_rcpt_d_all_r ADD CONSTRAINT mst_bill_rcpt_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_bill_rcpt_d_all_r', 'mst_bill_rcpt_d_all', 'mst_bill_rcpt_d_all_tr_r');

