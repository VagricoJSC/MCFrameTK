\encoding UTF-8

CREATE TABLE mgt_std_top_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_no varchar (15) NULL,
calc_grp_cd varchar (10) NULL,
top_rec_no numeric (9,0) NULL,
co_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
mfg_purc_typ varchar (1) NULL,
loc_cd varchar (20) NULL,
sppl_cd varchar (20) NULL,
dpt_cd varchar (20) NULL,
cst_cd varchar (20) NULL,
dlv_cd varchar (20) NULL,
dest_cd1 varchar (20) NULL,
dest_cd2 varchar (20) NULL,
dest_cd3 varchar (20) NULL,
qty numeric (21,8) NULL,
amt numeric (21,8) NULL,
sls_amt numeric (21,8) NULL,
cur_cd varchar (3) NULL,
cur_amt numeric (21,8) NULL,
sls_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mgt_std_top_all_r ADD CONSTRAINT mgt_std_top_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_std_top_all_r', 'mgt_std_top_all', 'mgt_std_top_all_tr_r');

