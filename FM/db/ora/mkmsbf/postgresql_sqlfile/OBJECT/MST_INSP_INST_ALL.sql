\encoding UTF-8

CREATE TABLE mst_insp_inst_all
(insp_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
insp_freq numeric (9,0) NOT NULL,
src_no1 varchar (15) NULL,
src_no2 varchar (15) NULL,
insp_typ varchar (1) NOT NULL,
insp_mtd_typ varchar (1) NOT NULL,
insp_sts_typ varchar (1) NOT NULL,
insp_bind_typ varchar (1) NULL,
col_schd_flg char (1) DEFAULT '0' NOT NULL,
insp_lst_prnt_flg char (1) DEFAULT '0' NOT NULL,
insp_lst_prnt_tm timestamp(0)  NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
from_site_cd varchar (10) DEFAULT '*' NOT NULL,
to_site_cd varchar (10) DEFAULT '*' NOT NULL,
bp_lot_no varchar (15) NULL,
pack_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
insp_lst_no varchar (15) NULL,
inst_dt timestamp(0)  NULL,
inst_dpt_cd varchar (20) NULL,
inst_usr_cd varchar (500) NULL,
master_dt timestamp(0)  NOT NULL,
st_tm timestamp(0)  NULL,
end_tm timestamp(0)  NULL,
insp_ptn_cd varchar (2) NULL,
std_req_flg char (1) DEFAULT '0' NOT NULL,
std_cnf_req_flg char (1) DEFAULT '0' NOT NULL,
insp_std_no varchar (10) NULL,
plnt_aprv_flg char (1) DEFAULT '0' NOT NULL,
insp_rslt_prnt_flg char (1) DEFAULT '0' NOT NULL,
insp_rslt_prnt_tm timestamp(0)  NULL,
seq numeric (3,0) NOT NULL,
lmt_up_flg char (1) DEFAULT '0' NOT NULL,
insp_aprv_flg char (1) DEFAULT '0' NOT NULL,
insp_aprv_sts_typ varchar (1) NULL,
aprv_dt timestamp(0)  NULL,
insp_aprv_role_cd varchar (10) NULL,
aprv_dpt_cd varchar (20) NULL,
aprv_usr_cd varchar (500) NULL,
aprv_tm timestamp(0)  NULL,
aprv_rsn varchar (100) NULL,
act_cont_fctr numeric (21,8) NULL,
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
lims_flg char (1) DEFAULT '0' NOT NULL
);


ALTER TABLE mst_insp_inst_all
ADD CONSTRAINT mst_insp_inst_all_pk PRIMARY KEY(insp_no,co_cd);


CREATE INDEX mst_insp_inst_all_ie01
ON mst_insp_inst_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,insp_typ,sppl_cd,bp_lot_no,insp_mtd_typ,co_cd);


CREATE INDEX mst_insp_inst_all_ie02
ON mst_insp_inst_all USING BTREE (insp_lst_no,co_cd);


CREATE INDEX mst_insp_inst_all_ie03
ON mst_insp_inst_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,insp_sts_typ,co_cd);


CREATE INDEX mst_insp_inst_all_ie04
ON mst_insp_inst_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,co_cd);


CREATE INDEX mst_insp_inst_all_ie05
ON mst_insp_inst_all USING BTREE (lot_no,co_cd);


CREATE INDEX mst_insp_inst_all_ie06
ON mst_insp_inst_all USING BTREE (mfg_loc_cd,co_cd);


CREATE INDEX mst_insp_inst_all_ie07
ON mst_insp_inst_all USING BTREE (st_tm,co_cd);


CREATE INDEX mst_insp_inst_all_ie08
ON mst_insp_inst_all USING BTREE (insp_sts_typ,co_cd);


CREATE INDEX mst_insp_inst_all_ie09
ON mst_insp_inst_all USING BTREE (insp_aprv_sts_typ,co_cd);

