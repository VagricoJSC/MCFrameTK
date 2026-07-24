\encoding UTF-8

CREATE TABLE mam_wg_rqst_ctl_all
(to_wg_cd varchar (10) NOT NULL,
fr_wg_cd varchar (10) NOT NULL,
wg_rqst_typ varchar (1) NOT NULL,
fr_dpt_cd varchar (20) DEFAULT '*' NOT NULL,
cst_cd varchar (20) DEFAULT '*' NOT NULL,
itm_cd varchar (40) DEFAULT '*' NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
auto_prms_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_wg_rqst_ctl_all
ADD CONSTRAINT mam_wg_rqst_ctl_all_pk PRIMARY KEY(to_wg_cd,fr_wg_cd,wg_rqst_typ,fr_dpt_cd,cst_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);

