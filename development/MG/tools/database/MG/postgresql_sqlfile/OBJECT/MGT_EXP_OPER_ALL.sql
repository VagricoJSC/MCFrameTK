\encoding UTF-8

CREATE TABLE mgt_exp_oper_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
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
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
asst_typ varchar (1) NOT NULL,
oper_ptn varchar (40) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
co_cd varchar (10) NOT NULL,
disp_seq numeric (9,0) NULL,
qty numeric (21,8) NOT NULL,
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



CREATE INDEX mgt_exp_oper_all_ie01
ON mgt_exp_oper_all USING BTREE (calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie02
ON mgt_exp_oper_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie03
ON mgt_exp_oper_all USING BTREE (itm_mfg_inst_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie04
ON mgt_exp_oper_all USING BTREE (lot_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie05
ON mgt_exp_oper_all USING BTREE (sublot_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie06
ON mgt_exp_oper_all USING BTREE (sno1, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie07
ON mgt_exp_oper_all USING BTREE (sno2, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie08
ON mgt_exp_oper_all USING BTREE (sno3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie09
ON mgt_exp_oper_all USING BTREE (sno4, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie10
ON mgt_exp_oper_all USING BTREE (loc_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_exp_oper_all_ie11
ON mgt_exp_oper_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);

