\encoding UTF-8

CREATE TABLE mgt_st_stk_diff_all
(st_stk_key numeric (15) NOT NULL,
expns_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
diff_amt numeric (21,8) NOT NULL,
bf_amt numeric (21,8) NOT NULL,
af_amt numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_st_stk_diff_all
ADD CONSTRAINT mgt_st_stk_diff_all_pk PRIMARY KEY(st_stk_key,expns_cd,co_cd);

