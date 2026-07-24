\encoding UTF-8

CREATE TABLE mgt_alc_calc_rate_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
alc_grp_id numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
inpt_alc_typ varchar (1) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
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
alc_tgt_val numeric (21,8) NOT NULL,
alc_rate numeric (21,8) NOT NULL,
alc_amt numeric (21,8) NOT NULL,
trd_alc_tgt_val numeric (21,8) NOT NULL,
trd_alc_amt numeric (21,8) NOT NULL,
std_alc_rate numeric (21,8) NOT NULL,
std_alc_amt numeric (21,8) NOT NULL,
std_alc_tgt_val numeric (21,8) NULL,
expns_cd varchar (20) NOT NULL,
alc_ptn_cd varchar (10) NOT NULL,
diff_calc_typ varchar (1) NULL,
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


ALTER TABLE mgt_alc_calc_rate_all
ADD CONSTRAINT mgt_alc_calc_rate_all_pk PRIMARY KEY(calc_no,calc_grp_cd,alc_grp_id,co_cd);


CREATE INDEX mgt_alc_calc_rate_all_ie01
ON mgt_alc_calc_rate_all USING BTREE (alc_ac_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_rate_all_ie02
ON mgt_alc_calc_rate_all USING BTREE (ym, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_rate_all_ie03
ON mgt_alc_calc_rate_all USING BTREE (dpt_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_rate_all_ie04
ON mgt_alc_calc_rate_all USING BTREE (alc_grp_id, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_alc_calc_rate_all_ie05
ON mgt_alc_calc_rate_all USING BTREE (wg_cd, calc_no, calc_grp_cd, co_cd);

