\encoding UTF-8

CREATE TABLE fcm_mining_task
(task_id varchar (30) NOT NULL,
task_nm varchar (1000) NOT NULL,
task_typ varchar (3) NOT NULL,
mining_id varchar (30) NOT NULL,
user_id varchar (500) NOT NULL,
co_cd varchar (10) NULL,
inv_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE fcm_mining_task
ADD CONSTRAINT fcm_mining_task_pk PRIMARY KEY(task_id);

