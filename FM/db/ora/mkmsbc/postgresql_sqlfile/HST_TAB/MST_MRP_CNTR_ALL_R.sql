\encoding UTF-8

CREATE TABLE mst_mrp_cntr_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
wg_cd varchar (10) NULL,
mrp_cntr_typ varchar (10) NULL,
co_cd varchar (10) NULL,
prefix varchar (3) NULL,
cntr numeric (15,0) NULL,
max_val numeric (15,0) NULL,
min_val numeric (15,0) NULL,
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



ALTER TABLE mst_mrp_cntr_all_r ADD CONSTRAINT mst_mrp_cntr_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mrp_cntr_all_r', 'mst_mrp_cntr_all', 'mst_mrp_cntr_all_tr_r');

