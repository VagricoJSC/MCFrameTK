\encoding UTF-8

CREATE TABLE mst_io_act_all
(slip_no varchar (15) NOT NULL,
slip_seq_no numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
act_tm timestamp(0)  NOT NULL,
slip_rev_no numeric (4,0) NOT NULL,
act_no varchar (15) NOT NULL,
act_seq numeric (4,0) NULL,
act_rev_no numeric (4,0) NULL,
act_d_no varchar (15) NULL,
act_d_seq numeric (4,0) NULL,
act_io_no varchar (15) NULL,
act_io_seq numeric (4,0) NULL,
slip_sts_typ varchar (1) NOT NULL,
un_fix_flg char (1) DEFAULT '0' NOT NULL,
temp_ap_flg char (1) DEFAULT '0' NOT NULL,
trd_cd varchar (4) NULL,
trd_ptn_typ varchar (4) NOT NULL,
trn_typ varchar (4) NOT NULL,
io_act_typ varchar (5) NOT NULL,
io_typ varchar (1) NOT NULL,
ac_slip_typ varchar (5) NULL,
rsn_cd varchar (10) NULL,
ac_rsn_cd varchar (10) NULL,
gi_wg_cd varchar (10) NULL,
gr_wg_cd varchar (10) NULL,
act_dpt_cd varchar (20) NULL,
purc_dpt_cd varchar (20) NULL,
ap_dpt_cd varchar (20) NULL,
sls_dpt_cd varchar (20) NULL,
ar_dpt_cd varchar (20) NULL,
gi_dpt_cd varchar (20) NULL,
gr_dpt_cd varchar (20) NULL,
bd_dpt_cd varchar (20) NULL,
sub_dpt_cd1 varchar (20) NULL,
sub_dpt_cd2 varchar (20) NULL,
sub_dpt_cd3 varchar (20) NULL,
act_usr_cd varchar (500) NULL,
sls_usr_cd varchar (500) NULL,
mfg_usr_cd varchar (500) NULL,
purc_usr_cd varchar (500) NULL,
ac_itm_grp_cd varchar (10) NULL,
itm_jnl_cd varchar (5) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
stk_mng_typ varchar (1) NOT NULL,
asset_mng_typ varchar (1) NOT NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
fix_no_typ varchar (1) NOT NULL,
fix_no varchar (15) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NULL,
in_xfr_typ varchar (1) NOT NULL,
quality_typ varchar (1) NOT NULL,
asst_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NULL,
trd_unit_cd varchar (5) NULL,
pack_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
trd_cur_cd varchar (3) NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_proc_amt numeric (21,8) NULL,
trd_cur_onr_prov_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
base_cur_cd varchar (3) NULL,
base_cur_upri numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_proc_amt numeric (21,8) NULL,
base_cur_onr_prov_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
ptax_cur_cd varchar (3) NULL,
ptax_cur_upri numeric (21,8) NULL,
ptax_cur_amt numeric (21,8) NULL,
ptax_cur_proc_amt numeric (21,8) NULL,
ptax_cur_onr_prov_amt numeric (21,8) NULL,
ptax_cur_tax_amt numeric (21,8) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
foreign_flg char (1) DEFAULT '0' NOT NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
ptax_xrate_cd varchar (2) NULL,
ptax_xrate numeric (21,8) NULL,
slo_no varchar (15) NULL,
po_no varchar (15) NULL,
iv_no varchar (15) NULL,
rcpt_iv_no varchar (15) NULL,
bd_ctg_cd varchar (20) NULL,
bd_bp_cd varchar (20) NULL,
bd_oper_cd varchar (10) NULL,
bd_loc_cd varchar (20) NULL,
bd_slo_no varchar (15) NULL,
bd_po_no varchar (15) NULL,
bd_iv_no varchar (15) NULL,
bd_wg_cd varchar (10) NULL,
dlv_cd varchar (20) NULL,
tdlv_cd varchar (20) NULL,
rcst_cd varchar (20) NULL,
bcst_cd varchar (20) NULL,
acst_cd varchar (20) NULL,
cst_cd varchar (20) NULL,
dest_cd1 varchar (20) NULL,
dest_cd2 varchar (20) NULL,
dest_cd3 varchar (20) NULL,
psppl_cd varchar (20) NULL,
bsppl_cd varchar (20) NULL,
asppl_cd varchar (20) NULL,
sppl_cd varchar (20) NULL,
cred_cd varchar (20) NULL,
spot_flg char (1) DEFAULT '0' NOT NULL,
sttl_schd_dt timestamp(0)  NULL,
sttl_cd varchar (10) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
purc_typ varchar (1) NULL,
area_cd varchar (3) NULL,
cntry_cd varchar (2) NULL,
itm_mfg_inst_no varchar (15) NULL,
itm_inst_qty numeric (21,8) NULL,
mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) NULL,
mfg_st_qty numeric (21,8) NULL,
oper_act_no varchar (15) NULL,
yield_rate numeric (5,2) NULL,
disp_seq numeric (9,0) NULL,
oper_cd varchar (10) NULL,
inpt_loc_cd varchar (20) NULL,
inpt_str_ln_cd varchar (10) NULL,
outsrc_mfg_loc_cd varchar (20) NULL,
outsrc_mfg_loc_dpt_cd varchar (20) NULL,
outsrc_mfg_loc_wg_cd varchar (10) NULL,
strg_loc_cd varchar (20) NULL,
strg_str_ln_cd varchar (10) NULL,
mfg_inst_unit_typ varchar (1) NULL,
repurc_obli_flg char (1) DEFAULT '0' NOT NULL,
gi_loc_cd varchar (20) NULL,
gr_loc_cd varchar (20) NULL,
stktk_base_dt timestamp(0)  NULL,
par_ac_itm_grp_cd varchar (10) NULL,
par_itm_jnl_cd varchar (5) NULL,
par_itm_cd varchar (40) NULL,
par_itm_sub1 varchar (5) NULL,
par_itm_sub2 varchar (5) NULL,
par_itm_sub3 varchar (5) NULL,
par_itm_nm varchar (100) NULL,
par_lot_no varchar (15) NULL,
par_sublot_no varchar (15) NULL,
par_sno1 varchar (15) NULL,
par_sno2 varchar (15) NULL,
par_sno3 varchar (15) NULL,
par_sno4 varchar (15) NULL,
accrual_flg char (1) DEFAULT '0' NOT NULL,
accpt_flg char (1) DEFAULT '0' NOT NULL,
avl_flg char (1) DEFAULT '0' NOT NULL,
trd_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
sub_char1 varchar (50) NULL,
sub_char2 varchar (50) NULL,
sub_char3 varchar (50) NULL,
sub_char4 varchar (50) NULL,
sub_char5 varchar (50) NULL,
sub_char6 varchar (50) NULL,
sub_char7 varchar (50) NULL,
sub_char8 varchar (50) NULL,
sub_char9 varchar (50) NULL,
sub_char10 varchar (50) NULL,
sub_num1 numeric (21,8) NULL,
sub_num2 numeric (21,8) NULL,
sub_num3 numeric (21,8) NULL,
sub_dt1 timestamp(0)  NULL,
sub_dt2 timestamp(0)  NULL,
sub_dt3 timestamp(0)  NULL,
par_slip_no varchar (15) NULL,
par_slip_seq_no numeric (4,0) NULL,
slip_cmpl_flg char (1) DEFAULT '0' NOT NULL,
send_flg char (1) DEFAULT '0' NOT NULL,
c_imp_flg char (1) DEFAULT '0' NOT NULL,
a_imp_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_io_act_all
ADD CONSTRAINT mst_io_act_all_pk PRIMARY KEY(slip_no,slip_seq_no,co_cd);


