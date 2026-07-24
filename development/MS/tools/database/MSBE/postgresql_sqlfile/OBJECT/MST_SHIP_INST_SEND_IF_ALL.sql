\encoding UTF-8

CREATE TABLE mst_ship_inst_send_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
ship_inst_no varchar (15) NOT NULL,
ship_inst_rev numeric (4,0) NOT NULL,
ship_fr_lg_grp_cd varchar (10) NOT NULL,
if_ship_fr_lg_grp_cd varchar (500) NULL,
ship_fr_lg_grp_nm varchar (40) NULL,
site_co_cd varchar (10) NULL,
if_site_co_cd varchar (500) NULL,
site_co_nm varchar (40) NULL,
ship_inst_tm timestamp(0)  NOT NULL,
ship_schd_tm timestamp(0)  NOT NULL,
dlv_schd_tm timestamp(0)  NOT NULL,
ship_wk_cd varchar (5) NULL,
if_ship_wk_cd varchar (500) NULL,
ship_wk_nm varchar (40) NULL,
ship_term_cd varchar (5) NULL,
if_ship_term_cd varchar (500) NULL,
ship_term_nm varchar (40) NULL,
inst_dpt_cd varchar (20) NULL,
if_inst_dpt_cd varchar (500) NULL,
inst_dpt_nm varchar (100) NULL,
inst_usr_cd varchar (500) NULL,
if_inst_usr_cd varchar (500) NULL,
inst_usr_nm varchar (500) NULL,
ship_to_lg_grp_cd varchar (10) NOT NULL,
if_ship_to_lg_grp_cd varchar (500) NULL,
ship_to_lg_grp_nm varchar (40) NULL,
ship_to_id_typ varchar (1) NOT NULL,
ship_to_id_cd varchar (20) NOT NULL,
if_ship_to_id_cd varchar (500) NULL,
ship_to_id_nm varchar (100) NULL,
ship_to_zip_cd varchar (10) NULL,
ship_to_addr1 varchar (250) NULL,
ship_to_addr2 varchar (250) NULL,
ship_to_addr3 varchar (250) NULL,
ship_to_addr4 varchar (250) NULL,
ship_to_cntct_dpt varchar (100) NULL,
ship_to_cntct_psn varchar (100) NULL,
ship_to_tel varchar (30) NULL,
ship_to_fax varchar (30) NULL,
ship_to_sundry_flg char (1) DEFAULT '0' NOT NULL,
dlv_id_typ varchar (1) NOT NULL,
dlv_id_cd varchar (20) NOT NULL,
if_dlv_id_cd varchar (500) NULL,
dlv_id_nm varchar (100) NULL,
cst_cd varchar (20) NULL,
if_cst_cd varchar (500) NULL,
cst_nm varchar (100) NULL,
dest_cd1 varchar (20) NULL,
if_dest_cd1 varchar (500) NULL,
dest_nm1 varchar (100) NULL,
dest_cd2 varchar (20) NULL,
if_dest_cd2 varchar (500) NULL,
dest_nm2 varchar (100) NULL,
dest_cd3 varchar (20) NULL,
if_dest_cd3 varchar (500) NULL,
dest_nm3 varchar (100) NULL,
ship_inst_d_no varchar (15) NOT NULL,
ship_alloc_sts_no varchar (15) NOT NULL,
iv_no varchar (15) NULL,
iv_d_no varchar (15) NULL,
dlv_slip_no varchar (15) NOT NULL,
dlv_slip_d_no varchar (15) NOT NULL,
trd_cd varchar (4) NOT NULL,
if_trd_cd varchar (500) NULL,
trd_nm varchar (40) NULL,
trd_ptn_typ varchar (4) NOT NULL,
ship_loc_cd varchar (20) NULL,
if_ship_loc_cd varchar (500) NULL,
ship_loc_nm varchar (40) NULL,
ship_str_ln_cd varchar (10) NULL,
if_ship_str_ln_cd varchar (500) NULL,
ship_str_ln_nm varchar (40) NULL,
ship_loc_tel varchar (30) NULL,
ship_loc_fax varchar (30) NULL,
dlv_rqst_tm timestamp(0)  NULL,
pd_inst_dlv_tm timestamp(0)  NULL,
ship_rqst_tm timestamp(0)  NULL,
assort_flg char (1) DEFAULT '0' NOT NULL,
set_itm_grp_no numeric (3,0) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
if_itm_cd varchar (500) NULL,
if_itm_sub1 varchar (5) NULL,
if_itm_sub2 varchar (5) NULL,
if_itm_sub3 varchar (5) NULL,
itm_nm varchar (100) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
ver_no varchar (10) NULL,
sno1 varchar (15) NULL,
sno1_null_flg char (1) DEFAULT '0' NOT NULL,
sno2 varchar (15) NULL,
sno2_null_flg char (1) DEFAULT '0' NOT NULL,
sno3 varchar (15) NULL,
sno3_null_flg char (1) DEFAULT '0' NOT NULL,
sno4 varchar (15) NULL,
sno4_null_flg char (1) DEFAULT '0' NOT NULL,
gd_cd varchar (2) NULL,
if_gd_cd varchar (500) NULL,
gd_nm varchar (40) NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) NULL,
if_stk_bp_cd varchar (500) NULL,
stk_bp_nm varchar (100) NULL,
ent_unit_qty numeric (21,8) NOT NULL,
ent_unit_cd varchar (5) NOT NULL,
if_ent_unit_cd varchar (500) NULL,
ent_unit_nm varchar (40) NULL,
ent_unit_bnum numeric (21,8) NULL,
ent_unit_wt numeric (21,8) NULL,
ent_unit_dim numeric (21,8) NULL,
wt_unit_cd varchar (5) NULL,
if_wt_unit_cd varchar (500) NULL,
wt_unit_nm varchar (40) NULL,
dim_unit_cd varchar (5) NULL,
if_dim_unit_cd varchar (500) NULL,
dim_unit_nm varchar (40) NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
if_trd_unit_cd varchar (500) NULL,
trd_unit_nm varchar (40) NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
if_base_unit_cd varchar (500) NULL,
base_unit_nm varchar (40) NULL,
pack_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
if_pack_unit_cd varchar (500) NULL,
pack_unit_nm varchar (40) NULL,
alloc_flg char (1) DEFAULT '0' NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
sls_acxfr_flg char (1) DEFAULT '0' NOT NULL,
sls_cststk_flg char (1) DEFAULT '0' NOT NULL,
vmi_flg char (1) DEFAULT '0' NOT NULL,
vld_dt timestamp(0)  NULL,
lmt_dt timestamp(0)  NULL,
first_gr_dt timestamp(0)  NULL,
prov_typ varchar (1) NULL,
prov_basis_typ varchar (1) NULL,
ret_prov_typ varchar (1) NULL,
ret_prov_basis_typ varchar (1) NULL,
rsn_cd varchar (10) NULL,
if_rsn_cd varchar (500) NULL,
rsn_nm varchar (100) NULL,
inst_rmrks varchar (100) NULL,
inst_d_rmrks varchar (100) NULL,
ship_cnt_rmrks varchar (100) NULL,
if_co_cd varchar (500) NULL,
co_nm varchar (100) NULL,
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
sub_char11 varchar (50) NULL,
sub_char12 varchar (50) NULL,
sub_char13 varchar (50) NULL,
sub_char14 varchar (50) NULL,
sub_char15 varchar (50) NULL,
sub_char16 varchar (50) NULL,
sub_char17 varchar (50) NULL,
sub_char18 varchar (50) NULL,
sub_char19 varchar (50) NULL,
sub_char20 varchar (50) NULL,
sub_char21 varchar (50) NULL,
sub_char22 varchar (50) NULL,
sub_char23 varchar (50) NULL,
sub_char24 varchar (50) NULL,
sub_char25 varchar (50) NULL,
sub_char26 varchar (50) NULL,
sub_char27 varchar (50) NULL,
sub_char28 varchar (50) NULL,
sub_char29 varchar (50) NULL,
sub_char30 varchar (50) NULL,
sub_num1 numeric (21,8) NULL,
sub_num2 numeric (21,8) NULL,
sub_num3 numeric (21,8) NULL,
sub_num4 numeric (21,8) NULL,
sub_num5 numeric (21,8) NULL,
sub_dt1 timestamp(0)  NULL,
sub_dt2 timestamp(0)  NULL,
sub_dt3 timestamp(0)  NULL,
sub_dt4 timestamp(0)  NULL,
sub_dt5 timestamp(0)  NULL,
batch_log_no varchar (15) NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
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


