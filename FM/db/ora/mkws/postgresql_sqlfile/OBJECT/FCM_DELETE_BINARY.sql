\encoding UTF-8

CREATE TABLE fcm_delete_binary
(table_name varchar (30) NOT NULL,
column_name varchar (30) NOT NULL,
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


ALTER TABLE fcm_delete_binary
ADD CONSTRAINT fcm_delete_binary_pk PRIMARY KEY(table_name,column_name);

