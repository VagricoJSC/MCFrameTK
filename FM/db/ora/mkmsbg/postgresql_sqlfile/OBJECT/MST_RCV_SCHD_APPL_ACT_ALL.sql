\encoding UTF-8

CREATE TABLE mst_rcv_schd_appl_act_all
(rcv_schd_appl_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
bill_mng_no varchar (15) NOT NULL,
rcv_act_dt timestamp(0)  NULL,
rcv_mtd_cd varchar (10) NOT NULL,
rcv_typ varchar (1) NOT NULL,
rcv_act_amt numeric (21,8) NOT NULL,
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


ALTER TABLE mst_rcv_schd_appl_act_all
ADD CONSTRAINT mst_rcv_schd_appl_act_all_pk PRIMARY KEY(rcv_schd_appl_act_no,co_cd);


CREATE INDEX mst_rcv_schd_appl_act_all_ie01
ON mst_rcv_schd_appl_act_all USING BTREE (bill_mng_no,co_cd);

