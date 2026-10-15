\encoding UTF-8

CREATE TABLE mst_qtn_itm_comp_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
qtn_itm_comp_no varchar (15) NULL,
co_cd varchar (10) NULL,
qtn_d_no varchar (15) NULL,
qtn_itm_comp_lno varchar (3) NULL,
sls_itm_comp_no varchar (15) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
sno1 varchar (20) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NULL,
core_itm_flg char (1) DEFAULT '0' NULL,
mst_flg char (1) DEFAULT '0' NULL,
std_comp_flg char (1) DEFAULT '0' NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
trd_cur_std_sls_upri numeric (21,8) NULL,
trd_cur_std_sls_amt numeric (21,8) NULL,
upri_rate numeric (5,2) NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
cost_upri numeric (21,8) NULL,
cost_amt numeric (21,8) NULL,
rmrks varchar (100) NULL,
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



ALTER TABLE mst_qtn_itm_comp_all_r ADD CONSTRAINT mst_qtn_itm_comp_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_qtn_itm_comp_all_r', 'mst_qtn_itm_comp_all', 'mst_qtn_itm_comp_all_tr_r');

