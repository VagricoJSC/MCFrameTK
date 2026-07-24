\encoding UTF-8

CREATE TABLE mst_ship_schd_all
(ship_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
pr_sts_typ varchar (4) NOT NULL,
ship_pr_no varchar (15) NOT NULL,
ship_inst_d_no varchar (15) NULL,
dlv_inst_rcpt_no varchar (15) NULL,
slo_prms_no varchar (15) NULL,
sls_act_d_no varchar (15) NULL,
ship_fr_lg_grp_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
pd_inst_dlv_tm timestamp(0)  NULL,
ship_rqst_tm timestamp(0)  NULL,
ship_schd_tm timestamp(0)  NULL,
dlv_schd_tm timestamp(0)  NULL,
ship_term_cd varchar (5) NULL,
ship_wk_cd varchar (5) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno1_null_flg char (1) DEFAULT '0' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno2_null_flg char (1) DEFAULT '0' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno3_null_flg char (1) DEFAULT '0' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sno4_null_flg char (1) DEFAULT '0' NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
ver_no varchar (10) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
alloc_qty numeric (21,8) NOT NULL,
wait_qty numeric (21,8) NOT NULL,
ship_inst_qty numeric (21,8) NOT NULL,
ship_act_qty numeric (21,8) NOT NULL,
iv_schd_qty numeric (21,8) NOT NULL,
iv_act_qty numeric (21,8) NOT NULL,
sls_qty numeric (21,8) NOT NULL,
dlv_qty numeric (21,8) NOT NULL,
ship_ret_qty numeric (21,8) NOT NULL,
abort_qty numeric (21,8) NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
not_dt_calc_flg char (1) DEFAULT '0' NOT NULL,
fix_flg char (1) DEFAULT '0' NOT NULL,
cmpl_flg char (1) DEFAULT '0' NOT NULL,
alloc_prio varchar (15) NOT NULL,
ship_abl_flg char (1) DEFAULT '0' NOT NULL,
ship_lot_chk_tar_flg char (1) DEFAULT '0' NOT NULL,
ship_block_flg char (1) DEFAULT '0' NOT NULL,
inst_bndl_flg char (1) DEFAULT '0' NOT NULL,
not_lot_mix_flg char (1) DEFAULT '0' NOT NULL,
not_sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
vld_dt_fr timestamp(0)  NULL,
vld_dt_to timestamp(0)  NULL,
ship_skip_flg char (1) DEFAULT '0' NOT NULL,
re_ship_schd_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
trd_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
ship_cnt_rmrks varchar (100) NULL,
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
dlv_lg_grp_cd varchar (10) NULL,
pri_prnt_flg char (1) DEFAULT '0' NOT NULL,
tdlv_cd varchar (20) NULL,
tdlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
tdlv_nm varchar (100) NULL,
via_dlv_typ varchar (1) NULL,
tdlv_cntct_dpt varchar (100) NULL,
tdlv_cntct_psn varchar (100) NULL,
tdlv_zip_cd varchar (10) NULL,
tdlv_addr1 varchar (250) NULL,
tdlv_addr2 varchar (250) NULL,
tdlv_addr3 varchar (250) NULL,
tdlv_addr4 varchar (250) NULL,
tdlv_tel varchar (30) NULL,
tdlv_fax varchar (30) NULL,
tdlv_lg_grp_cd varchar (10) NULL,
dlv_day_week_typ varchar (1) NULL,
base_dlv_slip_no varchar (15) NULL,
base_prov_act_no varchar (15) NULL,
base_ac_dt timestamp(0)  NULL,
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


ALTER TABLE mst_ship_schd_all
ADD CONSTRAINT mst_ship_schd_all_pk PRIMARY KEY(ship_schd_no,co_cd);


CREATE INDEX mst_ship_schd_all_ie01
ON mst_ship_schd_all USING BTREE (ship_pr_no, co_cd);


CREATE INDEX mst_ship_schd_all_ie02
ON mst_ship_schd_all USING BTREE (ship_inst_d_no, co_cd);


CREATE INDEX mst_ship_schd_all_ie03
ON mst_ship_schd_all USING BTREE (dlv_inst_rcpt_no, co_cd);


CREATE INDEX mst_ship_schd_all_ie04
ON mst_ship_schd_all USING BTREE (slo_prms_no, co_cd);


CREATE INDEX mst_ship_schd_all_ie05
ON mst_ship_schd_all USING BTREE (ship_fr_lg_grp_cd, co_cd);


CREATE INDEX mst_ship_schd_all_ie06
ON mst_ship_schd_all USING BTREE (ship_schd_tm, co_cd);


CREATE INDEX mst_ship_schd_all_ie07
ON mst_ship_schd_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_ship_schd_all_ie08
ON mst_ship_schd_all USING BTREE (lot_no, co_cd);

