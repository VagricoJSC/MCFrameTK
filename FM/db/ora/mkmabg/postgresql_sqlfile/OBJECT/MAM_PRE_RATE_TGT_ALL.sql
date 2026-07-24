\encoding UTF-8

CREATE TABLE mam_pre_rate_tgt_all
(pre_alc_rate_cd varchar (20) NOT NULL,
data_calc_ctg_cd varchar (10) NOT NULL,
data_wg_cd varchar (10) NOT NULL,
sa_typ varchar (1) NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
term timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
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


ALTER TABLE mam_pre_rate_tgt_all
ADD CONSTRAINT mam_pre_rate_tgt_all_pk PRIMARY KEY(pre_alc_rate_cd,data_calc_ctg_cd,data_wg_cd,sa_typ,calc_ctg_cd,wg_cd,term,co_cd);

