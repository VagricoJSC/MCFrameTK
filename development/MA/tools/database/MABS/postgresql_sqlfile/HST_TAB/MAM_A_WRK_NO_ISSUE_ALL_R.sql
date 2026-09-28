\encoding UTF-8

CREATE TABLE mam_a_wrk_no_issue_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
issue_typ varchar (1) NULL,
dept_cd varchar (1) NULL,
prod_cd varchar (2) NULL,
ym varchar (4) NULL,
ope_typ varchar (2) NULL,
co_cd varchar (10) NULL,
wrk_seq numeric (20,0) NULL,
wrk_sub_seq numeric (9,0) NULL,
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



ALTER TABLE mam_a_wrk_no_issue_all_r ADD CONSTRAINT mam_a_wrk_no_issue_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_a_wrk_no_issue_all_r', 'mam_a_wrk_no_issue_all', 'mam_a_wrk_no_issue_all_tr_r');

