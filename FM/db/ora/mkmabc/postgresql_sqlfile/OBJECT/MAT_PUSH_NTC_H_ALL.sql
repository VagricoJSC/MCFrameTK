\encoding UTF-8

CREATE TABLE mat_push_ntc_h_all
(push_ntc_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
push_ntc_typ varchar (50) NOT NULL,
msg_id varchar (10) NOT NULL,
src_module_id varchar (3) NOT NULL,
src_logic_id varchar (100) NOT NULL,
src_operation_id varchar (100) NOT NULL,
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


ALTER TABLE mat_push_ntc_h_all
ADD CONSTRAINT mat_push_ntc_h_all_pk PRIMARY KEY(push_ntc_no,co_cd);


CREATE INDEX mat_push_ntc_h_all_ie01
ON mat_push_ntc_h_all USING BTREE (upd_srv_req_no);

