\encoding UTF-8

CREATE TABLE mst_arr_act_all
(arr_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
arr_act_rev numeric (4,0) NOT NULL,
arr_schd_no varchar (15) NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
purc_act_io_no varchar (15) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
rcpt_iv_itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sno1_mng_typ varchar (1) NOT NULL,
sno2_mng_typ varchar (1) NOT NULL,
sno3_mng_typ varchar (1) NOT NULL,
sno4_mng_typ varchar (1) NOT NULL,
purc_id_typ varchar (1) NULL,
stk_mng_typ varchar (1) NOT NULL,
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
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
rqst_dpt_cd varchar (20) NULL,
rqst_usr_cd varchar (500) NULL,
arr_dpt_cd varchar (20) NULL,
arr_usr_cd varchar (500) NULL,
cst_cd varchar (20) NULL,
sret_fr_cd varchar (20) NULL,
sppl_cd varchar (20) NULL,
ret_loc_cd varchar (20) NULL,
ret_str_ln_cd varchar (10) NULL,
ret_gd_cd varchar (2) NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
bp_lot_no varchar (15) NULL,
bp_dlv_slip_no varchar (15) NULL,
bp_dlv_slip_d_no varchar (15) NULL,
ship_fr_valid_dt timestamp(0)  NULL,
lg_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
arr_loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
arr_tm timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
ptax_cur_amt numeric (21,8) NULL,
ptax_cur_tax_amt numeric (21,8) NULL,
purc_cont_qty numeric (21,8) NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
bd_wg_cd varchar (10) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
stk_lst_prnt_flg char (1) DEFAULT '0' NOT NULL,
sync_flg char (1) DEFAULT '0' NOT NULL,
edi_flg char (1) DEFAULT '0' NOT NULL,
edi_bp_dlv_slip_no varchar (15) NULL,
edi_bp_dlv_slip_d_no varchar (15) NULL,
dlv_slip_no varchar (15) NULL,
dlv_slip_d_no varchar (15) NULL,
wms_flg char (1) DEFAULT '0' NOT NULL,
ext_sys_cd varchar (10) NULL,
ext_arr_act_no varchar (300) NULL,
insp_cnt_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
trd_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
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


ALTER TABLE mst_arr_act_all
ADD CONSTRAINT mst_arr_act_all_pk PRIMARY KEY(arr_act_no,co_cd);


CREATE INDEX mst_arr_act_all_ie01
ON mst_arr_act_all USING BTREE (arr_schd_no, co_cd);


CREATE INDEX mst_arr_act_all_ie02
ON mst_arr_act_all USING BTREE (purc_act_io_no, co_cd);


CREATE INDEX mst_arr_act_all_ie03
ON mst_arr_act_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_arr_act_all_ie04
ON mst_arr_act_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_arr_act_all_ie05
ON mst_arr_act_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_arr_act_all_ie06
ON mst_arr_act_all USING BTREE (sppl_cd, co_cd);


CREATE INDEX mst_arr_act_all_ie07
ON mst_arr_act_all USING BTREE (ac_dt, co_cd);


CREATE INDEX mst_arr_act_all_ie08
ON mst_arr_act_all USING BTREE (edi_bp_dlv_slip_no, co_cd);


CREATE INDEX mst_arr_act_all_ie09
ON mst_arr_act_all USING BTREE (edi_bp_dlv_slip_d_no, co_cd);


CREATE INDEX mst_arr_act_all_ie10
ON mst_arr_act_all USING BTREE (dlv_slip_no, co_cd);


CREATE INDEX mst_arr_act_all_ie11
ON mst_arr_act_all USING BTREE (dlv_slip_d_no, co_cd);


CREATE INDEX mst_arr_act_all_ie12
ON mst_arr_act_all USING BTREE (ext_arr_act_no, ext_sys_cd, co_cd);

