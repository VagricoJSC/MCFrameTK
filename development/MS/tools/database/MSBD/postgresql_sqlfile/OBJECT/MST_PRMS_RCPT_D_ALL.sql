\encoding UTF-8

CREATE TABLE mst_prms_rcpt_d_all
(prms_rcpt_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
prms_rcpt_no varchar (15) NOT NULL,
prms_rcpt_rev numeric (4,0) NOT NULL,
mfg_inst_no varchar (15) NULL,
purc_act_d_no varchar (15) NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
prms_dlv_tm timestamp(0)  NULL,
purc_schd_dt timestamp(0)  NULL,
sync_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
dlv_inst_d_no varchar (15) NULL,
intr_rmrks varchar (100) NULL,
prms_rmrks varchar (100) NULL,
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


ALTER TABLE mst_prms_rcpt_d_all
ADD CONSTRAINT mst_prms_rcpt_d_all_pk PRIMARY KEY(prms_rcpt_d_no,co_cd);


CREATE INDEX mst_prms_rcpt_d_all_ie01
ON mst_prms_rcpt_d_all USING BTREE (prms_rcpt_no,co_cd);


CREATE INDEX mst_prms_rcpt_d_all_ie02
ON mst_prms_rcpt_d_all USING BTREE (purc_act_d_no,co_cd);

