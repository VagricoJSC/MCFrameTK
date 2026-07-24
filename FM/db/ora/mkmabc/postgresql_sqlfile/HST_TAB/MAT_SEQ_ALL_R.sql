\encoding UTF-8

CREATE TABLE mat_seq_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
num_biz_typ varchar (50) NULL,
num_ptn_cd varchar (10) NULL,
key_elm varchar (45) NULL,
co_cd varchar (10) NULL,
seq_typ varchar (3) NULL,
ora_seq_nm varchar (30) NULL,
min_val numeric (20,0) NULL,
max_val numeric (20,0) NULL,
increment_by numeric (9,0) NULL,
cycl_flg char (1) DEFAULT '0' NULL,
last_val numeric (20,0) NULL,
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



ALTER TABLE mat_seq_all_r ADD CONSTRAINT mat_seq_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mat_seq_all_r', 'mat_seq_all', 'mat_seq_all_tr_r');