ALTER TABLE mst_ship_inst_send_if_all
ADD CONSTRAINT mst_ship_inst_send_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie01
ON mst_ship_inst_send_if_all USING BTREE (ship_inst_no, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie02
ON mst_ship_inst_send_if_all USING BTREE (ship_inst_d_no, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie03
ON mst_ship_inst_send_if_all USING BTREE (ship_alloc_sts_no, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie04
ON mst_ship_inst_send_if_all USING BTREE (dlv_slip_no, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie05
ON mst_ship_inst_send_if_all USING BTREE (dlv_slip_d_no, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie06
ON mst_ship_inst_send_if_all USING BTREE (ship_fr_lg_grp_cd, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie07
ON mst_ship_inst_send_if_all USING BTREE (ship_inst_tm, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie08
ON mst_ship_inst_send_if_all USING BTREE (ship_schd_tm, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie09
ON mst_ship_inst_send_if_all USING BTREE (ship_to_id_cd, ship_to_id_typ, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie10
ON mst_ship_inst_send_if_all USING BTREE (dlv_id_cd, dlv_id_typ, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie11
ON mst_ship_inst_send_if_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie12
ON mst_ship_inst_send_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie13
ON mst_ship_inst_send_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie14
ON mst_ship_inst_send_if_all USING BTREE (ext_sys_cd, co_cd);


CREATE INDEX mst_ship_inst_send_if_all_ie15
ON mst_ship_inst_send_if_all USING BTREE (batch_log_no, co_cd);

