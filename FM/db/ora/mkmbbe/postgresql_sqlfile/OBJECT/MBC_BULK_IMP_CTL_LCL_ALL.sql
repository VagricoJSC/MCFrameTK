\encoding UTF-8

CREATE TABLE mbc_bulk_imp_ctl_lcl_all
(table_id varchar (30) NOT NULL,
co_cd varchar (10) NOT NULL,
table_nm varchar (100) NOT NULL,
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
lcl_cd varchar (7) NOT NULL
);


ALTER TABLE mbc_bulk_imp_ctl_lcl_all
ADD CONSTRAINT mbc_bulk_imp_ctl_lcl_all_pk PRIMARY KEY(table_id,co_cd,lcl_cd);

