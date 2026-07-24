\encoding UTF-8

CREATE TABLE fcm_gp_batch_grp_lcl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
gp_batch_grp_cd varchar (50) NULL,
co_cd varchar (10) NULL,
gp_batch_grp_nm varchar (100) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL,
lcl_cd varchar (20) NULL
);



ALTER TABLE fcm_gp_batch_grp_lcl_all_r ADD CONSTRAINT fcm_gp_batch_grp_lcl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_gp_batch_grp_lcl_all_r', 'fcm_gp_batch_grp_lcl_all', 'fcm_gp_batch_grp_lcl_all_tr_r');

