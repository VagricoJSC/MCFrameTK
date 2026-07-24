\encoding UTF-8

CREATE TABLE mst_oper_inst_all
(oper_inst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
mfg_inst_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
oper_ord_no varchar (15) NULL,
disp_seq numeric (9,0) NOT NULL,
oper_cd varchar (10) NOT NULL,
oper_seq numeric (9,0) NULL,
st_schd_tm timestamp(0)  NOT NULL,
end_schd_tm timestamp(0)  NOT NULL,
oper_loc_cd varchar (20) NOT NULL,
oper_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
oper_std_qty numeric (21,8) NOT NULL,
oper_conv_qty numeric (21,8) NOT NULL,
oper_unit_cd varchar (5) NOT NULL,
oper_unit_conv_rnd_typ varchar (1) NOT NULL,
oper_unit_dec_place numeric (2,0) NOT NULL,
unschd_inst_flg char (1) DEFAULT '0' NOT NULL,
unschd_act_flg char (1) DEFAULT '0' NOT NULL,
bkf_flg char (1) DEFAULT '0' NOT NULL,
wk_cost_calc_flg char (1) DEFAULT '0' NOT NULL,
oper_inst_grp varchar (10) NULL,
usr_cd varchar (500) NULL,
oper_lt numeric (9,0) NULL,
oper_lt_add_qty numeric (21,8) NULL,
oper_offst_typ varchar (1) NULL,
oper_offst numeric (9,0) NULL,
oper_offst_add_qty numeric (21,8) NULL,
lmt_fr_dt_flg char (1) DEFAULT '0' NOT NULL,
oper_lower_yield numeric (6,3) NULL,
oper_std_yield numeric (6,3) NULL,
oper_upper_yield numeric (6,3) NULL,
wip_rate numeric (5,2) NULL,
yield_oper_flg char (1) DEFAULT '0' NOT NULL,
yield_oper_ratio numeric (9,0) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
oper_abort_flg char (1) DEFAULT '0' NOT NULL,
mes_flg char (1) DEFAULT '0' NOT NULL,
oper_rsrc varchar (100) NULL,
intr_rmrks varchar (100) NULL,
inst_rpt_rmrks varchar (100) NULL,
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


ALTER TABLE mst_oper_inst_all
ADD CONSTRAINT mst_oper_inst_all_pk PRIMARY KEY(oper_inst_no,co_cd);


CREATE INDEX mst_oper_inst_all_ie01
ON mst_oper_inst_all USING BTREE (mfg_inst_no,can_flg,co_cd);


CREATE INDEX mst_oper_inst_all_ie02
ON mst_oper_inst_all USING BTREE (itm_mfg_inst_no,can_flg,co_cd);


CREATE INDEX mst_oper_inst_all_ie03
ON mst_oper_inst_all USING BTREE (oper_ord_no,co_cd);


CREATE INDEX mst_oper_inst_all_ie04
ON mst_oper_inst_all USING BTREE (st_schd_tm,co_cd);

