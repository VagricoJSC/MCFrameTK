\encoding UTF-8

CREATE TABLE fct_mining_task_log
(task_id varchar (30) NOT NULL,
sche_id numeric  NOT NULL,
sche_dt timestamp(0)  NOT NULL,
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


ALTER TABLE fct_mining_task_log
ADD CONSTRAINT fct_mining_task_log_pk PRIMARY KEY(task_id,sche_id);

