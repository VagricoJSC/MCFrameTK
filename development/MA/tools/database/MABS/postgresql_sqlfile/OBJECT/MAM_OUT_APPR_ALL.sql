\encoding UTF-8

CREATE TABLE mam_out_appr_all
(appr_acnt_id8 varchar (500) NOT NULL,
acnt_id8 varchar (500) NOT NULL,
co_cd varchar (10) NOT NULL,
appr_acnt_id5 varchar (500) NULL,
acnt_id5 varchar (500) NULL,
main_appr_flg char (1) DEFAULT '0' NOT NULL,
upd_acnt_id varchar (500) NOT NULL,
upd_dat timestamp(3)  NOT NULL,
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


ALTER TABLE mam_out_appr_all
ADD CONSTRAINT mam_out_appr_all_pk PRIMARY KEY(appr_acnt_id8,acnt_id8,co_cd);

