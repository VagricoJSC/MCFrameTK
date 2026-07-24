\encoding UTF-8

CREATE TABLE mst_mfg_inst_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mfg_inst_no varchar (15) NULL,
co_cd varchar (10) NULL,
mfg_inst_rev numeric (4,0) NULL,
itm_mfg_inst_no varchar (15) NULL,
po_d_no varchar (15) NULL,
base_unit_yield_qty numeric (21,8) NULL,
base_unit_inst_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
st_schd_tm timestamp(0)  NULL,
end_schd_tm timestamp(0)  NULL,
rqst_dlv_rqst_tm timestamp(0)  NULL,
inst_dt timestamp(0)  NULL,
inst_prnt_tm timestamp(0)  NULL,
inst_prnt_flg char (1) DEFAULT '0' NULL,
aprv_flg char (1) DEFAULT '0' NULL,
mfg_aprv_sts_typ varchar (1) NULL,
aprv_dt timestamp(0)  NULL,
aprv_dpt_cd varchar (20) NULL,
aprv_usr_cd varchar (500) NULL,
aprv_tm timestamp(0)  NULL,
aprv_rsn varchar (100) NULL,
mfg_aprv_role_cd varchar (10) NULL,
disp_pd varchar (60) NULL,
inst_dpt_cd varchar (20) NULL,
inst_usr_cd varchar (500) NULL,
can_flg char (1) DEFAULT '0' NULL,
abort_flg char (1) DEFAULT '0' NULL,
schd_chg_flg char (1) DEFAULT '0' NULL,
po_locked_flg char (1) DEFAULT '0' NULL,
po_auto_reg_flg char (1) DEFAULT '0' NULL,
mfg_inst_unit_typ varchar (1) NULL,
intr_rmrks varchar (100) NULL,
inst_rpt_rmrks varchar (100) NULL,
inst_po_cnt_rmrks varchar (100) NULL,
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



ALTER TABLE mst_mfg_inst_all_r ADD CONSTRAINT mst_mfg_inst_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mfg_inst_all_r', 'mst_mfg_inst_all', 'mst_mfg_inst_all_tr_r');

