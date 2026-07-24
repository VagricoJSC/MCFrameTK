\encoding UTF-8

CREATE TABLE mst_wrk_mng_all
(wrk_mng_typ varchar (2) NOT NULL,
wrk_mng_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
wrk_mng_nm varchar (100) NOT NULL,
str1 varchar (100) NULL,
str2 varchar (100) NULL,
str3 varchar (100) NULL,
num1 numeric (21,8) NULL,
num2 numeric (21,8) NULL,
num3 numeric (21,8) NULL,
flg1 char (1) NOT NULL,
flg2 char (1) NOT NULL,
flg3 char (1) NOT NULL,
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


ALTER TABLE mst_wrk_mng_all
ADD CONSTRAINT mst_wrk_mng_all_pk PRIMARY KEY(wrk_mng_typ,wrk_mng_cd,co_cd);

