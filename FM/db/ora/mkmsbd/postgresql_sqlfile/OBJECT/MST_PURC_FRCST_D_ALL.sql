\encoding UTF-8

CREATE TABLE mst_purc_frcst_d_all
(purc_frcst_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
purc_frcst_no varchar (15) NOT NULL,
purc_frcst_fix_no varchar (15) NOT NULL,
pf_period_typ varchar (1) NOT NULL,
pf_period_st_dt timestamp(0)  NOT NULL,
pf_period_end_dt timestamp(0)  NOT NULL,
fix_period_flg char (1) DEFAULT '0' NOT NULL,
trd_unit_pf_qty numeric (21,8) NOT NULL,
base_unit_pf_qty numeric (21,8) NOT NULL,
trd_unit_schd_qty numeric (21,8) NULL,
base_unit_schd_qty numeric (21,8) NULL,
trd_unit_prms_qty numeric (21,8) NULL,
base_unit_prms_qty numeric (21,8) NULL,
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


ALTER TABLE mst_purc_frcst_d_all
ADD CONSTRAINT mst_purc_frcst_d_all_pk PRIMARY KEY(purc_frcst_d_no,co_cd);


CREATE INDEX mst_purc_frcst_d_all_ie01
ON mst_purc_frcst_d_all USING BTREE (purc_frcst_no,co_cd);


CREATE INDEX mst_purc_frcst_d_all_ie02
ON mst_purc_frcst_d_all USING BTREE (purc_frcst_fix_no,co_cd);

