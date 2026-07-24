\encoding UTF-8

CREATE TABLE mst_qtn_d_all
(qtn_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
qtn_no varchar (15) NOT NULL,
qtn_rev numeric (4,0) NOT NULL,
disp_seq numeric (5,0) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
gd_cd varchar (2) NULL,
cntry_org_cd varchar (2) NULL,
dest_cd1 varchar (20) NULL,
dest_cd2 varchar (20) NULL,
dest_cd3 varchar (20) NULL,
dlv_cd varchar (20) NOT NULL,
dlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
dlv_nm varchar (100) NULL,
dlv_cntct_dpt varchar (100) NULL,
dlv_cntct_psn varchar (100) NULL,
dlv_zip_cd varchar (10) NULL,
dlv_addr1 varchar (250) NULL,
dlv_addr2 varchar (250) NULL,
dlv_addr3 varchar (250) NULL,
dlv_addr4 varchar (250) NULL,
dlv_tel varchar (30) NULL,
dlv_fax varchar (30) NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sls_itm_no varchar (15) NULL,
no_itm_cd_flg char (1) DEFAULT '0' NOT NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
upri_not_tgt_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_std_sls_upri numeric (21,8) NOT NULL,
trd_cur_std_sls_amt numeric (21,8) NOT NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
upri_rate numeric (5,2) NOT NULL,
trd_cur_upri numeric (21,8) NOT NULL,
trd_cur_amt numeric (21,8) NOT NULL,
dscnt_rsn_cd varchar (10) NULL,
tax_fix_flg char (1) DEFAULT '0' NOT NULL,
tax_cd varchar (5) NULL,
trd_cur_std_sls_tax_amt numeric (21,8) NOT NULL,
trd_cur_tax_amt numeric (21,8) NOT NULL,
set_itm_grp_no numeric (3,0) NULL,
cost_upri numeric (21,8) NULL,
cost_amt numeric (21,8) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
qtn_d_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
qtn_d_rslt_rsn_cd varchar (10) NULL,
qtn_d_rslt_rsn_rmrks varchar (100) NULL,
slo_trnst_qty numeric (21,8) NOT NULL,
sls_trnst_qty numeric (21,8) NOT NULL,
cst_qtn_rqst_d_no varchar (15) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
itm_comp_seq numeric (4,0) NOT NULL,
itm_spec_seq numeric (4,0) NOT NULL,
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


ALTER TABLE mst_qtn_d_all
ADD CONSTRAINT mst_qtn_d_all_pk PRIMARY KEY(qtn_d_no,co_cd);


CREATE INDEX mst_qtn_d_all_ie01
ON mst_qtn_d_all USING BTREE (qtn_no, qtn_rev, co_cd);


CREATE INDEX mst_qtn_d_all_ie02
ON mst_qtn_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_qtn_d_all_ie03
ON mst_qtn_d_all USING BTREE (sno1, co_cd);


CREATE INDEX mst_qtn_d_all_ie04
ON mst_qtn_d_all USING BTREE (dlv_cd, co_cd);


CREATE INDEX mst_qtn_d_all_ie05
ON mst_qtn_d_all USING BTREE (cst_qtn_rqst_d_no, co_cd);

