\encoding UTF-8

CREATE TABLE mst_sls_itm_ref_all
(sls_itm_no varchar (15) NOT NULL,
slo_d_no varchar (15) NULL,
qtn_d_no varchar (15) NULL,
co_cd varchar (10) NOT NULL,
qtn_no varchar (15) NULL,
qtn_rev numeric (4,0) NULL,
slo_no varchar (15) NULL,
sno1 varchar (20) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
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


ALTER TABLE mst_sls_itm_ref_all
ADD CONSTRAINT mst_sls_itm_ref_all_pk UNIQUE(sls_itm_no,slo_d_no,qtn_d_no,co_cd);


CREATE INDEX mst_sls_itm_ref_all_ie01
ON mst_sls_itm_ref_all USING BTREE (qtn_no, qtn_rev, co_cd);


CREATE INDEX mst_sls_itm_ref_all_ie02
ON mst_sls_itm_ref_all USING BTREE (slo_no, co_cd);


CREATE UNIQUE INDEX mst_sls_itm_ref_all_pk_ie ON mst_sls_itm_ref_all (sls_itm_no,COALESCE(slo_d_no,''),COALESCE(qtn_d_no,''),co_cd);

