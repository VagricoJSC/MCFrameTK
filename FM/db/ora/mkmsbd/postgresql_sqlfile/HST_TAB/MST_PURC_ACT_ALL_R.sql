\encoding UTF-8

CREATE TABLE mst_purc_act_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
purc_act_no varchar (15) NULL,
purc_act_seq numeric (4,0) NULL,
co_cd varchar (10) NULL,
purc_act_rev numeric (4,0) NULL,
trd_cd varchar (4) NULL,
trd_ptn_typ varchar (4) NULL,
slip_sts_typ varchar (1) NULL,
po_no varchar (15) NULL,
purc_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
purc_usr_cd varchar (500) NULL,
sppl_cd varchar (20) NULL,
asppl_cd varchar (20) NULL,
bsppl_cd varchar (20) NULL,
psppl_cd varchar (20) NULL,
cred_cd varchar (20) NULL,
trd_cur_cd varchar (3) NULL,
ptax_cur_cd varchar (3) NULL,
base_cur_cd varchar (3) NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
ptax_xrate numeric (21,8) NULL,
purc_dt timestamp(0)  NULL,
ac_ym timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
pay_basis_dt timestamp(0)  NULL,
pay_schd_dt timestamp(0)  NULL,
ptax_dt timestamp(0)  NULL,
rcpt_iv_no varchar (15) NULL,
rcpt_iv_mng_no varchar (15) NULL,
rcpt_iv_rev numeric (4,0) NULL,
ref_rcpt_iv_no varchar (15) NULL,
purc_ret_act_no varchar (15) NULL,
purc_ret_act_rev numeric (4,0) NULL,
tterm_cd1 varchar (5) NULL,
tterm_rmrks1 varchar (100) NULL,
tterm_cd2 varchar (5) NULL,
tterm_rmrks2 varchar (100) NULL,
tterm_cd3 varchar (5) NULL,
tterm_rmrks3 varchar (100) NULL,
trd_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
adjst_dt timestamp(0)  NULL,
purc_adjst_typ varchar (1) NULL,
adjst_mtd_typ varchar (1) NULL,
purc_adjst_flg char (1) DEFAULT '0' NULL,
temp_ap_use_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_purc_act_all_r ADD CONSTRAINT mst_purc_act_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_purc_act_all_r', 'mst_purc_act_all', 'mst_purc_act_all_tr_r');

