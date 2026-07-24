\encoding UTF-8

CREATE TABLE mam_co_sub_all
(co_cd varchar (10) NOT NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
sls_tax_cd varchar (5) NOT NULL,
purc_tax_cd varchar (5) NOT NULL,
prov_tax_cd varchar (5) NOT NULL,
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
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE mam_co_sub_all
ADD CONSTRAINT mam_co_sub_all_pk PRIMARY KEY(co_cd,st_dt);

