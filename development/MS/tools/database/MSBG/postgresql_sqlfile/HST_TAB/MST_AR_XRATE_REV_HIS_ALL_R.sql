\encoding UTF-8

CREATE TABLE mst_ar_xrate_rev_his_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
ar_xrate_rev_his_no varchar (15) NULL,
co_cd varchar (10) NULL,
ac_ym timestamp(0)  NULL,
acst_cd varchar (20) NULL,
ar_dpt_cd varchar (20) NULL,
trd_cur_cd varchar (3) NULL,
iv_no varchar (15) NULL,
wrk_no varchar (15) NULL,
ar_typ varchar (1) NULL,
xrate_cd varchar (2) NULL,
new_xrate numeric (21,8) NULL,
old_xrate numeric (21,8) NULL,
base_cur_cd varchar (3) NULL,
exe_dt timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
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



ALTER TABLE mst_ar_xrate_rev_his_all_r ADD CONSTRAINT mst_ar_xrate_rev_his_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_ar_xrate_rev_his_all_r', 'mst_ar_xrate_rev_his_all', 'mst_ar_xrate_rev_his_all_tr_r');

