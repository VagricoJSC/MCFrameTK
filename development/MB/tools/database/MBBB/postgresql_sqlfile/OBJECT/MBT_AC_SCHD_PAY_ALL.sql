\encoding UTF-8

CREATE TABLE mbt_ac_schd_pay_all
(data_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
pay_ap_typ varchar (1) NOT NULL,
ap_appl_schd_no varchar (15) NOT NULL,
pay_chk_no varchar (15) NULL,
pay_dpt_cd varchar (20) NULL,
bsppl_dpt_cd varchar (20) NULL,
ap_dpt_cd varchar (20) NULL,
sub_dpt_cd1 varchar (20) NULL,
sub_dpt_cd2 varchar (20) NULL,
sub_dpt_cd3 varchar (20) NULL,
asppl_cd varchar (20) NULL,
bsppl_cd varchar (20) NULL,
psppl_cd varchar (20) NULL,
foreign_flg char (1) DEFAULT '0' NOT NULL,
base_cur_cd varchar (3) NOT NULL,
base_cur_amt numeric (21,8) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
trd_cur_amt numeric (21,8) NOT NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
pay_spot_flg char (1) DEFAULT '0' NOT NULL,
pay_schd_dt timestamp(0)  NULL,
sttl_cd varchar (10) NULL,
ap_sttl_typ varchar (1) NULL,
ap_typ varchar (1) NULL,
bank_ac_cd varchar (40) NULL,
pay_bank_ac_cd varchar (40) NULL,
drawer_nm varchar (40) NULL,
note_no varchar (20) NULL,
due_dt timestamp(0)  NULL,
draw_dt timestamp(0)  NULL,
rcv_bill_no varchar (15) NULL,
usr_cd varchar (500) NULL,
iv_no varchar (15) NULL,
wrk_no varchar (15) NULL,
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
send_flg char (1) DEFAULT '0' NOT NULL,
proc_no varchar (10) NULL,
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


ALTER TABLE mbt_ac_schd_pay_all
ADD CONSTRAINT mbt_ac_schd_pay_all_pk PRIMARY KEY(data_no,co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie01
ON mbt_ac_schd_pay_all USING BTREE (ac_ym, co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie02
ON mbt_ac_schd_pay_all USING BTREE (wg_cd, co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie03
ON mbt_ac_schd_pay_all USING BTREE (pay_dpt_cd, co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie04
ON mbt_ac_schd_pay_all USING BTREE (bsppl_dpt_cd, co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie05
ON mbt_ac_schd_pay_all USING BTREE (ap_dpt_cd, co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie06
ON mbt_ac_schd_pay_all USING BTREE (psppl_cd, co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie07
ON mbt_ac_schd_pay_all USING BTREE (bsppl_cd, co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie08
ON mbt_ac_schd_pay_all USING BTREE (asppl_cd, co_cd);


CREATE INDEX mbt_ac_schd_pay_all_ie09
ON mbt_ac_schd_pay_all USING BTREE (ac_ym, wg_cd, co_cd);

