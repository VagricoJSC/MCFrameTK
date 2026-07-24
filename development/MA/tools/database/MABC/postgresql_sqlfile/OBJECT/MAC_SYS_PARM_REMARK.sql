\encoding UTF-8

CREATE TABLE mac_sys_parm_remark
(parm_key varchar (40) NOT NULL,
lcl_cd varchar (7) NOT NULL,
parm_remark varchar (4000) NULL,
parm_biz_grp varchar (100) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
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


ALTER TABLE mac_sys_parm_remark
ADD CONSTRAINT mac_sys_parm_remark_pk PRIMARY KEY(parm_key,lcl_cd);

