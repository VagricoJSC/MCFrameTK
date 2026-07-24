\encoding UTF-8

CREATE TABLE mst_ship_act_d_all
(ship_act_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
ship_act_no varchar (15) NOT NULL,
disp_seq numeric (5,0) NOT NULL,
ship_alloc_sts_no varchar (15) NULL,
dlv_slip_no varchar (15) NOT NULL,
dlv_slip_seq numeric (4,0) NOT NULL,
dlv_slip_d_no varchar (15) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
ship_loc_cd varchar (20) NULL,
ship_str_ln_cd varchar (10) NULL,
dlv_id_typ varchar (1) NULL,
dlv_id_cd varchar (20) NULL,
dlv_id_nm varchar (100) NULL,
dlv_str_ln_cd varchar (10) NULL,
dlv_zip_cd varchar (10) NULL,
dlv_addr1 varchar (250) NULL,
dlv_addr2 varchar (250) NULL,
dlv_addr3 varchar (250) NULL,
dlv_addr4 varchar (250) NULL,
dlv_cntct_dpt varchar (100) NULL,
dlv_cntct_psn varchar (100) NULL,
dlv_tel varchar (30) NULL,
dlv_fax varchar (30) NULL,
dlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
pri_prnt_flg char (1) DEFAULT '0' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
stk_mng_typ varchar (1) NOT NULL,
sno1_mng_typ varchar (1) NOT NULL,
sno2_mng_typ varchar (1) NOT NULL,
sno3_mng_typ varchar (1) NOT NULL,
sno4_mng_typ varchar (1) NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
dlv_qty numeric (21,8) NOT NULL,
ship_ret_qty numeric (21,8) NOT NULL,
skip_chk_ship_flg char (1) DEFAULT '0' NOT NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
bd_wg_cd varchar (10) NULL,
cst_po_no varchar (20) NULL,
cst_po_d_no varchar (20) NULL,
cst_dlv_inst_no varchar (20) NULL,
cst_dlv_inst_d_no varchar (20) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
ship_ret_flg char (1) DEFAULT '0' NOT NULL,
wms_flg char (1) DEFAULT '0' NOT NULL,
ext_sys_cd varchar (10) NULL,
ext_ship_act_no varchar (300) NULL,
base_dlv_slip_no varchar (15) NULL,
base_prov_act_no varchar (15) NULL,
base_ac_dt timestamp(0)  NULL,
trd_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
arr_cnt_rmrks varchar (100) NULL,
intr_d_rmrks varchar (100) NULL,
io_schd_pr_no varchar (15) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
stk_lst_prnt_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_ship_act_d_all
ADD CONSTRAINT mst_ship_act_d_all_pk PRIMARY KEY(ship_act_d_no,co_cd);


CREATE INDEX mst_ship_act_d_all_ie01
ON mst_ship_act_d_all USING BTREE (ship_act_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie02
ON mst_ship_act_d_all USING BTREE (ship_alloc_sts_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie03
ON mst_ship_act_d_all USING BTREE (dlv_slip_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie04
ON mst_ship_act_d_all USING BTREE (dlv_slip_d_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie05
ON mst_ship_act_d_all USING BTREE (dlv_id_cd, co_cd);


CREATE INDEX mst_ship_act_d_all_ie06
ON mst_ship_act_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_ship_act_d_all_ie07
ON mst_ship_act_d_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie08
ON mst_ship_act_d_all USING BTREE (cst_po_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie09
ON mst_ship_act_d_all USING BTREE (cst_po_d_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie10
ON mst_ship_act_d_all USING BTREE (cst_dlv_inst_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie11
ON mst_ship_act_d_all USING BTREE (cst_dlv_inst_d_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie12
ON mst_ship_act_d_all USING BTREE (io_schd_pr_no, co_cd);


CREATE INDEX mst_ship_act_d_all_ie13
ON mst_ship_act_d_all USING BTREE (ext_ship_act_no, ext_sys_cd, co_cd);

