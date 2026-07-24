\encoding UTF-8

CREATE TABLE mgt_acc_cost_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
inpt_rec_no numeric (9,0) NOT NULL,
wk_rec_no numeric (9,0) NULL,
oper_act_no varchar (15) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
expns_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
act_cost numeric (21,8) NOT NULL,
std_cost numeric (21,8) NOT NULL,
sml_inpt_rec_no numeric (9,0) NOT NULL,
top_rec_no numeric (9,0) NOT NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
oper_cost_flg char (1) DEFAULT '0' NOT NULL,
expns_typ varchar (1) NOT NULL,
diff_qty numeric (21,8) NOT NULL,
diff_wk numeric (21,8) NOT NULL,
diff_up numeric (21,8) NOT NULL,
diff_rt numeric (21,8) NOT NULL,
diff_std numeric (21,8) NOT NULL,
diff_a numeric (21,8) NOT NULL,
diff_b numeric (21,8) NOT NULL,
diff_c numeric (21,8) NOT NULL,
diff_d numeric (21,8) NOT NULL,
diff_e numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_acc_cost_all
ADD CONSTRAINT mgt_acc_cost_all_pk UNIQUE(calc_no,calc_grp_cd,inpt_rec_no,wk_rec_no,oper_act_no,oper_cd,oper_seq,expns_cd,co_cd);


CREATE INDEX mgt_acc_cost_all_ie01
ON mgt_acc_cost_all USING BTREE (inpt_rec_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_cost_all_ie02
ON mgt_acc_cost_all USING BTREE (wk_rec_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_cost_all_ie03
ON mgt_acc_cost_all USING BTREE (oper_act_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_cost_all_ie04
ON mgt_acc_cost_all USING BTREE (oper_cd, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_cost_all_ie05
ON mgt_acc_cost_all USING BTREE (sml_inpt_rec_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_cost_all_ie06
ON mgt_acc_cost_all USING BTREE (top_rec_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_acc_cost_all_ie07
ON mgt_acc_cost_all USING BTREE (loc_cd, calc_no, calc_grp_cd, co_cd);


CREATE UNIQUE INDEX mgt_acc_cost_all_pk_ie ON mgt_acc_cost_all (calc_no,calc_grp_cd,inpt_rec_no,COALESCE(wk_rec_no,0),COALESCE(oper_act_no,''),COALESCE(oper_cd,''),COALESCE(oper_seq,0),expns_cd,co_cd);

