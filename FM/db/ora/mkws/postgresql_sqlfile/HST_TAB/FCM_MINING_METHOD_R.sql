\encoding UTF-8

CREATE TABLE fcm_mining_method_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mining_id varchar (30) NULL,
col_id varchar (512) NULL,
col_nm varchar (1000) NULL,
list_order numeric (10) NULL,
sum_info_typ varchar (1) NULL,
sumcond varchar (1000) NULL,
rank_flg char (1) DEFAULT '0' NULL,
rank_typ varchar (20) NULL,
rank_size numeric (9,0) NULL,
date_fmt varchar (1000) NULL,
fill_dt_flg char (1) DEFAULT '0' NULL,
fill_dt_fm timestamp(3)  NULL,
fill_dt_to timestamp(3)  NULL,
formula varchar (1000) NULL,
dec_place numeric (2) NULL,
round_mode_typ varchar (1) NULL,
null_zero char (1) DEFAULT '0' NULL,
sort_order numeric (10) NULL,
sort_typ varchar (20) NULL,
graph_typ numeric (2) NULL,
graph_label_flg char (1) DEFAULT '0' NULL,
graph_color varchar (100) NULL,
inv_flg char (1) DEFAULT '0' NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);



ALTER TABLE fcm_mining_method_r ADD CONSTRAINT fcm_mining_method_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_mining_method_r', 'fcm_mining_method', 'fcm_mining_method_tr_r');

