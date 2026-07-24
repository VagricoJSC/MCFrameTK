\encoding UTF-8

CREATE TABLE mgt_act_inpt_all
(act_inpt_id varchar (20) NOT NULL,
act_inpt_id_sub varchar (3) NOT NULL,
co_cd varchar (10) NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
par_itm_cd varchar (40) NOT NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
oper_act_no varchar (15) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
mng_dpt_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
ac_slip_typ varchar (5) NOT NULL,
ac_rsn_cd varchar (10) NULL,
bp_cd varchar (20) NULL,
stk_bp_cd varchar (20) NULL,
asst_typ varchar (1) NOT NULL,
mfg_act_grp varchar (100) NULL,
qty numeric (21,8) NOT NULL,
amt numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
trd_cur_amt numeric (21,8) NULL,
xrate numeric (21,8) NULL,
rec_eval_typ varchar (1) NULL,
expns_cd varchar (20) NULL,
eval_loop_flg char (1) DEFAULT '0' NOT NULL,
zero_effect_flg char (1) DEFAULT '0' NOT NULL,
rmrks varchar (100) NULL,
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


ALTER TABLE mgt_act_inpt_all
ADD CONSTRAINT mgt_act_inpt_all_pk PRIMARY KEY(act_inpt_id,act_inpt_id_sub,co_cd);


CREATE INDEX mgt_act_inpt_all_ie01
ON mgt_act_inpt_all USING BTREE (ym, wg_cd, calc_ctg_cd, co_cd);


CREATE INDEX mgt_act_inpt_all_ie02
ON mgt_act_inpt_all USING BTREE (par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3, co_cd);


CREATE INDEX mgt_act_inpt_all_ie03
ON mgt_act_inpt_all USING BTREE (itm_mfg_inst_no, co_cd);


CREATE INDEX mgt_act_inpt_all_ie04
ON mgt_act_inpt_all USING BTREE (oper_act_no, co_cd);


CREATE INDEX mgt_act_inpt_all_ie05
ON mgt_act_inpt_all USING BTREE (loc_cd, co_cd);


CREATE INDEX mgt_act_inpt_all_ie06
ON mgt_act_inpt_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mgt_act_inpt_all_ie07
ON mgt_act_inpt_all USING BTREE (lot_no, co_cd);


CREATE INDEX mgt_act_inpt_all_ie08
ON mgt_act_inpt_all USING BTREE (sublot_no, co_cd);


CREATE INDEX mgt_act_inpt_all_ie09
ON mgt_act_inpt_all USING BTREE (sno1, co_cd);


CREATE INDEX mgt_act_inpt_all_ie10
ON mgt_act_inpt_all USING BTREE (sno2, co_cd);


CREATE INDEX mgt_act_inpt_all_ie11
ON mgt_act_inpt_all USING BTREE (sno3, co_cd);


CREATE INDEX mgt_act_inpt_all_ie12
ON mgt_act_inpt_all USING BTREE (sno4, co_cd);


CREATE INDEX mgt_act_inpt_all_ie13
ON mgt_act_inpt_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, ym, wg_cd, calc_ctg_cd, co_cd);

