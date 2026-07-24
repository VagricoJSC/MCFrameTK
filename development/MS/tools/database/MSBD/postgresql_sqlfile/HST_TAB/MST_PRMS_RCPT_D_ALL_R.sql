\encoding UTF-8

CREATE TABLE mst_prms_rcpt_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
prms_rcpt_d_no varchar (15) NULL,
co_cd varchar (10) NULL,
prms_rcpt_no varchar (15) NULL,
prms_rcpt_rev numeric (4,0) NULL,
mfg_inst_no varchar (15) NULL,
purc_act_d_no varchar (15) NULL,
trd_unit_qty numeric (21,8) NULL,
trd_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
prms_dlv_tm timestamp(0)  NULL,
purc_schd_dt timestamp(0)  NULL,
sync_flg char (1) DEFAULT '0' NULL,
can_flg char (1) DEFAULT '0' NULL,
dlv_inst_d_no varchar (15) NULL,
intr_rmrks varchar (100) NULL,
prms_rmrks varchar (100) NULL,
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



ALTER TABLE mst_prms_rcpt_d_all_r ADD CONSTRAINT mst_prms_rcpt_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_prms_rcpt_d_all_r', 'mst_prms_rcpt_d_all', 'mst_prms_rcpt_d_all_tr_r');

