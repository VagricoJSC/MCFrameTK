\encoding UTF-8

CREATE TABLE mgt_itm_mfg_inst_all
(calc_ctg_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
mfg_act_no varchar (15) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
mng_dpt_cd varchar (20) NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
iv_no varchar (15) NULL,
asst_typ varchar (1) NULL,
qty numeric (21,8) NULL,
schd_st_dt timestamp(0)  NULL,
schd_end_dt timestamp(0)  NULL,
act_st_dt timestamp(0)  NULL,
act_end_dt timestamp(0)  NULL,
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


ALTER TABLE mgt_itm_mfg_inst_all
ADD CONSTRAINT mgt_itm_mfg_inst_all_pk PRIMARY KEY(calc_ctg_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_mfg_inst_no,mfg_act_no,co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie01
ON mgt_itm_mfg_inst_all USING BTREE (itm_mfg_inst_no, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie02
ON mgt_itm_mfg_inst_all USING BTREE (lot_no, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie03
ON mgt_itm_mfg_inst_all USING BTREE (sublot_no, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie04
ON mgt_itm_mfg_inst_all USING BTREE (sno1, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie05
ON mgt_itm_mfg_inst_all USING BTREE (sno2, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie06
ON mgt_itm_mfg_inst_all USING BTREE (sno3, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie07
ON mgt_itm_mfg_inst_all USING BTREE (sno4, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie08
ON mgt_itm_mfg_inst_all USING BTREE (sppl_cd, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie09
ON mgt_itm_mfg_inst_all USING BTREE (po_no, co_cd);


CREATE INDEX mgt_itm_mfg_inst_all_ie10
ON mgt_itm_mfg_inst_all USING BTREE (iv_no, co_cd);

