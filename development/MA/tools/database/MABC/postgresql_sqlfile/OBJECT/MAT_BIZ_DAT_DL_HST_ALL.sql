\encoding UTF-8

CREATE TABLE mat_biz_dat_dl_hst_all
(biz_dat_dl_hst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
biz_dat_dl_sts_typ varchar (1) NOT NULL,
proc_st_tm timestamp(0)  NOT NULL,
proc_end_tm timestamp(0)  NULL,
biz_dat_id varchar (50) NOT NULL,
biz_dat_dl_cond varchar (1000) NULL,
usr_cd varchar (500) NOT NULL,
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


ALTER TABLE mat_biz_dat_dl_hst_all
ADD CONSTRAINT mat_biz_dat_dl_hst_all_pk PRIMARY KEY(biz_dat_dl_hst_no,co_cd);


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('mat_biz_dat_dl_hst_all','file_bin');

