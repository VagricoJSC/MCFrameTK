\encoding UTF-8

CREATE TABLE mst_prov_act_all
(prov_act_no varchar (15) NOT NULL,
prov_act_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
prov_act_rev numeric (4,0) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
prov_schd_no varchar (15) DEFAULT '*' NOT NULL,
prov_src_act_typ varchar (1) NOT NULL,
prov_src_act_no varchar (15) DEFAULT '*' NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
xfr_rsn_cd varchar (10) NULL,
stk_mng_typ varchar (1) NOT NULL,
sno1_mng_typ varchar (1) NOT NULL,
sno2_mng_typ varchar (1) NOT NULL,
sno3_mng_typ varchar (1) NOT NULL,
sno4_mng_typ varchar (1) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
accpt_dt timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
ac_ym timestamp(0)  NOT NULL,
dlv_slip_no varchar (15) DEFAULT '*' NOT NULL,
dlv_slip_d_no varchar (15) DEFAULT '*' NOT NULL,
wg_cd varchar (10) NOT NULL,
prsppl_cd varchar (20) NOT NULL,
ap_dpt_cd varchar (20) NULL,
prov_typ varchar (1) NOT NULL,
prov_basis_typ varchar (1) NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
ptax_xrate numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
base_cur_cd varchar (3) NULL,
ptax_cur_cd varchar (3) NULL,
tax_cd varchar (5) NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
base_cur_upri numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
ptax_cur_upri numeric (21,8) NULL,
ptax_cur_amt numeric (21,8) NULL,
ptax_cur_tax_amt numeric (21,8) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
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
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
upd_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
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
upd_srv_req_no varchar (50) NULL,
base_ac_dt timestamp(0)  NULL
);


ALTER TABLE mst_prov_act_all
ADD CONSTRAINT mst_prov_act_all_pk PRIMARY KEY(prov_act_no,prov_act_seq,co_cd);


CREATE INDEX mst_prov_act_all_ie01
ON mst_prov_act_all USING BTREE (prov_schd_no, co_cd);


CREATE INDEX mst_prov_act_all_ie02
ON mst_prov_act_all USING BTREE (prov_src_act_no, prov_src_act_typ, co_cd);


CREATE INDEX mst_prov_act_all_ie03
ON mst_prov_act_all USING BTREE (accpt_dt, co_cd);


CREATE INDEX mst_prov_act_all_ie04
ON mst_prov_act_all USING BTREE (ac_dt, co_cd);


CREATE INDEX mst_prov_act_all_ie05
ON mst_prov_act_all USING BTREE (ac_ym, co_cd);


CREATE INDEX mst_prov_act_all_ie06
ON mst_prov_act_all USING BTREE (dlv_slip_no, co_cd);


CREATE INDEX mst_prov_act_all_ie07
ON mst_prov_act_all USING BTREE (prov_src_act_typ, co_cd);


CREATE INDEX mst_prov_act_all_ie08
ON mst_prov_act_all USING BTREE (ac_ym,trd_ptn_typ,prov_typ,co_cd);

