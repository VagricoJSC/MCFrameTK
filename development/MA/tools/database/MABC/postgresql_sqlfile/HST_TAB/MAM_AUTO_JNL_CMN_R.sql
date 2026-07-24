\encoding UTF-8

CREATE TABLE mam_auto_jnl_cmn_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
ac_slip_typ varchar (5) NULL,
auto_jnl_key_cd varchar (5) NULL,
auto_jnl_grp varchar (5) NULL,
jnl_ptn_cd varchar (20) NULL,
prio numeric (9,0) NULL,
ac_if_typ varchar (1) NULL,
id_typ varchar (1) NULL,
slip_cnt_id varchar (3) NULL,
std_rnd_typ varchar (1) NULL,
cls_jnl_typ varchar (1) NULL,
compound_jnl_typ varchar (1) NULL,
alloc_jnl_flg char (1) DEFAULT '0' NULL,
minus_flg char (1) DEFAULT '0' NULL,
rev_flg char (1) DEFAULT '0' NULL,
minus_rev_flg char (1) DEFAULT '0' NULL,
default_flg char (1) DEFAULT '0' NULL,
abs_typ varchar (1) NULL,
abstract1 varchar (40) NULL,
st_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
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



ALTER TABLE mam_auto_jnl_cmn_r ADD CONSTRAINT mam_auto_jnl_cmn_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_auto_jnl_cmn_r', 'mam_auto_jnl_cmn', 'mam_auto_jnl_cmn_tr_r');

