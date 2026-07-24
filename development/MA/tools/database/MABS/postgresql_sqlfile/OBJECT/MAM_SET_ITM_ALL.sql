\encoding UTF-8

CREATE TABLE mam_set_itm_all
(set_grp_cd varchar (10) NOT NULL,
main_itm_cd varchar (40) NOT NULL,
main_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
main_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
main_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
main_itm_unit_cd varchar (5) NOT NULL,
set_itm_cd varchar (40) NOT NULL,
set_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
set_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
set_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
set_itm_unit_cd varchar (5) NOT NULL,
main_itm_qty numeric (21,8) NOT NULL,
set_itm_qty numeric (21,8) NOT NULL,
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


ALTER TABLE mam_set_itm_all
ADD CONSTRAINT mam_set_itm_all_pk PRIMARY KEY(set_grp_cd,main_itm_cd,main_itm_sub1,main_itm_sub2,main_itm_sub3,main_itm_unit_cd,set_itm_cd,set_itm_sub1,set_itm_sub2,set_itm_sub3,co_cd);


CREATE INDEX mam_set_itm_all_ie01
ON mam_set_itm_all USING BTREE (main_itm_cd,main_itm_sub1,main_itm_sub2,main_itm_sub3);


CREATE INDEX mam_set_itm_all_ie02
ON mam_set_itm_all USING BTREE (set_itm_cd,set_itm_sub1,set_itm_sub2,set_itm_sub3);

