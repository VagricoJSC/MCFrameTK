\encoding UTF-8

CREATE TABLE mam_lg_grp_lcl_cmn
(lg_grp_cd varchar (10) NOT NULL,
lg_grp_nm varchar (40) NOT NULL,
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


ALTER TABLE mam_lg_grp_lcl_cmn
ADD CONSTRAINT mam_lg_grp_lcl_cmn_pk PRIMARY KEY(lg_grp_cd,lcl_cd);


CREATE INDEX mam_lg_grp_lcl_cmn_ie01
ON mam_lg_grp_lcl_cmn USING BTREE (lg_grp_nm);

