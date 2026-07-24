\encoding UTF-8

CREATE TABLE fct_design
(design_title varchar (1000) NULL,
design_code varchar (20) NULL,
design_type numeric (10) NULL,
version_id varchar (20) NULL,
design_no varchar (20) NOT NULL,
is_share char (1) DEFAULT 0 NOT NULL,
co_cd varchar (10) NULL,
description varchar (1000) NULL,
parent_design_code varchar (20) NULL,
seq_no numeric (10) NULL,
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


ALTER TABLE fct_design
ADD CONSTRAINT fct_design_pk PRIMARY KEY(design_no);

