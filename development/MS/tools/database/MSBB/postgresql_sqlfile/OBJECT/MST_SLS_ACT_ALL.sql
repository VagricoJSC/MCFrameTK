\encoding UTF-8

CREATE TABLE mst_sls_act_all
(sls_act_no varchar (15) NOT NULL,
sls_act_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
sls_act_rev numeric (4,0) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
sls_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
sls_usr_cd varchar (500) NULL,
sls_dt timestamp(0)  NULL,
ship_tm timestamp(0)  NULL,
dlv_tm timestamp(0)  NULL,
cst_cd varchar (20) NOT NULL,
iv_no varchar (15) DEFAULT '*' NOT NULL,
ref_iv_no varchar (15) NULL,
rcpt_iv_mng_no varchar (15) NULL,
rcpt_iv_no varchar (15) NULL,
tterm_cd1 varchar (5) NULL,
tterm_rmrks1 varchar (100) NULL,
tterm_cd2 varchar (5) NULL,
tterm_rmrks2 varchar (100) NULL,
tterm_cd3 varchar (5) NULL,
tterm_rmrks3 varchar (100) NULL,
lc_no varchar (32) NULL,
lc_dt timestamp(0)  NULL,
lc_rmrks varchar (100) NULL,
rcv_schd_dt timestamp(0)  NULL,
bill_basis_dt timestamp(0)  NOT NULL,
cred_cd varchar (20) NULL,
bcst_cd varchar (20) NULL,
acst_cd varchar (20) NOT NULL,
ar_dpt_cd varchar (20) NOT NULL,
cst_po_no varchar (20) NULL,
trd_cur_cd varchar (3) NOT NULL,
base_cur_cd varchar (3) NOT NULL,
xrate_cd varchar (2) NOT NULL,
xrate numeric (21,8) NOT NULL,
ptax_cur_cd varchar (3) NULL,
ptax_xrate numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NOT NULL,
trd_cur_tax_amt numeric (21,8) NOT NULL,
base_cur_amt numeric (21,8) NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
trd_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
ship_act_no varchar (15) NULL,
slo_no varchar (15) NULL,
sls_ret_schd_no varchar (15) NULL,
qtn_no varchar (15) NULL,
qtn_rev numeric (4,0) NULL,
dlv_slip_no varchar (15) NULL,
dlv_slip_seq numeric (4,0) NULL,
ship_dlv_slip_no varchar (15) NULL,
slip_form_cd varchar (20) NULL,
aprv_flg char (1) DEFAULT '0' NOT NULL,
aprv_no varchar (15) NULL,
aprv_sts_typ varchar (1) NULL,
sls_basis_typ varchar (1) NULL,
ddlv_sls_flg char (1) DEFAULT '0' NOT NULL,
ship_act_sync_flg char (1) DEFAULT '0' NOT NULL,
ship_lg_grp_cd varchar (10) NULL,
adjst_tgt_dt timestamp(0)  NULL,
sls_adjst_typ varchar (1) NULL,
adjst_mtd_typ varchar (1) NULL,
edi_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_sls_act_all
ADD CONSTRAINT mst_sls_act_all_pk PRIMARY KEY(sls_act_no,sls_act_seq,co_cd);


CREATE INDEX mst_sls_act_all_ie01
ON mst_sls_act_all USING BTREE (ac_ym, co_cd);


CREATE INDEX mst_sls_act_all_ie02
ON mst_sls_act_all USING BTREE (ac_dt, co_cd);


CREATE INDEX mst_sls_act_all_ie03
ON mst_sls_act_all USING BTREE (sls_dpt_cd, co_cd);


CREATE INDEX mst_sls_act_all_ie04
ON mst_sls_act_all USING BTREE (sls_usr_cd, co_cd);


CREATE INDEX mst_sls_act_all_ie05
ON mst_sls_act_all USING BTREE (sls_dt, co_cd);


CREATE INDEX mst_sls_act_all_ie06
ON mst_sls_act_all USING BTREE (ship_tm, co_cd);


CREATE INDEX mst_sls_act_all_ie07
ON mst_sls_act_all USING BTREE (dlv_tm, co_cd);


CREATE INDEX mst_sls_act_all_ie08
ON mst_sls_act_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_sls_act_all_ie09
ON mst_sls_act_all USING BTREE (iv_no, co_cd);


CREATE INDEX mst_sls_act_all_ie10
ON mst_sls_act_all USING BTREE (bcst_cd, co_cd);


CREATE INDEX mst_sls_act_all_ie11
ON mst_sls_act_all USING BTREE (acst_cd, co_cd);


CREATE INDEX mst_sls_act_all_ie12
ON mst_sls_act_all USING BTREE (cst_po_no, co_cd);


CREATE INDEX mst_sls_act_all_ie13
ON mst_sls_act_all USING BTREE (dlv_slip_no, dlv_slip_seq, co_cd);


CREATE INDEX mst_sls_act_all_ie14
ON mst_sls_act_all USING BTREE (ship_act_no, co_cd);

