\encoding UTF-8

CREATE TABLE mst_sls_act_io_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
sls_act_io_no varchar (15) NULL,
sls_act_io_seq numeric (4,0) NULL,
co_cd varchar (10) NULL,
sls_act_d_no varchar (15) NULL,
sls_act_d_seq numeric (4,0) NULL,
ship_act_d_no varchar (15) NULL,
iv_ship_act_d_no varchar (15) NULL,
arr_act_no varchar (15) NULL,
purc_act_io_no varchar (15) NULL,
gd_cd varchar (2) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
pack_unit_qty numeric (21,8) NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
base_cur_upri numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
ptax_cur_upri numeric (21,8) NULL,
ptax_cur_amt numeric (21,8) NULL,
ptax_cur_dscnt_amt numeric (21,8) NULL,
ptax_cur_tax_amt numeric (21,8) NULL,
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



ALTER TABLE mst_sls_act_io_all_r ADD CONSTRAINT mst_sls_act_io_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_sls_act_io_all_r', 'mst_sls_act_io_all', 'mst_sls_act_io_all_tr_r');

