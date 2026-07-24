\encoding UTF-8

CREATE TABLE mst_purc_frcst_h_all
(purc_frcst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
pf_dt timestamp(0)  NOT NULL,
sppl_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
pf_usr_cd varchar (500) NULL,
pf_dpt_cd varchar (20) NULL,
pf_rpt_no varchar (15) NULL,
pf_rpt_id varchar (15) NULL,
pf_rpt_dt timestamp(0)  NULL,
pf_rpt_flg char (1) DEFAULT '0' NOT NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_pf_rpt_id varchar (15) NULL,
del_pf_rpt_dt timestamp(0)  NULL,
del_pf_rpt_flg char (1) DEFAULT '0' NOT NULL,
rpt_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_purc_frcst_h_all
ADD CONSTRAINT mst_purc_frcst_h_all_pk PRIMARY KEY(purc_frcst_no,co_cd);

