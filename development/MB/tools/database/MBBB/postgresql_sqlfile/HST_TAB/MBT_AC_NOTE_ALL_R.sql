\encoding UTF-8

CREATE TABLE mbt_ac_note_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
data_no varchar (15) NULL,
co_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
ac_ym timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
note_rsn_cd varchar (10) NULL,
dpt_cd varchar (20) NULL,
rcst_cd varchar (20) NULL,
foreign_flg char (1) DEFAULT '0' NULL,
base_cur_cd varchar (3) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
note_no varchar (20) NULL,
note_typ varchar (1) NULL,
draw_dt timestamp(0)  NULL,
due_dt timestamp(0)  NULL,
bank_cd varchar (15) NULL,
branch_cd varchar (15) NULL,
drawer_nm varchar (40) NULL,
endrsr1 varchar (30) NULL,
endrsr2 varchar (30) NULL,
endrsr3 varchar (30) NULL,
endrsr4 varchar (30) NULL,
endrsr5 varchar (30) NULL,
accptr varchar (30) NULL,
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
fin_flg char (1) DEFAULT '0' NULL,
proc_no varchar (10) NULL,
slip_cnt_id varchar (3) NULL,
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



ALTER TABLE mbt_ac_note_all_r ADD CONSTRAINT mbt_ac_note_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mbt_ac_note_all_r', 'mbt_ac_note_all', 'mbt_ac_note_all_tr_r');

