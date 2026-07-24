\encoding UTF-8

CREATE TABLE mam_cst_sls_upri_rank_all
(cst_cd varchar (20) NOT NULL,
dlv_cd varchar (20) DEFAULT '*' NOT NULL,
dest_cd1 varchar (20) DEFAULT '*' NOT NULL,
dest_cd2 varchar (20) DEFAULT '*' NOT NULL,
dest_cd3 varchar (20) DEFAULT '*' NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
sls_upri_rank_cd varchar (5) NOT NULL,
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


ALTER TABLE mam_cst_sls_upri_rank_all
ADD CONSTRAINT mam_cst_sls_upri_rank_all_pk PRIMARY KEY(cst_cd,dlv_cd,dest_cd1,dest_cd2,dest_cd3,st_dt,co_cd);


CREATE INDEX mam_cst_sls_upri_rank_all_ie01
ON mam_cst_sls_upri_rank_all USING BTREE (dlv_cd);


CREATE INDEX mam_cst_sls_upri_rank_all_ie02
ON mam_cst_sls_upri_rank_all USING BTREE (dest_cd1);

