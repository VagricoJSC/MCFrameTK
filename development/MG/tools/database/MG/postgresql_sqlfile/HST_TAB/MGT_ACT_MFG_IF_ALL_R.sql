\encoding UTF-8

CREATE TABLE mgt_act_mfg_if_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
data_lno numeric (15,0) NULL,
co_cd varchar (10) NULL,
calc_ctg_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
ym timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
itm_mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) DEFAULT '*' NULL,
oper_act_no varchar (15) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
ac_slip_typ varchar (5) NULL,
ac_rsn_cd varchar (10) NULL,
qty numeric (21,8) NULL,
amt numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
trd_cur_amt numeric (21,8) NULL,
xrate numeric (21,8) NULL,
mfg_per numeric (5,2) NULL,
mfg_cost_ratio numeric (21,8) NULL,
expns_cd varchar (20) NULL,
alc_val1 numeric (21,8) NULL,
alc_val2 numeric (21,8) NULL,
alc_val3 numeric (21,8) NULL,
alc_val4 numeric (21,8) NULL,
alc_val5 numeric (21,8) NULL,
mfg_act_grp varchar (100) NULL,
bom_ptn varchar (40) NULL,
oper_ptn varchar (40) NULL,
no_pln_flg char (1) DEFAULT '0' NULL,
no_itm_info_flg char (1) DEFAULT '0' NULL,
slip_no varchar (15) NULL,
slip_seq_no numeric (4,0) NULL,
rmrks varchar (100) NULL,
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



ALTER TABLE mgt_act_mfg_if_all_r ADD CONSTRAINT mgt_act_mfg_if_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_act_mfg_if_all_r', 'mgt_act_mfg_if_all', 'mgt_act_mfg_if_all_tr_r');

