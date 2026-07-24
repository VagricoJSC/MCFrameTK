\encoding UTF-8

CREATE TABLE mst_ship_stk_rpl_lst_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
batch_data_no varchar (20) NULL,
co_cd varchar (10) NULL,
exec_tm timestamp(0)  NULL,
batch_log_no varchar (15) NULL,
io_schd_typ varchar (5) NULL,
io_schd_sts_typ varchar (2) NULL,
slip_schd_no varchar (15) NULL,
alloc_flg char (1) DEFAULT '0' NULL,
io_schd_no varchar (15) NULL,
io_schd_seq numeric (3,0) NULL,
io_schd_sub_typ1 varchar (2) NULL,
io_schd_sub_no1 varchar (15) NULL,
io_schd_sub_seq1 numeric (3,0) NULL,
io_schd_sub_typ2 varchar (2) NULL,
io_schd_sub_no2 varchar (15) NULL,
io_schd_sub_seq2 numeric (3,0) NULL,
io_schd_sub_typ3 varchar (2) NULL,
io_schd_sub_no3 varchar (15) NULL,
io_schd_sub_seq3 numeric (3,0) NULL,
io_schd_sub_typ4 varchar (2) NULL,
io_schd_sub_no4 varchar (15) NULL,
io_schd_sub_seq4 numeric (3,0) NULL,
io_schd_pr_no varchar (15) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
schd_dt timestamp(0)  NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
ver_no varchar (10) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
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
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) NULL,
stk_arrv_bp_cd varchar (20) NULL,
pack_unit_cd varchar (5) NULL,
pack_unit_short_qty numeric (21,8) DEFAULT 0 NULL,
base_unit_cd varchar (5) NULL,
base_unit_short_qty numeric (21,8) DEFAULT 0 NULL,
vld_dt_fr timestamp(0)  NULL,
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



ALTER TABLE mst_ship_stk_rpl_lst_all_r ADD CONSTRAINT mst_ship_stk_rpl_lst_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_ship_stk_rpl_lst_all_r', 'mst_ship_stk_rpl_lst_all', 'mst_ship_stk_rpl_lst_all_tr_r');

