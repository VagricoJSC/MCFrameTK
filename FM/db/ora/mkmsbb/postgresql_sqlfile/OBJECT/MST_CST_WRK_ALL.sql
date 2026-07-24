\encoding UTF-8

CREATE TABLE mst_cst_wrk_all
(wrk_no varchar (15) NOT NULL,
cst_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
cst_sundry_flg char (1) DEFAULT '0' NOT NULL,
cst_nm varchar (100) NULL,
cst_cntct_dpt varchar (100) NULL,
cst_cntct_psn varchar (100) NULL,
zip_cd varchar (10) NULL,
addr1 varchar (250) NULL,
addr2 varchar (250) NULL,
addr3 varchar (250) NULL,
addr4 varchar (250) NULL,
tel varchar (30) NULL,
fax varchar (30) NULL,
capital numeric (21,8) NULL,
emp_num numeric (9,0) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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


ALTER TABLE mst_cst_wrk_all
ADD CONSTRAINT mst_cst_wrk_all_pk PRIMARY KEY(wrk_no,cst_cd,co_cd);

