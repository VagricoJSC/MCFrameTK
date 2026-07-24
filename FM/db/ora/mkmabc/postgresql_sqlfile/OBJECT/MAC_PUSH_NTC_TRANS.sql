\encoding UTF-8

CREATE TABLE mac_push_ntc_trans
(push_ntc_typ varchar (50) NOT NULL,
column_seq numeric (9,0) NOT NULL,
client_typ varchar (1) NOT NULL,
column_path varchar (4000) NOT NULL,
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


ALTER TABLE mac_push_ntc_trans
ADD CONSTRAINT mac_push_ntc_trans_pk PRIMARY KEY(push_ntc_typ,column_seq,client_typ);

