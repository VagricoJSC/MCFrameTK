\encoding UTF-8

CREATE TABLE mam_account_all
(ac_cd varchar (10) NOT NULL,
ac_nm varchar (40) NOT NULL,
ac_nm2 varchar (20) NULL,
dc_typ varchar (1) NOT NULL,
sub_flg char (1) DEFAULT '0' NOT NULL,
ac_typ varchar (1) NULL,
ac_tax_cd varchar (5) NULL,
ac_tax_typ varchar (1) NULL,
foreign_flg char (1) DEFAULT '0' NOT NULL,
sum0_flg char (1) DEFAULT '0' NOT NULL,
sum1_flg char (1) DEFAULT '0' NOT NULL,
sum2_flg char (1) DEFAULT '0' NOT NULL,
sum3_flg char (1) DEFAULT '0' NOT NULL,
sum4_flg char (1) DEFAULT '0' NOT NULL,
sum5_flg char (1) DEFAULT '0' NOT NULL,
project_flg char (1) DEFAULT '0' NOT NULL,
bp_flg char (1) DEFAULT '0' NOT NULL,
usr_flg char (1) DEFAULT '0' NOT NULL,
bank_ac_flg char (1) DEFAULT '0' NOT NULL,
ap_typ varchar (10) NULL,
ar_typ varchar (10) NULL,
ac_typ1 varchar (10) NULL,
ac_typ2 varchar (10) NULL,
ac_typ3 varchar (10) NULL,
ac_typ4 varchar (10) NULL,
ac_typ5 varchar (10) NULL,
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
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mam_account_all
ADD CONSTRAINT mam_account_all_pk PRIMARY KEY(ac_cd,co_cd);


CREATE INDEX mam_account_all_ie01
ON mam_account_all USING BTREE (ac_nm);


CREATE INDEX mam_account_all_ie02
ON mam_account_all USING BTREE (ac_nm2);

