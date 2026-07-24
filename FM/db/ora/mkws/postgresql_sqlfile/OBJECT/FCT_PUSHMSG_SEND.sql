\encoding UTF-8

CREATE TABLE fct_pushmsg_send
(push_id numeric (15) NOT NULL,
user_id varchar (500) NOT NULL,
send_dt timestamp(0)  NOT NULL,
recv_dt timestamp(0)  NULL,
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


ALTER TABLE fct_pushmsg_send
ADD CONSTRAINT fct_pushmsg_send_pk PRIMARY KEY(push_id,user_id);

