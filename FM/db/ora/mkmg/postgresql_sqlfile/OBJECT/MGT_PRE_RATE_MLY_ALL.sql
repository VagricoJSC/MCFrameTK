\encoding UTF-8

CREATE TABLE mgt_pre_rate_mly_all
(pre_alc_rate_cd varchar (20) NOT NULL,
sa_typ varchar (1) NOT NULL,
ym timestamp(0)  NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
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
alc_ac_cd varchar (20) NULL,
trd_wg_cd varchar (10) NULL,
co_cd varchar (10) NOT NULL,
pre_alc_rate numeric (21,8) NOT NULL,
adj_flg char (1) DEFAULT '0' NOT NULL,
rmrks varchar (100) NULL,
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


ALTER TABLE mgt_pre_rate_mly_all
ADD CONSTRAINT mgt_pre_rate_mly_all_pk UNIQUE(pre_alc_rate_cd,sa_typ,ym,calc_ctg_cd,wg_cd,dpt_cd,loc_cd,oper_cd,bp_cd,ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,itm_mfg_inst_no,iv_no,po_no,slo_no,alc_ac_cd,trd_wg_cd,co_cd);


CREATE INDEX mgt_pre_rate_mly_all_ie01
ON mgt_pre_rate_mly_all USING BTREE (ym, co_cd);


CREATE UNIQUE INDEX mgt_pre_rate_mly_all_pk_ie ON mgt_pre_rate_mly_all (pre_alc_rate_cd,sa_typ,ym,calc_ctg_cd,wg_cd,COALESCE(dpt_cd,''),COALESCE(loc_cd,''),COALESCE(oper_cd,''),COALESCE(bp_cd,''),COALESCE(ctg_cd,''),COALESCE(itm_cd,''),COALESCE(itm_sub1,''),COALESCE(itm_sub2,''),COALESCE(itm_sub3,''),COALESCE(lot_no,''),COALESCE(sublot_no,''),COALESCE(sno1,''),COALESCE(sno2,''),COALESCE(sno3,''),COALESCE(sno4,''),COALESCE(itm_mfg_inst_no,''),COALESCE(iv_no,''),COALESCE(po_no,''),COALESCE(slo_no,''),COALESCE(alc_ac_cd,''),COALESCE(trd_wg_cd,''),co_cd);

