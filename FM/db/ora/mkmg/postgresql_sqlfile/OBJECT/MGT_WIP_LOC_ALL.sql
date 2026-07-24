\encoding UTF-8

CREATE TABLE mgt_wip_loc_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
mng_dpt_cd varchar (20) NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
expns_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
st_wip_amt numeric (21,8) NOT NULL,
prod_amt numeric (21,8) NOT NULL,
inpt_amt numeric (21,8) NOT NULL,
comp_amt numeric (21,8) NOT NULL,
end_wip_amt numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_wip_loc_all
ADD CONSTRAINT mgt_wip_loc_all_pk UNIQUE(calc_no,calc_grp_cd,wg_cd,ym,mng_dpt_cd,loc_cd,str_ln_cd,oper_cd,oper_seq,expns_cd,co_cd);


CREATE INDEX mgt_wip_loc_all_ie01
ON mgt_wip_loc_all USING BTREE (ym, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_wip_loc_all_ie02
ON mgt_wip_loc_all USING BTREE (mng_dpt_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_wip_loc_all_ie03
ON mgt_wip_loc_all USING BTREE (loc_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_wip_loc_all_ie04
ON mgt_wip_loc_all USING BTREE (oper_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_wip_loc_all_ie05
ON mgt_wip_loc_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);


CREATE UNIQUE INDEX mgt_wip_loc_all_pk_ie ON mgt_wip_loc_all (calc_no,calc_grp_cd,wg_cd,ym,mng_dpt_cd,loc_cd,str_ln_cd,COALESCE(oper_cd,''),COALESCE(oper_seq,0),expns_cd,co_cd);

