\encoding UTF-8

CREATE TABLE mam_cost_dpt_cmn_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
dpt_cd varchar (20) NULL,
term timestamp(0)  NULL,
dpt_nm varchar (100) NULL,
dpt_lvl_cd varchar (10) NULL,
dpt_alc_grp varchar (10) NULL,
dpt_config_typ varchar (1) NULL,
lg_grp_cd varchar (10) NULL,
loc_grp_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
site_cd varchar (10) NULL,
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



ALTER TABLE mam_cost_dpt_cmn_r ADD CONSTRAINT mam_cost_dpt_cmn_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_cost_dpt_cmn_r', 'mam_cost_dpt_cmn', 'mam_cost_dpt_cmn_tr_r');

