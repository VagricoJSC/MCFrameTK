\encoding UTF-8

CREATE TABLE fct_srv_request_file_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
srv_req_no varchar (50) NULL,
file_bin numeric  NULL,
file_name varchar (260) NULL
);



ALTER TABLE fct_srv_request_file_r ADD CONSTRAINT fct_srv_request_file_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_srv_request_file_r', 'fct_srv_request_file', 'fct_srv_request_file_tr_r');

