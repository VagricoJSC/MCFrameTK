\encoding UTF-8

CREATE TABLE mgt_calc_inst_wip_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_ext varchar (100) DEFAULT '*' NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
oper_act_no varchar (15) DEFAULT '*' NOT NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
ac_rsn_cd varchar (10) NULL,
wip_qty numeric (21,8) NOT NULL,
wip_per numeric (5,2) NOT NULL
);


ALTER TABLE mgt_calc_inst_wip_all
ADD CONSTRAINT mgt_calc_inst_wip_all_pk PRIMARY KEY(calc_no,calc_grp_cd,wg_cd,ym,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_ext,itm_mfg_inst_no,mfg_act_no,co_cd);


CREATE INDEX mgt_calc_inst_wip_all_ie01
ON mgt_calc_inst_wip_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_calc_inst_wip_all_ie02
ON mgt_calc_inst_wip_all USING BTREE (itm_mfg_inst_no, calc_no, calc_grp_cd, co_cd);

