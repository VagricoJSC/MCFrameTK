\encoding UTF-8

CREATE TABLE mgt_act_inst_wip_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
oper_act_no varchar (15) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
ac_rsn_cd varchar (10) NULL,
wip_qty numeric (21,8) NOT NULL,
wip_per numeric (5,2) NOT NULL,
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


ALTER TABLE mgt_act_inst_wip_if_all
ADD CONSTRAINT mgt_act_inst_wip_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mgt_act_inst_wip_if_all_ie01
ON mgt_act_inst_wip_if_all USING BTREE (ym, wg_cd, calc_ctg_cd, co_cd);


CREATE INDEX mgt_act_inst_wip_if_all_ie02
ON mgt_act_inst_wip_if_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mgt_act_inst_wip_if_all_ie03
ON mgt_act_inst_wip_if_all USING BTREE (itm_mfg_inst_no, co_cd);


CREATE INDEX mgt_act_inst_wip_if_all_ie04
ON mgt_act_inst_wip_if_all USING BTREE (oper_act_no, co_cd);


CREATE INDEX mgt_act_inst_wip_if_all_ie05
ON mgt_act_inst_wip_if_all USING BTREE (loc_cd, co_cd);

