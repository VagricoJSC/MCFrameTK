\encoding UTF-8

CREATE TABLE mst_slo_all
(slo_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
slo_rev numeric (4,0) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
slo_dt timestamp(0)  NOT NULL,
slo_typ varchar (1) NOT NULL,
cst_cd varchar (20) NOT NULL,
cst_po_no varchar (20) NULL,
cst_po_rev numeric (4,0) NULL,
trd_cur_cd varchar (3) NULL,
xrate_inpt_flg char (1) NOT NULL,
xrate numeric (21,8) NULL,
ptax_xrate_inpt_flg char (1) NOT NULL,
ptax_xrate numeric (21,8) NULL,
sls_usr_cd varchar (500) NULL,
sls_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
iv_no varchar (15) NULL,
tterm_cd1 varchar (5) NULL,
tterm_rmrks1 varchar (100) NULL,
tterm_cd2 varchar (5) NULL,
tterm_rmrks2 varchar (100) NULL,
tterm_cd3 varchar (5) NULL,
tterm_rmrks3 varchar (100) NULL,
trnspt_cd varchar (5) NULL,
vssl_flght varchar (40) NULL,
load_port_cd varchar (5) NULL,
etd_dt timestamp(0)  NULL,
dschrg_port_cd varchar (5) NULL,
eta_dt timestamp(0)  NULL,
via_port_cd varchar (5) NULL,
via_schd_dt timestamp(0)  NULL,
assort_typ varchar (1) NOT NULL,
sls_basis_typ varchar (1) NULL,
ar_dpt_cd varchar (20) NULL,
wrk_no varchar (15) NULL,
rcpt_dt timestamp(0)  NULL,
rcpt_usr_cd varchar (500) NULL,
trd_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
cst_po_rmrks varchar (100) NULL,
qtn_no varchar (15) NULL,
qtn_rev numeric (4,0) NULL,
adv_ship_ctrl_typ varchar (1) NULL,
adv_bill_amt numeric (21,8) NULL,
adv_rcv_amt numeric (21,8) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
aprv_flg char (1) DEFAULT '0' NOT NULL,
aprv_no varchar (15) NULL,
aprv_sts_typ varchar (1) NULL,
edi_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
can_rsn_cd varchar (10) NULL,
can_rmrks varchar (100) NULL,
cred_upd_amt numeric (21,8) NULL,
edi_sub_char1 varchar (50) NULL,
edi_sub_char2 varchar (50) NULL,
edi_sub_char3 varchar (50) NULL,
edi_sub_char4 varchar (50) NULL,
edi_sub_char5 varchar (50) NULL,
edi_sub_num1 numeric (21,8) NULL,
edi_sub_dt1 timestamp(0)  NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL,
sls_dt timestamp(0)  NULL,
slo_aprv_dt timestamp(0)  NULL,
aprv_dt timestamp(0)  NULL,
ship_prnt_no_cst_nm_flg char (1) DEFAULT '0' NOT NULL,
src_wrk_no varchar (15) NULL,
zoho_sls_schd_no varchar (15) NULL,
slo_last_sls_flg char (1) DEFAULT '0' NOT NULL,
prod_itm_cd varchar (40) NULL,
prod_itm_sub1 varchar (5) NULL,
prod_itm_sub2 varchar (5) NULL,
prod_itm_sub3 varchar (5) NULL,
prod_itm_nm varchar (100) NULL,
surv_line_qty varchar (2) NULL,
diameter varchar (4) NULL,
match_key varchar (30) NULL,
rcpt_no varchar (16) NULL,
appl_doc_no varchar (50) NULL,
dlv_draw_no varchar (12) NULL,
slo_num_typ varchar (1) NULL,
slo_num varchar (16) NULL,
hdr_qty numeric (21,8) NULL,
hdr_amt numeric (21,8) NULL,
paint_clr varchar (15) NULL,
sales_cond varchar (1) NULL,
ship_sp_instr_typ varchar (1) NULL,
spec_dlv_note_typ varchar (1) NULL,
ord_dlv_dt timestamp(0)  NULL,
mrkt_cd varchar (2) NULL,
cntry_sign varchar (3) NULL,
ves_natl varchar (3) NULL,
shipyard_cd varchar (4) NULL,
ves_no varchar (30) NULL,
ves_nm varchar (100) NULL,
tonnage varchar (20) NULL,
ves_typ varchar (30) NULL,
insp_std varchar (10) NULL,
royalty_trg_amt numeric (21,8) NULL,
royalty_psppl varchar (20) NULL,
ins_loc_1 varchar (100) NULL,
ins_loc_2 varchar (100) NULL,
sfi_no varchar (15) NULL,
ps_sal_aft_dt timestamp(0)  NULL,
wit_insp_typ varchar (1) NULL,
equip_typ varchar (1) NULL,
spec_doc_typ varchar (1) NULL,
model_jp_en_typ varchar (1) NULL,
insp_rep_typ varchar (1) NULL,
insp_rep_qty numeric (3) NULL,
cons_draw_typ varchar (1) NULL,
cons_draw_qty numeric (3) NULL,
const_draw_typ varchar (1) NULL,
const_draw_qty numeric (3) NULL,
comp_draw_typ varchar (1) NULL,
comp_draw_qty numeric (3) NULL,
inst_manual_typ varchar (1) NULL,
inst_manual_qty numeric (3) NULL,
aprv_draw_typ varchar (1) NULL,
aprv_draw_qty numeric (3) NULL,
slo_cng_rsn varchar (100) NULL,
frc_rsn_cd varchar (10) NULL,
main_draw_no varchar (50) NULL,
slo_cmnt_1 varchar (100) NULL,
slo_cmnt_2 varchar (100) NULL,
slo_cmnt_3 varchar (100) NULL,
slo_cmnt_4 varchar (100) NULL,
slo_cmnt_5 varchar (100) NULL,
src_ship_flg char (1) DEFAULT '0' NOT NULL,
jip_slo_typ varchar (1) NULL,
jip_cst_cd varchar (3) NULL
);


ALTER TABLE mst_slo_all
ADD CONSTRAINT mst_slo_all_pk PRIMARY KEY(slo_no,co_cd);


CREATE INDEX mst_slo_all_ie01
ON mst_slo_all USING BTREE (slo_dt, co_cd);


CREATE INDEX mst_slo_all_ie02
ON mst_slo_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_slo_all_ie03
ON mst_slo_all USING BTREE (cst_po_no, co_cd);


CREATE INDEX mst_slo_all_ie04
ON mst_slo_all USING BTREE (sls_usr_cd, co_cd);


CREATE INDEX mst_slo_all_ie05
ON mst_slo_all USING BTREE (sls_dpt_cd, co_cd);


CREATE INDEX mst_slo_all_ie06
ON mst_slo_all USING BTREE (wrk_no, co_cd);


CREATE INDEX mst_slo_all_ie07
ON mst_slo_all USING BTREE (rcpt_dt, co_cd);

