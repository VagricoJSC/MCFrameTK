\encoding UTF-8

CREATE TABLE mst_po_schd_all
(po_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
po_schd_src_typ varchar (1) NULL,
po_schd_src_no varchar (15) NULL,
io_schd_pr_no varchar (15) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
ver_no varchar (10) NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
purc_rsn_cd varchar (10) NULL,
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
reg_dt timestamp(0)  NOT NULL,
rqst_wg_cd varchar (10) NOT NULL,
rqst_fr_dpt_cd varchar (20) NULL,
rqst_fr_usr_cd varchar (500) NULL,
purc_usr_cd varchar (500) NULL,
purc_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NOT NULL,
sppl_cd varchar (20) NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
outsrc_flg char (1) DEFAULT '0' NOT NULL,
outsrc_itm_ord_crt_flg char (1) DEFAULT '0' NOT NULL,
outsrc_itm_ord_no varchar (15) NULL,
pln_itm_ord_no varchar (15) NULL,
mfg_loc_cd varchar (20) NULL,
bom_ptn varchar (40) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
purc_upri_req_typ varchar (1) NULL,
trd_cur_cd varchar (3) NULL,
tax_cd varchar (5) NULL,
xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
xrate numeric (21,8) NULL,
ptax_xrate numeric (21,8) NULL,
ptax_xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
upri_not_tgt_flg char (1) DEFAULT '0' NOT NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_proc_upri numeric (21,8) NULL,
trd_cur_onr_prov_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_proc_amt numeric (21,8) NULL,
trd_cur_onr_prov_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
po_schd_dt timestamp(0)  NOT NULL,
dlv_rqst_tm timestamp(0)  NOT NULL,
rqst_dlv_rqst_tm timestamp(0)  NOT NULL,
rqst_avl_rqst_dt timestamp(0)  NOT NULL,
purc_schd_dt timestamp(0)  NULL,
purc_lt numeric (9,0) NULL,
drct_dlv_typ varchar (1) NOT NULL,
po_schd_chg_typ varchar (1) NULL,
rqst_upd_stop_flg char (1) DEFAULT '0' NOT NULL,
rqst_crrct_flg char (1) DEFAULT '0' NOT NULL,
split_src_schd_no varchar (15) NULL,
bd_itm_cd varchar (40) NULL,
bd_itm_sub1 varchar (5) NULL,
bd_itm_sub2 varchar (5) NULL,
bd_itm_sub3 varchar (5) NULL,
bd_sno1 varchar (15) NULL,
bd_sno2 varchar (15) NULL,
bd_sno3 varchar (15) NULL,
bd_sno4 varchar (15) NULL,
bd_lot_no varchar (15) NULL,
bd_sublot_no varchar (15) NULL,
bd_loc_cd varchar (20) NULL,
bd_dpt_cd varchar (20) NULL,
bd_wg_cd varchar (10) NULL,
bd_ctg_cd varchar (20) NULL,
bd_oper_cd varchar (10) NULL,
bd_slo_no varchar (15) NULL,
bd_iv_no varchar (15) NULL,
bd_po_no varchar (15) NULL,
bd_bp_cd varchar (20) NULL,
org_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
add_flg char (1) DEFAULT '0' NOT NULL,
base_unit_po_qty numeric (21,8) NOT NULL,
po_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
po_cnt_rmrks varchar (100) NULL,
slo_no varchar (15) NULL,
slo_d_no varchar (15) NULL,
po_no varchar (15) NULL,
po_d_no varchar (15) NULL,
rqst_can_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_po_schd_all
ADD CONSTRAINT mst_po_schd_all_pk PRIMARY KEY(po_schd_no,co_cd);


CREATE INDEX mst_po_schd_all_ie01
ON mst_po_schd_all USING BTREE (po_schd_src_no,co_cd);


CREATE INDEX mst_po_schd_all_ie02
ON mst_po_schd_all USING BTREE (io_schd_pr_no,co_cd);


CREATE INDEX mst_po_schd_all_ie03
ON mst_po_schd_all USING BTREE (outsrc_itm_ord_no,co_cd);


CREATE INDEX mst_po_schd_all_ie04
ON mst_po_schd_all USING BTREE (pln_itm_ord_no,co_cd);


CREATE INDEX mst_po_schd_all_ie05
ON mst_po_schd_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_po_schd_all_ie06
ON mst_po_schd_all USING BTREE (sppl_cd,co_cd);


CREATE INDEX mst_po_schd_all_ie07
ON mst_po_schd_all USING BTREE (in_to_loc_cd,str_ln_cd,co_cd);


CREATE INDEX mst_po_schd_all_ie08
ON mst_po_schd_all USING BTREE (slo_d_no,co_cd);


CREATE INDEX mst_po_schd_all_ie09
ON mst_po_schd_all USING BTREE (po_d_no,co_cd);


CREATE INDEX mst_po_schd_all_ie10
ON mst_po_schd_all USING BTREE (po_schd_dt,co_cd);