CREATE INDEX mst_io_act_all_ie01
ON mst_io_act_all USING BTREE (ac_ym, co_cd);


CREATE INDEX mst_io_act_all_ie02
ON mst_io_act_all USING BTREE (ac_dt, co_cd);


CREATE INDEX mst_io_act_all_ie03
ON mst_io_act_all USING BTREE (act_no, act_seq, co_cd);


CREATE INDEX mst_io_act_all_ie04
ON mst_io_act_all USING BTREE (act_d_no, act_d_seq, co_cd);


CREATE INDEX mst_io_act_all_ie05
ON mst_io_act_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_io_act_all_ie06
ON mst_io_act_all USING BTREE (loc_cd, ac_ym, co_cd);


CREATE INDEX mst_io_act_all_ie07
ON mst_io_act_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_io_act_all_ie08
ON mst_io_act_all USING BTREE (slo_no, co_cd);


CREATE INDEX mst_io_act_all_ie09
ON mst_io_act_all USING BTREE (po_no, co_cd);


CREATE INDEX mst_io_act_all_ie10
ON mst_io_act_all USING BTREE (iv_no, co_cd);


CREATE INDEX mst_io_act_all_ie11
ON mst_io_act_all USING BTREE (rcpt_iv_no, co_cd);


CREATE INDEX mst_io_act_all_ie12
ON mst_io_act_all USING BTREE (dlv_cd, co_cd);


CREATE INDEX mst_io_act_all_ie13
ON mst_io_act_all USING BTREE (tdlv_cd, co_cd);


CREATE INDEX mst_io_act_all_ie14
ON mst_io_act_all USING BTREE (rcst_cd, co_cd);


CREATE INDEX mst_io_act_all_ie15
ON mst_io_act_all USING BTREE (bcst_cd, co_cd);


CREATE INDEX mst_io_act_all_ie16
ON mst_io_act_all USING BTREE (acst_cd, co_cd);


CREATE INDEX mst_io_act_all_ie17
ON mst_io_act_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_io_act_all_ie18
ON mst_io_act_all USING BTREE (psppl_cd, co_cd);


CREATE INDEX mst_io_act_all_ie19
ON mst_io_act_all USING BTREE (bsppl_cd, co_cd);


CREATE INDEX mst_io_act_all_ie20
ON mst_io_act_all USING BTREE (asppl_cd, co_cd);


CREATE INDEX mst_io_act_all_ie21
ON mst_io_act_all USING BTREE (sppl_cd, co_cd);


CREATE INDEX mst_io_act_all_ie22
ON mst_io_act_all USING BTREE (cred_cd, co_cd);


CREATE INDEX mst_io_act_all_ie23
ON mst_io_act_all USING BTREE (itm_mfg_inst_no, co_cd);


CREATE INDEX mst_io_act_all_ie24
ON mst_io_act_all USING BTREE (mfg_inst_no, co_cd);


CREATE INDEX mst_io_act_all_ie25
ON mst_io_act_all USING BTREE (mfg_act_no, co_cd);


CREATE INDEX mst_io_act_all_ie26
ON mst_io_act_all USING BTREE (oper_act_no, co_cd);


CREATE INDEX mst_io_act_all_ie27
ON mst_io_act_all USING BTREE (par_slip_no, par_slip_seq_no, co_cd);

