\encoding UTF-8

CREATE TABLE mam_sls_anly_lcl_all
(sls_anly_typ varchar (1) NOT NULL,
sls_anly_cd varchar (10) NOT NULL,
sls_anly_nm varchar (40) NOT NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
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
co_cd varchar (10) NOT NULL,
lcl_cd varchar (7) NOT NULL
);


ALTER TABLE mam_sls_anly_lcl_all
ADD CONSTRAINT mam_sls_anly_lcl_all_pk PRIMARY KEY(sls_anly_typ,sls_anly_cd,co_cd,lcl_cd);

