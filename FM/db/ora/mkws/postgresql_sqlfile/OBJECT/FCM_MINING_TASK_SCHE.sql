\encoding UTF-8

CREATE TABLE fcm_mining_task_sche
(task_id varchar (30) NOT NULL,
sche_no numeric  NOT NULL,
description varchar (1000) NOT NULL,
sche_hour numeric (2) DEFAULT 0 NOT NULL,
sche_minute numeric (2) DEFAULT 0 NOT NULL,
sche_month numeric (5) DEFAULT 0 NOT NULL,
sche_day numeric (10) DEFAULT 0 NOT NULL,
sche_week_no numeric (3) DEFAULT 0 NOT NULL,
sche_week_day numeric (3) DEFAULT 0 NOT NULL,
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


ALTER TABLE fcm_mining_task_sche
ADD CONSTRAINT fcm_mining_task_sche_pk PRIMARY KEY(task_id,sche_no);

