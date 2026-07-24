\encoding UTF-8

CREATE TABLE mst_pay_schd_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
pay_schd_no varchar (15) NULL,
co_cd varchar (10) NULL,
pay_chk_mng_no varchar (15) NULL,
asppl_cd varchar (20) NULL,
ap_dpt_cd varchar (20) NULL,
pay_dpt_cd varchar (20) NULL,
ap_typ varchar (1) NULL,
ap_sttl_cd varchar (10) NULL,
ap_sttl_typ varchar (1) NULL,
pay_schd_dt timestamp(0)  NULL,
pay_bank_ac_cd varchar (40) NULL,
bank_ac_cd varchar (40) NULL,
ap_setoff_typ varchar (1) NULL,
setoff_cd varchar (20) NULL,
setoff_nm varchar (100) NULL,
so_dpt_cd varchar (20) NULL,
xrate numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_com_paid_tax_cd varchar (5) NULL,
trd_cur_com_paid_tax_amt numeric (21,8) NULL,
trd_cur_exc_com_paid numeric (21,8) NULL,
trd_cur_appl_amt numeric (21,8) NULL,
pay_sts_typ varchar (1) DEFAULT '0' NULL,
sw_flg char (1) DEFAULT '0' NULL,
rcv_bill_no varchar (15) NULL,
adv_pay_act_no varchar (15) NULL,
note_no varchar (20) NULL,
note_typ varchar (1) NULL,
note_rsn_cd varchar (10) NULL,
draw_dt timestamp(0)  NULL,
due_dt timestamp(0)  NULL,
note_days numeric (3,0) NULL,
drawer_nm varchar (40) NULL,
draw_bank_cd varchar (15) NULL,
draw_branch_cd varchar (15) NULL,
endrsr varchar (30) NULL,
accptr varchar (30) NULL,
pay_ntc_d_print_rmrks varchar (100) NULL,
pay_schd_print_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
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



ALTER TABLE mst_pay_schd_all_r ADD CONSTRAINT mst_pay_schd_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_pay_schd_all_r', 'mst_pay_schd_all', 'mst_pay_schd_all_tr_r');

