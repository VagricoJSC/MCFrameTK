\encoding UTF-8

CREATE TABLE mam_attach_info_cmn_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
wg_cd varchar (10) DEFAULT '*' NULL,
attach_info_key1 varchar (50) NULL,
attach_info_key2 varchar (50) NULL,
attach_info_key3 varchar (50) NULL,
attach_info_key4 varchar (50) NULL,
attach_info_key5 varchar (50) NULL,
attach_info_id varchar (20) NULL,
attach_info_typ varchar (1) NULL,
attach_info_rmrks varchar (100) NULL,
attach_info_path varchar (200) NULL,
attach_info_bin numeric  NULL,
attach_info_bin_nm varchar (200) NULL,
ext_sys_no_attach varchar (20) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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



ALTER TABLE mam_attach_info_cmn_r ADD CONSTRAINT mam_attach_info_cmn_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_attach_info_cmn_r', 'mam_attach_info_cmn', 'mam_attach_info_cmn_tr_r');

