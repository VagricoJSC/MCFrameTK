\encoding UTF-8

CREATE TABLE mst_bf_br_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
batch_data_no varchar (20) NULL,
co_cd varchar (10) NULL,
batch_log_no varchar (15) NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
exe_sts_typ varchar (1) NULL,
mfg_inst_no varchar (15) NULL,
div_seq numeric (3,0) NULL,
mfg_act_no varchar (15) NULL,
oper_act_no varchar (15) NULL,
par_itm_cd varchar (40) NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NULL,
mfg_loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
st_act_tm timestamp(0)  NULL,
end_act_tm timestamp(0)  NULL,
bf_tgt_cnt numeric (9,0) NULL,
bf_success_cnt numeric (9,0) NULL,
bf_failure_cnt numeric (9,0) NULL,
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



ALTER TABLE mst_bf_br_all_r ADD CONSTRAINT mst_bf_br_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_bf_br_all_r', 'mst_bf_br_all', 'mst_bf_br_all_tr_r');

