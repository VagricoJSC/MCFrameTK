\encoding UTF-8

CREATE TABLE mam_wg_cmn
(wg_cd varchar (10) NOT NULL,
wg_nm varchar (40) NOT NULL,
sls_flg char (1) DEFAULT '0' NOT NULL,
lg_flg char (1) DEFAULT '0' NOT NULL,
mfg_flg char (1) DEFAULT '0' NOT NULL,
purc_flg char (1) DEFAULT '0' NOT NULL,
ar_flg char (1) DEFAULT '0' NOT NULL,
ap_flg char (1) DEFAULT '0' NOT NULL,
sd_flg char (1) DEFAULT '0' NOT NULL,
mrp_prefix varchar (1) NULL,
mfg_inst_unit_typ varchar (1) NULL,
mrp_proc_typ varchar (1) NULL,
alloc_margin_days numeric (3,0) NULL,
not_xfr_flg char (1) DEFAULT '0' NOT NULL,
mrp_alloc_margin_days numeric (3,0) NULL,
mrp_opn_xfr_days numeric (3,0) NULL,
rqmt_typ varchar (1) NULL,
prod_pln_typ varchar (1) NULL,
dmnd_date_div_mons numeric (2,0) NULL,
plm_flg char (1) DEFAULT '0' NOT NULL,
calc_seq numeric (3,0) NULL,
cmn_upri_flg char (1) DEFAULT '0' NOT NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_wg_cmn
ADD CONSTRAINT mam_wg_cmn_pk PRIMARY KEY(wg_cd);

