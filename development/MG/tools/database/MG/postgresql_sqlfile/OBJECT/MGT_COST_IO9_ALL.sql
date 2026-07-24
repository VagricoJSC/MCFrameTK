\encoding UTF-8

CREATE TABLE mgt_cost_io9_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NULL,
mng_dpt_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
bp_cd varchar (20) NULL,
asst_typ varchar (1) NOT NULL,
qty01 numeric (21,8) NOT NULL,
amt01 numeric (21,8) NOT NULL,
std01 numeric (21,8) NOT NULL,
qty02 numeric (21,8) NOT NULL,
amt02 numeric (21,8) NOT NULL,
std02 numeric (21,8) NOT NULL,
qty03 numeric (21,8) NOT NULL,
amt03 numeric (21,8) NOT NULL,
std03 numeric (21,8) NOT NULL,
qty04 numeric (21,8) NOT NULL,
amt04 numeric (21,8) NOT NULL,
std04 numeric (21,8) NOT NULL,
qty05 numeric (21,8) NOT NULL,
amt05 numeric (21,8) NOT NULL,
std05 numeric (21,8) NOT NULL,
qty06 numeric (21,8) NOT NULL,
amt06 numeric (21,8) NOT NULL,
std06 numeric (21,8) NOT NULL,
qty07 numeric (21,8) NOT NULL,
amt07 numeric (21,8) NOT NULL,
std07 numeric (21,8) NOT NULL,
qty08 numeric (21,8) NOT NULL,
amt08 numeric (21,8) NOT NULL,
std08 numeric (21,8) NOT NULL,
qty09 numeric (21,8) NOT NULL,
amt09 numeric (21,8) NOT NULL,
std09 numeric (21,8) NOT NULL,
qty10 numeric (21,8) NOT NULL,
amt10 numeric (21,8) NOT NULL,
std10 numeric (21,8) NOT NULL,
qty11 numeric (21,8) NOT NULL,
amt11 numeric (21,8) NOT NULL,
std11 numeric (21,8) NOT NULL,
qty12 numeric (21,8) NOT NULL,
amt12 numeric (21,8) NOT NULL,
std12 numeric (21,8) NOT NULL,
qty13 numeric (21,8) NOT NULL,
amt13 numeric (21,8) NOT NULL,
std13 numeric (21,8) NOT NULL,
qty14 numeric (21,8) NOT NULL,
amt14 numeric (21,8) NOT NULL,
std14 numeric (21,8) NOT NULL,
qty15 numeric (21,8) NOT NULL,
amt15 numeric (21,8) NOT NULL,
std15 numeric (21,8) NOT NULL,
qty16 numeric (21,8) NOT NULL,
amt16 numeric (21,8) NOT NULL,
std16 numeric (21,8) NOT NULL,
qty17 numeric (21,8) NOT NULL,
amt17 numeric (21,8) NOT NULL,
std17 numeric (21,8) NOT NULL,
qty18 numeric (21,8) NOT NULL,
amt18 numeric (21,8) NOT NULL,
std18 numeric (21,8) NOT NULL,
qty19 numeric (21,8) NOT NULL,
amt19 numeric (21,8) NOT NULL,
std19 numeric (21,8) NOT NULL,
qty20 numeric (21,8) NOT NULL,
amt20 numeric (21,8) NOT NULL,
std20 numeric (21,8) NOT NULL,
qty21 numeric (21,8) NOT NULL,
amt21 numeric (21,8) NOT NULL,
std21 numeric (21,8) NOT NULL,
qty22 numeric (21,8) NOT NULL,
amt22 numeric (21,8) NOT NULL,
std22 numeric (21,8) NOT NULL,
qty23 numeric (21,8) NOT NULL,
amt23 numeric (21,8) NOT NULL,
std23 numeric (21,8) NOT NULL,
qty24 numeric (21,8) NOT NULL,
amt24 numeric (21,8) NOT NULL,
std24 numeric (21,8) NOT NULL,
qty25 numeric (21,8) NOT NULL,
amt25 numeric (21,8) NOT NULL,
std25 numeric (21,8) NOT NULL,
qty26 numeric (21,8) NOT NULL,
amt26 numeric (21,8) NOT NULL,
std26 numeric (21,8) NOT NULL,
qty27 numeric (21,8) NOT NULL,
amt27 numeric (21,8) NOT NULL,
std27 numeric (21,8) NOT NULL,
qty28 numeric (21,8) NOT NULL,
amt28 numeric (21,8) NOT NULL,
std28 numeric (21,8) NOT NULL,
qty29 numeric (21,8) NOT NULL,
amt29 numeric (21,8) NOT NULL,
std29 numeric (21,8) NOT NULL,
qty30 numeric (21,8) NOT NULL,
amt30 numeric (21,8) NOT NULL,
std30 numeric (21,8) NOT NULL,
diff_qty numeric (21,8) NOT NULL,
diff_amt numeric (21,8) NOT NULL,
diff_std numeric (21,8) NOT NULL,
ave_tgt numeric (9,0) DEFAULT 0 NOT NULL,
ym_sub timestamp(0)  NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mgt_cost_io9_all
ADD CONSTRAINT mgt_cost_io9_all_pk UNIQUE(calc_no,calc_grp_cd,wg_cd,ym,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,bp_cd,asst_typ,co_cd);


CREATE INDEX mgt_cost_io9_all_ie01
ON mgt_cost_io9_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_cost_io9_all_ie02
ON mgt_cost_io9_all USING BTREE (lot_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_cost_io9_all_ie03
ON mgt_cost_io9_all USING BTREE (sublot_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_cost_io9_all_ie04
ON mgt_cost_io9_all USING BTREE (sno1, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_cost_io9_all_ie05
ON mgt_cost_io9_all USING BTREE (sno2, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_cost_io9_all_ie06
ON mgt_cost_io9_all USING BTREE (sno3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_cost_io9_all_ie07
ON mgt_cost_io9_all USING BTREE (sno4, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_cost_io9_all_ie08
ON mgt_cost_io9_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);


CREATE UNIQUE INDEX mgt_cost_io9_all_pk_ie ON mgt_cost_io9_all (calc_no,calc_grp_cd,wg_cd,COALESCE(ym,'1999-04-01 00:00:00'),mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,COALESCE(bp_cd,''),asst_typ,co_cd);

