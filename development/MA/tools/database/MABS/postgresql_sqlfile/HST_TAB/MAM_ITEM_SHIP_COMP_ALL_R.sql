\encoding UTF-8

CREATE TABLE mam_item_ship_comp_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
co_cd varchar (10) NULL,
prod_itm_cd varchar (40) NULL,
prod_itm_sub1 varchar (5) DEFAULT '*' NULL,
prod_itm_sub2 varchar (5) DEFAULT '*' NULL,
prod_itm_sub3 varchar (5) DEFAULT '*' NULL,
surv_line_qty varchar (2) DEFAULT '*' NULL,
diameter varchar (4) DEFAULT '*' NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
qty numeric (21,8) NULL,
spec_cd varchar (20) NULL,
disp_seq numeric (5,0) NULL,
body_flg char (1) DEFAULT '0' NULL,
comp_flg char (1) DEFAULT '0' NULL,
ship_prnt_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mam_item_ship_comp_all_r ADD CONSTRAINT mam_item_ship_comp_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_item_ship_comp_all_r', 'mam_item_ship_comp_all', 'mam_item_ship_comp_all_tr_r');

