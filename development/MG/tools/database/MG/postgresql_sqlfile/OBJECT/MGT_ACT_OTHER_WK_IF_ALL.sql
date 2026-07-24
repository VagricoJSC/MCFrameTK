\encoding UTF-8

CREATE TABLE mgt_act_other_wk_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
mfg_act_grp varchar (100) NULL,
dpt_cd varchar (20) NULL,
ctg_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
wk_cost_cd varchar (10) NOT NULL,
wk_rsn_cd varchar (10) NULL,
wk_cost numeric (21,8) NOT NULL,
no_pln_flg char (1) DEFAULT '0' NOT NULL,
wk_act_no varchar (15) NULL,
scm_if_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_act_other_wk_if_all
ADD CONSTRAINT mgt_act_other_wk_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie01
ON mgt_act_other_wk_if_all USING BTREE (ym, wg_cd, calc_ctg_cd, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie02
ON mgt_act_other_wk_if_all USING BTREE (dpt_cd, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie03
ON mgt_act_other_wk_if_all USING BTREE (ctg_cd, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie04
ON mgt_act_other_wk_if_all USING BTREE (loc_cd, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie05
ON mgt_act_other_wk_if_all USING BTREE (oper_cd, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie06
ON mgt_act_other_wk_if_all USING BTREE (lot_no, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie07
ON mgt_act_other_wk_if_all USING BTREE (sublot_no, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie08
ON mgt_act_other_wk_if_all USING BTREE (sno1, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie09
ON mgt_act_other_wk_if_all USING BTREE (sno2, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie10
ON mgt_act_other_wk_if_all USING BTREE (sno3, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie11
ON mgt_act_other_wk_if_all USING BTREE (sno4, co_cd);


CREATE INDEX mgt_act_other_wk_if_all_ie12
ON mgt_act_other_wk_if_all USING BTREE (wk_cost_cd, co_cd);

