\encoding UTF-8

CREATE TABLE mst_wrk_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
wrk_no varchar (15) NULL,
co_cd varchar (10) NULL,
wrk_nm varchar (100) NULL,
st_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
wrk_desc varchar (1000) NULL,
term_cond varchar (100) NULL,
prj_no varchar (20) DEFAULT '*' NULL,
wrk_sts_cd varchar (10) NULL,
slo_acc_cd varchar (10) NULL,
cur_cd varchar (3) NULL,
budget numeric (21,8) NULL,
slo_rsn varchar (100) NULL,
fail_rsn varchar (100) NULL,
wrk_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
wrk_ar_flg char (1) DEFAULT '0' NULL,
wrk_ap_flg char (1) DEFAULT '0' NULL,
can_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_wrk_all_r ADD CONSTRAINT mst_wrk_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_wrk_all_r', 'mst_wrk_all', 'mst_wrk_all_tr_r');

