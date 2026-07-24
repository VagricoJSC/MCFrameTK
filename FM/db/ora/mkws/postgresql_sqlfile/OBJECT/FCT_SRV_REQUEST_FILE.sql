\encoding UTF-8

CREATE TABLE fct_srv_request_file
(srv_req_no varchar (50) NOT NULL,
file_bin numeric  NOT NULL,
file_name varchar (260) NOT NULL
);


ALTER TABLE fct_srv_request_file
ADD CONSTRAINT fct_srv_request_file_pk PRIMARY KEY(srv_req_no,file_bin);


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fct_srv_request_file','file_bin');

