\encoding UTF-8

CREATE TABLE mam_if_x_cmn
(ext_sys_cd varchar (10) NOT NULL,
if_col_typ varchar (30) NOT NULL,
bp_cd varchar (20) NULL,
if_col_cd varchar (500) NULL,
if_itm_cd varchar (40) NULL,
if_itm_sub1 varchar (5) NULL,
if_itm_sub2 varchar (5) NULL,
if_itm_sub3 varchar (5) NULL,
conv_cd varchar (500) NOT NULL,
conv_itm_sub1 varchar (5) NULL,
conv_itm_sub2 varchar (5) NULL,
conv_itm_sub3 varchar (5) NULL,
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


ALTER TABLE mam_if_x_cmn
ADD CONSTRAINT mam_if_x_cmn_pk UNIQUE(ext_sys_cd,if_col_typ,bp_cd,if_col_cd,if_itm_cd,if_itm_sub1,if_itm_sub2,if_itm_sub3);


CREATE UNIQUE INDEX mam_if_x_cmn_pk_ie ON mam_if_x_cmn (ext_sys_cd,if_col_typ,COALESCE(bp_cd,''),COALESCE(if_col_cd,''),COALESCE(if_itm_cd,''),COALESCE(if_itm_sub1,''),COALESCE(if_itm_sub2,''),COALESCE(if_itm_sub3,''));

