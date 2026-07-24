\encoding UTF-8

CREATE TABLE mam_cred_ctrl_cmn
(cred_cd varchar (20) NOT NULL,
cur_cd varchar (3) NOT NULL,
cred_limit numeric (21,8) NOT NULL,
alarm_point numeric (5,2) NOT NULL,
act_typ varchar (1) NOT NULL,
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


ALTER TABLE mam_cred_ctrl_cmn
ADD CONSTRAINT mam_cred_ctrl_cmn_pk PRIMARY KEY(cred_cd,cur_cd);

