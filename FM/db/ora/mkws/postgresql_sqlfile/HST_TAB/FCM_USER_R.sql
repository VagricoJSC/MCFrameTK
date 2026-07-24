\encoding UTF-8

CREATE TABLE fcm_user_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
user_id varchar (500) NULL,
user_nm varchar (40) NULL,
user_pw varchar (40) NULL,
pw_mod_dt timestamp(0)  NULL,
act_dt timestamp(0)  NULL,
inact_dt timestamp(0)  NULL,
inv_flg char (1) NULL,
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



ALTER TABLE fcm_user_r ADD CONSTRAINT fcm_user_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_user_r', 'fcm_user', 'fcm_user_tr_r');

