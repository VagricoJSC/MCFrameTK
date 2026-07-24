\encoding UTF-8

CREATE TABLE mst_purc_ret_act_io_p_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
purc_ret_act_io_no varchar (15) NULL,
co_cd varchar (10) NULL,
purc_ret_act_no varchar (15) NULL,
purc_ret_act_d_no varchar (15) NULL,
purc_ret_act_rev numeric (4,0) NULL,
purc_ret_loc_wg_cd varchar (10) NULL,
purc_ret_loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
ver_no varchar (10) NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
bp_lot_no varchar (15) NULL,
stk_id_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
quality_typ varchar (1) NULL,
gd_cd varchar (2) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
in_xfr_typ varchar (1) NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
pack_unit_qty numeric (21,8) NULL,
purc_cont_qty numeric (21,8) NULL,
ref_arr_act_no varchar (15) NULL,
ref_arr_act_rev numeric (4,0) NULL,
ref_purc_act_io_no varchar (15) NULL,
ref_purc_act_io_seq numeric (4,0) NULL,
purc_ret_schd_io_no varchar (15) NULL,
sls_act_io_no varchar (15) NULL,
can_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_purc_ret_act_io_p_all_r ADD CONSTRAINT mst_purc_ret_act_io_p_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_purc_ret_act_io_p_all_r', 'mst_purc_ret_act_io_p_all', 'mst_purc_ret_act_io_p_all_tr_r');

