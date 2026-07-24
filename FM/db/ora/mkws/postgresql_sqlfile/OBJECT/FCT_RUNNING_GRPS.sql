\encoding UTF-8

CREATE TABLE fct_running_grps
(req_no varchar (50) NOT NULL,
ope_id varchar (50) NOT NULL,
gid numeric (15) NOT NULL,
man_flg char (1) NOT NULL,
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

