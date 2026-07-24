\encoding UTF-8

CREATE TABLE pft_sdrv_if_file_all
(data_no numeric (15,0) NOT NULL,
file_id numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
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


ALTER TABLE pft_sdrv_if_file_all
ADD CONSTRAINT pft_sdrv_if_file_all_pk PRIMARY KEY(data_no,file_id,co_cd);

