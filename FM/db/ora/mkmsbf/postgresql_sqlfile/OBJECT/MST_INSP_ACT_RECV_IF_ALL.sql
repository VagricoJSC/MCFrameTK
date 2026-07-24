\encoding UTF-8

CREATE TABLE mst_insp_act_recv_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
ext_data_no numeric (15,0) NOT NULL,
ext_data_lno numeric (15,0) NOT NULL,
data_make_dt timestamp(0)  NOT NULL,
imp_flg char (1) DEFAULT '0' NOT NULL,
recv_dt timestamp(0)  NOT NULL,
insp_no varchar (15) NOT NULL,
insp_schd_no varchar (15) NULL,
st_act_tm timestamp(0)  NULL,
end_act_tm timestamp(0)  NULL,
act_usr_cd varchar (500) NULL,
if_act_usr_cd varchar (500) NULL,
if_act_usr_nm varchar (100) NULL,
act_dpt_cd varchar (20) NULL,
if_act_dpt_cd varchar (500) NULL,
if_act_dpt_nm varchar (100) NULL,
smpl_quality_typ varchar (1) NULL,
smpl_gd_cd varchar (2) NULL,
if_smpl_gd_cd varchar (500) NULL,
if_smpl_gd_nm varchar (100) NULL,
smpl_dfct_rsn_cd varchar (10) NULL,
if_smpl_dfct_rsn_cd varchar (500) NULL,
if_smpl_dfct_rsn_nm varchar (100) NULL,
act_cont_fctr numeric (21,8) NULL,
vld_dt_upd_flg char (1) DEFAULT '0' NOT NULL,
lmt_dt_frm timestamp(0)  NULL,
vld_dt timestamp(0)  NULL,
lmt_dt timestamp(0)  NULL,
intr_rmrks varchar (100) NULL,
lot_rmrks varchar (100) NULL,
imp_only_judg char (1) DEFAULT '0' NOT NULL,
insp_judg_rslt_typ varchar (1) NULL,
judg_dt timestamp(0)  NULL,
judg_usr_cd varchar (500) NULL,
if_judg_usr_cd varchar (500) NULL,
if_judg_usr_nm varchar (100) NULL,
judg_dpt_cd varchar (20) NULL,
if_judg_dpt_cd varchar (500) NULL,
if_judg_dpt_nm varchar (100) NULL,
judg_rsn varchar (100) NULL,
ext_insp_act_no varchar (300) NOT NULL,
stk_loc_cd varchar (20) NULL,
if_stk_loc_cd varchar (500) NULL,
if_stk_loc_nm varchar (100) NULL,
stk_str_ln_cd varchar (10) NULL,
if_stk_str_ln_cd varchar (500) NULL,
if_stk_str_ln_nm varchar (100) NULL,
ttl_quality_typ varchar (1) NULL,
ttl_gd_cd varchar (2) NULL,
if_ttl_gd_cd varchar (500) NULL,
if_ttl_gd_nm varchar (100) NULL,
ttl_dfct_rsn_cd varchar (10) NULL,
if_ttl_dfct_rsn_cd varchar (500) NULL,
if_ttl_dfct_rsn_nm varchar (100) NULL,
ttl_act_tm timestamp(0)  NULL,
base_flg char (1) DEFAULT '0' NOT NULL,
pack_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
if_pack_unit_cd varchar (500) NULL,
if_pack_unit_nm varchar (100) NULL,
ttl_pack_xfr_pack_unit_qty numeric (21,8) NULL,
ttl_pack_xfr_pack_unit_cd varchar (5) NULL,
if_ttl_pack_xfr_pack_unit_cd varchar (500) NULL,
if_ttl_pack_xfr_pack_unit_nm varchar (100) NULL,
ttl_intr_rmrks varchar (100) NULL,
ext_insp_act_d_no varchar (300) NULL,
so_qty numeric (21,8) NULL,
smpl_qty numeric (21,8) NULL,
smpl_pack_xfr_pack_unit_qty numeric (21,8) NULL,
smpl_pack_xfr_pack_unit_cd varchar (5) NULL,
if_smpl_pack_xfr_pack_unit_cd varchar (500) NULL,
if_smpl_pack_xfr_pack_unit_nm varchar (100) NULL,
smpl_act_tm timestamp(0)  NULL,
bd_dpt_cd varchar (20) NULL,
if_bd_dpt_cd varchar (500) NULL,
if_bd_dpt_nm varchar (100) NULL,
trd_rmrks varchar (100) NULL,
smpl_intr_rmrks varchar (100) NULL,
ext_insp_smpl_act_no varchar (300) NULL,
if_co_cd varchar (500) NULL,
if_co_nm varchar (100) NULL,
req_no varchar (50) NULL,
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


ALTER TABLE mst_insp_act_recv_if_all
ADD CONSTRAINT mst_insp_act_recv_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie01
ON mst_insp_act_recv_if_all USING BTREE (ext_insp_act_no, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie02
ON mst_insp_act_recv_if_all USING BTREE (ext_insp_act_d_no, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie03
ON mst_insp_act_recv_if_all USING BTREE (ext_insp_smpl_act_no, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie04
ON mst_insp_act_recv_if_all USING BTREE (st_act_tm, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie05
ON mst_insp_act_recv_if_all USING BTREE (end_act_tm, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie06
ON mst_insp_act_recv_if_all USING BTREE (insp_no, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie07
ON mst_insp_act_recv_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie08
ON mst_insp_act_recv_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie09
ON mst_insp_act_recv_if_all USING BTREE (ext_data_no, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie10
ON mst_insp_act_recv_if_all USING BTREE (ext_data_lno, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie11
ON mst_insp_act_recv_if_all USING BTREE (imp_flg, co_cd);


CREATE INDEX mst_insp_act_recv_if_all_ie12
ON mst_insp_act_recv_if_all USING BTREE (batch_log_no, co_cd);

