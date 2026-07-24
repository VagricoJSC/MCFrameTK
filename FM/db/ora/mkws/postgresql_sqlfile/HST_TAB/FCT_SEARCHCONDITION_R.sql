\encoding UTF-8

CREATE TABLE fct_searchcondition_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
user_id varchar (500) NULL,
table_name varchar (30) NULL,
rows_no numeric (3) NULL,
valid_flg char (1) DEFAULT '0' NULL,
column_name varchar (30) NULL,
search_operator varchar (15) NULL,
search_value varchar (100) NULL,
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



ALTER TABLE fct_searchcondition_r ADD CONSTRAINT fct_searchcondition_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_searchcondition_r', 'fct_searchcondition', 'fct_searchcondition_tr_r');

