\encoding UTF-8

CREATE TABLE mgt_acc_inpt_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_no varchar (15) NULL,
calc_grp_cd varchar (10) NULL,
inpt_rec_no numeric (9,0) NULL,
co_cd varchar (10) NULL,
top_rec_no numeric (9,0) NULL,
lvl numeric (3,0) NULL,
wg_cd varchar (10) NULL,
ym timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
mng_dpt_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
mfg_purc_typ varchar (1) NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
oper_act_no varchar (15) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
ac_slip_typ varchar (5) NULL,
ac_rsn_cd varchar (10) NULL,
asst_typ varchar (1) NULL,
act_qty numeric (21,8) NULL,
std_qty numeric (21,8) NULL,
act_upri numeric (21,8) NULL,
std_upri numeric (21,8) NULL,
repurc_obli_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mgt_acc_inpt_all_r ADD CONSTRAINT mgt_acc_inpt_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_acc_inpt_all_r', 'mgt_acc_inpt_all', 'mgt_acc_inpt_all_tr_r');

