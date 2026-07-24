\encoding UTF-8

CREATE TABLE mgt_acc_inpt_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
inpt_rec_no numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
top_rec_no numeric (9,0) NOT NULL,
lvl numeric (3,0) NOT NULL,
wg_cd varchar (10) NULL,
ym timestamp(0)  NULL,
ac_dt timestamp(0)  NULL,
mng_dpt_cd varchar (20) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
mfg_purc_typ varchar (1) NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
oper_act_no varchar (15) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
ac_slip_typ varchar (5) NULL,
ac_rsn_cd varchar (10) NULL,
asst_typ varchar (1) NOT NULL,
act_qty numeric (21,8) NOT NULL,
std_qty numeric (21,8) NOT NULL,
act_upri numeric (21,8) NULL,
std_upri numeric (21,8) NULL,
repurc_obli_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_acc_inpt_all
ADD CONSTRAINT mgt_acc_inpt_all_pk PRIMARY KEY(calc_no,calc_grp_cd,inpt_rec_no,co_cd);


CREATE INDEX mgt_acc_inpt_all_ie01
ON mgt_acc_inpt_all USING BTREE (top_rec_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_inpt_all_ie02
ON mgt_acc_inpt_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_inpt_all_ie03
ON mgt_acc_inpt_all USING BTREE (lvl, calc_no, calc_grp_cd, co_cd);

