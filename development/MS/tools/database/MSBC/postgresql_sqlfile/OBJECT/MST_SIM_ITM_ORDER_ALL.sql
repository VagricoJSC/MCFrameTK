\encoding UTF-8

CREATE TABLE mst_sim_itm_order_all
(itm_ord_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
itm_ord_typ varchar (1) NOT NULL,
ord_gnrt_typ varchar (1) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
strg_loc_cd varchar (20) NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
mst_mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
rqst_loc_cd varchar (20) DEFAULT '*' NOT NULL,
rqst_wg_cd varchar (10) NULL,
bom_ptn varchar (40) DEFAULT '*' NOT NULL,
oper_ptn varchar (40) NULL,
inst_qty numeric (21,8) DEFAULT 0 NOT NULL,
yield_schd_qty numeric (21,8) DEFAULT 0 NOT NULL,
not_inst_qty numeric (21,8) DEFAULT 0 NOT NULL,
mfg_inst_unit_typ varchar (1) NULL,
inst_yield_schd_qty numeric (21,8) NULL,
yield_act_qty numeric (21,8) NULL,
purc_act_qty numeric (21,8) NULL,
insp_act_qty numeric (21,8) NULL,
nmr_qty numeric (21,8) NULL,
dnm_qty numeric (21,8) NULL,
fxd_yield_qty numeric (21,8) DEFAULT 0 NOT NULL,
itm_ord_sts_typ varchar (1) NOT NULL,
fix_dt timestamp(0)  NULL,
blk_flg char (1) DEFAULT '0' NOT NULL,
po_schd_dt timestamp(0)  NULL,
mrp_po_schd_dt timestamp(0)  NULL,
po_dt timestamp(0)  NULL,
mrp_purc_lt numeric (9,0) NULL,
purc_lt numeric (9,0) NULL,
act_purc_lt numeric (9,0) NULL,
mfg_st_schd_dt timestamp(0)  NULL,
mrp_mfg_st_schd_dt timestamp(0)  NULL,
inst_mfg_st_schd_dt timestamp(0)  NULL,
mfg_st_act_dt timestamp(0)  NULL,
mfg_end_schd_dt timestamp(0)  NULL,
mrp_mfg_end_schd_dt timestamp(0)  NULL,
inst_mfg_end_schd_dt timestamp(0)  NULL,
mfg_end_act_dt timestamp(0)  NULL,
mrp_mfg_lt numeric (9,0) NULL,
mfg_lt numeric (9,0) NULL,
act_mfg_lt numeric (9,0) NULL,
gi_schd_dt timestamp(0)  NULL,
mrp_gi_schd_dt timestamp(0)  NULL,
inst_gi_schd_dt timestamp(0)  NULL,
gi_act_dt timestamp(0)  NULL,
strg_schd_dt timestamp(0)  NOT NULL,
mrp_strg_schd_dt timestamp(0)  NULL,
inst_strg_schd_dt timestamp(0)  NULL,
strg_act_dt timestamp(0)  NULL,
xfr_lt numeric (9,0) NULL,
accpt_schd_dt timestamp(0)  NULL,
mrp_accpt_schd_dt timestamp(0)  NULL,
inst_accpt_schd_dt timestamp(0)  NULL,
accpt_act_dt timestamp(0)  NULL,
accpt_insp_lt numeric (9,0) NULL,
insp_st_schd_dt timestamp(0)  NULL,
mrp_insp_st_schd_dt timestamp(0)  NULL,
inst_insp_st_schd_dt timestamp(0)  NULL,
insp_st_act_dt timestamp(0)  NULL,
insp_end_schd_dt timestamp(0)  NULL,
mrp_insp_end_schd_dt timestamp(0)  NULL,
inst_insp_end_schd_dt timestamp(0)  NULL,
insp_end_act_dt timestamp(0)  NULL,
insp_lt numeric (9,0) NULL,
insp_offst numeric (9,0) NULL,
mrp_avl_schd_dt timestamp(0)  NULL,
avl_schd_dt timestamp(0)  NOT NULL,
master_dt timestamp(0)  NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno_typ1 varchar (1) NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno_typ2 varchar (1) NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno_typ3 varchar (1) NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sno_typ4 varchar (1) NULL,
lmt_dt timestamp(0)  NULL,
wg_cd varchar (10) NOT NULL,
not_fix_flg char (1) DEFAULT '0' NOT NULL,
ord_fix_pd numeric (3,0) NULL,
rqmt_no varchar (15) NULL,
inst_po_cnt_rmrks varchar (100) NULL,
sim_mrp_no varchar (15) NULL,
io_schd_pr_no varchar (15) NOT NULL,
intr_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
exp_dt timestamp(0)  NULL,
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


ALTER TABLE mst_sim_itm_order_all
ADD CONSTRAINT mst_sim_itm_order_all_pk PRIMARY KEY(itm_ord_no,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie01
ON mst_sim_itm_order_all USING BTREE (itm_ord_typ,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie02
ON mst_sim_itm_order_all USING BTREE (wg_cd,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie03
ON mst_sim_itm_order_all USING BTREE (strg_loc_cd,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie04
ON mst_sim_itm_order_all USING BTREE (mfg_loc_cd,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie05
ON mst_sim_itm_order_all USING BTREE (sppl_cd,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie06
ON mst_sim_itm_order_all USING BTREE (rqst_loc_cd,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie07
ON mst_sim_itm_order_all USING BTREE (maker_cd,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie08
ON mst_sim_itm_order_all USING BTREE (rqst_wg_cd,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie09
ON mst_sim_itm_order_all USING BTREE (sno1,sno2,sno3,sno4,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie10
ON mst_sim_itm_order_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd,sno1,sno2,sno3,sno4,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie11
ON mst_sim_itm_order_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,mfg_loc_cd,sppl_cd,maker_cd,rqst_loc_cd,bom_ptn,wg_cd,master_dt,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie12
ON mst_sim_itm_order_all USING BTREE (rqmt_no,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie13
ON mst_sim_itm_order_all USING BTREE (sim_mrp_no,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie14
ON mst_sim_itm_order_all USING BTREE (ver_no,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie15
ON mst_sim_itm_order_all USING BTREE (not_fix_flg,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie16
ON mst_sim_itm_order_all USING BTREE (exp_dt,co_cd);


CREATE INDEX mst_sim_itm_order_all_ie17
ON mst_sim_itm_order_all USING BTREE (sim_mrp_no,mfg_end_schd_dt,mfg_st_schd_dt,itm_ord_typ,mfg_loc_cd,exp_dt,co_cd);

