\encoding UTF-8

CREATE TABLE mst_iv_ship_inst_map_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
iv_d_no varchar (15) NULL,
ship_inst_d_no varchar (15) NULL,
ship_schd_no varchar (15) DEFAULT '*' NULL,
ship_alloc_sts_no varchar (15) DEFAULT '*' NULL,
ship_inst_fix_flg char (1) DEFAULT '0' NULL,
co_cd varchar (10) NULL,
base_unit_qty numeric (21,8) NULL,
fix_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_iv_ship_inst_map_all_r ADD CONSTRAINT mst_iv_ship_inst_map_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_iv_ship_inst_map_all_r', 'mst_iv_ship_inst_map_all', 'mst_iv_ship_inst_map_all_tr_r');

