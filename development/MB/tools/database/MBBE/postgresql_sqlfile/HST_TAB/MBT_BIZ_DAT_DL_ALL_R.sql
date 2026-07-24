\encoding UTF-8

CREATE TABLE mbt_biz_dat_dl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
biz_dat_id varchar (50) NULL,
co_cd varchar (10) NULL,
biz_dat_nm varchar (100) NULL,
biz_dat_rmrks1 varchar (1000) NULL,
biz_dat_rmrks2 varchar (1000) NULL,
biz_dat_rmrks3 varchar (1000) NULL,
module_id varchar (3) NULL,
logic_id varchar (50) NULL,
func_actyp varchar (10) NULL,
biz_dat_get_typ varchar (1) NULL,
sql_src text  NULL,
operation varchar (100) NULL,
res_path varchar (1024) NULL,
form_file_nm varchar (1024) NULL,
cartridge varchar (1000) NULL,
print_flg char (1) DEFAULT '0' NULL,
dwnld_flg char (1) DEFAULT '0' NULL,
dt_cond_col1 varchar (30) NULL,
dt_cond_col2 varchar (30) NULL,
dt_cond_col3 varchar (30) NULL,
dt_cond_col4 varchar (30) NULL,
dt_cond_col5 varchar (30) NULL,
dt_cond_col6 varchar (30) NULL,
dt_cond_col7 varchar (30) NULL,
dt_cond_col8 varchar (30) NULL,
dt_cond_col9 varchar (30) NULL,
dt_cond_col10 varchar (30) NULL,
str_cond_col1 varchar (30) NULL,
str_cond_col2 varchar (30) NULL,
str_cond_col3 varchar (30) NULL,
str_cond_col4 varchar (30) NULL,
str_cond_col5 varchar (30) NULL,
num_cond_col1 varchar (30) NULL,
num_cond_col2 varchar (30) NULL,
num_cond_col3 varchar (30) NULL,
num_cond_col4 varchar (30) NULL,
num_cond_col5 varchar (30) NULL,
flg_cond_col1 varchar (30) NULL,
flg_cond_col2 varchar (30) NULL,
flg_cond_col3 varchar (30) NULL,
flg_cond_col4 varchar (30) NULL,
flg_cond_col5 varchar (30) NULL,
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



ALTER TABLE mbt_biz_dat_dl_all_r ADD CONSTRAINT mbt_biz_dat_dl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mbt_biz_dat_dl_all_r', 'mbt_biz_dat_dl_all', 'mbt_biz_dat_dl_all_tr_r');

