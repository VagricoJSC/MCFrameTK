\encoding UTF-8

CREATE TABLE mst_po_reg_br_all
(batch_data_no varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
batch_log_no varchar (15) NOT NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
exe_sts_typ varchar (1) NOT NULL,
po_schd_no varchar (15) NOT NULL,
wg_cd varchar (10) NULL,
sppl_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
po_schd_dt timestamp(0)  NOT NULL,
dlv_rqst_tm timestamp(0)  NOT NULL,
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


ALTER TABLE mst_po_reg_br_all
ADD CONSTRAINT mst_po_reg_br_all_pk PRIMARY KEY(batch_data_no,co_cd);


CREATE INDEX mst_po_reg_br_all_ie01
ON mst_po_reg_br_all USING BTREE (batch_log_no,co_cd);


CREATE INDEX mst_po_reg_br_all_ie02
ON mst_po_reg_br_all USING BTREE (exe_sts_typ,co_cd);

