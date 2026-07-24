\encoding UTF-8

CREATE TABLE mst_qtn_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
qtn_no varchar (15) NULL,
qtn_rev numeric (4,0) NULL,
co_cd varchar (10) NULL,
qtn_typ varchar (1) NULL,
failure_flg char (1) DEFAULT '0' NULL,
trd_cd varchar (4) NULL,
trd_ptn_typ varchar (4) NULL,
qtn_dt timestamp(0)  NULL,
valid_dt timestamp(0)  NULL,
cst_cd varchar (20) NULL,
cst_sundry_flg char (1) DEFAULT '0' NULL,
cst_nm varchar (100) NULL,
cst_cntct_dpt varchar (100) NULL,
cst_cntct_psn varchar (100) NULL,
cst_zip_cd varchar (10) NULL,
cst_addr1 varchar (250) NULL,
cst_addr2 varchar (250) NULL,
cst_addr3 varchar (250) NULL,
cst_addr4 varchar (250) NULL,
cst_tel varchar (30) NULL,
cst_fax varchar (30) NULL,
tterm_cd1 varchar (5) NULL,
tterm_rmrks1 varchar (100) NULL,
tterm_cd2 varchar (5) NULL,
tterm_rmrks2 varchar (100) NULL,
tterm_cd3 varchar (5) NULL,
tterm_rmrks3 varchar (100) NULL,
trnspt_cd varchar (5) NULL,
trd_cur_cd varchar (3) NULL,
xrate_inpt_flg char (1) DEFAULT '0' NULL,
xrate numeric (21,8) NULL,
sls_usr_cd varchar (500) NULL,
sls_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
qtn_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
qtn_term_cd varchar (10) NULL,
qtn_rslt_rsn_cd varchar (10) NULL,
qtn_rslt_rsn_rmrks varchar (100) NULL,
wrk_no varchar (15) NULL,
cst_qtn_rqst_no varchar (15) NULL,
rcpt_dt timestamp(0)  NULL,
rcpt_usr_cd varchar (500) NULL,
aprv_flg char (1) DEFAULT '0' NULL,
aprv_no varchar (15) NULL,
aprv_sts_typ varchar (1) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
qtn_prnt_flg char (1) DEFAULT '0' NULL,
qtn_prnt_seq numeric (3,0) NULL,
qtn_prnt_dt timestamp(0)  NULL,
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



ALTER TABLE mst_qtn_all_r ADD CONSTRAINT mst_qtn_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_qtn_all_r', 'mst_qtn_all', 'mst_qtn_all_tr_r');

