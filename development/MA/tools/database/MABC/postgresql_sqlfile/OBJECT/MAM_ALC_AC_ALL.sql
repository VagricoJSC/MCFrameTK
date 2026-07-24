\encoding UTF-8

CREATE TABLE mam_alc_ac_all
(alc_ac_cd varchar (20) NOT NULL,
alc_ac_nm varchar (40) NOT NULL,
alc_ptn_cd varchar (10) NULL,
expns_cd varchar (20) NULL,
alc_ac_grp_cd1 varchar (10) NULL,
alc_ac_grp_cd2 varchar (10) NULL,
alc_ac_grp_cd3 varchar (10) NULL,
co_alc_ac_cd varchar (20) NULL,
not_itm_alc_ac_flg char (1) DEFAULT '0' NOT NULL,
not_alc_rate_ac_flg char (1) DEFAULT '0' NOT NULL,
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
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mam_alc_ac_all
ADD CONSTRAINT mam_alc_ac_all_pk PRIMARY KEY(alc_ac_cd,co_cd);

