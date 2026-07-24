\encoding UTF-8

CREATE TABLE mam_alc_rule_all
(alc_ptn_cd varchar (10) NOT NULL,
term timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
alc_tgt_typ varchar (1) NOT NULL,
alc_rule_typ varchar (1) NOT NULL,
expns_cd varchar (20) NULL,
diff_calc_typ varchar (1) NOT NULL,
rnd_typ varchar (1) NOT NULL,
dec_place numeric (2,0) NOT NULL,
alc_coef_cd varchar (20) NULL,
coef_limit_flg char (1) DEFAULT '0' NOT NULL,
asst_typ varchar (1) NULL,
non_minus_flg char (1) DEFAULT '0' NOT NULL,
non_os_flg char (1) DEFAULT '0' NOT NULL,
scst_alc_flg char (1) DEFAULT '0' NOT NULL,
std_alc_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_alc_rule_all
ADD CONSTRAINT mam_alc_rule_all_pk PRIMARY KEY(alc_ptn_cd,term,co_cd);

