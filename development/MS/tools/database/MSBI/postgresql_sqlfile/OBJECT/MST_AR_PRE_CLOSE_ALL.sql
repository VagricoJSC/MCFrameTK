\encoding UTF-8

CREATE TABLE mst_ar_pre_close_all
(ym timestamp(0)  NOT NULL,
acst_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
pre_cl_tm timestamp(0)  NOT NULL,
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


ALTER TABLE mst_ar_pre_close_all
ADD CONSTRAINT mst_ar_pre_close_all_pk PRIMARY KEY(ym,acst_cd,co_cd);

