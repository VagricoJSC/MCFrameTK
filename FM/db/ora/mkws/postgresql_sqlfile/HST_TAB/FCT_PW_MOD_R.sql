\encoding UTF-8

CREATE TABLE fct_pw_mod_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
user_id varchar (500) NULL,
user_pw varchar (40) NULL,
pw_mod_dt timestamp(0)  NULL
);



ALTER TABLE fct_pw_mod_r ADD CONSTRAINT fct_pw_mod_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_pw_mod_r', 'fct_pw_mod', 'fct_pw_mod_tr_r');

