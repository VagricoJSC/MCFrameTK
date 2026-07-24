\encoding UTF-8

CREATE TABLE mam_jnl_key_map_cmn
(ac_slip_typ varchar (5) NOT NULL,
cost_flg char (1) DEFAULT '0' NOT NULL,
jnl_key_col_typ varchar (2) NOT NULL,
jnl_key_set_col_typ varchar (5) NOT NULL,
bp_jnl_key_set_col_typ varchar (5) NULL,
default_cd varchar (20) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_jnl_key_map_cmn
ADD CONSTRAINT mam_jnl_key_map_cmn_pk PRIMARY KEY(ac_slip_typ,cost_flg,jnl_key_col_typ);

