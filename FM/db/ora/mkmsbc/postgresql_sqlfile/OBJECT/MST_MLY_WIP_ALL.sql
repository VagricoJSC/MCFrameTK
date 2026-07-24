\encoding UTF-8

CREATE TABLE mst_mly_wip_all
(ym timestamp(0)  NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
mfg_act_no varchar (15) NULL,
co_cd varchar (10) NOT NULL,
itm_ord_no varchar (15) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
asst_typ varchar (1) NOT NULL,
in_xfr_typ varchar (1) NOT NULL,
quality_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
gd_cd varchar (2) NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
st_ac_dt timestamp(0)  NULL,
base_unit_schd_qty numeric (21,8) NOT NULL,
base_unit_act_qty numeric (21,8) NOT NULL,
end_ac_dt timestamp(0)  NULL,
base_unit_cd varchar (5) NULL,
base_unit_wip_qty numeric (21,8) NOT NULL,
wip_rate numeric (5,2) NOT NULL,
cmpl_flg char (1) DEFAULT '0' NOT NULL,
closing_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_mly_wip_all
ADD CONSTRAINT mst_mly_wip_all_pk UNIQUE(ym,itm_mfg_inst_no,mfg_act_no,co_cd);


CREATE INDEX mst_mly_wip_all_ie01
ON mst_mly_wip_all USING BTREE (itm_mfg_inst_no,ym,co_cd);


CREATE INDEX mst_mly_wip_all_ie02
ON mst_mly_wip_all USING BTREE (mfg_act_no,ym,co_cd);


CREATE INDEX mst_mly_wip_all_ie03
ON mst_mly_wip_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);


CREATE INDEX mst_mly_wip_all_ie04
ON mst_mly_wip_all USING BTREE (loc_cd,co_cd);


CREATE INDEX mst_mly_wip_all_ie05
ON mst_mly_wip_all USING BTREE (lot_no,co_cd);


CREATE UNIQUE INDEX mst_mly_wip_all_pk_ie ON mst_mly_wip_all (ym,itm_mfg_inst_no,COALESCE(mfg_act_no,''),co_cd);

