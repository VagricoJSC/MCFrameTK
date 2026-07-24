\encoding UTF-8

CREATE TABLE mgt_std_fix_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
term timestamp(0)  NULL,
calc_ctg_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
co_cd varchar (10) NULL,
std_qty numeric (21,8) NULL,
std_upri numeric (21,8) NULL,
calc_no varchar (15) NULL,
calc_grp_cd varchar (10) NULL,
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



ALTER TABLE mgt_std_fix_all_r ADD CONSTRAINT mgt_std_fix_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_std_fix_all_r', 'mgt_std_fix_all', 'mgt_std_fix_all_tr_r');

