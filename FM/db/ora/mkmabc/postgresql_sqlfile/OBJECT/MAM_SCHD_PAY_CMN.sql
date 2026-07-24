\encoding UTF-8

CREATE TABLE mam_schd_pay_cmn
(pay_ap_typ varchar (1) NOT NULL,
seq numeric (4,0) NOT NULL,
prio numeric (9,0) NOT NULL,
cur_cd varchar (3) NULL,
foreign_typ varchar (1) NULL,
asppl_cd varchar (20) NULL,
dpt_id_flg char (1) DEFAULT '0' NOT NULL,
slip_cnt_id varchar (3) NULL,
ac_cd varchar (10) NOT NULL,
sub_ac_cd varchar (10) NULL,
abs_typ varchar (1) NOT NULL,
abstract1 varchar (40) NULL,
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


ALTER TABLE mam_schd_pay_cmn
ADD CONSTRAINT mam_schd_pay_cmn_pk PRIMARY KEY(pay_ap_typ,seq);

