\encoding UTF-8

CREATE TABLE mst_note_all
(note_mng_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
note_no varchar (20) NOT NULL,
note_typ varchar (1) NOT NULL,
draw_dt timestamp(0)  NOT NULL,
due_dt timestamp(0)  NOT NULL,
drawer_nm varchar (40) NOT NULL,
draw_bank_cd varchar (15) NOT NULL,
draw_branch_cd varchar (15) NOT NULL,
endrsr varchar (30) NULL,
accptr varchar (30) NULL,
note_rsn_cd varchar (10) NULL,
note_amt numeric (21,8) NOT NULL,
appl_amt numeric (21,8) NOT NULL,
not_appl_bal numeric (21,8) NOT NULL,
susp_amt numeric (21,8) NOT NULL,
adv_amt numeric (21,8) NOT NULL,
mat_flg char (1) DEFAULT '0' NOT NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_note_all
ADD CONSTRAINT mst_note_all_pk PRIMARY KEY(note_mng_no,co_cd);


CREATE INDEX mst_note_all_ie01
ON mst_note_all USING BTREE (due_dt,co_cd);


CREATE INDEX mst_note_all_ie02
ON mst_note_all USING BTREE (note_no,co_cd);


CREATE INDEX mst_note_all_ie03
ON mst_note_all USING BTREE (mat_flg,co_cd);

