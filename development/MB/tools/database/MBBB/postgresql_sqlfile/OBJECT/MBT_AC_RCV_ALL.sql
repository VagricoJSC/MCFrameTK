\encoding UTF-8

CREATE TABLE mbt_ac_rcv_all
(data_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
rcv_act_no varchar (15) NOT NULL,
rcv_act_seq numeric (4,0) NOT NULL,
rcv_act_rev numeric (4,0) NOT NULL,
rcv_act_d_no varchar (15) NOT NULL,
rcv_act_d_seq numeric (4,0) NOT NULL,
ac_dt timestamp(0)  NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
ac_slip_typ varchar (5) NOT NULL,
ac_rsn_cd varchar (10) NULL,
ar_dpt_cd varchar (20) NULL,
rcv_dpt_cd varchar (20) NULL,
so_dpt_cd varchar (20) NULL,
sub_dpt_cd1 varchar (20) NULL,
sub_dpt_cd2 varchar (20) NULL,
sub_dpt_cd3 varchar (20) NULL,
rcst_cd varchar (20) NULL,
acst_cd varchar (20) NULL,
setoff_cd varchar (20) NULL,
foreign_flg char (1) DEFAULT '0' NOT NULL,
base_cur_cd varchar (3) NOT NULL,
base_cur_amt numeric (21,8) NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
trd_cur_amt numeric (21,8) NOT NULL,
trd_cur_tax_amt numeric (21,8) NOT NULL,
tax_cd varchar (5) NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
bill_no varchar (15) NULL,
usr_cd varchar (500) NULL,
iv_no varchar (15) NULL,
wrk_no varchar (15) NULL,
bank_ac_cd varchar (40) NULL,
xfr_psn varchar (100) NULL,
note_no varchar (20) NULL,
jnl_key1 varchar (20) NULL,
jnl_key2 varchar (20) NULL,
jnl_key3 varchar (20) NULL,
jnl_key4 varchar (20) NULL,
jnl_key5 varchar (20) NULL,
jnl_key6 varchar (20) NULL,
jnl_key7 varchar (20) NULL,
jnl_key8 varchar (20) NULL,
jnl_key9 varchar (20) NULL,
jnl_key10 varchar (20) NULL,
trd_rmrks varchar (100) NULL,
trd_d_rmrks varchar (100) NULL,
sub_char1 varchar (50) NULL,
sub_char2 varchar (50) NULL,
sub_char3 varchar (50) NULL,
sub_char4 varchar (50) NULL,
sub_char5 varchar (50) NULL,
sub_char6 varchar (50) NULL,
sub_char7 varchar (50) NULL,
sub_char8 varchar (50) NULL,
sub_char9 varchar (50) NULL,
sub_char10 varchar (50) NULL,
sub_num1 numeric (21,8) NULL,
sub_num2 numeric (21,8) NULL,
sub_num3 numeric (21,8) NULL,
sub_dt1 timestamp(0)  NULL,
sub_dt2 timestamp(0)  NULL,
sub_dt3 timestamp(0)  NULL,
jnl_fin_cnt numeric (2,0) NOT NULL,
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


ALTER TABLE mbt_ac_rcv_all
ADD CONSTRAINT mbt_ac_rcv_all_pk PRIMARY KEY(data_no,co_cd);


CREATE INDEX mbt_ac_rcv_all_ie01
ON mbt_ac_rcv_all USING BTREE (ac_ym, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie02
ON mbt_ac_rcv_all USING BTREE (wg_cd, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie03
ON mbt_ac_rcv_all USING BTREE (ac_slip_typ, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie04
ON mbt_ac_rcv_all USING BTREE (ac_rsn_cd, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie05
ON mbt_ac_rcv_all USING BTREE (ar_dpt_cd, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie06
ON mbt_ac_rcv_all USING BTREE (rcv_dpt_cd, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie07
ON mbt_ac_rcv_all USING BTREE (so_dpt_cd, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie08
ON mbt_ac_rcv_all USING BTREE (rcst_cd, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie09
ON mbt_ac_rcv_all USING BTREE (acst_cd, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie10
ON mbt_ac_rcv_all USING BTREE (setoff_cd, co_cd);


CREATE INDEX mbt_ac_rcv_all_ie11
ON mbt_ac_rcv_all USING BTREE (ac_ym, wg_cd, co_cd);

