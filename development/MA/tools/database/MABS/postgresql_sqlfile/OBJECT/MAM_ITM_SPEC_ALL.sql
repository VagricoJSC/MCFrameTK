\encoding UTF-8

CREATE TABLE mam_itm_spec_all
(itm_spec_grp_cd varchar (10) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
spec_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
def_spec_desc_cd varchar (10) NULL,
multi_sel_flg char (1) DEFAULT '0' NOT NULL,
req_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_itm_spec_all
ADD CONSTRAINT mam_itm_spec_all_pk UNIQUE(itm_spec_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,spec_cd,co_cd);


CREATE INDEX mam_itm_spec_all_ie01
ON mam_itm_spec_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3);


CREATE UNIQUE INDEX mam_itm_spec_all_pk_ie ON mam_itm_spec_all (COALESCE(itm_spec_grp_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),spec_cd,co_cd);

