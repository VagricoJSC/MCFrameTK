\encoding UTF-8

CREATE TABLE fct_excld_grps_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
req_no varchar (50) NULL,
ope_id varchar (50) NULL,
gid numeric (15) NULL,
man_flg char (1) NULL
);



ALTER TABLE fct_excld_grps_r ADD CONSTRAINT fct_excld_grps_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_excld_grps_r', 'fct_excld_grps', 'fct_excld_grps_tr_r');

