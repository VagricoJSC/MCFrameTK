\encoding UTF-8

CREATE TABLE mst_itm_mfg_inst_all
(itm_mfg_inst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
itm_ord_no varchar (15) NOT NULL,
io_schd_pr_no varchar (15) NOT NULL,
frst_mfg_inst_no varchar (15) NOT NULL,
mfg_mtd_typ varchar (1) NOT NULL,
sppl_cd varchar (20) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
oper_ptn varchar (40) DEFAULT '*' NOT NULL,
bom_ptn varchar (40) NOT NULL,
base_unit_yield_qty numeric (21,8) NOT NULL,
base_unit_inst_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
master_dt timestamp(0)  NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
unschd_inst_flg char (1) DEFAULT '0' NOT NULL,
unschd_act_flg char (1) DEFAULT '0' NOT NULL,
strg_loc_cd varchar (20) NOT NULL,
strg_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
mfg_loc_cd varchar (20) NOT NULL,
mfg_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
wg_cd varchar (10) NOT NULL,
site_cd varchar (10) NOT NULL,
itm_lower_yield numeric (6,3) NULL,
itm_std_yield numeric (6,3) NULL,
itm_upper_yield numeric (6,3) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_itm_mfg_inst_all
ADD CONSTRAINT mst_itm_mfg_inst_all_pk PRIMARY KEY(itm_mfg_inst_no,co_cd);


CREATE INDEX mst_itm_mfg_inst_all_ie01
ON mst_itm_mfg_inst_all USING BTREE (frst_mfg_inst_no,co_cd);


CREATE INDEX mst_itm_mfg_inst_all_ie02
ON mst_itm_mfg_inst_all USING BTREE (itm_ord_no,co_cd);


CREATE INDEX mst_itm_mfg_inst_all_ie03
ON mst_itm_mfg_inst_all USING BTREE (io_schd_pr_no,co_cd);


CREATE INDEX mst_itm_mfg_inst_all_ie04
ON mst_itm_mfg_inst_all USING BTREE (sppl_cd,co_cd);


CREATE INDEX mst_itm_mfg_inst_all_ie05
ON mst_itm_mfg_inst_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,co_cd);


CREATE INDEX mst_itm_mfg_inst_all_ie06
ON mst_itm_mfg_inst_all USING BTREE (lot_no,co_cd);


CREATE INDEX mst_itm_mfg_inst_all_ie07
ON mst_itm_mfg_inst_all USING BTREE (mfg_loc_cd,co_cd);


CREATE INDEX mst_itm_mfg_inst_all_ie08
ON mst_itm_mfg_inst_all USING BTREE (strg_loc_cd,co_cd);

