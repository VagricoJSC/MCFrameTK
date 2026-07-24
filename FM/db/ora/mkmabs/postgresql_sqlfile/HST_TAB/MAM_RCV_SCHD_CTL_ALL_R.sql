\encoding UTF-8

CREATE TABLE mam_rcv_schd_ctl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
bcst_cd varchar (20) DEFAULT '*' NULL,
cur_cd varchar (3) NULL,
min_amt numeric (21,8) NULL,
sttl_cd varchar (10) NULL,
wg_cd varchar (10) DEFAULT '*' NULL,
co_cd varchar (10) NULL,
rate numeric (21,8) NULL,
crryovr_mons_typ varchar (1) NULL,
rcv_day1 numeric (2,0) NULL,
rcv_day2 numeric (2,0) NULL,
rcv_day3 numeric (2,0) NULL,
rcv_day4 numeric (2,0) NULL,
rcv_day5 numeric (2,0) NULL,
rcv_crryovr_mons1 numeric (3,0) NULL,
rcv_crryovr_mons2 numeric (3,0) NULL,
rcv_crryovr_mons3 numeric (3,0) NULL,
rcv_crryovr_mons4 numeric (3,0) NULL,
rcv_crryovr_mons5 numeric (3,0) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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



ALTER TABLE mam_rcv_schd_ctl_all_r ADD CONSTRAINT mam_rcv_schd_ctl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_rcv_schd_ctl_all_r', 'mam_rcv_schd_ctl_all', 'mam_rcv_schd_ctl_all_tr_r');

