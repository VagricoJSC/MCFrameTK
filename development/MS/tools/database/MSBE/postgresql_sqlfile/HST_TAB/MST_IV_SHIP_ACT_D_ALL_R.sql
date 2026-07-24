\encoding UTF-8

CREATE TABLE mst_iv_ship_act_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
iv_ship_act_d_no varchar (15) NULL,
co_cd varchar (10) NULL,
iv_no varchar (15) NULL,
iv_d_no varchar (15) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
stk_mng_typ varchar (1) NULL,
sundry_itm_flg char (1) DEFAULT '0' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
ship_loc_cd varchar (20) NULL,
ship_str_ln_cd varchar (10) NULL,
arr_str_ln_cd varchar (10) NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
ver_no varchar (10) NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) DEFAULT '*' NULL,
trd_unit_qty numeric (21,8) NULL,
trd_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
pack_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
ship_act_d_no varchar (15) NULL,
io_schd_pr_no varchar (15) NULL,
sync_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_iv_ship_act_d_all_r ADD CONSTRAINT mst_iv_ship_act_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_iv_ship_act_d_all_r', 'mst_iv_ship_act_d_all', 'mst_iv_ship_act_d_all_tr_r');

