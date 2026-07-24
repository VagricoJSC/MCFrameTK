\encoding UTF-8

CREATE TABLE mst_sls_bdg_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
ym timestamp(0)  NULL,
sls_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
sls_itm_grp_cd varchar (10) NULL,
cst_cd varchar (20) NULL,
sls_usr_cd varchar (500) NULL,
trd_cur_cd varchar (3) NULL,
wrk_no varchar (15) NULL,
sls_bdg_grp varchar (100) NULL,
co_cd varchar (10) NULL,
bdg_sls_amt numeric (21,8) NULL,
bdg_sls_prof_rate numeric (5,2) NULL,
bdg_sls_prof_amt numeric (21,8) NULL,
not_sum_flg char (1) DEFAULT '0' NULL,
sls_itm_grp_not_sum_flg char (1) DEFAULT '0' NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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



ALTER TABLE mst_sls_bdg_all_r ADD CONSTRAINT mst_sls_bdg_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_sls_bdg_all_r', 'mst_sls_bdg_all', 'mst_sls_bdg_all_tr_r');

