\encoding UTF-8

CREATE TABLE mst_insp_smpl_act_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
insp_smpl_act_no varchar (15) NULL,
co_cd varchar (10) NULL,
insp_act_no varchar (15) NULL,
insp_schd_no varchar (15) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
so_qty numeric (21,8) NULL,
smpl_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
pack_xfr_pack_unit_qty numeric (21,8) NULL,
pack_xfr_pack_unit_cd varchar (5) NULL,
pack_xfr_base_unit_qty numeric (21,8) NULL,
pack_xfr_base_unit_cd varchar (5) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno1_mng_typ varchar (1) NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno2_mng_typ varchar (1) NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno3_mng_typ varchar (1) NULL,
sno4 varchar (15) DEFAULT '*' NULL,
sno4_mng_typ varchar (1) NULL,
fix_no_typ varchar (1) NULL,
fix_no varchar (15) NULL,
act_tm timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
bd_dpt_cd varchar (20) NULL,
so_cmpl_flg char (1) DEFAULT '0' NULL,
trd_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
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
upd_srv_req_no varchar (50) NULL,
lims_flg char (1) DEFAULT '0' NULL,
ext_sys_cd varchar (10) NULL,
ext_insp_smpl_act_no varchar (300) NULL
);



ALTER TABLE mst_insp_smpl_act_all_r ADD CONSTRAINT mst_insp_smpl_act_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_insp_smpl_act_all_r', 'mst_insp_smpl_act_all', 'mst_insp_smpl_act_all_tr_r');

