\encoding UTF-8

CREATE TABLE mam_if_protocol_cmn
(ext_sys_cd varchar (10) NOT NULL,
if_proc_typ varchar (10) NULL,
if_ctl_typ varchar (30) NOT NULL,
var_str varchar (300) NULL,
var_num numeric (21,8) NULL,
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


ALTER TABLE mam_if_protocol_cmn
ADD CONSTRAINT mam_if_protocol_cmn_pk UNIQUE(ext_sys_cd,if_proc_typ,if_ctl_typ);


CREATE UNIQUE INDEX mam_if_protocol_cmn_pk_ie ON mam_if_protocol_cmn (ext_sys_cd,COALESCE(if_proc_typ,''),if_ctl_typ);

