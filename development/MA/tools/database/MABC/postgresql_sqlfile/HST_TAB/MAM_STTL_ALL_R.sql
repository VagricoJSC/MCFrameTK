\encoding UTF-8

CREATE TABLE mam_sttl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
sttl_cd varchar (10) NULL,
sttl_nm varchar (40) NULL,
ar_sttl_flg char (1) DEFAULT '0' NULL,
ap_sttl_flg char (1) DEFAULT '0' NULL,
ar_sttl_typ varchar (1) NULL,
rcv_reg_typ varchar (1) NULL,
sls_purc_typ varchar (1) NULL,
calc_com_paid_flg char (1) DEFAULT '0' NULL,
ar_setoff_cd varchar (10) NULL,
debt_cred_id_typ varchar (1) NULL,
ap_sttl_typ varchar (1) NULL,
ap_setoff_typ varchar (1) NULL,
ap_setoff_act_flg char (1) DEFAULT '0' NULL,
bill_tax_disp_flg char (1) DEFAULT '0' NULL,
ac_rsn_cd varchar (10) NULL,
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



ALTER TABLE mam_sttl_all_r ADD CONSTRAINT mam_sttl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_sttl_all_r', 'mam_sttl_all', 'mam_sttl_all_tr_r');

