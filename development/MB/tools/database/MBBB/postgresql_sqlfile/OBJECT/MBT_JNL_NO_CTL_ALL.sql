\encoding UTF-8

CREATE TABLE mbt_jnl_no_ctl_all
(ac_ym timestamp(0)  NOT NULL,
ac_if_typ varchar (1) NOT NULL,
slip_cnt_id varchar (3) NOT NULL,
co_cd varchar (10) NOT NULL,
jnl_no varchar (20) NOT NULL,
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


ALTER TABLE mbt_jnl_no_ctl_all
ADD CONSTRAINT mbt_jnl_no_ctl_all_pk PRIMARY KEY(ac_ym,ac_if_typ,slip_cnt_id,co_cd);

