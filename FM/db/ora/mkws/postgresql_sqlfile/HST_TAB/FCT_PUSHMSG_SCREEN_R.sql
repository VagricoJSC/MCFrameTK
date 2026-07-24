\encoding UTF-8

CREATE TABLE fct_pushmsg_screen_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
push_id numeric (15) NULL,
clt_typ_cd varchar (5) NULL,
param_key varchar (512) NULL,
param_val varchar (1000) NULL,
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



ALTER TABLE fct_pushmsg_screen_r ADD CONSTRAINT fct_pushmsg_screen_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_pushmsg_screen_r', 'fct_pushmsg_screen', 'fct_pushmsg_screen_tr_r');

