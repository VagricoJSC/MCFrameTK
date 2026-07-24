\encoding UTF-8

CREATE TABLE mgt_itm_dtl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
loc_cd varchar (20) DEFAULT '*' NULL,
sppl_cd varchar (20) DEFAULT '*' NULL,
rqst_wg_cd varchar (10) DEFAULT '*' NULL,
term timestamp(0)  NULL,
calc_ctg_cd varchar (10) NULL,
wg_cd varchar (10) DEFAULT '*' NULL,
co_cd varchar (10) NULL,
cost_ratio numeric (21,8) NULL,
oper_ptn varchar (40) NULL,
bom_ptn varchar (40) DEFAULT '*' NULL,
min_lot_qty numeric (21,8) NULL,
batch_lot_qty numeric (21,8) NULL,
fxd_lot_qty numeric (21,8) NULL,
fxd_yield_qty numeric (21,8) NULL,
nmr_qty numeric (21,8) NULL,
dnm_qty numeric (21,8) NULL,
alc_dpt_cd varchar (20) NULL,
exp_dpt_cd varchar (20) NULL,
exp_prio numeric (9,0) NULL,
max_qty numeric (21,8) NULL,
alc_val1 numeric (21,8) NULL,
alc_val2 numeric (21,8) NULL,
alc_val3 numeric (21,8) NULL,
alc_val4 numeric (21,8) NULL,
alc_val5 numeric (21,8) NULL,
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



ALTER TABLE mgt_itm_dtl_all_r ADD CONSTRAINT mgt_itm_dtl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_itm_dtl_all_r', 'mgt_itm_dtl_all', 'mgt_itm_dtl_all_tr_r');

