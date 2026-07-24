\encoding UTF-8

CREATE TABLE fct_msg_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
msgid varchar (10) NULL,
loc_cd varchar (20) NULL,
lvl varchar (1) NULL,
msg varchar (1000) NULL
);



ALTER TABLE fct_msg_r ADD CONSTRAINT fct_msg_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_msg_r', 'fct_msg', 'fct_msg_tr_r');

