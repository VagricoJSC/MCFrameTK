\encoding UTF-8

CREATE TABLE mgt_std_top_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
top_rec_no numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
mfg_purc_typ varchar (1) NOT NULL,
loc_cd varchar (20) NULL,
sppl_cd varchar (20) NULL,
dpt_cd varchar (20) NULL,
cst_cd varchar (20) NULL,
dlv_cd varchar (20) NULL,
dest_cd1 varchar (20) NULL,
dest_cd2 varchar (20) NULL,
dest_cd3 varchar (20) NULL,
qty numeric (21,8) NOT NULL,
amt numeric (21,8) NULL,
sls_amt numeric (21,8) NULL,
cur_cd varchar (3) NULL,
cur_amt numeric (21,8) NULL,
sls_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_std_top_all
ADD CONSTRAINT mgt_std_top_all_pk PRIMARY KEY(calc_no,calc_grp_cd,top_rec_no,co_cd);


CREATE INDEX mgt_std_top_all_ie01
ON mgt_std_top_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_std_top_all_ie02
ON mgt_std_top_all USING BTREE (loc_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_std_top_all_ie03
ON mgt_std_top_all USING BTREE (sppl_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_std_top_all_ie04
ON mgt_std_top_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);

