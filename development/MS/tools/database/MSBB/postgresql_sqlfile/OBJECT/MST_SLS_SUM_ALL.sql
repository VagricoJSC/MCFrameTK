\encoding UTF-8

CREATE TABLE mst_sls_sum_all
(ym timestamp(0)  NOT NULL,
sls_dpt_cd varchar (20) NOT NULL,
sls_usr_cd varchar (500) NULL,
cst_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
cur_cd varchar (3) NOT NULL,
wrk_no varchar (15) NULL,
co_cd varchar (10) NOT NULL,
base_unit_sls_qty numeric (21,8) NOT NULL,
trd_cur_sls_amt numeric (21,8) NOT NULL,
base_cur_sls_amt numeric (21,8) NOT NULL,
cost_amt numeric (21,8) NOT NULL,
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


ALTER TABLE mst_sls_sum_all
ADD CONSTRAINT mst_sls_sum_all_pk UNIQUE(ym,sls_dpt_cd,sls_usr_cd,cst_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,cur_cd,wrk_no,co_cd);


CREATE UNIQUE INDEX mst_sls_sum_all_pk_ie ON mst_sls_sum_all (ym,sls_dpt_cd,COALESCE(sls_usr_cd,''),cst_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,cur_cd,COALESCE(wrk_no,''),co_cd);

