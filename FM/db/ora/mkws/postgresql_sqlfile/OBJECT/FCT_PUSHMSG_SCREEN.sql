\encoding UTF-8

CREATE TABLE fct_pushmsg_screen
(push_id numeric (15) NOT NULL,
clt_typ_cd varchar (5) NOT NULL,
param_key varchar (512) NOT NULL,
param_val varchar (1000) NULL,
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


ALTER TABLE fct_pushmsg_screen
ADD CONSTRAINT fct_pushmsg_screen_pk PRIMARY KEY(push_id,clt_typ_cd,param_key);

