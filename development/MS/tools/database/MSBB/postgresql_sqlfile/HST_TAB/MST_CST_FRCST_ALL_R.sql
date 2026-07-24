\encoding UTF-8

CREATE TABLE mst_cst_frcst_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
cst_frcst_r_no varchar (15) NULL,
co_cd varchar (10) NULL,
cst_frcst_no varchar (15) DEFAULT '0' NULL,
cst_frcst_d_no varchar (15) DEFAULT '0' NULL,
cst_cd varchar (20) NULL,
dlv_cd varchar (20) NULL,
cst_frcst_prnt_dt timestamp(0)  NULL,
cst_frcst_slip_no varchar (15) NULL,
frcst_dpt_cd varchar (20) NULL,
frcst_usr_cd varchar (500) NULL,
wrk_no varchar (15) NULL,
rcpt_dt timestamp(0)  NULL,
fix_flg char (1) DEFAULT '0' NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
frcst_period_typ varchar (1) NULL,
frcst_dt timestamp(0)  NULL,
frcst_st_dt timestamp(0)  NULL,
frcst_end_dt timestamp(0)  NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
net_qty numeric (21,8) NULL,
gi_loc_cd varchar (20) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
cst_frcst_slip_d_no varchar (15) NULL,
prms_qty numeric (21,8) NULL,
frcst_stop_flg char (1) DEFAULT '0' NULL,
dmnd_cnt_rmrks varchar (100) NULL,
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



ALTER TABLE mst_cst_frcst_all_r ADD CONSTRAINT mst_cst_frcst_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_cst_frcst_all_r', 'mst_cst_frcst_all', 'mst_cst_frcst_all_tr_r');

