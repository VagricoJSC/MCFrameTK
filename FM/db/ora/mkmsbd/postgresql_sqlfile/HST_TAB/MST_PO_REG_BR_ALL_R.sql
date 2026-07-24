\encoding UTF-8

CREATE TABLE mst_po_reg_br_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
batch_data_no varchar (20) NULL,
co_cd varchar (10) NULL,
batch_log_no varchar (15) NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
exe_sts_typ varchar (1) NULL,
po_schd_no varchar (15) NULL,
wg_cd varchar (10) NULL,
sppl_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
itm_nm varchar (100) NULL,
po_schd_dt timestamp(0)  NULL,
dlv_rqst_tm timestamp(0)  NULL,
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



ALTER TABLE mst_po_reg_br_all_r ADD CONSTRAINT mst_po_reg_br_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_po_reg_br_all_r', 'mst_po_reg_br_all', 'mst_po_reg_br_all_tr_r');

