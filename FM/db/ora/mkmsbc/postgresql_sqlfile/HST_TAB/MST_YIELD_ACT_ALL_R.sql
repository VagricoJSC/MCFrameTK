\encoding UTF-8

CREATE TABLE mst_yield_act_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
yield_act_no varchar (15) NULL,
co_cd varchar (10) NULL,
mfg_act_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NULL,
oper_act_no varchar (15) NULL,
yield_schd_no varchar (15) NULL,
div_seq numeric (3,0) NULL,
mfg_mtd_typ varchar (1) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
trd_unit_qty numeric (21,8) NULL,
trd_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
yield_typ varchar (1) NULL,
yield_rate numeric (5,2) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
gd_cd varchar (2) NULL,
yield_rsn_cd varchar (10) NULL,
yield_loc_cd varchar (20) NULL,
yield_str_ln_cd varchar (10) DEFAULT '*' NULL,
strg_loc_cd varchar (20) NULL,
strg_str_ln_cd varchar (10) DEFAULT '*' NULL,
act_tm timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
bkf_ctl_flg char (1) DEFAULT '0' NULL,
lot_ctl_flg char (1) DEFAULT '0' NULL,
sublot_ctl_flg char (1) DEFAULT '0' NULL,
stk_lst_prnt_flg char (1) DEFAULT '0' NULL,
not_stk_flg char (1) DEFAULT '0' NULL,
data_no numeric (15,0) NULL,
mes_id varchar (3) NULL,
mes_flg char (1) DEFAULT '0' NULL,
ext_sys_cd varchar (10) NULL,
ext_yield_act_no varchar (300) NULL,
intr_rmrks varchar (100) NULL,
act_rpt_rmrks varchar (100) NULL,
insp_cnt_rmrks varchar (100) NULL,
trd_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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



ALTER TABLE mst_yield_act_all_r ADD CONSTRAINT mst_yield_act_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_yield_act_all_r', 'mst_yield_act_all', 'mst_yield_act_all_tr_r');

