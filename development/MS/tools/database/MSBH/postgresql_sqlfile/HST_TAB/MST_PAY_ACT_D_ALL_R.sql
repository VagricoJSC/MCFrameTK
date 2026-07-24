\encoding UTF-8

CREATE TABLE mst_pay_act_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
pay_act_d_no varchar (15) NULL,
pay_act_d_seq numeric (4,0) NULL,
co_cd varchar (10) NULL,
pay_act_no varchar (15) NULL,
pay_act_seq numeric (4,0) NULL,
disp_seq numeric (5,0) NULL,
ap_appl_schd_no varchar (15) NULL,
pay_schd_no varchar (15) NULL,
pay_chk_mng_no varchar (15) NULL,
pay_chk_no varchar (15) NULL,
calc_tgt_pay_chk_mng_no varchar (15) NULL,
ap_d_no varchar (15) NULL,
ap_sttl_cd varchar (10) NULL,
ap_sttl_typ varchar (1) NULL,
ac_rsn_cd varchar (10) NULL,
bank_ac_cd varchar (40) NULL,
pay_bank_ac_cd varchar (40) NULL,
trd_cur_com_paid_tax_cd varchar (5) NULL,
ap_setoff_typ varchar (1) NULL,
setoff_cd varchar (20) NULL,
setoff_nm varchar (100) NULL,
so_dpt_cd varchar (20) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_com_paid_tax_amt numeric (21,8) NULL,
trd_cur_exc_com_paid numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_com_paid_tax_amt numeric (21,8) NULL,
base_cur_exc_com_paid numeric (21,8) NULL,
rcv_no varchar (15) NULL,
adv_pay_act_no varchar (15) NULL,
bsppl_cd varchar (20) NULL,
bsppl_dpt_cd varchar (20) NULL,
asppl_cd varchar (20) NULL,
ap_dpt_cd varchar (20) NULL,
purc_act_no varchar (15) DEFAULT '*' NULL,
rcpt_iv_mng_no varchar (15) DEFAULT '*' NULL,
rcpt_iv_no varchar (15) DEFAULT '*' NULL,
wrk_no varchar (15) DEFAULT '*' NULL,
ap_typ varchar (1) NULL,
pay_ntc_d_print_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
intr_d_rmrks varchar (100) NULL,
par_pay_act_d_no varchar (15) NULL,
par_pay_act_d_seq numeric (4,0) NULL,
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



ALTER TABLE mst_pay_act_d_all_r ADD CONSTRAINT mst_pay_act_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_pay_act_d_all_r', 'mst_pay_act_d_all', 'mst_pay_act_d_all_tr_r');

