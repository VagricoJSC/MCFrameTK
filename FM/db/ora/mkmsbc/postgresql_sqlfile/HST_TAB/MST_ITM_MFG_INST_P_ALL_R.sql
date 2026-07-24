\encoding UTF-8

CREATE TABLE mst_itm_mfg_inst_p_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mfg_inst_no varchar (15) NULL,
mfg_inst_rev numeric (4,0) NULL,
co_cd varchar (10) NULL,
itm_mfg_inst_no varchar (15) NULL,
itm_ord_no varchar (15) NULL,
io_schd_pr_no varchar (15) NULL,
frst_mfg_inst_no varchar (15) NULL,
mfg_mtd_typ varchar (1) NULL,
sppl_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
oper_ptn varchar (40) DEFAULT '*' NULL,
bom_ptn varchar (40) NULL,
base_unit_yield_qty numeric (21,8) NULL,
base_unit_inst_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
master_dt timestamp(0)  NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
unschd_inst_flg char (1) DEFAULT '0' NULL,
unschd_act_flg char (1) DEFAULT '0' NULL,
strg_loc_cd varchar (20) NULL,
strg_str_ln_cd varchar (10) DEFAULT '*' NULL,
mfg_loc_cd varchar (20) NULL,
mfg_str_ln_cd varchar (10) DEFAULT '*' NULL,
wg_cd varchar (10) NULL,
site_cd varchar (10) NULL,
itm_lower_yield numeric (6,3) NULL,
itm_std_yield numeric (6,3) NULL,
itm_upper_yield numeric (6,3) NULL,
can_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_itm_mfg_inst_p_all_r ADD CONSTRAINT mst_itm_mfg_inst_p_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_itm_mfg_inst_p_all_r', 'mst_itm_mfg_inst_p_all', 'mst_itm_mfg_inst_p_all_tr_r');

