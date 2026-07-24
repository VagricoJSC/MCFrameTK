\encoding UTF-8

CREATE TABLE mam_bp_lcl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
bp_cd varchar (20) NULL,
bp_nm varchar (100) NULL,
bp_alt_nm1 varchar (100) NULL,
bp_alt_nm2 varchar (100) NULL,
bp_alt_nm3 varchar (100) NULL,
bp_alt_nm4 varchar (100) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL,
memo4 varchar (100) NULL,
memo5 varchar (100) NULL,
memo6 varchar (100) NULL,
memo7 varchar (100) NULL,
memo8 varchar (100) NULL,
memo9 varchar (100) NULL,
memo10 varchar (100) NULL,
memo11 varchar (100) NULL,
memo12 varchar (100) NULL,
memo13 varchar (100) NULL,
memo14 varchar (100) NULL,
memo15 varchar (100) NULL,
memo16 varchar (100) NULL,
memo17 varchar (100) NULL,
memo18 varchar (100) NULL,
memo19 varchar (100) NULL,
memo20 varchar (100) NULL,
co_cd varchar (10) NULL,
lcl_cd varchar (7) NULL
);



ALTER TABLE mam_bp_lcl_all_r ADD CONSTRAINT mam_bp_lcl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_bp_lcl_all_r', 'mam_bp_lcl_all', 'mam_bp_lcl_all_tr_r');

