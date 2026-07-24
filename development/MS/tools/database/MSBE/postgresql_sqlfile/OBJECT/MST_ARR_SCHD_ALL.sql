\encoding UTF-8

CREATE TABLE mst_arr_schd_all
(arr_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
arr_pr_no varchar (15) NOT NULL,
prms_rcpt_d_no varchar (15) NULL,
dlv_inst_d_no varchar (15) NULL,
purc_act_d_no varchar (15) NULL,
rcpt_iv_no varchar (15) NULL,
rcpt_iv_mng_no varchar (15) NULL,
pr_sts_typ varchar (4) NOT NULL,
wg_cd varchar (10) NOT NULL,
dlv_slip_no varchar (15) NULL,
dlv_slip_mng_no varchar (15) NULL,
dlv_slip_mng_seq numeric (4,0) NULL,
dlv_slip_mng_d_no varchar (15) NULL,
dlv_slip_mng_d_seq numeric (4,0) NULL,
iv_no varchar (15) NULL,
arr_ptn_typ varchar (1) NOT NULL,
arr_schd_tm timestamp(0)  NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
rcpt_iv_itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
purc_id_typ varchar (1) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
ver_no varchar (10) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
ret_loc_cd varchar (20) NULL,
ret_str_ln_cd varchar (10) NULL,
ret_gd_cd varchar (2) NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
maker_cd varchar (20) NULL,
bp_lot_no varchar (15) NULL,
lg_grp_cd varchar (10) NOT NULL,
arr_loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
arr_qty numeric (21,8) NOT NULL,
purc_qty numeric (21,8) NOT NULL,
sls_ret_qty numeric (21,8) NOT NULL,
abort_qty numeric (21,8) NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
sls_ret_schd_abort_qty numeric (21,8) NOT NULL,
sls_ret_schd_abort_flg char (1) DEFAULT '0' NOT NULL,
sync_flg char (1) DEFAULT '0' NOT NULL,
cmpl_flg char (1) DEFAULT '0' NOT NULL,
sls_ret_schd_cmpl_flg char (1) DEFAULT '0' NOT NULL,
arr_split_flg char (1) DEFAULT '0' NOT NULL,
arr_skip_flg char (1) DEFAULT '0' NOT NULL,
re_arr_schd_flg char (1) DEFAULT '0' NOT NULL,
outsrc_flg char (1) DEFAULT '0' NOT NULL,
mfg_inst_no varchar (15) NULL,
pre_outsrc_act_flg char (1) DEFAULT '0' NOT NULL,
pre_mfg_act_no varchar (15) NULL,
wms_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
trd_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
arr_cnt_rmrks varchar (100) NULL,
dlv_slip_d_rmrks varchar (100) NULL,
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


ALTER TABLE mst_arr_schd_all
ADD CONSTRAINT mst_arr_schd_all_pk PRIMARY KEY(arr_schd_no,co_cd);


CREATE INDEX mst_arr_schd_all_ie01
ON mst_arr_schd_all USING BTREE (arr_pr_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie02
ON mst_arr_schd_all USING BTREE (prms_rcpt_d_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie03
ON mst_arr_schd_all USING BTREE (dlv_inst_d_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie04
ON mst_arr_schd_all USING BTREE (purc_act_d_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie05
ON mst_arr_schd_all USING BTREE (rcpt_iv_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie06
ON mst_arr_schd_all USING BTREE (rcpt_iv_mng_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie07
ON mst_arr_schd_all USING BTREE (dlv_slip_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie08
ON mst_arr_schd_all USING BTREE (iv_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie09
ON mst_arr_schd_all USING BTREE (arr_schd_tm, co_cd);


CREATE INDEX mst_arr_schd_all_ie10
ON mst_arr_schd_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_arr_schd_all_ie11
ON mst_arr_schd_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie12
ON mst_arr_schd_all USING BTREE (mfg_inst_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie13
ON mst_arr_schd_all USING BTREE (pre_mfg_act_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie14
ON mst_arr_schd_all USING BTREE (io_schd_pr_no, co_cd);


CREATE INDEX mst_arr_schd_all_ie15
ON mst_arr_schd_all USING BTREE (dlv_slip_mng_no,dlv_slip_mng_seq,co_cd);


CREATE INDEX mst_arr_schd_all_ie16
ON mst_arr_schd_all USING BTREE (dlv_slip_mng_d_no,dlv_slip_mng_d_seq,co_cd);


CREATE INDEX mst_arr_schd_all_ie17
ON mst_arr_schd_all USING BTREE (pr_sts_typ,co_cd);

