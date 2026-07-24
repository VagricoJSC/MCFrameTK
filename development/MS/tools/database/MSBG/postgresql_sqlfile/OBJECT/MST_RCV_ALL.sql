\encoding UTF-8

CREATE TABLE mst_rcv_all
(rcv_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
slo_no varchar (15) NULL,
dat_typ varchar (1) NOT NULL,
rcst_cd varchar (20) NULL,
bcst_cd varchar (20) NULL,
bill_dpt_cd varchar (20) NULL,
acst_cd varchar (20) NULL,
asppl_cd varchar (20) NULL,
bsppl_cd varchar (20) NULL,
rcv_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
rcv_usr_cd varchar (500) NULL,
rcv_dt timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NULL,
rcv_mtd_cd varchar (10) NOT NULL,
rcv_typ varchar (1) NOT NULL,
bank_ac_cd varchar (40) NULL,
xfr_psn varchar (100) NULL,
note_mng_no varchar (15) NULL,
trd_cur_cd varchar (3) NOT NULL,
base_cur_cd varchar (3) NOT NULL,
xrate_cd varchar (2) NOT NULL,
xrate numeric (21,8) NOT NULL,
rcv_rmrks varchar (100) NULL,
src_rcv_act_no varchar (15) NULL,
src_rcv_act_seq numeric (4,0) NULL,
src_rcv_act_d_no varchar (15) NULL,
src_rcv_act_d_seq numeric (4,0) NULL,
pay_act_no varchar (15) NULL,
rcv_amt numeric (21,8) NOT NULL,
rcv_proc_amt numeric (21,8) NOT NULL,
not_proc_bal numeric (21,8) NOT NULL,
com_paid numeric (21,8) NULL,
bill_setoff_amt numeric (21,8) NOT NULL,
auto_appl_basis_dt timestamp(0)  NULL,
rcv_auto_appl_tgt_flg char (1) DEFAULT '0' NOT NULL,
auto_appl_sts_typ varchar (1) NOT NULL,
fb_flg char (1) DEFAULT '0' NOT NULL,
ext_sys_cd varchar (10) NULL,
ext_rcv_no varchar (300) NULL,
seq_no numeric (9,0) NULL,
prnt_flg char (1) DEFAULT '0' NOT NULL,
div_src_rcv_no varchar (15) NULL,
div_flg char (1) DEFAULT '0' NOT NULL,
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
ar_typ varchar (1) NULL
);


ALTER TABLE mst_rcv_all
ADD CONSTRAINT mst_rcv_all_pk PRIMARY KEY(rcv_no,co_cd);


CREATE INDEX mst_rcv_all_ie01
ON mst_rcv_all USING BTREE (rcv_dt,co_cd);


CREATE INDEX mst_rcv_all_ie02
ON mst_rcv_all USING BTREE (note_mng_no,co_cd);


CREATE INDEX mst_rcv_all_ie03
ON mst_rcv_all USING BTREE (src_rcv_act_no,src_rcv_act_seq,co_cd);


CREATE INDEX mst_rcv_all_ie04
ON mst_rcv_all USING BTREE (src_rcv_act_d_no,src_rcv_act_d_seq,co_cd);


CREATE INDEX mst_rcv_all_ie05
ON mst_rcv_all USING BTREE (ext_sys_cd,ext_rcv_no,co_cd);

