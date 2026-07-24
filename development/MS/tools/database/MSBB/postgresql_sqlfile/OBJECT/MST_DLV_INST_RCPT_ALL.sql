\encoding UTF-8

CREATE TABLE mst_dlv_inst_rcpt_all
(dlv_inst_rcpt_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
dlv_inst_rcpt_rev numeric (4,0) NOT NULL,
slo_d_no varchar (15) NOT NULL,
dlv_rqst_tm timestamp(0)  NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
cst_dlv_inst_no varchar (20) NULL,
cst_dlv_inst_rev numeric (4,0) NULL,
cst_dlv_inst_d_no varchar (20) NULL,
cst_dlv_inst_rmrks varchar (100) NULL,
cst_dlv_inst_d_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
edi_flg char (1) DEFAULT '0' NOT NULL,
dlv_cd varchar (20) NULL,
dlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
dlv_nm varchar (100) NULL,
dlv_cntct_dpt varchar (100) NULL,
dlv_cntct_psn varchar (100) NULL,
dlv_zip_cd varchar (10) NULL,
dlv_addr1 varchar (250) NULL,
dlv_addr2 varchar (250) NULL,
dlv_addr3 varchar (250) NULL,
dlv_addr4 varchar (250) NULL,
dlv_tel varchar (30) NULL,
dlv_fax varchar (30) NULL,
dlv_lg_grp_cd varchar (10) NULL,
pri_prnt_flg char (1) DEFAULT '0' NOT NULL,
tdlv_cd varchar (20) NULL,
tdlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
tdlv_nm varchar (100) NULL,
via_dlv_typ varchar (1) NULL,
tdlv_cntct_dpt varchar (100) NULL,
tdlv_cntct_psn varchar (100) NULL,
tdlv_zip_cd varchar (10) NULL,
tdlv_addr1 varchar (250) NULL,
tdlv_addr2 varchar (250) NULL,
tdlv_addr3 varchar (250) NULL,
tdlv_addr4 varchar (250) NULL,
tdlv_tel varchar (30) NULL,
tdlv_fax varchar (30) NULL,
tdlv_lg_grp_cd varchar (10) NULL,
dlv_day_week_typ varchar (1) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_dlv_inst_rcpt_all
ADD CONSTRAINT mst_dlv_inst_rcpt_all_pk PRIMARY KEY(dlv_inst_rcpt_no,co_cd);


CREATE INDEX mst_dlv_inst_rcpt_all_ie01
ON mst_dlv_inst_rcpt_all USING BTREE (slo_d_no, co_cd);


CREATE INDEX mst_dlv_inst_rcpt_all_ie02
ON mst_dlv_inst_rcpt_all USING BTREE (dlv_rqst_tm, co_cd);


CREATE INDEX mst_dlv_inst_rcpt_all_ie03
ON mst_dlv_inst_rcpt_all USING BTREE (cst_dlv_inst_no, co_cd);


CREATE INDEX mst_dlv_inst_rcpt_all_ie04
ON mst_dlv_inst_rcpt_all USING BTREE (cst_dlv_inst_d_no, co_cd);

