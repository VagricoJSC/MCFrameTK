\encoding UTF-8

CREATE TABLE mgt_pre_alc_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
alc_ac_cd varchar (20) NOT NULL,
dpt_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
bp_cd varchar (20) NULL,
ctg_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
itm_mfg_inst_no varchar (15) NULL,
iv_no varchar (15) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
src_wg_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
amt numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_pre_alc_all
ADD CONSTRAINT mgt_pre_alc_all_pk UNIQUE(calc_no,calc_grp_cd,wg_cd,ym,alc_ac_cd,dpt_cd,loc_cd,oper_cd,bp_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,itm_mfg_inst_no,iv_no,po_no,slo_no,src_wg_cd,co_cd);


CREATE INDEX mgt_pre_alc_all_ie01
ON mgt_pre_alc_all USING BTREE (alc_ac_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_pre_alc_all_ie02
ON mgt_pre_alc_all USING BTREE (dpt_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_pre_alc_all_ie03
ON mgt_pre_alc_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);


CREATE UNIQUE INDEX mgt_pre_alc_all_pk_ie ON mgt_pre_alc_all (calc_no,calc_grp_cd,wg_cd,ym,alc_ac_cd,COALESCE(dpt_cd,''),COALESCE(loc_cd,''),COALESCE(oper_cd,''),COALESCE(bp_cd,''),COALESCE(ctg_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),COALESCE(lot_no,''),COALESCE(sublot_no,''),COALESCE(sno1,''),COALESCE(sno2,''),COALESCE(sno3,''),COALESCE(sno4,''),COALESCE(itm_mfg_inst_no,''),COALESCE(iv_no,''),COALESCE(po_no,''),COALESCE(slo_no,''),src_wg_cd,co_cd);

