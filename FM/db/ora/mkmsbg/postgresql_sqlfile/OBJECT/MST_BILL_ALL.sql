\encoding UTF-8

CREATE TABLE mst_bill_all
(bill_mng_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
bcst_cd varchar (20) NOT NULL,
bill_cl_dt timestamp(0)  NOT NULL,
bill_no varchar (15) DEFAULT '*' NOT NULL,
bill_rev numeric (4,0) NOT NULL,
pre_bill_no varchar (15) NULL,
trd_cur_cd varchar (3) NOT NULL,
bill_xrate numeric (21,8) NULL,
iv_no varchar (15) DEFAULT '*' NOT NULL,
wrk_no varchar (15) NULL,
bill_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
bill_dt timestamp(0)  NULL,
pre_bill_dt timestamp(0)  NULL,
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
adv_amt_bal numeric (21,8) NOT NULL,
adv_amt numeric (21,8) NOT NULL,
adv_setoff_amt numeric (21,8) NOT NULL,
adv_setoff_tax_amt numeric (21,8) NOT NULL,
bill_each_sls_flg char (1) DEFAULT '0' NOT NULL,
bill_cl_sts_typ varchar (1) NOT NULL,
bill_cl_typ varchar (1) NULL,
foreign_flg char (1) DEFAULT '0' NOT NULL,
bill_tax_calc_typ varchar (1) NOT NULL,
prnt_flg char (1) DEFAULT '0' NOT NULL,
bill_rq_flg char (1) DEFAULT '0' NOT NULL,
base_dt timestamp(0)  NULL,
rcv_schd_amt numeric (21,8) NOT NULL,
rcv_act_amt numeric (21,8) NOT NULL,
not_appl_bal numeric (21,8) NOT NULL,
last_rcv_dt timestamp(0)  NULL,
rcv_schd_adjst_flg char (1) DEFAULT '0' NOT NULL,
edi_flg char (1) DEFAULT '0' NOT NULL,
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
upd_srv_req_no varchar (50) NULL,
bill_d_sel_flg char (1) DEFAULT '0' NOT NULL
);


ALTER TABLE mst_bill_all
ADD CONSTRAINT mst_bill_all_pk PRIMARY KEY(bill_mng_no,co_cd);


CREATE INDEX mst_bill_all_ie01
ON mst_bill_all USING BTREE (bill_no,co_cd);


CREATE INDEX mst_bill_all_ie02
ON mst_bill_all USING BTREE (iv_no,co_cd);

