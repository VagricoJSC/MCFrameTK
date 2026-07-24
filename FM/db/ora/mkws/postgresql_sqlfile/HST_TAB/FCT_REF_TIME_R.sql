\encoding UTF-8

CREATE TABLE fct_ref_time_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
req_no varchar (50) NULL,
thread_no varchar (5) NULL,
table_name varchar (30) NULL,
ref_time timestamp(3)  NULL
);



ALTER TABLE fct_ref_time_r ADD CONSTRAINT fct_ref_time_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_ref_time_r', 'fct_ref_time', 'fct_ref_time_tr_r');

