\encoding UTF-8

CREATE TABLE mgt_calc_itm_dtl_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
rqst_wg_cd varchar (10) DEFAULT '*' NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
cost_ratio numeric (21,8) NOT NULL,
oper_ptn varchar (40) NULL,
bom_ptn varchar (40) DEFAULT '*' NOT NULL,
min_lot_qty numeric (21,8) NOT NULL,
batch_lot_qty numeric (21,8) NOT NULL,
fxd_lot_qty numeric (21,8) NOT NULL,
fxd_yield_qty numeric (21,8) NOT NULL,
nmr_qty numeric (21,8) NOT NULL,
dnm_qty numeric (21,8) NOT NULL,
alc_dpt_cd varchar (20) NULL,
exp_dpt_cd varchar (20) NULL,
exp_prio numeric (9,0) NULL,
max_qty numeric (21,8) NULL,
alc_val1 numeric (21,8) NULL,
alc_val2 numeric (21,8) NULL,
alc_val3 numeric (21,8) NULL,
alc_val4 numeric (21,8) NULL,
alc_val5 numeric (21,8) NULL,
calc_ctg_cd varchar (10) NOT NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL
);


ALTER TABLE mgt_calc_itm_dtl_all
ADD CONSTRAINT mgt_calc_itm_dtl_all_pk PRIMARY KEY(calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,sppl_cd,rqst_wg_cd,wg_cd,co_cd);


CREATE INDEX mgt_calc_itm_dtl_all_ie01
ON mgt_calc_itm_dtl_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd, calc_ctg_cd);

