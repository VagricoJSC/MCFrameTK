\encoding UTF-8

CREATE TABLE mst_rcv_act_all
(rcv_act_no varchar (15) NOT NULL,
rcv_act_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
trd_cd varchar (4) NOT NULL,
rcv_act_rev numeric (4,0) NOT NULL,
ar_trd_grp_typ varchar (3) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
rcv_no varchar (15) NULL,
dpt_cd varchar (20) NULL,
wg_cd varchar (10) NOT NULL,
usr_cd varchar (500) NULL,
rcst_cd varchar (20) NULL,
bcst_cd varchar (20) NULL,
bill_dpt_cd varchar (20) NULL,
cred_cd varchar (20) NULL,
rcv_dt timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
bill_basis_dt timestamp(0)  NULL,
ac_ym timestamp(0)  NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
base_cur_cd varchar (3) NOT NULL,
xrate_cd varchar (2) NOT NULL,
xrate numeric (21,8) NOT NULL,
trd_ac_rsn_cd varchar (10) NULL,
ar_sttl_cd1 varchar (10) NULL,
ar_sttl_typ1 varchar (1) NULL,
ar_sttl_ac_rsn_cd1 varchar (10) NULL,
tax_cd1 varchar (5) NULL,
bank_ac_cd varchar (40) NULL,
xfr_psn varchar (100) NULL,
note_mng_no varchar (15) NULL,
note_no varchar (20) NULL,
bd_dpt_cd varchar (20) NULL,
debt_cred_id_typ varchar (1) NULL,
debt_cred_id_cd varchar (20) NULL,
debt_cred_nm varchar (100) NULL,
ar_sttl_cd2 varchar (10) NULL,
ar_sttl_typ2 varchar (1) NULL,
ar_sttl_ac_rsn_cd2 varchar (10) NULL,
tax_cd2 varchar (5) NULL,
ar_sttl_cd3 varchar (10) NULL,
ar_sttl_typ3 varchar (1) NULL,
ar_sttl_ac_rsn_cd3 varchar (10) NULL,
tax_cd3 varchar (5) NULL,
trd_cur_amt numeric (21,8) NOT NULL,
subttl1 numeric (21,8) NOT NULL,
subttl2 numeric (21,8) NOT NULL,
subttl3 numeric (21,8) NOT NULL,
tax_amt numeric (21,8) NOT NULL,
tax_subttl1 numeric (21,8) NOT NULL,
tax_subttl2 numeric (21,8) NOT NULL,
tax_subttl3 numeric (21,8) NOT NULL,
base_cur_amt numeric (21,8) NOT NULL,
base_cur_subttl1 numeric (21,8) NOT NULL,
base_cur_subttl2 numeric (21,8) NOT NULL,
base_cur_subttl3 numeric (21,8) NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
base_cur_tax_subttl1 numeric (21,8) NOT NULL,
base_cur_tax_subttl2 numeric (21,8) NOT NULL,
base_cur_tax_subttl3 numeric (21,8) NOT NULL,
trd_rmrks varchar (100) NULL,
slip_sts_typ varchar (1) NOT NULL,
par_rcv_act_no varchar (15) NULL,
par_rcv_act_seq numeric (4,0) NULL,
ar_slip_prnt_typ varchar (1) NOT NULL,
rcv_auto_appl_flg char (1) DEFAULT '0' NOT NULL,
prnt_flg char (1) DEFAULT '0' NOT NULL,
bill_dtl_adv_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_rcv_act_all
ADD CONSTRAINT mst_rcv_act_all_pk PRIMARY KEY(rcv_act_no,rcv_act_seq,co_cd);


CREATE INDEX mst_rcv_act_all_ie01
ON mst_rcv_act_all USING BTREE (ac_dt,co_cd);


CREATE INDEX mst_rcv_act_all_ie02
ON mst_rcv_act_all USING BTREE (rcv_dt,co_cd);


CREATE INDEX mst_rcv_act_all_ie03
ON mst_rcv_act_all USING BTREE (rcv_no,co_cd);


CREATE INDEX mst_rcv_act_all_ie04
ON mst_rcv_act_all USING BTREE (par_rcv_act_no,par_rcv_act_seq,co_cd);

