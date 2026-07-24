\encoding UTF-8

CREATE TABLE mst_sim_prms_rslt_all
(wg_cd varchar (10) NOT NULL,
wg_rqst_no varchar (15) NULL,
slo_d_no varchar (15) NULL,
co_cd varchar (10) NOT NULL,
sim_alloc_pln_typ varchar (1) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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


ALTER TABLE mst_sim_prms_rslt_all
ADD CONSTRAINT mst_sim_prms_rslt_all_pk UNIQUE(wg_cd,wg_rqst_no,slo_d_no,co_cd);


CREATE UNIQUE INDEX mst_sim_prms_rslt_all_pk_ie ON mst_sim_prms_rslt_all (wg_cd,COALESCE(wg_rqst_no,''),COALESCE(slo_d_no,''),co_cd);

