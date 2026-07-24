\encoding UTF-8

CREATE TABLE mst_rcv_act_if_all
(rcv_act_if_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
act_no varchar (15) NULL,
act_seq numeric (4,0) NULL,
act_rev numeric (4,0) NULL,
act_d_no varchar (15) NOT NULL,
act_d_seq numeric (4,0) NOT NULL,
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
ar_typ varchar (1) NULL,
bank_ac_cd varchar (40) NULL,
xfr_psn varchar (100) NULL,
note_no varchar (20) NULL,
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
a_imp_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_rcv_act_if_all
ADD CONSTRAINT mst_rcv_act_if_all_pk PRIMARY KEY(rcv_act_if_no,co_cd);


CREATE INDEX mst_rcv_act_if_all_ie01
ON mst_rcv_act_if_all USING BTREE (ac_ym,co_cd);


CREATE INDEX mst_rcv_act_if_all_ie02
ON mst_rcv_act_if_all USING BTREE (act_no,act_rev,ac_slip_typ,co_cd);

