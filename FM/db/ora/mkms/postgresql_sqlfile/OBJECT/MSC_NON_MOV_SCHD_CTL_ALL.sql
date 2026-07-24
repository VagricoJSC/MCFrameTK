\encoding UTF-8

CREATE TABLE msc_non_mov_schd_ctl_all
(io_schd_typ varchar (5) NOT NULL,
co_cd varchar (10) NOT NULL,
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


ALTER TABLE msc_non_mov_schd_ctl_all
ADD CONSTRAINT msc_non_mov_schd_ctl_all_pk PRIMARY KEY(io_schd_typ,co_cd);

