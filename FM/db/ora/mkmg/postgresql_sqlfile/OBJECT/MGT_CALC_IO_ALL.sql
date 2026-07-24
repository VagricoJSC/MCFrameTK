\encoding UTF-8

CREATE TABLE mgt_calc_io_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
act_io_id varchar (20) NOT NULL,
act_io_id_sub varchar (3) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
mng_dpt_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_ext varchar (100) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
cost_io_typ varchar (2) NOT NULL,
ac_slip_typ varchar (5) NOT NULL,
ac_rsn_cd varchar (10) NULL,
other_wg_cd varchar (10) NULL,
other_dpt_cd varchar (20) NULL,
bp_cd varchar (20) NULL,
stk_bp_cd varchar (20) NULL,
asst_typ varchar (1) NOT NULL,
qty numeric (21,8) NOT NULL,
amt numeric (21,8) NULL,
cur_cd varchar (3) NULL,
cur_amt numeric (21,8) NULL,
xrate numeric (21,8) NULL,
trd_grp varchar (50) NULL,
trd_ratio numeric (21,8) NULL,
alc_ac_cd varchar (20) NULL,
alc_amt_flg char (1) DEFAULT '0' NOT NULL,
alc_wg_cd varchar (10) NULL,
alc_ptn_cd varchar (10) NULL,
expns_cd varchar (20) NULL,
alc_dpt_cd varchar (20) NULL,
alc_loc_cd varchar (20) NULL,
alc_oper_cd varchar (10) NULL,
alc_bp_cd varchar (20) NULL,
alc_ctg_cd varchar (20) NULL,
alc_itm_cd varchar (40) NULL,
alc_itm_sub1 varchar (5) NULL,
alc_itm_sub2 varchar (5) NULL,
alc_itm_sub3 varchar (5) NULL,
alc_lot_no varchar (15) NULL,
alc_sublot_no varchar (15) NULL,
alc_sno1 varchar (15) NULL,
alc_sno2 varchar (15) NULL,
alc_sno3 varchar (15) NULL,
alc_sno4 varchar (15) NULL,
alc_itm_mfg_inst_no varchar (15) NULL,
rec_eval_typ varchar (1) NULL,
eval_loop_flg char (1) DEFAULT '0' NOT NULL,
zero_effect_flg char (1) DEFAULT '0' NOT NULL,
calc_ctg_cd varchar (10) NULL
);


ALTER TABLE mgt_calc_io_all
ADD CONSTRAINT mgt_calc_io_all_pk PRIMARY KEY(calc_no,calc_grp_cd,act_io_id,act_io_id_sub,co_cd);


CREATE INDEX mgt_calc_io_all_ie01
ON mgt_calc_io_all USING BTREE (cost_io_typ, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_calc_io_all_ie02
ON mgt_calc_io_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_calc_io_all_ie03
ON mgt_calc_io_all USING BTREE (alc_ac_cd, calc_no, calc_grp_cd, co_cd);

