\encoding UTF-8

CREATE TABLE mam_itm_site_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
site_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
ntfy_nm varchar (100) NULL,
plnt_aprv_flg char (1) DEFAULT '0' NOT NULL,
plnt_aprv_role_cd varchar (10) NULL,
insp_aprv_flg char (1) DEFAULT '0' NOT NULL,
insp_aprv_role_cd varchar (10) NULL,
mfg_aprv_flg char (1) DEFAULT '0' NOT NULL,
mfg_aprv_role_cd varchar (10) NULL,
xfr_lot_flg char (1) DEFAULT '0' NOT NULL,
so_prmt_insp_flg char (1) DEFAULT '0' NOT NULL,
in_prmt_insp_flg char (1) DEFAULT '0' NOT NULL,
num_id varchar (5) NULL,
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


ALTER TABLE mam_itm_site_all
ADD CONSTRAINT mam_itm_site_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,site_cd,co_cd);

