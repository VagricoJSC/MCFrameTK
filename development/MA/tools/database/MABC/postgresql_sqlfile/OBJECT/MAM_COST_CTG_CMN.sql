\encoding UTF-8

CREATE TABLE mam_cost_ctg_cmn
(ctg_cd varchar (20) NOT NULL,
ctg_nm varchar (40) NOT NULL,
ctg_grp_cd varchar (20) NULL,
ctg_alc_grp varchar (10) NULL,
ctg_config_typ varchar (1) NOT NULL,
itm_jnl_cd varchar (5) NULL,
itm_grp_typ varchar (2) NULL,
itm_grp_cd varchar (10) NULL,
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


ALTER TABLE mam_cost_ctg_cmn
ADD CONSTRAINT mam_cost_ctg_cmn_pk PRIMARY KEY(ctg_cd);

