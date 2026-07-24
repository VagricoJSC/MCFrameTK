\encoding UTF-8

CREATE TABLE fcm_mining_task_sche_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
task_id varchar (30) NULL,
sche_no numeric  NULL,
description varchar (1000) NULL,
sche_hour numeric (2) DEFAULT 0 NULL,
sche_minute numeric (2) DEFAULT 0 NULL,
sche_month numeric (5) DEFAULT 0 NULL,
sche_day numeric (10) DEFAULT 0 NULL,
sche_week_no numeric (3) DEFAULT 0 NULL,
sche_week_day numeric (3) DEFAULT 0 NULL,
inv_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE fcm_mining_task_sche_r ADD CONSTRAINT fcm_mining_task_sche_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_mining_task_sche_r', 'fcm_mining_task_sche', 'fcm_mining_task_sche_tr_r');

