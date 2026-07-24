\encoding UTF-8

CREATE TABLE mst_close_all
(ym timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
sls_cl_flg char (1) DEFAULT '0' NOT NULL,
rcv_cl_flg char (1) DEFAULT '0' NOT NULL,
purc_cl_flg char (1) DEFAULT '0' NOT NULL,
pay_cl_flg char (1) DEFAULT '0' NOT NULL,
stk_cl_flg char (1) DEFAULT '0' NOT NULL,
sls_cl_tm timestamp(0)  NULL,
rcv_cl_tm timestamp(0)  NULL,
purc_cl_tm timestamp(0)  NULL,
pay_cl_tm timestamp(0)  NULL,
stk_cl_tm timestamp(0)  NULL,
ar_pre_cl_tm timestamp(0)  NULL,
ap_pre_cl_tm timestamp(0)  NULL,
sls_cl_usr_cd varchar (500) NULL,
rcv_cl_usr_cd varchar (500) NULL,
purc_cl_usr_cd varchar (500) NULL,
pay_cl_usr_cd varchar (500) NULL,
stk_cl_usr_cd varchar (500) NULL,
ar_pre_cl_usr_cd varchar (500) NULL,
ap_pre_cl_usr_cd varchar (500) NULL,
ar_pre_cl_flg char (1) DEFAULT '0' NOT NULL,
ap_pre_cl_flg char (1) DEFAULT '0' NOT NULL,
all_acst_pre_cl_flg char (1) DEFAULT '0' NOT NULL,
all_asppl_pre_cl_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_close_all
ADD CONSTRAINT mst_close_all_pk PRIMARY KEY(ym,co_cd);

