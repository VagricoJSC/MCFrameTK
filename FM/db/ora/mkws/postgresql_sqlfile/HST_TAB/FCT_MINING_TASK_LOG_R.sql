\encoding UTF-8

CREATE TABLE fct_mining_task_log_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
task_id varchar (30) NULL,
sche_id numeric  NULL,
sche_dt timestamp(0)  NULL,
start_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
srv_id varchar (50) NULL,
msg_id varchar (10) NULL,
msg_bind varchar (1000) NULL,
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



ALTER TABLE fct_mining_task_log_r ADD CONSTRAINT fct_mining_task_log_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_mining_task_log_r', 'fct_mining_task_log', 'fct_mining_task_log_tr_r');

