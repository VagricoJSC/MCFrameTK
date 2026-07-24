\encoding UTF-8

CREATE TABLE fct_pushmsg
(push_id numeric (15) NOT NULL,
user_id varchar (500) NOT NULL,
co_cd varchar (10) NULL,
module_id varchar (3) NOT NULL,
logic_id varchar (50) NOT NULL,
operation_id varchar (50) NULL,
msg_id varchar (10) NOT NULL,
msg_bind varchar (1000) NULL,
title_id varchar (10) NULL,
title_bind varchar (1000) NULL,
importance char (1) NOT NULL,
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


ALTER TABLE fct_pushmsg
ADD CONSTRAINT fct_pushmsg_pk PRIMARY KEY(push_id);

