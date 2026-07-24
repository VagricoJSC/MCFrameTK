\encoding UTF-8

CREATE TABLE mst_dlv_slip_d_all
(dlv_slip_d_no varchar (15) NOT NULL,
dlv_slip_d_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
dlv_slip_no varchar (15) NOT NULL,
dlv_slip_seq numeric (4,0) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
lot_no varchar (15) NULL,
lot_plural_flg char (1) DEFAULT '0' NOT NULL,
sublot_no varchar (15) NULL,
sublot_plural_flg char (1) DEFAULT '0' NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
fix_no_typ varchar (1) NOT NULL,
fix_no varchar (15) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
slo_qty numeric (21,8) NULL,
slo_unit_cd varchar (5) NULL,
dlv_inst_qty numeric (21,8) NULL,
dlv_inst_unit_cd varchar (5) NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
base_cur_upri numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
prov_typ varchar (1) NULL,
prov_basis_typ varchar (1) NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
cst_po_d_no varchar (20) NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
dlv_inst_no varchar (20) NULL,
dlv_inst_d_no varchar (20) NULL,
slo_d_no varchar (15) NULL,
ship_dlv_slip_d_no varchar (15) NULL,
ship_dlv_slip_multi_flg char (1) DEFAULT '0' NOT NULL,
trd_d_rmrks varchar (100) NULL,
io_typ varchar (1) NULL,
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


ALTER TABLE mst_dlv_slip_d_all
ADD CONSTRAINT mst_dlv_slip_d_all_pk PRIMARY KEY(dlv_slip_d_no,dlv_slip_d_seq,co_cd);


CREATE INDEX mst_dlv_slip_d_all_ie01
ON mst_dlv_slip_d_all USING BTREE (dlv_slip_no, co_cd);


CREATE INDEX mst_dlv_slip_d_all_ie02
ON mst_dlv_slip_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_dlv_slip_d_all_ie03
ON mst_dlv_slip_d_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_dlv_slip_d_all_ie04
ON mst_dlv_slip_d_all USING BTREE (cst_po_d_no, co_cd);


CREATE INDEX mst_dlv_slip_d_all_ie05
ON mst_dlv_slip_d_all USING BTREE (dlv_inst_no, co_cd);


CREATE INDEX mst_dlv_slip_d_all_ie06
ON mst_dlv_slip_d_all USING BTREE (dlv_inst_d_no, co_cd);


CREATE INDEX mst_dlv_slip_d_all_ie07
ON mst_dlv_slip_d_all USING BTREE (slo_d_no, co_cd);

