\encoding UTF-8

CREATE TABLE mgt_pre_alc_path_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
pre_alc_seq numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
inpt_alc_typ varchar (1) NULL,
wg_cd varchar (10) NOT NULL,
alc_ac_cd varchar (20) NOT NULL,
dpt_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
bp_cd varchar (20) NULL,
ctg_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
itm_mfg_inst_no varchar (15) NULL,
iv_no varchar (15) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
amt numeric (21,8) NOT NULL,
pre_alc_rate numeric (21,8) NULL,
pre_alc_total numeric (21,8) NULL,
pre_alc_calc_rate numeric (21,8) NULL,
pre_alc_rate_cd varchar (20) NULL,
src_wg_cd varchar (10) NOT NULL,
src_pre_alc_seq numeric (9,0) NULL,
top_pre_alc_seq numeric (9,0) NOT NULL,
pre_alc_lvl numeric (3,0) NOT NULL,
fin_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_pre_alc_path_all
ADD CONSTRAINT mgt_pre_alc_path_all_pk PRIMARY KEY(calc_no,calc_grp_cd,pre_alc_seq,co_cd);


CREATE INDEX mgt_pre_alc_path_all_ie01
ON mgt_pre_alc_path_all USING BTREE (pre_alc_lvl, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_pre_alc_path_all_ie02
ON mgt_pre_alc_path_all USING BTREE (alc_ac_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_pre_alc_path_all_ie03
ON mgt_pre_alc_path_all USING BTREE (dpt_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_pre_alc_path_all_ie04
ON mgt_pre_alc_path_all USING BTREE (src_pre_alc_seq, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_pre_alc_path_all_ie05
ON mgt_pre_alc_path_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);

