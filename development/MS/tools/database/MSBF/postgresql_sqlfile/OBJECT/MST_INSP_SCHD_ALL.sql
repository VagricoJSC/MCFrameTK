\encoding UTF-8

CREATE TABLE mst_insp_schd_all
(insp_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
src_no1 varchar (15) NULL,
src_no2 varchar (15) NULL,
src_no3 varchar (15) NULL,
src_no4 varchar (15) NULL,
insp_typ varchar (1) NOT NULL,
insp_mtd_typ varchar (1) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno1_mng_typ varchar (1) NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno2_mng_typ varchar (1) NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno3_mng_typ varchar (1) NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sno4_mng_typ varchar (1) NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
from_site_cd varchar (10) DEFAULT '*' NOT NULL,
bp_lot_no varchar (15) NULL,
master_dt timestamp(0)  NOT NULL,
st_tm timestamp(0)  NULL,
end_tm timestamp(0)  NULL,
pack_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
smpl_schd_qty numeric (21,8) NULL,
smpl_inst_qty numeric (21,8) NULL,
own_insp_no varchar (15) NULL,
own_insp_schd_no varchar (15) NULL,
org_insp_schd_no varchar (15) NOT NULL,
latest_flg char (1) DEFAULT '1' NOT NULL,
insp_freq numeric (9,0) NOT NULL,
lmt_up_flg char (1) DEFAULT '0' NOT NULL,
insp_schd_sts_typ varchar (1) NOT NULL,
ac_dt timestamp(0)  NULL,
insp_no varchar (15) NULL,
itm_ord_no varchar (15) NULL,
in_prmt_insp_flg char (1) DEFAULT '0' NOT NULL,
trd_cd varchar (4) NULL,
insp_bind_typ varchar (1) NULL,
insp_lt numeric (9,0) NULL,
insp_offst numeric (9,0) NULL,
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


ALTER TABLE mst_insp_schd_all
ADD CONSTRAINT mst_insp_schd_all_pk PRIMARY KEY(insp_schd_no,co_cd);


CREATE INDEX mst_insp_schd_all_ie01
ON mst_insp_schd_all USING BTREE (insp_no,co_cd);


CREATE INDEX mst_insp_schd_all_ie02
ON mst_insp_schd_all USING BTREE (src_no3,src_no4,insp_typ,co_cd);


CREATE INDEX mst_insp_schd_all_ie03
ON mst_insp_schd_all USING BTREE (src_no4,insp_typ,co_cd);


CREATE INDEX mst_insp_schd_all_ie04
ON mst_insp_schd_all USING BTREE (src_no1,insp_typ,insp_freq,co_cd);


CREATE INDEX mst_insp_schd_all_ie05
ON mst_insp_schd_all USING BTREE (own_insp_no,insp_schd_sts_typ,co_cd);


CREATE INDEX mst_insp_schd_all_ie06
ON mst_insp_schd_all USING BTREE (own_insp_schd_no,co_cd);


CREATE INDEX mst_insp_schd_all_ie07
ON mst_insp_schd_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,co_cd);


CREATE INDEX mst_insp_schd_all_ie08
ON mst_insp_schd_all USING BTREE (insp_schd_sts_typ,insp_typ,co_cd);


CREATE INDEX mst_insp_schd_all_ie09
ON mst_insp_schd_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,sppl_cd,bp_lot_no,insp_typ,co_cd);


CREATE INDEX mst_insp_schd_all_ie10
ON mst_insp_schd_all USING BTREE (lot_no,co_cd);


CREATE INDEX mst_insp_schd_all_ie11
ON mst_insp_schd_all USING BTREE (mfg_loc_cd,co_cd);


CREATE INDEX mst_insp_schd_all_ie12
ON mst_insp_schd_all USING BTREE (st_tm,co_cd);

