\encoding UTF-8

CREATE TABLE mst_xfr_alloc_sts_sv_all
(xfr_alloc_sts_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
pr_sts_typ varchar (4) NOT NULL,
xfr_schd_no varchar (15) NOT NULL,
xfr_inst_d_no varchar (15) DEFAULT '*' NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
wg_cd varchar (10) NOT NULL,
lg_grp_cd varchar (10) NOT NULL,
gi_loc_cd varchar (20) NULL,
gi_str_ln_cd varchar (10) NULL,
gi_stk_arrv_bp_cd varchar (20) NULL,
gr_loc_cd varchar (20) NOT NULL,
gr_str_ln_cd varchar (10) NOT NULL,
gr_stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
ver_no varchar (10) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno1_null_flg char (1) DEFAULT '0' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno2_null_flg char (1) DEFAULT '0' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno3_null_flg char (1) DEFAULT '0' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sno4_null_flg char (1) DEFAULT '0' NOT NULL,
alloc_sno1 varchar (15) DEFAULT '*' NOT NULL,
alloc_sno2 varchar (15) DEFAULT '*' NOT NULL,
alloc_sno3 varchar (15) DEFAULT '*' NOT NULL,
alloc_sno4 varchar (15) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NOT NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
act_qty numeric (21,8) NOT NULL,
xfr_schd_dt timestamp(0)  NOT NULL,
ship_inst_typ varchar (1) NOT NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
inst_bndl_flg char (1) DEFAULT '0' NOT NULL,
fix_flg char (1) DEFAULT '0' NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
cmpl_flg char (1) DEFAULT '0' NOT NULL,
alloc_flg char (1) DEFAULT '0' NOT NULL,
not_lot_mix_flg char (1) DEFAULT '0' NOT NULL,
not_sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
vld_dt_fr timestamp(0)  NULL,
vld_dt_to timestamp(0)  NULL,
prov_typ varchar (1) NULL,
prov_basis_typ varchar (1) NULL,
ret_prov_typ varchar (1) NULL,
ret_prov_basis_typ varchar (1) NULL,
io_schd_pr_no varchar (15) NOT NULL,
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


ALTER TABLE mst_xfr_alloc_sts_sv_all
ADD CONSTRAINT mst_xfr_alloc_sts_sv_all_pk PRIMARY KEY(xfr_alloc_sts_no,co_cd);


CREATE INDEX mst_xfr_alloc_sts_sv_all_ie01
ON mst_xfr_alloc_sts_sv_all USING BTREE (xfr_schd_no, xfr_inst_d_no, co_cd);


CREATE INDEX mst_xfr_alloc_sts_sv_all_ie02
ON mst_xfr_alloc_sts_sv_all USING BTREE (xfr_inst_d_no, xfr_schd_no, co_cd);

