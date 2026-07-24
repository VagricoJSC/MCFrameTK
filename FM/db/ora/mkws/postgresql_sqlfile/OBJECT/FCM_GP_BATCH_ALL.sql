\encoding UTF-8

CREATE TABLE fcm_gp_batch_all
(gp_batch_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
gp_batch_grp_cd varchar (50) NOT NULL,
gp_batch_order numeric (9,0) NOT NULL,
module_id varchar (3) NOT NULL,
logic_id varchar (50) NOT NULL,
operation_id varchar (50) NOT NULL,
version varchar (1000) NULL,
err_continue char (1) DEFAULT 0 NOT NULL,
rmrks varchar (1000) NULL,
rmrks2 varchar (1000) NULL,
rmrks3 varchar (1000) NULL,
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


ALTER TABLE fcm_gp_batch_all
ADD CONSTRAINT fcm_gp_batch_all_pk PRIMARY KEY(gp_batch_no,co_cd);

