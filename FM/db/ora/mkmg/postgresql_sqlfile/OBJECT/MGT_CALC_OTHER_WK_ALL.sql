\encoding UTF-8

CREATE TABLE mgt_calc_other_wk_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
dpt_cd varchar (20) NULL,
ctg_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
wk_cost_cd varchar (10) NOT NULL,
wk_rsn_cd varchar (10) NULL,
co_cd varchar (10) NOT NULL,
wk_cost numeric (21,8) NOT NULL
);



CREATE INDEX mgt_calc_other_wk_all_ie01
ON mgt_calc_other_wk_all USING BTREE (calc_no, calc_grp_cd, co_cd);

