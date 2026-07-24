\encoding UTF-8

CREATE TABLE mgt_bom_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
par_itm_cd varchar (40) NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NULL,
bom_ptn varchar (40) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
chd_itm_cd varchar (40) NULL,
chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
alt_grp_cd varchar (40) NULL,
expns_cd varchar (20) NULL,
term timestamp(0)  NULL,
calc_ctg_cd varchar (10) NULL,
wg_cd varchar (10) DEFAULT '*' NULL,
co_cd varchar (10) NULL,
disp_seq numeric (9,0) NULL,
par_rqmt_qty numeric (21,8) NULL,
chd_rqmt_qty numeric (21,8) NULL,
chd_base_qty numeric (21,8) NULL,
fxd_chd_rqmt_qty numeric (21,8) NULL,
chd_min_qty numeric (21,8) NULL,
chd_batch_qty numeric (21,8) NULL,
alt_itm_ratio numeric (9,0) NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
non_calc_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mgt_bom_all_r ADD CONSTRAINT mgt_bom_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_bom_all_r', 'mgt_bom_all', 'mgt_bom_all_tr_r');

