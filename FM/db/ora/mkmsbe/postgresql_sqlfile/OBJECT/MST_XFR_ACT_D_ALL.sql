\encoding UTF-8

CREATE TABLE mst_xfr_act_d_all
(xfr_act_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
xfr_act_no varchar (15) NOT NULL,
xfr_alloc_sts_no varchar (15) DEFAULT '*' NOT NULL,
xfr_inst_d_no varchar (15) DEFAULT '*' NOT NULL,
gi_loc_cd varchar (20) NOT NULL,
gi_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
gi_stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
gr_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NOT NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
skip_chk_ship_flg char (1) DEFAULT '0' NOT NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
dlv_slip_no varchar (15) DEFAULT '*' NOT NULL,
dlv_slip_seq numeric (4,0) NOT NULL,
dlv_slip_d_no varchar (15) DEFAULT '*' NOT NULL,
io_schd_pr_no varchar (15) NOT NULL,
base_dlv_slip_no varchar (15) NULL,
base_prov_act_no varchar (15) NULL,
base_ac_dt timestamp(0)  NULL,
disp_seq numeric (5,0) NOT NULL,
wms_flg char (1) DEFAULT '0' NOT NULL,
ext_sys_cd varchar (10) NULL,
ext_xfr_act_no varchar (300) NULL,
intr_d_rmrks varchar (100) NULL,
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


ALTER TABLE mst_xfr_act_d_all
ADD CONSTRAINT mst_xfr_act_d_all_pk PRIMARY KEY(xfr_act_d_no,co_cd);


CREATE INDEX mst_xfr_act_d_all_ie01
ON mst_xfr_act_d_all USING BTREE (xfr_act_no, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie02
ON mst_xfr_act_d_all USING BTREE (xfr_alloc_sts_no, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie03
ON mst_xfr_act_d_all USING BTREE (xfr_inst_d_no, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie04
ON mst_xfr_act_d_all USING BTREE (gi_loc_cd, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie05
ON mst_xfr_act_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie06
ON mst_xfr_act_d_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie07
ON mst_xfr_act_d_all USING BTREE (dlv_slip_no, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie08
ON mst_xfr_act_d_all USING BTREE (dlv_slip_d_no, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie09
ON mst_xfr_act_d_all USING BTREE (io_schd_pr_no, co_cd);


CREATE INDEX mst_xfr_act_d_all_ie10
ON mst_xfr_act_d_all USING BTREE (ext_xfr_act_no, ext_sys_cd, co_cd);

