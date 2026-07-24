\encoding UTF-8

CREATE TABLE mat_blnk_bat_cntl_all
(if_proc_typ varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
bat_exec_flg char (1) DEFAULT '0' NOT NULL,
exec_co_cd varchar (10) NOT NULL,
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


ALTER TABLE mat_blnk_bat_cntl_all
ADD CONSTRAINT mat_blnk_bat_cntl_all_pk PRIMARY KEY(if_proc_typ,co_cd);

