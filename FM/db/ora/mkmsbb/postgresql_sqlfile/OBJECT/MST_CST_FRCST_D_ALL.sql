\encoding UTF-8

CREATE TABLE mst_cst_frcst_d_all
(cst_frcst_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
cst_frcst_no varchar (15) NOT NULL,
fix_flg char (1) DEFAULT '0' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
frcst_period_typ varchar (1) NULL,
frcst_st_dt timestamp(0)  NOT NULL,
frcst_end_dt timestamp(0)  NOT NULL,
frcst_dt timestamp(0)  NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
gi_loc_cd varchar (20) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
cst_frcst_slip_d_no varchar (15) NULL,
prms_qty numeric (21,8) NULL,
frcst_stop_flg char (1) DEFAULT '0' NOT NULL,
disp_seq numeric (5,0) NOT NULL,
dmnd_cnt_rmrks varchar (100) NULL,
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


ALTER TABLE mst_cst_frcst_d_all
ADD CONSTRAINT mst_cst_frcst_d_all_pk PRIMARY KEY(cst_frcst_d_no,co_cd);


CREATE INDEX mst_cst_frcst_d_all_ie01
ON mst_cst_frcst_d_all USING BTREE (cst_frcst_no, co_cd);


CREATE INDEX mst_cst_frcst_d_all_ie02
ON mst_cst_frcst_d_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);


CREATE INDEX mst_cst_frcst_d_all_ie03
ON mst_cst_frcst_d_all USING BTREE (gi_loc_cd,co_cd);


CREATE INDEX mst_cst_frcst_d_all_ie04
ON mst_cst_frcst_d_all USING BTREE (fix_flg,co_cd);


CREATE INDEX mst_cst_frcst_d_all_ie05
ON mst_cst_frcst_d_all USING BTREE (frcst_stop_flg,co_cd);


CREATE INDEX mst_cst_frcst_d_all_ie06
ON mst_cst_frcst_d_all USING BTREE (frcst_period_typ,co_cd);


CREATE INDEX mst_cst_frcst_d_all_ie07
ON mst_cst_frcst_d_all USING BTREE (cst_itm_cd,co_cd);

