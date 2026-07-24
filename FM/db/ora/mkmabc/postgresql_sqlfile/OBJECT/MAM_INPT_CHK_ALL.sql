\encoding UTF-8

CREATE TABLE mam_inpt_chk_all
(func_typ varchar (2) NOT NULL,
itm_grp_typ varchar (2) NOT NULL,
itm_grp_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
low_rate_lmt numeric (8,4) NOT NULL,
up_rate_lmt numeric (8,4) NOT NULL,
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


ALTER TABLE mam_inpt_chk_all
ADD CONSTRAINT mam_inpt_chk_all_pk PRIMARY KEY(func_typ,itm_grp_typ,itm_grp_cd,co_cd);

