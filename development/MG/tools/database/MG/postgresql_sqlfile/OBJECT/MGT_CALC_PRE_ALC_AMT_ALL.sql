\encoding UTF-8

CREATE TABLE mgt_calc_pre_alc_amt_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
alc_amt_key numeric (15) NOT NULL,
co_cd varchar (10) NOT NULL,
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
amt numeric (21,8) NOT NULL
);


ALTER TABLE mgt_calc_pre_alc_amt_all
ADD CONSTRAINT mgt_calc_pre_alc_amt_all_pk PRIMARY KEY(calc_no,calc_grp_cd,alc_amt_key,co_cd);

