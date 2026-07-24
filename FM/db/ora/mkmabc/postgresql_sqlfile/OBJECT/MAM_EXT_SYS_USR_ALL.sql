\encoding UTF-8

CREATE TABLE mam_ext_sys_usr_all
(ext_sys_cd varchar (10) NOT NULL,
usr_cd varchar (500) DEFAULT '*' NOT NULL,
ext_sys_usr_cd varchar (500) NOT NULL,
ext_sys_pass varchar (1000) NULL,
ext_sys_str1 varchar (1000) NULL,
ext_sys_str2 varchar (1000) NULL,
ext_sys_str3 varchar (1000) NULL,
ext_sys_str4 varchar (1000) NULL,
ext_sys_str5 varchar (1000) NULL,
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
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mam_ext_sys_usr_all
ADD CONSTRAINT mam_ext_sys_usr_all_pk PRIMARY KEY(ext_sys_cd,usr_cd,co_cd);

