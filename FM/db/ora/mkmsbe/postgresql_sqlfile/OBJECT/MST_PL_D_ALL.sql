\encoding UTF-8

CREATE TABLE mst_pl_d_all
(pl_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
iv_no varchar (15) NOT NULL,
disp_seq numeric (5,0) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NULL,
cntnr_cd varchar (5) NULL,
cntnr_no_fr numeric (3,0) NULL,
cntnr_no_to numeric (3,0) NULL,
net_wt numeric (21,8) NULL,
grss_wt numeric (21,8) NULL,
dim numeric (21,8) NULL,
cntry_org_cd varchar (2) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
cst_po_no varchar (20) NULL,
cst_po_d_no varchar (20) NULL,
pl_d_rmrks varchar (100) NULL,
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


ALTER TABLE mst_pl_d_all
ADD CONSTRAINT mst_pl_d_all_pk PRIMARY KEY(pl_d_no,co_cd);


CREATE INDEX mst_pl_d_all_ie01
ON mst_pl_d_all USING BTREE (iv_no, co_cd);


CREATE INDEX mst_pl_d_all_ie02
ON mst_pl_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_pl_d_all_ie03
ON mst_pl_d_all USING BTREE (cst_po_no, co_cd);


CREATE INDEX mst_pl_d_all_ie04
ON mst_pl_d_all USING BTREE (cst_po_d_no, co_cd);

