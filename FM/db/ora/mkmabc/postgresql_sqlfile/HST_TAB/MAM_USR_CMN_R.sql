\encoding UTF-8

CREATE TABLE mam_usr_cmn_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
usr_cd varchar (500) NULL,
usr_nm varchar (100) NULL,
usr_alt_nm1 varchar (100) NULL,
usr_alt_nm2 varchar (100) NULL,
usr_alt_nm3 varchar (100) NULL,
usr_alt_nm4 varchar (100) NULL,
full_da_flg char (1) DEFAULT '0' NULL,
email1 varchar (100) NULL,
email2 varchar (100) NULL,
email3 varchar (100) NULL,
tel1 varchar (30) NULL,
tel2 varchar (30) NULL,
tel3 varchar (30) NULL,
th_image numeric  NULL,
usr_com_typ varchar (1) NULL,
usr_com varchar (100) NULL,
wk_cost_cd varchar (10) NULL,
usr_info1 varchar (100) NULL,
usr_info2 varchar (100) NULL,
usr_info3 varchar (100) NULL,
usr_info4 varchar (100) NULL,
usr_info5 varchar (100) NULL,
usr_info6 varchar (100) NULL,
usr_info7 varchar (100) NULL,
usr_info8 varchar (100) NULL,
usr_info9 varchar (100) NULL,
usr_info10 varchar (100) NULL,
usr_info11 varchar (100) NULL,
usr_info12 varchar (100) NULL,
usr_info13 varchar (100) NULL,
usr_info14 varchar (100) NULL,
usr_info15 varchar (100) NULL,
usr_info16 varchar (100) NULL,
usr_info17 varchar (100) NULL,
usr_info18 varchar (100) NULL,
usr_info19 varchar (100) NULL,
usr_info20 varchar (100) NULL,
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



ALTER TABLE mam_usr_cmn_r ADD CONSTRAINT mam_usr_cmn_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_usr_cmn_r', 'mam_usr_cmn', 'mam_usr_cmn_tr_r');

