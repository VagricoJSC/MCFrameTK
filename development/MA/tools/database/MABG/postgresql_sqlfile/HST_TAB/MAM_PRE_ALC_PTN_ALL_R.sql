\encoding UTF-8

CREATE TABLE mam_pre_alc_ptn_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
pre_alc_ptn_cd varchar (10) NULL,
pre_alc_ptn_nm varchar (40) NULL,
dpt_alc_typ varchar (1) NULL,
loc_alc_typ varchar (1) NULL,
oper_alc_typ varchar (1) NULL,
bp_alc_typ varchar (1) NULL,
ctg_alc_typ varchar (1) NULL,
itm_alc_typ varchar (1) NULL,
lot_alc_typ varchar (1) NULL,
sublot_alc_typ varchar (1) NULL,
sno1_alc_typ varchar (1) NULL,
sno2_alc_typ varchar (1) NULL,
sno3_alc_typ varchar (1) NULL,
sno4_alc_typ varchar (1) NULL,
inst_alc_typ varchar (1) NULL,
iv_alc_typ varchar (1) NULL,
po_alc_typ varchar (1) NULL,
slo_alc_typ varchar (1) NULL,
alc_ac_alc_typ varchar (1) NULL,
wg_alc_typ varchar (1) NULL,
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



ALTER TABLE mam_pre_alc_ptn_all_r ADD CONSTRAINT mam_pre_alc_ptn_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_pre_alc_ptn_all_r', 'mam_pre_alc_ptn_all', 'mam_pre_alc_ptn_all_tr_r');

