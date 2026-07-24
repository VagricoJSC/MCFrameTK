\encoding UTF-8

CREATE TABLE mbt_aprv_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
aprv_no varchar (15) NULL,
aprv_no_seq numeric (9,0) NULL,
aprv_role_cd varchar (10) NULL,
aprv_usr_cd varchar (500) NULL,
co_cd varchar (10) NULL,
aprv_seq numeric (9,0) NULL,
aprv_d_sts_typ varchar (1) NULL,
aprv_d_tm timestamp(0)  NULL,
deputy_flg char (1) DEFAULT '0' NULL,
deputy_usr_cd varchar (500) NULL,
aprv_d_rmrks varchar (100) NULL,
not_upd_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mbt_aprv_d_all_r ADD CONSTRAINT mbt_aprv_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mbt_aprv_d_all_r', 'mbt_aprv_d_all', 'mbt_aprv_d_all_tr_r');

