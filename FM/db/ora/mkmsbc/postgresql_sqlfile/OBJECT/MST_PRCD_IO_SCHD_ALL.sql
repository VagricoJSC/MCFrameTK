\encoding UTF-8

CREATE TABLE mst_prcd_io_schd_all
(slip_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
io_schd_typ varchar (5) NOT NULL,
io_typ varchar (1) NOT NULL,
io_schd_sts_typ varchar (2) NOT NULL,
io_schd_no varchar (15) NOT NULL,
io_schd_seq numeric (3,0) NULL,
io_schd_sub_typ1 varchar (2) NULL,
io_schd_sub_no1 varchar (15) NULL,
io_schd_sub_seq1 numeric (3,0) NULL,
io_schd_sub_typ2 varchar (2) NULL,
io_schd_sub_no2 varchar (15) NULL,
io_schd_sub_seq2 numeric (3,0) NULL,
io_schd_sub_typ3 varchar (2) NULL,
io_schd_sub_no3 varchar (15) NULL,
io_schd_sub_seq3 numeric (3,0) NULL,
io_schd_sub_typ4 varchar (2) NULL,
io_schd_sub_no4 varchar (15) NULL,
io_schd_sub_seq4 numeric (3,0) NULL,
io_schd_pr_no varchar (15) NULL,
schd_dt timestamp(0)  NOT NULL,
accpt_schd_dt timestamp(0)  NULL,
avl_schd_dt timestamp(0)  NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
alt_grp_cd varchar (40) NULL,
alt_grp_seq numeric (9,0) NULL,
oper_inst_no varchar (15) NULL,
oper_ord_no varchar (15) NULL,
alt_qty numeric (21,8) NULL,
alt_itm_typ varchar (1) NULL,
alt_itm_ratio numeric (9,0) NULL,
alt_alloc_prio numeric (9,0) NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
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
ex_sno1 varchar (15) NULL,
ex_sno2 varchar (15) NULL,
ex_sno3 varchar (15) NULL,
ex_sno4 varchar (15) NULL,
pack_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
gd_cd varchar (2) NOT NULL,
in_xfr_typ varchar (1) NOT NULL,
quality_typ varchar (1) NOT NULL,
asst_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
alloc_tgt_flg char (1) DEFAULT '0' NOT NULL,
alloc_scope_typ varchar (1) NULL,
alloc_flg char (1) DEFAULT '0' NOT NULL,
alloc_wait_flg char (1) DEFAULT '0' NOT NULL,
wg_cd varchar (10) NOT NULL,
sppl_cd varchar (20) NULL,
vld_dt_fr timestamp(0)  NULL,
vld_dt_to timestamp(0)  NULL,
inpt_ctl_typ varchar (1) NULL,
gi_loc_cd varchar (20) NULL,
gr_loc_cd varchar (20) NULL,
org_wg_cd varchar (10) NOT NULL,
sim_mrp_no varchar (15) NULL,
sub_char1 varchar (50) NULL,
sub_char2 varchar (50) NULL,
sub_char3 varchar (50) NULL,
sub_char4 varchar (50) NULL,
sub_char5 varchar (50) NULL,
sub_num1 numeric (21,8) NULL,
sub_num2 numeric (21,8) NULL,
sub_num3 numeric (21,8) NULL,
sub_dt1 timestamp(0)  NULL,
sub_dt2 timestamp(0)  NULL,
sub_dt3 timestamp(0)  NULL,
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


ALTER TABLE mst_prcd_io_schd_all
ADD CONSTRAINT mst_prcd_io_schd_all_pk PRIMARY KEY(slip_schd_no,co_cd);


CREATE INDEX mst_prcd_io_schd_all_ie01
ON mst_prcd_io_schd_all USING BTREE (io_schd_no, io_schd_typ, io_schd_sts_typ, co_cd);


CREATE INDEX mst_prcd_io_schd_all_ie02
ON mst_prcd_io_schd_all USING BTREE (io_schd_sub_no1, io_schd_sub_typ1, co_cd);


CREATE INDEX mst_prcd_io_schd_all_ie03
ON mst_prcd_io_schd_all USING BTREE (io_schd_sub_no2, io_schd_sub_typ2, co_cd);


CREATE INDEX mst_prcd_io_schd_all_ie04
ON mst_prcd_io_schd_all USING BTREE (io_schd_pr_no,co_cd);


CREATE INDEX mst_prcd_io_schd_all_ie05
ON mst_prcd_io_schd_all USING BTREE (io_typ,co_cd);

