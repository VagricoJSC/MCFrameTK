\encoding UTF-8

CREATE TABLE mst_yield_act_all
(yield_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
mfg_act_no varchar (15) NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
oper_act_no varchar (15) NOT NULL,
yield_schd_no varchar (15) NULL,
div_seq numeric (3,0) NOT NULL,
mfg_mtd_typ varchar (1) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
yield_typ varchar (1) NOT NULL,
yield_rate numeric (5,2) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
gd_cd varchar (2) NOT NULL,
yield_rsn_cd varchar (10) NULL,
yield_loc_cd varchar (20) NOT NULL,
yield_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
strg_loc_cd varchar (20) NOT NULL,
strg_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
act_tm timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
bkf_ctl_flg char (1) DEFAULT '0' NOT NULL,
lot_ctl_flg char (1) DEFAULT '0' NOT NULL,
sublot_ctl_flg char (1) DEFAULT '0' NOT NULL,
stk_lst_prnt_flg char (1) DEFAULT '0' NOT NULL,
not_stk_flg char (1) DEFAULT '0' NOT NULL,
data_no numeric (15,0) NULL,
mes_id varchar (3) NULL,
mes_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_yield_act_all
ADD CONSTRAINT mst_yield_act_all_pk PRIMARY KEY(yield_act_no,co_cd);


CREATE INDEX mst_yield_act_all_ie01
ON mst_yield_act_all USING BTREE (yield_schd_no,co_cd);


CREATE INDEX mst_yield_act_all_ie02
ON mst_yield_act_all USING BTREE (mfg_act_no,co_cd);


CREATE INDEX mst_yield_act_all_ie03
ON mst_yield_act_all USING BTREE (oper_act_no,co_cd);


CREATE INDEX mst_yield_act_all_ie04
ON mst_yield_act_all USING BTREE (itm_mfg_inst_no,co_cd);


CREATE INDEX mst_yield_act_all_ie05
ON mst_yield_act_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);


CREATE INDEX mst_yield_act_all_ie06
ON mst_yield_act_all USING BTREE (lot_no,co_cd);


CREATE INDEX mst_yield_act_all_ie07
ON mst_yield_act_all USING BTREE (data_no,co_cd);


CREATE INDEX mst_yield_act_all_ie08
ON mst_yield_act_all USING BTREE (ext_yield_act_no,ext_sys_cd,co_cd);

