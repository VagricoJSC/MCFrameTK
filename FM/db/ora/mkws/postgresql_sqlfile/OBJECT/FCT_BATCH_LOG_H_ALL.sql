\encoding UTF-8

CREATE TABLE fct_batch_log_h_all
(batch_log_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
req_no varchar (50) NULL,
data_ref_ctl varchar (50) NULL,
start_ts timestamp(3)  NOT NULL,
last_ts timestamp(3)  NOT NULL,
login_seq varchar (50) NULL,
emsg_seq numeric (22,0) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
usr_cd varchar (500) NULL,
gp_batch_grp_cd varchar (50) NULL,
call_module_id varchar (3) NULL,
call_logic_id varchar (50) NULL,
call_operation_id varchar (50) NULL,
call_pg_id varchar (50) NULL,
call_clt_id varchar (50) NULL,
call_plsql_id varchar (50) NULL,
lcl_cd varchar (20) NULL,
end_flg char (1) NOT NULL,
warn_flg char (1) DEFAULT 0 NOT NULL,
rmrks1 varchar (100) NULL,
rmrks2 varchar (100) NULL,
rmrks3 varchar (100) NULL,
rmrks4 varchar (100) NULL,
rmrks5 varchar (100) NULL,
rmrks6 varchar (100) NULL,
rmrks7 varchar (100) NULL,
rmrks8 varchar (100) NULL,
rmrks9 varchar (100) NULL,
rmrks10 varchar (100) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE fct_batch_log_h_all
ADD CONSTRAINT fct_batch_log_h_all_pk PRIMARY KEY(batch_log_no,co_cd);

