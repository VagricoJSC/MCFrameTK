\encoding UTF-8

CREATE TABLE mst_mfg_act_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mfg_act_no varchar (15) NULL,
co_cd varchar (10) NULL,
mfg_inst_no varchar (15) NULL,
div_seq numeric (3,0) NULL,
itm_mfg_inst_no varchar (15) NULL,
trd_cd varchar (4) NULL,
st_act_tm timestamp(0)  NULL,
end_act_tm timestamp(0)  NULL,
base_unit_yield_qty numeric (21,8) NULL,
base_unit_dfct_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
st_ac_dt timestamp(0)  NULL,
end_ac_dt timestamp(0)  NULL,
itm_yield numeric (6,3) NULL,
mfg_aprv_sts_typ varchar (1) NULL,
aprv_dt timestamp(0)  NULL,
aprv_dpt_cd varchar (20) NULL,
aprv_usr_cd varchar (500) NULL,
aprv_tm timestamp(0)  NULL,
aprv_rsn varchar (100) NULL,
act_prnt_flg char (1) DEFAULT '0' NULL,
act_prnt_tm timestamp(0)  NULL,
seq numeric (3,0) NULL,
act_dpt_cd varchar (20) NULL,
act_usr_cd varchar (500) NULL,
arr_purc_auto_reg_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_mfg_act_all_r ADD CONSTRAINT mst_mfg_act_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mfg_act_all_r', 'mst_mfg_act_all', 'mst_mfg_act_all_tr_r');

