\encoding UTF-8

CREATE TABLE mam_report_file_nm_all
(biz_typ varchar (2) NOT NULL,
co_cd varchar (10) NOT NULL,
rpt_nm_elm_typ1 varchar (3) NULL,
rpt_nm_elm_typ2 varchar (3) NULL,
rpt_nm_elm_typ3 varchar (3) NULL,
rpt_nm_elm_typ4 varchar (3) NULL,
rpt_nm_elm_typ5 varchar (3) NULL,
rpt_nm_elm_typ6 varchar (3) NULL,
rpt_nm_elm_typ7 varchar (3) NULL,
rpt_nm_elm_typ8 varchar (3) NULL,
rpt_nm_elm_typ9 varchar (3) NULL,
rpt_nm_elm_typ10 varchar (3) NULL,
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


ALTER TABLE mam_report_file_nm_all
ADD CONSTRAINT mam_report_file_nm_all_pk PRIMARY KEY(biz_typ,co_cd);

