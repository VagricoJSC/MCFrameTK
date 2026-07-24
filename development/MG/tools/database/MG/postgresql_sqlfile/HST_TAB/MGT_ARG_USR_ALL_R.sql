\encoding UTF-8

CREATE TABLE mgt_arg_usr_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_no varchar (15) NULL,
calc_grp_cd varchar (10) NULL,
term timestamp(0)  NULL,
st_ym timestamp(0)  NULL,
end_ym timestamp(0)  NULL,
sa_typ varchar (1) NULL,
exp_calc_typ varchar (1) NULL,
pre_alc_calc_typ varchar (1) NULL,
alc_calc_typ varchar (1) NULL,
cost_calc_typ varchar (1) NULL,
eval_typ varchar (1) NULL,
inpt_calc_flg char (1) DEFAULT '0' NULL,
wk_calc_flg char (1) DEFAULT '0' NULL,
prov_calc_flg char (1) DEFAULT '0' NULL,
xfr_calc_flg char (1) DEFAULT '0' NULL,
xrate_cd varchar (2) NULL,
runtime_wg_cd varchar (10) NULL,
calc_st timestamp(0)  NULL,
calc_fin timestamp(0)  NULL,
calc_cnt numeric (2,0) DEFAULT 1 NULL,
calc_exec_cnt numeric (2,0) DEFAULT 1 NULL,
alc_err_flg char (1) DEFAULT '0' NULL,
trd_amt_flg char (1) DEFAULT '0' NULL,
adj_amt_flg char (1) DEFAULT '0' NULL,
minus_stk_flg char (1) DEFAULT '0' NULL,
other_chk_flg char (1) DEFAULT '0' NULL,
itm_limit_flg char (1) DEFAULT '0' NULL,
data_check_flg char (1) DEFAULT '0' NULL,
carry_flg char (1) DEFAULT '0' NULL,
non_del_flg char (1) DEFAULT '0' NULL,
fix_flg char (1) DEFAULT '0' NULL,
rate_fix_flg char (1) DEFAULT '0' NULL,
calc_err_flg char (1) DEFAULT '0' NULL,
ins_srv_req_no varchar (50) NULL,
batch_log_no varchar (15) NULL,
rmrks varchar (100) NULL,
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
co_cd varchar (10) NULL,
usr_cd varchar (500) NULL
);



ALTER TABLE mgt_arg_usr_all_r ADD CONSTRAINT mgt_arg_usr_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_arg_usr_all_r', 'mgt_arg_usr_all', 'mgt_arg_usr_all_tr_r');

