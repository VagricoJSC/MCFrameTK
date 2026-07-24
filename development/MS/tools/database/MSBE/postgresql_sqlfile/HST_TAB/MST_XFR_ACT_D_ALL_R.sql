\encoding UTF-8

CREATE TABLE mst_xfr_act_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
xfr_act_d_no varchar (15) NULL,
co_cd varchar (10) NULL,
xfr_act_no varchar (15) NULL,
xfr_alloc_sts_no varchar (15) DEFAULT '*' NULL,
xfr_inst_d_no varchar (15) DEFAULT '*' NULL,
gi_loc_cd varchar (20) NULL,
gi_str_ln_cd varchar (10) DEFAULT '*' NULL,
gi_stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
gr_str_ln_cd varchar (10) DEFAULT '*' NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
skip_chk_ship_flg char (1) DEFAULT '0' NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
dlv_slip_no varchar (15) DEFAULT '*' NULL,
dlv_slip_seq numeric (4,0) NULL,
dlv_slip_d_no varchar (15) DEFAULT '*' NULL,
io_schd_pr_no varchar (15) NULL,
base_dlv_slip_no varchar (15) NULL,
base_prov_act_no varchar (15) NULL,
base_ac_dt timestamp(0)  NULL,
disp_seq numeric (5,0) NULL,
wms_flg char (1) DEFAULT '0' NULL,
ext_sys_cd varchar (10) NULL,
ext_xfr_act_no varchar (300) NULL,
intr_d_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
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



ALTER TABLE mst_xfr_act_d_all_r ADD CONSTRAINT mst_xfr_act_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_xfr_act_d_all_r', 'mst_xfr_act_d_all', 'mst_xfr_act_d_all_tr_r');

