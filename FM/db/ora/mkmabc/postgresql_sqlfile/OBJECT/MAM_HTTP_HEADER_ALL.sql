\encoding UTF-8

CREATE TABLE mam_http_header_all
(ext_sys_cd varchar (10) NOT NULL,
if_proc_typ varchar (10) NULL,
http_header_nm varchar (40) NOT NULL,
http_header_val varchar (200) NOT NULL,
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


ALTER TABLE mam_http_header_all
ADD CONSTRAINT mam_http_header_all_pk UNIQUE(ext_sys_cd,if_proc_typ,http_header_nm,co_cd);


CREATE UNIQUE INDEX mam_http_header_all_pk_ie ON mam_http_header_all (ext_sys_cd,COALESCE(if_proc_typ,''),http_header_nm,co_cd);

