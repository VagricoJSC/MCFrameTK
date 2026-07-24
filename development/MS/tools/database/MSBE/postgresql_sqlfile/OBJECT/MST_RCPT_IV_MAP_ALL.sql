\encoding UTF-8

CREATE TABLE mst_rcpt_iv_map_all
(rcpt_iv_d_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_no varchar (15) DEFAULT '*' NOT NULL,
arr_schd_no varchar (15) DEFAULT '*' NOT NULL,
arr_act_no varchar (15) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
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


ALTER TABLE mst_rcpt_iv_map_all
ADD CONSTRAINT mst_rcpt_iv_map_all_pk PRIMARY KEY(rcpt_iv_d_no,rcpt_iv_no,arr_schd_no,arr_act_no,co_cd);

