\encoding UTF-8

CREATE TABLE fcm_server
(url varchar (1000) NOT NULL,
srv_id varchar (50) NOT NULL,
task_sche_mgr char (1) DEFAULT '0' NOT NULL,
srv_role numeric (5) DEFAULT 0 NOT NULL,
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


ALTER TABLE fcm_server
ADD CONSTRAINT fcm_server_pk PRIMARY KEY(url);

