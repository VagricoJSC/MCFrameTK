\encoding UTF-8

CREATE TABLE mgt_acc_cost_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_no varchar (15) NULL,
calc_grp_cd varchar (10) NULL,
inpt_rec_no numeric (9,0) NULL,
wk_rec_no numeric (9,0) NULL,
oper_act_no varchar (15) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
expns_cd varchar (20) NULL,
co_cd varchar (10) NULL,
act_cost numeric (21,8) NULL,
std_cost numeric (21,8) NULL,
sml_inpt_rec_no numeric (9,0) NULL,
top_rec_no numeric (9,0) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
oper_cost_flg char (1) DEFAULT '0' NULL,
expns_typ varchar (1) NULL,
diff_qty numeric (21,8) NULL,
diff_wk numeric (21,8) NULL,
diff_up numeric (21,8) NULL,
diff_rt numeric (21,8) NULL,
diff_std numeric (21,8) NULL,
diff_a numeric (21,8) NULL,
diff_b numeric (21,8) NULL,
diff_c numeric (21,8) NULL,
diff_d numeric (21,8) NULL,
diff_e numeric (21,8) NULL,
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



ALTER TABLE mgt_acc_cost_all_r ADD CONSTRAINT mgt_acc_cost_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_acc_cost_all_r', 'mgt_acc_cost_all', 'mgt_acc_cost_all_tr_r');

