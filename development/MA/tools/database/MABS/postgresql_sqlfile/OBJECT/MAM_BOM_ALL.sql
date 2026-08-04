\encoding UTF-8

CREATE TABLE mam_bom_all
(bom_key varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
par_itm_cd varchar (40) NOT NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
bom_ptn varchar (40) NOT NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
chd_itm_cd varchar (40) NULL,
chd_itm_sub1 varchar (5) NULL,
chd_itm_sub2 varchar (5) NULL,
chd_itm_sub3 varchar (5) NULL,
ver_no varchar (10) NULL,
ph_flg char (1) DEFAULT '0' NOT NULL,
ph_bom_ptn varchar (40) NULL,
alt_itm_flg char (1) DEFAULT '0' NOT NULL,
alt_grp_cd varchar (40) NULL,
alt_itm_typ varchar (1) NULL,
alt_itm_ratio numeric (9,0) NULL,
alt_alloc_prio numeric (9,0) NULL,
sno_typ1 varchar (1) NOT NULL,
sno_typ2 varchar (1) NOT NULL,
sno_typ3 varchar (1) NOT NULL,
sno_typ4 varchar (1) NOT NULL,
min_sno1 varchar (20) NULL,
max_sno1 varchar (20) NULL,
min_sno2 varchar (15) NULL,
max_sno2 varchar (15) NULL,
min_sno3 varchar (15) NULL,
max_sno3 varchar (15) NULL,
min_sno4 varchar (15) NULL,
max_sno4 varchar (15) NULL,
par_inst_qty numeric (21,8) NOT NULL,
chd_inpt_qty numeric (21,8) NOT NULL,
chd_rqmt_qty numeric (21,8) NOT NULL,
fxd_chd_rqmt_qty numeric (21,8) NOT NULL,
byprod_flg char (1) DEFAULT '0' NOT NULL,
in_offst_typ varchar (1) NOT NULL,
in_offst numeric (9,0) NOT NULL,
bkf_typ varchar (1) NOT NULL,
inst_lot_fix_flg char (1) DEFAULT '0' NOT NULL,
lot_mix_flg char (1) DEFAULT '0' NOT NULL,
sublot_mix_flg char (1) DEFAULT '0' NOT NULL,
alloc_ctl_typ varchar (1) NOT NULL,
main_itm_flg char (1) DEFAULT '0' NOT NULL,
yield_calc_flg char (1) DEFAULT '0' NOT NULL,
inpt_ctl_typ varchar (1) NOT NULL,
disp_seq numeric (9,0) NOT NULL,
chng_no varchar (20) NULL,
ext_sys_no_bom varchar (20) NULL,
not_cost_flg char (1) DEFAULT '0' NOT NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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


ALTER TABLE mam_bom_all
ADD CONSTRAINT mam_bom_all_pk PRIMARY KEY(bom_key,co_cd);


CREATE INDEX mam_bom_all_ie01
ON mam_bom_all USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3);


CREATE INDEX mam_bom_all_ie02
ON mam_bom_all USING BTREE (chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3);


CREATE INDEX mam_bom_all_ie03
ON mam_bom_all USING BTREE (ver_no);


CREATE INDEX mam_bom_all_ie04
ON mam_bom_all USING BTREE (oper_cd);


CREATE INDEX mam_bom_all_ie05
ON mam_bom_all USING BTREE (chng_no);


CREATE INDEX mam_bom_all_ie06
ON mam_bom_all USING BTREE (ext_sys_no_bom);


CREATE INDEX mam_bom_all_ie07
ON mam_bom_all USING BTREE (memo1);


CREATE INDEX mam_bom_all_ie08
ON mam_bom_all USING BTREE (memo2);


CREATE INDEX mam_bom_all_ie09
ON mam_bom_all USING BTREE (memo3);


CREATE INDEX mam_bom_all_ie10
ON mam_bom_all USING BTREE (alt_itm_flg);


CREATE INDEX mam_bom_all_ie11
ON mam_bom_all USING BTREE (alt_grp_cd);

