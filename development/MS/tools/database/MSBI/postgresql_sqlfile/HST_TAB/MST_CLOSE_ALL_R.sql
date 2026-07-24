\encoding UTF-8

CREATE TABLE mst_close_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
ym timestamp(0)  NULL,
co_cd varchar (10) NULL,
sls_cl_flg char (1) DEFAULT '0' NULL,
rcv_cl_flg char (1) DEFAULT '0' NULL,
purc_cl_flg char (1) DEFAULT '0' NULL,
pay_cl_flg char (1) DEFAULT '0' NULL,
stk_cl_flg char (1) DEFAULT '0' NULL,
sls_cl_tm timestamp(0)  NULL,
rcv_cl_tm timestamp(0)  NULL,
purc_cl_tm timestamp(0)  NULL,
pay_cl_tm timestamp(0)  NULL,
stk_cl_tm timestamp(0)  NULL,
ar_pre_cl_tm timestamp(0)  NULL,
ap_pre_cl_tm timestamp(0)  NULL,
sls_cl_usr_cd varchar (500) NULL,
rcv_cl_usr_cd varchar (500) NULL,
purc_cl_usr_cd varchar (500) NULL,
pay_cl_usr_cd varchar (500) NULL,
stk_cl_usr_cd varchar (500) NULL,
ar_pre_cl_usr_cd varchar (500) NULL,
ap_pre_cl_usr_cd varchar (500) NULL,
ar_pre_cl_flg char (1) DEFAULT '0' NULL,
ap_pre_cl_flg char (1) DEFAULT '0' NULL,
all_acst_pre_cl_flg char (1) DEFAULT '0' NULL,
all_asppl_pre_cl_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_close_all_r ADD CONSTRAINT mst_close_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_close_all_r', 'mst_close_all', 'mst_close_all_tr_r');

