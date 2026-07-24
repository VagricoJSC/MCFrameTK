\encoding UTF-8

CREATE TABLE mam_itm_insp_ptn_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
insp_ptn_cd varchar (2) NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
insp_mtd_typ varchar (1) NOT NULL,
insp_lt numeric (9,0) NOT NULL,
insp_std_no varchar (10) NULL,
spl_qty numeric (21,8) NOT NULL,
std_req_flg char (1) DEFAULT '0' NOT NULL,
std_cnf_req_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_itm_insp_ptn_all
ADD CONSTRAINT mam_itm_insp_ptn_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,insp_ptn_cd,st_dt,co_cd);

