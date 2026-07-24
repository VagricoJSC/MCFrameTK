\encoding UTF-8

CREATE TABLE mst_ver_chg_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
par_itm_cd varchar (40) NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NULL,
chd_itm_cd varchar (40) NULL,
chd_itm_sub1 varchar (5) DEFAULT '*' NULL,
chd_itm_sub2 varchar (5) DEFAULT '*' NULL,
chd_itm_sub3 varchar (5) DEFAULT '*' NULL,
ver_no varchar (10) NULL,
bom_ptn varchar (40) NULL,
wg_cd varchar (10) NULL,
site_cd varchar (10) NULL,
co_cd varchar (10) NULL,
ver_chg_sts_typ varchar (1) NULL,
first_inst_st_tm timestamp(0)  NULL,
first_inst_lot_no varchar (15) NULL,
first_inst_sublot_no varchar (15) NULL,
first_mfg_inst_no varchar (15) NULL,
first_act_st_tm timestamp(0)  NULL,
first_act_lot_no varchar (15) NULL,
first_act_sublot_no varchar (15) NULL,
first_mfg_act_no varchar (15) NULL,
last_act_st_tm timestamp(0)  NULL,
last_act_lot_no varchar (15) NULL,
last_act_sublot_no varchar (15) NULL,
last_mfg_act_no varchar (15) NULL,
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



ALTER TABLE mst_ver_chg_all_r ADD CONSTRAINT mst_ver_chg_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_ver_chg_all_r', 'mst_ver_chg_all', 'mst_ver_chg_all_tr_r');

