\encoding UTF-8

CREATE TABLE mbt_ac_io_all
(data_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
slip_no varchar (15) NOT NULL,
slip_seq_no numeric (4,0) NOT NULL,
slip_rev_no numeric (4,0) NOT NULL,
ac_dt timestamp(0)  NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
un_fix_flg char (1) DEFAULT '0' NOT NULL,
temp_ap_flg char (1) DEFAULT '0' NOT NULL,
purc_typ varchar (1) NULL,
ac_slip_typ varchar (5) NOT NULL,
ac_rsn_cd varchar (10) NULL,
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
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
usr_cd varchar (500) NULL,
ac_itm_grp_cd varchar (10) NULL,
itm_jnl_cd varchar (5) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
asst_typ varchar (1) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_cur_cd varchar (3) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
ptax_cur_cd varchar (3) NULL,
ptax_cur_amt numeric (21,8) NULL,
ptax_cur_tax_amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
foreign_flg char (1) DEFAULT '0' NOT NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
ptax_xrate_cd varchar (2) NULL,
ptax_xrate numeric (21,8) NULL,
repurc_obli_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_proc_amt numeric (21,8) NULL,
trd_cur_onr_prov_amt numeric (21,8) NULL,
base_cur_proc_amt numeric (21,8) NULL,
base_cur_onr_prov_amt numeric (21,8) NULL,
ptax_cur_proc_amt numeric (21,8) NULL,
ptax_cur_onr_prov_amt numeric (21,8) NULL,
slo_no varchar (15) NULL,
po_no varchar (15) NULL,
iv_no varchar (15) NULL,
wrk_no varchar (15) NULL,
acst_cd varchar (20) NULL,
cst_cd varchar (20) NULL,
asppl_cd varchar (20) NULL,
sppl_cd varchar (20) NULL,
spot_flg char (1) DEFAULT '0' NOT NULL,
sttl_schd_dt timestamp(0)  NULL,
sttl_cd varchar (10) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
area_cd varchar (3) NULL,
cntry_cd varchar (2) NULL,
trd_grp varchar (50) NULL,
trd_ac_itm_grp_cd varchar (10) NULL,
trd_itm_jnl_cd varchar (5) NULL,
trd_itm_cd varchar (40) NULL,
trd_itm_sub1 varchar (5) NULL,
trd_itm_sub2 varchar (5) NULL,
trd_itm_sub3 varchar (5) NULL,
trd_itm_nm varchar (100) NULL,
trd_lot_no varchar (15) NULL,
trd_sublot_no varchar (15) NULL,
trd_sno1 varchar (15) NULL,
trd_sno2 varchar (15) NULL,
trd_sno3 varchar (15) NULL,
trd_sno4 varchar (15) NULL,
jnl_key1 varchar (20) NULL,
jnl_key2 varchar (20) NULL,
jnl_key3 varchar (20) NULL,
jnl_key4 varchar (20) NULL,
jnl_key5 varchar (20) NULL,
jnl_key6 varchar (20) NULL,
jnl_key7 varchar (20) NULL,
jnl_key8 varchar (20) NULL,
jnl_key9 varchar (20) NULL,
jnl_key10 varchar (20) NULL,
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
inpt_ins_func_id varchar (50) NULL,
inpt_upd_func_id varchar (50) NULL,
jnl_fin_cnt numeric (2,0) NOT NULL,
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


ALTER TABLE mbt_ac_io_all
ADD CONSTRAINT mbt_ac_io_all_pk PRIMARY KEY(data_no,co_cd);


CREATE INDEX mbt_ac_io_all_ie01
ON mbt_ac_io_all USING BTREE (ac_ym, co_cd);


CREATE INDEX mbt_ac_io_all_ie02
ON mbt_ac_io_all USING BTREE (wg_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie03
ON mbt_ac_io_all USING BTREE (slip_no, co_cd);


CREATE INDEX mbt_ac_io_all_ie04
ON mbt_ac_io_all USING BTREE (ac_slip_typ, co_cd);


CREATE INDEX mbt_ac_io_all_ie05
ON mbt_ac_io_all USING BTREE (ac_rsn_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie06
ON mbt_ac_io_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mbt_ac_io_all_ie07
ON mbt_ac_io_all USING BTREE (lot_no, co_cd);


CREATE INDEX mbt_ac_io_all_ie08
ON mbt_ac_io_all USING BTREE (sublot_no, co_cd);


CREATE INDEX mbt_ac_io_all_ie09
ON mbt_ac_io_all USING BTREE (sno1, co_cd);


CREATE INDEX mbt_ac_io_all_ie10
ON mbt_ac_io_all USING BTREE (sno2, co_cd);


CREATE INDEX mbt_ac_io_all_ie11
ON mbt_ac_io_all USING BTREE (sno3, co_cd);


CREATE INDEX mbt_ac_io_all_ie12
ON mbt_ac_io_all USING BTREE (sno4, co_cd);


CREATE INDEX mbt_ac_io_all_ie13
ON mbt_ac_io_all USING BTREE (purc_dpt_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie14
ON mbt_ac_io_all USING BTREE (ap_dpt_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie15
ON mbt_ac_io_all USING BTREE (sls_dpt_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie16
ON mbt_ac_io_all USING BTREE (ar_dpt_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie17
ON mbt_ac_io_all USING BTREE (gi_dpt_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie18
ON mbt_ac_io_all USING BTREE (gr_dpt_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie19
ON mbt_ac_io_all USING BTREE (bd_dpt_cd, co_cd);


CREATE INDEX mbt_ac_io_all_ie20
ON mbt_ac_io_all USING BTREE (ac_ym, wg_cd, co_cd);

