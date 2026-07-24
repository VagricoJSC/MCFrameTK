\encoding UTF-8

CREATE TABLE mst_oper_act_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
oper_act_no varchar (15) NULL,
co_cd varchar (10) NULL,
mfg_act_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NULL,
oper_inst_no varchar (15) NULL,
div_seq numeric (3,0) NULL,
arr_act_no varchar (15) NULL,
purc_act_io_no varchar (15) NULL,
disp_seq numeric (9,0) NULL,
st_act_tm timestamp(0)  NULL,
end_act_tm timestamp(0)  NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
oper_unit_qty numeric (21,8) NULL,
oper_unit_cd varchar (5) NULL,
bkf_ctl_flg char (1) DEFAULT '0' NULL,
wk_cost_calc_ctl_flg char (1) DEFAULT '0' NULL,
oper_yield numeric (6,3) NULL,
bkf_not_ref_flg char (1) DEFAULT '0' NULL,
data_no numeric (15,0) NULL,
mes_id varchar (3) NULL,
mes_flg char (1) DEFAULT '0' NULL,
ext_sys_cd varchar (10) NULL,
ext_oper_act_no varchar (300) NULL,
if_auto_reg_flg char (1) DEFAULT '0' NULL,
intr_rmrks varchar (100) NULL,
act_rpt_rmrks varchar (100) NULL,
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



ALTER TABLE mst_oper_act_all_r ADD CONSTRAINT mst_oper_act_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_oper_act_all_r', 'mst_oper_act_all', 'mst_oper_act_all_tr_r');

