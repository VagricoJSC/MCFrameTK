\encoding UTF-8

CREATE TABLE mst_sls_itm_comp_all
(sls_itm_comp_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
sls_itm_no varchar (15) NOT NULL,
sls_itm_comp_lno varchar (3) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
core_itm_flg char (1) DEFAULT '0' NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
cost_upri numeric (21,8) NULL,
cost_amt numeric (21,8) NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
mst_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_sls_itm_comp_all
ADD CONSTRAINT mst_sls_itm_comp_all_pk PRIMARY KEY(sls_itm_comp_no,co_cd);


CREATE INDEX mst_sls_itm_comp_all_ie01
ON mst_sls_itm_comp_all USING BTREE (sls_itm_no, co_cd);

