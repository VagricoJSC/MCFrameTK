\encoding UTF-8

CREATE TABLE mgc_parm_remark
(parm_key varchar (20) NOT NULL,
lcl_cd varchar (7) NOT NULL,
parm_remark varchar (4000) NULL,
parm_biz_grp varchar (100) NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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


ALTER TABLE mgc_parm_remark
ADD CONSTRAINT mgc_parm_remark_pk PRIMARY KEY(parm_key,lcl_cd);

