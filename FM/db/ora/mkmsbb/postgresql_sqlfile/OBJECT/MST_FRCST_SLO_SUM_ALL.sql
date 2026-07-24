\encoding UTF-8

CREATE TABLE mst_frcst_slo_sum_all
(ym timestamp(0)  NOT NULL,
sls_dpt_cd varchar (20) NOT NULL,
sls_usr_cd varchar (500) NULL,
cst_cd varchar (20) NOT NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
spln_itm_cd varchar (40) NULL,
sls_itm_grp_cd varchar (10) NULL,
base_unit_slo_qty numeric (21,8) NOT NULL,
trd_cur_slo_amt numeric (21,8) NOT NULL,
slo_cost_amt numeric (21,8) DEFAULT 0 NULL,
base_unit_pre_slo_qty numeric (21,8) NOT NULL,
trd_cur_pre_slo_amt numeric (21,8) NOT NULL,
pre_slo_cost_amt numeric (21,8) DEFAULT 0 NULL,
cst_frcst_qty numeric (21,8) NOT NULL,
trd_cur_cst_frcst_amt numeric (21,8) NOT NULL,
usr_cst_cd varchar (20) DEFAULT '*' NOT NULL,
usr_wrk_no varchar (15) DEFAULT '*' NOT NULL,
sum_cst_cd varchar (20) DEFAULT '*' NOT NULL,
sum_wrk_no varchar (15) DEFAULT '*' NOT NULL,
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



CREATE INDEX mst_frcst_slo_sum_all_ie01
ON mst_frcst_slo_sum_all USING BTREE (ym, sls_dpt_cd, sls_usr_cd, usr_cst_cd, usr_wrk_no, co_cd);


CREATE INDEX mst_frcst_slo_sum_all_ie02
ON mst_frcst_slo_sum_all USING BTREE (ym, sls_dpt_cd, sum_cst_cd, sum_wrk_no, co_cd);


CREATE INDEX mst_frcst_slo_sum_all_ie03
ON mst_frcst_slo_sum_all USING BTREE (ym, cst_cd, co_cd);


CREATE INDEX mst_frcst_slo_sum_all_ie04
ON mst_frcst_slo_sum_all USING BTREE (ym, sls_itm_grp_cd, co_cd);

