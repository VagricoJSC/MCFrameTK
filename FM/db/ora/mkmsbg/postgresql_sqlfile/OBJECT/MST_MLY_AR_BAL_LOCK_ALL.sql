\encoding UTF-8

CREATE TABLE mst_mly_ar_bal_lock_all
(acst_cd varchar (20) NOT NULL,
ar_dpt_cd varchar (20) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
iv_no varchar (15) NOT NULL,
wrk_no varchar (15) NULL,
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


ALTER TABLE mst_mly_ar_bal_lock_all
ADD CONSTRAINT mst_mly_ar_bal_lock_all_pk UNIQUE(acst_cd,ar_dpt_cd,trd_cur_cd,iv_no,wrk_no,co_cd);


CREATE UNIQUE INDEX mst_mly_ar_bal_lock_all_pk_ie ON mst_mly_ar_bal_lock_all (acst_cd,ar_dpt_cd,trd_cur_cd,iv_no,COALESCE(wrk_no,''),co_cd);

