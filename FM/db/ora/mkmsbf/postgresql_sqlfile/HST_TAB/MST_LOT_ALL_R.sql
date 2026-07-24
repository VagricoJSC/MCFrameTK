\encoding UTF-8

CREATE TABLE mst_lot_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
co_cd varchar (10) NULL,
schd_flg char (1) DEFAULT '0' NULL,
ver_no varchar (10) NULL,
first_gr_dt timestamp(0)  NULL,
base_gr_dt timestamp(0)  NULL,
unreg_lmt_flg char (1) DEFAULT '0' NULL,
vld_dt timestamp(0)  NULL,
lmt_dt timestamp(0)  NULL,
lot_mng_typ varchar (1) NULL,
sublot_mng_typ varchar (1) NULL,
bp_lot_no varchar (15) NULL,
stk_insp_typ varchar (1) NULL,
quality_typ varchar (1) NULL,
mfg_aprv_sts_typ varchar (1) NULL,
insp_aprv_sts_typ varchar (1) NULL,
plnt_aprv_sts_typ varchar (1) NULL,
mrkt_judg_sts_typ varchar (1) NULL,
first_gr_dt_save_flg char (1) DEFAULT '0' NULL,
act_cont_fctr numeric (21,8) NULL,
lmt_dt_frm_typ varchar (1) NULL,
lmt_dt_frm timestamp(0)  NULL,
lot_seq varchar (15) NULL,
no_del_flg char (1) DEFAULT '0' NULL,
lot_rmrks varchar (100) NULL,
lot_sub_char1 varchar (1000) NULL,
lot_sub_char2 varchar (1000) NULL,
lot_sub_char3 varchar (1000) NULL,
lot_sub_char4 varchar (1000) NULL,
lot_sub_char5 varchar (1000) NULL,
lot_sub_num1 numeric (21,8) NULL,
lot_sub_num2 numeric (21,8) NULL,
lot_sub_num3 numeric (21,8) NULL,
lot_sub_num4 numeric (21,8) NULL,
lot_sub_num5 numeric (21,8) NULL,
lot_sub_dt1 timestamp(0)  NULL,
lot_sub_dt2 timestamp(0)  NULL,
lot_sub_dt3 timestamp(0)  NULL,
lot_sub_dt4 timestamp(0)  NULL,
lot_sub_dt5 timestamp(0)  NULL,
lot_sub_flg1 char (1) DEFAULT '0' NULL,
lot_sub_flg2 char (1) DEFAULT '0' NULL,
lot_sub_flg3 char (1) DEFAULT '0' NULL,
lot_sub_flg4 char (1) DEFAULT '0' NULL,
lot_sub_flg5 char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_lot_all_r ADD CONSTRAINT mst_lot_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_lot_all_r', 'mst_lot_all', 'mst_lot_all_tr_r');

