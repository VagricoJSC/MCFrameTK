\encoding UTF-8

CREATE TABLE mst_wk_act_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
wk_act_no varchar (15) NULL,
co_cd varchar (10) NULL,
mfg_act_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NULL,
oper_act_no varchar (15) NULL,
wk_schd_no varchar (15) NULL,
div_seq numeric (3,0) NULL,
wk_cost_cd varchar (10) NULL,
wk_cost numeric (21,8) NULL,
st_tm timestamp(0)  NULL,
end_tm timestamp(0)  NULL,
brk_pd numeric (4,0) NULL,
ac_dt timestamp(0)  NULL,
wk_rsn_cd varchar (10) NULL,
wk_cost_calc_ctl_flg char (1) DEFAULT '0' NULL,
wk_day_cd varchar (10) NULL,
dpt_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
wk_usr_dpt_cd varchar (20) NULL,
wk_usr_cd varchar (500) NULL,
fclty varchar (100) NULL,
oper_cd varchar (10) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
dpt_wg_cd varchar (10) NULL,
loc_wg_cd varchar (10) NULL,
mes_flg char (1) DEFAULT '0' NULL,
ext_sys_cd varchar (10) NULL,
ext_wk_act_no varchar (300) NULL,
intr_rmrks varchar (100) NULL,
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



ALTER TABLE mst_wk_act_all_r ADD CONSTRAINT mst_wk_act_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_wk_act_all_r', 'mst_wk_act_all', 'mst_wk_act_all_tr_r');

