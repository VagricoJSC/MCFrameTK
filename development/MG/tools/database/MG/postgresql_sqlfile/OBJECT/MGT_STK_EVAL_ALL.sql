\encoding UTF-8

CREATE TABLE mgt_stk_eval_all
(calc_ctg_cd varchar (10) NOT NULL,
stk_eval_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
mng_dpt_cd varchar (20) NULL,
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
asst_typ varchar (1) NULL,
co_cd varchar (10) NOT NULL,
base_qty numeric (21,8) NOT NULL,
upri numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_stk_eval_all
ADD CONSTRAINT mgt_stk_eval_all_pk UNIQUE(calc_ctg_cd,stk_eval_cd,wg_cd,ym,mng_dpt_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,asst_typ,co_cd);


CREATE INDEX mgt_stk_eval_all_ie01
ON mgt_stk_eval_all USING BTREE (ym, co_cd);


CREATE INDEX mgt_stk_eval_all_ie02
ON mgt_stk_eval_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mgt_stk_eval_all_ie03
ON mgt_stk_eval_all USING BTREE (lot_no, co_cd);


CREATE INDEX mgt_stk_eval_all_ie04
ON mgt_stk_eval_all USING BTREE (sublot_no, co_cd);


CREATE INDEX mgt_stk_eval_all_ie05
ON mgt_stk_eval_all USING BTREE (sno1, co_cd);


CREATE INDEX mgt_stk_eval_all_ie06
ON mgt_stk_eval_all USING BTREE (sno2, co_cd);


CREATE INDEX mgt_stk_eval_all_ie07
ON mgt_stk_eval_all USING BTREE (sno3, co_cd);


CREATE INDEX mgt_stk_eval_all_ie08
ON mgt_stk_eval_all USING BTREE (sno4, co_cd);


CREATE UNIQUE INDEX mgt_stk_eval_all_pk_ie ON mgt_stk_eval_all (calc_ctg_cd,stk_eval_cd,wg_cd,ym,COALESCE(mng_dpt_cd,''),itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,COALESCE(asst_typ,''),co_cd);

