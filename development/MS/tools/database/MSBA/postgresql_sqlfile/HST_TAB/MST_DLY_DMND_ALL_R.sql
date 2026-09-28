\encoding UTF-8

CREATE TABLE mst_dly_dmnd_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
dly_dmnd_no varchar (15) NULL,
co_cd varchar (10) NULL,
dmnd_no varchar (15) NULL,
dmnd_dt timestamp(0)  NULL,
dmnd_st_dt timestamp(0)  NULL,
dmnd_end_dt timestamp(0)  NULL,
dlv_schd_st_dt timestamp(0)  NULL,
dlv_schd_end_dt timestamp(0)  NULL,
dmnd_period_typ varchar (1) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
spln_itm_cd varchar (40) NULL,
dmnd_typ varchar (1) NULL,
dmnd_qty numeric (21,8) NULL,
dmnd_dpt_cd varchar (20) NULL,
wrk_no varchar (15) DEFAULT '*' NULL,
dmnd_usr_cd varchar (500) NULL,
cst_cd varchar (20) NULL,
dlv_cd varchar (20) NULL,
slo_d_no varchar (15) NULL,
slo_no varchar (15) NULL,
cst_frcst_d_no varchar (15) NULL,
cst_frcst_no varchar (15) NULL,
ym timestamp(0)  NULL,
spln_vers varchar (20) NULL,
cur_cd varchar (3) NULL,
sno1 varchar (20) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
dmnd_loc_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
intr_rmrks varchar (100) NULL,
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



ALTER TABLE mst_dly_dmnd_all_r ADD CONSTRAINT mst_dly_dmnd_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_dly_dmnd_all_r', 'mst_dly_dmnd_all', 'mst_dly_dmnd_all_tr_r');

