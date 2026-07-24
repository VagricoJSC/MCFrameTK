\encoding UTF-8

CREATE TABLE fcm_para_ope_ctrl_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
pid numeric (15) NULL,
gid1 numeric (15) NULL,
gid2 numeric (15) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);



ALTER TABLE fcm_para_ope_ctrl_r ADD CONSTRAINT fcm_para_ope_ctrl_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_para_ope_ctrl_r', 'fcm_para_ope_ctrl', 'fcm_para_ope_ctrl_tr_r');

