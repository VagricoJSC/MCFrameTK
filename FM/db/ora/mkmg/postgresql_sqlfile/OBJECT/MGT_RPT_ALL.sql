\encoding UTF-8

CREATE TABLE mgt_rpt_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
rpt_ptn_cd varchar (10) NOT NULL,
rpt_key_cd varchar (5) NOT NULL,
rpt_row_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
dpt_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
itm_jnl_cd varchar (5) NULL,
itm_grp_typ varchar (2) NULL,
itm_grp_cd varchar (10) NULL,
co_cd varchar (10) NOT NULL,
rpt_val numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_rpt_all
ADD CONSTRAINT mgt_rpt_all_pk UNIQUE(calc_no,calc_grp_cd,ym,rpt_ptn_cd,rpt_key_cd,rpt_row_cd,wg_cd,dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_jnl_cd,itm_grp_typ,itm_grp_cd,co_cd);


CREATE UNIQUE INDEX mgt_rpt_all_pk_ie ON mgt_rpt_all (calc_no,calc_grp_cd,ym,rpt_ptn_cd,rpt_key_cd,rpt_row_cd,wg_cd,COALESCE(dpt_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),COALESCE(itm_jnl_cd,''),COALESCE(itm_grp_typ,''),COALESCE(itm_grp_cd,''),co_cd);

