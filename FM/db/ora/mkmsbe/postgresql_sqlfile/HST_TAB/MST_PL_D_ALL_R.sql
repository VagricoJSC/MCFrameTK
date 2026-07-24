\encoding UTF-8

CREATE TABLE mst_pl_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
pl_d_no varchar (15) NULL,
co_cd varchar (10) NULL,
iv_no varchar (15) NULL,
disp_seq numeric (5,0) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
cntnr_cd varchar (5) NULL,
cntnr_no_fr numeric (3,0) NULL,
cntnr_no_to numeric (3,0) NULL,
net_wt numeric (21,8) NULL,
grss_wt numeric (21,8) NULL,
dim numeric (21,8) NULL,
cntry_org_cd varchar (2) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
cst_po_no varchar (20) NULL,
cst_po_d_no varchar (20) NULL,
pl_d_rmrks varchar (100) NULL,
intr_d_rmrks varchar (100) NULL,
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



ALTER TABLE mst_pl_d_all_r ADD CONSTRAINT mst_pl_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_pl_d_all_r', 'mst_pl_d_all', 'mst_pl_d_all_tr_r');

