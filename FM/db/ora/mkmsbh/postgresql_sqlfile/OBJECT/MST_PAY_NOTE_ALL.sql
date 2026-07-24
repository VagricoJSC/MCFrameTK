\encoding UTF-8

CREATE TABLE mst_pay_note_all
(pay_note_mng_no varchar (15) NOT NULL,
pay_note_mng_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
note_no varchar (20) NOT NULL,
note_typ varchar (1) NOT NULL,
note_rsn_cd varchar (10) NULL,
draw_dt timestamp(0)  NOT NULL,
due_dt timestamp(0)  NOT NULL,
note_days numeric (3,0) NULL,
drawer_nm varchar (40) NOT NULL,
draw_bank_cd varchar (15) NOT NULL,
draw_branch_cd varchar (15) NOT NULL,
endrsr varchar (30) NULL,
accptr varchar (30) NULL,
note_amt numeric (21,8) NOT NULL,
cur_cd varchar (3) NOT NULL,
pay_act_no varchar (15) NULL,
pay_act_seq numeric (4,0) NULL,
adv_pay_act_no varchar (15) NULL,
adv_pay_act_seq numeric (4,0) NULL,
a_imp_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_pay_note_all
ADD CONSTRAINT mst_pay_note_all_pk PRIMARY KEY(pay_note_mng_no,pay_note_mng_seq,co_cd);


CREATE INDEX mst_pay_note_all_ie01
ON mst_pay_note_all USING BTREE (pay_act_no,pay_act_seq,co_cd);


CREATE INDEX mst_pay_note_all_ie02
ON mst_pay_note_all USING BTREE (adv_pay_act_no,adv_pay_act_seq,co_cd);

