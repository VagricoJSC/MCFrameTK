\encoding UTF-8

CREATE TABLE mst_mrkt_judg_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mrkt_judg_d_no varchar (15) NULL,
co_cd varchar (10) NULL,
mrkt_judg_no varchar (15) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
mrkt_judg_src_typ varchar (1) NULL,
mrkt_judg_src_no varchar (15) NULL,
vld_dt timestamp(0)  NULL,
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



ALTER TABLE mst_mrkt_judg_d_all_r ADD CONSTRAINT mst_mrkt_judg_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mrkt_judg_d_all_r', 'mst_mrkt_judg_d_all', 'mst_mrkt_judg_d_all_tr_r');

