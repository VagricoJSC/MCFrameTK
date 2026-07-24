\encoding UTF-8

CREATE TABLE mst_iv_d_all
(iv_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
iv_mng_no varchar (15) NOT NULL,
iv_rev numeric (4,0) NOT NULL,
disp_seq numeric (5,0) NULL,
slo_no varchar (15) NULL,
trd_cd varchar (4) NOT NULL,
slo_d_no varchar (15) NULL,
xfr_schd_no varchar (15) NULL,
cst_po_no varchar (20) NULL,
cst_po_d_no varchar (20) NULL,
bndl_flg char (1) DEFAULT '0' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
iv_itm_nm varchar (100) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
gd_cd varchar (2) NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
trd_cur_upri numeric (21,8) NOT NULL,
upri_not_tgt_flg char (1) DEFAULT '0' NOT NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
iv_upri numeric (21,8) NOT NULL,
iv_amt numeric (21,8) NOT NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
tax_fix_flg char (1) DEFAULT '0' NOT NULL,
tax_cd varchar (5) NULL,
trd_cur_tax_amt numeric (21,8) NOT NULL,
ptax_cur_amt numeric (21,8) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
cntry_org_cd varchar (2) NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
sls_dpt_cd varchar (20) NULL,
sls_usr_cd varchar (500) NULL,
dscnt_rsn_cd varchar (10) NULL,
manual_add_flg char (1) DEFAULT '0' NOT NULL,
ar_dpt_cd varchar (20) NULL,
dlv_rqst_tm timestamp(0)  NULL,
purc_schd_no varchar (15) NULL,
iv_d_rmrks varchar (100) NULL,
case_mrk1 varchar (30) NULL,
case_mrk2 varchar (30) NULL,
case_mrk3 varchar (30) NULL,
case_mrk4 varchar (30) NULL,
case_mrk5 varchar (30) NULL,
case_mrk6 varchar (30) NULL,
trd_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
intr_d_rmrks varchar (100) NULL,
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


ALTER TABLE mst_iv_d_all
ADD CONSTRAINT mst_iv_d_all_pk PRIMARY KEY(iv_d_no,co_cd);


CREATE INDEX mst_iv_d_all_ie01
ON mst_iv_d_all USING BTREE (iv_mng_no, co_cd);


CREATE INDEX mst_iv_d_all_ie02
ON mst_iv_d_all USING BTREE (slo_no, co_cd);


CREATE INDEX mst_iv_d_all_ie03
ON mst_iv_d_all USING BTREE (slo_d_no, co_cd);


CREATE INDEX mst_iv_d_all_ie04
ON mst_iv_d_all USING BTREE (xfr_schd_no, co_cd);


CREATE INDEX mst_iv_d_all_ie05
ON mst_iv_d_all USING BTREE (cst_po_no, co_cd);


CREATE INDEX mst_iv_d_all_ie06
ON mst_iv_d_all USING BTREE (cst_po_d_no, co_cd);


CREATE INDEX mst_iv_d_all_ie07
ON mst_iv_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_iv_d_all_ie08
ON mst_iv_d_all USING BTREE (purc_schd_no, co_cd);

