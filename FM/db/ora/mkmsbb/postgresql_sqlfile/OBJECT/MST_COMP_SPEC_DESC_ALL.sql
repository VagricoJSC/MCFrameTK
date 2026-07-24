\encoding UTF-8

CREATE TABLE mst_comp_spec_desc_all
(comp_spec_desc_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
sls_itm_spec_no varchar (15) NOT NULL,
sls_itm_comp_no varchar (15) NOT NULL,
sls_itm_comp_spec_lno varchar (3) NOT NULL,
spec_cd varchar (10) NOT NULL,
spec_desc_cd varchar (10) NOT NULL,
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


ALTER TABLE mst_comp_spec_desc_all
ADD CONSTRAINT mst_comp_spec_desc_all_pk PRIMARY KEY(comp_spec_desc_no,co_cd);


CREATE INDEX mst_comp_spec_desc_all_ie01
ON mst_comp_spec_desc_all USING BTREE (sls_itm_spec_no, co_cd);


CREATE INDEX mst_comp_spec_desc_all_ie02
ON mst_comp_spec_desc_all USING BTREE (sls_itm_comp_no, co_cd);

