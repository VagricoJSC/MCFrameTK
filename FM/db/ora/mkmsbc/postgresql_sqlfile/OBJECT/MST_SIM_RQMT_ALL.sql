\encoding UTF-8

CREATE TABLE mst_sim_rqmt_all
(rqmt_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
strg_loc_cd varchar (20) NOT NULL,
due_dt timestamp(0)  NOT NULL,
rqmt_qty numeric (21,8) NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
rqst_loc_cd varchar (20) DEFAULT '*' NOT NULL,
fix_flg char (1) DEFAULT '0' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
wg_cd varchar (10) NOT NULL,
rqmt_gnrt_typ varchar (1) NOT NULL,
rqmt_typ varchar (1) NULL,
intr_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
sim_mrp_no varchar (15) NOT NULL,
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


ALTER TABLE mst_sim_rqmt_all
ADD CONSTRAINT mst_sim_rqmt_all_pk PRIMARY KEY(rqmt_no,co_cd);


CREATE INDEX mst_sim_rqmt_all_ie01
ON mst_sim_rqmt_all USING BTREE (sim_mrp_no,co_cd);


CREATE INDEX mst_sim_rqmt_all_ie02
ON mst_sim_rqmt_all USING BTREE (strg_loc_cd,co_cd);


CREATE INDEX mst_sim_rqmt_all_ie03
ON mst_sim_rqmt_all USING BTREE (sppl_cd,co_cd);


CREATE INDEX mst_sim_rqmt_all_ie04
ON mst_sim_rqmt_all USING BTREE (mfg_loc_cd,co_cd);


CREATE INDEX mst_sim_rqmt_all_ie05
ON mst_sim_rqmt_all USING BTREE (rqst_loc_cd,co_cd);


CREATE INDEX mst_sim_rqmt_all_ie06
ON mst_sim_rqmt_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);

