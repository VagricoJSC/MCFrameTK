\encoding UTF-8

CREATE TABLE mam_rpt_row_sml_cmn
(rpt_ptn_cd varchar (10) NOT NULL,
sml_rpt_row_cd varchar (10) NOT NULL,
tgt_rpt_row_cd varchar (10) NOT NULL,
minus_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_rpt_row_sml_cmn
ADD CONSTRAINT mam_rpt_row_sml_cmn_pk PRIMARY KEY(rpt_ptn_cd,sml_rpt_row_cd,tgt_rpt_row_cd);

