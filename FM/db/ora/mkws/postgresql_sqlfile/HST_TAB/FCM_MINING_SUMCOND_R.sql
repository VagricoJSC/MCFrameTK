\encoding UTF-8

CREATE TABLE fcm_mining_sumcond_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mining_id varchar (30) NULL,
sumcond varchar (1000) NULL,
list_order numeric (10) NULL,
col_id varchar (512) NULL,
data_typ varchar (1) NULL,
cond_val varchar (1000) NULL,
relative_ope varchar (1000) NULL,
logic_ope varchar (1000) NULL,
inv_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE fcm_mining_sumcond_r ADD CONSTRAINT fcm_mining_sumcond_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_mining_sumcond_r', 'fcm_mining_sumcond', 'fcm_mining_sumcond_tr_r');

