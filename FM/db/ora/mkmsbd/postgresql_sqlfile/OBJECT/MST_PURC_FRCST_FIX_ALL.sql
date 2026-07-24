\encoding UTF-8

CREATE TABLE mst_purc_frcst_fix_all
(purc_frcst_fix_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
purc_frcst_no varchar (15) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
fix_flg char (1) DEFAULT '0' NOT NULL,
rpt_rmrks varchar (100) NULL,
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


ALTER TABLE mst_purc_frcst_fix_all
ADD CONSTRAINT mst_purc_frcst_fix_all_pk PRIMARY KEY(purc_frcst_fix_no,co_cd);


CREATE INDEX mst_purc_frcst_fix_all_ie01
ON mst_purc_frcst_fix_all USING BTREE (purc_frcst_no,co_cd);

