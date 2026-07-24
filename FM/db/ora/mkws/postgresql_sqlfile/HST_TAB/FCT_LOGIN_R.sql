\encoding UTF-8

CREATE TABLE fct_login_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
user_id varchar (500) NULL,
arc_cd varchar (3) NULL,
login_seq varchar (50) NULL,
clt_id varchar (50) NULL,
login_tm timestamp(3)  NULL,
last_req_tm timestamp(3)  NULL,
exec_flg char (1) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
prod varchar (1000) NULL,
user_nm varchar (40) NULL
);



ALTER TABLE fct_login_r ADD CONSTRAINT fct_login_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_login_r', 'fct_login', 'fct_login_tr_r');

