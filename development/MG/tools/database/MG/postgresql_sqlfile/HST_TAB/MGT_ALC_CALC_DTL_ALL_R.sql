\encoding UTF-8

CREATE TABLE mgt_alc_calc_dtl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_no varchar (15) NULL,
calc_grp_cd varchar (10) NULL,
alc_grp_id numeric (9,0) NULL,
wg_cd varchar (10) NULL,
ym timestamp(0)  NULL,
mng_dpt_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
itm_mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
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
co_cd varchar (10) NULL,
alc_tgt_val numeric (21,8) NULL,
alc_amt numeric (21,8) NULL,
adj_amt numeric (21,8) NULL,
std_alc_amt numeric (21,8) NULL,
coef_val numeric (21,8) NULL,
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



ALTER TABLE mgt_alc_calc_dtl_all_r ADD CONSTRAINT mgt_alc_calc_dtl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_alc_calc_dtl_all_r', 'mgt_alc_calc_dtl_all', 'mgt_alc_calc_dtl_all_tr_r');

