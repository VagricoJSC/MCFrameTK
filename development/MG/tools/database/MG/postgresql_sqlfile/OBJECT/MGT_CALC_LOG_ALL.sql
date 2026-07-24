\encoding UTF-8

CREATE TABLE mgt_calc_log_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
seq_no numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
msg_id varchar (10) NULL,
msg varchar (1000) NULL,
log_time varchar (15) NULL,
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


ALTER TABLE mgt_calc_log_all
ADD CONSTRAINT mgt_calc_log_all_pk PRIMARY KEY(calc_no,calc_grp_cd,seq_no,co_cd);


CREATE INDEX mgt_calc_log_all_ie01
ON mgt_calc_log_all USING BTREE (msg_id, co_cd);

