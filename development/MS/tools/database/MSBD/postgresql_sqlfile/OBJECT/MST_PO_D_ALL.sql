\encoding UTF-8

CREATE TABLE mst_po_d_all
(po_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
po_no varchar (15) NOT NULL,
po_rev numeric (4,0) NOT NULL,
po_schd_no varchar (15) NULL,
disp_seq numeric (5,0) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
purc_rsn_cd varchar (10) NULL,
purc_id_typ varchar (1) NOT NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
ap_dpt_cd varchar (20) NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
bp_lot_no varchar (15) NULL,
in_to_loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
dlv_cd varchar (20) NULL,
dlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
dlv_nm varchar (100) NULL,
dlv_cntct_dpt varchar (100) NULL,
dlv_cntct_psn varchar (100) NULL,
dlv_zip_cd varchar (10) NULL,
dlv_addr1 varchar (250) NULL,
dlv_addr2 varchar (250) NULL,
dlv_addr3 varchar (250) NULL,
dlv_addr4 varchar (250) NULL,
dlv_tel varchar (30) NULL,
dlv_fax varchar (30) NULL,
tdlv_cd varchar (20) NULL,
tdlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
tdlv_nm varchar (100) NULL,
tdlv_cntct_dpt varchar (100) NULL,
tdlv_cntct_psn varchar (100) NULL,
tdlv_zip_cd varchar (10) NULL,
tdlv_addr1 varchar (250) NULL,
tdlv_addr2 varchar (250) NULL,
tdlv_addr3 varchar (250) NULL,
tdlv_addr4 varchar (250) NULL,
tdlv_tel varchar (30) NULL,
tdlv_fax varchar (30) NULL,
dlv_rqst_tm timestamp(0)  NOT NULL,
purc_lt numeric (9,0) NULL,
rqst_dlv_rqst_tm timestamp(0)  NOT NULL,
rqst_avl_rqst_dt timestamp(0)  NOT NULL,
purc_schd_dt timestamp(0)  NULL,
purc_basis_typ varchar (1) NULL,
sync_flg char (1) DEFAULT '0' NOT NULL,
purc_upri_req_typ varchar (1) NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
upri_not_tgt_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_proc_upri numeric (21,8) NULL,
trd_cur_onr_prov_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_proc_amt numeric (21,8) NULL,
trd_cur_onr_prov_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
dscnt_rsn_cd varchar (10) NULL,
tax_fix_flg char (1) DEFAULT '0' NOT NULL,
tax_cd varchar (5) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
drct_dlv_typ varchar (1) NOT NULL,
mfg_loc_cd varchar (20) NULL,
bom_ptn varchar (40) DEFAULT '*' NOT NULL,
bndl_flg char (1) DEFAULT '0' NOT NULL,
rqst_slo_flg char (1) DEFAULT '0' NOT NULL,
outsrc_itm_ord_no varchar (15) NULL,
outsrc_flg char (1) DEFAULT '0' NOT NULL,
uplnd_flg char (1) DEFAULT '0' NOT NULL,
schd_chg_flg char (1) DEFAULT '0' NOT NULL,
po_conf_rcpt_flg char (1) DEFAULT '0' NOT NULL,
po_conf_rcpt_dt timestamp(0)  NULL,
pri_print_flg char (1) DEFAULT '0' NOT NULL,
dlv_slip_invalid_flg char (1) DEFAULT '0' NOT NULL,
pay_crryovr_times numeric (2,0) NULL,
slo_no varchar (15) NULL,
slo_d_no varchar (15) NULL,
io_schd_pr_no varchar (15) NOT NULL,
bd_itm_cd varchar (40) NULL,
bd_itm_sub1 varchar (5) NULL,
bd_itm_sub2 varchar (5) NULL,
bd_itm_sub3 varchar (5) NULL,
bd_sno1 varchar (15) NULL,
bd_sno2 varchar (15) NULL,
bd_sno3 varchar (15) NULL,
bd_sno4 varchar (15) NULL,
bd_loc_cd varchar (20) NULL,
bd_lot_no varchar (15) NULL,
bd_sublot_no varchar (15) NULL,
bd_dpt_cd varchar (20) NULL,
bd_wg_cd varchar (10) NULL,
bd_ctg_cd varchar (20) NULL,
bd_oper_cd varchar (10) NULL,
bd_slo_no varchar (15) NULL,
bd_iv_no varchar (15) NULL,
bd_po_no varchar (15) NULL,
bd_bp_cd varchar (20) NULL,
ext_po_d_no varchar (300) NULL,
intr_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
po_print_d_rmrks varchar (100) NULL,
dlv_slip_d_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
rqst_can_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
edi_sub_d_char1 varchar (50) NULL,
edi_sub_d_char2 varchar (50) NULL,
edi_sub_d_char3 varchar (50) NULL,
edi_sub_d_char4 varchar (50) NULL,
edi_sub_d_char5 varchar (50) NULL,
edi_sub_d_num1 numeric (21,8) NULL,
edi_sub_d_dt1 timestamp(0)  NULL,
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


ALTER TABLE mst_po_d_all
ADD CONSTRAINT mst_po_d_all_pk PRIMARY KEY(po_d_no,co_cd);


CREATE INDEX mst_po_d_all_ie01
ON mst_po_d_all USING BTREE (po_no,po_rev,co_cd);


CREATE INDEX mst_po_d_all_ie02
ON mst_po_d_all USING BTREE (po_schd_no,co_cd);


CREATE INDEX mst_po_d_all_ie03
ON mst_po_d_all USING BTREE (outsrc_itm_ord_no,co_cd);


CREATE INDEX mst_po_d_all_ie04
ON mst_po_d_all USING BTREE (slo_d_no,co_cd);


CREATE INDEX mst_po_d_all_ie05
ON mst_po_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_po_d_all_ie06
ON mst_po_d_all USING BTREE (in_to_loc_cd,str_ln_cd,co_cd);


CREATE INDEX mst_po_d_all_ie07
ON mst_po_d_all USING BTREE (ext_po_d_no,co_cd);

