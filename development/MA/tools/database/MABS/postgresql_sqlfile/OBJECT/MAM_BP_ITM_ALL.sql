\encoding UTF-8

CREATE TABLE mam_bp_itm_all
(bp_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
bp_itm_cd varchar (40) NULL,
bp_itm_nm varchar (100) NULL,
def_flg char (1) DEFAULT '0' NOT NULL,
pf_grp_cd varchar (5) NULL,
pf_fix_flg char (1) DEFAULT '0' NOT NULL,
purc_commit_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_bp_itm_all
ADD CONSTRAINT mam_bp_itm_all_pk PRIMARY KEY(bp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,st_dt,co_cd);


CREATE INDEX mam_bp_itm_all_ie01
ON mam_bp_itm_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3);

