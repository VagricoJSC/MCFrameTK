\encoding UTF-8

CREATE TABLE fcm_report_conf_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
conf_id numeric (15) NULL,
report_id varchar (100) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
locale_cd varchar (20) NULL,
priority numeric (5,0) NULL,
value1 varchar (1024) NULL,
value2 varchar (1024) NULL,
value3 varchar (1024) NULL,
value4 varchar (1024) NULL,
value5 varchar (1024) NULL,
server_print char (1) NULL,
print_exec char (1) DEFAULT '1' NULL,
printer_id varchar (100) NULL,
print_copy numeric (5,0) DEFAULT 1 NULL,
form_file_name varchar (1024) NULL,
cartridge varchar (1000) NULL,
reprint_mark varchar (1024) NULL,
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



ALTER TABLE fcm_report_conf_r ADD CONSTRAINT fcm_report_conf_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_report_conf_r', 'fcm_report_conf', 'fcm_report_conf_tr_r');

