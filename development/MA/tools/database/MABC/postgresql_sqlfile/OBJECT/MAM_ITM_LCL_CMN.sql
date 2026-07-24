\encoding UTF-8

CREATE TABLE mam_itm_lcl_cmn
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NOT NULL,
itm_alt_nm1 varchar (100) NULL,
itm_alt_nm2 varchar (100) NULL,
itm_alt_nm3 varchar (100) NULL,
itm_alt_nm4 varchar (100) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
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
lcl_cd varchar (7) NOT NULL
);


ALTER TABLE mam_itm_lcl_cmn
ADD CONSTRAINT mam_itm_lcl_cmn_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,lcl_cd);


CREATE INDEX mam_itm_lcl_cmn_ie01
ON mam_itm_lcl_cmn USING BTREE (itm_nm);


CREATE INDEX mam_itm_lcl_cmn_ie02
ON mam_itm_lcl_cmn USING BTREE (itm_alt_nm1);


CREATE INDEX mam_itm_lcl_cmn_ie03
ON mam_itm_lcl_cmn USING BTREE (itm_alt_nm2);


CREATE INDEX mam_itm_lcl_cmn_ie04
ON mam_itm_lcl_cmn USING BTREE (itm_alt_nm3);


CREATE INDEX mam_itm_lcl_cmn_ie05
ON mam_itm_lcl_cmn USING BTREE (itm_alt_nm4);

