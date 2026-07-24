\encoding UTF-8

CREATE TABLE mgt_std_fix_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
term timestamp(0)  NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
std_qty numeric (21,8) NOT NULL,
std_upri numeric (21,8) NOT NULL,
calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
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


ALTER TABLE mgt_std_fix_all
ADD CONSTRAINT mgt_std_fix_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,term,calc_ctg_cd,wg_cd,co_cd);


CREATE INDEX mgt_std_fix_all_ie01
ON mgt_std_fix_all USING BTREE (term, co_cd);


CREATE INDEX mgt_std_fix_all_ie02
ON mgt_std_fix_all USING BTREE (calc_no, calc_grp_cd, co_cd);

