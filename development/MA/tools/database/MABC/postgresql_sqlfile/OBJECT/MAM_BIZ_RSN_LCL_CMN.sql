\encoding UTF-8

CREATE TABLE mam_biz_rsn_lcl_cmn
(biz_rsn_cd varchar (10) NOT NULL,
biz_rsn_nm varchar (100) NOT NULL,
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


ALTER TABLE mam_biz_rsn_lcl_cmn
ADD CONSTRAINT mam_biz_rsn_lcl_cmn_pk PRIMARY KEY(biz_rsn_cd,lcl_cd);


CREATE INDEX mam_biz_rsn_lcl_cmn_ie01
ON mam_biz_rsn_lcl_cmn USING BTREE (biz_rsn_nm);

