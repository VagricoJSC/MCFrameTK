\encoding UTF-8

CREATE TABLE mst_bill_acst_all
(bill_acst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
bill_mng_no varchar (15) NOT NULL,
acst_cd varchar (20) NOT NULL,
ar_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
ar_typ varchar (1) NOT NULL,
last_bill_amt numeric (21,8) NOT NULL,
xfr_amt numeric (21,8) NOT NULL,
note_amt numeric (21,8) NOT NULL,
cash_amt numeric (21,8) NOT NULL,
setoff_amt numeric (21,8) NOT NULL,
setoff_tax_amt numeric (21,8) NOT NULL,
sw_amt numeric (21,8) NOT NULL,
bfw_amt numeric (21,8) NOT NULL,
sls_amt numeric (21,8) NOT NULL,
ret_amt numeric (21,8) NOT NULL,
dscnt_amt numeric (21,8) NOT NULL,
sw_to_amt numeric (21,8) DEFAULT 0 NOT NULL,
tax_amt numeric (21,8) NOT NULL,
bill_amt numeric (21,8) NOT NULL,
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


ALTER TABLE mst_bill_acst_all
ADD CONSTRAINT mst_bill_acst_all_pk PRIMARY KEY(bill_acst_no,co_cd);


CREATE INDEX mst_bill_acst_all_ie01
ON mst_bill_acst_all USING BTREE (acst_cd,co_cd);


CREATE INDEX mst_bill_acst_all_ie02
ON mst_bill_acst_all USING BTREE (ar_dpt_cd,co_cd);

