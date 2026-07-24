\encoding UTF-8

CREATE TABLE fcm_gp_batch_args
(gp_batch_no varchar (15) NOT NULL,
item_nm varchar (1000) NOT NULL,
required char (1) DEFAULT 0 NOT NULL,
data_type_typ varchar (1) NOT NULL,
arg varchar (1000) NULL,
rmrks varchar (1000) NULL,
editable char (1) DEFAULT 0 NOT NULL,
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


ALTER TABLE fcm_gp_batch_args
ADD CONSTRAINT fcm_gp_batch_args_pk PRIMARY KEY(gp_batch_no,item_nm);

