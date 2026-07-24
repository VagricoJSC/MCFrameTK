\encoding UTF-8

CREATE TABLE mst_pay_chk_all
(pay_chk_mng_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
pay_chk_no varchar (15) NOT NULL,
pay_ntc_rev numeric (4,0) NOT NULL,
reg_dt timestamp(0)  NOT NULL,
bsppl_cd varchar (20) NOT NULL,
bsppl_usr_cd varchar (500) NULL,
bsppl_dpt_cd varchar (20) NOT NULL,
purc_act_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_mng_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_no varchar (15) DEFAULT '*' NOT NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
pay_spot_flg char (1) DEFAULT '0' NOT NULL,
bsppl_cl_dt timestamp(0)  NULL,
bsppl_cl_day numeric (2,0) NULL,
trd_cur_cd varchar (3) NOT NULL,
prnt_flg char (1) DEFAULT '0' NOT NULL,
pay_xrate numeric (21,8) NULL,
amt numeric (21,8) DEFAULT 0 NOT NULL,
com_paid numeric (21,8) DEFAULT 0 NULL,
com_paid_tax_amt numeric (21,8) NULL,
last_pay_schd_amt numeric (21,8) NULL,
bfw_amt numeric (21,8) NULL,
purc_amt numeric (21,8) NOT NULL,
purc_ret_amt numeric (21,8) NOT NULL,
purc_dscnt_amt numeric (21,8) NOT NULL,
sw_to_amt numeric (21,8) NOT NULL,
tax_amt numeric (21,8) NOT NULL,
account_amt numeric (21,8) NULL,
cash_amt numeric (21,8) NULL,
note_amt numeric (21,8) NULL,
setoff_amt numeric (21,8) NULL,
setoff_tax_amt numeric (21,8) NULL,
sw_amt numeric (21,8) NULL,
schd_pay_amt numeric (21,8) NOT NULL,
adv_pay_amt numeric (21,8) NULL,
adv_pay_setoff_amt numeric (21,8) NULL,
adv_pay_setoff_tax_amt numeric (21,8) NULL,
adv_pay_bal numeric (21,8) NULL,
pay_sts_typ varchar (1) DEFAULT '0' NOT NULL,
batch_pay_schd_cl_flg char (1) DEFAULT '0' NOT NULL,
man_reg_flg char (1) DEFAULT '0' NOT NULL,
aprv_flg char (1) DEFAULT '0' NOT NULL,
aprv_no varchar (15) NULL,
aprv_sts_typ varchar (1) NULL,
pay_schd_d_print_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_pay_chk_all
ADD CONSTRAINT mst_pay_chk_all_pk PRIMARY KEY(pay_chk_mng_no,co_cd);


CREATE INDEX mst_pay_chk_all_ie01
ON mst_pay_chk_all USING BTREE (purc_act_no, co_cd);


CREATE INDEX mst_pay_chk_all_ie02
ON mst_pay_chk_all USING BTREE (rcpt_iv_mng_no, co_cd);


CREATE INDEX mst_pay_chk_all_ie03
ON mst_pay_chk_all USING BTREE (rcpt_iv_no, co_cd);


CREATE INDEX mst_pay_chk_all_ie04
ON mst_pay_chk_all USING BTREE (wrk_no, co_cd);


CREATE INDEX mst_pay_chk_all_ie05
ON mst_pay_chk_all USING BTREE (bsppl_cd, bsppl_dpt_cd, bsppl_cl_dt, co_cd);

