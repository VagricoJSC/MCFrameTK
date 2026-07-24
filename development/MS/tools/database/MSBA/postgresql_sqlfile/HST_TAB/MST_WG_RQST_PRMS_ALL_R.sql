\encoding UTF-8

CREATE TABLE mst_wg_rqst_prms_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
wg_rqst_prms_no varchar (15) NULL,
co_cd varchar (10) NULL,
wg_rqst_no varchar (15) NULL,
wg_cd varchar (10) NULL,
fix_flg char (1) DEFAULT '0' NULL,
fix_dt timestamp(0)  NULL,
prms_trd_unit_qty numeric (21,8) NULL,
prms_trd_unit_cd varchar (5) NULL,
prms_base_unit_qty numeric (21,8) NULL,
prms_base_unit_cd varchar (5) NULL,
gr_schd_tm timestamp(0)  NULL,
gi_lg_grp_cd varchar (10) NULL,
gi_loc_cd varchar (20) NULL,
gi_str_ln_cd varchar (10) NULL,
gi_rqst_tm timestamp(0)  NULL,
sppl_cd varchar (20) NULL,
maker_cd varchar (20) NULL,
mfg_loc_cd varchar (20) NULL,
bom_ptn varchar (40) NULL,
can_flg char (1) DEFAULT '0' NULL,
prms_rmrks varchar (100) NULL,
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



ALTER TABLE mst_wg_rqst_prms_all_r ADD CONSTRAINT mst_wg_rqst_prms_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_wg_rqst_prms_all_r', 'mst_wg_rqst_prms_all', 'mst_wg_rqst_prms_all_tr_r');

