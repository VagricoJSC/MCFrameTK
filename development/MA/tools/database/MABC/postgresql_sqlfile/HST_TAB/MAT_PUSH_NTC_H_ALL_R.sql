\encoding UTF-8

CREATE TABLE mat_push_ntc_h_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
push_ntc_no varchar (15) NULL,
co_cd varchar (10) NULL,
push_ntc_typ varchar (50) NULL,
msg_id varchar (10) NULL,
src_module_id varchar (3) NULL,
src_logic_id varchar (100) NULL,
src_operation_id varchar (100) NULL,
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



ALTER TABLE mat_push_ntc_h_all_r ADD CONSTRAINT mat_push_ntc_h_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mat_push_ntc_h_all_r', 'mat_push_ntc_h_all', 'mat_push_ntc_h_all_tr_r');

