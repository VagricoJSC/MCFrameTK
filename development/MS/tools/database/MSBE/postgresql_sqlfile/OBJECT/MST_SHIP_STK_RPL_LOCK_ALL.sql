\encoding UTF-8

CREATE TABLE mst_ship_stk_rpl_lock_all
(loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
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


ALTER TABLE mst_ship_stk_rpl_lock_all
ADD CONSTRAINT mst_ship_stk_rpl_lock_all_pk PRIMARY KEY(loc_cd,str_ln_cd,co_cd);

