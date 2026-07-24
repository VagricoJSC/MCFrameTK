\encoding UTF-8

CREATE TABLE fcm_report_key
(report_id varchar (100) NOT NULL,
key1 varchar (1024) NULL,
key2 varchar (1024) NULL,
key3 varchar (1024) NULL,
key4 varchar (1024) NULL,
key5 varchar (1024) NULL,
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


ALTER TABLE fcm_report_key
ADD CONSTRAINT fcm_report_key_pk PRIMARY KEY(report_id);

