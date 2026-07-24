\encoding UTF-8

CREATE TABLE mst_pay_schd_cl_br_all
(batch_data_no varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
bsppl_cd varchar (20) NOT NULL,
bsppl_dpt_cd varchar (20) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
wrk_no varchar (15) NULL,
bsppl_cl_dt timestamp(0)  NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
batch_log_no varchar (15) NOT NULL,
log_sub_key1 numeric (9,0) NOT NULL,
log_sub_key2 numeric (9,0) NULL,
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


ALTER TABLE mst_pay_schd_cl_br_all
ADD CONSTRAINT mst_pay_schd_cl_br_all_pk PRIMARY KEY(batch_data_no,co_cd);

