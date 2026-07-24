\encoding UTF-8

CREATE TABLE mbt_attachment_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
data_no varchar (15) NULL,
edition numeric (4,0) NULL,
co_cd varchar (10) NULL,
biz_typ varchar (2) NULL,
report_id varchar (100) NULL,
biz_key1 varchar (15) NULL,
biz_key2 varchar (15) NULL,
biz_key3 varchar (15) NULL,
biz_key4 varchar (15) NULL,
biz_key5 varchar (15) NULL,
biz_key6 varchar (15) NULL,
biz_key7 varchar (15) NULL,
biz_key8 varchar (15) NULL,
biz_key9 varchar (15) NULL,
biz_key10 varchar (15) NULL,
data_crud_typ varchar (1) NULL,
dt timestamp(0)  NULL,
cur_cd varchar (3) NULL,
amt numeric (21,8) NULL,
bp_cd varchar (20) NULL,
rmrks1 varchar (100) NULL,
rmrks2 varchar (100) NULL,
rmrks3 varchar (100) NULL,
rmrks4 varchar (100) NULL,
rmrks5 varchar (100) NULL,
rpt_attr1 varchar (50) NULL,
rpt_attr2 varchar (50) NULL,
rpt_attr3 varchar (50) NULL,
rpt_attr4 varchar (50) NULL,
rpt_attr5 varchar (50) NULL,
rpt_attr6 varchar (50) NULL,
rpt_attr7 varchar (50) NULL,
rpt_attr8 varchar (50) NULL,
rpt_attr9 varchar (50) NULL,
rpt_attr10 varchar (50) NULL,
rpt_attr11 varchar (50) NULL,
rpt_attr12 varchar (50) NULL,
rpt_attr13 varchar (50) NULL,
rpt_attr14 varchar (50) NULL,
rpt_attr15 varchar (50) NULL,
rpt_attr16 varchar (50) NULL,
rpt_attr17 varchar (50) NULL,
rpt_attr18 varchar (50) NULL,
rpt_attr19 varchar (50) NULL,
rpt_attr20 varchar (50) NULL,
file_path varchar (200) NULL,
file_nm varchar (100) NULL,
archive_flg char (1) DEFAULT '0' NULL,
doc_id varchar (15) NULL,
file_bin numeric  NULL,
msg_queue_id varchar (100) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);



ALTER TABLE mbt_attachment_all_r ADD CONSTRAINT mbt_attachment_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mbt_attachment_all_r', 'mbt_attachment_all', 'mbt_attachment_all_tr_r');

