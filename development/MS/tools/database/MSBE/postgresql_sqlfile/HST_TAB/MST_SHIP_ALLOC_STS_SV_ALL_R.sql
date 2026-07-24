\encoding UTF-8

CREATE TABLE mst_ship_alloc_sts_sv_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
ship_alloc_sts_no varchar (15) NULL,
co_cd varchar (10) NULL,
ship_schd_no varchar (15) NULL,
ship_inst_no varchar (15) NULL,
ship_inst_d_no varchar (15) NULL,
dlv_slip_no varchar (15) NULL,
dlv_slip_seq numeric (4,0) NULL,
dlv_slip_d_no varchar (15) NULL,
disp_seq numeric (5,0) NULL,
ship_loc_cd varchar (20) NULL,
ship_str_ln_cd varchar (10) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
ver_no varchar (10) NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno1_null_flg char (1) DEFAULT '0' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno2_null_flg char (1) DEFAULT '0' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno3_null_flg char (1) DEFAULT '0' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
sno4_null_flg char (1) DEFAULT '0' NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) DEFAULT '*' NULL,
trd_unit_qty numeric (21,8) NULL,
trd_unit_cd varchar (5) NULL,
pack_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
ent_unit_qty numeric (21,8) NULL,
ent_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
ship_act_qty numeric (21,8) NULL,
alloc_scope_typ varchar (1) NULL,
alloc_flg char (1) DEFAULT '0' NULL,
alloc_wait_flg char (1) DEFAULT '0' NULL,
not_lot_mix_flg char (1) DEFAULT '0' NULL,
not_sublot_mix_flg char (1) DEFAULT '0' NULL,
vld_dt_fr timestamp(0)  NULL,
vld_dt_to timestamp(0)  NULL,
io_schd_pr_no varchar (15) NULL,
stk_lst_prnt_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_ship_alloc_sts_sv_all_r ADD CONSTRAINT mst_ship_alloc_sts_sv_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_ship_alloc_sts_sv_all_r', 'mst_ship_alloc_sts_sv_all', 'mst_ship_alloc_sts_sv_all_tr_r');

