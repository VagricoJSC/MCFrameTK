\encoding UTF-8

CREATE TABLE mst_insp_smpl_act_all
(insp_smpl_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
insp_act_no varchar (15) NOT NULL,
insp_schd_no varchar (15) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
so_qty numeric (21,8) NULL,
smpl_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NOT NULL,
pack_xfr_pack_unit_qty numeric (21,8) NULL,
pack_xfr_pack_unit_cd varchar (5) NULL,
pack_xfr_base_unit_qty numeric (21,8) NULL,
pack_xfr_base_unit_cd varchar (5) NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
gd_cd varchar (2) NOT NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno1_mng_typ varchar (1) NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno2_mng_typ varchar (1) NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno3_mng_typ varchar (1) NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sno4_mng_typ varchar (1) NULL,
fix_no_typ varchar (1) NULL,
fix_no varchar (15) NULL,
act_tm timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
bd_dpt_cd varchar (20) NULL,
so_cmpl_flg char (1) DEFAULT '0' NOT NULL,
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
lims_flg char (1) DEFAULT '0' NOT NULL,
ext_sys_cd varchar (10) NULL,
ext_insp_smpl_act_no varchar (300) NULL
);


ALTER TABLE mst_insp_smpl_act_all
ADD CONSTRAINT mst_insp_smpl_act_all_pk PRIMARY KEY(insp_smpl_act_no,co_cd);


CREATE INDEX mst_insp_smpl_act_all_ie01
ON mst_insp_smpl_act_all USING BTREE (insp_act_no,stk_insp_typ,co_cd);


CREATE INDEX mst_insp_smpl_act_all_ie02
ON mst_insp_smpl_act_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);


CREATE INDEX mst_insp_smpl_act_all_ie03
ON mst_insp_smpl_act_all USING BTREE (lot_no,co_cd);


CREATE INDEX mst_insp_smpl_act_all_ie04
ON mst_insp_smpl_act_all USING BTREE (ext_insp_smpl_act_no, ext_sys_cd, co_cd);

