\encoding UTF-8

CREATE TABLE fcc_avail_gp_batch
(module_id varchar (3) NOT NULL,
logic_id varchar (50) NOT NULL,
operation_id varchar (50) NOT NULL,
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


ALTER TABLE fcc_avail_gp_batch
ADD CONSTRAINT fcc_avail_gp_batch_pk PRIMARY KEY(module_id,logic_id,operation_id);

