\encoding UTF-8

CREATE TABLE mgt_alc_calc_dtl_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
alc_grp_id numeric (9,0) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
mng_dpt_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
ac_slip_typ varchar (5) NULL,
ac_rsn_cd varchar (10) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
oper_act_no varchar (15) NULL,
oper_cd varchar (10) NULL,
wk_cost_cd varchar (10) NULL,
wk_rsn_cd varchar (10) NULL,
bp_cd varchar (20) NULL,
iv_no varchar (15) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
alc_dpt_cd varchar (20) NULL,
act_sls_id varchar (20) NULL,
act_sls_id_sub varchar (3) NULL,
asst_typ varchar (1) NULL,
gp_alc_cd varchar (10) NULL,
co_cd varchar (10) NOT NULL,
alc_tgt_val numeric (21,8) NOT NULL,
alc_amt numeric (21,8) NOT NULL,
adj_amt numeric (21,8) NOT NULL,
std_alc_amt numeric (21,8) NOT NULL,
coef_val numeric (21,8) NOT NULL,
alc_org_tgt_val numeric (21,8) NULL,
std_alc_tgt_val numeric (21,8) NULL,
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



CREATE INDEX mgt_alc_calc_dtl_all_ie01
ON mgt_alc_calc_dtl_all USING BTREE (calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie02
ON mgt_alc_calc_dtl_all USING BTREE (alc_grp_id, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie03
ON mgt_alc_calc_dtl_all USING BTREE (ym, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie04
ON mgt_alc_calc_dtl_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie05
ON mgt_alc_calc_dtl_all USING BTREE (itm_mfg_inst_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie06
ON mgt_alc_calc_dtl_all USING BTREE (lot_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie07
ON mgt_alc_calc_dtl_all USING BTREE (sublot_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie08
ON mgt_alc_calc_dtl_all USING BTREE (sno1, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie09
ON mgt_alc_calc_dtl_all USING BTREE (sno2, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie10
ON mgt_alc_calc_dtl_all USING BTREE (sno3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie11
ON mgt_alc_calc_dtl_all USING BTREE (sno4, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie12
ON mgt_alc_calc_dtl_all USING BTREE (act_sls_id, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie13
ON mgt_alc_calc_dtl_all USING BTREE (gp_alc_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_dtl_all_ie14
ON mgt_alc_calc_dtl_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);

