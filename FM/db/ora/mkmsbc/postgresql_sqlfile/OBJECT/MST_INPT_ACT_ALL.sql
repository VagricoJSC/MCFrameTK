\encoding UTF-8

CREATE TABLE mst_inpt_act_all
(inpt_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
mfg_act_no varchar (15) NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
oper_act_no varchar (15) NOT NULL,
inpt_schd_no varchar (15) NULL,
div_seq numeric (3,0) NOT NULL,
inpt_loc_cd varchar (20) NOT NULL,
inpt_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
base_unit_inpt_qty numeric (21,8) NOT NULL,
base_unit_loss_qty numeric (21,8) NOT NULL,
base_unit_fxd_loss_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
act_tm timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
bkf_ctl_flg char (1) DEFAULT '0' NOT NULL,
base_unit_std_qty numeric (21,8) NULL,
cont_qty numeric (21,8) NULL,
cont_loss_qty numeric (21,8) NULL,
cont_fxd_loss_qty numeric (21,8) NULL,
cont_fctr_unit_cd varchar (5) NULL,
act_cont_fctr numeric (21,8) NULL,
acxfr_qty numeric (21,8) NULL,
acxfr_rsn_cd varchar (10) NULL,
acxfr_bd_dpt_cd varchar (20) NULL,
inpt_rsn_cd varchar (10) NULL,
add_flg char (1) DEFAULT '0' NOT NULL,
data_no numeric (15,0) NULL,
mes_id varchar (3) NULL,
mes_flg char (1) DEFAULT '0' NOT NULL,
ext_sys_cd varchar (10) NULL,
ext_inpt_act_no varchar (300) NULL,
if_auto_reg_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
act_rpt_rmrks varchar (100) NULL,
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


ALTER TABLE mst_inpt_act_all
ADD CONSTRAINT mst_inpt_act_all_pk PRIMARY KEY(inpt_act_no,co_cd);


CREATE INDEX mst_inpt_act_all_ie01
ON mst_inpt_act_all USING BTREE (inpt_schd_no,div_seq,co_cd);


CREATE INDEX mst_inpt_act_all_ie02
ON mst_inpt_act_all USING BTREE (mfg_act_no,co_cd);


CREATE INDEX mst_inpt_act_all_ie03
ON mst_inpt_act_all USING BTREE (oper_act_no,co_cd);


CREATE INDEX mst_inpt_act_all_ie04
ON mst_inpt_act_all USING BTREE (itm_mfg_inst_no,co_cd);


CREATE INDEX mst_inpt_act_all_ie05
ON mst_inpt_act_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,ver_no,co_cd);


CREATE INDEX mst_inpt_act_all_ie06
ON mst_inpt_act_all USING BTREE (lot_no,co_cd);


CREATE INDEX mst_inpt_act_all_ie07
ON mst_inpt_act_all USING BTREE (data_no,co_cd);


CREATE INDEX mst_inpt_act_all_ie08
ON mst_inpt_act_all USING BTREE (ext_inpt_act_no,ext_sys_cd,co_cd);

