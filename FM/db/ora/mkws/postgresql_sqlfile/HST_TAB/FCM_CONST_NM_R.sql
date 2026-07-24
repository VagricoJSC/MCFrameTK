\encoding UTF-8

CREATE TABLE fcm_const_nm_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
c_grp_cd varchar (100) NULL,
c_key varchar (100) NULL,
locale_cd varchar (20) NULL,
v_s varchar (1000) NULL,
v_n numeric  NULL,
v_d timestamp(0)  NULL,
v_ts timestamp(3)  NULL,
v_f char (1) DEFAULT '0' NULL,
c_name varchar (1000) NULL,
c_rmrks varchar (1000) NULL
);



ALTER TABLE fcm_const_nm_r ADD CONSTRAINT fcm_const_nm_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_const_nm_r', 'fcm_const_nm', 'fcm_const_nm_tr_r');

