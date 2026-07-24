\encoding UTF-8

CREATE TABLE mgt_std_alc_rate_all
(alc_ac_cd varchar (20) NOT NULL,
dpt_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
bp_cd varchar (20) NULL,
ctg_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
term timestamp(0)  NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
alc_rate numeric (21,8) NOT NULL,
fix_flg char (1) DEFAULT '0' NOT NULL,
fix_alc_ptn_cd varchar (10) NULL,
fix_expns_cd varchar (20) NULL,
calc_grp_cd varchar (10) NULL,
calc_no varchar (15) NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
non_calc_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_std_alc_rate_all
ADD CONSTRAINT mgt_std_alc_rate_all_pk UNIQUE(alc_ac_cd,dpt_cd,loc_cd,oper_cd,bp_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,term,calc_ctg_cd,wg_cd,co_cd);


CREATE INDEX mgt_std_alc_rate_all_ie01
ON mgt_std_alc_rate_all USING BTREE (term,co_cd);


CREATE INDEX mgt_std_alc_rate_all_ie02
ON mgt_std_alc_rate_all USING BTREE (fix_alc_ptn_cd,co_cd);


CREATE INDEX mgt_std_alc_rate_all_ie03
ON mgt_std_alc_rate_all USING BTREE (fix_expns_cd,co_cd);


CREATE INDEX mgt_std_alc_rate_all_ie04
ON mgt_std_alc_rate_all USING BTREE (calc_no, calc_grp_cd,co_cd);


CREATE UNIQUE INDEX mgt_std_alc_rate_all_pk_ie ON mgt_std_alc_rate_all (alc_ac_cd,COALESCE(dpt_cd,''),COALESCE(loc_cd,''),COALESCE(oper_cd,''),COALESCE(bp_cd,''),COALESCE(ctg_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),term,calc_ctg_cd,wg_cd,co_cd);

