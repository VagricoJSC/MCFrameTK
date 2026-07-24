\encoding UTF-8

CREATE TABLE mst_acxfr_schd_all
(acxfr_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
acxfr_schd_rev numeric (4,0) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
pr_sts_typ varchar (4) NOT NULL,
rqst_dpt_cd varchar (20) NULL,
rqst_usr_cd varchar (500) NULL,
rqst_dt timestamp(0)  NOT NULL,
acxfr_schd_dt timestamp(0)  NOT NULL,
rsn_cd varchar (10) NOT NULL,
bd_dpt_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
alloc_flg char (1) DEFAULT '0' NOT NULL,
inst_typ varchar (1) NOT NULL,
fix_no_typ varchar (1) NOT NULL,
fix_no varchar (15) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_inst_unit_qty numeric (21,8) NULL,
trd_act_unit_qty numeric (21,8) NULL,
base_unit_qty numeric (21,8) DEFAULT 0 NOT NULL,
base_unit_cd varchar (5) NULL,
bd_loc_cd varchar (20) NULL,
bd_ctg_cd varchar (20) NULL,
bd_oper_cd varchar (10) NULL,
bd_bp_cd varchar (20) NULL,
bd_itm_cd varchar (40) NULL,
bd_itm_sub1 varchar (5) NULL,
bd_itm_sub2 varchar (5) NULL,
bd_itm_sub3 varchar (5) NULL,
bd_lot_no varchar (15) NULL,
bd_sublot_no varchar (15) NULL,
bd_sno1 varchar (15) NULL,
bd_sno2 varchar (15) NULL,
bd_sno3 varchar (15) NULL,
bd_sno4 varchar (15) NULL,
dspsl_no varchar (15) NULL,
dspsl_prnt_flg char (1) DEFAULT '0' NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
aprv_flg char (1) DEFAULT '0' NOT NULL,
aprv_no varchar (15) NULL,
aprv_sts_typ varchar (1) NULL,
io_schd_pr_no varchar (15) NULL,
trd_d_rmrks varchar (100) NULL,
dspsl_rmrks varchar (100) NULL,
old_acxfr_schd_no varchar (15) NULL,
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


ALTER TABLE mst_acxfr_schd_all
ADD CONSTRAINT mst_acxfr_schd_all_pk PRIMARY KEY(acxfr_schd_no,co_cd);


CREATE INDEX mst_acxfr_schd_all_ie01
ON mst_acxfr_schd_all USING BTREE (acxfr_schd_dt, co_cd);


CREATE INDEX mst_acxfr_schd_all_ie02
ON mst_acxfr_schd_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_acxfr_schd_all_ie03
ON mst_acxfr_schd_all USING BTREE (loc_cd, co_cd);


CREATE INDEX mst_acxfr_schd_all_ie04
ON mst_acxfr_schd_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_acxfr_schd_all_ie05
ON mst_acxfr_schd_all USING BTREE (dspsl_no, co_cd);


CREATE INDEX mst_acxfr_schd_all_ie06
ON mst_acxfr_schd_all USING BTREE (aprv_no, co_cd);


CREATE INDEX mst_acxfr_schd_all_ie07
ON mst_acxfr_schd_all USING BTREE (io_schd_pr_no, co_cd);

