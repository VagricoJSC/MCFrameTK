\encoding UTF-8

CREATE TABLE mam_if_ntc_ctl_all
(module_id varchar (3) DEFAULT '*' NOT NULL,
logic_id varchar (50) DEFAULT '*' NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
bp_cd varchar (20) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
ntc_title varchar (1000) NOT NULL,
biz_usr_ntc_flg char (1) DEFAULT '0' NOT NULL,
msg_lvl varchar (1) NULL,
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


ALTER TABLE mam_if_ntc_ctl_all
ADD CONSTRAINT mam_if_ntc_ctl_all_pk PRIMARY KEY(module_id,logic_id,wg_cd,bp_cd,co_cd);

