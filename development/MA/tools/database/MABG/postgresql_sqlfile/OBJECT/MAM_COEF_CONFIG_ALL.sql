\encoding UTF-8

CREATE TABLE mam_coef_config_all
(alc_coef_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
bp_cd varchar (20) NULL,
term timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
coef_val numeric (21,8) NOT NULL,
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


ALTER TABLE mam_coef_config_all
ADD CONSTRAINT mam_coef_config_all_pk UNIQUE(alc_coef_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,loc_cd,oper_cd,bp_cd,term,co_cd);


CREATE UNIQUE INDEX mam_coef_config_all_pk_ie ON mam_coef_config_all (alc_coef_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,COALESCE(lot_no,''),COALESCE(sublot_no,''),COALESCE(sno1,''),COALESCE(sno2,''),COALESCE(sno3,''),COALESCE(sno4,''),COALESCE(loc_cd,''),COALESCE(oper_cd,''),COALESCE(bp_cd,''),term,co_cd);

