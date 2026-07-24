\encoding UTF-8

CREATE TABLE mgt_acc_top_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
top_rec_no numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
calc_rec_typ varchar (1) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
mng_dpt_cd varchar (20) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
mfg_purc_typ varchar (1) NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
cost_io_typ varchar (2) NULL,
ac_slip_typ varchar (5) NULL,
ac_rsn_cd varchar (10) NULL,
itm_mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
oper_act_no varchar (15) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
bp_cd varchar (20) NULL,
stk_bp_cd varchar (20) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
iv_no varchar (15) NULL,
act_id varchar (20) NULL,
act_id_sub varchar (3) NULL,
alc_dpt_cd varchar (20) NULL,
other_dpt_cd varchar (20) NULL,
asst_typ varchar (1) NOT NULL,
qty numeric (21,8) NOT NULL,
amt numeric (21,8) NULL,
std_qty numeric (21,8) NULL,
std_amt numeric (21,8) NULL,
cur_cd varchar (3) NULL,
cur_amt numeric (21,8) NULL,
cur_std_amt numeric (21,8) NULL,
xrate numeric (21,8) NULL,
std_xrate numeric (21,8) NULL,
upri_diff numeric (21,8) NULL,
rate_diff numeric (21,8) NULL,
trd_grp varchar (50) NULL,
act_upri numeric (21,8) NULL,
std_upri numeric (21,8) NULL,
so_act_amt numeric (21,8) NULL,
so_std_amt numeric (21,8) NULL,
per numeric (5,2) NULL,
mfg_cost_ratio numeric (21,8) NULL,
alc_ac_cd varchar (20) NULL,
rec_eval_typ varchar (1) NULL,
par_itm_cd varchar (40) NULL,
par_itm_sub1 varchar (5) NULL,
par_itm_sub2 varchar (5) NULL,
par_itm_sub3 varchar (5) NULL,
gp_alc_cd varchar (10) NULL,
repurc_obli_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_acc_top_all
ADD CONSTRAINT mgt_acc_top_all_pk PRIMARY KEY(calc_no,calc_grp_cd,top_rec_no,co_cd);


CREATE INDEX mgt_acc_top_all_ie01
ON mgt_acc_top_all USING BTREE (calc_rec_typ, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie02
ON mgt_acc_top_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie03
ON mgt_acc_top_all USING BTREE (lot_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie04
ON mgt_acc_top_all USING BTREE (sublot_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie05
ON mgt_acc_top_all USING BTREE (sno1, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie06
ON mgt_acc_top_all USING BTREE (sno2, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie07
ON mgt_acc_top_all USING BTREE (sno3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie08
ON mgt_acc_top_all USING BTREE (sno4, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie09
ON mgt_acc_top_all USING BTREE (loc_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie10
ON mgt_acc_top_all USING BTREE (bp_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie11
ON mgt_acc_top_all USING BTREE (oper_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie12
ON mgt_acc_top_all USING BTREE (ac_slip_typ, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie13
ON mgt_acc_top_all USING BTREE (ac_rsn_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie14
ON mgt_acc_top_all USING BTREE (act_id, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie15
ON mgt_acc_top_all USING BTREE (trd_grp, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie16
ON mgt_acc_top_all USING BTREE (par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie17
ON mgt_acc_top_all USING BTREE (cost_io_typ, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_top_all_ie18
ON mgt_acc_top_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);

