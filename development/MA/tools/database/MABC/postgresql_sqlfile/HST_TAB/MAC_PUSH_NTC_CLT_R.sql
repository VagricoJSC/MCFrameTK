\encoding UTF-8

CREATE TABLE mac_push_ntc_clt_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
push_ntc_typ varchar (50) NULL,
client_typ varchar (1) NULL,
trans_module_id varchar (3) NULL,
trans_screen_id varchar (10) NULL,
trans_btn_path varchar (4000) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
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



ALTER TABLE mac_push_ntc_clt_r ADD CONSTRAINT mac_push_ntc_clt_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mac_push_ntc_clt_r', 'mac_push_ntc_clt', 'mac_push_ntc_clt_tr_r');

