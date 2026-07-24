\encoding UTF-8

CREATE TABLE mst_pay_schd_lock_all
(bsppl_cd varchar (20) NOT NULL,
bsppl_dpt_cd varchar (20) NOT NULL,
purc_act_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_mng_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_no varchar (15) DEFAULT '*' NOT NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
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


ALTER TABLE mst_pay_schd_lock_all
ADD CONSTRAINT mst_pay_schd_lock_all_pk PRIMARY KEY(bsppl_cd,bsppl_dpt_cd,purc_act_no,rcpt_iv_mng_no,rcpt_iv_no,wrk_no,trd_cur_cd,co_cd);

