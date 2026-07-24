\encoding UTF-8

CREATE TABLE mam_loc_cmn_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
loc_cd varchar (20) NULL,
loc_nm varchar (40) NULL,
asst_dpt_cd varchar (20) NULL,
sls_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
site_cd varchar (10) NULL,
lg_grp_cd varchar (10) NULL,
lg_def_flg char (1) DEFAULT '0' NULL,
loc_grp_cd varchar (10) NULL,
alloc_grp_cd varchar (10) NULL,
sppl_cd varchar (20) NULL,
maker_cd varchar (20) NULL,
pre_outsrc_act_flg char (1) DEFAULT '0' NULL,
ddlv_prov_insp_flg char (1) DEFAULT '0' NULL,
cal_cd varchar (10) NULL,
loc_mng_typ varchar (1) NULL,
prnt_lcl_cd varchar (7) NULL,
cntry_cd varchar (2) NULL,
num_id varchar (5) NULL,
stktk_tgt_flg char (1) DEFAULT '0' NULL,
stktk_tor_disp_flg char (1) DEFAULT '0' NULL,
stktk_tor_ex_zero_flg char (1) DEFAULT '0' NULL,
stktk_act_ex_zero_flg char (1) DEFAULT '0' NULL,
stktk_amt_flg char (1) DEFAULT '0' NULL,
str_ln_tgt_flg char (1) DEFAULT '0' NULL,
alloc_lmt_flg char (1) DEFAULT '0' NULL,
gi_pack_xfer_flg char (1) DEFAULT '0' NULL,
gi_vmi_flg char (1) DEFAULT '0' NULL,
rsrc_cd1 varchar (10) NULL,
rsrc_cd2 varchar (10) NULL,
ext_sys_loc_typ varchar (1) NULL,
loc_alc_grp varchar (10) NULL,
addr_flg char (1) DEFAULT '0' NULL,
zip_cd varchar (10) NULL,
addr1 varchar (250) NULL,
addr2 varchar (250) NULL,
addr3 varchar (250) NULL,
addr4 varchar (250) NULL,
tel varchar (30) NULL,
fax varchar (30) NULL,
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



ALTER TABLE mam_loc_cmn_r ADD CONSTRAINT mam_loc_cmn_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_loc_cmn_r', 'mam_loc_cmn', 'mam_loc_cmn_tr_r');

