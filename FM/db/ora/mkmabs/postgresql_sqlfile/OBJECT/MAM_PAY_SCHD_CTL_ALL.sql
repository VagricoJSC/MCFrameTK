\encoding UTF-8

CREATE TABLE mam_pay_schd_ctl_all
(bsppl_cd varchar (20) DEFAULT '*' NOT NULL,
cur_cd varchar (3) NOT NULL,
min_amt numeric (21,8) NOT NULL,
sttl_cd varchar (10) NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
rate numeric (21,8) NOT NULL,
crryovr_mons_typ varchar (1) NOT NULL,
pay_day1 numeric (2,0) NULL,
pay_day2 numeric (2,0) NULL,
pay_day3 numeric (2,0) NULL,
pay_day4 numeric (2,0) NULL,
pay_day5 numeric (2,0) NULL,
pay_crryovr_mons1 numeric (3,0) NULL,
pay_crryovr_mons2 numeric (3,0) NULL,
pay_crryovr_mons3 numeric (3,0) NULL,
pay_crryovr_mons4 numeric (3,0) NULL,
pay_crryovr_mons5 numeric (3,0) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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


ALTER TABLE mam_pay_schd_ctl_all
ADD CONSTRAINT mam_pay_schd_ctl_all_pk PRIMARY KEY(bsppl_cd,cur_cd,min_amt,sttl_cd,wg_cd,co_cd);


CREATE INDEX mam_pay_schd_ctl_all_ie01
ON mam_pay_schd_ctl_all USING BTREE (wg_cd,del_flg,co_cd);

