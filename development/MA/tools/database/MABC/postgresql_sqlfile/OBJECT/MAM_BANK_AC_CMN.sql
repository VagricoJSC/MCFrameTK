\encoding UTF-8

CREATE TABLE mam_bank_ac_cmn
(bank_ac_cd varchar (40) NOT NULL,
bank_ac_nm varchar (60) NOT NULL,
ext_flg char (1) DEFAULT '0' NOT NULL,
bank_cd varchar (15) NOT NULL,
branch_cd varchar (15) NULL,
bank_ac_no varchar (40) NULL,
bank_ac_typ varchar (1) NULL,
bank_ac_holder varchar (100) NULL,
bank_ac_holder_sub varchar (100) NULL,
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


ALTER TABLE mam_bank_ac_cmn
ADD CONSTRAINT mam_bank_ac_cmn_pk PRIMARY KEY(bank_ac_cd);

