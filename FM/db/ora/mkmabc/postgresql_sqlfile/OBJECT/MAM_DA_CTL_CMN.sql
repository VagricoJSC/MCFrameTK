\encoding UTF-8

CREATE TABLE mam_da_ctl_cmn
(da_cd varchar (10) NOT NULL,
wg_cd varchar (10) NULL,
dpt_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
lg_grp_cd varchar (10) NULL,
alloc_grp_cd varchar (10) NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
rd_flg char (1) DEFAULT '0' NOT NULL,
wr_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_da_ctl_cmn
ADD CONSTRAINT mam_da_ctl_cmn_pk UNIQUE(da_cd,wg_cd,dpt_cd,loc_cd,lg_grp_cd,alloc_grp_cd,st_dt);


CREATE UNIQUE INDEX mam_da_ctl_cmn_pk_ie ON mam_da_ctl_cmn (da_cd,COALESCE(wg_cd,''),COALESCE(dpt_cd,''),COALESCE(loc_cd,''),COALESCE(lg_grp_cd,''),COALESCE(alloc_grp_cd,''),st_dt);

