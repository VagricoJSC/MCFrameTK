\encoding UTF-8

CREATE TABLE mbt_jnl_grp_no_ctl_all
(co_cd varchar (10) NOT NULL,
jnl_grp_no varchar (10) NOT NULL,
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


ALTER TABLE mbt_jnl_grp_no_ctl_all
ADD CONSTRAINT mbt_jnl_grp_no_ctl_all_pk PRIMARY KEY(co_cd);

