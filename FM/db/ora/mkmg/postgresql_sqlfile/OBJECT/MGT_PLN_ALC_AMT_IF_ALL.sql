\encoding UTF-8

CREATE TABLE mgt_pln_alc_amt_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
alc_ac_cd varchar (20) NOT NULL,
dpt_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
bp_cd varchar (20) NULL,
ctg_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
amt numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_pln_alc_amt_if_all
ADD CONSTRAINT mgt_pln_alc_amt_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mgt_pln_alc_amt_if_all_ie01
ON mgt_pln_alc_amt_if_all USING BTREE (ym, co_cd);


CREATE INDEX mgt_pln_alc_amt_if_all_ie02
ON mgt_pln_alc_amt_if_all USING BTREE (alc_ac_cd, co_cd);


CREATE INDEX mgt_pln_alc_amt_if_all_ie03
ON mgt_pln_alc_amt_if_all USING BTREE (dpt_cd, co_cd);

