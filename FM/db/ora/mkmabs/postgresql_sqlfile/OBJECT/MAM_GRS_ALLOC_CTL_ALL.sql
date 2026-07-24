\encoding UTF-8

CREATE TABLE mam_grs_alloc_ctl_all
(alloc_grp_cd varchar (10) DEFAULT '*' NOT NULL,
itm_ship_grp_cd varchar (5) DEFAULT '*' NOT NULL,
lg_grp_cd varchar (10) DEFAULT '*' NOT NULL,
loc_cd varchar (20) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
alloc_scope_typ varchar (1) NOT NULL,
prio numeric (4,0) NOT NULL,
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


ALTER TABLE mam_grs_alloc_ctl_all
ADD CONSTRAINT mam_grs_alloc_ctl_all_pk PRIMARY KEY(alloc_grp_cd,itm_ship_grp_cd,lg_grp_cd,loc_cd,co_cd);

