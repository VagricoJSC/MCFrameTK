\encoding UTF-8

CREATE TABLE mst_pay_act_d_all
(pay_act_d_no varchar (15) NOT NULL,
pay_act_d_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
pay_act_no varchar (15) NOT NULL,
pay_act_seq numeric (4,0) NOT NULL,
disp_seq numeric (5,0) NOT NULL,
ap_appl_schd_no varchar (15) NULL,
pay_schd_no varchar (15) NULL,
pay_chk_mng_no varchar (15) NULL,
pay_chk_no varchar (15) NULL,
calc_tgt_pay_chk_mng_no varchar (15) NULL,
ap_d_no varchar (15) NULL,
ap_sttl_cd varchar (10) NOT NULL,
ap_sttl_typ varchar (1) NOT NULL,
ac_rsn_cd varchar (10) NULL,
bank_ac_cd varchar (40) NULL,
pay_bank_ac_cd varchar (40) NULL,
trd_cur_com_paid_tax_cd varchar (5) NULL,
ap_setoff_typ varchar (1) NULL,
setoff_cd varchar (20) NULL,
setoff_nm varchar (100) NULL,
so_dpt_cd varchar (20) NULL,
trd_cur_amt numeric (21,8) NOT NULL,
trd_cur_com_paid_tax_amt numeric (21,8) NULL,
trd_cur_exc_com_paid numeric (21,8) NULL,
base_cur_amt numeric (21,8) NOT NULL,
base_cur_com_paid_tax_amt numeric (21,8) NULL,
base_cur_exc_com_paid numeric (21,8) NULL,
rcv_no varchar (15) NULL,
adv_pay_act_no varchar (15) NULL,
bsppl_cd varchar (20) NOT NULL,
bsppl_dpt_cd varchar (20) NOT NULL,
asppl_cd varchar (20) NOT NULL,
ap_dpt_cd varchar (20) NOT NULL,
purc_act_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_mng_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_no varchar (15) DEFAULT '*' NOT NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
ap_typ varchar (1) NOT NULL,
pay_ntc_d_print_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
intr_d_rmrks varchar (100) NULL,
par_pay_act_d_no varchar (15) NULL,
par_pay_act_d_seq numeric (4,0) NULL,
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


ALTER TABLE mst_pay_act_d_all
ADD CONSTRAINT mst_pay_act_d_all_pk PRIMARY KEY(pay_act_d_no,pay_act_d_seq,co_cd);


CREATE INDEX mst_pay_act_d_all_ie01
ON mst_pay_act_d_all USING BTREE (pay_act_no,pay_act_seq,co_cd);


CREATE INDEX mst_pay_act_d_all_ie02
ON mst_pay_act_d_all USING BTREE (ap_appl_schd_no,co_cd);


CREATE INDEX mst_pay_act_d_all_ie03
ON mst_pay_act_d_all USING BTREE (pay_schd_no,co_cd);


CREATE INDEX mst_pay_act_d_all_ie04
ON mst_pay_act_d_all USING BTREE (pay_chk_mng_no,co_cd);


CREATE INDEX mst_pay_act_d_all_ie05
ON mst_pay_act_d_all USING BTREE (pay_chk_no,co_cd);


CREATE INDEX mst_pay_act_d_all_ie06
ON mst_pay_act_d_all USING BTREE (calc_tgt_pay_chk_mng_no,co_cd);


CREATE INDEX mst_pay_act_d_all_ie07
ON mst_pay_act_d_all USING BTREE (asppl_cd, ap_dpt_cd, co_cd);


CREATE INDEX mst_pay_act_d_all_ie08
ON mst_pay_act_d_all USING BTREE (purc_act_no, co_cd);


CREATE INDEX mst_pay_act_d_all_ie09
ON mst_pay_act_d_all USING BTREE (rcpt_iv_mng_no, co_cd);


CREATE INDEX mst_pay_act_d_all_ie10
ON mst_pay_act_d_all USING BTREE (adv_pay_act_no, co_cd);


CREATE INDEX mst_pay_act_d_all_ie11
ON mst_pay_act_d_all USING BTREE (bsppl_cd, bsppl_dpt_cd,co_cd);


CREATE INDEX mst_pay_act_d_all_ie12
ON mst_pay_act_d_all USING BTREE (par_pay_act_d_no, par_pay_act_d_seq, co_cd);

