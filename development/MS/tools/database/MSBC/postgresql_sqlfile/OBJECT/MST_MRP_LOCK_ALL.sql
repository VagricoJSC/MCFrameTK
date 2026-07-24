\encoding UTF-8

CREATE TABLE mst_mrp_lock_all
(wg_cd varchar (10) NOT NULL,
mrp_typ varchar (1) NOT NULL,
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


ALTER TABLE mst_mrp_lock_all
ADD CONSTRAINT mst_mrp_lock_all_pk PRIMARY KEY(wg_cd,mrp_typ,co_cd);

