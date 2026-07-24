\encoding UTF-8

CREATE TABLE mst_insp_act_all
(insp_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
insp_no varchar (15) NOT NULL,
insp_freq numeric (9,0) NOT NULL,
src_no1 varchar (15) NULL,
src_no2 varchar (15) NULL,
insp_typ varchar (1) NOT NULL,
insp_mtd_typ varchar (1) NOT NULL,
dfct_rsn_cd varchar (10) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
quality_typ varchar (1) NULL,
gd_cd varchar (2) NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
from_site_cd varchar (10) DEFAULT '*' NOT NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
good_qty numeric (21,8) NULL,
dfct_qty numeric (21,8) NULL,
st_tm timestamp(0)  NULL,
end_tm timestamp(0)  NULL,
act_usr_cd varchar (500) NULL,
act_dpt_cd varchar (20) NULL,
judg_dt timestamp(0)  NULL,
judg_tm timestamp(0)  NULL,
insp_judg_rslt_typ varchar (1) NULL,
judg_dpt_cd varchar (20) NULL,
judg_usr_cd varchar (500) NULL,
judg_rsn varchar (100) NULL,
lmt_dt_frm_typ varchar (1) NULL,
lmt_dt_frm timestamp(0)  NULL,
vld_dt timestamp(0)  NULL,
lmt_dt timestamp(0)  NULL,
not_upd_stk_flg char (1) DEFAULT '0' NOT NULL,
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
ext_insp_act_no varchar (300) NULL
);


ALTER TABLE mst_insp_act_all
ADD CONSTRAINT mst_insp_act_all_pk PRIMARY KEY(insp_act_no,co_cd);


CREATE INDEX mst_insp_act_all_ie01
ON mst_insp_act_all USING BTREE (insp_no,co_cd);


CREATE INDEX mst_insp_act_all_ie02
ON mst_insp_act_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);


CREATE INDEX mst_insp_act_all_ie03
ON mst_insp_act_all USING BTREE (lot_no,co_cd);


CREATE INDEX mst_insp_act_all_ie04
ON mst_insp_act_all USING BTREE (mfg_loc_cd,co_cd);


CREATE INDEX mst_insp_act_all_ie05
ON mst_insp_act_all USING BTREE (ext_insp_act_no, ext_sys_cd, co_cd);

