\encoding UTF-8

CREATE TABLE mat_da_loc_all
(login_seq varchar (50) NOT NULL,
loc_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
rd_flg char (1) DEFAULT '0' NOT NULL,
wr_flg char (1) DEFAULT '0' NOT NULL,
usr_id varchar (500) NOT NULL,
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


ALTER TABLE mat_da_loc_all
ADD CONSTRAINT mat_da_loc_all_pk PRIMARY KEY(login_seq,loc_cd,co_cd);

