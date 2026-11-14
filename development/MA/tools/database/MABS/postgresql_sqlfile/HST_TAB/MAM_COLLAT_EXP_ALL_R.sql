\encoding UTF-8

CREATE TABLE mam_collat_exp_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
match_key varchar (30) NULL,
sub numeric (3) NULL,
typ numeric (1) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
itm_nm varchar (100) NULL,
itm_alt_nm1 varchar (100) NULL,
match_d_key varchar (3) NULL,
itm_qty numeric (6) NULL,
work_proc_no varchar (40) NULL,
fill_color varchar (100) NULL,
nm_plate varchar (100) NULL,
rmrks1 varchar (100) NULL,
rmrks2 varchar (100) NULL,
rmrks3 varchar (100) NULL,
rmrks4 varchar (100) NULL,
rmrks5 varchar (100) NULL,
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



ALTER TABLE mam_collat_exp_all_r ADD CONSTRAINT mam_collat_exp_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_collat_exp_all_r', 'mam_collat_exp_all', 'mam_collat_exp_all_tr_r');

