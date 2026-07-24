\encoding UTF-8

CREATE TABLE mst_mly_rqmt_all
(ym timestamp(0)  NOT NULL,
prod_ym timestamp(0)  NOT NULL,
mps_grp_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
strg_loc_cd varchar (20) NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
rqst_loc_cd varchar (20) DEFAULT '*' NOT NULL,
qty numeric (21,8) NOT NULL,
wg_cd varchar (10) NOT NULL,
intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_mly_rqmt_all
ADD CONSTRAINT mst_mly_rqmt_all_pk PRIMARY KEY(ym,prod_ym,mps_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie01
ON mst_mly_rqmt_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie02
ON mst_mly_rqmt_all USING BTREE (mps_grp_cd,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie03
ON mst_mly_rqmt_all USING BTREE (strg_loc_cd,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie04
ON mst_mly_rqmt_all USING BTREE (mfg_loc_cd,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie05
ON mst_mly_rqmt_all USING BTREE (sppl_cd,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie06
ON mst_mly_rqmt_all USING BTREE (rqst_loc_cd,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie07
ON mst_mly_rqmt_all USING BTREE (wg_cd,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie08
ON mst_mly_rqmt_all USING BTREE (ym,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie09
ON mst_mly_rqmt_all USING BTREE (prod_ym,co_cd);


CREATE INDEX mst_mly_rqmt_all_ie10
ON mst_mly_rqmt_all USING BTREE (ym,prod_ym,itm_cd,itm_sub1,itm_sub2,itm_sub3,mps_grp_cd,strg_loc_cd,co_cd);

