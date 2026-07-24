\encoding UTF-8

CREATE TABLE mam_itm_wg_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
wg_cd varchar (10) NULL,
co_cd varchar (10) NULL,
mfg_inst_unit_typ varchar (1) NULL,
mrp_proc_typ varchar (1) NULL,
rqmt_typ varchar (1) NULL,
prod_pln_typ varchar (1) NULL,
dmnd_date_div_mons numeric (2,0) NULL,
alloc_margin_days numeric (3,0) NULL,
mrp_alloc_margin_days numeric (3,0) NULL,
mrp_opn_xfr_days numeric (3,0) NULL,
rqmt_rstr_qty numeric (21,8) NULL,
inpt_itm_add_typ varchar (1) NULL,
inpt_itm_del_typ varchar (1) NULL,
sch_tgt_typ varchar (1) NULL,
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



ALTER TABLE mam_itm_wg_all_r ADD CONSTRAINT mam_itm_wg_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_itm_wg_all_r', 'mam_itm_wg_all', 'mam_itm_wg_all_tr_r');

