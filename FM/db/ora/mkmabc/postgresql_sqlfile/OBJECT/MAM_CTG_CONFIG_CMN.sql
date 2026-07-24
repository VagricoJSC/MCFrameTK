\encoding UTF-8

CREATE TABLE mam_ctg_config_cmn
(par_ctg_cd varchar (20) NOT NULL,
ctg_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
term timestamp(0)  NOT NULL,
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


ALTER TABLE mam_ctg_config_cmn
ADD CONSTRAINT mam_ctg_config_cmn_pk UNIQUE(par_ctg_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,term);


CREATE UNIQUE INDEX mam_ctg_config_cmn_pk_ie ON mam_ctg_config_cmn (par_ctg_cd,COALESCE(ctg_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),term);

