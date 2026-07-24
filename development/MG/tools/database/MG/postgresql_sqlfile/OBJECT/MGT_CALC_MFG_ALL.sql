\encoding UTF-8

CREATE TABLE mgt_calc_mfg_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_ext varchar (100) DEFAULT '*' NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
oper_act_no varchar (15) DEFAULT '*' NOT NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
ac_slip_typ varchar (5) NOT NULL,
ac_rsn_cd varchar (10) NULL,
expns_cd varchar (20) NULL,
asst_typ varchar (1) NULL,
mng_dpt_cd varchar (20) NULL,
cur_cd varchar (3) NULL,
xrate numeric (21,8) NULL,
co_cd varchar (10) NOT NULL,
qty numeric (21,8) NOT NULL,
amt numeric (21,8) NULL,
cur_amt numeric (21,8) NULL,
mfg_per numeric (5,2) NOT NULL,
mfg_cost_ratio numeric (21,8) NULL,
alc_val1 numeric (21,8) NULL,
alc_val2 numeric (21,8) NULL,
alc_val3 numeric (21,8) NULL,
alc_val4 numeric (21,8) NULL,
alc_val5 numeric (21,8) NULL
);



CREATE INDEX mgt_calc_mfg_all_ie01
ON mgt_calc_mfg_all USING BTREE (calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_calc_mfg_all_ie02
ON mgt_calc_mfg_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_calc_mfg_all_ie03
ON mgt_calc_mfg_all USING BTREE (itm_mfg_inst_no, calc_no, calc_grp_cd, co_cd);

