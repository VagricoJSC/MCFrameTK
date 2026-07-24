\encoding UTF-8

CREATE TABLE mam_loc_lcl_cmn
(loc_cd varchar (20) NOT NULL,
loc_nm varchar (40) NOT NULL,
zip_cd varchar (10) NULL,
addr1 varchar (250) NULL,
addr2 varchar (250) NULL,
addr3 varchar (250) NULL,
addr4 varchar (250) NULL,
tel varchar (30) NULL,
fax varchar (30) NULL,
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


ALTER TABLE mam_loc_lcl_cmn
ADD CONSTRAINT mam_loc_lcl_cmn_pk PRIMARY KEY(loc_cd,lcl_cd);


CREATE INDEX mam_loc_lcl_cmn_ie01
ON mam_loc_lcl_cmn USING BTREE (loc_nm);

