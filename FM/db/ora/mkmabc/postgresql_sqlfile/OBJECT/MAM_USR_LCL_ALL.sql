\encoding UTF-8

CREATE TABLE mam_usr_lcl_all
(usr_cd varchar (500) NOT NULL,
usr_nm varchar (100) NOT NULL,
usr_alt_nm1 varchar (100) NULL,
usr_alt_nm2 varchar (100) NULL,
usr_alt_nm3 varchar (100) NULL,
usr_alt_nm4 varchar (100) NULL,
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
co_cd varchar (10) NOT NULL,
lcl_cd varchar (7) NOT NULL
);


ALTER TABLE mam_usr_lcl_all
ADD CONSTRAINT mam_usr_lcl_all_pk PRIMARY KEY(usr_cd,co_cd,lcl_cd);


CREATE INDEX mam_usr_lcl_all_ie01
ON mam_usr_lcl_all USING BTREE (usr_nm);


CREATE INDEX mam_usr_lcl_all_ie02
ON mam_usr_lcl_all USING BTREE (usr_alt_nm1);


CREATE INDEX mam_usr_lcl_all_ie03
ON mam_usr_lcl_all USING BTREE (usr_alt_nm2);


CREATE INDEX mam_usr_lcl_all_ie04
ON mam_usr_lcl_all USING BTREE (usr_alt_nm3);


CREATE INDEX mam_usr_lcl_all_ie05
ON mam_usr_lcl_all USING BTREE (usr_alt_nm4);

