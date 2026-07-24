\encoding UTF-8

CREATE TABLE mst_mrprqmt_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
rqmt_no varchar (15) NULL,
co_cd varchar (10) NULL,
mrp_rqmt_typ varchar (1) NULL,
itm_ord_no varchar (15) NULL,
oper_ord_no varchar (15) NULL,
io_schd_typ varchar (5) NULL,
io_schd_sts_typ varchar (2) NULL,
io_schd_no varchar (15) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
ver_no varchar (10) NULL,
loc_cd varchar (20) NULL,
due_dt timestamp(0)  NULL,
net_rqmt_qty numeric (21,8) NULL,
alt_grp_cd varchar (40) NULL,
alt_grp_seq numeric (9,0) NULL,
alt_itm_typ varchar (1) NULL,
alt_itm_ratio numeric (9,0) NULL,
alt_alloc_prio numeric (9,0) NULL,
oper_ptn varchar (40) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno_typ1 varchar (1) NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno_typ2 varchar (1) NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno_typ3 varchar (1) NULL,
sno4 varchar (15) DEFAULT '*' NULL,
sno_typ4 varchar (1) NULL,
wg_cd varchar (10) NULL,
inpt_ctl_typ varchar (1) NULL,
mrp_proc_typ varchar (1) NULL,
loc_lmt_flg char (1) DEFAULT '0' NULL,
sim_mrp_no varchar (15) NULL,
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



ALTER TABLE mst_mrprqmt_all_r ADD CONSTRAINT mst_mrprqmt_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mrprqmt_all_r', 'mst_mrprqmt_all', 'mst_mrprqmt_all_tr_r');

