\encoding UTF-8

CREATE TABLE mam_slip_jnl_cmn
(ac_slip_typ varchar (5) NOT NULL,
summary_typ varchar (1) NOT NULL,
slo_no_flg char (1) DEFAULT '0' NOT NULL,
po_no_flg char (1) DEFAULT '0' NOT NULL,
iv_no_flg char (1) DEFAULT '0' NOT NULL,
bill_no_flg char (1) DEFAULT '0' NOT NULL,
trd_unit_flg char (1) DEFAULT '0' NOT NULL,
red_input_flg char (1) DEFAULT '0' NOT NULL,
jnl_act_cd varchar (1) NOT NULL,
auto_jnl_key_cd varchar (5) NULL,
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


ALTER TABLE mam_slip_jnl_cmn
ADD CONSTRAINT mam_slip_jnl_cmn_pk PRIMARY KEY(ac_slip_typ);

