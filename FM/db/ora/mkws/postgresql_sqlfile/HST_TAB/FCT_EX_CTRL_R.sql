\encoding UTF-8

CREATE TABLE fct_ex_ctrl_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
table_name varchar (30) NULL
);



ALTER TABLE fct_ex_ctrl_r ADD CONSTRAINT fct_ex_ctrl_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_ex_ctrl_r', 'fct_ex_ctrl', 'fct_ex_ctrl_tr_r');

