\encoding UTF-8

CREATE TABLE mam_scm_if_ctl_all
(if_proc_typ varchar (10) NOT NULL,
loc_cd varchar (20) NULL,
lg_grp_cd varchar (10) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
oper_cd varchar (10) NULL,
wk_cost_cd varchar (10) NULL,
dlv_cd varchar (20) NULL,
gr_loc_cd varchar (20) NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
ext_sys_cd varchar (10) NULL,
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


ALTER TABLE mam_scm_if_ctl_all
ADD CONSTRAINT mam_scm_if_ctl_all_pk UNIQUE(if_proc_typ,loc_cd,lg_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,oper_cd,wk_cost_cd,dlv_cd,gr_loc_cd,st_dt,co_cd);


CREATE UNIQUE INDEX mam_scm_if_ctl_all_pk_ie ON mam_scm_if_ctl_all (if_proc_typ,COALESCE(loc_cd,''),COALESCE(lg_grp_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),COALESCE(oper_cd,''),COALESCE(wk_cost_cd,''),COALESCE(dlv_cd,''),COALESCE(gr_loc_cd,''),st_dt,co_cd);

