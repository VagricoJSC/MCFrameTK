\encoding UTF-8

CREATE TABLE mst_stk_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
fix_no_typ varchar (1) NULL,
fix_no varchar (15) DEFAULT '*' NULL,
pack_unit_cd varchar (5) NULL,
gd_cd varchar (2) NULL,
in_xfr_typ varchar (1) NULL,
quality_typ varchar (1) NULL,
asst_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) DEFAULT '*' NULL,
co_cd varchar (10) NULL,
pack_unit_qty numeric (21,8) NULL,
base_unit_qty numeric (21,8) NULL,
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



ALTER TABLE mst_stk_all_r ADD CONSTRAINT mst_stk_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_stk_all_r', 'mst_stk_all', 'mst_stk_all_tr_r');

