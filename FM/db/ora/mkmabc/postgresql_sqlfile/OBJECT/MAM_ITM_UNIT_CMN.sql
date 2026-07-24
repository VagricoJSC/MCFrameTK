\encoding UTF-8

CREATE TABLE mam_itm_unit_cmn
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
unit_cd varchar (5) NOT NULL,
conv_base_qty numeric (21,8) NOT NULL,
conv_qty numeric (21,8) NOT NULL,
dec_place numeric (2,0) NOT NULL,
rnd_typ varchar (1) NOT NULL,
pack_flg char (1) DEFAULT '0' NOT NULL,
pckg_flg char (1) DEFAULT '0' NOT NULL,
unit_dim numeric (21,8) NULL,
unit_wt numeric (21,8) NULL,
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


ALTER TABLE mam_itm_unit_cmn
ADD CONSTRAINT mam_itm_unit_cmn_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,unit_cd);

