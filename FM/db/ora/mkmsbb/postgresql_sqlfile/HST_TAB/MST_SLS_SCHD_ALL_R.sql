\encoding UTF-8

CREATE TABLE mst_sls_schd_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
sls_schd_no varchar (15) NULL,
co_cd varchar (10) NULL,
sls_schd_src_typ varchar (2) NULL,
slo_d_no varchar (15) NULL,
dlv_inst_rcpt_no varchar (15) NULL,
ship_schd_no varchar (15) NULL,
ship_inst_d_no varchar (15) NULL,
dlv_slip_d_no varchar (15) NULL,
iv_no varchar (15) NULL,
iv_d_no varchar (15) NULL,
wg_rqst_no varchar (15) NULL,
po_schd_no varchar (15) NULL,
purc_schd_no varchar (15) NULL,
purc_act_d_no varchar (15) NULL,
sls_schd_dt timestamp(0)  NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
cmpl_flg char (1) DEFAULT '0' NULL,
not_auto_sls_flg char (1) DEFAULT '0' NULL,
abort_flg char (1) DEFAULT '0' NULL,
sls_ac_abl_flg char (1) DEFAULT '0' NULL,
base_unit_abort_qty numeric (21,8) NULL,
base_unit_sls_qty numeric (21,8) NULL,
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



ALTER TABLE mst_sls_schd_all_r ADD CONSTRAINT mst_sls_schd_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_sls_schd_all_r', 'mst_sls_schd_all', 'mst_sls_schd_all_tr_r');

