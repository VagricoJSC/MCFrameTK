\encoding UTF-8

CREATE TABLE mst_mrkt_judg_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mrkt_judg_no varchar (15) NULL,
co_cd varchar (10) NULL,
mrkt_judg_sts_typ varchar (1) NULL,
mrkt_judg_upd_role_cd varchar (10) NULL,
upd_usr_cd varchar (500) NULL,
upd_dpt_cd varchar (20) NULL,
upd_dt timestamp(0)  NULL,
mrkt_judg_role_cd varchar (10) NULL,
judg_usr_cd varchar (500) NULL,
main_flg char (1) DEFAULT '0' NULL,
judg_dpt_cd varchar (20) NULL,
judg_dt timestamp(0)  NULL,
mfg_so_aprv_typ varchar (1) NULL,
quality_mng_typ varchar (1) NULL,
mfg_mng_typ varchar (1) NULL,
deviant_typ varchar (1) NULL,
deviant_msr_typ varchar (1) NULL,
prod_itm_info_typ varchar (1) NULL,
chd_itm_info_typ varchar (1) NULL,
mrkt_judg_prnt_flg char (1) DEFAULT '0' NULL,
mrkt_judg_prnt_tm timestamp(0)  NULL,
seq numeric (3,0) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
vld_dt timestamp(0)  NULL,
judg_rsn varchar (100) NULL,
site_cd varchar (10) NULL,
add_flg char (1) DEFAULT '0' NULL,
no_del_flg char (1) DEFAULT '0' NULL,
intr_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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



ALTER TABLE mst_mrkt_judg_all_r ADD CONSTRAINT mst_mrkt_judg_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mrkt_judg_all_r', 'mst_mrkt_judg_all', 'mst_mrkt_judg_all_tr_r');

