\encoding UTF-8

CREATE TABLE mam_slo_alloc_all
(to_lg_grp_cd varchar (10) DEFAULT '*' NOT NULL,
itm_ship_grp_cd varchar (5) DEFAULT '*' NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NULL,
lg_grp_cd varchar (10) NULL,
alloc_grp_cd varchar (10) NULL,
co_cd varchar (10) NOT NULL,
alloc_scope_typ varchar (1) NOT NULL,
alloc_typ varchar (1) NOT NULL,
ship_loc_cd varchar (20) NOT NULL,
def_flg char (1) DEFAULT '0' NOT NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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


ALTER TABLE mam_slo_alloc_all
ADD CONSTRAINT mam_slo_alloc_all_pk UNIQUE(to_lg_grp_cd,itm_ship_grp_cd,wg_cd,loc_cd,lg_grp_cd,alloc_grp_cd,co_cd);


CREATE INDEX mam_slo_alloc_all_ie01
ON mam_slo_alloc_all USING BTREE (wg_cd,del_flg,co_cd);


CREATE UNIQUE INDEX mam_slo_alloc_all_pk_ie ON mam_slo_alloc_all (to_lg_grp_cd,itm_ship_grp_cd,wg_cd,COALESCE(loc_cd,''),COALESCE(lg_grp_cd,''),COALESCE(alloc_grp_cd,''),co_cd);

