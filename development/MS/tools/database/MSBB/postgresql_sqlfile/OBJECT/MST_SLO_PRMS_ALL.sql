\encoding UTF-8

CREATE TABLE mst_slo_prms_all
(slo_prms_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
slo_prms_rev numeric (4,0) NOT NULL,
slo_no varchar (15) NULL,
slo_d_no varchar (15) NOT NULL,
slo_prms_h_no varchar (15) NOT NULL,
dlv_inst_rcpt_no varchar (15) NULL,
prms_dlv_tm timestamp(0)  NOT NULL,
trd_unit_prms_qty numeric (21,8) NOT NULL,
base_unit_prms_qty numeric (21,8) NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
prms_rmrks varchar (100) NULL,
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


ALTER TABLE mst_slo_prms_all
ADD CONSTRAINT mst_slo_prms_all_pk PRIMARY KEY(slo_prms_no,co_cd);


CREATE INDEX mst_slo_prms_all_ie01
ON mst_slo_prms_all USING BTREE (slo_no, co_cd);


CREATE INDEX mst_slo_prms_all_ie02
ON mst_slo_prms_all USING BTREE (slo_d_no, co_cd);


CREATE INDEX mst_slo_prms_all_ie03
ON mst_slo_prms_all USING BTREE (dlv_inst_rcpt_no, co_cd);

