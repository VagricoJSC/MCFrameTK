\encoding UTF-8

CREATE TABLE mst_xfr_schd_all
(xfr_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
xfr_src_typ varchar (1) NOT NULL,
xfr_src_no varchar (15) DEFAULT '*' NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
gi_wg_cd varchar (10) NOT NULL,
gi_lg_grp_cd varchar (10) NOT NULL,
gi_loc_cd varchar (20) NULL,
gi_str_ln_cd varchar (10) NULL,
gi_stk_arrv_bp_cd varchar (20) NULL,
gr_wg_cd varchar (10) NOT NULL,
gr_lg_grp_cd varchar (10) NOT NULL,
gr_loc_cd varchar (20) NOT NULL,
gr_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
gr_stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
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
gd_cd varchar (2) NOT NULL,
quality_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
gi_rqst_tm timestamp(0)  NULL,
gr_rqst_tm timestamp(0)  NULL,
rcpt_dt timestamp(0)  NULL,
rqst_usr_cd varchar (500) NULL,
rqst_dpt_cd varchar (20) NULL,
ship_term_cd varchar (5) NULL,
ship_inst_typ varchar (1) NOT NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
ship_block_flg char (1) DEFAULT '0' NOT NULL,
ship_to_id_typ varchar (1) NULL,
ship_to_id_cd varchar (20) NULL,
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
via_dlv_typ varchar (1) NULL,
itm_ord_no varchar (15) NULL,
mfg_inst_no varchar (15) NULL,
oper_inst_no varchar (15) NULL,
inpt_schd_no varchar (15) NULL,
slo_no varchar (15) NULL,
slo_d_no varchar (15) NULL,
cont_qty numeric (21,8) NULL,
rqst_mod_flg char (1) DEFAULT '0' NOT NULL,
rqst_can_flg char (1) DEFAULT '0' NOT NULL,
not_lot_mix_flg char (1) DEFAULT '0' NOT NULL,
not_sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
vld_dt_fr timestamp(0)  NULL,
vld_dt_to timestamp(0)  NULL,
prov_typ varchar (1) NULL,
prov_basis_typ varchar (1) NULL,
xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
xrate numeric (21,8) NULL,
ptax_xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
ptax_xrate numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
tax_fix_flg char (1) DEFAULT '0' NOT NULL,
tax_cd varchar (5) NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
ret_prov_typ varchar (1) NULL,
ret_prov_basis_typ varchar (1) NULL,
ret_xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
ret_xrate numeric (21,8) NULL,
ret_ptax_xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
ret_ptax_xrate numeric (21,8) NULL,
ret_trd_cur_cd varchar (3) NULL,
ret_tax_fix_flg char (1) DEFAULT '0' NOT NULL,
ret_tax_cd varchar (5) NULL,
ret_trd_cur_upri numeric (21,8) NULL,
ret_trd_cur_amt numeric (21,8) NULL,
ret_trd_cur_tax_amt numeric (21,8) NULL,
ret_wtax_rate numeric (5,2) NULL,
ret_wtax_amt numeric (21,8) NULL,
io_schd_pr_no varchar (15) NOT NULL,
base_dlv_slip_no varchar (15) NULL,
base_prov_act_no varchar (15) NULL,
base_ac_dt timestamp(0)  NULL,
rqst_cnt_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
ship_cnt_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_xfr_schd_all
ADD CONSTRAINT mst_xfr_schd_all_pk PRIMARY KEY(xfr_schd_no,co_cd);


CREATE INDEX mst_xfr_schd_all_ie01
ON mst_xfr_schd_all USING BTREE (xfr_src_no, xfr_src_typ, co_cd);


CREATE INDEX mst_xfr_schd_all_ie02
ON mst_xfr_schd_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_xfr_schd_all_ie03
ON mst_xfr_schd_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_xfr_schd_all_ie04
ON mst_xfr_schd_all USING BTREE (gi_rqst_tm, co_cd);


CREATE INDEX mst_xfr_schd_all_ie05
ON mst_xfr_schd_all USING BTREE (gr_rqst_tm, itm_cd, itm_sub1, itm_sub2, itm_sub3, gr_loc_cd, co_cd);


CREATE INDEX mst_xfr_schd_all_ie06
ON mst_xfr_schd_all USING BTREE (itm_ord_no, co_cd);


CREATE INDEX mst_xfr_schd_all_ie07
ON mst_xfr_schd_all USING BTREE (mfg_inst_no, co_cd);


CREATE INDEX mst_xfr_schd_all_ie08
ON mst_xfr_schd_all USING BTREE (oper_inst_no, co_cd);


CREATE INDEX mst_xfr_schd_all_ie09
ON mst_xfr_schd_all USING BTREE (inpt_schd_no, co_cd);


CREATE INDEX mst_xfr_schd_all_ie10
ON mst_xfr_schd_all USING BTREE (slo_no, co_cd);


CREATE INDEX mst_xfr_schd_all_ie11
ON mst_xfr_schd_all USING BTREE (slo_d_no, co_cd);


CREATE INDEX mst_xfr_schd_all_ie12
ON mst_xfr_schd_all USING BTREE (io_schd_pr_no, co_cd);

