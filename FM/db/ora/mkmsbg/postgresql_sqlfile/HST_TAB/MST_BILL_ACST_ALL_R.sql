\encoding UTF-8

CREATE TABLE mst_bill_acst_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
bill_acst_no varchar (15) NULL,
co_cd varchar (10) NULL,
bill_mng_no varchar (15) NULL,
acst_cd varchar (20) NULL,
ar_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
ar_typ varchar (1) NULL,
last_bill_amt numeric (21,8) NULL,
xfr_amt numeric (21,8) NULL,
note_amt numeric (21,8) NULL,
cash_amt numeric (21,8) NULL,
setoff_amt numeric (21,8) NULL,
setoff_tax_amt numeric (21,8) NULL,
sw_amt numeric (21,8) NULL,
bfw_amt numeric (21,8) NULL,
sls_amt numeric (21,8) NULL,
ret_amt numeric (21,8) NULL,
dscnt_amt numeric (21,8) NULL,
sw_to_amt numeric (21,8) DEFAULT 0 NULL,
tax_amt numeric (21,8) NULL,
bill_amt numeric (21,8) NULL,
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



ALTER TABLE mst_bill_acst_all_r ADD CONSTRAINT mst_bill_acst_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_bill_acst_all_r', 'mst_bill_acst_all', 'mst_bill_acst_all_tr_r');

