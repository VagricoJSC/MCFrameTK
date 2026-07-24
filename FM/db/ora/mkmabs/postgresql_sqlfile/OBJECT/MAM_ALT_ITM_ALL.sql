\encoding UTF-8

CREATE TABLE mam_alt_itm_all
(alt_grp_cd varchar (40) NOT NULL,
chd_itm_cd varchar (40) NOT NULL,
chd_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
chd_inpt_ratio numeric (21,8) NOT NULL,
chd_rqmt_ratio numeric (21,8) NOT NULL,
fxd_chd_rqmt_qty numeric (21,8) NOT NULL,
alt_itm_ratio numeric (9,0) NOT NULL,
alt_alloc_prio numeric (9,0) NOT NULL,
not_cost_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_alt_itm_all
ADD CONSTRAINT mam_alt_itm_all_pk UNIQUE(alt_grp_cd,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,ver_no,wg_cd,st_dt,co_cd);


CREATE UNIQUE INDEX mam_alt_itm_all_pk_ie ON mam_alt_itm_all (alt_grp_cd,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,COALESCE(ver_no,''),wg_cd,st_dt,co_cd);

