\encoding UTF-8

CREATE TABLE mst_mly_ap_bal_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
ac_ym timestamp(0)  NULL,
asppl_cd varchar (20) NULL,
ap_dpt_cd varchar (20) NULL,
trd_cur_cd varchar (3) NULL,
purc_act_no varchar (15) DEFAULT '*' NULL,
rcpt_iv_mng_no varchar (15) DEFAULT '*' NULL,
wrk_no varchar (15) DEFAULT '*' NULL,
ap_typ varchar (1) NULL,
co_cd varchar (10) NULL,
init_bal numeric (21,8) NULL,
purc_amt numeric (21,8) NULL,
ret_amt numeric (21,8) NULL,
dscnt_amt numeric (21,8) NULL,
sw_to_amt numeric (21,8) NULL,
tax_amt numeric (21,8) NULL,
cash_amt numeric (21,8) NULL,
note_amt numeric (21,8) NULL,
account_amt numeric (21,8) NULL,
setoff_amt numeric (21,8) NULL,
sw_amt numeric (21,8) NULL,
end_bal numeric (21,8) NULL,
base_cur_cd varchar (3) NULL,
base_cur_init_bal numeric (21,8) NULL,
base_cur_purc_amt numeric (21,8) NULL,
base_cur_ret_amt numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
base_cur_sw_to_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
base_cur_cash_amt numeric (21,8) NULL,
base_cur_note_amt numeric (21,8) NULL,
base_cur_account_amt numeric (21,8) NULL,
base_cur_setoff_amt numeric (21,8) NULL,
base_cur_sw_amt numeric (21,8) NULL,
base_cur_end_bal numeric (21,8) NULL,
exc_gain_loss numeric (21,8) NULL,
total_exc_gain_loss numeric (21,8) NULL,
rcpt_iv_no varchar (15) DEFAULT '*' NULL,
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



ALTER TABLE mst_mly_ap_bal_all_r ADD CONSTRAINT mst_mly_ap_bal_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mly_ap_bal_all_r', 'mst_mly_ap_bal_all', 'mst_mly_ap_bal_all_tr_r');

