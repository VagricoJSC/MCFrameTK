\encoding UTF-8

CREATE TABLE mst_dlv_inst_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
dlv_inst_d_no varchar (15) NULL,
co_cd varchar (10) NULL,
dlv_inst_no varchar (15) NULL,
dlv_inst_seq numeric (4,0) NULL,
mfg_inst_no varchar (15) NULL,
purc_act_d_no varchar (15) NULL,
dlv_rqst_tm timestamp(0)  NULL,
purc_schd_dt timestamp(0)  NULL,
sync_flg char (1) DEFAULT '0' NULL,
in_to_loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
trd_unit_qty numeric (21,8) NULL,
trd_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
can_flg char (1) DEFAULT '0' NULL,
dlv_inst_print_d_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
dlv_slip_d_rmrks varchar (100) NULL,
dlv_cd varchar (20) NULL,
dlv_sundry_flg char (1) DEFAULT '0' NULL,
dlv_nm varchar (100) NULL,
dlv_cntct_dpt varchar (100) NULL,
dlv_cntct_psn varchar (100) NULL,
dlv_zip_cd varchar (10) NULL,
dlv_addr1 varchar (250) NULL,
dlv_addr2 varchar (250) NULL,
dlv_addr3 varchar (250) NULL,
dlv_addr4 varchar (250) NULL,
dlv_tel varchar (30) NULL,
dlv_fax varchar (30) NULL,
dlv_lg_grp_cd varchar (10) NULL,
pri_prnt_flg char (1) DEFAULT '0' NULL,
tdlv_cd varchar (20) NULL,
tdlv_sundry_flg char (1) DEFAULT '0' NULL,
tdlv_nm varchar (100) NULL,
tdlv_cntct_dpt varchar (100) NULL,
tdlv_cntct_psn varchar (100) NULL,
tdlv_zip_cd varchar (10) NULL,
tdlv_addr1 varchar (250) NULL,
tdlv_addr2 varchar (250) NULL,
tdlv_addr3 varchar (250) NULL,
tdlv_addr4 varchar (250) NULL,
tdlv_tel varchar (30) NULL,
tdlv_fax varchar (30) NULL,
tdlv_lg_grp_cd varchar (10) NULL,
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



ALTER TABLE mst_dlv_inst_d_all_r ADD CONSTRAINT mst_dlv_inst_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_dlv_inst_d_all_r', 'mst_dlv_inst_d_all', 'mst_dlv_inst_d_all_tr_r');

