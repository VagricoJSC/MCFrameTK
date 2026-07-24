\encoding UTF-8

CREATE TABLE pft_if_file_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
file_id numeric (15,0) NULL,
co_cd varchar (10) NULL,
file_path varchar (200) NULL,
file_nm varchar (100) NULL,
fproc_typ varchar (2) NULL,
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



ALTER TABLE pft_if_file_all_r ADD CONSTRAINT pft_if_file_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('pft_if_file_all_r', 'pft_if_file_all', 'pft_if_file_all_tr_r');

