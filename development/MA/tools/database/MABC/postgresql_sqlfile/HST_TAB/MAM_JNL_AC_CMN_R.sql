\encoding UTF-8

CREATE TABLE mam_jnl_ac_cmn_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
jnl_grp_cd varchar (5) NULL,
itm_jnl_cd varchar (5) NULL,
ac_cd varchar (10) NULL,
sub_ac_cd varchar (10) NULL,
bp_typ varchar (1) NULL,
bp_cd varchar (20) NULL,
itm_typ varchar (1) NULL,
amt_typ varchar (1) NULL,
ac_tax_cd varchar (5) NULL,
abs_typ varchar (1) NULL,
abstract2 varchar (40) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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



ALTER TABLE mam_jnl_ac_cmn_r ADD CONSTRAINT mam_jnl_ac_cmn_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_jnl_ac_cmn_r', 'mam_jnl_ac_cmn', 'mam_jnl_ac_cmn_tr_r');

