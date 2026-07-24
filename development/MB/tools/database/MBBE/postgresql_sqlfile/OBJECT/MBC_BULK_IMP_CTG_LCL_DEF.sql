\encoding UTF-8

CREATE TABLE mbc_bulk_imp_ctg_lcl_def
(table_ctg varchar (10) NOT NULL,
lcl_cd varchar (7) NOT NULL,
table_ctg_nm varchar (100) NOT NULL,
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


ALTER TABLE mbc_bulk_imp_ctg_lcl_def
ADD CONSTRAINT mbc_bulk_imp_ctg_lcl_def_pk PRIMARY KEY(table_ctg,lcl_cd);

