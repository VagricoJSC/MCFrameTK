\encoding UTF-8

CREATE TABLE fct_server_signal
(srv_req_no varchar (50) NOT NULL,
srv_signal_typ varchar (2) NOT NULL,
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


ALTER TABLE fct_server_signal
ADD CONSTRAINT fct_server_signal_pk PRIMARY KEY(srv_req_no,srv_signal_typ);

