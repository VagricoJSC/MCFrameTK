\encoding UTF-8

CREATE TABLE mst_ar_appl_schd_all
(ar_appl_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
bill_acst_no varchar (15) NOT NULL,
iv_no varchar (15) NOT NULL,
ar_typ varchar (1) NOT NULL,
rcv_mtd_cd varchar (10) NOT NULL,
rcv_schd_dt timestamp(0)  NOT NULL,
appl_tgt_amt numeric (21,8) NOT NULL,
appl_amt numeric (21,8) NOT NULL,
not_appl_bal numeric (21,8) NOT NULL,
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


ALTER TABLE mst_ar_appl_schd_all
ADD CONSTRAINT mst_ar_appl_schd_all_pk PRIMARY KEY(ar_appl_schd_no,co_cd);


CREATE INDEX mst_ar_appl_schd_all_ie01
ON mst_ar_appl_schd_all USING BTREE (bill_acst_no,co_cd);

