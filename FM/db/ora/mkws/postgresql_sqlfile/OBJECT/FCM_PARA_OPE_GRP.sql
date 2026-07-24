\encoding UTF-8

CREATE TABLE fcm_para_ope_grp
(gid numeric (15) NOT NULL,
grp_id varchar (50) NOT NULL,
co_cd varchar (10) NOT NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE fcm_para_ope_grp
ADD CONSTRAINT fcm_para_ope_grp_pk PRIMARY KEY(gid);

