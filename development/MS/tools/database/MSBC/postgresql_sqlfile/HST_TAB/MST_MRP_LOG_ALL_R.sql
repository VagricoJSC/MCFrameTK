\encoding UTF-8

CREATE TABLE mst_mrp_log_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
wg_cd varchar (10) NULL,
mrp_calc_no varchar (15) NULL,
seq_no numeric (9,0) NULL,
co_cd varchar (10) NULL,
mrp_typ varchar (1) NULL,
log_time varchar (15) NULL,
msg_id varchar (10) NULL,
msg varchar (1000) NULL,
gp_batch_grp_cd varchar (50) NULL,
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



ALTER TABLE mst_mrp_log_all_r ADD CONSTRAINT mst_mrp_log_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mrp_log_all_r', 'mst_mrp_log_all', 'mst_mrp_log_all_tr_r');

