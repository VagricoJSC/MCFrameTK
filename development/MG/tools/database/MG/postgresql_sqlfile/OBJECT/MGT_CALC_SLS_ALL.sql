\encoding UTF-8

CREATE TABLE mgt_calc_sls_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
act_sls_id varchar (20) NOT NULL,
act_sls_id_sub varchar (3) NOT NULL,
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
ac_slip_typ varchar (5) NOT NULL,
ac_rsn_cd varchar (10) NULL,
asst_typ varchar (1) NOT NULL,
qty numeric (21,8) NOT NULL,
amt numeric (21,8) NULL,
cur_cd varchar (3) NULL,
cur_amt numeric (21,8) NULL,
xrate numeric (21,8) NULL,
cst_cd varchar (20) NULL,
dlv_cd varchar (20) NULL,
sls_dpt_cd varchar (20) NULL,
sls_usr_cd varchar (500) NULL,
po_no varchar (15) NULL,
slo_no varchar (15) NULL,
iv_no varchar (15) NULL,
stk_bp_cd varchar (20) NULL,
alc_dpt_cd varchar (20) NULL,
dest_cd1 varchar (20) NULL,
dest_cd2 varchar (20) NULL,
dest_cd3 varchar (20) NULL,
cost_sls_cd1 varchar (10) NULL,
cost_sls_cd2 varchar (10) NULL,
cost_sls_cd3 varchar (10) NULL,
cost_sls_cd4 varchar (10) NULL,
cost_sls_cd5 varchar (10) NULL,
alc_val1 numeric (21,8) NULL,
alc_val2 numeric (21,8) NULL,
alc_val3 numeric (21,8) NULL,
alc_val4 numeric (21,8) NULL,
alc_val5 numeric (21,8) NULL,
rec_eval_typ varchar (1) NULL,
zero_effect_flg char (1) DEFAULT '0' NOT NULL
);


ALTER TABLE mgt_calc_sls_all
ADD CONSTRAINT mgt_calc_sls_all_pk PRIMARY KEY(calc_no,calc_grp_cd,act_sls_id,act_sls_id_sub,co_cd);


CREATE INDEX mgt_calc_sls_all_ie01
ON mgt_calc_sls_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);

