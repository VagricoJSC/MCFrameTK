\encoding UTF-8

CREATE TABLE mam_itm_dtl_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
rqst_loc_cd varchar (20) DEFAULT '*' NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
bom_ptn varchar (40) DEFAULT '*' NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
oper_ptn varchar (40) DEFAULT '*' NULL,
mfg_lt numeric (9,0) NULL,
mfg_lt_add_qty numeric (21,8) NULL,
purc_lt numeric (9,0) NULL,
purc_lt_add_qty numeric (21,8) NULL,
purc_basis_typ varchar (1) NULL,
accpt_insp_lt numeric (9,0) NULL,
buf_lt numeric (9,0) NULL,
ord_fix_pd numeric (3,0) NULL,
sz_day_week_typ varchar (1) NULL,
sz_week numeric (3,0) NULL,
lot_sz_pd numeric (3,0) NULL,
min_lot_qty numeric (21,8) NOT NULL,
batch_lot_qty numeric (21,8) NOT NULL,
max_lot_qty numeric (21,8) NOT NULL,
max_order numeric (9,0) NULL,
prio numeric (9,0) NULL,
order_ratio numeric (21,8) NOT NULL,
yield_schd_qty numeric (21,8) NOT NULL,
mfg_inst_qty numeric (21,8) NOT NULL,
fxd_rqmt_qty numeric (21,8) NULL,
lot_issue_typ varchar (1) NULL,
bkf_flg char (1) DEFAULT '0' NOT NULL,
ln_stk_flg char (1) DEFAULT '0' NOT NULL,
pre_po_tgt_flg char (1) DEFAULT '0' NOT NULL,
inst_rec_issue_flg char (1) DEFAULT '0' NOT NULL,
no_mfg_aprv_flg char (1) DEFAULT '0' NOT NULL,
itm_lower_yield numeric (6,3) NULL,
itm_std_yield numeric (6,3) NULL,
itm_upper_yield numeric (6,3) NULL,
purc_id_typ varchar (1) NULL,
rqst_wg_cd varchar (10) NULL,
po_batch_flg char (1) DEFAULT '0' NOT NULL,
rsrc_std_qty1 numeric (21,8) NULL,
rsrc_unit_qty1 numeric (21,8) NULL,
rsrc_std_qty2 numeric (21,8) NULL,
rsrc_unit_qty2 numeric (21,8) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
not_mrp_flg char (1) DEFAULT '0' NOT NULL,
cost_ratio numeric (21,8) NULL,
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


ALTER TABLE mam_itm_dtl_all
ADD CONSTRAINT mam_itm_dtl_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,mfg_loc_cd,sppl_cd,maker_cd,rqst_loc_cd,wg_cd,bom_ptn,st_dt,co_cd);


CREATE INDEX mam_itm_dtl_all_ie01
ON mam_itm_dtl_all USING BTREE (mfg_loc_cd);


CREATE INDEX mam_itm_dtl_all_ie02
ON mam_itm_dtl_all USING BTREE (sppl_cd);


CREATE INDEX mam_itm_dtl_all_ie03
ON mam_itm_dtl_all USING BTREE (rqst_loc_cd);


CREATE INDEX mam_itm_dtl_all_ie04
ON mam_itm_dtl_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd,del_flg,co_cd);

