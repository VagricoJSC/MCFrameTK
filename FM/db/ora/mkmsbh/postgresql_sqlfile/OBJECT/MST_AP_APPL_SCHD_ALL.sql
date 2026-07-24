\encoding UTF-8

CREATE TABLE mst_ap_appl_schd_all
(ap_appl_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
pay_schd_no varchar (15) NOT NULL,
purc_act_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_mng_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_no varchar (15) DEFAULT '*' NOT NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_com_paid_tax_amt numeric (21,8) NULL,
trd_cur_exc_com_paid numeric (21,8) NULL,
trd_cur_appl_amt numeric (21,8) NOT NULL,
pay_sts_typ varchar (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_ap_appl_schd_all
ADD CONSTRAINT mst_ap_appl_schd_all_pk PRIMARY KEY(ap_appl_schd_no,co_cd);


CREATE INDEX mst_ap_appl_schd_all_ie01
ON mst_ap_appl_schd_all USING BTREE (purc_act_no,co_cd);


CREATE INDEX mst_ap_appl_schd_all_ie02
ON mst_ap_appl_schd_all USING BTREE (pay_schd_no,co_cd);


CREATE INDEX mst_ap_appl_schd_all_ie03
ON mst_ap_appl_schd_all USING BTREE (rcpt_iv_mng_no,co_cd);

