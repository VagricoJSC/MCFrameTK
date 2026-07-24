\encoding UTF-8

CREATE TABLE mst_sls_schd_all
(sls_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
sls_schd_src_typ varchar (2) NOT NULL,
slo_d_no varchar (15) NULL,
dlv_inst_rcpt_no varchar (15) NULL,
ship_schd_no varchar (15) NULL,
ship_inst_d_no varchar (15) NULL,
dlv_slip_d_no varchar (15) NULL,
iv_no varchar (15) NULL,
iv_d_no varchar (15) NULL,
wg_rqst_no varchar (15) NULL,
po_schd_no varchar (15) NULL,
purc_schd_no varchar (15) NULL,
purc_act_d_no varchar (15) NULL,
sls_schd_dt timestamp(0)  NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
cmpl_flg char (1) DEFAULT '0' NOT NULL,
not_auto_sls_flg char (1) DEFAULT '0' NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
sls_ac_abl_flg char (1) DEFAULT '0' NOT NULL,
base_unit_abort_qty numeric (21,8) NOT NULL,
base_unit_sls_qty numeric (21,8) NOT NULL,
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


ALTER TABLE mst_sls_schd_all
ADD CONSTRAINT mst_sls_schd_all_pk PRIMARY KEY(sls_schd_no,co_cd);


CREATE INDEX mst_sls_schd_all_ie01
ON mst_sls_schd_all USING BTREE (slo_d_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie02
ON mst_sls_schd_all USING BTREE (dlv_inst_rcpt_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie03
ON mst_sls_schd_all USING BTREE (ship_schd_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie04
ON mst_sls_schd_all USING BTREE (ship_inst_d_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie05
ON mst_sls_schd_all USING BTREE (dlv_slip_d_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie06
ON mst_sls_schd_all USING BTREE (iv_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie07
ON mst_sls_schd_all USING BTREE (iv_d_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie08
ON mst_sls_schd_all USING BTREE (wg_rqst_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie09
ON mst_sls_schd_all USING BTREE (po_schd_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie10
ON mst_sls_schd_all USING BTREE (purc_act_d_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie11
ON mst_sls_schd_all USING BTREE (purc_schd_no, co_cd);


CREATE INDEX mst_sls_schd_all_ie12
ON mst_sls_schd_all USING BTREE (cmpl_flg, sls_schd_dt, co_cd);

