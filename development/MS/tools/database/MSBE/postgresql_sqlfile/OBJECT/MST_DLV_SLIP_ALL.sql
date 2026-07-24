\encoding UTF-8

CREATE TABLE mst_dlv_slip_all
(dlv_slip_no varchar (15) NOT NULL,
dlv_slip_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
dlv_slip_rev numeric (4,0) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
slo_no varchar (15) NULL,
trn_typ varchar (4) NOT NULL,
dlv_slip_inst_no varchar (15) NULL,
dlv_slip_act_no varchar (15) NULL,
sls_act_no varchar (15) NULL,
ship_dlv_slip_no varchar (15) NULL,
dpt_cd varchar (20) NULL,
usr_cd varchar (500) NULL,
ship_tm timestamp(0)  NULL,
dlv_tm timestamp(0)  NULL,
dlv_rqst_tm timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
tax_calc_typ varchar (1) NULL,
cst_po_no varchar (20) NULL,
pri_prnt_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_cd varchar (3) NULL,
trd_cur_nm varchar (40) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
xrate numeric (21,8) NULL,
ptax_xrate numeric (21,8) NULL,
slip_line_max numeric (9,0) NOT NULL,
bp_cd varchar (20) NULL,
bp_nm varchar (100) NULL,
bp_zip_cd varchar (10) NULL,
bp_addr1 varchar (250) NULL,
bp_addr2 varchar (250) NULL,
bp_addr3 varchar (250) NULL,
bp_addr4 varchar (250) NULL,
bp_cntct_dpt varchar (100) NULL,
bp_cntct_psn varchar (100) NULL,
bp_tel varchar (30) NULL,
bp_fax varchar (30) NULL,
dlv_id_typ varchar (1) NULL,
dlv_id_cd varchar (20) NULL,
dlv_id_nm varchar (100) NULL,
dlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
dlv_zip_cd varchar (10) NULL,
dlv_addr1 varchar (250) NULL,
dlv_addr2 varchar (250) NULL,
dlv_addr3 varchar (250) NULL,
dlv_addr4 varchar (250) NULL,
dlv_cntct_dpt varchar (100) NULL,
dlv_cntct_psn varchar (100) NULL,
dlv_tel varchar (30) NULL,
dlv_fax varchar (30) NULL,
xfr_loc_cd varchar (20) NULL,
ship_fr_lg_grp_cd varchar (10) NULL,
wg_cd varchar (10) NOT NULL,
trd_rmrks varchar (100) NULL,
sls_basis_typ varchar (1) NULL,
slip_prnt_flg char (1) DEFAULT '0' NOT NULL,
ship_adv_prnt_flg char (1) DEFAULT '0' NOT NULL,
sls_prnt_flg char (1) DEFAULT '0' NOT NULL,
sync_flg char (1) DEFAULT '0' NOT NULL,
adjst_slip_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_dlv_slip_all
ADD CONSTRAINT mst_dlv_slip_all_pk PRIMARY KEY(dlv_slip_no,dlv_slip_seq,co_cd);


CREATE INDEX mst_dlv_slip_all_ie01
ON mst_dlv_slip_all USING BTREE (slo_no, co_cd);


CREATE INDEX mst_dlv_slip_all_ie02
ON mst_dlv_slip_all USING BTREE (trn_typ, dlv_slip_inst_no, co_cd);


CREATE INDEX mst_dlv_slip_all_ie03
ON mst_dlv_slip_all USING BTREE (trn_typ, dlv_slip_act_no, co_cd);


CREATE INDEX mst_dlv_slip_all_ie04
ON mst_dlv_slip_all USING BTREE (sls_act_no, co_cd);


CREATE INDEX mst_dlv_slip_all_ie05
ON mst_dlv_slip_all USING BTREE (ac_dt, co_cd);


CREATE INDEX mst_dlv_slip_all_ie06
ON mst_dlv_slip_all USING BTREE (cst_po_no, co_cd);


CREATE INDEX mst_dlv_slip_all_ie07
ON mst_dlv_slip_all USING BTREE (bp_cd, co_cd);


CREATE INDEX mst_dlv_slip_all_ie08
ON mst_dlv_slip_all USING BTREE (dlv_id_cd, co_cd);

