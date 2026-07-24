\encoding UTF-8

CREATE TABLE mst_rcpt_iv_d_all
(rcpt_iv_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
rcpt_iv_mng_no varchar (15) NOT NULL,
rcpt_iv_rev numeric (4,0) NOT NULL,
po_no varchar (15) NULL,
po_d_no varchar (15) NULL,
purc_schd_no varchar (15) NULL,
bndl_flg char (1) DEFAULT '0' NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
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
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_proc_upri numeric (21,8) NULL,
trd_cur_onr_prov_upri numeric (21,8) NULL,
upri_not_tgt_flg char (1) DEFAULT '0' NOT NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
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
manual_add_flg char (1) DEFAULT '0' NOT NULL,
purc_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
purc_usr_cd varchar (500) NULL,
slo_no varchar (15) NULL,
slo_d_no varchar (15) NULL,
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
intr_d_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
rcpt_iv_d_rmrks varchar (100) NULL,
ref_prms_rcpt_d_no varchar (15) NULL,
ref_dlv_inst_d_no varchar (15) NULL,
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


ALTER TABLE mst_rcpt_iv_d_all
ADD CONSTRAINT mst_rcpt_iv_d_all_pk PRIMARY KEY(rcpt_iv_d_no,co_cd);


CREATE INDEX mst_rcpt_iv_d_all_ie01
ON mst_rcpt_iv_d_all USING BTREE (rcpt_iv_mng_no,co_cd);


CREATE INDEX mst_rcpt_iv_d_all_ie02
ON mst_rcpt_iv_d_all USING BTREE (po_no,co_cd);


CREATE INDEX mst_rcpt_iv_d_all_ie03
ON mst_rcpt_iv_d_all USING BTREE (po_d_no,co_cd);

