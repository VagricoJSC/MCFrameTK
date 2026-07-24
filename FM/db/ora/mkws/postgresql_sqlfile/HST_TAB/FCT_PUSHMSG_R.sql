\encoding UTF-8

CREATE TABLE fct_pushmsg_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
push_id numeric (15) NULL,
user_id varchar (500) NULL,
co_cd varchar (10) NULL,
module_id varchar (3) NULL,
logic_id varchar (50) NULL,
operation_id varchar (50) NULL,
msg_id varchar (10) NULL,
msg_bind varchar (1000) NULL,
title_id varchar (10) NULL,
title_bind varchar (1000) NULL,
importance char (1) NULL,
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



ALTER TABLE fct_pushmsg_r ADD CONSTRAINT fct_pushmsg_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_pushmsg_r', 'fct_pushmsg', 'fct_pushmsg_tr_r');

