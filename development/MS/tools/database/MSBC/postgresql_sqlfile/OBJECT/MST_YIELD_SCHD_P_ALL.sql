\encoding UTF-8

CREATE TABLE mst_yield_schd_p_all
(yield_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
mfg_inst_rev numeric (4,0) NOT NULL,
mfg_inst_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
oper_inst_no varchar (15) NOT NULL,
io_schd_pr_no varchar (15) NOT NULL,
yield_typ varchar (1) NOT NULL,
schd_tm timestamp(0)  NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
trd_unit_yield_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_yield_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
strg_loc_cd varchar (20) NOT NULL,
strg_str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
bkf_typ varchar (1) NULL,
par_inst_qty numeric (21,8) NULL,
chd_inpt_qty numeric (21,8) NULL,
chd_rqmt_qty numeric (21,8) NULL,
fxd_chd_rqmt_qty numeric (21,8) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
disp_seq numeric (9,0) NOT NULL,
intr_rmrks varchar (100) NULL,
inst_rpt_rmrks varchar (100) NULL,
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


ALTER TABLE mst_yield_schd_p_all
ADD CONSTRAINT mst_yield_schd_p_all_pk UNIQUE(yield_schd_no,co_cd,mfg_inst_rev,mfg_inst_no);


CREATE INDEX mst_yield_schd_p_all_ie01
ON mst_yield_schd_p_all USING BTREE (mfg_inst_no, co_cd, mfg_inst_rev);


CREATE UNIQUE INDEX mst_yield_schd_p_all_pk_ie ON mst_yield_schd_p_all (yield_schd_no,co_cd,mfg_inst_rev,COALESCE(mfg_inst_no,''));

