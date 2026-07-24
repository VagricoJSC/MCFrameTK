\encoding UTF-8

CREATE TABLE mam_rpt_conf_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
rpt_ptn_cd varchar (10) NULL,
rpt_row_cd varchar (10) NULL,
rpt_pre_word varchar (10) NULL,
rpt_row_nm varchar (40) NULL,
rpt_seq numeric (3,0) NULL,
sml_flg char (1) DEFAULT '0' NULL,
hdn_flg char (1) DEFAULT '0' NULL,
rpt_tgt_typ varchar (1) NULL,
cost_io_typ varchar (2) NULL,
asst_typ varchar (1) NULL,
std_flg char (1) DEFAULT '0' NULL,
qty_unit_typ varchar (1) NULL,
alc_ac_grp_cd1 varchar (10) NULL,
alc_ac_grp_cd2 varchar (10) NULL,
alc_ac_grp_cd3 varchar (10) NULL,
alc_ac_cd varchar (20) NULL,
ac_slip_typ varchar (5) NULL,
ac_rsn_cd varchar (10) NULL,
itm_jnl_cd varchar (5) NULL,
itm_grp_cd1 varchar (10) NULL,
itm_grp_cd2 varchar (10) NULL,
itm_grp_cd3 varchar (10) NULL,
itm_grp_cd4 varchar (10) NULL,
itm_grp_cd5 varchar (10) NULL,
itm_grp_cd6 varchar (10) NULL,
itm_grp_cd7 varchar (10) NULL,
itm_grp_cd8 varchar (10) NULL,
itm_grp_cd9 varchar (10) NULL,
itm_grp_cd10 varchar (10) NULL,
expns_typ varchar (1) NULL,
direct_typ varchar (1) NULL,
var_typ varchar (1) NULL,
expns_grp_cd varchar (10) NULL,
expns_cd varchar (20) NULL,
fg_r numeric (3,0) NULL,
fg_g numeric (3,0) NULL,
fg_b numeric (3,0) NULL,
bg_r numeric (3,0) NULL,
bg_g numeric (3,0) NULL,
bg_b numeric (3,0) NULL,
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



ALTER TABLE mam_rpt_conf_all_r ADD CONSTRAINT mam_rpt_conf_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_rpt_conf_all_r', 'mam_rpt_conf_all', 'mam_rpt_conf_all_tr_r');

