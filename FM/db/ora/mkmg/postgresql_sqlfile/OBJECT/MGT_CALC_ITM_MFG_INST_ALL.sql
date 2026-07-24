\encoding UTF-8

CREATE TABLE mgt_calc_itm_mfg_inst_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_ext varchar (100) DEFAULT '*' NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
mng_dpt_cd varchar (20) NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
iv_no varchar (15) NULL,
asst_typ varchar (1) NULL,
qty numeric (21,8) NULL,
schd_st_dt timestamp(0)  NULL,
schd_end_dt timestamp(0)  NULL,
act_st_dt timestamp(0)  NULL,
act_end_dt timestamp(0)  NULL,
calc_ctg_cd varchar (10) NULL
);


ALTER TABLE mgt_calc_itm_mfg_inst_all
ADD CONSTRAINT mgt_calc_itm_mfg_inst_all_pk PRIMARY KEY(calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_ext,itm_mfg_inst_no,mfg_act_no,co_cd);


CREATE INDEX mgt_calc_itm_mfg_inst_all_ie01
ON mgt_calc_itm_mfg_inst_all USING BTREE (itm_mfg_inst_no, calc_no, calc_grp_cd, co_cd);

