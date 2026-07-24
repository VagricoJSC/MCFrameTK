\encoding UTF-8

CREATE TABLE fct_print_dat
(print_seq numeric  NOT NULL,
report_type varchar (1) NULL,
report_id varchar (100) NULL,
report_version varchar (20) NULL,
form_file_name varchar (1024) NULL,
data_file_name varchar (1024) NULL,
data_file numeric  NULL,
if_file numeric  NULL,
container varchar (1000) NULL,
rowsize numeric (9,0) NULL,
print_locale_cd varchar (20) NULL,
print_option varchar (1024) NULL,
print_dt timestamp(0)  NULL,
printer_name varchar (512) NULL,
cartridge varchar (1000) NULL,
user_id varchar (500) NULL,
persistent char (1) NOT NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
app_title1 varchar (300) NULL,
app_title2 varchar (300) NULL,
app_title3 varchar (300) NULL,
app_title4 varchar (300) NULL,
app_title5 varchar (300) NULL,
app_report_no1 varchar (45) NULL,
app_report_no2 varchar (45) NULL,
app_report_no3 varchar (45) NULL,
app_report_no4 varchar (45) NULL,
app_report_no5 varchar (45) NULL,
app_itm_cd varchar (120) NULL,
app_itm_sub1 varchar (15) NULL,
app_itm_sub2 varchar (15) NULL,
app_itm_sub3 varchar (15) NULL,
app_itm_nm varchar (300) NULL,
app_report_sts1 varchar (6) NULL,
app_report_sts2 varchar (6) NULL,
app_report_sts3 varchar (6) NULL,
app_report_sts4 varchar (6) NULL,
app_report_sts5 varchar (6) NULL,
app_report_sts_nm1 varchar (120) NULL,
app_report_sts_nm2 varchar (120) NULL,
app_report_sts_nm3 varchar (120) NULL,
app_report_sts_nm4 varchar (120) NULL,
app_report_sts_nm5 varchar (120) NULL,
app_usr_cd1 varchar (500) NULL,
app_usr_cd2 varchar (500) NULL,
app_usr_cd3 varchar (500) NULL,
app_usr_cd4 varchar (500) NULL,
app_usr_cd5 varchar (500) NULL,
app_usr_nm1 varchar (300) NULL,
app_usr_nm2 varchar (300) NULL,
app_usr_nm3 varchar (300) NULL,
app_usr_nm4 varchar (300) NULL,
app_usr_nm5 varchar (300) NULL,
app_from_cd1 varchar (120) NULL,
app_from_cd2 varchar (120) NULL,
app_from_cd3 varchar (120) NULL,
app_from_cd4 varchar (120) NULL,
app_from_cd5 varchar (120) NULL,
app_from_nm1 varchar (300) NULL,
app_from_nm2 varchar (300) NULL,
app_from_nm3 varchar (300) NULL,
app_from_nm4 varchar (300) NULL,
app_from_nm5 varchar (300) NULL,
app_to_cd1 varchar (120) NULL,
app_to_cd2 varchar (120) NULL,
app_to_cd3 varchar (120) NULL,
app_to_cd4 varchar (120) NULL,
app_to_cd5 varchar (120) NULL,
app_to_nm1 varchar (300) NULL,
app_to_nm2 varchar (300) NULL,
app_to_nm3 varchar (300) NULL,
app_to_nm4 varchar (300) NULL,
app_to_nm5 varchar (300) NULL,
app_rmrks1 varchar (1024) NULL,
app_rmrks2 varchar (1024) NULL,
app_rmrks3 varchar (1024) NULL,
app_rmrks4 varchar (1024) NULL,
app_rmrks5 varchar (1024) NULL,
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


ALTER TABLE fct_print_dat
ADD CONSTRAINT fct_print_dat_pk PRIMARY KEY(print_seq);


CREATE INDEX fct_print_dat_ie01
ON fct_print_dat USING BTREE (user_id,co_cd,ext_attr1,ext_attr2,ext_attr3);


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fct_print_dat','data_file');


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fct_print_dat','if_file');

