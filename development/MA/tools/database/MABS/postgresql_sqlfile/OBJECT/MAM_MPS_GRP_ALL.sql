\encoding UTF-8

CREATE TABLE mam_mps_grp_all
(mps_grp_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
mps_grp_nm varchar (40) NOT NULL,
rqmt_mons numeric (2,0) NOT NULL,
prcd_mons numeric (2,0) NOT NULL,
date_div_mons numeric (2,0) NOT NULL,
week_div_mons numeric (2,0) NOT NULL,
period_div_mons numeric (2,0) NOT NULL,
date_div_typ varchar (1) NOT NULL,
mon01_prod_qty numeric (21,8) NOT NULL,
mon02_prod_qty numeric (21,8) NOT NULL,
mon03_prod_qty numeric (21,8) NOT NULL,
mon04_prod_qty numeric (21,8) NOT NULL,
mon05_prod_qty numeric (21,8) NOT NULL,
mon06_prod_qty numeric (21,8) NOT NULL,
mon07_prod_qty numeric (21,8) NOT NULL,
mon08_prod_qty numeric (21,8) NOT NULL,
mon09_prod_qty numeric (21,8) NOT NULL,
mon10_prod_qty numeric (21,8) NOT NULL,
mon11_prod_qty numeric (21,8) NOT NULL,
mon12_prod_qty numeric (21,8) NOT NULL,
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


ALTER TABLE mam_mps_grp_all
ADD CONSTRAINT mam_mps_grp_all_pk PRIMARY KEY(mps_grp_cd,co_cd);

