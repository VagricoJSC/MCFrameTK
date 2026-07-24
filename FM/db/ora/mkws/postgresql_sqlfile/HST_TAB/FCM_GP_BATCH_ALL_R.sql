\encoding UTF-8

CREATE TABLE fcm_gp_batch_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
gp_batch_no varchar (15) NULL,
co_cd varchar (10) NULL,
gp_batch_grp_cd varchar (50) NULL,
gp_batch_order numeric (9,0) NULL,
module_id varchar (3) NULL,
logic_id varchar (50) NULL,
operation_id varchar (50) NULL,
version varchar (1000) NULL,
err_continue char (1) DEFAULT 0 NULL,
rmrks varchar (1000) NULL,
rmrks2 varchar (1000) NULL,
rmrks3 varchar (1000) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);



ALTER TABLE fcm_gp_batch_all_r ADD CONSTRAINT fcm_gp_batch_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_gp_batch_all_r', 'fcm_gp_batch_all', 'fcm_gp_batch_all_tr_r');

