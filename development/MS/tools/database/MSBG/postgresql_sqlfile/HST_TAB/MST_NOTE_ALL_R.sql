\encoding UTF-8

CREATE TABLE mst_note_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
note_mng_no varchar (15) NULL,
co_cd varchar (10) NULL,
note_no varchar (20) NULL,
note_typ varchar (1) NULL,
draw_dt timestamp(0)  NULL,
due_dt timestamp(0)  NULL,
drawer_nm varchar (40) NULL,
draw_bank_cd varchar (15) NULL,
draw_branch_cd varchar (15) NULL,
endrsr varchar (30) NULL,
accptr varchar (30) NULL,
note_rsn_cd varchar (10) NULL,
note_amt numeric (21,8) NULL,
appl_amt numeric (21,8) NULL,
not_appl_bal numeric (21,8) NULL,
susp_amt numeric (21,8) NULL,
adv_amt numeric (21,8) NULL,
mat_flg char (1) DEFAULT '0' NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
can_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_note_all_r ADD CONSTRAINT mst_note_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_note_all_r', 'mst_note_all', 'mst_note_all_tr_r');

