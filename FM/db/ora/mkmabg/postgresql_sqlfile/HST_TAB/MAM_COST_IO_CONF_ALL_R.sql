\encoding UTF-8

CREATE TABLE mam_cost_io_conf_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
cost_io_id numeric (2,0) NULL,
io_col_cd varchar (10) NULL,
io_col_nm varchar (40) NULL,
io_seq numeric (2,0) NULL,
io_tgt_typ varchar (1) NULL,
io_sml_typ varchar (1) NULL,
unit_flg char (1) DEFAULT '0' NULL,
qty_flg char (1) DEFAULT '0' NULL,
amt_flg char (1) DEFAULT '0' NULL,
std_flg char (1) DEFAULT '0' NULL,
diff_flg char (1) DEFAULT '0' NULL,
bal_calc_typ varchar (1) NULL,
minus_flg char (1) DEFAULT '0' NULL,
fg_r numeric (3,0) NULL,
fg_g numeric (3,0) NULL,
fg_b numeric (3,0) NULL,
bg_r numeric (3,0) NULL,
bg_g numeric (3,0) NULL,
bg_b numeric (3,0) NULL,
prov_expns_flg char (1) DEFAULT '0' NULL,
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
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NULL
);



ALTER TABLE mam_cost_io_conf_all_r ADD CONSTRAINT mam_cost_io_conf_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_cost_io_conf_all_r', 'mam_cost_io_conf_all', 'mam_cost_io_conf_all_tr_r');

