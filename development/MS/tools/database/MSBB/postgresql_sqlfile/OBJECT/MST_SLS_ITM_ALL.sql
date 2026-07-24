\encoding UTF-8

CREATE TABLE mst_sls_itm_all
(sls_itm_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
itm_comp_rev_no varchar (2) NULL,
qtn_d_no varchar (15) NULL,
qtn_no varchar (15) NULL,
qtn_rev numeric (4,0) NULL,
rel_flg char (1) DEFAULT '0' NOT NULL,
no_itm_cd_flg char (1) DEFAULT '0' NOT NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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


ALTER TABLE mst_sls_itm_all
ADD CONSTRAINT mst_sls_itm_all_pk PRIMARY KEY(sls_itm_no,co_cd);


CREATE INDEX mst_sls_itm_all_ie01
ON mst_sls_itm_all USING BTREE (qtn_d_no, co_cd);

