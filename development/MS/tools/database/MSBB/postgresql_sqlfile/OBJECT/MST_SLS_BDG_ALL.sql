\encoding UTF-8

CREATE TABLE mst_sls_bdg_all
(ym timestamp(0)  NOT NULL,
sls_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NOT NULL,
sls_itm_grp_cd varchar (10) NULL,
cst_cd varchar (20) NULL,
sls_usr_cd varchar (500) NULL,
trd_cur_cd varchar (3) NOT NULL,
wrk_no varchar (15) NULL,
sls_bdg_grp varchar (100) NULL,
co_cd varchar (10) NOT NULL,
bdg_sls_amt numeric (21,8) NOT NULL,
bdg_sls_prof_rate numeric (5,2) NOT NULL,
bdg_sls_prof_amt numeric (21,8) NOT NULL,
not_sum_flg char (1) DEFAULT '0' NOT NULL,
sls_itm_grp_not_sum_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_sls_bdg_all
ADD CONSTRAINT mst_sls_bdg_all_pk UNIQUE(ym,sls_dpt_cd,wg_cd,sls_itm_grp_cd,cst_cd,sls_usr_cd,trd_cur_cd,wrk_no,sls_bdg_grp,co_cd);


CREATE UNIQUE INDEX mst_sls_bdg_all_pk_ie ON mst_sls_bdg_all (ym,COALESCE(sls_dpt_cd,''),wg_cd,COALESCE(sls_itm_grp_cd,''),COALESCE(cst_cd,''),COALESCE(sls_usr_cd,''),trd_cur_cd,COALESCE(wrk_no,''),COALESCE(sls_bdg_grp,''),co_cd);

