\encoding UTF-8

CREATE TABLE mam_ac_rsn_all
(ac_rsn_cd varchar (10) NOT NULL,
ac_rsn_nm varchar (100) NOT NULL,
ar_typ varchar (1) NULL,
ap_typ varchar (1) NULL,
ac_invalid_flg char (1) DEFAULT '0' NOT NULL,
cost_invalid_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_ac_rsn_all
ADD CONSTRAINT mam_ac_rsn_all_pk PRIMARY KEY(ac_rsn_cd,co_cd);


CREATE INDEX mam_ac_rsn_all_ie01
ON mam_ac_rsn_all USING BTREE (ac_rsn_nm);

