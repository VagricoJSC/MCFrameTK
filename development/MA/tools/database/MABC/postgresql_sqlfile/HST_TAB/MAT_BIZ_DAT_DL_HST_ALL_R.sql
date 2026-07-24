\encoding UTF-8

CREATE TABLE mat_biz_dat_dl_hst_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
biz_dat_dl_hst_no varchar (15) NULL,
co_cd varchar (10) NULL,
biz_dat_dl_sts_typ varchar (1) NULL,
proc_st_tm timestamp(0)  NULL,
proc_end_tm timestamp(0)  NULL,
biz_dat_id varchar (50) NULL,
biz_dat_dl_cond varchar (1000) NULL,
usr_cd varchar (500) NULL,
file_bin numeric  NULL,
file_size numeric (9,0) NULL,
data_cnt numeric (9,0) NULL,
dl_tm timestamp(0)  NULL,
dl_file_path varchar (200) NULL,
dl_file_nm varchar (100) NULL,
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
biz_dat_file_typ varchar (1) NULL
);



ALTER TABLE mat_biz_dat_dl_hst_all_r ADD CONSTRAINT mat_biz_dat_dl_hst_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mat_biz_dat_dl_hst_all_r', 'mat_biz_dat_dl_hst_all', 'mat_biz_dat_dl_hst_all_tr_r');

