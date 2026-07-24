\encoding UTF-8

CREATE TABLE fcm_report_key_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
report_id varchar (100) NULL,
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



ALTER TABLE fcm_report_key_r ADD CONSTRAINT fcm_report_key_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_report_key_r', 'fcm_report_key', 'fcm_report_key_tr_r');

