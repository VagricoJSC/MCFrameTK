\encoding UTF-8

CREATE TABLE mgt_calc_fix_all
(calc_grp_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
calc_no varchar (15) NOT NULL,
ac_if_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_calc_fix_all
ADD CONSTRAINT mgt_calc_fix_all_pk PRIMARY KEY(calc_grp_cd,ym,co_cd);


CREATE INDEX mgt_calc_fix_all_ie01
ON mgt_calc_fix_all USING BTREE (calc_no, co_cd);


CREATE INDEX mgt_calc_fix_all_ie02
ON mgt_calc_fix_all USING BTREE (ym, co_cd);

