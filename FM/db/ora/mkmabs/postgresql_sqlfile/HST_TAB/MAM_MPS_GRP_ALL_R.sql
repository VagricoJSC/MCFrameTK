\encoding UTF-8

CREATE TABLE mam_mps_grp_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mps_grp_cd varchar (10) NULL,
co_cd varchar (10) NULL,
mps_grp_nm varchar (40) NULL,
rqmt_mons numeric (2,0) NULL,
prcd_mons numeric (2,0) NULL,
date_div_mons numeric (2,0) NULL,
week_div_mons numeric (2,0) NULL,
period_div_mons numeric (2,0) NULL,
date_div_typ varchar (1) NULL,
mon01_prod_qty numeric (21,8) NULL,
mon02_prod_qty numeric (21,8) NULL,
mon03_prod_qty numeric (21,8) NULL,
mon04_prod_qty numeric (21,8) NULL,
mon05_prod_qty numeric (21,8) NULL,
mon06_prod_qty numeric (21,8) NULL,
mon07_prod_qty numeric (21,8) NULL,
mon08_prod_qty numeric (21,8) NULL,
mon09_prod_qty numeric (21,8) NULL,
mon10_prod_qty numeric (21,8) NULL,
mon11_prod_qty numeric (21,8) NULL,
mon12_prod_qty numeric (21,8) NULL,
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



ALTER TABLE mam_mps_grp_all_r ADD CONSTRAINT mam_mps_grp_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_mps_grp_all_r', 'mam_mps_grp_all', 'mam_mps_grp_all_tr_r');

