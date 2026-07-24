\encoding UTF-8

CREATE TABLE mam_dpt_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
dpt_cd varchar (20) NULL,
st_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
dpt_nm varchar (100) NULL,
dpt_lvl_cd varchar (10) NULL,
up_lv_dpt_cd varchar (20) NULL,
ac_dpt_cd varchar (20) NULL,
cost_dpt_cd varchar (20) NULL,
new_dpt_cd varchar (20) NULL,
zip_cd varchar (10) NULL,
addr1 varchar (250) NULL,
addr2 varchar (250) NULL,
addr3 varchar (250) NULL,
addr4 varchar (250) NULL,
tel varchar (30) NULL,
fax varchar (30) NULL,
wg_cd varchar (10) NULL,
rcv_bank_ac_cd varchar (40) NULL,
pay_bank_ac_cd varchar (40) NULL,
cal_cd varchar (10) NULL,
asst_dpt_flg char (1) DEFAULT '0' NULL,
ar_dpt_flg char (1) DEFAULT '0' NULL,
ap_dpt_flg char (1) DEFAULT '0' NULL,
sls_dpt_flg char (1) DEFAULT '0' NULL,
purc_dpt_flg char (1) DEFAULT '0' NULL,
ship_dpt_flg char (1) DEFAULT '0' NULL,
arr_dpt_flg char (1) DEFAULT '0' NULL,
mfg_dpt_flg char (1) DEFAULT '0' NULL,
sd_dpt_flg char (1) DEFAULT '0' NULL,
insp_dpt_flg char (1) DEFAULT '0' NULL,
bd_dpt_flg char (1) DEFAULT '0' NULL,
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
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NULL
);



ALTER TABLE mam_dpt_all_r ADD CONSTRAINT mam_dpt_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_dpt_all_r', 'mam_dpt_all', 'mam_dpt_all_tr_r');

