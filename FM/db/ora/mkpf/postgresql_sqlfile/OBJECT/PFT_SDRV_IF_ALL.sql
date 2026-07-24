\encoding UTF-8

CREATE TABLE pft_sdrv_if_all
(data_no numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
if_proc_typ varchar (10) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
not_send_flg char (1) DEFAULT '0' NOT NULL,
conv_ope varchar (100) NULL,
file_io_ope varchar (100) NULL,
web_api_ope varchar (100) NULL,
cmd_exec_ope varchar (100) NULL,
sdrv_sts_typ varchar (2) NOT NULL,
sdrv_tm timestamp(0)  NULL,
sdrv_clt_id varchar (50) NULL,
sdrv_usr_id varchar (500) NULL,
sdrv_usr_nm varchar (100) NULL,
attr_char11 varchar (50) NULL,
attr_char12 varchar (50) NULL,
attr_char13 varchar (50) NULL,
attr_char14 varchar (50) NULL,
attr_char15 varchar (50) NULL,
attr_char16 varchar (50) NULL,
attr_char17 varchar (50) NULL,
attr_char18 varchar (50) NULL,
attr_char19 varchar (50) NULL,
attr_char20 varchar (50) NULL,
attr_char21 varchar (50) NULL,
attr_char22 varchar (50) NULL,
attr_char23 varchar (50) NULL,
attr_char24 varchar (50) NULL,
attr_char25 varchar (50) NULL,
attr_char26 varchar (50) NULL,
attr_char27 varchar (50) NULL,
attr_char28 varchar (50) NULL,
attr_char29 varchar (50) NULL,
attr_char30 varchar (50) NULL,
attr_tm1 timestamp(0)  NULL,
attr_tm2 timestamp(0)  NULL,
attr_tm3 timestamp(0)  NULL,
attr_tm4 timestamp(0)  NULL,
attr_tm5 timestamp(0)  NULL,
not_send_upd_flg char (1) DEFAULT '0' NOT NULL,
sdrv_if_rmrks varchar (100) NULL,
attr_char1 varchar (50) NULL,
attr_char2 varchar (50) NULL,
attr_char3 varchar (50) NULL,
attr_char4 varchar (50) NULL,
attr_char5 varchar (50) NULL,
attr_char6 varchar (50) NULL,
attr_char7 varchar (50) NULL,
attr_char8 varchar (50) NULL,
attr_char9 varchar (50) NULL,
attr_char10 varchar (50) NULL,
attr_num1 numeric (21,8) NULL,
attr_num2 numeric (21,8) NULL,
attr_num3 numeric (21,8) NULL,
attr_num4 numeric (21,8) NULL,
attr_num5 numeric (21,8) NULL,
attr_dt1 timestamp(0)  NULL,
attr_dt2 timestamp(0)  NULL,
attr_dt3 timestamp(0)  NULL,
attr_dt4 timestamp(0)  NULL,
attr_dt5 timestamp(0)  NULL,
batch_log_no varchar (15) NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
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


ALTER TABLE pft_sdrv_if_all
ADD CONSTRAINT pft_sdrv_if_all_pk PRIMARY KEY(data_no,co_cd);


CREATE INDEX pft_sdrv_if_all_ie01
ON pft_sdrv_if_all USING BTREE (attr_char1, co_cd);


CREATE INDEX pft_sdrv_if_all_ie02
ON pft_sdrv_if_all USING BTREE (attr_char3, co_cd);


CREATE INDEX pft_sdrv_if_all_ie03
ON pft_sdrv_if_all USING BTREE (attr_tm3, co_cd);

