\encoding UTF-8

CREATE TABLE mam_alc_ptn_sel_all
(alc_ac_cd varchar (20) NOT NULL,
dpt_alc_grp varchar (10) NULL,
loc_alc_grp varchar (10) NULL,
oper_alc_grp varchar (10) NULL,
bp_alc_grp varchar (10) NULL,
ctg_alc_grp varchar (10) NULL,
itm_alc_grp varchar (10) NULL,
term timestamp(0)  NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
alc_ptn_cd varchar (10) NOT NULL,
expns_cd varchar (20) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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


ALTER TABLE mam_alc_ptn_sel_all
ADD CONSTRAINT mam_alc_ptn_sel_all_pk UNIQUE(alc_ac_cd,dpt_alc_grp,loc_alc_grp,oper_alc_grp,bp_alc_grp,ctg_alc_grp,itm_alc_grp,term,calc_ctg_cd,wg_cd,co_cd);


CREATE UNIQUE INDEX mam_alc_ptn_sel_all_pk_ie ON mam_alc_ptn_sel_all (alc_ac_cd,COALESCE(dpt_alc_grp,''),COALESCE(loc_alc_grp,''),COALESCE(oper_alc_grp,''),COALESCE(bp_alc_grp,''),COALESCE(ctg_alc_grp,''),COALESCE(itm_alc_grp,''),term,calc_ctg_cd,wg_cd,co_cd);

