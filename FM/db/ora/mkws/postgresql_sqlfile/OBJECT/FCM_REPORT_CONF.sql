\encoding UTF-8

CREATE TABLE fcm_report_conf
(conf_id numeric (15) NOT NULL,
report_id varchar (100) NOT NULL,
co_cd varchar (10) NOT NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
locale_cd varchar (20) NOT NULL,
priority numeric (5,0) NOT NULL,
value1 varchar (1024) NULL,
value2 varchar (1024) NULL,
value3 varchar (1024) NULL,
value4 varchar (1024) NULL,
value5 varchar (1024) NULL,
server_print char (1) NOT NULL,
print_exec char (1) DEFAULT '1' NOT NULL,
printer_id varchar (100) NULL,
print_copy numeric (5,0) DEFAULT 1 NOT NULL,
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


ALTER TABLE fcm_report_conf
ADD CONSTRAINT fcm_report_conf_pk PRIMARY KEY(conf_id);

