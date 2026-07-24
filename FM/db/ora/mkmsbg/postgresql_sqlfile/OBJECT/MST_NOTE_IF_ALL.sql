\encoding UTF-8

CREATE TABLE mst_note_if_all
(note_if_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
note_rsn_cd varchar (10) NULL,
dpt_cd varchar (20) NOT NULL,
rcst_cd varchar (20) NOT NULL,
foreign_flg char (1) DEFAULT '0' NOT NULL,
base_cur_cd varchar (3) NOT NULL,
base_cur_amt numeric (21,8) NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
trd_cur_amt numeric (21,8) NOT NULL,
trd_cur_tax_amt numeric (21,8) NOT NULL,
xrate_cd varchar (2) NULL,
xrate numeric (21,8) NULL,
note_no varchar (20) NOT NULL,
note_typ varchar (1) NOT NULL,
draw_dt timestamp(0)  NOT NULL,
due_dt timestamp(0)  NOT NULL,
bank_cd varchar (15) NOT NULL,
branch_cd varchar (15) NOT NULL,
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


ALTER TABLE mst_note_if_all
ADD CONSTRAINT mst_note_if_all_pk PRIMARY KEY(note_if_no,co_cd);


CREATE INDEX mst_note_if_all_ie01
ON mst_note_if_all USING BTREE (ac_ym,co_cd);

