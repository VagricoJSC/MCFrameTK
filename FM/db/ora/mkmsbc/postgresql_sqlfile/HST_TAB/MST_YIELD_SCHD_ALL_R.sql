\encoding UTF-8

CREATE TABLE mst_yield_schd_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
yield_schd_no varchar (15) NULL,
co_cd varchar (10) NULL,
mfg_inst_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NULL,
oper_inst_no varchar (15) NULL,
io_schd_pr_no varchar (15) NULL,
yield_typ varchar (1) NULL,
schd_tm timestamp(0)  NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
trd_unit_yield_qty numeric (21,8) NULL,
trd_unit_cd varchar (5) NULL,
base_unit_yield_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
strg_loc_cd varchar (20) NULL,
strg_str_ln_cd varchar (10) DEFAULT '*' NULL,
bkf_typ varchar (1) NULL,
par_inst_qty numeric (21,8) NULL,
chd_inpt_qty numeric (21,8) NULL,
chd_rqmt_qty numeric (21,8) NULL,
fxd_chd_rqmt_qty numeric (21,8) NULL,
can_flg char (1) DEFAULT '0' NULL,
disp_seq numeric (9,0) NULL,
intr_rmrks varchar (100) NULL,
inst_rpt_rmrks varchar (100) NULL,
insp_cnt_rmrks varchar (100) NULL,
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



ALTER TABLE mst_yield_schd_all_r ADD CONSTRAINT mst_yield_schd_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_yield_schd_all_r', 'mst_yield_schd_all', 'mst_yield_schd_all_tr_r');

