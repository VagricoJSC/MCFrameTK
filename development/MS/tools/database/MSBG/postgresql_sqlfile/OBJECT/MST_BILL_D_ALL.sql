\encoding UTF-8

CREATE TABLE mst_bill_d_all
(bill_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
bill_mng_no varchar (15) NOT NULL,
bill_acst_no varchar (15) NOT NULL,
bill_d_typ varchar (1) NOT NULL,
trd_cd varchar (4) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
act_no varchar (15) NULL,
act_seq numeric (4,0) NULL,
act_rev numeric (4,0) NULL,
act_d_no varchar (15) NULL,
act_d_seq numeric (4,0) NULL,
ar_trd_grp_typ varchar (3) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
rcv_mtd_cd varchar (10) NULL,
rcv_typ varchar (1) NULL,
ar_typ varchar (1) NOT NULL,
iv_no varchar (15) DEFAULT '*' NULL,
sls_dpt_cd varchar (20) NULL,
sls_usr_cd varchar (500) NULL,
cst_cd varchar (20) NULL,
dlv_cd varchar (20) NULL,
dlv_nm varchar (100) NULL,
dlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
dest_cd1 varchar (20) NULL,
dest_cd2 varchar (20) NULL,
dest_cd3 varchar (20) NULL,
ac_dt timestamp(0)  NOT NULL,
ac_ym timestamp(0)  NOT NULL,
dlv_dt timestamp(0)  NULL,
base_sls_ac_dt timestamp(0)  NULL,
rcv_dt timestamp(0)  NULL,
bill_basis_dt timestamp(0)  NULL,
bill_crryovr_times numeric (2,0) NULL,
cst_po_no varchar (20) NULL,
cst_po_d_no varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
sno1 varchar (15) NOT NULL,
sno2 varchar (15) NOT NULL,
sno3 varchar (15) NOT NULL,
sno4 varchar (15) NOT NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
cst_itm_cd varchar (40) NULL,
cst_itm_nm varchar (100) NULL,
trd_unit_cd varchar (5) NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NOT NULL,
trd_cur_upri numeric (21,8) NOT NULL,
trd_cur_amt numeric (21,8) NOT NULL,
trd_cur_amt1 numeric (21,8) NOT NULL,
trd_cur_amt2 numeric (21,8) NOT NULL,
trd_cur_amt3 numeric (21,8) NOT NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
xrate numeric (21,8) NOT NULL,
base_cur_upri numeric (21,8) NOT NULL,
base_cur_amt numeric (21,8) NOT NULL,
base_cur_amt1 numeric (21,8) NOT NULL,
base_cur_amt2 numeric (21,8) NOT NULL,
base_cur_amt3 numeric (21,8) NOT NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
trd_cur_tax_amt numeric (21,8) NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
trd_d_rmrks varchar (100) NULL,
bill_d_rmrks varchar (100) NULL,
dlv_slip_no varchar (15) NULL,
dlv_slip_d_no varchar (15) NULL,
ship_dlv_slip_no varchar (15) NULL,
ship_dlv_slip_d_no varchar (15) NULL,
ship_dlv_slip_multi_flg char (1) DEFAULT '0' NOT NULL,
slo_no varchar (15) NULL,
slo_d_no varchar (15) NULL,
par_act_no varchar (15) NULL,
par_act_seq numeric (4,0) NULL,
wrk_no varchar (15) NULL,
ref_iv_no varchar (15) NULL,
bill_prnt_tgt_flg char (1) DEFAULT '0' NOT NULL,
bill_mtd_typ varchar (1) NOT NULL,
crryovr_flg char (1) DEFAULT '0' NOT NULL,
crryovr_bill_d_no varchar (15) NULL,
crryovr_src_bill_d_no varchar (15) NULL,
valid_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_bill_d_all
ADD CONSTRAINT mst_bill_d_all_pk PRIMARY KEY(bill_d_no,co_cd);


CREATE INDEX mst_bill_d_all_ie01
ON mst_bill_d_all USING BTREE (bill_basis_dt,co_cd);


CREATE INDEX mst_bill_d_all_ie02
ON mst_bill_d_all USING BTREE (bill_mng_no,co_cd);


CREATE INDEX mst_bill_d_all_ie03
ON mst_bill_d_all USING BTREE (bill_acst_no,co_cd);


CREATE INDEX mst_bill_d_all_ie04
ON mst_bill_d_all USING BTREE (act_no,act_seq,co_cd);


CREATE INDEX mst_bill_d_all_ie05
ON mst_bill_d_all USING BTREE (act_d_no,act_d_seq,co_cd);


CREATE INDEX mst_bill_d_all_ie06
ON mst_bill_d_all USING BTREE (iv_no,co_cd);

