\encoding UTF-8

CREATE TABLE mst_oper_act_all
(oper_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
mfg_act_no varchar (15) NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
oper_inst_no varchar (15) NOT NULL,
div_seq numeric (3,0) NOT NULL,
arr_act_no varchar (15) NULL,
purc_act_io_no varchar (15) NULL,
disp_seq numeric (9,0) NOT NULL,
st_act_tm timestamp(0)  NOT NULL,
end_act_tm timestamp(0)  NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
oper_unit_qty numeric (21,8) NOT NULL,
oper_unit_cd varchar (5) NOT NULL,
bkf_ctl_flg char (1) DEFAULT '0' NOT NULL,
wk_cost_calc_ctl_flg char (1) DEFAULT '0' NOT NULL,
oper_yield numeric (6,3) NULL,
bkf_not_ref_flg char (1) DEFAULT '0' NOT NULL,
data_no numeric (15,0) NULL,
mes_id varchar (3) NULL,
mes_flg char (1) DEFAULT '0' NOT NULL,
ext_sys_cd varchar (10) NULL,
ext_oper_act_no varchar (300) NULL,
if_auto_reg_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_oper_act_all
ADD CONSTRAINT mst_oper_act_all_pk PRIMARY KEY(oper_act_no,co_cd);


CREATE INDEX mst_oper_act_all_ie01
ON mst_oper_act_all USING BTREE (oper_inst_no,div_seq,co_cd);


CREATE INDEX mst_oper_act_all_ie02
ON mst_oper_act_all USING BTREE (mfg_act_no,co_cd);


CREATE INDEX mst_oper_act_all_ie03
ON mst_oper_act_all USING BTREE (itm_mfg_inst_no,co_cd);


CREATE INDEX mst_oper_act_all_ie04
ON mst_oper_act_all USING BTREE (arr_act_no,co_cd);


CREATE INDEX mst_oper_act_all_ie05
ON mst_oper_act_all USING BTREE (purc_act_io_no,co_cd);


CREATE INDEX mst_oper_act_all_ie06
ON mst_oper_act_all USING BTREE (data_no,co_cd);


CREATE INDEX mst_oper_act_all_ie07
ON mst_oper_act_all USING BTREE (ext_oper_act_no,ext_sys_cd,co_cd);

