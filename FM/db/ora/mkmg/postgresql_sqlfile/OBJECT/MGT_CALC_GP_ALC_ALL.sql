\encoding UTF-8

CREATE TABLE mgt_calc_gp_alc_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
mng_dpt_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_ext varchar (100) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
bp_cd varchar (20) NULL,
alc_dpt_cd varchar (20) NULL,
itm_mfg_inst_no varchar (15) NULL,
iv_no varchar (15) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
asst_typ varchar (1) NOT NULL,
gp_alc_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
qty numeric (21,8) NULL,
amt numeric (21,8) NULL,
alc_val1 numeric (21,8) NULL,
alc_val2 numeric (21,8) NULL,
alc_val3 numeric (21,8) NULL,
alc_val4 numeric (21,8) NULL,
alc_val5 numeric (21,8) NULL
);



CREATE INDEX mgt_calc_gp_alc_all_ie01
ON mgt_calc_gp_alc_all USING BTREE (calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_calc_gp_alc_all_ie02
ON mgt_calc_gp_alc_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);

