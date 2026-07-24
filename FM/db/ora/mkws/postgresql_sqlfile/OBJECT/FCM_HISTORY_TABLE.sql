\encoding UTF-8

CREATE TABLE fcm_history_table
(history_table_name varchar (30) NOT NULL,
table_name varchar (30) NOT NULL,
trigger_name varchar (30) NOT NULL,
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


ALTER TABLE fcm_history_table
ADD CONSTRAINT fcm_history_table_pk PRIMARY KEY(history_table_name);

