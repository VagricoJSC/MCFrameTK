\encoding UTF-8

CREATE TABLE mst_wg_rqst_all
(wg_rqst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
last_wg_rqst_no varchar (15) NULL,
wg_rqst_typ varchar (1) NOT NULL,
wg_rqst_src_typ varchar (1) NOT NULL,
wg_rqst_src_no varchar (15) NOT NULL,
wg_rqst_sts_typ varchar (1) NOT NULL,
rqst_dt timestamp(0)  NOT NULL,
prms_ntc_flg char (1) DEFAULT '0' NOT NULL,
prms_dt timestamp(0)  NULL,
re_prms_ntc_flg char (1) DEFAULT '0' NOT NULL,
re_prms_dt timestamp(0)  NULL,
prms_uncn_flg char (1) DEFAULT '0' NOT NULL,
re_rqst_flg char (1) DEFAULT '0' NOT NULL,
re_rqst_dt timestamp(0)  NULL,
man_prms_flg char (1) DEFAULT '0' NOT NULL,
rqst_crrct_flg char (1) DEFAULT '0' NOT NULL,
dlv_inst_rcpt_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
rqst_fr_wg_cd varchar (10) NOT NULL,
rqst_fr_dpt_cd varchar (20) NULL,
rqst_fr_usr_cd varchar (500) NULL,
gr_loc_wg_cd varchar (10) NULL,
gr_lg_grp_cd varchar (10) NULL,
gr_loc_cd varchar (20) NULL,
gr_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
gr_rqst_tm timestamp(0)  NOT NULL,
rqst_to_wg_cd varchar (10) NOT NULL,
gi_loc_wg_cd varchar (10) NULL,
gi_lg_grp_cd varchar (10) NULL,
gi_loc_cd varchar (20) DEFAULT '*' NOT NULL,
gi_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
gi_rqst_tm timestamp(0)  NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno1_null_flg char (1) DEFAULT '0' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno2_null_flg char (1) DEFAULT '0' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno3_null_flg char (1) DEFAULT '0' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sno4_null_flg char (1) DEFAULT '0' NOT NULL,
ver_no varchar (10) NULL,
gd_cd varchar (2) NULL,
vld_dt_fr timestamp(0)  NULL,
vld_dt_to timestamp(0)  NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
not_cmpl_qty numeric (21,8) NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
io_schd_pr_no varchar (15) NULL,
slo_no varchar (15) NULL,
slo_d_no varchar (15) NULL,
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
itm_ord_no varchar (15) NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
bom_ptn varchar (40) DEFAULT '*' NOT NULL,
purc_rsn_cd varchar (10) NULL,
xpns_po_flg char (1) DEFAULT '0' NOT NULL,
trd_cd varchar (4) NULL,
trd_ptn_typ varchar (4) NULL,
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
bd_ctg_cd varchar (20) NULL,
bd_oper_cd varchar (10) NULL,
bd_slo_no varchar (15) NULL,
bd_iv_no varchar (15) NULL,
bd_po_no varchar (15) NULL,
rqst_crrct_dt timestamp(0)  NULL,
rqst_can_dt timestamp(0)  NULL,
prms_can_dt timestamp(0)  NULL,
inst_dt timestamp(0)  NULL,
inst_can_dt timestamp(0)  NULL,
act_dt timestamp(0)  NULL,
act_can_dt timestamp(0)  NULL,
wg_rqst_cnt_rmrks varchar (100) NULL,
wg_re_rqst_cnt_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
comp_cng_flg char (1) DEFAULT '0' NOT NULL,
spec_cng_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_wg_rqst_all
ADD CONSTRAINT mst_wg_rqst_all_pk PRIMARY KEY(wg_rqst_no,co_cd);


CREATE INDEX mst_wg_rqst_all_ie01
ON mst_wg_rqst_all USING BTREE (wg_rqst_src_no,co_cd);


CREATE INDEX mst_wg_rqst_all_ie02
ON mst_wg_rqst_all USING BTREE (wg_rqst_src_typ,wg_rqst_src_no,co_cd);


CREATE INDEX mst_wg_rqst_all_ie03
ON mst_wg_rqst_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_wg_rqst_all_ie04
ON mst_wg_rqst_all USING BTREE (rqst_fr_wg_cd,co_cd);


CREATE INDEX mst_wg_rqst_all_ie05
ON mst_wg_rqst_all USING BTREE (rqst_to_wg_cd,co_cd);


CREATE INDEX mst_wg_rqst_all_ie06
ON mst_wg_rqst_all USING BTREE (slo_no,co_cd);


CREATE INDEX mst_wg_rqst_all_ie07
ON mst_wg_rqst_all USING BTREE (slo_d_no,co_cd);

