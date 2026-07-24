\encoding UTF-8

CREATE TABLE mst_adv_pay_act_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
adv_pay_act_no varchar (15) NULL,
adv_pay_act_seq numeric (4,0) NULL,
co_cd varchar (10) NULL,
adv_pay_act_rev numeric (4,0) NULL,
slip_sts_typ varchar (1) NULL,
psppl_cd varchar (20) NULL,
bsppl_cd varchar (20) NULL,
bsppl_dpt_cd varchar (20) NULL,
bd_dpt_cd varchar (20) NULL,
pay_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
pay_usr_cd varchar (500) NULL,
pay_act_dt timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
ac_ym timestamp(0)  NULL,
trd_cur_cd varchar (3) NULL,
base_cur_cd varchar (3) NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
ap_sttl_cd varchar (10) NULL,
ap_sttl_typ varchar (1) NULL,
ac_rsn_cd varchar (10) NULL,
com_paid_ap_sttl_cd varchar (10) NULL,
com_paid_ap_sttl_typ varchar (1) NULL,
com_paid_ac_rsn_cd varchar (10) NULL,
trd_cur_com_paid_tax_cd varchar (5) NULL,
bank_ac_cd varchar (40) NULL,
pay_bank_ac_cd varchar (40) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_com_paid numeric (21,8) NULL,
trd_cur_com_paid_tax_amt numeric (21,8) NULL,
trd_cur_exc_com_paid numeric (21,8) NULL,
trd_cur_setoff_tgt_amt numeric (21,8) NULL,
trd_cur_setoff_schd_amt numeric (21,8) NULL,
trd_cur_setoff_act_amt numeric (21,8) NULL,
trd_cur_not_proc_bal numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_com_paid numeric (21,8) NULL,
base_cur_com_paid_tax_amt numeric (21,8) NULL,
base_cur_exc_com_paid numeric (21,8) NULL,
base_cur_setoff_tgt_amt numeric (21,8) NULL,
pay_chk_mng_no varchar (15) NULL,
pay_ntc_adv_pay_flg char (1) DEFAULT '0' NULL,
trd_rmrks varchar (100) NULL,
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



ALTER TABLE mst_adv_pay_act_all_r ADD CONSTRAINT mst_adv_pay_act_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_adv_pay_act_all_r', 'mst_adv_pay_act_all', 'mst_adv_pay_act_all_tr_r');

