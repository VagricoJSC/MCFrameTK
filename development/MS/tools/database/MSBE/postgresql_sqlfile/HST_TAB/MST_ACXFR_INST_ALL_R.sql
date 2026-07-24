\encoding UTF-8

CREATE TABLE mst_acxfr_inst_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
acxfr_inst_no varchar (15) NULL,
co_cd varchar (10) NULL,
trd_cd varchar (4) NULL,
trd_ptn_typ varchar (4) NULL,
loc_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
acxfr_inst_dt timestamp(0)  NULL,
inst_dpt_cd varchar (20) NULL,
inst_usr_cd varchar (500) NULL,
intr_rmrks varchar (100) NULL,
trd_rmrks varchar (100) NULL,
inst_rmrks varchar (100) NULL,
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



ALTER TABLE mst_acxfr_inst_all_r ADD CONSTRAINT mst_acxfr_inst_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_acxfr_inst_all_r', 'mst_acxfr_inst_all', 'mst_acxfr_inst_all_tr_r');

