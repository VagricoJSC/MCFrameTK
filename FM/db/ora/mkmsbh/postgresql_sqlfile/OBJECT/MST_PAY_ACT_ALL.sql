\encoding UTF-8

CREATE TABLE mst_pay_act_all
(pay_act_no varchar (15) NOT NULL,
pay_act_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
pay_act_rev numeric (4,0) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
psppl_cd varchar (20) NOT NULL,
pay_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
pay_usr_cd varchar (500) NULL,
pay_act_dt timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
ac_ym timestamp(0)  NOT NULL,
pay_basis_dt timestamp(0)  NULL,
trd_cur_cd varchar (3) NOT NULL,
base_cur_cd varchar (3) NULL,
xrate_cd varchar (2) NOT NULL,
xrate numeric (21,8) NOT NULL,
ap_sttl_cd varchar (10) NULL,
ap_sttl_typ varchar (1) NULL,
bank_ac_cd varchar (40) NULL,
pay_bank_ac_cd varchar (40) NULL,
ap_setoff_typ varchar (1) NULL,
setoff_cd varchar (20) NULL,
setoff_nm varchar (100) NULL,
so_dpt_cd varchar (20) NULL,
schd_act_flg char (1) DEFAULT '0' NOT NULL,
trd_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
par_pay_act_no varchar (15) NULL,
par_pay_act_seq numeric (4,0) NULL,
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


ALTER TABLE mst_pay_act_all
ADD CONSTRAINT mst_pay_act_all_pk PRIMARY KEY(pay_act_no,pay_act_seq,co_cd);


CREATE INDEX mst_pay_act_all_ie01
ON mst_pay_act_all USING BTREE (psppl_cd,co_cd);


CREATE INDEX mst_pay_act_all_ie02
ON mst_pay_act_all USING BTREE (pay_dpt_cd,co_cd);


CREATE INDEX mst_pay_act_all_ie03
ON mst_pay_act_all USING BTREE (pay_usr_cd,co_cd);


CREATE INDEX mst_pay_act_all_ie04
ON mst_pay_act_all USING BTREE (pay_act_dt,co_cd);


CREATE INDEX mst_pay_act_all_ie05
ON mst_pay_act_all USING BTREE (ac_dt,co_cd);


CREATE INDEX mst_pay_act_all_ie06
ON mst_pay_act_all USING BTREE (ac_ym, ap_setoff_typ,co_cd);


CREATE INDEX mst_pay_act_all_ie07
ON mst_pay_act_all USING BTREE (par_pay_act_no,par_pay_act_seq,co_cd);

