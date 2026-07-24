\encoding UTF-8

CREATE TABLE mst_pay_ntc_his_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
pay_ntc_his_no varchar (15) NULL,
co_cd varchar (10) NULL,
pay_chk_no varchar (15) NULL,
pay_ntc_rev numeric (4,0) NULL,
latest_flg char (1) DEFAULT '0' NULL,
can_flg char (1) DEFAULT '0' NULL,
bsppl_cl_dt timestamp(0)  NULL,
reg_dt timestamp(0)  NULL,
pay_spot_flg char (1) DEFAULT '0' NULL,
rcpt_iv_no varchar (15) NULL,
wrk_no varchar (15) NULL,
bsppl_cd varchar (20) NULL,
bsppl_dpt_cd varchar (20) NULL,
pay_xrate numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
last_pay_schd_amt numeric (21,8) NULL,
pay_amt numeric (21,8) NULL,
sw_amt numeric (21,8) NULL,
bfw_amt numeric (21,8) NULL,
purc_amt numeric (21,8) NULL,
purc_dscnt_amt numeric (21,8) NULL,
purc_ret_amt numeric (21,8) NULL,
setoff_amt numeric (21,8) NULL,
tax_amt numeric (21,8) NULL,
sw_to_amt numeric (21,8) NULL,
schd_pay_amt numeric (21,8) NULL,
adv_pay_bal numeric (21,8) NULL,
adv_pay_amt numeric (21,8) NULL,
adv_pay_setoff_amt numeric (21,8) NULL,
adv_pay_setoff_tax_amt numeric (21,8) NULL,
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



ALTER TABLE mst_pay_ntc_his_all_r ADD CONSTRAINT mst_pay_ntc_his_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_pay_ntc_his_all_r', 'mst_pay_ntc_his_all', 'mst_pay_ntc_his_all_tr_r');

